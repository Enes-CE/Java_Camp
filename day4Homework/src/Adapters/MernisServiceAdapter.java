package Adapters;

import Abstracts.UserCheckService;
import Entities.Gamer;
import WS.BWCKPSPublicSoap;

import java.rmi.RemoteException;


public class MernisServiceAdapter implements UserCheckService {
    @Override
    public boolean CheckIfRealPerson(Gamer gamer) {
        BWCKPSPublicSoap client = new BWCKPSPublicSoap();
        boolean result = false;
        try {

            result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()),
                    gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
                    gamer.getBirthDate());

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
