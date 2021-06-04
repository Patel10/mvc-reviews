package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long,Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review onePlus = new Review(1L,"ONEPLUS 9","3/20/2021","Tech","images/onePlus9.jpg","The OnePlus 9 comes with a fix for the most glaring flaw of prior OnePlus flagships: courtesy of a partnership with Hasselblad, the cameras offer better color correction, and both regular and ultra-wide photos look great. " +
                "The lack of a telephoto lens and other flagship perks found on its Pro sibling aren’t missed too much, given the relatively low price you're paying for high specs and very fast charging. If you’re hunting for a flagship Android phone at an affordable price, the OnePlus 9 is worth considering.");
        Review onePlusWatch = new Review(2L,"ONEPLUS SMARTWATCH","3/29/2021","Wearables","images/onePlusSmartWatch.png","The OnePlus Watch is a great first smartwatch from OnePlus, blowing pricier rivals away in a couple of key areas, with sleek looks and week-long battery life. However, with a bespoke operating system it can’t load more than the preinstalled selection of basic apps, and its companion smartphone app is only available on Android at launch. " +
                "Despite a few software glitches betraying its first-gen status, the OnePlus Watch is good value for the price, which is notably lower than Samsung and Apple competitors.");
        Review tdAmeri = new Review(3L,"TD AMERITRADE","10/19/2020","Finanical","images/tdAmeritrade.png","TD Ameritrade is one of the larger online brokers in the U.S., so it offers multiple platforms aimed at different levels of expertise. The extensive educational offerings help new investors become more confident and encourage them to explore additional asset classes as their skills grow. " +
                "For active investors and traders, the thinkorswim platform offers all the data, charting, and tools needed to find market opportunities. The sheer number of tools and research available through TD Ameritrade can be a bit overwhelming.");
        Review eTrade = new Review(4L,"ETRADE","11/23/2020","Finanical","images/eTrade.jpg","E*TRADE offers value to both beginner investors and frequent traders with a library of educational resources, professional-level trading platforms, and tools to help assemble a risk-appropriate, balanced portfolio. Active traders will appreciate the firm's $0 commission for all stock, ETF and options trades.");

        reviewsList.put(onePlus.getId(),onePlus);
        reviewsList.put(onePlusWatch.getId(),onePlusWatch);
        reviewsList.put(tdAmeri.getId(),tdAmeri);
        reviewsList.put(eTrade.getId(),eTrade);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for (Review review: reviewsToAdd){
            reviewsList.put(review.getId(),review);
        }


    }
    public Review findOne(long id){
        return reviewsList.get(id);
    }
    public Collection<Review> findAll(){
        return reviewsList.values();
    }

}
