package com.qwertyfox.TheFox.dao;

import com.qwertyfox.TheFox.model.FoxUsersRolesAndDetails;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

@Component
public interface AppUserRolesDao extends Repository<FoxUsersRolesAndDetails, Integer> {

    FoxUsersRolesAndDetails findByUserID (int id);




}
