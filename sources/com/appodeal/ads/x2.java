package com.appodeal.ads;

import com.appodeal.ads.api.Stats;
import com.explorestack.protobuf.Struct;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class x2 implements n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f15225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f15229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f15236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f15239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f15240q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b3 f15243t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t3 f15224a = new t3();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f15241r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f15242s = new AtomicBoolean(false);

    public final Stats.b a() {
        Object objB;
        Stats.b.C0192b c0192bZ = Stats.b.Q().A(this.f15226c).v(this.f15229f).B(this.f15228e).F(this.f15239p).z(this.f15240q);
        b3 b3Var = this.f15243t;
        Stats.b.C0192b c0192bD = c0192bZ.D(b3Var != null ? b3Var.f13120b : null);
        t3 t3Var = this.f15224a;
        try {
            Result.Companion companion = Result.f93230c;
            String str = t3Var.f14860a;
            objB = Result.b(str != null ? t3.a(new JSONObject(str)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Struct struct = (Struct) (Result.i(objB) ? null : objB);
        if (struct != null) {
            c0192bD.x(struct);
        }
        Stats.b bVarBuild = c0192bD.build();
        Intrinsics.checkNotNullExpressionValue(bVarBuild, "build(...)");
        return bVarBuild;
    }

    public final void b(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        t3 t3Var = this.f15224a;
        t3Var.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        t3Var.f14860a = jsonString;
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getAdUnitName() {
        return this.f15234k;
    }

    @Override // com.appodeal.ads.AdUnit
    public final double getEcpm() {
        return this.f15229f;
    }

    @Override // com.appodeal.ads.AdUnit
    public final long getExpTime() {
        return this.f15230g;
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getId() {
        return this.f15226c;
    }

    @Override // com.appodeal.ads.AdUnit
    public final int getImpressionInterval() {
        return this.f15235l;
    }

    @Override // com.appodeal.ads.AdUnit
    public final JSONObject getJsonData() {
        return this.f15225b;
    }

    @Override // com.appodeal.ads.AdUnit
    public final int getLoadingTimeout() {
        return this.f15231h;
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getMediatorName() {
        return this.f15233j;
    }

    @Override // com.appodeal.ads.AdUnit
    public final b3 getRequestResult() {
        return this.f15243t;
    }

    @Override // com.appodeal.ads.AdUnit
    public final String getStatus() {
        return this.f15227d;
    }

    @Override // com.appodeal.ads.AdUnit
    public final boolean isAsync() {
        return this.f15232i;
    }

    @Override // com.appodeal.ads.AdUnit
    public final Boolean isMuted() {
        return this.f15236m;
    }

    @Override // com.appodeal.ads.AdUnit
    public final boolean isPrecache() {
        return this.f15228e;
    }

    @Override // com.appodeal.ads.AdUnit
    public final boolean shouldGetNetworkEcpm() {
        return this.f15238o;
    }

    @Override // com.appodeal.ads.AdUnit
    public final boolean shouldUseExactEcpm() {
        return this.f15237n;
    }
}
