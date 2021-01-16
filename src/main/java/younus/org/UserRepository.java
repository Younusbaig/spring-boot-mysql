package younus.org;


import org.springframework.data.repository.CrudRepository;
import younus.org.MyUser;
public interface UserRepository extends CrudRepository<MyUser,Integer> {

}