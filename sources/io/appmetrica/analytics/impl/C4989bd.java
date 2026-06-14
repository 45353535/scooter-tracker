package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4989bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f76896a = new LinkedHashMap();

    public final LinkedHashMap a(String str) {
        LinkedHashMap linkedHashMap = this.f76896a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
