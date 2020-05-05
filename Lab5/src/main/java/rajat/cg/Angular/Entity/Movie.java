package rajat.cg.Angular.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moive")
public class Movie {
	
	@Id
	private int Rating;
	private String Name;
	private String Genre;
	public int getRating() {
		return Rating;
	}
	public void setRating(int Rating) {
		this.Rating = Rating;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [Rating=" + Rating + ", Name=" + Name + ", Genre=" + Genre + "]";
	}
	public Movie(int Rating, String Name, String genre) {
		super();
		this.Rating = Rating;
		this.Name = Name;
		Genre = genre;
	}
	public Movie() {
		super();
	}
}