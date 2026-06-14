package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.ArraysKt;
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
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* JADX INFO: loaded from: classes3.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w0 f93334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final KClass[] f93335b;

    static {
        w0 w0Var = null;
        try {
            w0Var = (w0) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (w0Var == null) {
            w0Var = new w0();
        }
        f93334a = w0Var;
        f93335b = new KClass[0];
    }

    public static KFunction a(x xVar) {
        return f93334a.function(xVar);
    }

    public static KClass b(Class cls) {
        return f93334a.getOrCreateKotlinClass(cls);
    }

    public static KDeclarationContainer c(Class cls) {
        return f93334a.getOrCreateKotlinPackage(cls, "");
    }

    public static KType d(KType kType) {
        return f93334a.mutableCollectionType(kType);
    }

    public static KMutableProperty0 e(d0 d0Var) {
        return f93334a.mutableProperty0(d0Var);
    }

    public static KMutableProperty1 f(f0 f0Var) {
        return f93334a.mutableProperty1(f0Var);
    }

    public static KMutableProperty2 g(h0 h0Var) {
        return f93334a.mutableProperty2(h0Var);
    }

    public static KType h(Class cls) {
        return f93334a.typeOf(b(cls), Collections.EMPTY_LIST, true);
    }

    public static KProperty0 i(k0 k0Var) {
        return f93334a.property0(k0Var);
    }

    public static KProperty1 j(m0 m0Var) {
        return f93334a.property1(m0Var);
    }

    public static KProperty2 k(o0 o0Var) {
        return f93334a.property2(o0Var);
    }

    public static String l(w wVar) {
        return f93334a.renderLambdaToString(wVar);
    }

    public static String m(Lambda lambda) {
        return f93334a.renderLambdaToString(lambda);
    }

    public static void n(KTypeParameter kTypeParameter, KType kType) {
        f93334a.setUpperBounds(kTypeParameter, Collections.singletonList(kType));
    }

    public static KType o(Class cls) {
        return f93334a.typeOf(b(cls), Collections.EMPTY_LIST, false);
    }

    public static KType p(Class cls, KTypeProjection kTypeProjection) {
        return f93334a.typeOf(b(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static KType q(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f93334a.typeOf(b(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    public static KType r(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f93334a.typeOf(b(cls), ArraysKt.toList(kTypeProjectionArr), false);
    }

    public static KType s(KClassifier kClassifier) {
        return f93334a.typeOf(kClassifier, Collections.EMPTY_LIST, false);
    }

    public static KTypeParameter t(Object obj, String str, KVariance kVariance, boolean z10) {
        return f93334a.typeParameter(obj, str, kVariance, z10);
    }
}
