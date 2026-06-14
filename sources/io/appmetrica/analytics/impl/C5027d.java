package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5027d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f76993a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5052e f76994b;

    public C5027d(C5052e c5052e) {
        this.f76994b = c5052e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f76993a.get()) {
            this.f76994b.f77042e.set(false);
            C5052e c5052e = this.f76994b;
            c5052e.f77040c.postAtFrontOfQueue(c5052e.f77043f);
            int i10 = this.f76994b.f77039b.get();
            while (i10 > 0) {
                try {
                    Thread.sleep(C5052e.f77036g);
                    if (this.f76994b.f77042e.get()) {
                        break;
                    } else {
                        i10--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i10 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f76994b.f77038a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5001c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f76994b.f77042e.get()) {
                Thread.sleep(C5052e.f77036g);
            }
        }
    }
}
