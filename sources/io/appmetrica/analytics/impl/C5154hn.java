package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5154hn extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5179in f77349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5154hn(C5179in c5179in) {
        super(0);
        this.f77349a = c5179in;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap map = new HashMap();
        C5179in c5179in = this.f77349a;
        String strA = c5179in.f77441a.a();
        if (strA != null) {
        }
        String strA2 = c5179in.f77442b.a();
        if (strA2 != null) {
            map.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, strA2);
        }
        return map;
    }
}
