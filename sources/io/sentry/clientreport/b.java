package io.sentry.clientreport;

import io.sentry.k;
import io.sentry.util.q;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f83371a = new q(new q.a() { // from class: io.sentry.clientreport.a
        @Override // io.sentry.util.q.a
        public final Object a() {
            return b.c();
        }
    });

    public static /* synthetic */ Map c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (f fVar : f.values()) {
            for (k kVar : k.values()) {
                concurrentHashMap.put(new d(fVar.getReason(), kVar.getCategory()), new AtomicLong(0L));
            }
        }
        return DesugarCollections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.i
    public void a(d dVar, Long l10) {
        AtomicLong atomicLong = (AtomicLong) ((Map) this.f83371a.a()).get(dVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }

    @Override // io.sentry.clientreport.i
    public List b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) this.f83371a.a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new g(((d) entry.getKey()).b(), ((d) entry.getKey()).a(), lValueOf));
            }
        }
        return arrayList;
    }
}
