package suren.organixoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import suren.organixoo.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String username);
}
