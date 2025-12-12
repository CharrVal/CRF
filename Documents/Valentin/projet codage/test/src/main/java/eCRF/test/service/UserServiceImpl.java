package eCRF.test.service;

import eCRF.test.entity.User;
import eCRF.test.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User updateUser(Integer id, User userToUpdate) {
        User userExisting = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found"));

        userExisting.setUsername(userToUpdate.getUsername());
        userExisting.setPassword(userExisting.getPassword());
        userExisting.setRoles(userExisting.getRoles());

        return repository.save(userExisting);
    }

    @Override
    public User getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public void deleteUserById(Integer id) {
        repository.deleteById(id);
    }
}
