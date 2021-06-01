package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ReviewController {
    @Resource
    private ReviewRepository reviewRepository;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("reviewsModel",reviewRepository.findAll());
        return "reviewsTemplate";

    }
    @RequestMapping("/review")
    public String findOneReview(Long id, Model model){
        model.addAttribute("reviewModel",reviewRepository.findOne(id));
        return "reviewTemplate";

    }






}
