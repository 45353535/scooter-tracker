package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class R0 extends com.ironsource.mediationsdk.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, J> f41654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(@NotNull List<? extends NetworkSettings> providers, int i10) {
        super(providers, i10);
        Intrinsics.checkNotNullParameter(providers, "providers");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(providers, 10)), 16));
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            Pair pair = TuplesKt.to(((NetworkSettings) it.next()).getProviderName(), new J(i10));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.f41654e = linkedHashMap;
    }

    public final void a(@NotNull pg waterfallInstances) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        List<AbstractC4643z> listB = waterfallInstances.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listB, 10)), 16));
        for (AbstractC4643z abstractC4643z : listB) {
            Pair pair = TuplesKt.to(abstractC4643z.p(), abstractC4643z.s());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        a(linkedHashMap);
    }

    @Override // com.ironsource.mediationsdk.h
    @NotNull
    public String a(@NotNull String instanceName) {
        String strD;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        J j10 = this.f41654e.get(instanceName);
        return (j10 == null || (strD = j10.d()) == null) ? "" : strD;
    }

    private final void a(Map<String, H> map) {
        for (Map.Entry<String, J> entry : this.f41654e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
