package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class C5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f75606a;

    static {
        HashMap map = new HashMap();
        map.put("google", AdTrackingInfo.Provider.GOOGLE);
        map.put("huawei", AdTrackingInfo.Provider.HMS);
        map.put("yandex", AdTrackingInfo.Provider.YANDEX);
        f75606a = DesugarCollections.unmodifiableMap(map);
    }
}
