package hh.sof03.moviedatabase.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Director {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long director_id;

    private String name;
    private String imgFile;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "director")
    private List<Movie> movies;

    public Director() {}

    public Director(String name, String imgFile) {
        this.name = name;
        this.imgFile = imgFile;
    }

    public long getDirector_id() {
        return director_id;
    }

    public void setDirector_id(long director_id) {
        this.director_id = director_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgFile() {
        return imgFile;
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}