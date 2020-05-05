package rajat.cg.Angular.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rajat.cg.Angular.Entity.Movie;
import rajat.cg.Angular.Repository.Repo;

@Service
public class Services {

	@Autowired
	private Repo repo;
	
	@Transactional
	public boolean addmovie(Movie movie)
	{
		return repo.save(movie) != null;
	}
	
	@Transactional
	public List<Movie> viewByGenre()
	{
		return repo.findAll();
	}
}
