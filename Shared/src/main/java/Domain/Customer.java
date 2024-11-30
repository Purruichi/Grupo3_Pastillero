package Domain;

import java.io.Serializable;
import java.util.HashMap;

public class Customer implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id, name, email;

    public Customer() {
        this.id = new String();
        this.name = new String();
        this.email = new String();
    }

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    public Customer(HashMap<String, String> userData) {
        id = userData.get("id");
        name = userData.get("username");
        email = userData.get("email");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
	
}
