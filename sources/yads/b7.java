package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b7 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108917a;

    public b7(List list) {
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((h7) it.next()).a();
        }
        this.f108917a = jA;
    }

    @Override // yads.u2
    public final long a() {
        return this.f108917a;
    }

    @Override // yads.u2
    public final long a(long j10) {
        return this.f108917a;
    }
}
