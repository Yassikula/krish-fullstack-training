package lk.codelabs.rentcloud.rentservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.codelabs.rentcloud.model.customer.Customer;
import lk.codelabs.rentcloud.model.rent.Rent;
import lk.codelabs.rentcloud.model.vehicle.Vehicle;
import lk.codelabs.rentcloud.rentservice.hystrix.VehicleCommand;
import lk.codelabs.rentcloud.rentservice.model.DetailResponse;
import lk.codelabs.rentcloud.rentservice.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@Service
public class RentServiceImpl implements RentService {


    @Autowired
    RentRepository rentRepository;

    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    RestTemplate restTemplate;


    @Override
    public Rent save(Rent customer) {
        return rentRepository.save(customer);
    }


    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = rentRepository.findById(id);

        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();

    }


    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }


    public DetailResponse findDetailResponse(int id) {


        Rent rent=findById(id);
        Customer customer=getCustomer(rent.getCustomerId());
        Vehicle vehicle= getVehicle(rent.getVehicleId());


        return new DetailResponse(rent,customer,vehicle);

    }

    public DetailResponse findDetailResponsefallback(int id){
        return new DetailResponse(new Rent(), new Customer(), new Vehicle());

    }

    private Customer getCustomer(int customerId){

//        vehiclecommand
//        Customer customer=restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
//        return customer;

        CommonHysctrixCommand<Customer> customerCommonHysctrixCommand=new CommonHysctrixCommand<Customer>(setter,()->
        {
            return restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        },()->{
            return new Customer();
        });
        Future<Customer> customerFuture=customerCommonHysctrixCommand.queue();
        return customerFuture.get();


    }

    private Vehicle getVehicle(int vehicleId){
        VehicleCommand vehicleCommand= new VehicleCommand(restTemplate,vehicleId);
        return vehicleCommand.execute();
//       return restTemplate.getForObject("http://vehicle/services/vehicles/"+vehicleId,Vehicle.class);


    }
}
