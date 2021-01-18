package younus.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import younus.org.model.MyUser;
import younus.org.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserService {

    @Autowired
    UserRepository userRepository;

    @Value("${user.phone.number}")
    String phoneNumber;

    public List<MyUser> getAll() {
        return userRepository.findAll();
    }

    public MyUser getUserById(Integer id) {
        System.out.println(phoneNumber);
        Optional<MyUser> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public String save(String name, String email) {
        MyUser younus = new MyUser();
        younus.setUserName(name);
        younus.setUserEmail(email);

        userRepository.save(younus);
        return "Saved";
    }

    public String update(Integer id, String name, String email) {
        MyUser younus = new MyUser();
        younus.setId(id);
        younus.setUserName(name);
        younus.setUserEmail(email);

        userRepository.save(younus);
        return "Update";
    }

    public String remove(Integer id) {
        userRepository.deleteById(id);
        return "deleted";
    }
}
