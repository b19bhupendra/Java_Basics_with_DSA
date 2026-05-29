package Collection.project;

import java.sql.SQLOutput;
import java.util.*;

public class UserMangmentDemo {

    public static void main(String[] args){

        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN", "USER"));
        User user1 = new User("Alice",true, user1Roles); // Creating user object

        List<User> users = new ArrayList<>();
//        users.add(user1);
        users.add( new User("Alice",true, new HashSet<>(Arrays.asList("ADMIN", "USER"))));
        users.add( new User("Bob",false, new HashSet<>(Arrays.asList("USER"))));
        users.add( new User("Charlie",true, new HashSet<>(Arrays.asList("Manager"))));


        //Remove inActive users
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            if(!iterator.next().isActive()) {
                iterator.remove();
            }
        }

        // PRINT ACTIVE USERS
        System.out.println("Active Users");
        for(User user : users){
            System.out.println(user.getName());
        }

        // COUNT USER PER ROLE
        Map<String,Integer> roleCount = new HashMap<>();
        for(User user : users){
            for(String role: user.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }

        System.out.println("Role and count");
        for(Map.Entry<String, Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

    }
}
