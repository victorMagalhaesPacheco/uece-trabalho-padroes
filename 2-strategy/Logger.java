public class Logger {

	private static Logger unicaInstancia;

	private boolean ativo = false;

	private Logger() {}

	public boolean isAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public static Logger getInstance() {
		if (unicaInstancia == null) {
			unicaInstancia = new Logger();
		}

		return unicaInstancia;
	}

	public void log(ILogger iLogger, String mensagem) {
		if (this.ativo) {
			iLogger.log(mensagem);
		}
	}
}