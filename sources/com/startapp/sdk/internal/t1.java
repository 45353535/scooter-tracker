package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t1 extends com.startapp.sdk.adsbase.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f65286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f65287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.startapp.sdk.adsbase.model.a f65288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f65289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f65290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb f65291p;

    public t1(Context context, o8 o8Var, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, boolean z10) {
        super(context, o8Var, adPreferences, adEventListener, placement, lbVar, lbVar2, lbVar3, lbVar4);
        this.f65286k = new HashSet();
        this.f65287l = new HashSet();
        this.f65289n = 0;
        this.f65291p = lbVar5;
        this.f65290o = z10;
    }

    public final /* synthetic */ Void a(Throwable th2) {
        this.f64019f = th2 != null ? th2.getMessage() : null;
        return null;
    }

    public boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        return aVar != null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a aVarC = c();
        this.f65288m = aVarC;
        if (!b(aVarC)) {
            return null;
        }
        if (this.f65286k.size() == 0) {
            this.f65286k.add(this.f64014a.getPackageName());
        }
        com.startapp.sdk.adsbase.model.a aVar = this.f65288m;
        aVar.H0 = this.f65286k;
        aVar.J0 = this.f65287l;
        if (this.f65289n > 0) {
            aVar.L0 = false;
            if (MetaData.E().W().a(this.f64014a)) {
                com.startapp.sdk.adsbase.g.e(this.f64014a);
            }
        }
        p8 p8Var = new p8((q8) this.f64020g.a(), this.f65288m.a(i0.a(AdsConstants$AdApiType.HTML, this.f64018e)));
        p8Var.f65094e = new i7() { // from class: com.startapp.sdk.internal.an
            @Override // com.startapp.sdk.internal.i7
            public final Object a(Object obj) {
                return this.f64302b.a((Throwable) obj);
            }
        };
        new i7() { // from class: com.startapp.sdk.internal.bn
            @Override // com.startapp.sdk.internal.i7
            public final Object a(Object obj) {
                return this.f64326b.a((p8) obj);
            }
        }.a(p8Var);
        q8 q8Var = (q8) this.f64020g.a();
        p8Var.f65093d = ((HttpClientConfig) q8Var.f65149f.a()).a(this.f65288m.Z);
        return p8Var.a();
    }

    public final Void a(p8 p8Var) {
        y6 y6Var = (y6) this.f64022i.a();
        WeakHashMap weakHashMap = vi.f65408a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public boolean a(Object obj) {
        Ad.AdType adType;
        if (obj == null) {
            if (this.f64019f == null) {
                this.f64019f = "No response";
            }
            return false;
        }
        if (!(obj instanceof t8)) {
            if (this.f64019f == null) {
                this.f64019f = "Unknown error";
            }
            return false;
        }
        t8 t8Var = (t8) obj;
        String str = t8Var.f65299b;
        try {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                if (this.f64019f == null) {
                    com.startapp.sdk.adsbase.model.a aVar = this.f65288m;
                    if (aVar != null && ((adType = aVar.U0) == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO)) {
                        this.f64019f = "Video isn't available";
                    } else {
                        this.f64019f = "Empty Ad";
                    }
                }
                return false;
            }
            boolean z10 = AdsCommonMetaData.k().G() && u0.a(this.f64014a, u0.a(str, this.f65289n), this.f65289n, this.f65286k, arrayList).booleanValue();
            if (z10) {
                Context context = this.f64014a;
                ((Executor) com.startapp.sdk.components.a.a(context).A.a()).execute(new t0(context, arrayList).f65285c);
            } else {
                o8 o8Var = (o8) this.f64015b;
                o8Var.getClass();
                o8Var.setRequestUrl(t8Var.f65298a);
                o8Var.d(str);
            }
            if (!z10) {
                return true;
            }
            this.f65289n++;
            return b();
        } catch (Throwable th2) {
            g9.a(th2);
            return false;
        }
    }

    public final void e(boolean z10) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f64015b.hashCode());
        intent.putExtra("adResult", z10);
        zb.a(this.f64014a).a(intent);
        if (z10) {
            if (this.f65290o) {
                ((z6) ((y6) this.f64022i.a())).c(this, ii.f64716u);
                ((rk) this.f65291p.a()).a(((o8) this.f64015b).a(), new s1(this, this));
                return;
            }
            Context context = this.f64014a;
            AdEventListener adEventListener = this.f64017d;
            this.f64017d = null;
            a0.b(context, adEventListener, this.f64015b, false);
            return;
        }
        Context context2 = this.f64014a;
        AdEventListener adEventListener2 = this.f64017d;
        this.f64017d = null;
        a0.a(context2, adEventListener2, this.f64015b, false);
    }
}
