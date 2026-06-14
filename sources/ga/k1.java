package ga;

import n9.e0;
import n9.r;

/* JADX INFO: loaded from: classes12.dex */
public final class k1 extends w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n9.r f72368f;

    public k1(n9.e0 e0Var, n9.r rVar) {
        super(e0Var);
        this.f72368f = rVar;
    }

    @Override // ga.w, n9.e0
    public e0.c o(int i10, e0.c cVar, long j10) {
        super.o(i10, cVar, j10);
        n9.r rVar = this.f72368f;
        cVar.f95273c = rVar;
        r.h hVar = rVar.f95455b;
        cVar.f95272b = hVar != null ? hVar.f95554h : null;
        return cVar;
    }
}
