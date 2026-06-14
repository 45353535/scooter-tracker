package sg.bigo.ads.core.player.a;

import android.os.SystemClock;
import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile c f104564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile sg.bigo.ads.common.h.a f104565c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f104569g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicInteger f104563a = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile long f104566d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile long f104567e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicInteger f104568f = new AtomicInteger(0);

    public e(String str) {
        this.f104569g = (String) m.a(str);
    }

    final synchronized boolean a() {
        c cVar;
        try {
            if (this.f104564b == null) {
                String str = this.f104569g;
                HashMap map = new HashMap();
                for (String str2 : str.substring(str.indexOf("?") + 1).split(C4240b4.j.f42670c)) {
                    String[] strArrSplit = str2.split(C4240b4.j.f42668b);
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                this.f104565c = sg.bigo.ads.core.player.b.a().f104593g.a((String) map.get("path"), (String) map.get("name"));
                if (this.f104565c == null) {
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "downloadInfo = null");
                    cVar = null;
                } else {
                    cVar = new c(this.f104565c);
                }
            } else {
                cVar = this.f104564b;
            }
            this.f104564b = cVar;
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f104564b != null;
    }

    final synchronized void b() {
        if (this.f104563a.decrementAndGet() <= 0) {
            c cVar = this.f104564b;
            synchronized (cVar.f104584c) {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Shutdown proxy for ");
                cVar.f104585d = true;
                cVar.f104583b.b();
            }
            this.f104564b = null;
        }
    }
}
