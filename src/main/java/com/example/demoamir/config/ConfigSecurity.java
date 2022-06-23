package com.example.demoamir.config;


import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.client.HttpServerErrorException;

import javax.sql.DataSource;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ConfigSecurity {

    private DataSource dataSource;

   /* @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        *//*http
                .authorizeRequests().antMatchers("/", "/movies/{id}", "/login").permitAll()
                .and().authorizeRequests().antMatchers("/movie/create")
                .hasAuthority("ADMIN")
                .and().authorizeRequests().antMatchers("/testAuth")
                .hasAuthority("USER")

                .anyRequest().authenticated()
                .and().logout().permitAll()
                .and().exceptionHandling()

        ;*//*

        http.cors().and().csrf().disable()
                .authorizeRequests()
                // add your resources here. By default, spring security blocks all resources that is not under /resources/**
                .antMatchers( "/", "/login").permitAll()
                // prevent spring security from blocking some pages that doesn't require authentication to be access here.
                .antMatchers("/forgot-password", "/change-password").permitAll()
                .anyRequest().authenticated()
                .and()
                // login configuration
                *//*.formLogin()
                .loginPage("/login") // can either be mapping or file
                .permitAll()
                .and()*//*
                // logout configuration
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .clearAuthentication(true)
                .permitAll();

        return http.build();
    }*/

    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .withDefaultSchema()
                .withUser(User.withUsername("username")
                        .password(passwordEncoder().encode("password"))
                        .roles("USER"));
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
