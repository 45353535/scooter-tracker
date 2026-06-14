package com.appodeal.ads.network.httpclients;

import com.appodeal.ads.network.AppodealEndpoint;
import com.appodeal.ads.network.AppodealEndpoints;
import com.appodeal.ads.network.Networking;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Networking {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f13964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppodealEndpoint f13967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f13968e;

    public b(Map headers, List encoders, List decoders) {
        AppodealEndpoints appodealEndpoint = AppodealEndpoints.INSTANCE;
        j rawRequestClient = new j();
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(encoders, "encoders");
        Intrinsics.checkNotNullParameter(decoders, "decoders");
        Intrinsics.checkNotNullParameter(appodealEndpoint, "appodealEndpoint");
        Intrinsics.checkNotNullParameter(rawRequestClient, "rawRequestClient");
        this.f13964a = headers;
        this.f13965b = encoders;
        this.f13966c = decoders;
        this.f13967d = appodealEndpoint;
        this.f13968e = rawRequestClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.appodeal.ads.network.Networking
    /* JADX INFO: renamed from: enqueue-tZkwj4A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4433enqueuetZkwj4A(com.appodeal.ads.network.HttpClient.Method r20, java.lang.String r21, byte[] r22, long r23, long r25, com.appodeal.ads.network.NetworkResponseHandler r27, boolean r28, java.lang.String r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.network.httpclients.b.mo4433enqueuetZkwj4A(com.appodeal.ads.network.HttpClient$Method, java.lang.String, byte[], long, long, com.appodeal.ads.network.NetworkResponseHandler, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.appodeal.ads.network.Networking
    public final String getHost() {
        return this.f13967d.getActiveEndpoint();
    }
}
