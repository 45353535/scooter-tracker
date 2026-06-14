package j$.time.format;

import j$.time.chrono.InterfaceC5639b;
import j$.time.w;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j$.time.temporal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5639b f84646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.m f84648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f84649d;

    @Override // j$.time.temporal.n
    public final /* synthetic */ int k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    public o(InterfaceC5639b interfaceC5639b, j$.time.temporal.n nVar, j$.time.chrono.m mVar, w wVar) {
        this.f84646a = interfaceC5639b;
        this.f84647b = nVar;
        this.f84648c = mVar;
        this.f84649d = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        InterfaceC5639b interfaceC5639b = this.f84646a;
        if (interfaceC5639b != null && qVar.t()) {
            return interfaceC5639b.f(qVar);
        }
        return this.f84647b.f(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        InterfaceC5639b interfaceC5639b = this.f84646a;
        if (interfaceC5639b != null && qVar.t()) {
            return interfaceC5639b.n(qVar);
        }
        return this.f84647b.n(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        InterfaceC5639b interfaceC5639b = this.f84646a;
        if (interfaceC5639b != null && qVar.t()) {
            return interfaceC5639b.t(qVar);
        }
        return this.f84647b.t(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final Object p(a aVar) {
        if (aVar == j$.time.temporal.r.f84717b) {
            return this.f84648c;
        }
        if (aVar == j$.time.temporal.r.f84716a) {
            return this.f84649d;
        }
        if (aVar == j$.time.temporal.r.f84718c) {
            return this.f84647b.p(aVar);
        }
        return aVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f84648c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        w wVar = this.f84649d;
        if (wVar != null) {
            str2 = " with zone " + wVar;
        }
        return this.f84647b + str + str2;
    }
}
