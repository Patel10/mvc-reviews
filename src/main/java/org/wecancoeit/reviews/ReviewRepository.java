package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long,Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review onePlus = new Review(1L,"OnePlus 9","3/20/2021","Tech","testing");
        Review onePlusWatch = new Review(2L,"OnePlus SmartWatch","3/29/2021","Wearables","testing2");
        Review tdAmeri = new Review(3L,"TD AMERITRADE","10/19/2020","Finanical","testing3");
        Review eTrade = new Review(4L,"ETRADE","11/23/2020","Finanical","testing4");

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
