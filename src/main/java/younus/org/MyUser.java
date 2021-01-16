package younus.org;


import javax.persistence.*;

@Table(name = "user")
@Entity //define class entity. jpa create column in database
public class MyUser {

   @Id //every table has primary so we define id as primary key
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
    private Integer id;
   @Column(name = "name")
    private String userName;
   @Column(name = "email")
    private String userEmail;
   @Column(name = "description")
    private String UserDescription;

    public String getUserDescription() {
        return UserDescription;
    }

    public void setUserDescription(String userDescription) {
        UserDescription = userDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
