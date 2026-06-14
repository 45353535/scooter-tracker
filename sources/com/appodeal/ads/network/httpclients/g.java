package com.appodeal.ads.network.httpclients;

import com.appodeal.ads.network.HttpClient;
import com.appodeal.ads.network.NetworkResponseHandler;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpClient.Method f13973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NetworkResponseHandler f13979g;

    public g(HttpClient.Method method, Map headers, String url, byte[] encodeBody, long j10, long j11, NetworkResponseHandler responseHandler) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(encodeBody, "encodeBody");
        Intrinsics.checkNotNullParameter(responseHandler, "responseHandler");
        this.f13973a = method;
        this.f13974b = headers;
        this.f13975c = url;
        this.f13976d = encodeBody;
        this.f13977e = j10;
        this.f13978f = j11;
        this.f13979g = responseHandler;
    }

    public final long a() {
        return this.f13977e;
    }

    public final byte[] b() {
        return this.f13976d;
    }

    public final Map c() {
        return this.f13974b;
    }

    public final HttpClient.Method d() {
        return this.f13973a;
    }

    public final long e() {
        return this.f13978f;
    }

    public final NetworkResponseHandler f() {
        return this.f13979g;
    }
}
