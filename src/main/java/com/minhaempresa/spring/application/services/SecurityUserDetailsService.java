package com.minhaempresa.spring.application.services;

import com.minhaempresa.spring.application.dtos.UsuarioDTO;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        // implementa a rotina para recuperar o usuario
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        if(login.equals("everton") ){
            usuarioDTO.setUser("everton");
            usuarioDTO.setPassword("123");
        }else {
            usuarioDTO.setUser("");
            usuarioDTO.setPassword("");
        }

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return User
                .builder()
                .username(usuarioDTO.getUser())
                .password(passwordEncoder.encode(usuarioDTO.getPassword()))
                .roles("USER") // Role padrão do Spring
                .build();
    }
}
