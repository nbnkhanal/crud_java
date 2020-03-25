package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.rest.Model.PlayerData;


public interface PlayerDataRepository extends JpaRepository<PlayerData, Long>{

}
