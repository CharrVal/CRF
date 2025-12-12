package eCRF.test.service;

import eCRF.test.entity.Role;
import eCRF.test.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    private RoleRepository repository;

    @Override
    public Role findById(Integer id) {
        return repository.findByIdRole(id);
    }

    @Override
    public List<Role> findAllRoles() {
        return repository.findAll();
    }

    @Override
    public Role createRole(Role role) {
        return repository.save(role);
    }

    @Override
    public Role updateRole(Integer id, Role roleToUpdate) {
        Role roleExisting = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Role note found"));

        roleExisting.setRoleType(roleToUpdate.getRoleType());
        roleExisting.setDescription(roleToUpdate.getDescription());
        roleExisting.setUsers(roleToUpdate.getUsers());
        return repository.save(roleExisting);
    }

    @Override
    public void deleteById(Integer id) {
        repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Subject not found"));
    }
}
