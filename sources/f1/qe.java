package f1;

import f1.bd;
import f1.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qe extends bd implements ag {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ag f70857l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(String url, ag eventTracker) {
        super(bd.c.f69468b, url, r.f70879e, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f70857l = eventTracker;
    }

    @Override // f1.bd
    public void c(g1.a aVar, ef efVar) {
        String strK;
        eg.i("Impression tracking request failed", aVar != null ? aVar : new Exception("Null CBError"));
        if (efVar == null || (strK = o(efVar)) == null) {
            strK = aVar != null ? k(aVar) : "";
        }
        e((y0) new oc(z2.e.f71721c, strK, null, null, null, 28, null));
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70857l.e(y0Var);
    }

    public final String k(g1.a aVar) {
        return "Error " + aVar.h() + ": " + aVar.getMessage() + " for URL " + j();
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70857l.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70857l.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70857l.n(uVar);
    }

    public final String o(ef efVar) {
        if (efVar.c()) {
            return null;
        }
        return "Server error " + efVar.b() + " for URL " + j();
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70857l.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70857l.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70857l.mo4436e(event);
    }
}
