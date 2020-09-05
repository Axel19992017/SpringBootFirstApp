package edu.tecnasa.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import edu.tecnasa.entities.Category;

@Repository
public interface CategoryDao extends PagingAndSortingRepository<Category, Long> {
	
}
