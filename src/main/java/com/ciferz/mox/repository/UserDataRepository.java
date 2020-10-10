package com.ciferz.mox.repository;

import com.ciferz.mox.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long> {

    UserData findByUserName(String user_name);


}
