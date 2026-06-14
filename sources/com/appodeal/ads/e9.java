package com.appodeal.ads;

import com.appodeal.ads.network.retry.Retriable;
import com.appodeal.ads.network.retry.RetryProvider;
import java.util.Arrays;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e9 extends ed implements com.appodeal.ads.networking.a, com.appodeal.ads.networking.o, Retriable, com.appodeal.ads.networking.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RetryProvider f13276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.networking.cache.a f13277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8 f13278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f13280g;

    public e9() {
        z8 requestBodyBuilder = new z8();
        RetryProvider retryProvider = new RetryProvider(null, 1, null);
        com.appodeal.ads.networking.cache.a cacheProvider = new com.appodeal.ads.networking.cache.a(com.appodeal.ads.storage.e0.f14799b);
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(retryProvider, "retryProvider");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        this.f13276c = retryProvider;
        this.f13277d = cacheProvider;
        this.f13278e = requestBodyBuilder;
        this.f13279f = "config";
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0(3);
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        z0Var.b(SetsKt.minus((Set<? extends com.appodeal.ads.networking.binders.s>) com.appodeal.ads.networking.binders.s.f14083c, com.appodeal.ads.networking.binders.s.f14087g).toArray(new com.appodeal.ads.networking.binders.s[0]));
        z0Var.a(com.appodeal.ads.networking.binders.s.f14088h);
        z0Var.a(com.appodeal.ads.networking.binders.s.f14085e);
        this.f13280g = (com.appodeal.ads.networking.binders.s[]) z0Var.d(new com.appodeal.ads.networking.binders.s[z0Var.c()]);
    }

    @Override // com.appodeal.ads.networking.d
    public final JSONObject a() {
        return this.f13277d.a();
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f13279f;
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f13280g;
    }

    @Override // com.appodeal.ads.network.retry.Retriable
    public final boolean isRetryEnabled() {
        return this.f13276c.isRetryEnabled();
    }

    @Override // com.appodeal.ads.networking.d
    public final void a(JSONObject jSONObject) {
        this.f13277d.a(jSONObject);
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) {
        z8 z8Var = this.f13278e;
        com.appodeal.ads.networking.binders.s[] sVarArr = this.f13280g;
        return z8Var.a((com.appodeal.ads.networking.binders.s[]) Arrays.copyOf(sVarArr, sVarArr.length), (kotlin.coroutines.jvm.internal.d) continuation);
    }
}
