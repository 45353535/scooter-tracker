package com.appodeal.ads.network.httpclients.ext;

import com.appodeal.ads.network.HttpClient;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final String a(HttpClient.Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        int i10 = a.f13969a[method.ordinal()];
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "PUT";
        }
        if (i10 == 4) {
            return "DELETE";
        }
        throw new m();
    }
}
