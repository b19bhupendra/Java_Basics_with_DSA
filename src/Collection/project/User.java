package Collection.project;
import java.util.Set;
public class User {

    private String name;
    private boolean active;
    private Set<String>roles;


    /**
     * Constructor for intisilizing the objects
     * @param name
     * @param active
     * @param roles
     */
    public User(String name, boolean active, Set<String> roles) {
        this.name = name;
        this.active = active;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
