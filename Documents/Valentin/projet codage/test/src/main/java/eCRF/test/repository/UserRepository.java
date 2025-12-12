package eCRF.test.repository;

import eCRF.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByIdUser(Integer idUser);
}
