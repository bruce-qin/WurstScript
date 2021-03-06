package de.peeeq.wurstscript.attributes;

import de.peeeq.wurstscript.ast.ClassDef;
import de.peeeq.wurstscript.ast.InterfaceDef;
import de.peeeq.wurstscript.ast.ModuleDef;
import de.peeeq.wurstscript.ast.ModuleInstanciation;
import de.peeeq.wurstscript.types.WurstTypeClass;
import de.peeeq.wurstscript.types.WurstTypeInterface;

public class Level {

    public static int get(ClassDef classDef) {
        int level = 1;
        if (classDef.getExtendedClass().attrTyp() instanceof WurstTypeClass) {
            WurstTypeClass wtc = (WurstTypeClass) classDef.getExtendedClass().attrTyp();
            level = Math.max(level, 1 + wtc.getClassDef().attrLevel());
        }
        for (WurstTypeInterface in : classDef.attrImplementedInterfaces()) {
            level = Math.max(level, 1 + in.getInterfaceDef().attrLevel());
        }
        for (ModuleInstanciation m : classDef.getModuleInstanciations()) {
            level = Math.max(level, 1 + m.attrLevel());
        }
        return level;
    }

    public static int get(InterfaceDef in) {
        int level = 1;
        for (WurstTypeInterface in2 : in.attrExtendedInterfaces()) {
            level = Math.max(level, 1 + in2.getInterfaceDef().attrLevel());
        }
        return level;
    }

    public static int get(ModuleDef classDef) {
        int level = 1;
        for (ModuleInstanciation m : classDef.getModuleInstanciations()) {
            level = Math.max(level, 1 + m.attrLevel());
        }
        return level;
    }

    public static int get(ModuleInstanciation classDef) {
        int level = 1;
        for (ModuleInstanciation m : classDef.getModuleInstanciations()) {
            level = Math.max(level, 1 + m.attrLevel());
        }
        return level;
    }

}
