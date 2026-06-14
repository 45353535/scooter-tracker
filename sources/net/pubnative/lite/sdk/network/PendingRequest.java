package net.pubnative.lite.sdk.network;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PendingRequest {
    private final Map<String, String> headers;
    private final int maxRetries;
    private final int multiplier;
    private final String postBody;
    private final String url;
    private int retryCount = 1;
    private int offset = 0;

    public PendingRequest(String str, String str2, Map<String, String> map, int i10, int i11) {
        this.url = str;
        this.headers = map;
        this.postBody = str2;
        this.maxRetries = i10;
        this.multiplier = i11;
    }

    public synchronized void countAttempt() {
        this.offset--;
    }

    public synchronized void countRetry() {
        int i10 = this.multiplier;
        int i11 = this.retryCount;
        this.offset = i10 * i11;
        this.retryCount = i11 + 1;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getPostBody() {
        return this.postBody;
    }

    public String getUrl() {
        return this.url;
    }

    public synchronized boolean isLimitReached() {
        return this.retryCount > this.maxRetries;
    }

    public synchronized boolean shouldRetry() {
        return this.offset <= 0;
    }
}
