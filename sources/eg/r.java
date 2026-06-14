package eg;

import kotlin.Result;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static final p a(Object obj) {
        q qVar = new q(null);
        qVar.s(obj);
        return qVar;
    }

    public static final p b(Job job) {
        return new q(job);
    }

    public static /* synthetic */ p c(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return b(job);
    }

    public static final boolean d(p pVar, Object obj) {
        Throwable thG = Result.g(obj);
        return thG == null ? pVar.s(obj) : pVar.d(thG);
    }
}
