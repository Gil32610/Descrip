package Descritor;

public class LSEDTest {
    public static void main(String[] args) {
        LSEComDescritor<Integer> l1 = new LSEComDescritor();
        LSEComDescritor<Double> l2 = new LSEComDescritor();
        LSEComDescritor<Aluno> l3 = new LSEComDescritor();
        // AS LISTAS AINDA SERÃO HOMOGENEAS
        l1.insertFirst(10);
        l1.insertFirst(30);
        l1.insertFirst(5);
        System.out.println("Valores da lista 1^");
        l1.showAll();

        l2.insertFirst(102.75);
        l2.insertFirst(87.4);
        l2.insertFirst(141.9);
        l2.insertFirst(17.5);
        System.out.println("Valores da lista 2^");
        l2.showAll();

        Aluno al1 = new Aluno("734237", "jorge senador");
        l3.insertFirst(al1);
        Aluno al2 = new Aluno("724213", "cleiton dept. fed.");
        l3.insertFirst(al2);
        Aluno al3 = new Aluno("753453", "andre ferreira ver.");
        l3.insertFirst(al3);
        l3.showAll();




    }
}
