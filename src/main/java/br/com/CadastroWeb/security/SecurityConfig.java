package br.com.CadastroWeb.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // Informa que esta classe é de configuração do Spring
public class SecurityConfig {

    @Bean // Define um Bean gerenciado pelo Spring para configurar a segurança HTTP
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/login", "/css/**", "/js/**").permitAll() 
                // Libera acesso para as páginas de login e arquivos estáticos (CSS/JS)
                .anyRequest().authenticated() 
                // Qualquer outra requisição precisa estar autenticada
            )
            .formLogin(form -> form
                .loginPage("/login") 
                // Define a URL personalizada da página de login
                .defaultSuccessUrl("/pessoas/listar", true) 
                // Redireciona para a página inicial ao fazer login com sucesso
                .permitAll() 
                // Permite que todos acessem a página de login
            )
            .oauth2Login(oauth2 -> oauth2
                .loginPage("/login") 
                // Define também a página de login para OAuth2
                .defaultSuccessUrl("/pessoas/listar", true)
                // Após login OAuth2 com sucesso, redireciona para /home
            )
            .logout(logout -> logout
                .logoutSuccessUrl("/login?logout") 
                // Redireciona para login após logout
                .permitAll()
            );

        return http.build();
        // Retorna o objeto SecurityFilterChain configurado
    }
}