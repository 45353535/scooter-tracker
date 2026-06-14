package f1;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class jc implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f70201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f70203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f70206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f70207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f70208i;

    public jc(r rVar, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference atomicReference, AtomicInteger atomicInteger2, String str4) {
        this.f70201b = rVar;
        this.f70202c = str;
        this.f70203d = str2;
        this.f70204e = str3;
        this.f70206g = atomicInteger;
        this.f70207h = atomicReference;
        this.f70208i = atomicInteger2;
        this.f70205f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jc jcVar) {
        return this.f70201b.g() - jcVar.f70201b.g();
    }

    public void c(Executor executor, boolean z10) {
        w9 w9Var;
        if ((this.f70206g.decrementAndGet() == 0 || !z10) && (w9Var = (w9) this.f70207h.getAndSet(null)) != null) {
            executor.execute(new ka(w9Var, z10, this.f70208i.get()));
        }
    }
}
