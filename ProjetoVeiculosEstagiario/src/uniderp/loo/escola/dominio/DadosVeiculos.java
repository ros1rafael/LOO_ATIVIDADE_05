package uniderp.loo.escola.dominio;

public abstract class DadosVeiculos extends IdVeiculo {
    protected String nome;
    protected String modelo;
    protected String fabricante;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public DadosVeiculos(int codigo, String nome, String modelo, String fabricante) {
        super(codigo);
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    

    
}
