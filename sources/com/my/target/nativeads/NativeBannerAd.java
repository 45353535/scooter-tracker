package com.my.target.nativeads;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.a8;
import com.my.target.b7;
import com.my.target.c6;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.gb;
import com.my.target.h6;
import com.my.target.i7;
import com.my.target.j;
import com.my.target.j6;
import com.my.target.k7;
import com.my.target.m;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.views.NativeBannerAdView;
import com.my.target.o;
import com.my.target.o7;
import com.my.target.u2;
import com.my.target.x5;
import java.util.List;
import java.util.UUID;
import o5.d;

/* JADX INFO: loaded from: classes11.dex */
public final class NativeBannerAd extends BaseAd implements INativeBannerAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f60221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i7.b f60222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuFactory f60223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u2 f60224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NativeBannerAdListener f60225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NativeBannerAdMediaListener f60226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public NativeBannerAdChoicesListener f60227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NativeBannerAdChoicesOptionListener f60228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f60229m;

    public interface NativeBannerAdChoicesListener {
        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z10, @Nullable NativeBannerAd nativeBannerAd);
    }

    public interface NativeBannerAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(@NonNull NativeBannerAd nativeBannerAd);

        void onCloseAutomatically(@NonNull NativeBannerAd nativeBannerAd);

        boolean shouldCloseAutomatically();
    }

    public interface NativeBannerAdListener {
        void onClick(@NonNull NativeBannerAd nativeBannerAd);

        void onLoad(@NonNull NativeBanner nativeBanner, @NonNull NativeBannerAd nativeBannerAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeBannerAd nativeBannerAd);

        void onShow(@NonNull NativeBannerAd nativeBannerAd);
    }

    public interface NativeBannerAdMediaListener {
        void onIconLoad(@NonNull NativeBannerAd nativeBannerAd);
    }

    public NativeBannerAd(int i10, @NonNull Context context) {
        super(i10, "nativebanner");
        this.f60222f = new i7.b();
        this.f60229m = 0;
        this.f60221e = context.getApplicationContext();
        gb.c("Native banner ad created. Version - " + MyTargetVersion.VERSION);
    }

    @Nullable
    public NativeBannerAdChoicesListener getAdChoicesListener() {
        return this.f60227k;
    }

    @Nullable
    public NativeBannerAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.f60228l;
    }

    @Override // com.my.target.nativeads.IAd
    public int getAdChoicesPlacement() {
        return this.f60229m;
    }

    @Nullable
    public String getAdSource() {
        u2 u2Var = this.f60224h;
        if (u2Var != null) {
            return u2Var.a();
        }
        return null;
    }

    public float getAdSourcePriority() {
        u2 u2Var = this.f60224h;
        if (u2Var != null) {
            return u2Var.b();
        }
        return 0.0f;
    }

    @Nullable
    public NativeBanner getBanner() {
        u2 u2Var = this.f60224h;
        if (u2Var == null) {
            return null;
        }
        return u2Var.c();
    }

    @Override // com.my.target.nativeads.IAd
    public int getCachePolicy() {
        return this.f59399a.f();
    }

    @Nullable
    public NativeBannerAdListener getListener() {
        return this.f60225i;
    }

    @Nullable
    public NativeBannerAdMediaListener getMediaListener() {
        return this.f60226j;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        u2 u2Var = this.f60224h;
        if (u2Var == null) {
            return;
        }
        u2Var.handleAdChoicesClick(context);
    }

    @Override // com.my.target.nativeads.IAd
    public void handleData(@NonNull String str) {
        this.f59399a.a(o.a(this.f59402d, UUID.randomUUID().toString(), 0, j6.f59959a));
        i7.a(this.f60222f, str, this.f59399a, this.f59400b).a(new d(this)).a(this.f59400b.a(), this.f60221e);
    }

    public boolean isMediationEnabled() {
        return this.f59399a.k();
    }

    @Override // com.my.target.nativeads.IAd
    public void load() {
        if (isLoadCalled()) {
            gb.a("NativeBannerAd: Doesn't support multiple load");
            this.f59399a.a().a(0, 1);
            a((o7) null, m.f60115t);
        } else {
            o oVarA = o.a(this.f59402d, this.f59399a.i(), 0, j6.f59959a);
            this.f59399a.a(oVarA);
            oVarA.b(0, 0);
            i7.a(this.f60222f, this.f59399a, this.f59400b).a(new d(this)).a(this.f59400b.a(), this.f60221e);
        }
    }

    @Override // com.my.target.nativeads.IAd
    public void loadFromBid(@NonNull String str) {
        this.f59399a.b(str);
        load();
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder, @Nullable List<View> list) {
        k7.a(nativeBannerAdViewBinder.getRootAdBannerView(), this);
        u2 u2Var = this.f60224h;
        if (u2Var != null) {
            u2Var.registerView(nativeBannerAdViewBinder, list, this.f60229m);
        }
    }

    public void setAdChoicesListener(@Nullable NativeBannerAdChoicesListener nativeBannerAdChoicesListener) {
        this.f60227k = nativeBannerAdChoicesListener;
    }

    public void setAdChoicesOptionListener(@Nullable NativeBannerAdChoicesOptionListener nativeBannerAdChoicesOptionListener) {
        this.f60228l = nativeBannerAdChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.IAd
    public void setAdChoicesPlacement(int i10) {
        this.f60229m = i10;
    }

    @Override // com.my.target.nativeads.IAd
    public void setCachePolicy(int i10) {
        this.f59399a.b(i10);
    }

    public void setListener(@Nullable NativeBannerAdListener nativeBannerAdListener) {
        this.f60225i = nativeBannerAdListener;
    }

    public void setMediaListener(@Nullable NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.f60226j = nativeBannerAdMediaListener;
        u2 u2Var = this.f60224h;
        if (u2Var != null) {
            u2Var.a(nativeBannerAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z10) {
        this.f59399a.a(z10);
    }

    @Override // com.my.target.nativeads.IAd
    public void unregisterView() {
        k7.a(this);
        u2 u2Var = this.f60224h;
        if (u2Var != null) {
            u2Var.unregisterView();
        }
    }

    public void a(b7 b7Var) {
        this.f60224h = a8.a(this, b7Var, this.f60223g, this.f60221e);
    }

    public void a(o7 o7Var) {
        this.f59399a.a(o.a(this.f59402d, 0, j6.f59959a));
        h6.a aVarA = h6.a(this.f59399a.i());
        i7.a(this.f60222f, o7Var, this.f59399a, aVarA).a(new d(this)).a(aVarA.a(), this.f60221e);
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdView nativeBannerAdView) {
        registerView(nativeBannerAdView.getNativeBannerAdViewBinder(), (List<View>) null);
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdView nativeBannerAdView, @Nullable List<View> list) {
        registerView(nativeBannerAdView.getNativeBannerAdViewBinder(), list);
    }

    public NativeBannerAd(int i10, @Nullable MenuFactory menuFactory, @NonNull Context context) {
        this(i10, context);
        this.f60223g = menuFactory;
    }

    @Override // com.my.target.nativeads.INativeBannerAd
    public void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder) {
        registerView(nativeBannerAdViewBinder, (List<View>) null);
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list) {
        k7.a(view, this);
        u2 u2Var = this.f60224h;
        if (u2Var != null) {
            u2Var.registerView(view, list, this.f60229m);
        }
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view) {
        registerView(view, (List<View>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(o7 o7Var, IAdLoadingError iAdLoadingError) {
        NativeBannerAdListener nativeBannerAdListener = this.f60225i;
        if (nativeBannerAdListener == null) {
            return;
        }
        if (o7Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60110o;
            }
            nativeBannerAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        b7 b7VarD = o7Var.d();
        x5 x5VarB = o7Var.b();
        if (b7VarD != null) {
            a8 a8VarA = a8.a(this, b7VarD, this.f60223g, this.f60221e);
            this.f60224h = a8VarA;
            a8VarA.a(this.f60226j);
            NativeBanner nativeBannerC = this.f60224h.c();
            if (nativeBannerC != null) {
                this.f60225i.onLoad(nativeBannerC, this);
                return;
            }
            return;
        }
        if (x5VarB != null) {
            c6 c6VarA = c6.a(this, x5VarB, this.f59399a, this.f59400b, this.f60223g);
            this.f60224h = c6VarA;
            c6VarA.b(this.f60221e);
        } else {
            NativeBannerAdListener nativeBannerAdListener2 = this.f60225i;
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60116u;
            }
            nativeBannerAdListener2.onNoAd(iAdLoadingError, this);
        }
    }

    public void a(j jVar, b7 b7Var) {
        setCachePolicy(jVar.f());
        a(b7Var);
        o oVarA = o.a(this.f59402d, jVar.a());
        this.f59399a.a(oVarA);
        b7Var.d().a(oVarA);
    }
}
