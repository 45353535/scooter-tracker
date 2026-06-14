package org.bidon.sdk.utils.di;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.bidon.sdk.utils.di.InstanceType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0007H\u0086\bJ#\u0010\b\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0086\bJ#\u0010\n\u001a\u00020\u0005\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0007H\u0086\b¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/utils/di/SimpleDiScope;", "", "<init>", "()V", "factory", "", "T", "Lorg/bidon/sdk/utils/di/InstanceType$Factory;", "factoryWithParams", "Lorg/bidon/sdk/utils/di/InstanceType$ParamFactory;", "singleton", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SimpleDiScope {

    @NotNull
    public static final SimpleDiScope INSTANCE = new SimpleDiScope();

    private SimpleDiScope() {
    }

    public final /* synthetic */ <T> void factory(InstanceType.Factory<T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        Map<KClass<?>, InstanceType<?>> instances = simpleDiStorage.getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        if (instances.get(kotlin.jvm.internal.v0.b(Object.class)) == null) {
            Map<KClass<?>, InstanceType<?>> instances2 = simpleDiStorage.getInstances();
            Intrinsics.reifiedOperationMarker(4, "T");
            instances2.put(kotlin.jvm.internal.v0.b(Object.class), factory);
        } else {
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Object.class) + " already added.").toString());
        }
    }

    public final /* synthetic */ <T> void factoryWithParams(InstanceType.ParamFactory<T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        Map<KClass<?>, InstanceType<?>> instances = simpleDiStorage.getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        if (instances.get(kotlin.jvm.internal.v0.b(Object.class)) == null) {
            Map<KClass<?>, InstanceType<?>> instances2 = simpleDiStorage.getInstances();
            Intrinsics.reifiedOperationMarker(4, "T");
            instances2.put(kotlin.jvm.internal.v0.b(Object.class), factory);
        } else {
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Object.class) + " already added.").toString());
        }
    }

    public final /* synthetic */ <T> void singleton(InstanceType.Factory<T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        SimpleDiStorage simpleDiStorage = SimpleDiStorage.INSTANCE;
        InstanceType.Singleton singleton = new InstanceType.Singleton(factory);
        Map<KClass<?>, InstanceType<?>> instances = simpleDiStorage.getInstances();
        Intrinsics.reifiedOperationMarker(4, "T");
        if (instances.get(kotlin.jvm.internal.v0.b(Object.class)) == null) {
            Map<KClass<?>, InstanceType<?>> instances2 = simpleDiStorage.getInstances();
            Intrinsics.reifiedOperationMarker(4, "T");
            instances2.put(kotlin.jvm.internal.v0.b(Object.class), singleton);
        } else {
            Intrinsics.reifiedOperationMarker(4, "T");
            throw new IllegalStateException(("Definition for " + kotlin.jvm.internal.v0.b(Object.class) + " already added.").toString());
        }
    }
}
