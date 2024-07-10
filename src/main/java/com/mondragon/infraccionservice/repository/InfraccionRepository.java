package com.mondragon.infraccionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mondragon.infraccionservice.entity.Infraccion;

public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{

}
