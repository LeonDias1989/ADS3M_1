package utilitarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Arquivo {

	String url = "PastaArquivo\\Arquivo.bin";
	Path path = Paths.get(url);

	public Object salvar(Object obj) throws IOException {

		if (!Files.exists(path)) {
			Files.createDirectories(path.getParent());
		}

		File file = new File(url);

		FileOutputStream gravarArquivo = new FileOutputStream(file, true);
		ObjectOutputStream gravarObjeto = new ObjectOutputStream(gravarArquivo);

		gravarObjeto.writeObject(obj);
		gravarObjeto.flush();
		gravarObjeto.close();
		gravarArquivo.close();

		return file;
	}

	public Object recuperar(String arquivoSelecionado) throws Exception {

		FileInputStream recuperarArquivo = new FileInputStream(
				arquivoSelecionado);
		ObjectInputStream recuperarObjeto = new ObjectInputStream(
				recuperarArquivo);

		Object objetoLido = recuperarObjeto.readObject();

		recuperarObjeto.close();
		recuperarArquivo.close();

		return objetoLido;
	}
}
