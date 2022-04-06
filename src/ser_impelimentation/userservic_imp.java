
package ser_impelimentation;

import Dsqule.UserDB;
import model.User;
//import model.user;
import services.user_ser;


public class userservic_imp implements user_ser{
  
    private UserDB userDb;

    public userservic_imp() {
        
        userDb=new UserDB();
    }
   

    @Override
    public int login(User use) {
    if(userDb.Sign_up(use)==1){
        return 1;
    }
    return 0;
    }
    
}
