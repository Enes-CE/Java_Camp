package Concrete;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {
    @Override
    public void sell(User user , Game game , Campaign campaign) {
        System.out.println("Game : " + game.getGameName() + " is bought by : " + user.getE_mail() + " (" + campaign.getCampaignCode() + ") used.");
    }


}
