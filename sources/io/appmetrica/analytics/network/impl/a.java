package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f78801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f78801a = httpsURLConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f78801a.getInputStream();
    }
}
