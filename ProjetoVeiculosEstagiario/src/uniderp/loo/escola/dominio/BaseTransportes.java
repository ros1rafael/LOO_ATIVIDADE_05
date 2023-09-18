package uniderp.loo.escola.dominio;

public abstract class BaseTransportes extends VeiculoTerrestre{
    protected int portas;
    protected int eixos;
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public BaseTransportes(int codigo, String nome, String modelo, String fabricante, String cor, String chassi,
            int anoFabricacao, double pesoLiquido, int assentos, int rodas, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeOcupantes,
            String placa, int anoModelo, String codigoRenavam, int portas, int eixos) {
        super(codigo, nome, modelo, fabricante, cor, chassi, anoFabricacao, pesoLiquido, assentos, rodas, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeOcupantes, placa, anoModelo,
                codigoRenavam);
        this.portas = portas;
        this.eixos = eixos;
    }

    
    
}
