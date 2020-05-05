import { Component, OnInit } from '@angular/core';
import { Movies } from 'src/Movies';
import { DataService } from '../data.service';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  constructor(private ds:DataService) {
   }

  message:string;
  Name:string;
  Rating:string;
  Rating_number:number;
  Genre:string;
  ngOnInit(): void {
    document.getElementById("message").style.display="none";
  }

  addMovie()
  {
    this.Rating_number=parseInt(this.Rating);
    var movie = new Movies(this.Name,this.Rating_number,this.Genre);
    this.ds.addMovie(movie).subscribe(data => {
      console.log(data);
      this.message="Movie Added Done [ Movie ID: "+data.moviesId+" ]";
    });
    (document.getElementById("addMovie") as HTMLFormElement).reset();
    document.getElementById("message").style.display="block";

  }
}
