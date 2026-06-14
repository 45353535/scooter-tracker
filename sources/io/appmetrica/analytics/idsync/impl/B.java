package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f75380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f75381b = new A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75382c = "request_state";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f75383d = MapsKt.toMutableMap(a());

    public B(ModulePreferences modulePreferences) {
        this.f75380a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<z> listA = this.f75381b.toModel(this.f75380a.getString(this.f75382c, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listA, 10)), 16));
        for (Object obj : listA) {
            linkedHashMap.put(((z) obj).f75452a, obj);
        }
        return linkedHashMap;
    }
}
