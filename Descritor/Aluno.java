package Descritor;

public class Aluno implements Comparable <Aluno> {
    private String matr;
    private String nome;
    private double media;
    private int faltas;
    
    // Construtor
    public Aluno (String m, String n) {
        this.matr = m;        
        this.nome = n;
    }
public Aluno (String matr){
    this.matr = matr;
}
    public String getMatricula(){
        return this.matr;
    }

    public String getNome(){
        return this.nome;
    }
    public double getMedia(){
        return this.media;
    }
    public int getFaltas(){
        return this.faltas;
    }

    public void setMatricula (String matr){
        this.matr = matr;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMedia(double media){
        this.media = media;
    }
    public void setFaltas(int faltas){
        this.faltas = faltas;
    }
    @Override 
    public String toString () {
        return this.matr + " " + this.nome + " " + this.media + " " + this.faltas;
    }
@Override
public int compareTo(Aluno al){
int result;
result = this.getMatricula().compareTo(al.getMatricula());
return result;
}
    
}
