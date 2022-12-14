package Descritor;

public class LSEComDescritor<T extends Comparable<T>> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int nodes;

    public void insertFirst(T content) {
        LSENode<T> node = new LSENode(content);
        if (this.isEmptyNodes()) {
            this.primeiro = node;
            this.ultimo = node;
            this.nodes++;
        } else {
            node.setNext(this.primeiro);
            this.primeiro = node;
            this.nodes++;
        }

    }

    public void showAll() {
        LSENode<T> aux;
        if (this.isEmptyNodes()) {
            System.out.println("Lista Vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getContent());
                // todas as classes embutidas já possuem o toString, compareTo etc.
                aux = aux.getNext();
            }
        }
    }
    public void removeFirst(){
        LSENode<T> aux;
        if(this.isEmptyNodes()){
            System.out.println("Lista Vazia!");
        }
        else if(this.nodes == 1){
            this.primeiro = null;
            this.ultimo = this.primeiro;
            this.nodes = 0;
        }
        else{
            this.primeiro = this.primeiro.getNext();
            this.nodes--;
        }
    }

    // com descritor existem mais maneiras de verificar se está vazio
    public boolean isEmpty() {
        if (this.primeiro == null) {
            return true;
        }
        return false;
    }

    public boolean isEmptyNodes() {
        if (this.nodes == 0) {
            return true;
        }
        return false;
    }

    //Inserir ordenado em ordem crescente e sem repetidos
    public void insertionSort(T content){
        LSENode anterior, atual;
        LSENode n = new LSENode(content);
        if(this.isEmptyNodes()){
            this.primeiro = n;
            this.ultimo = n;
            this.nodes++;
        }
        else if(content.compareTo(this.primeiro.getContent())<0){// inserção no inicio 
            n.setNext(this.primeiro);
            this.primeiro = n;
            this.nodes++;
        }
        else if(content.compareTo(this.ultimo.getContent())>0){ // inserção no final 
            this.ultimo.setNext(n);
            this.ultimo = n;
            this.nodes++;
        }
        else{ //insercao no meio da lista
        atual = this.primeiro;
        anterior = null;
        while(atual != null){
            if(atual.getContent().compareTo(content)>0){
                anterior.setNext(n);
                n.setNext(atual);
                this.nodes++;
                return;
            }
            else{
                anterior = atual;
                atual = atual.getNext();
            }
        }
        
        }
    }
}