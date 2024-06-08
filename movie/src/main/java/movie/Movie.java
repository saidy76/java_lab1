/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package movie;

/**
 *
 * @author DELL
 */
public class Movie  {
    String title;
     String genre;
     String director;
     String leadactor;
     int releseyear;
     double rating;
     String review;
    
    public Movie(String title, String genre, String director, String leadactor,int releseyear, double rating)
    {
        this.title=title;
        this.genre=genre;
        this.director=director;
        this.leadactor=leadactor;
        this.releseyear=releseyear;
        this.rating=rating;
        if(rating>=5){this.review="Good";
    }else{this.review="not good";}
    }
    
    public void display(){
        System.out.println("title :"+title);
        System.out.println("genre :"+genre);
        System.out.println("director :"+director);
        System.out.println("leadactor :"+leadactor);
        System.out.println("releseyear :"+releseyear);
        System.out.println("rating :"+rating);
        System.out.println("review :"+review);
        System.out.println();
    }

public static void main( String[] args){
    Movie movie1 = new Movie("Inception", "Sci-Fi", "Leonardo DiCaprio", "Christopher Nolan", 2010, 8.8);
        Movie movie2 = new Movie("The Room", "Drama", "Tommy Wiseau", "Tommy Wiseau", 2003, 3.7);

        movie1.display();
        movie2.display();
}
}


