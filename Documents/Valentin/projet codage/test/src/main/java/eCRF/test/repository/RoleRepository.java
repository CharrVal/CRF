package eCRF.test.repository;

import eCRF.test.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByIdRole(Integer idRole);
}
