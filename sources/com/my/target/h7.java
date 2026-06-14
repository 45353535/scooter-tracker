package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.C4424m2;
import com.my.target.common.ExternalClickHandler;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.l8;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.r7;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes11.dex */
public final class h7 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAd f59818a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7 f59821d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r7 f59823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NativePromoBanner f59824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l8 f59825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NativeAd.NativeAdMediaListener f59826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ExternalClickHandler f59827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f59828k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f59819b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f59820c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f59822e = e1.a();

    public static class a implements r7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h7 f59829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NativeAd f59830b;

        public a(h7 h7Var, NativeAd nativeAd) {
            this.f59829a = h7Var;
            this.f59830b = nativeAd;
        }

        @Override // com.my.target.m8
        public void a(View view, int i10) {
            this.f59829a.a(view, i10);
        }

        @Override // com.my.target.r7.c
        public void b() {
            NativeAd.NativeAdMediaListener nativeAdMediaListener = this.f59829a.f59826i;
            if (nativeAdMediaListener != null) {
                nativeAdMediaListener.onIconLoad(this.f59830b);
            }
        }

        @Override // com.my.target.q7.b
        public void c() {
            this.f59829a.c();
        }

        @Override // com.my.target.q7.b
        public void d() {
            this.f59829a.f();
        }

        @Override // com.my.target.q7.b
        public void e() {
            this.f59829a.g();
        }

        @Override // com.my.target.r7.c
        public void f() {
            NativeAd.NativeAdMediaListener nativeAdMediaListener = this.f59829a.f59826i;
            if (nativeAdMediaListener != null) {
                nativeAdMediaListener.onImageLoad(this.f59830b);
            }
        }

        @Override // com.my.target.q7.b
        public void a() {
            this.f59829a.e();
        }

        @Override // com.my.target.c9.a
        public void a(View view, int i10, int i11) {
            this.f59829a.a(view, i10, i11);
        }

        @Override // com.my.target.c9.a
        public void a(int[] iArr, Context context) {
            this.f59829a.a(iArr, context);
        }

        @Override // com.my.target.c9.a
        public void a(int i10, Context context) {
            this.f59829a.a(i10, context);
        }

        @Override // com.my.target.g7.a
        public void a(f7 f7Var, String str, Context context) {
            this.f59829a.a(f7Var, str, context);
        }

        @Override // com.my.target.r7.c
        public void a(View view) {
            this.f59829a.a(view);
        }

        @Override // com.my.target.r7.c
        public void a(Context context) {
            NativeAd.NativeAdChoicesOptionListener adChoicesOptionListener = this.f59830b.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                this.f59829a.a(context);
                gb.a("NativeAdEngine: there is no NativeAdChoicesOptionListener, default behaviour for closing the ad.");
            } else if (adChoicesOptionListener.shouldCloseAutomatically()) {
                this.f59829a.a(context);
                adChoicesOptionListener.onCloseAutomatically(this.f59830b);
                gb.a("NativeAdEngine: Ad should close automatically.");
            } else {
                adChoicesOptionListener.closeIfAutomaticallyDisabled(this.f59830b);
                gb.a("NativeAdEngine: Ad shouldn't close automatically.");
            }
        }

        @Override // com.my.target.a3.b
        public void a(boolean z10) {
            NativeAd.NativeAdChoicesListener adChoicesListener = this.f59830b.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            if (!z10) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.f59830b);
                return;
            }
            NativePromoBanner banner = this.f59830b.getBanner();
            if (banner == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.f59830b);
                return;
            }
            ImageData adChoicesIcon = banner.getAdChoicesIcon();
            if (adChoicesIcon == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.f59830b);
            } else {
                adChoicesListener.onAdChoicesIconLoad(adChoicesIcon, true, this.f59830b);
            }
        }
    }

    public h7(NativeAd nativeAd, b7 b7Var, MenuFactory menuFactory, Context context) {
        this.f59818a = nativeAd;
        this.f59821d = b7Var;
        this.f59824g = NativePromoBanner.b(b7Var);
        s5 s5VarP = b7Var.P();
        l8 l8VarA = l8.a(b7Var, s5VarP != null ? 3 : 2, s5VarP, context);
        this.f59825h = l8VarA;
        e8 e8VarA = e8.a(l8VarA, context);
        e8VarA.a(nativeAd.isUseExoPlayer());
        this.f59823f = r7.a(b7Var, new a(this, nativeAd), e8VarA, menuFactory);
    }

    public static h7 a(NativeAd nativeAd, b7 b7Var, MenuFactory menuFactory, Context context) {
        return new h7(nativeAd, b7Var, menuFactory, context);
    }

    @Override // com.my.target.t2
    public float b() {
        return 0.0f;
    }

    public void c() {
        NativeAd.NativeAdListener listener = this.f59818a.getListener();
        if (listener != null) {
            listener.onVideoComplete(this.f59818a);
        }
    }

    @Override // com.my.target.t2
    public NativePromoBanner d() {
        return this.f59824g;
    }

    public void e() {
        gb.a("NativeAdEngine: Video error");
        this.f59823f.a();
    }

    public void f() {
        NativeAd.NativeAdListener listener = this.f59818a.getListener();
        if (listener != null) {
            listener.onVideoPause(this.f59818a);
        }
    }

    public void g() {
        NativeAd.NativeAdListener listener = this.f59818a.getListener();
        if (listener != null) {
            listener.onVideoPlay(this.f59818a);
        }
    }

    @Override // com.my.target.t2
    public void handleAdChoicesClick(Context context) {
        this.f59823f.c(context);
    }

    @Override // com.my.target.t2
    public void registerView(NativeAdViewBinder nativeAdViewBinder, List list, int i10) {
        unregisterView();
        l8 l8Var = this.f59825h;
        if (l8Var != null) {
            l8Var.a(nativeAdViewBinder.getRootAdView(), new l8.b[0]);
        }
        this.f59823f.a(nativeAdViewBinder, list, i10);
    }

    @Override // com.my.target.t2
    public void unregisterView() {
        this.f59823f.f();
        l8 l8Var = this.f59825h;
        if (l8Var != null) {
            l8Var.a();
        }
    }

    @Override // com.my.target.t2
    public void a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        this.f59826i = nativeAdMediaListener;
    }

    public final boolean b(b bVar, String str, int i10, Context context) {
        ExternalClickHandler externalClickHandler = this.f59827j;
        if (externalClickHandler == null) {
            return false;
        }
        String strH = bVar.h();
        String strB = bVar.B();
        if (TextUtils.isEmpty(str)) {
            str = (i10 != 2 || strH == null) ? strB : strH;
        }
        String strE = bVar.e();
        String strJ = bVar.j();
        boolean zHandleClick = externalClickHandler.handleClick(strE, strJ, str, bVar.K());
        if (zHandleClick) {
            if (!TextUtils.isEmpty(str)) {
                if (str.equals(strH)) {
                    bb.a(bVar.x().b("ctaClick"), 2, context);
                    return zHandleClick;
                }
                bb.a(bVar.x().b("click"), 2, context);
                return zHandleClick;
            }
            if (!TextUtils.isEmpty(strE) || !TextUtils.isEmpty(strJ)) {
                bb.a(bVar.x().b("deeplinkClick"), 2, context);
            }
        }
        return zHandleClick;
    }

    @Override // com.my.target.t2
    public void a(View view, List list, int i10, MediaAdView mediaAdView) {
        unregisterView();
        l8 l8Var = this.f59825h;
        if (l8Var != null) {
            l8Var.a(view, new l8.b[0]);
        }
        this.f59823f.a(view, list, i10, mediaAdView);
    }

    @Override // com.my.target.t2
    public String a() {
        return "myTarget";
    }

    public void a(int[] iArr, Context context) {
        if (this.f59828k) {
            String strD = kb.d(context);
            List listO = this.f59821d.O();
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                d7 d7Var = (i11 < 0 || i11 >= listO.size()) ? null : (d7) listO.get(i11);
                if (d7Var != null && !this.f59819b.contains(d7Var)) {
                    za zaVarX = d7Var.x();
                    if (strD != null) {
                        bb.a(zaVarX, strD, 1, context);
                    }
                    bb.b(zaVarX, C4424m2.f43623v, 1, context);
                    this.f59819b.add(d7Var);
                }
            }
        }
    }

    public void a(int i10, Context context) {
        List listO = this.f59821d.O();
        d7 d7Var = (i10 < 0 || i10 >= listO.size()) ? null : (d7) listO.get(i10);
        if (d7Var == null || this.f59820c.contains(d7Var)) {
            return;
        }
        bb.b(d7Var.x(), Reporting.EventType.RENDER, 1, context);
        this.f59820c.add(d7Var);
    }

    public void a(View view, int i10, int i11) {
        gb.a("NativeAdEngine: Click on native card received");
        List listO = this.f59821d.O();
        if (i10 >= 0 && i10 < listO.size()) {
            a((d7) listO.get(i10), i11, view.getContext());
        }
        za zaVarX = this.f59821d.x();
        Context context = view.getContext();
        if (context != null) {
            bb.b(zaVarX, i11 == 2 ? "ctaClick" : "click", 2, context);
        }
    }

    public void a(View view, int i10) {
        gb.a("NativeAdEngine: Click received by native ad");
        if (view != null) {
            a(this.f59821d, i10, view.getContext());
        }
    }

    public void a(f7 f7Var, String str, Context context) {
        gb.a("NativeAdEngine: Click on native content received");
        a(f7Var, str, 1, context);
        bb.b(this.f59821d.x(), "click", 2, context);
    }

    public void a(View view) {
        l8 l8Var = this.f59825h;
        if (l8Var != null) {
            l8Var.c();
        }
        if (this.f59828k) {
            return;
        }
        this.f59828k = true;
        int[] iArrB = this.f59823f.b();
        if (iArrB != null) {
            a(iArrB, view.getContext());
        }
        NativeAd.NativeAdListener listener = this.f59818a.getListener();
        gb.a("NativeAdEngine: Ad shown, banner id = " + this.f59821d.r());
        if (listener != null) {
            listener.onShow(this.f59818a);
        }
    }

    public void a(Context context) {
        this.f59823f.b(context);
    }

    public final void a(b bVar, int i10, Context context) {
        a(bVar, (String) null, i10, context);
    }

    public final void a(b bVar, String str, int i10, Context context) {
        if (bVar != null) {
            if (b(bVar, str, i10, context)) {
                gb.a("NativeAdEngine: click was handled by app");
            } else if (str != null) {
                this.f59822e.a(bVar, str, i10, context);
            } else {
                this.f59822e.a(bVar, i10, context);
            }
        }
        NativeAd.NativeAdListener listener = this.f59818a.getListener();
        if (listener != null) {
            listener.onClick(this.f59818a);
        }
    }

    @Override // com.my.target.t2
    public void a(ExternalClickHandler externalClickHandler) {
        this.f59827j = externalClickHandler;
    }
}
