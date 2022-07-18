package Memento;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CareTaker careTaker = new CareTaker();
        Cart cart = new Cart();
        cart.addItem(new Item("cake"));
        cart.addItem(new Item("bread"));
        
        careTaker.save(cart);
        System.out.println(cart);
        
        cart.addItem(new Item("book"));
        careTaker.save(cart);
        System.out.println(cart);
        
        cart.addItem(new Item("pot"));
        careTaker.save(cart);
        System.out.println(cart);
        
        cart.addItem(new Item("milk"));
        //careTaker.save(cart);
        System.out.println(cart);
        
        
        careTaker.revert(cart);
        System.out.println(cart);
        
        cart.addItem(new Item("Ipad"));
        careTaker.save(cart);
        System.out.println(cart);
        
        careTaker.revert(cart);
        System.out.println(cart);
        
        careTaker.revert(cart);
        System.out.println(cart);
        
        careTaker.revert(cart);
        System.out.println(cart);
        
        careTaker.revert(cart);
        System.out.println(cart);
        
        
        
	}

}
