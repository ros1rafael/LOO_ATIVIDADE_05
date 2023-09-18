package uniderp.loo.escola.dominio;

public class Motocicleta extends VeiculoTerrestre {
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Motocicleta(int codigo, String nome, String modelo, String fabricante, String cor, String chassi,
            int anoFabricacao, double pesoLiquido, int assentos, int rodas, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeOcupantes,
            String placa, int anoModelo, String codigoRenavam, String categoria) {
        super(codigo, nome, modelo, fabricante, cor, chassi, anoFabricacao, pesoLiquido, assentos, rodas, potencia,
                tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeOcupantes, placa, anoModelo,
                codigoRenavam);
        this.categoria = categoria;
    }
    @Override
    public void Imprimir(){
        System.out.println("codigo: "+ this.codigo);
        System.out.println("Nome: "+ this.nome);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Fabricante:" + this.fabricante);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Chassi: "+ this.chassi);
        System.out.println("Ano Fabricação: "+ this.anoFabricacao);
        System.out.println("Peso Liquido: "+ this.pesoLiquido);
        System.out.println("Assentos:" + this.assentos);
        System.out.println("Rodas:"+ this.rodas);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Tipo Combustivel: "+ this.tipoCombustivel);
        System.out.println("Nome do Proprietario: "+ this.nomeProprietario);
        System.out.println("Estado:"+ this.estadoUF);
        System.out.println("Cidade: "+ this.cidadeUF);
        System.out.println("Tipo de Veiculo "+this.tipoVeiculo);
        System.out.println("Quantidade de Ocupantes"+ this.qtdeOcupantes);
        System.out.println("Placa: "+ this.placa);
        System.out.println("Ano Modelo"+ this.anoModelo);
        System.out.println("Codigo Renavam: "+ this.codigoRenavam);
        System.out.println("Categoria: "+ this.categoria);
           
}}
