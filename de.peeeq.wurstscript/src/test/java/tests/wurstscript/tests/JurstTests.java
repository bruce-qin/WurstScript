package tests.wurstscript.tests;

import com.google.common.collect.ImmutableMap;
import de.peeeq.wurstscript.utils.Utils;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.Map;

public class JurstTests extends WurstScriptTest {

    @Test
    public void multilineString() {
        testJurst(false, false, Utils.string(
                "package test",
                "let s = \"12345678",
                "90\"",
                ""));
    }

    @Test
    public void hexInt1() {
        testJurst(true, false, Utils.string(
                "package test",
                "native testSuccess()",
                "int a = $10",
                "init",
                "  if a == 16 then",
                "    testSuccess()",
                "  end",
                "end",
                ""));
    }

    @Test
    public void hexInt2() {
        testJurst(true, false, Utils.string(
                "package test",
                "native testSuccess()",
                "int a = 0x10",
                "init",
                "  if a == 16 then",
                "    testSuccess()",
                "  end",
                "end",
                ""));
    }

    @Test
    public void asciiChars1() {
        testJurst(true, false, Utils.string(
                "package test",
                "native testSuccess()",
                "int a = 'b'- 'a'",
                "init",
                "  if a == 1 then",
                "    testSuccess()",
                "  end",
                "end",
                ""));
    }

    @Test
    public void asciiChars2() {
        testJurst(true, false, Utils.string(
                "package test",
                "native testSuccess()",
                "int a = 'hfoo'",
                "init",
                "  if a == 1751543663 then",
                "    testSuccess()",
                "  end",
                "end",
                ""));
    }

    @Test
    public void asciiChars3() {
        testJurst(true, false, Utils.string(
                "package test",
                "native testSuccess()",
                "int a = 'h\\\\oo'",
                "init",
                "  if a == 1750888303 then",
                "    testSuccess()",
                "  end",
                "end",
                ""));
    }

    @Test
    public void thisAsVarNameInJass() { // #498
        String jassCode = Utils.string(
                "function foo takes integer this returns integer",
                "	return this",
                "endfunction",
                "function bar takes integer x returns integer",
                "	local integer this = x",
                "	return this",
                "endfunction");


        String jurstCode = Utils.string(
                "package test",
                "	native testSuccess()",
                "	init",
                "		if foo(5) == 5",
                "			testSuccess()",
                "		end",
                "	end",
                "endpackage");

        testJurstWithJass(true, false, jassCode, jurstCode);
    }

    private void testJurstWithJass(boolean executeProg, boolean withStdLib, String jass, String jurst) {
        Map<String, String> inputs = ImmutableMap.of(
                "example.j", jass,
                "test.jurst", jurst
        );
        testScript(Collections.emptyList(), inputs, "JurstJassTest", executeProg, withStdLib, false);
    }

    private void testJurst(boolean executeProg, boolean withStdLib, String jurst) {
        testScript("test.jurst", jurst, "JurstTest", executeProg, withStdLib);
    }

}
