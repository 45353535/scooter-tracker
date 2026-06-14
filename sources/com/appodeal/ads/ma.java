package com.appodeal.ads;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ma extends ed implements com.appodeal.ads.networking.c, com.appodeal.ads.networking.o, com.appodeal.ads.networking.n, com.appodeal.ads.networking.d, com.appodeal.ads.networking.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.networking.cache.b f13648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k6 f13649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final te f13650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xe f13651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f13652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f13654i;

    public ma(te adRequest, xe adRequestParams, l0 adTypeController) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(adTypeController, "adTypeController");
        String str = adRequestParams.f15263d;
        Intrinsics.checkNotNullExpressionValue(str, "getRequestPath(...)");
        this.f13648c = new com.appodeal.ads.networking.cache.b(str, com.appodeal.ads.storage.e0.f14799b);
        this.f13649d = new k6(adRequestParams);
        this.f13650e = adRequest;
        this.f13651f = adRequestParams;
        this.f13652g = adTypeController;
        this.f13653h = "get";
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0(5);
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        z0Var.b(com.appodeal.ads.networking.binders.s.f14083c.toArray(new com.appodeal.ads.networking.binders.s[0]));
        z0Var.a(com.appodeal.ads.networking.binders.s.f14084d);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14088h);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14086f);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14089i);
        this.f13654i = (com.appodeal.ads.networking.binders.s[]) z0Var.d(new com.appodeal.ads.networking.binders.s[z0Var.c()]);
    }

    @Override // com.appodeal.ads.networking.d
    public final JSONObject a() {
        return this.f13648c.a();
    }

    @Override // com.appodeal.ads.networking.b
    public final String b() {
        return (String) this.f13649d.f13544a.getValue();
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f13653h;
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f13654i;
    }

    @Override // com.appodeal.ads.networking.d
    public final void a(JSONObject jSONObject) {
        this.f13648c.a(jSONObject);
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) {
        z8 z8Var = new z8();
        te adRequest = this.f13650e;
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        z8Var.f15310c = adRequest;
        xe adRequestParams = this.f13651f;
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        z8Var.f15312e = adRequestParams;
        l0 adTypeController = this.f13652g;
        Intrinsics.checkNotNullParameter(adTypeController, "adTypeController");
        z8Var.f15313f = adTypeController;
        com.appodeal.ads.networking.binders.s[] sVarArr = this.f13654i;
        return z8Var.a((com.appodeal.ads.networking.binders.s[]) Arrays.copyOf(sVarArr, sVarArr.length), (kotlin.coroutines.jvm.internal.d) continuation);
    }
}
