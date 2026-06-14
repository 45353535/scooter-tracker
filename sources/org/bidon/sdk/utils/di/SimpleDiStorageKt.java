package org.bidon.sdk.utils.di;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.di.InstanceType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0016\b\n\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"", "T", "Lkotlin/Function1;", "Lorg/bidon/sdk/utils/di/InstanceType$ParamFactory$Params;", "", "params", "get", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lorg/bidon/sdk/utils/di/SimpleDiScope;", "scope", "module", "(Lkotlin/jvm/functions/Function1;)V", "getOrNull", "()Ljava/lang/Object;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SimpleDiStorageKt {
    public static final /* synthetic */ <T> T get(Function1<? super InstanceType.ParamFactory.Params, Unit> function1) {
        Map<KClass<?>, InstanceType<?>> instances = SimpleDiStorage.INSTANCE.getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        InstanceType<?> instanceType = instances.get(kotlin.jvm.internal.v0.b(Object.class));
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
        if (function1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function1.invoke(params);
        Object[] parameters = params.getParameters();
        T t12 = (T) ((InstanceType.ParamFactory) instanceType).build(Arrays.copyOf(parameters, parameters.length));
        Intrinsics.reifiedOperationMarker(1, "T");
        return t12;
    }

    public static /* synthetic */ Object get$default(Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        Map<KClass<?>, InstanceType<?>> instances = SimpleDiStorage.INSTANCE.getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        InstanceType<?> instanceType = instances.get(kotlin.jvm.internal.v0.b(Object.class));
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

    public static final /* synthetic */ <T> T getOrNull() {
        try {
            Map<KClass<?>, InstanceType<?>> instances = SimpleDiStorage.INSTANCE.getInstances();
            Intrinsics.reifiedOperationMarker(4, "T");
            InstanceType<?> instanceType = instances.get(kotlin.jvm.internal.v0.b(Object.class));
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
            if (instanceType instanceof InstanceType.ParamFactory) {
                new InstanceType.ParamFactory.Params();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (instanceType != null) {
                throw new lf.m();
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("No factory provided for class: " + Object.class).toString());
        } catch (Exception unused) {
            LogExtKt.logError("Dependency Injection", "BidonSdk is not initialized", BidonError.SdkNotInitialized.INSTANCE);
            return null;
        }
    }

    public static final void module(@NotNull Function1<? super SimpleDiScope, Unit> scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        scope.invoke(SimpleDiScope.INSTANCE);
    }
}
