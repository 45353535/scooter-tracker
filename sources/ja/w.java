package ja;

import ga.f0;
import ga.m1;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.j2;
import n9.e0;
import n9.h0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f85693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ka.e f85694b;

    public interface a {
        void a(i2 i2Var);

        void onTrackSelectionsInvalidated();
    }

    protected final ka.e b() {
        return (ka.e) q9.a.i(this.f85694b);
    }

    public abstract h0 c();

    public abstract j2.a d();

    public void e(a aVar, ka.e eVar) {
        this.f85693a = aVar;
        this.f85694b = eVar;
    }

    protected final void f() {
        a aVar = this.f85693a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }

    protected final void g(i2 i2Var) {
        a aVar = this.f85693a;
        if (aVar != null) {
            aVar.a(i2Var);
        }
    }

    public abstract boolean h();

    public abstract void i(Object obj);

    public void j() {
        this.f85693a = null;
        this.f85694b = null;
    }

    public abstract x k(j2[] j2VarArr, m1 m1Var, f0.b bVar, e0 e0Var);

    public abstract void l(n9.c cVar);

    public abstract void m(h0 h0Var);
}
