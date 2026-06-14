package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class qj3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f115033c = rj3.f115467a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f115034a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115035b = false;

    public final synchronized void a(String str, long j10) {
        if (this.f115035b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f115034a.add(new pj3(str, j10, SystemClock.elapsedRealtime()));
    }

    public final void finalize() {
        if (this.f115035b) {
            return;
        }
        a();
        boolean z10 = lb1.f113032a;
    }

    public final synchronized void a() {
        long j10;
        this.f115035b = true;
        if (this.f115034a.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((pj3) this.f115034a.get(0)).f114691a;
            ArrayList arrayList = this.f115034a;
            j10 = ((pj3) arrayList.get(arrayList.size() - 1)).f114691a - j11;
        }
        if (j10 <= 0) {
            return;
        }
        long j12 = ((pj3) this.f115034a.get(0)).f114691a;
        boolean z10 = lb1.f113032a;
        Iterator it = this.f115034a.iterator();
        while (it.hasNext()) {
            long j13 = ((pj3) it.next()).f114691a;
            boolean z11 = lb1.f113032a;
        }
    }
}
