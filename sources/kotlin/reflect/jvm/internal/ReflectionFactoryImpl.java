package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.x;
import kotlin.reflect.KCallable;
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
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectLambdaKt;

/* JADX INFO: loaded from: classes3.dex */
public class ReflectionFactoryImpl extends w0 {
    public static void clearCaches() {
        CachesKt.clearCaches();
        ModuleByClassLoaderKt.clearModuleByClassLoaderCache();
    }

    private static KDeclarationContainerImpl getOwner(o oVar) {
        KDeclarationContainer owner = oVar.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.INSTANCE;
    }

    public KClass createKotlinClass(Class cls) {
        return new KClassImpl(cls);
    }

    @Override // kotlin.jvm.internal.w0
    public KFunction function(x xVar) {
        return new KFunctionImpl(getOwner(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.w0
    public KClass getOrCreateKotlinClass(Class cls) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.jvm.internal.w0
    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return CachesKt.getOrCreateKotlinPackage(cls);
    }

    @Override // kotlin.jvm.internal.w0
    public KType mutableCollectionType(KType kType) {
        return TypeOfImplKt.createMutableCollectionKType(kType);
    }

    @Override // kotlin.jvm.internal.w0
    public KMutableProperty0 mutableProperty0(d0 d0Var) {
        return new KMutableProperty0Impl(getOwner(d0Var), d0Var.getName(), d0Var.getSignature(), d0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.w0
    public KMutableProperty1 mutableProperty1(f0 f0Var) {
        return new KMutableProperty1Impl(getOwner(f0Var), f0Var.getName(), f0Var.getSignature(), f0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.w0
    public KMutableProperty2 mutableProperty2(h0 h0Var) {
        return new KMutableProperty2Impl(getOwner(h0Var), h0Var.getName(), h0Var.getSignature());
    }

    public KType nothingType(KType kType) {
        return TypeOfImplKt.createNothingType(kType);
    }

    public KType platformType(KType kType, KType kType2) {
        return TypeOfImplKt.createPlatformKType(kType, kType2);
    }

    @Override // kotlin.jvm.internal.w0
    public KProperty0 property0(k0 k0Var) {
        return new KProperty0Impl(getOwner(k0Var), k0Var.getName(), k0Var.getSignature(), k0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.w0
    public KProperty1 property1(m0 m0Var) {
        return new KProperty1Impl(getOwner(m0Var), m0Var.getName(), m0Var.getSignature(), m0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.w0
    public KProperty2 property2(o0 o0Var) {
        return new KProperty2Impl(getOwner(o0Var), o0Var.getName(), o0Var.getSignature());
    }

    @Override // kotlin.jvm.internal.w0
    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((w) lambda);
    }

    @Override // kotlin.jvm.internal.w0
    public void setUpperBounds(KTypeParameter kTypeParameter, List<KType> list) {
    }

    @Override // kotlin.jvm.internal.w0
    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z10) {
        return kClassifier instanceof q ? CachesKt.getOrCreateKType(((q) kClassifier).getJClass(), list, z10) : KClassifiers.createType(kClassifier, list, z10, Collections.EMPTY_LIST);
    }

    @Override // kotlin.jvm.internal.w0
    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z10) {
        List<KTypeParameter> typeParameters;
        if (obj instanceof KClass) {
            typeParameters = ((KClass) obj).getTypeParameters();
        } else {
            if (!(obj instanceof KCallable)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + obj);
            }
            typeParameters = ((KCallable) obj).getTypeParameters();
        }
        for (KTypeParameter kTypeParameter : typeParameters) {
            if (kTypeParameter.getName().equals(str)) {
                return kTypeParameter;
            }
        }
        throw new IllegalArgumentException("Type parameter " + str + " is not found in container: " + obj);
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new KClassImpl(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return CachesKt.getOrCreateKotlinClass(cls);
    }

    @Override // kotlin.jvm.internal.w0
    public String renderLambdaToString(w wVar) {
        KFunctionImpl kFunctionImplAsKFunctionImpl;
        KFunction kFunctionReflect = ReflectLambdaKt.reflect(wVar);
        return (kFunctionReflect == null || (kFunctionImplAsKFunctionImpl = UtilKt.asKFunctionImpl(kFunctionReflect)) == null) ? super.renderLambdaToString(wVar) : ReflectionObjectRenderer.INSTANCE.renderLambda(kFunctionImplAsKFunctionImpl.getDescriptor());
    }
}
