package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {


    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignCode()+" : added");
    }
    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignCode()+" : updated");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignCode()+" : deleted");
    }
}
