package j1;

import f1.ag;
import f1.u;
import f1.w3;
import f1.xc;
import f1.xe;
import f1.y0;
import f1.z2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements d, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ag f85473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f85474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f85475d;

    public f(ag eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f85473b = eventTracker;
        this.f85474c = "";
        this.f85475d = "";
    }

    @Override // j1.d
    public String a() {
        return this.f85474c;
    }

    public final Object b() {
        return this.f85475d;
    }

    public final void c(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f85475d = obj;
    }

    public final void d(String str) {
        try {
            e((y0) new w3(z2.d.f71715e, str == null ? "no message" : str, "", "", null, null, 48, null));
            throw new Exception(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f85473b.e(y0Var);
    }

    public final void f(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f85474c = str;
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f85473b.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f85473b.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f85473b.n(uVar);
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f85473b.p(y0Var);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f85473b.u(y0Var);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f85473b.mo4436e(event);
    }

    public /* synthetic */ f(ag agVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? xe.b() : agVar);
    }
}
