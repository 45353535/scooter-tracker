package com.my.target.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ba;
import com.my.target.common.BaseAd;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.gb;
import com.my.target.h6;
import com.my.target.i4;
import com.my.target.m;
import com.my.target.s2;
import com.my.target.t4;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseInterstitialAd extends BaseAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f59180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s2 f59181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h6 f59183h;

    public BaseInterstitialAd(int i10, @NonNull String str, @NonNull Context context) {
        super(i10, str);
        this.f59182g = true;
        this.f59180e = context;
    }

    public void a(t4 t4Var, IAdLoadingError iAdLoadingError) {
    }

    public void b() {
        this.f59183h = this.f59400b.b();
    }

    public void destroy() {
        s2 s2Var = this.f59181f;
        if (s2Var != null) {
            s2Var.destroy();
            this.f59181f = null;
        }
    }

    public void dismiss() {
        s2 s2Var = this.f59181f;
        if (s2Var != null) {
            s2Var.dismiss();
        }
    }

    @Nullable
    public String getAdSource() {
        s2 s2Var = this.f59181f;
        if (s2Var != null) {
            return s2Var.a();
        }
        return null;
    }

    public float getAdSourcePriority() {
        s2 s2Var = this.f59181f;
        if (s2Var != null) {
            return s2Var.b();
        }
        return 0.0f;
    }

    public boolean isMediationEnabled() {
        return this.f59399a.k();
    }

    public boolean isUseExoPlayer() {
        return this.f59182g;
    }

    public final void load() {
        if (isLoadCalled()) {
            gb.a("BaseInterstitialAd: Interstitial/Rewarded doesn't support multiple load");
            a(null, m.f60115t);
        } else {
            i4.a(this.f59399a, this.f59400b).a(new a(this)).a(this.f59400b.a(), this.f59180e);
        }
    }

    public void loadFromBid(@NonNull String str) {
        this.f59399a.b(str);
        load();
    }

    public void setMediationEnabled(boolean z10) {
        this.f59399a.a(z10);
    }

    public void show() {
        show(null);
    }

    public void useExoPlayer(boolean z10) {
        this.f59182g = z10;
        if (z10) {
            return;
        }
        ba.g();
    }

    public final void a(t4 t4Var) {
        i4.a(t4Var, this.f59399a, this.f59400b).a(new a(this)).a(this.f59400b.a(), this.f59180e);
    }

    public void show(@Nullable Context context) {
        s2 s2Var = this.f59181f;
        if (s2Var == null) {
            gb.c("Base interstitial ad show - no ad");
            return;
        }
        if (context == null) {
            context = this.f59180e;
        }
        s2Var.a(context);
    }

    public void a() {
        h6 h6Var = this.f59183h;
        if (h6Var == null) {
            return;
        }
        h6Var.b();
        this.f59183h.b(this.f59180e);
    }
}
