package rajat.cg.Angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rajat.cg.Angular.Entity.Movie;
import rajat.cg.Angular.Service.Services;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")  
public class Controller {

	@Autowired
	private Services services;
	
	 @PostMapping("save_movie")  
	    public boolean saveStudent(@RequestBody Movie movie) {  
	         return services.addmovie(movie);  
	          
	    }  
	      
	    @GetMapping("movie_list")  
	    public List<Movie> allMovie() {  
	         return services.viewByGenre();  
	          
	    }  
}
