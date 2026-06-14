package com.moloco.sdk.acm.http;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ie.c f54069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f54070c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f54068a = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Lazy f54071d = lf.i.a(new Function0() { // from class: com.moloco.sdk.acm.http.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.c();
        }
    });

    public static final k c() {
        ie.c cVar = f54069b;
        String str = null;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("httpClient");
            cVar = null;
        }
        String str2 = f54070c;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apiUrl");
        } else {
            str = str2;
        }
        return new k(cVar, str);
    }

    public final i a() {
        return (i) f54071d.getValue();
    }

    public final void b(ie.c httpClient, String apiUrl) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        if (f54069b == null) {
            f54069b = httpClient;
            f54070c = apiUrl;
        }
    }
}
