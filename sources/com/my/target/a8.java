package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.ImageData;
import com.my.target.d8;
import com.my.target.l8;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class a8 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeBannerAd f59141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7 f59142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f59143c = e1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d8 f59144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NativeBanner f59145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l8 f59146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NativeBannerAd.NativeBannerAdMediaListener f59147g;

    public static class a implements d8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a8 f59148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NativeBannerAd f59149b;

        public a(a8 a8Var, NativeBannerAd nativeBannerAd) {
            this.f59148a = a8Var;
            this.f59149b = nativeBannerAd;
        }

        @Override // com.my.target.m8
        public void a(View view, int i10) {
            this.f59148a.a(view, i10);
        }

        @Override // com.my.target.d8.b
        public void b() {
            NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener = this.f59148a.f59147g;
            if (nativeBannerAdMediaListener != null) {
                nativeBannerAdMediaListener.onIconLoad(this.f59149b);
            }
        }

        @Override // com.my.target.d8.b
        public void a(View view) {
            this.f59148a.a(view);
        }

        @Override // com.my.target.a3.b
        public void a(boolean z10) {
            NativeBannerAd.NativeBannerAdChoicesListener adChoicesListener = this.f59149b.getAdChoicesListener();
            if (adChoicesListener == null) {
                return;
            }
            if (!z10) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.f59149b);
                return;
            }
            NativeBanner banner = this.f59149b.getBanner();
            if (banner == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.f59149b);
                return;
            }
            ImageData adChoicesIcon = banner.getAdChoicesIcon();
            if (adChoicesIcon == null) {
                adChoicesListener.onAdChoicesIconLoad(null, false, this.f59149b);
            } else {
                adChoicesListener.onAdChoicesIconLoad(adChoicesIcon, true, this.f59149b);
            }
        }

        @Override // com.my.target.d8.b
        public void b(Context context) {
            NativeBannerAd.NativeBannerAdChoicesOptionListener adChoicesOptionListener = this.f59149b.getAdChoicesOptionListener();
            if (adChoicesOptionListener == null) {
                this.f59148a.a(context);
                gb.a("NativeBannerAdEngine: there is no NativeBannerAdChoicesOptionListener, default behaviour for closing the ad.");
            } else if (adChoicesOptionListener.shouldCloseAutomatically()) {
                this.f59148a.a(context);
                adChoicesOptionListener.onCloseAutomatically(this.f59149b);
                gb.a("NativeBannerAdEngine: Ad should close automatically.");
            } else {
                gb.a("NativeBannerAdEngine: Ad shouldn't close automatically.");
                adChoicesOptionListener.closeIfAutomaticallyDisabled(this.f59149b);
            }
        }
    }

    public a8(NativeBannerAd nativeBannerAd, b7 b7Var, MenuFactory menuFactory, Context context) {
        this.f59141a = nativeBannerAd;
        this.f59142b = b7Var;
        this.f59145e = NativeBanner.a(b7Var);
        this.f59144d = d8.a(b7Var, new a(this, nativeBannerAd), menuFactory);
        this.f59146f = l8.a(b7Var, 2, null, context);
    }

    public static a8 a(NativeBannerAd nativeBannerAd, b7 b7Var, MenuFactory menuFactory, Context context) {
        return new a8(nativeBannerAd, b7Var, menuFactory, context);
    }

    @Override // com.my.target.u2
    public float b() {
        return 0.0f;
    }

    @Override // com.my.target.u2
    public NativeBanner c() {
        return this.f59145e;
    }

    @Override // com.my.target.u2
    public void handleAdChoicesClick(Context context) {
        this.f59144d.c(context);
    }

    @Override // com.my.target.u2
    public void registerView(View view, List list, int i10) {
        unregisterView();
        l8 l8Var = this.f59146f;
        if (l8Var != null) {
            l8Var.a(view, new l8.b[0]);
        }
        this.f59144d.a(view, list, i10);
    }

    @Override // com.my.target.u2
    public void unregisterView() {
        this.f59144d.b();
        l8 l8Var = this.f59146f;
        if (l8Var != null) {
            l8Var.a();
        }
    }

    @Override // com.my.target.u2
    public void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.f59147g = nativeBannerAdMediaListener;
    }

    @Override // com.my.target.u2
    public String a() {
        return "myTarget";
    }

    public void a(View view, int i10) {
        gb.a("NativeBannerAdEngine: Click received by native banner ad, cs=" + i10);
        if (view != null) {
            a(this.f59142b, view, i10);
        }
    }

    @Override // com.my.target.u2
    public void registerView(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i10) {
        unregisterView();
        l8 l8Var = this.f59146f;
        if (l8Var != null) {
            l8Var.a(nativeBannerAdViewBinder.getRootAdBannerView(), new l8.b[0]);
        }
        this.f59144d.a(nativeBannerAdViewBinder, list, i10);
    }

    public void a(View view) {
        l8 l8Var = this.f59146f;
        if (l8Var != null) {
            l8Var.c();
        }
        NativeBannerAd.NativeBannerAdListener listener = this.f59141a.getListener();
        gb.a("NativeBannerAdEngine: Ad shown, banner Id = " + this.f59142b.r());
        if (listener != null) {
            listener.onShow(this.f59141a);
        }
    }

    public void a(Context context) {
        this.f59144d.b(context);
    }

    public final void a(b bVar, View view, int i10) {
        Context context;
        if (bVar != null && (context = view.getContext()) != null) {
            this.f59143c.a(bVar, i10, context);
        }
        NativeBannerAd.NativeBannerAdListener listener = this.f59141a.getListener();
        if (listener != null) {
            listener.onClick(this.f59141a);
        }
    }
}
