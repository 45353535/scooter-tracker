package com.appodeal.ads.network.retry;

import com.appodeal.ads.network.AppodealEndpoint;
import com.appodeal.ads.network.AppodealEndpoints;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/network/retry/RetryProvider;", "Lcom/appodeal/ads/network/retry/Retriable;", "Lcom/appodeal/ads/network/AppodealEndpoint;", "appodealEndpoint", "<init>", "(Lcom/appodeal/ads/network/AppodealEndpoint;)V", "", "isRetryEnabled", "()Z", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RetryProvider implements Retriable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppodealEndpoint f13990a;

    public RetryProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.appodeal.ads.network.retry.Retriable
    public boolean isRetryEnabled() {
        return this.f13990a.hasNextEndpoint();
    }

    public RetryProvider(AppodealEndpoint appodealEndpoint) {
        Intrinsics.checkNotNullParameter(appodealEndpoint, "appodealEndpoint");
        this.f13990a = appodealEndpoint;
    }

    public /* synthetic */ RetryProvider(AppodealEndpoint appodealEndpoint, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AppodealEndpoints.INSTANCE : appodealEndpoint);
    }
}
