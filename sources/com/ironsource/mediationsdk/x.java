package com.ironsource.mediationsdk;

import com.ironsource.A5;
import com.ironsource.C4649z5;
import com.ironsource.G9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements AdapterNetworkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f44340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final JSONObject f44341b;

    public x(@NotNull String networkName, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f44340a = networkName;
        this.f44341b = new JSONObject(data.toString());
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List listFilterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (c.a(this.f44340a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    @NotNull
    public final String a() {
        return this.f44340a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject allData() {
        return this.f44341b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @Nullable
    public <T> T dataByKeyIgnoreCase(@NotNull String desiredKey, @NotNull Class<T> valueType) {
        Object next;
        Intrinsics.checkNotNullParameter(desiredKey, "desiredKey");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Iterator<String> itKeys = allData().keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "allData()\n          .keys()");
        Iterator it = kotlin.sequences.k.h(itKeys).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.N((String) next, desiredKey, true)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            Object objOpt = allData().opt(str);
            if (!valueType.isInstance(objOpt)) {
                objOpt = null;
            }
            if (objOpt != null) {
                return valueType.cast(objOpt);
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject networkDataByAdUnit(@NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.f44341b.optJSONObject(adUnit.toString());
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @NotNull
    public String toString() {
        return "NetworkData(networkName=" + this.f44340a + ", networkData=" + this.f44341b + ")";
    }

    public final void a(@NotNull Collection<? extends AbstractAdapter> adapters, @NotNull Collection<? extends AdapterBaseWrapper> networkAdapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while setting network data: " + e10.getMessage());
        }
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List listFilterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (c.a(this.f44340a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    public final void b() throws JSONException {
        Iterator<String> itKeys = this.f44341b.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "networkData.keys()");
        String strJoinToString$default = CollectionsKt.joinToString$default(kotlin.sequences.k.c0(kotlin.sequences.k.h(itKeys)), StringUtils.COMMA, null, null, 0, null, null, 62, null);
        G9.i().a(new C4649z5(A5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.f44340a + " - " + strJoinToString$default)));
    }
}
