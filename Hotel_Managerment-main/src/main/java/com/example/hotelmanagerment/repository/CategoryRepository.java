package com.example.hotelmanagerment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelmanagerment.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	Category findByName(String name);
	
}
