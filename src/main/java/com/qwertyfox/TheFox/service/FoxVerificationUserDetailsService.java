package com.qwertyfox.TheFox.service;

import com.qwertyfox.TheFox.dao.AppUserRolesDao;
import com.qwertyfox.TheFox.dao.AppUserVerificationDao;
import com.qwertyfox.TheFox.model.AppUsernamePassword;
import com.qwertyfox.TheFox.security.FoxUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("foxUserVerificationRepo")
public class FoxVerificationUserDetailsService implements UserDetailsService {

    private final AppUserVerificationDao appUserVerificationDao;
    private final AppUserRolesDao appUserRolesDao;

    @Autowired
    public FoxVerificationUserDetailsService(AppUserVerificationDao appUserVerificationDao,
                                             AppUserRolesDao appUserRolesDao) {

        this.appUserVerificationDao = appUserVerificationDao;
        this.appUserRolesDao = appUserRolesDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUsernamePassword> usernamePassword = appUserVerificationDao.findByUsername(username);

        usernamePassword.orElseThrow(() ->
                new UsernameNotFoundException("Username " +username+ "is not in the database"));

        return new FoxUserDetails(usernamePassword.get(),appUserRolesDao);
    }
}
