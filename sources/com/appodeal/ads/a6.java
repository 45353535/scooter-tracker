package com.appodeal.ads;

import com.appodeal.ads.network.HttpClient;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a6 implements com.appodeal.ads.networking.b0, com.appodeal.ads.networking.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpClient.Method f11879a = HttpClient.Method.POST;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpClient.Proto f11880b = HttpClient.Proto.INSTANCE;

    public final HttpClient a() {
        return this.f11880b;
    }

    public abstract Object b(Continuation continuation);

    public final HttpClient.Method d() {
        return this.f11879a;
    }
}
