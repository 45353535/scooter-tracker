package com.unity3d.ads.injection;

import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.C4488pd;
import hg.l0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0007J.\u0010\u0010\u001a\u00020\u0006\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013H\u0086\bø\u0001\u0000J \u0010\u0014\u001a\u0002H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086\b¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u0004\u0018\u0001H\r\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0086\b¢\u0006\u0002\u0010\u0015J.\u0010\u0017\u001a\u00020\u0006\"\u0006\b\u0000\u0010\r\u0018\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\b\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013H\u0086\bø\u0001\u0000R$\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/injection/Registry;", "", "()V", "_services", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/unity3d/ads/injection/EntryKey;", "Lkotlin/Lazy;", "services", "getServices", "()Ljava/util/Map;", "add", "", "T", C4240b4.i.W, C4424m2.f43617p, "factory", "named", "", "Lkotlin/Function0;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", C4488pd.f44651d, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Registry {

    @NotNull
    private final MutableStateFlow _services = l0.a(MapsKt.emptyMap());

    public static /* synthetic */ EntryKey factory$default(Registry registry, String named, Function0 instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, v0.b(Object.class));
        registry.add(entryKey, new Factory(instance));
        return entryKey;
    }

    public static /* synthetic */ Object get$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, v0.b(Object.class));
        Lazy lazy = registry.getServices().get(entryKey);
        if (lazy != null) {
            Object value = lazy.getValue();
            Intrinsics.reifiedOperationMarker(1, "T");
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        Lazy lazy = registry.getServices().get(new EntryKey(named, v0.b(Object.class)));
        if (lazy == null) {
            return null;
        }
        Object value = lazy.getValue();
        Intrinsics.reifiedOperationMarker(1, "T");
        return value;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String named, Function0 instance, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, v0.b(Object.class));
        registry.add(entryKey, i.a(instance));
        return entryKey;
    }

    public final <T> void add(@NotNull EntryKey key, @NotNull Lazy instance) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        MutableStateFlow mutableStateFlow = this._services;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, MapsKt.plus((Map) value, MapsKt.mapOf(TuplesKt.to(key, instance)))));
    }

    public final /* synthetic */ <T> EntryKey factory(String named, Function0<? extends T> instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, v0.b(Object.class));
        add(entryKey, new Factory(instance));
        return entryKey;
    }

    public final /* synthetic */ <T> T get(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, v0.b(Object.class));
        Lazy lazy = getServices().get(entryKey);
        if (lazy != null) {
            T t10 = (T) lazy.getValue();
            Intrinsics.reifiedOperationMarker(1, "T");
            return t10;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ <T> T getOrNull(String named) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.reifiedOperationMarker(4, "T");
        Lazy lazy = getServices().get(new EntryKey(named, v0.b(Object.class)));
        if (lazy == null) {
            return null;
        }
        T t10 = (T) lazy.getValue();
        Intrinsics.reifiedOperationMarker(1, "T");
        return t10;
    }

    @NotNull
    public final Map<EntryKey, Lazy> getServices() {
        return (Map) this._services.getValue();
    }

    public final /* synthetic */ <T> EntryKey single(String named, Function0<? extends T> instance) {
        Intrinsics.checkNotNullParameter(named, "named");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.reifiedOperationMarker(4, "T");
        EntryKey entryKey = new EntryKey(named, v0.b(Object.class));
        add(entryKey, i.a(instance));
        return entryKey;
    }
}
