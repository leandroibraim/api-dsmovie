package br.com.ibraim.dsmovie.repository;

import br.com.ibraim.dsmovie.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);

}
