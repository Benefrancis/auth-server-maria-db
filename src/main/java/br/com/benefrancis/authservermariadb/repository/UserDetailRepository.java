package br.com.benefrancis.authservermariadb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.benefrancis.authservermariadb.model.User;

@Repository
public interface UserDetailRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String username);
}
