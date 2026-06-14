package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f51813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f51814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f51815c = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f51816d = new long[2];

    public g(c cVar, s sVar) {
        this.f51813a = cVar;
        this.f51814b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f51815c.incrementAndGet();
            this.f51816d[0] = System.currentTimeMillis();
            this.f51816d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f51813a.a(iVar);
            this.f51814b.k();
            this.f51814b.e();
            this.f51814b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f51816d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
