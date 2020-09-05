package edu.tecnasa.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import edu.tecnasa.entities.User;


@Repository
public interface UserDao extends PagingAndSortingRepository<User, Long> {
	public User  findByUserName(String userName);
}
