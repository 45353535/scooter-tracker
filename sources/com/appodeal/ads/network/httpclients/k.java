package com.appodeal.ads.network.httpclients;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f13984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13986c;

    public k(Map headers, byte[] bytes, String str) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f13984a = headers;
        this.f13985b = bytes;
        this.f13986c = str;
    }

    public final byte[] a() {
        return this.f13985b;
    }

    public final String b() {
        return this.f13986c;
    }

    public final Map c() {
        return this.f13984a;
    }
}
