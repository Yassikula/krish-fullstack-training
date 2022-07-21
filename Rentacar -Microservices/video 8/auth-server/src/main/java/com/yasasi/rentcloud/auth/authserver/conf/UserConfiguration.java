package com.yasasi.rentcloud.auth.authserver.conf;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {
    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("yasasi")
                .password(passwordEncoder.encode("YassiKula@1998"))
                .roles("USER","ADMIN","MANAGER")
                .authorities("CAN_READ","CAN_WRITE","CAN_DELETE");
    }
}
