import Adapters.MernisServiceAdapter;
import Concrete.UserCheckManager;
import Concrete.UserManager;
import Entities.Gamer;
import Entities.User;

public class Main {

    public static void main(String[] args) {

        UserCheckManager userCheckManager = new UserCheckManager(new MernisServiceAdapter());
    }
}
