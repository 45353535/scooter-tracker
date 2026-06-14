package com.my.target.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.my.target.b7;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.menu.MenuFactory;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.gb;
import com.my.target.h6;
import com.my.target.i7;
import com.my.target.j6;
import com.my.target.l;
import com.my.target.m;
import com.my.target.o;
import com.my.target.o7;
import com.my.target.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class NativeBannerAdLoader extends BaseAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f60230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MenuFactory f60231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnLoad f60232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f60233h;

    public interface OnLoad {
        void onLoad(@NonNull List<NativeBannerAd> list);
    }

    public NativeBannerAdLoader(int i10, int i11, Context context, MenuFactory menuFactory) {
        super(i10, "nativebanner");
        int iMax = Math.max(i11, 1);
        if (iMax != i11) {
            gb.a("NativeBannerAdLoader: Invalid bannersCount < 1, bannersCount set to " + iMax);
        }
        this.f59399a.a(iMax);
        this.f59399a.a(false);
        this.f60230e = context.getApplicationContext();
        this.f60231f = menuFactory;
        gb.c("Native banner ad loader created. Version - " + MyTargetVersion.VERSION);
    }

    @NonNull
    public static NativeBannerAdLoader newLoader(int i10, int i11, @NonNull Context context) {
        return new NativeBannerAdLoader(i10, i11, context, null);
    }

    public int getCachePolicy() {
        return this.f59399a.f();
    }

    @NonNull
    @UiThread
    public NativeBannerAdLoader load() {
        o oVarA = o.a(this.f59402d, this.f59399a.i(), 0, j6.f59959a);
        this.f59399a.a(oVarA);
        oVarA.b(0, 0);
        h6 h6VarA = this.f59400b.a();
        final l lVarA = i7.a(new i7.b(), this.f59399a, this.f59400b);
        this.f60233h = lVarA;
        lVarA.a(new l.b() { // from class: o5.e
            @Override // com.my.target.l.b
            public final void a(t tVar, m mVar) {
                this.f96345a.a(lVarA, (o7) tVar, mVar);
            }
        }).a(h6VarA, this.f60230e);
        return this;
    }

    public void setCachePolicy(int i10) {
        this.f59399a.b(i10);
    }

    @NonNull
    @UiThread
    public NativeBannerAdLoader setOnLoad(@Nullable OnLoad onLoad) {
        this.f60232g = onLoad;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(l lVar, o7 o7Var, m mVar) {
        if (lVar == this.f60233h) {
            this.f60233h = null;
            a(o7Var, mVar);
        }
    }

    @NonNull
    public static NativeBannerAdLoader newLoader(int i10, int i11, @NonNull Context context, @NonNull MenuFactory menuFactory) {
        return new NativeBannerAdLoader(i10, i11, context, menuFactory);
    }

    private void a(o7 o7Var, IAdLoadingError iAdLoadingError) {
        if (this.f60232g == null) {
            return;
        }
        List<b7> listC = o7Var == null ? null : o7Var.c();
        if (listC != null && listC.size() >= 1) {
            ArrayList arrayList = new ArrayList();
            for (b7 b7Var : listC) {
                NativeBannerAd nativeBannerAd = new NativeBannerAd(this.f59399a.i(), this.f60231f, this.f60230e);
                nativeBannerAd.a(this.f59399a, b7Var);
                arrayList.add(nativeBannerAd);
            }
            this.f60232g.onLoad(arrayList);
            return;
        }
        this.f60232g.onLoad(new ArrayList());
    }
}
