package de.peeeq.wurstscript;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.runtime.Symbol;
import de.peeeq.wurstscript.ast.AST;
import de.peeeq.wurstscript.ast.CompilationUnit;
import de.peeeq.wurstscript.ast.CompilationUnitPos;
import de.peeeq.wurstscript.attributes.Attributes;
import de.peeeq.wurstscript.intermediateLang.ILprog;
import de.peeeq.wurstscript.intermediateLang.translator.IntermediateLangTranslator;
import de.peeeq.wurstscript.parser.ExtendedParser;
import de.peeeq.wurstscript.parser.WurstScriptScanner;

public class WurstCompilerImpl implements WurstCompiler {

	private File file;
	private int parseErrors;
	private ILprog ilProg;

	
	@Override
	public void loadFile(String filename) {
		this.file = new File(filename);
		if (!file.exists()) {
			throw new Error("File " + filename + " does not exist.");
		}
	}

	@Override
	public void parseFile() {
		try {
			FileReader reader = new FileReader(file);
			// scanning
			WurstScriptScanner scanner = new WurstScriptScanner(reader);
			ExtendedParser parser = new ExtendedParser(scanner );
			Symbol sym = parser.parse();
			parseErrors = parser.getErrorCount();
			if (parseErrors > 0) {
				return;
			}	
			CompilationUnit root = (CompilationUnit) sym.value;
			CompilationUnitPos rootPos = AST.CompilationUnitPos(root);
			
			// create new attributes instance:
			Attributes attr = new Attributes();

			IntermediateLangTranslator translator = new IntermediateLangTranslator(rootPos, attr);
			ilProg = translator.translate();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public ILprog getILprog() {
		return ilProg;
	}
	
}