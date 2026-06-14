package com.appodeal.consent.networking;

import com.appodeal.ads.network.HttpClient;
import com.appodeal.ads.network.retry.Retriable;
import com.appodeal.ads.network.retry.RetryProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Retriable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RetryProvider f15479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HttpClient.Method f15480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HttpClient.File f15481f;

    public a(k bodyBuilder, String outputFilePath) {
        RetryProvider retryProvider = new RetryProvider(null, 1, null);
        Intrinsics.checkNotNullParameter("consent_manager/check", "path");
        Intrinsics.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
        Intrinsics.checkNotNullParameter(retryProvider, "retryProvider");
        this.f15476a = "consent_manager/check";
        this.f15477b = bodyBuilder;
        this.f15478c = outputFilePath;
        this.f15479d = retryProvider;
        this.f15480e = HttpClient.Method.POST;
        this.f15481f = HttpClient.File.INSTANCE;
    }

    public final k a() {
        return this.f15477b;
    }

    public final HttpClient.File b() {
        return this.f15481f;
    }

    public final HttpClient.Method c() {
        return this.f15480e;
    }

    public final String d() {
        return this.f15478c;
    }

    public final String e() {
        return this.f15476a;
    }

    @Override // com.appodeal.ads.network.retry.Retriable
    public final boolean isRetryEnabled() {
        return this.f15479d.isRetryEnabled();
    }
}
