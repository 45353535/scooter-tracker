package com.appodeal.ads.network;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/network/AppodealEndpoint;", "", "activeEndpoint", "", "getActiveEndpoint", "()Ljava/lang/String;", "init", "", "defaultBaseUrl", "indexProvider", "Lcom/appodeal/ads/network/IndexProvider;", "hasNextEndpoint", "", "notifySuccessEndpoint", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppodealEndpoint {
    String getActiveEndpoint();

    boolean hasNextEndpoint();

    void init(String defaultBaseUrl, IndexProvider indexProvider);

    void notifySuccessEndpoint();
}
