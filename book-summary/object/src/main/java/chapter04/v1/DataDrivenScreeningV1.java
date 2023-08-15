package main.java.chapter04.v1;

import java.time.LocalDateTime;

public class DataDrivenScreeningV1 {

    private DataDrivenMovieV1 movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public DataDrivenMovieV1 getMovie() {
        return movie;
    }

    public void setMovie(DataDrivenMovieV1 movie) {
        this.movie = movie;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public void setWhenScreened(LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
    }
}
