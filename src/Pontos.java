public class Pontos {
//declara�ao da variavel //
//inicializar zerado //
//Declara��o de varivael estatica para nao perder valores//

	static int Acerto = 0;
	static int Erro = 0;

//Criar m�todos (a��es) //
//Para acumular acerto e erro//
//sem retornar informa��o//
	public static void Acertou() {
		Acerto++;

	}

	public static void Errou() {
		Erro++;
	}

//Criar m�todos(a�oes)
//Retornar a quantidade de acertos e de erros//
	public static int getAcertos() {
		return Acerto;
	}

	public static int getErros() {
		return Erro;
	}

}