package uniderp.loo.escola.dominio;


public abstract class VeiculoAereo extends Veiculo {
    protected int qtdeMotores;

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }

    public VeiculoAereo(int codigo, String nome, String modelo, String fabricante, String cor, String chassi,
            int anoFabricacao, double pesoLiquido, int assentos, int rodas, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeOcupantes,
            int qtdeMotores) {
        super(codigo, nome, modelo, fabricante, cor, chassi, anoFabricacao, pesoLiquido, assentos, rodas, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeOcupantes);
        this.qtdeMotores = qtdeMotores;
    }

    
    
}
