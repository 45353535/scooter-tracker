package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4350hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, JSONObject> f43261a;

    public C4350hc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f43261a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4350hc) && Intrinsics.areEqual(this.f43261a, ((C4350hc) obj).f43261a);
    }

    public int hashCode() {
        return this.f43261a.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f43261a + ")";
    }

    public C4350hc(@NotNull ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.f43261a = networkDataMap;
    }

    @NotNull
    public final C4350hc a(@NotNull ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new C4350hc(networkDataMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4350hc a(C4350hc c4350hc, ConcurrentHashMap concurrentHashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = c4350hc.f43261a;
        }
        return c4350hc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C4350hc(ConcurrentHashMap concurrentHashMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(@NotNull com.ironsource.mediationsdk.x networkData) {
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        if (!this.f43261a.containsKey(networkData.a())) {
            this.f43261a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f43261a;
            String strA = networkData.a();
            JSONObject jSONObject = this.f43261a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectA = IronSourceUtils.a(jSONObject, networkData.allData());
            Intrinsics.checkNotNullExpressionValue(jSONObjectA, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(strA, jSONObjectA);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while merging network data: " + e10.getMessage());
        }
    }

    public final void a(@NotNull AbstractAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f43261a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }

    public final void a(@Nullable AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f43261a.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            Intrinsics.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }
}
