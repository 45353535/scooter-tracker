package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;

/* JADX INFO: loaded from: classes12.dex */
public class DefaultNetworkResponseHandler implements NetworkResponseHandler<DefaultResponseParser.Response> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultResponseParser f78851a;

    public DefaultNetworkResponseHandler() {
        this(new DefaultResponseParser());
    }

    DefaultNetworkResponseHandler(DefaultResponseParser defaultResponseParser) {
        this.f78851a = defaultResponseParser;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    public DefaultResponseParser.Response handle(@NonNull ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f78851a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
