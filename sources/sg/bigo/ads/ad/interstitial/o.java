package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.b.a;
import sg.bigo.ads.api.b.d;

/* JADX INFO: loaded from: classes4.dex */
public class o extends k<sg.bigo.ads.api.core.h> {

    @NonNull
    public final sg.bigo.ads.ad.banner.c<o> B;
    sg.bigo.ads.ad.banner.h C;
    protected sg.bigo.ads.ad.interstitial.j.a D;
    private final boolean E;
    private boolean F;
    private final AtomicBoolean G;

    public o(@NonNull sg.bigo.ads.api.core.f fVar) {
        sg.bigo.ads.api.a.m mVarE;
        super(fVar);
        try {
            sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) f();
            sg.bigo.ads.ad.interstitial.j.a aVar = null;
            if (hVar != null && (mVarE = hVar.e()) != null) {
                n nVar = new n();
                nVar.f101558a = mVarE.a("video_play_page.ad_component_layout");
                nVar.f101559b = mVarE.a("video_play_page.force_staying_time");
                nVar.f101560c = mVarE.a("video_play_page.close_button_style");
                nVar.f101561d = mVarE.a("video_play_page.x_area");
                nVar.f101562e = mVarE.a("video_play_page.duration");
                int i10 = nVar.f101558a;
                aVar = i10 != 1 ? i10 != 2 ? new sg.bigo.ads.ad.interstitial.j.a(this, this.f100335b.f102178e, nVar) : new sg.bigo.ads.ad.interstitial.j.c(this, this.f100335b.f102178e, nVar) : new sg.bigo.ads.ad.interstitial.j.b(this, this.f100335b.f102178e, nVar);
            }
            this.D = aVar;
            this.G = new AtomicBoolean(false);
            boolean zAv = hVar.av();
            this.E = zAv;
            sg.bigo.ads.ad.banner.c<o> cVar = new sg.bigo.ads.ad.banner.c<>(this.f100335b.f102178e, fVar, this, hVar, E(), new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.o.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                    if (o.this.C != null) {
                        o.this.C.a();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    o.d(o.this);
                    if (o.this.p()) {
                        o.this.G();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(String str) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "InterstitialBannerAd onCustomJsOmImpression, adSessionId=".concat(String.valueOf(str)));
                    o.this.G();
                    sg.bigo.ads.core.d.b.a(o.this.f100335b.f102174a, (String) o.this.b("show_proportion", ""), o.this.j(), ((Integer) o.this.b("render_style", 0)).intValue());
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
                @Override // sg.bigo.ads.ad.banner.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(sg.bigo.ads.common.i r4, sg.bigo.ads.api.core.d r5) {
                    /*
                        r3 = this;
                        if (r4 == 0) goto L2a
                        sg.bigo.ads.ad.interstitial.o r0 = sg.bigo.ads.ad.interstitial.o.this
                        android.graphics.Rect r0 = r0.A
                        android.graphics.Point r1 = r4.f102537a
                        if (r1 == 0) goto L2a
                        android.graphics.Point r2 = r4.f102538b
                        if (r2 == 0) goto L2a
                        if (r0 != 0) goto L11
                        goto L2a
                    L11:
                        int r2 = r1.x
                        int r1 = r1.y
                        boolean r1 = r0.contains(r2, r1)
                        if (r1 == 0) goto L2a
                        android.graphics.Point r1 = r4.f102538b
                        int r2 = r1.x
                        int r1 = r1.y
                        boolean r0 = r0.contains(r2, r1)
                        if (r0 == 0) goto L2a
                        r0 = 33
                        goto L2b
                    L2a:
                        r0 = 0
                    L2b:
                        sg.bigo.ads.ad.interstitial.o r1 = sg.bigo.ads.ad.interstitial.o.this
                        r2 = 1
                        r1.a(r4, r0, r2, r5)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.o.AnonymousClass1.a(sg.bigo.ads.common.i, sg.bigo.ads.api.core.d):void");
                }
            }, zAv);
            this.B = cVar;
            cVar.f100257c = 0;
            cVar.f100272r = this.D;
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error data type for ad!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.G.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "InterstitialBannerAd report impression AdEvent");
            super.n();
        }
    }

    static /* synthetic */ boolean d(o oVar) {
        oVar.F = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final boolean B() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return m.class;
    }

    protected sg.bigo.ads.core.mraid.n E() {
        return sg.bigo.ads.core.mraid.n.INTERSTITIAL;
    }

    public final n F() {
        sg.bigo.ads.ad.interstitial.j.a aVar = this.D;
        if (aVar != null) {
            return aVar.f101403c;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected final void b(@NonNull Activity activity) {
        super.b(activity);
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        if (cVar != null) {
            cVar.f100270p = new WeakReference<>(activity);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        this.C = null;
        super.destroyInMainThread();
        this.B.a();
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public String getCreativeId() {
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public final void h() {
        super.h();
        sg.bigo.ads.ad.banner.c<o> cVar = this.B;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void n() {
        if (!this.E || this.F) {
            G();
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "BannerAd report impression AdEvent depend on om callback.");
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void o() {
        super.o();
        G();
    }

    public final void a(AdCountDownButton adCountDownButton, View view) {
        sg.bigo.ads.ad.interstitial.j.a aVar = this.D;
        if (aVar == null || adCountDownButton == null) {
            return;
        }
        int i10 = aVar.f101403c.f101560c;
        adCountDownButton.setCloseImageResource(i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close2);
        adCountDownButton.setShowCloseButtonInCountdown(true);
        adCountDownButton.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.j.a.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AdCountDownButton f101404a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f101405b;

            public AnonymousClass1(AdCountDownButton adCountDownButton2, View view2) {
                adCountDownButton = adCountDownButton2;
                view = view2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar2 = a.this;
                int i11 = aVar2.f101403c.f101561d;
                if (i11 == 1) {
                    adCountDownButton.setBtnClickArea(1);
                    return;
                }
                if (i11 == 2) {
                    adCountDownButton.setBtnClickArea(2);
                    return;
                }
                if (i11 != 3) {
                    return;
                }
                AdCountDownButton adCountDownButton2 = adCountDownButton;
                View view2 = view;
                Rect rect = new Rect();
                adCountDownButton2.getHitRect(rect);
                rect.inset((-rect.width()) / 2, (-rect.height()) / 2);
                View closeView = adCountDownButton2.getCloseView();
                if (view2 == null || closeView == null) {
                    return;
                }
                view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.j.a.2

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ Rect f101407a;

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ View f101408b;

                    AnonymousClass2(Rect rect2, View closeView2) {
                        rect = rect2;
                        view = closeView2;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            return false;
                        }
                        if (motionEvent.getActionMasked() != 0) {
                            return true;
                        }
                        view.onTouchEvent(motionEvent);
                        return true;
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    protected void b(@NonNull d.a<InterstitialAd> aVar) {
        sg.bigo.ads.api.core.b bVar = this.f100335b.f102174a;
        if (!(bVar instanceof sg.bigo.ads.api.core.h)) {
            aVar.a(this, 1021, 1250, "InterstitialBannerAd with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.api.core.h hVar = (sg.bigo.ads.api.core.h) bVar;
        if (hVar.aw() == null || TextUtils.isEmpty(hVar.aw().c())) {
            aVar.a(this, 1022, 1252, "Empty content.");
        } else {
            this.B.a(new a.InterfaceC1252a() { // from class: sg.bigo.ads.ad.interstitial.o.2
                @Override // sg.bigo.ads.api.b.a.InterfaceC1252a
                public final void a(sg.bigo.ads.api.core.c cVar) {
                }

                @Override // sg.bigo.ads.api.b.a.InterfaceC1252a
                public final void b() {
                }
            });
            aVar.a(this);
        }
    }
}
