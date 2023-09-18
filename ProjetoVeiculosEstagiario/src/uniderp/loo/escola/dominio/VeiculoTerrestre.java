package uniderp.loo.escola.dominio;

public abstract class VeiculoTerrestre extends Veiculo {
    protected String placa;
    protected int anoModelo;
    protected String codigoRenavam;
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public VeiculoTerrestre(int codigo, String nome, String modelo, String fabricante, String cor, String chassi,
            int anoFabricacao, double pesoLiquido, int assentos, int rodas, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeOcupantes,
            String placa, int anoModelo, String codigoRenavam) {
        super(codigo, nome, modelo, fabricante, cor, chassi, anoFabricacao, pesoLiquido, assentos, rodas, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeOcupantes);
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.codigoRenavam = codigoRenavam;
    }
    
    
}
