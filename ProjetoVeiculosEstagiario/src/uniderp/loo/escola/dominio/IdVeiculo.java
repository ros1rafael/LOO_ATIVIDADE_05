package uniderp.loo.escola.dominio;
public abstract class IdVeiculo {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public IdVeiculo(int codigo) {
        this.codigo = codigo;
    }    
}