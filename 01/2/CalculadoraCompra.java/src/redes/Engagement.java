package redes;

public  class Engagement {
    public static void main(String[] args) {
    int likes = 100;
    int comments = 45;
    int shares = 20;
    double Rating=7.5;
    String contenido1="pelicula de accion : jhon wick";

    int visualizaciones=1000;

    Double engagement=(likes+comments+ Rating + shares) * 100/visualizaciones;

    System.out.println("engagement publicacion 1" + engagement);

    int likes2 = 100;
    int comments2 = 45;
    int shares2 = 20;
    double Rating2=7.5;
    String contenido2="pelicula de ciencia ficcion : volver al futuro";
   
    int visualizaciones2=1000;

    Double engagement2=(likes2+comments2+ Rating2 + shares2) * 100/visualizaciones2;
    System.out.println("engagement publicacion 2" + engagement2);

    if (engagement > engagement2) {
        System.out.println("sugerencias");
        System.err.println("la publicacion 1 "+ contenido1);
        System.out.println("la publicacion 2"+ contenido2);
    } else {
        System.out.println("la publicacion 2 "+ contenido2);
        System.out.println("la publicacion 1"+ contenido1);
    }



         }
}