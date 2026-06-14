package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class ApiException extends Exception {

    @NonNull
    @Deprecated
    protected final Status mStatus;

    public ApiException(@NonNull Status status) {
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(statusCode).length() + 2 + String.valueOf(statusMessage).length());
        sb2.append(statusCode);
        sb2.append(": ");
        sb2.append(statusMessage);
        super(sb2.toString());
        this.mStatus = status;
    }

    @NonNull
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Nullable
    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
