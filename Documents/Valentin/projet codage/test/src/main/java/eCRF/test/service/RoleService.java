package eCRF.test.service;

import eCRF.test.entity.Role;

import java.util.List;

public interface RoleService {
    Role findById(Integer id);
    List<Role> findAllRoles();
    Role createRole(Role role);
    Role updateRole(Integer id, Role role);
    void deleteById(Integer id);
}
