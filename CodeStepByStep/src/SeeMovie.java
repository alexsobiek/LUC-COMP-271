/*
Write a method seeMovie that indicates how interested you are in seeing a movie with your friends based on its price
and rating. Your method should accept two parameters: the cost of a ticket in dollars, and the number of stars the
movie received out of 5. The method should print console output about how interested you are. Print either very
interested, sort-of interested, or not interested, based on the following criteria:


- You like bargains. Any movie that costs less than $5.00 is one that you are very interested in.
- You dislike expensive movies. You are not interested in seeing any movie that costs $12.00 or more, unless it got 5
stars (and even then, you are only sort-of interested).
- You like quality. You are very interested in seeing 5 star movies that cost under $12.00.
- You are sort-of interested in seeing movies costing between $5.00 - $11.99 that also got between 2-4 stars inclusive.
- You are not interested in seeing any other movies not described previously.
 */

public class SeeMovie {
    public static void main(String[] args) {
        seeMovie(3.50, 2);      // Expected output = very interested
        seeMovie(4.99, 0);      // Expected output =  very interested
        seeMovie(5.00, 0);      // Expected output =  not interested
        seeMovie(18.00, 4);     // Expected output =  not interested
        seeMovie(12.00, 3);     // Expected output =  not interested
        seeMovie(13.50, 5);     // Expected output =  sort-of interested
        seeMovie(12.00, 5);     // Expected output =  sort-of interested
        seeMovie(7.25, 5);      // Expected output =  very interested
        seeMovie(11.99, 5);     // Expected output =  very interested
        seeMovie(5.00, 2);      // Expected output =  sort-of interested
        seeMovie(7.00, 4);      // Expected output =  sort-of interested
        seeMovie(11.99, 3);     // Expected output =  sort-of interested
    }
    public static void seeMovie(double cost, int rating) {
        if (cost < 12.00 && rating == 5 || cost < 5.00 && rating >= 0 ) System.out.println("very interested");
        else if (cost >= 12.00 && rating == 5 ||
                (cost >= 5 && cost < 12) && (rating >= 2 && rating < 5)) System.out.println("sort-of interested");
        else System.out.println("not interested");
    }
}
