public class Cancion{

private String Artista;
private String Titulo;
private double Duracion;
public Cancion(double Duracion, String Artista, String Titulo){
    
    this.Artista=Artista;
    this.Titulo=Titulo;
    this.Duracion=Duracion;
}
    private String getArtista(){
    return Artista;
    }
    private String getTitulo(){
    return Titulo;
    }
    private void getDuracion(){
    return Duracion;
    }

    
    
}
