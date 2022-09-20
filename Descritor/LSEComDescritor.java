package Descritor;

public class LSEComDescritor<T> {
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
}