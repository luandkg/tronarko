package OmegaEngine.Utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Local {

	public static String LocalAtual() {

		String ret = "";

		File dir = new File(".");
		try {
			ret = dir.getCanonicalPath() + "/";

		} catch (IOException e) {
			e.printStackTrace();
		}

		return ret;
	}

	public static String LocalAtualCom(String eProximo) {
		return LocalAtual() + eProximo + "/";
	}

	public static InputStream Carregar(String eLocal) {
		//System.out.println("Carregar : " + eLocal);

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream(eLocal);
	
		return input;
	}
	
	public static InputStream ObterRecurso(String elocal) {

		InputStream arq = Recurso.Carregar(elocal);

		return arq;

	}

}
