package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f78802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f78802a = httpsURLConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f78802a.getErrorStream();
    }
}
