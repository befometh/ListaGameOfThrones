package Esquema;

import java.time.LocalDate;

public class Episodio {
    String episodio;
    String titulo;
    int voto;
    double rating;
    LocalDate fecha;

    public Episodio(String episodio, String titulo, String voto, String rating, String fecha) {
        this.episodio = episodio;
        this.titulo = titulo;
        this.voto = Integer.parseInt(voto);
        this.rating = Double.parseDouble(rating);
        this.fecha = LocalDate.parse(fecha);
    }

    //Getters Setters


    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
