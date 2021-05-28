package Concrete;

import Abstracts.UserCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Gamer;

public class UserCheckManager implements UserCheckService {

    public UserCheckManager(MernisServiceAdapter mernisServiceAdapter) {
    }

    public boolean CheckIfRealPerson(Gamer gamer){
        return true;
    }


}
