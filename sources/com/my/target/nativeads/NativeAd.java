package com.my.target.nativeads;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.b6;
import com.my.target.b7;
import com.my.target.ba;
import com.my.target.c0;
import com.my.target.common.BaseAd;
import com.my.target.common.ExternalClickHandler;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.gb;
import com.my.target.h7;
import com.my.target.i7;
import com.my.target.j;
import com.my.target.j6;
import com.my.target.k7;
import com.my.target.m;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.NativeAdView;
import com.my.target.o;
import com.my.target.o7;
import com.my.target.t2;
import com.my.target.x5;
import java.util.List;
import java.util.UUID;
import o5.a;

/* JADX INFO: loaded from: classes11.dex */
public final class NativeAd extends BaseAd implements INativeAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f60192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i7.a f60193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuFactory f60194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t2 f60195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NativeAdListener f60196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NativeAdChoicesListener f60197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public NativeAdMediaListener f60198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NativeAdChoicesOptionListener f60199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExternalClickHandler f60200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f60201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f60202o;

    public interface NativeAdChoicesListener {
        void onAdChoicesIconLoad(@Nullable ImageData imageData, boolean z10, @NonNull NativeAd nativeAd);
    }

    public interface NativeAdChoicesOptionListener {
        void closeIfAutomaticallyDisabled(@NonNull NativeAd nativeAd);

        void onCloseAutomatically(@NonNull NativeAd nativeAd);

        boolean shouldCloseAutomatically();
    }

    public interface NativeAdListener {
        void onClick(@NonNull NativeAd nativeAd);

        void onLoad(@NonNull NativePromoBanner nativePromoBanner, @NonNull NativeAd nativeAd);

        void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAd nativeAd);

        void onShow(@NonNull NativeAd nativeAd);

        void onVideoComplete(@NonNull NativeAd nativeAd);

        void onVideoPause(@NonNull NativeAd nativeAd);

        void onVideoPlay(@NonNull NativeAd nativeAd);
    }

    public interface NativeAdMediaListener {
        void onIconLoad(@NonNull NativeAd nativeAd);

        void onImageLoad(@NonNull NativeAd nativeAd);
    }

    public NativeAd(int i10, @NonNull Context context) {
        super(i10, "nativeads");
        this.f60193f = new i7.a();
        this.f60201n = 0;
        this.f60202o = true;
        this.f60192e = context.getApplicationContext();
        this.f60194g = null;
        gb.c("Native ad created. Version - " + MyTargetVersion.VERSION);
    }

    public void a(j jVar, b7 b7Var) {
        setCachePolicy(jVar.f());
        a(b7Var);
        o oVarA = o.a(this.f59402d, jVar.a());
        this.f59399a.a(oVarA);
        b7Var.d().a(oVarA);
    }

    @Nullable
    public NativeAdChoicesListener getAdChoicesListener() {
        return this.f60197j;
    }

    @Nullable
    public NativeAdChoicesOptionListener getAdChoicesOptionListener() {
        return this.f60199l;
    }

    @Override // com.my.target.nativeads.IAd
    public int getAdChoicesPlacement() {
        return this.f60201n;
    }

    @Nullable
    public String getAdSource() {
        t2 t2Var = this.f60195h;
        if (t2Var != null) {
            return t2Var.a();
        }
        return null;
    }

    public float getAdSourcePriority() {
        t2 t2Var = this.f60195h;
        if (t2Var != null) {
            return t2Var.b();
        }
        return 0.0f;
    }

    @Nullable
    public NativePromoBanner getBanner() {
        t2 t2Var = this.f60195h;
        if (t2Var == null) {
            return null;
        }
        return t2Var.d();
    }

    @Override // com.my.target.nativeads.IAd
    public int getCachePolicy() {
        return this.f59399a.f();
    }

    @Nullable
    public NativeAdListener getListener() {
        return this.f60196i;
    }

    @Nullable
    public NativeAdMediaListener getMediaListener() {
        return this.f60198k;
    }

    public void handleAdChoicesClick(@NonNull Context context) {
        t2 t2Var = this.f60195h;
        if (t2Var == null) {
            return;
        }
        t2Var.handleAdChoicesClick(context);
    }

    @Override // com.my.target.nativeads.IAd
    public void handleData(@NonNull String str) {
        this.f59399a.a(o.a(this.f59402d, UUID.randomUUID().toString(), 1, j6.f59959a));
        i7.a(this.f60193f, str, this.f59399a, this.f59400b).a(new a(this)).a(this.f59400b.a(), this.f60192e);
    }

    public boolean isMediationEnabled() {
        return this.f59399a.k();
    }

    public boolean isUseExoPlayer() {
        return this.f60202o;
    }

    @Override // com.my.target.nativeads.IAd
    public void load() {
        if (isLoadCalled()) {
            gb.a("NativeAd: Doesn't support multiple load");
            this.f59399a.a().a(0, 1);
            a((o7) null, m.f60115t);
        } else {
            o oVarA = o.a(this.f59402d, this.f59399a.i(), 1, j6.f59959a);
            this.f59399a.a(oVarA);
            oVarA.b(0, 0);
            i7.a(this.f60193f, this.f59399a, this.f59400b).a(new a(this)).a(this.f59400b.a(), this.f60192e);
        }
    }

    @Override // com.my.target.nativeads.IAd
    public void loadFromBid(@NonNull String str) {
        this.f59399a.b(str);
        load();
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder) {
        registerView(nativeAdViewBinder, (List<View>) null);
    }

    public void setAdChoicesListener(@Nullable NativeAdChoicesListener nativeAdChoicesListener) {
        this.f60197j = nativeAdChoicesListener;
    }

    public void setAdChoicesOptionListener(@Nullable NativeAdChoicesOptionListener nativeAdChoicesOptionListener) {
        this.f60199l = nativeAdChoicesOptionListener;
    }

    @Override // com.my.target.nativeads.IAd
    public void setAdChoicesPlacement(int i10) {
        this.f60201n = i10;
    }

    @Override // com.my.target.nativeads.IAd
    public void setCachePolicy(int i10) {
        this.f59399a.b(i10);
    }

    public void setInternalObject(@NonNull Object obj) {
        if (!c0.a(this.f60192e)) {
            gb.b("You can't use 'setInternalObject' method. It's for internal partners only.");
            return;
        }
        if (!(obj instanceof ExternalClickHandler)) {
            gb.b("'setInternalObject' method error. Wrong object type.");
            return;
        }
        ExternalClickHandler externalClickHandler = (ExternalClickHandler) obj;
        this.f60200m = externalClickHandler;
        t2 t2Var = this.f60195h;
        if (t2Var == null) {
            return;
        }
        t2Var.a(externalClickHandler);
    }

    public void setListener(@Nullable NativeAdListener nativeAdListener) {
        this.f60196i = nativeAdListener;
    }

    public void setMediaListener(@Nullable NativeAdMediaListener nativeAdMediaListener) {
        this.f60198k = nativeAdMediaListener;
        t2 t2Var = this.f60195h;
        if (t2Var != null) {
            t2Var.a(nativeAdMediaListener);
        }
    }

    public void setMediationEnabled(boolean z10) {
        this.f59399a.a(z10);
    }

    @Override // com.my.target.nativeads.IAd
    public void unregisterView() {
        k7.a(this);
        t2 t2Var = this.f60195h;
        if (t2Var != null) {
            t2Var.unregisterView();
        }
    }

    public void useExoPlayer(boolean z10) {
        this.f60202o = z10;
        if (z10) {
            return;
        }
        ba.g();
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder, @Nullable List<View> list) {
        k7.a(nativeAdViewBinder.getRootAdView(), this);
        t2 t2Var = this.f60195h;
        if (t2Var != null) {
            t2Var.registerView(nativeAdViewBinder, list, this.f60201n);
        }
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdView nativeAdView) {
        registerView(nativeAdView.getNativeAdViewBinder(), (List<View>) null);
    }

    @Override // com.my.target.nativeads.INativeAd
    public void registerView(@NonNull NativeAdView nativeAdView, @Nullable List<View> list) {
        registerView(nativeAdView.getNativeAdViewBinder(), list);
    }

    public void a(View view, List list, MediaAdView mediaAdView) {
        k7.a(view, this);
        t2 t2Var = this.f60195h;
        if (t2Var != null) {
            t2Var.a(view, list, this.f60201n, mediaAdView);
        }
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list) {
        k7.a(view, this);
        t2 t2Var = this.f60195h;
        if (t2Var != null) {
            t2Var.a(view, list, this.f60201n, null);
        }
    }

    public NativeAd(int i10, @Nullable MenuFactory menuFactory, @NonNull Context context) {
        this(i10, context);
        this.f60194g = menuFactory;
    }

    public void a(b7 b7Var) {
        h7 h7VarA = h7.a(this, b7Var, this.f60194g, this.f60192e);
        this.f60195h = h7VarA;
        h7VarA.a(this.f60200m);
    }

    @Override // com.my.target.nativeads.IAd
    @Deprecated
    public void registerView(@NonNull View view) {
        registerView(view, (List<View>) null);
    }

    public void a(o7 o7Var) {
        this.f59399a.a(o.a(this.f59402d, 1, j6.f59959a));
        i7.a(this.f60193f, o7Var, this.f59399a, this.f59400b).a(new a(this)).a(this.f59400b.a(), this.f60192e);
    }

    public final void a(o7 o7Var, IAdLoadingError iAdLoadingError) {
        NativeAdListener nativeAdListener = this.f60196i;
        if (nativeAdListener == null) {
            return;
        }
        if (o7Var == null) {
            if (iAdLoadingError == null) {
                iAdLoadingError = m.f60110o;
            }
            nativeAdListener.onNoAd(iAdLoadingError, this);
            return;
        }
        b7 b7VarD = o7Var.d();
        x5 x5VarB = o7Var.b();
        if (b7VarD != null) {
            h7 h7VarA = h7.a(this, b7VarD, this.f60194g, this.f60192e);
            this.f60195h = h7VarA;
            h7VarA.a(this.f60198k);
            this.f60195h.a(this.f60200m);
            if (this.f60195h.d() != null) {
                this.f60196i.onLoad(this.f60195h.d(), this);
                this.f59399a.a().b(0, 3);
                return;
            }
            return;
        }
        if (x5VarB != null) {
            b6 b6VarA = b6.a(this, x5VarB, this.f59399a, this.f59400b, this.f60194g);
            this.f60195h = b6VarA;
            b6VarA.b(this.f60192e);
            this.f59399a.a().b(0, 3);
            return;
        }
        NativeAdListener nativeAdListener2 = this.f60196i;
        if (iAdLoadingError == null) {
            iAdLoadingError = m.f60116u;
        }
        nativeAdListener2.onNoAd(iAdLoadingError, this);
    }
}
