package com.pubmatic.sdk.common.network;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class POBNetworkResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f62489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f62490b;

    public POBNetworkResult(@NonNull Map<String, String> map, long j10) {
        this.f62489a = map;
        this.f62490b = j10;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f62489a;
    }

    public long getNetworkTimeMs() {
        return this.f62490b;
    }

    @NonNull
    public String toString() {
        return "POBNetworkResult{ networkTimeMs=" + this.f62490b + '}';
    }
}
