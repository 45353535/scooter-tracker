package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5569yb extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5594zb f78579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5569yb(C5594zb c5594zb, String str) {
        super(str);
        this.f78579a = c5594zb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f78579a.f78611a) {
            C5594zb.a(this.f78579a);
            this.f78579a.f78615e = true;
            this.f78579a.f78611a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f78579a.f78612b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f78579a.f78612b);
                this.f78579a.f78612b.clear();
            }
            if (map.size() > 0) {
                C5594zb.a(this.f78579a, map);
                map.clear();
            }
        }
    }
}
