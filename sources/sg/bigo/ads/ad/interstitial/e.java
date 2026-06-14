package sg.bigo.ads.ad.interstitial;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f101102a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f101103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f101104c;

    public interface a {
        boolean a(Runnable runnable);
    }

    public final void a() {
        this.f101102a = true;
        sg.bigo.ads.common.utils.n nVar = this.f101104c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @CallSuper
    public void b() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f101102a || (nVar = this.f101104c) == null || nVar.f102817i) {
            return;
        }
        nVar.c();
    }

    @CallSuper
    public void c() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f101102a || (nVar = this.f101104c) == null || nVar.f102817i) {
            return;
        }
        nVar.d();
    }

    protected final void a(int i10, final Runnable runnable) {
        sg.bigo.ads.common.utils.n nVar = this.f101104c;
        if (nVar != null) {
            nVar.b();
        }
        this.f101102a = false;
        sg.bigo.ads.common.utils.n nVar2 = new sg.bigo.ads.common.utils.n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.interstitial.e.1
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                Runnable runnable2;
                e eVar = e.this;
                if (eVar.f101102a || (runnable2 = runnable) == null) {
                    return;
                }
                a aVar = eVar.f101103b;
                if (aVar != null) {
                    aVar.a(runnable2);
                } else {
                    runnable2.run();
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.f101104c = nVar2;
        nVar2.c();
    }
}
