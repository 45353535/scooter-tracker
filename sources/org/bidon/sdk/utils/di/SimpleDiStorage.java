package org.bidon.sdk.utils.di;

import com.unity3d.services.core.fid.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.bidon.sdk.utils.di.InstanceType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\u0007\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lorg/bidon/sdk/utils/di/SimpleDiStorage;", "", "<init>", "()V", "T", "Lorg/bidon/sdk/utils/di/InstanceType;", "factory", "", "addFactory", "(Lorg/bidon/sdk/utils/di/InstanceType;)V", "Lkotlin/Function1;", "Lorg/bidon/sdk/utils/di/InstanceType$ParamFactory$Params;", "parameters", "getInstance$bidon_productionRelease", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", Constants.GET_INSTANCE, "", "Lkotlin/reflect/KClass;", com.ironsource.mediationsdk.d.f43822k, "Ljava/util/Map;", "getInstances", "()Ljava/util/Map;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleDiStorage {

    @NotNull
    public static final SimpleDiStorage INSTANCE = new SimpleDiStorage();

    @NotNull
    private static final Map<KClass<?>, InstanceType<?>> instances = new LinkedHashMap();

    private SimpleDiStorage() {
    }

    public static /* synthetic */ Object getInstance$bidon_productionRelease$default(SimpleDiStorage simpleDiStorage, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        Map<KClass<?>, InstanceType<?>> instances2 = simpleDiStorage.getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        InstanceType<?> instanceType = instances2.get(kotlin.jvm.internal.v0.b(Object.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            Intrinsics.reifiedOperationMarker(1, "T");
            return singleton;
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            Intrinsics.reifiedOperationMarker(1, "T");
            return objBuild;
        }
        if (!(instanceType instanceof InstanceType.ParamFactory)) {
            if (instanceType != null) {
                throw new lf.m();
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("No factory provided for class: " + Object.class).toString());
        }
        InstanceType.ParamFactory.Params params = new InstanceType.ParamFactory.Params();
        if (function1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function1.invoke(params);
        Object[] parameters = params.getParameters();
        Object objBuild2 = ((InstanceType.ParamFactory) instanceType).build(Arrays.copyOf(parameters, parameters.length));
        Intrinsics.reifiedOperationMarker(1, "T");
        return objBuild2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> void addFactory(InstanceType<T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Map<KClass<?>, InstanceType<?>> instances2 = getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        if (instances2.get(kotlin.jvm.internal.v0.b(Object.class)) == null) {
            Map<KClass<?>, InstanceType<?>> instances3 = getInstances();
            Intrinsics.reifiedOperationMarker(4, "T");
            instances3.put(kotlin.jvm.internal.v0.b(Object.class), factory);
        } else {
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Object.class) + " already added.").toString());
        }
    }

    public final /* synthetic */ <T> T getInstance$bidon_productionRelease(Function1<? super InstanceType.ParamFactory.Params, Unit> parameters) {
        Map<KClass<?>, InstanceType<?>> instances2 = getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        InstanceType<?> instanceType = instances2.get(kotlin.jvm.internal.v0.b(Object.class));
        if (instanceType instanceof InstanceType.Singleton) {
            T t10 = (T) ((InstanceType.Singleton) instanceType).getInstance();
            Intrinsics.reifiedOperationMarker(1, "T");
            return t10;
        }
        if (instanceType instanceof InstanceType.Factory) {
            T t11 = (T) ((InstanceType.Factory) instanceType).build();
            Intrinsics.reifiedOperationMarker(1, "T");
            return t11;
        }
        if (!(instanceType instanceof InstanceType.ParamFactory)) {
            if (instanceType != null) {
                throw new lf.m();
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("No factory provided for class: " + Object.class).toString());
        }
        InstanceType.ParamFactory.Params params = new InstanceType.ParamFactory.Params();
        if (parameters == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        parameters.invoke(params);
        Object[] parameters2 = params.getParameters();
        T t12 = (T) ((InstanceType.ParamFactory) instanceType).build(Arrays.copyOf(parameters2, parameters2.length));
        Intrinsics.reifiedOperationMarker(1, "T");
        return t12;
    }

    @NotNull
    public final Map<KClass<?>, InstanceType<?>> getInstances() {
        return instances;
    }
}
