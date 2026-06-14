package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u1 extends com.startapp.sdk.adsbase.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f65328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f65329l;

    public u1(Context context, gb gbVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4) {
        super(context, gbVar, adPreferences, adEventListener, placement, lbVar, lbVar2, lbVar3, lbVar4);
        this.f65328k = 0;
        this.f65329l = new HashSet();
    }

    public final /* synthetic */ Void a(Throwable th2) {
        this.f64019f = th2 != null ? th2.getMessage() : null;
        return null;
    }

    public abstract void a(Ad ad2);

    @Override // com.startapp.sdk.adsbase.c
    /* JADX INFO: renamed from: c */
    public final void b(boolean z10) {
        super.b(z10);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f64015b.hashCode());
        intent.putExtra("adResult", z10);
        zb.a(this.f64014a).a(intent);
        if (z10) {
            a(this.f64015b);
            Context context = this.f64014a;
            AdEventListener adEventListener = this.f64017d;
            this.f64017d = null;
            a0.b(context, adEventListener, this.f64015b, false);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a aVarC = c();
        if (aVarC == null) {
            return null;
        }
        if (this.f65329l.size() == 0) {
            this.f65329l.add(this.f64014a.getPackageName());
        }
        int i10 = this.f65328k;
        if (i10 > 0) {
            aVarC.L0 = false;
        }
        aVarC.H0 = this.f65329l;
        aVarC.L0 = i10 == 0;
        p8 p8Var = new p8((q8) this.f64020g.a(), aVarC.a(i0.a(AdsConstants$AdApiType.JSON, this.f64018e)));
        p8Var.f65094e = new i7() { // from class: com.startapp.sdk.internal.cn
            @Override // com.startapp.sdk.internal.i7
            public final Object a(Object obj) {
                return this.f64389b.a((Throwable) obj);
            }
        };
        new i7() { // from class: com.startapp.sdk.internal.dn
            @Override // com.startapp.sdk.internal.i7
            public final Object a(Object obj) {
                return this.f64442b.a((p8) obj);
            }
        }.a(p8Var);
        p8Var.f65093d = ((HttpClientConfig) ((q8) this.f64020g.a()).f65149f.a()).a(aVarC.Z);
        t8 t8VarA = p8Var.a();
        if (t8VarA != null) {
            try {
                return JsonParser.fromJson(t8VarA.f65299b, GetAdResponse.class);
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        return null;
    }

    public final Void a(p8 p8Var) {
        y6 y6Var = (y6) this.f64022i.a();
        WeakHashMap weakHashMap = vi.f65408a;
        p8Var.getClass();
        ((z6) y6Var).a(this, p8Var);
        return null;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        int i10;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z10 = false;
        if (obj == null) {
            this.f64019f = "Empty Response";
            return false;
        }
        if (!getAdResponse.b()) {
            this.f64019f = getAdResponse.a();
            return false;
        }
        gb gbVar = (gb) this.f64015b;
        ArrayList arrayListA = u0.a(this.f64014a, getAdResponse.d(), this.f65328k, this.f65329l, true);
        gbVar.a(arrayListA);
        gbVar.setAdInfoOverride(getAdResponse.c());
        if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
            z10 = true;
        }
        if (!z10) {
            this.f64019f = "Empty Response";
            return z10;
        }
        if (arrayListA.size() != 0 || (i10 = this.f65328k) != 0) {
            return z10;
        }
        this.f65328k = i10 + 1;
        return b();
    }
}
