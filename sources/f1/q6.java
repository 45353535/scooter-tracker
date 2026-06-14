package f1;

import f1.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q6 implements c6, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f70811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ag f70812c;

    public q6(w2 repository, ag eventTracker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f70811b = repository;
        this.f70812c = eventTracker;
    }

    @Override // f1.c6
    public void a(j1.d dVar) {
        String strA;
        if (dVar == null || (strA = dVar.a()) == null || strA.length() == 0) {
            try {
                e((y0) new w3(z2.d.f71717g, "", "", "", null, null, 48, null));
            } catch (Exception unused) {
            }
            eg.j("addDataUseConsent failed", null, 2, null);
            return;
        }
        if ((dVar instanceof j1.e) || (dVar instanceof j1.a) || (dVar instanceof j1.b) || (dVar instanceof j1.g) || (dVar instanceof j1.c)) {
            this.f70811b.f(dVar);
            return;
        }
        try {
            z2.d dVar2 = z2.d.f71713c;
            String name = dVar.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            e((y0) new oc(dVar2, name, "", "", null, 16, null));
        } catch (Exception unused2) {
        }
        eg.p("Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.", null, 2, null);
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70812c.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70812c.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70812c.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70812c.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70812c.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70812c.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70812c.mo4436e(event);
    }
}
