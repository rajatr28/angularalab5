package rajat.cg.Angular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rajat.cg.Angular.Entity.Movie;

@Repository
public interface Repo extends JpaRepository<Movie, Integer>{
	

}
