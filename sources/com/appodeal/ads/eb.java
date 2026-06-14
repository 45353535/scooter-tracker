package com.appodeal.ads;

import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class eb extends ed implements com.appodeal.ads.networking.o, com.appodeal.ads.networking.n, com.appodeal.ads.networking.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.networking.cache.c f13282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z8 f13283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f13285f;

    public eb() {
        z8 requestBodyBuilder = new z8();
        com.appodeal.ads.networking.cache.c cacheProvider = new com.appodeal.ads.networking.cache.c(com.appodeal.ads.storage.e0.f14799b);
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        this.f13282c = cacheProvider;
        this.f13283d = requestBodyBuilder;
        this.f13284e = "init";
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0(4);
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        z0Var.b(com.appodeal.ads.networking.binders.s.f14083c.toArray(new com.appodeal.ads.networking.binders.s[0]));
        z0Var.a(com.appodeal.ads.networking.binders.s.f14086f);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14088h);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14091k);
        this.f13285f = (com.appodeal.ads.networking.binders.s[]) z0Var.d(new com.appodeal.ads.networking.binders.s[z0Var.c()]);
    }

    @Override // com.appodeal.ads.networking.d
    public final JSONObject a() {
        return this.f13282c.a();
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f13284e;
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f13285f;
    }

    @Override // com.appodeal.ads.networking.d
    public final void a(JSONObject jSONObject) {
        this.f13282c.a(jSONObject);
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) {
        z8 z8Var = this.f13283d;
        com.appodeal.ads.networking.binders.s[] sVarArr = this.f13285f;
        return z8Var.a((com.appodeal.ads.networking.binders.s[]) Arrays.copyOf(sVarArr, sVarArr.length), (kotlin.coroutines.jvm.internal.d) continuation);
    }
}
