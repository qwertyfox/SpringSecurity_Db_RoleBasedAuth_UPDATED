/*
 * Responsible for user verification in Spring Security
 * */

package com.qwertyfox.TheFox.dao;

import com.qwertyfox.TheFox.model.AppUsernamePassword;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import jakarta.transaction.Transactional;
import java.util.Optional;

public interface AppUserVerificationDao extends Repository<AppUsernamePassword, Integer> {

    Optional<AppUsernamePassword> findByUsername(String username);

    @Modifying
    @Transactional
    @Query (
            value = "UPDATE username_password SET password = ?1 WHERE username = ?2 ",
            nativeQuery = true
    )
    int updatePassword (String password, String username);

}
