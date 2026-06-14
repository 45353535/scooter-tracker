package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5519wb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f78499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f78500b;

    public RunnableC5519wb(Handler handler, Q2 q22) {
        this.f78499a = new WeakReference(handler);
        this.f78500b = new WeakReference(q22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f78499a.get();
        Q2 q22 = (Q2) this.f78500b.get();
        if (handler == null || q22 == null) {
            return;
        }
        boolean zF = q22.f76279b.f();
        if (!zF) {
            PublicLogger publicLogger = q22.f76280c;
            Set set = D9.f75657a;
            EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
            U3 u32 = new U3("", "", 3, 0, publicLogger);
            Bi bi2 = q22.f76285h;
            Kh kh2 = q22.f76279b;
            bi2.getClass();
            bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        }
        if (zF) {
            return;
        }
        C5494vb.a(handler, q22, this);
    }
}
