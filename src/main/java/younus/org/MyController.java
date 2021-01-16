package younus.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired //this annotation is used for object injection dependency.Applied on fields,methods,constructors.
    private UserRepository repository;

    @PostMapping(path = "/addInformation") //map http post request onto handler method
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String email) {

        MyUser younus = new MyUser();
        younus.setUserName(name);
        younus.setUserEmail(email);

        repository.save(younus);

        return "Saved";

    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<MyUser> getAllUsers() {
        return repository.findAll();
    }


}
