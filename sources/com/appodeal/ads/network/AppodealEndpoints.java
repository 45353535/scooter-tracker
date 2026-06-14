package com.appodeal.ads.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/network/AppodealEndpoints;", "Lcom/appodeal/ads/network/AppodealEndpoint;", "", "defaultBaseUrl", "Lcom/appodeal/ads/network/IndexProvider;", "indexProvider", "", "init", "(Ljava/lang/String;Lcom/appodeal/ads/network/IndexProvider;)V", "", "hasNextEndpoint", "()Z", "notifySuccessEndpoint", "()V", "getActiveEndpoint", "()Ljava/lang/String;", "activeEndpoint", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppodealEndpoints implements AppodealEndpoint {
    public static final AppodealEndpoints INSTANCE = new AppodealEndpoints();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.network.endpoint.a f13900a = new com.appodeal.ads.network.endpoint.a();

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public String getActiveEndpoint() {
        return this.f13900a.getActiveEndpoint();
    }

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public boolean hasNextEndpoint() {
        return this.f13900a.hasNextEndpoint();
    }

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public void init(String defaultBaseUrl, IndexProvider indexProvider) {
        Intrinsics.checkNotNullParameter(defaultBaseUrl, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(indexProvider, "indexProvider");
        this.f13900a.init(defaultBaseUrl, indexProvider);
    }

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public void notifySuccessEndpoint() {
        this.f13900a.f13954c.saveIndex();
    }
}
