package com.appodeal.ads;

import com.appodeal.ads.network.HttpClient;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ed implements com.appodeal.ads.networking.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpClient.Method f13287a = HttpClient.Method.POST;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpClient.ZipBase64 f13288b = HttpClient.ZipBase64.INSTANCE;

    public abstract Object a(Continuation continuation);

    public abstract com.appodeal.ads.networking.binders.s[] d();

    public final HttpClient e() {
        return this.f13288b;
    }

    public final HttpClient.Method f() {
        return this.f13287a;
    }
}
