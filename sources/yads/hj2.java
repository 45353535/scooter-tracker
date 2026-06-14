package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hj2 implements ed3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh3 f111605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f111606b = CollectionsKt.mutableListOf(new gj2(dh3.f109926b, 0.25f), new gj2(dh3.f109927c, 0.5f), new gj2(dh3.f109928d, 0.75f));

    public hj2(fh3 fh3Var) {
        this.f111605a = fh3Var;
    }

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        if (j10 != 0) {
            Iterator it = this.f111606b.iterator();
            while (it.hasNext()) {
                gj2 gj2Var = (gj2) it.next();
                if (gj2Var.f111231b * j10 <= j11) {
                    this.f111605a.a(gj2Var.f111230a);
                    it.remove();
                }
            }
        }
    }
}
