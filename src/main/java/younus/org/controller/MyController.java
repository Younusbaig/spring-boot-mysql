package younus.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import younus.org.model.MyUser;
import younus.org.service.MyUserService;


import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class MyController {

    @Autowired //this annotation is used for object injection dependency.Applied on fields,methods,constructors.
    private MyUserService service;

    @GetMapping
    public List<MyUser> getAllUsers() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public MyUser getUser(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    @PostMapping //map http post request onto handler method
    public String addNewUser(@RequestParam String name, @RequestParam String email) {
        return service.save(name, email);
    }

    @PutMapping
    public String updateUser(@RequestParam Integer id, @RequestParam String name, @RequestParam String email) {
        return service.update(id, name, email);
    }

    @DeleteMapping
    public String delete(@RequestParam Integer id) {
        return service.remove(id);
    }

}
