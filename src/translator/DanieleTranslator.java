package translator;

import java.nio.file.Path;

import keyword.DanieleKeyword;
import keyword.Keyword;
import model.Instance;
import reader.DanieleValueFetcher;
import reader.FileLiner;

public class DanieleTranslator<T extends DanieleKeyword> implements InstanceTranslator<T> {
	
	private GlobalConverter<DanieleValueFetcher<T>, T> converter;
	
	public Instance getInstance(Path filePath, T[] values){
		FileLiner liner = new FileLiner(filePath.toString());
		DanieleValueFetcher<T> fetcher = new DanieleValueFetcher<T>(liner);
		converter = new GlobalConverter<DanieleValueFetcher<T>, T>(fetcher, values);
		//FIXME Values ne devrait contenir que les mots clés effectivement présents dans le fichier !
		return null;
	}

}
