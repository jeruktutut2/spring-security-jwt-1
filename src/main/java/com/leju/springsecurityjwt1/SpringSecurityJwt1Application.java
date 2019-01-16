package com.leju.springsecurityjwt1;

import com.leju.springsecurityjwt1.configuration.CustomUserDetails;
import com.leju.springsecurityjwt1.model.User;
import com.leju.springsecurityjwt1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityJwt1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwt1Application.class, args);
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository userRepository) throws Exception {
		builder.userDetailsService(new UserDetailsService() {
			@Override
			public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
				User user = userRepository.findByUsername(s);
				if (user == null) throw new UsernameNotFoundException("Username "+ s +" not foung");
				return new CustomUserDetails(userRepository.findByUsername(s));
			}
		})
		.passwordEncoder(new BCryptPasswordEncoder());
	}
}

