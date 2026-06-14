package kotlinx.coroutines;

import eg.r0;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends r0 {
    protected final void A0() {
        Thread threadY0 = y0();
        if (Thread.currentThread() != threadY0) {
            eg.b.a();
            LockSupport.unpark(threadY0);
        }
    }

    protected abstract Thread y0();

    protected void z0(long j10, q.c cVar) {
        j.f93624h.N0(j10, cVar);
    }
}
