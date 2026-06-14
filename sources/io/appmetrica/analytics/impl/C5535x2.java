package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5535x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4991bf f78545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f78548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f78549e;

    public C5535x2(X4 x42, C4991bf c4991bf) {
        this.f78545a = c4991bf;
        x42.b();
        this.f78546b = TimeUnit.MINUTES.toMillis(1L);
        this.f78547c = TimeUnit.DAYS.toMillis(7L);
        this.f78548d = new SystemTimeProvider();
        Map<String, Long> mapF = c4991bf.f();
        a(mapF);
        this.f78549e = mapF;
    }

    public final void a(Map map) {
        long jCurrentTimeMillis = this.f78548d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < jCurrentTimeMillis - this.f78547c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
