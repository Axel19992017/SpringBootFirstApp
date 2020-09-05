package edu.tecnasa.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import edu.tecnasa.entities.ClainType;


@Repository
public interface ClainTypeDao extends PagingAndSortingRepository<ClainType, Long> {

}
