package kotlinx.coroutines;

import eg.b1;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
final class e0 extends b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f93610f;

    public e0(e eVar) {
        this.f93610f = eVar;
    }

    @Override // eg.b1
    public boolean u() {
        return false;
    }

    @Override // eg.b1
    public void v(Throwable th2) {
        Object objL0 = t().l0();
        if (objL0 instanceof eg.t) {
            e eVar = this.f93610f;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(kotlin.d.a(((eg.t) objL0).f69173a)));
        } else {
            e eVar2 = this.f93610f;
            Result.Companion companion2 = Result.f93230c;
            eVar2.resumeWith(Result.b(c0.h(objL0)));
        }
    }
}
