package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.k;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i<T extends k<?>> extends sg.bigo.ads.controller.e.b<T> implements k.b {
    public AdCountDownButton A;
    final AtomicBoolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f101381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f101382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f101383c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public T f101384y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected ViewGroup f101385z;

    protected i(@NonNull Activity activity) {
        super(activity);
        this.f101381a = new AtomicBoolean(false);
        this.B = new AtomicBoolean(true);
        this.f101382b = 0L;
        this.f101383c = 0L;
    }

    private void b() {
        AdCountDownButton adCountDownButton = (AdCountDownButton) p(R.id.inter_btn_close);
        this.A = adCountDownButton;
        if (adCountDownButton != null) {
            adCountDownButton.setOnCloseListener(new AdCountDownButton.a() { // from class: sg.bigo.ads.ad.interstitial.i.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a() {
                    i.this.d(true);
                }

                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
                public final void a(Rect rect) {
                    i.this.f101384y.A = rect;
                }
            });
        }
    }

    protected int D() {
        return 1;
    }

    public void E() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.d();
        }
        if (this.f101384y != null && !Q() && this.f101381a.compareAndSet(false, true)) {
            this.f101384y.a(D(), 2);
        }
        if (this.f101384y == null || Q()) {
            return;
        }
        this.f101384y.destroy();
    }

    protected boolean Q() {
        return false;
    }

    protected boolean R() {
        return false;
    }

    @LayoutRes
    protected int S() {
        return R.layout.bigo_ad_activity_interstitial;
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void T() {
        super.T();
        try {
            T t10 = (T) this.N;
            this.f101384y = t10;
            if (t10 == null) {
                aG();
                return;
            }
            if (!Q()) {
                aF();
                if (U()) {
                    int i10 = R.layout.bigo_ad_activity_popup;
                    int i11 = this.L.getResources().getDisplayMetrics().widthPixels;
                    int iC = sg.bigo.ads.common.utils.e.c(this.L);
                    this.L.setContentView(sg.bigo.ads.common.utils.a.a(this.L, i10, null, false), new ViewGroup.LayoutParams(i11, iC));
                } else {
                    o(S());
                }
            }
            l();
            this.f101385z = (ViewGroup) p(R.id.inter_main);
            if (R()) {
                b();
                aa();
                X();
            } else {
                if (Q()) {
                    h(W());
                    this.f101384y.a(this);
                    return;
                }
                int iW = W();
                b();
                g(iW);
                this.f101384y.a(this);
                X();
            }
        } catch (Exception unused) {
            a("Illegal InterstitialAd.");
        }
    }

    protected boolean U() {
        return false;
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean V() {
        return U();
    }

    @LayoutRes
    protected int W() {
        int iY = Y();
        Activity activity = this.L;
        ViewGroup viewGroup = this.f101385z;
        sg.bigo.ads.common.utils.a.a(activity, iY, viewGroup, viewGroup != null);
        return iY;
    }

    protected void X() {
        this.f101384y.C();
    }

    @LayoutRes
    protected abstract int Y();

    protected abstract boolean Z();

    protected final void a(String str) {
        T t10 = this.f101384y;
        if (t10 != null) {
            t10.e(str);
        }
        aG();
    }

    protected void aa() {
    }

    public final void ab() {
        if (this.f101384y != null && !this.f101381a.get()) {
            this.f101382b += SystemClock.elapsedRealtime() - this.f101383c;
            this.f101384y.a(D(), this.f101382b);
            this.f101382b = 0L;
        }
        aG();
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ac() {
        if (f() && this.B.compareAndSet(true, false)) {
            g();
        }
        sg.bigo.ads.controller.landing.c cVarY = af().y();
        if (cVarY == null || cVarY.f103769a != 4 || cVarY.f103771c) {
            return;
        }
        af().y().f103771c = true;
        sg.bigo.ads.controller.landing.e.a(this.L, af());
        Activity activity = this.L;
        sg.bigo.ads.core.landing.a.a(activity, cVarY.f103770b, activity.getPackageName());
    }

    protected boolean ad() {
        return true;
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ae() {
        if (h() && this.B.compareAndSet(false, true)) {
            i();
        }
        sg.bigo.ads.controller.landing.e.a(this.L, af());
    }

    protected sg.bigo.ads.ad.c af() {
        return this.f101384y;
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ag() {
    }

    @Override // sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ah() {
    }

    protected void d(boolean z10) {
        ab();
    }

    protected boolean f() {
        return true;
    }

    @CallSuper
    protected void g() {
        h(false);
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f100519c || !ad()) {
            return;
        }
        this.A.c();
    }

    protected abstract void g(@LayoutRes int i10);

    protected void h(@LayoutRes int i10) {
    }

    @CallSuper
    protected void i() {
        h(true);
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null || adCountDownButton.f100519c) {
            return;
        }
        adCountDownButton.b();
    }

    public final void k(@DrawableRes int i10) {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setCloseImageResource(i10);
        }
    }

    protected abstract void l();

    public void b(String str) {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z10) {
        if (z10) {
            aF();
        }
    }

    protected final void h(boolean z10) {
        this.B.set(z10);
        if (z10) {
            this.f101382b += SystemClock.elapsedRealtime() - this.f101383c;
        } else {
            this.f101383c = SystemClock.elapsedRealtime();
        }
    }

    protected boolean h() {
        return true;
    }
}
