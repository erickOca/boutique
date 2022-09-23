package com.indexia.boutique.model.dao;

import com.indexia.boutique.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsersDao extends JpaRepository<Users,Integer> {
    Users findByEmail(String email);

    @Modifying
    @Transactional
    @Query(" DELETE FROM Users u WHERE u.email =:email ")
    void deleteByEmail(@Param("email")String email);

    @Query("SELECT u FROM Users u WHERE u.email =:email AND u.password =:password")
    Users validateUser(@Param("email")String email,
                       @Param("password")String password);
}
