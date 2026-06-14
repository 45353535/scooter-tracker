package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;

/* JADX INFO: loaded from: classes3.dex */
public class w0 {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public KFunction function(x xVar) {
        return xVar;
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new r(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new j0(cls, str);
    }

    public KType mutableCollectionType(KType kType) {
        e1 e1Var = (e1) kType;
        return new e1(kType.getClassifier(), kType.getArguments(), e1Var.g(), e1Var.f() | 2);
    }

    public KMutableProperty0 mutableProperty0(d0 d0Var) {
        return d0Var;
    }

    public KMutableProperty1 mutableProperty1(f0 f0Var) {
        return f0Var;
    }

    public KMutableProperty2 mutableProperty2(h0 h0Var) {
        return h0Var;
    }

    public KProperty0 property0(k0 k0Var) {
        return k0Var;
    }

    public KProperty1 property1(m0 m0Var) {
        return m0Var;
    }

    public KProperty2 property2(o0 o0Var) {
        return o0Var;
    }

    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((w) lambda);
    }

    public void setUpperBounds(KTypeParameter kTypeParameter, List list) {
        ((c1) kTypeParameter).a(list);
    }

    public KType typeOf(KClassifier kClassifier, List list, boolean z10) {
        return new e1(kClassifier, list, z10);
    }

    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z10) {
        return new c1(obj, str, kVariance, z10);
    }

    public String renderLambdaToString(w wVar) {
        String string = wVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(KOTLIN_JVM_FUNCTIONS) ? string.substring(21) : string;
    }
}
