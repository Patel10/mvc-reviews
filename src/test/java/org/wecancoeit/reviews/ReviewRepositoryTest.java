package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L,"review one","5/30/2021","Tech","images/onePlus9.jpg","testingReviewOne");
    private Review reviewTwo = new Review(2L,"review Two","5/30/2021","Tech","","testingReviewTwo");
    private Review reviewThree = new Review(3L,"review Three","5/30/2021","Tech","","testingReviewThree");


    @Test
    public void shouldFindCourseOne(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(foundReview, reviewOne);
    }



}
