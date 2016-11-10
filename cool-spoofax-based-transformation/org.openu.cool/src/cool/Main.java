package cool;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.aspectj.runtime.Transformation;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.TermFactory;
import org.strategoxt.lang.Context;

public class Main extends transform implements Transformation {

	@Override
	public File convert2java(File input) throws Exception {
		Context context = transform.init();
	    context.setStandAlone(true);
	    IStrategoTerm result = null;
	    IStrategoTerm pathTerm = new TermFactory().makeString(input.getAbsolutePath());

	    try {
                result = transform_0_0.instance.invoke(context, pathTerm);
	    }
	    finally {
	    	context.setStandAlone(false);
	    	context.getIOAgent().closeAllFiles();
	    }

		String path = input.getPath();
		System.out.println("input path: " + path);
		String outputPath = path.replaceFirst("resources", "java").replaceFirst("src", "generated").replaceFirst(".cool", ".java");
		System.out.println("output path: " + outputPath);
		File output = new File(outputPath);
		if (output.exists())
			FileUtils.forceDelete(output);
		
		if (output.getParentFile() != null)
			FileUtils.forceMkdir(output.getParentFile());
		output.createNewFile();
		FileUtils.writeStringToFile(output, adjust(result.toString())); 

		return output;
	}

	private static String adjust(String  input) {
		return input.substring(1, input.length()-1).replaceAll("\\\\n", "\n").replaceAll("\\\\\"", ""+'"');
	}

	@Override
	public String extension() {
		return "cool";
	}

	public static void main(String[] args) {
		File file = new File(args[0]);
		try {
			new Main().convert2java(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}