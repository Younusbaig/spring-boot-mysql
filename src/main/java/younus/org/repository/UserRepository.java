package younus.org.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import younus.org.model.MyUser;

public interface UserRepository extends JpaRepository<MyUser, Integer> {

}