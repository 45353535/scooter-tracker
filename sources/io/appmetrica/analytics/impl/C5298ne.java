package io.appmetrica.analytics.impl;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4257c4;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5298ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f77836a;

    public C5298ne() {
        HashMap map = new HashMap();
        this.f77836a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", "h");
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY);
        map.put("retry_policy", "rp");
        map.put("cache_control", "cc");
        map.put(C4257c4.f42799c, "at");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f77836a.containsKey(str) ? (String) this.f77836a.get(str) : str;
    }
}
