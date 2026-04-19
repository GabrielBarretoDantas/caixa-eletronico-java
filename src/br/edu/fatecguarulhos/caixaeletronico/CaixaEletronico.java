package br.edu.fatecguarulhos.caixaeletronico;

public class CaixaEletronico implements ICaixaEletronico{
    private int saldo;
    private int cotaMinima;

	public String pegaRelatorioCedulas() {
		String resposta = "";
		//logica de fazer o relatorio de cedulas
		return resposta;
		}
		public String pegaValorTotalDisponivel() {
		String resposta = "";
		//logica de pega o valor total disponivel no caixa eletronio
		return resposta;
		}
		public String reposicaoCedulas(Integer cedula, Integer quantidade) {
		String resposta = "";
		//logica de fazer a reposicao de cedulas e criar uma mensagem //(resposta)ao usuario
		return resposta;
		}
		public String sacar(Integer valor) {
		String resposta = "";
		//logica de sacar do caixa eletronico e criar um mensagem(resposta) ao // usuario
		return resposta;
		}
		public String armazenaCotaMinima(Integer minimo) {
        cotaMinima = minimo;
		String resposta = "Cota mínima atual de R$" + minimo;
		//logica de armazenar a cota minima para saque e criar um //mensagem(resposta)ao usuario
		return resposta;
		}

        public void verificarCotaMinima() {
            if(cotaMinima > saldo)
                throw (new RuntimeException("Caixa vazio: Chame o operador"));
        }

}
