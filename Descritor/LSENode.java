package Descritor;
public class LSENode <T> {
    private T content;
    //T é um tipo de dados (classe) genérica
    private LSENode<T> next;
    //SEMPRE colocar T para definir como genérico

    public LSENode(T content){
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public LSENode<T> getNext() {
        return this.next;
    }

    public void setNext(LSENode<T> next) {
        this.next = next;
    }
    
}
