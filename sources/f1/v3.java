package f1;

import f1.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v3 implements h3, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b1.e f71361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ag f71362e;

    public v3(String adType, String location, b1.e eVar, ag eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f71359b = adType;
        this.f71360c = location;
        this.f71361d = eVar;
        this.f71362e = eventTracker;
    }

    @Override // f1.h3
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        e((y0) new l1(z2.g.f71735c, message, this.f71359b, this.f71360c, this.f71361d, null, 32, null));
    }

    @Override // f1.h3
    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        e((y0) new oc(z2.g.f71736d, message, this.f71359b, this.f71360c, this.f71361d));
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71362e.e(y0Var);
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f71362e.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f71362e.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f71362e.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71362e.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71362e.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71362e.mo4436e(event);
    }
}
