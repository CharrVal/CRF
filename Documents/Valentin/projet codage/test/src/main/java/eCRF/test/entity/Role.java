package eCRF.test.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRole;

    private String roleType;
    private String description;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(String roleType, String description, List<User> users) {
        this.roleType = roleType;
        this.description = description;
        this.users = users;
    }
}
