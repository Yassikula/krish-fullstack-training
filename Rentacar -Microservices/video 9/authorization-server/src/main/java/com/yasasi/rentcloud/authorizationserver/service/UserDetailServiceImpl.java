package com.yasasi.rentcloud.authorizationserver.service;

import com.yasasi.rentcloud.authorizationserver.model.AuthUserDetail;
import com.yasasi.rentcloud.authorizationserver.model.User;
import com.yasasi.rentcloud.authorizationserver.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

    @Service("userDetailsService")
    public class UserDetailServiceImpl implements UserDetailsService {

        @Autowired
        private UserDetailRepository userDetailRepository;

        @Override
        public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

            Optional<User> optionalUser = userDetailRepository.findByUserName(name);

            optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username or password wrong"));

            UserDetails userDetails = new AuthUserDetail(optionalUser.get());
            new AccountStatusUserDetailsChecker().check(userDetails);
            return userDetails;


        }
}
