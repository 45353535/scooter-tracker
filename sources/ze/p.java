package ze;

import eg.c0;
import eg.m1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static final CoroutineContext a(Job job) {
        return m1.a(job).plus(new a(eg.c0.J8));
    }

    public static /* synthetic */ CoroutineContext b(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return a(job);
    }

    public static final class a extends kotlin.coroutines.a implements eg.c0 {
        public a(c0.b bVar) {
            super(bVar);
        }

        @Override // eg.c0
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
