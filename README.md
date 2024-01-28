# SpringSecurity_Db_RoleBasedAuth_UPDATED
SpringSecurity_Db_RoleBasedAuth project updated with newer Spring Security version

### SpringSecurity_Db_RoleBasedAuth link
This is the project is an update to the following project:
(https://github.com/qwertyfox/SpringSecurity_Db_RoleBasedAuth)

### Overall
- The class WebSecurityConfigurerAdaptor is removed and the Spring now favors component-based security configuration. <br>
- Method configure(HttpSecurity http) of WebSecurityConfigurerAdaptor is now part of the @Bean SecurityFilterChain. <br>
- @EnableGlobalMethodSecurity is now @EnableMethodSecurity with prePostMethod set to true by default. <br>
- Lambda expressions are used in the Security Configuration class
