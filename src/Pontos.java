public class Pontos {
//declaraçao da variavel //
//inicializar zerado //
//Declaração de varivael estatica para nao perder valores//

	static int Acerto = 0;
	static int Erro = 0;

//Criar métodos (ações) //
//Para acumular acerto e erro//
//sem retornar informação//
	public static void Acertou() {
		Acerto++;

	}

	public static void Errou() {
		Erro++;
	}

//Criar métodos(açoes)
//Retornar a quantidade de acertos e de erros//
	public static int getAcertos() {
		return Acerto;
	}

	public static int getErros() {
		return Erro;
	}

}