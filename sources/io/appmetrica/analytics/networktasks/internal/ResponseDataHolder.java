package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ResponseDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f78887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f78888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f78889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f78890d;

    public ResponseDataHolder(@NonNull ResponseValidityChecker responseValidityChecker) {
        this.f78890d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f78887a;
    }

    @Nullable
    public byte[] getResponseData() {
        return this.f78888b;
    }

    @Nullable
    public Map<String, List<String>> getResponseHeaders() {
        return this.f78889c;
    }

    public boolean isValidResponse() {
        return this.f78890d.isResponseValid(this.f78887a);
    }

    public void setResponseCode(int i10) {
        this.f78887a = i10;
    }

    public void setResponseData(@Nullable byte[] bArr) {
        this.f78888b = bArr;
    }

    public void setResponseHeaders(@Nullable Map<String, List<String>> map) {
        this.f78889c = map;
    }
}
