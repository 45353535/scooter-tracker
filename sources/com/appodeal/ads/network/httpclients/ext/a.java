package com.appodeal.ads.network.httpclients.ext;

import com.appodeal.ads.network.HttpClient;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13969a;

    static {
        int[] iArr = new int[HttpClient.Method.values().length];
        try {
            iArr[HttpClient.Method.GET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HttpClient.Method.POST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HttpClient.Method.PUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HttpClient.Method.DELETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f13969a = iArr;
    }
}
