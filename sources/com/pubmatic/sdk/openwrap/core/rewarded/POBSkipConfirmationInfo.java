package com.pubmatic.sdk.openwrap.core.rewarded;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class POBSkipConfirmationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f62910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f62912d;

    public POBSkipConfirmationInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.f62909a = str;
        this.f62910b = str2;
        this.f62911c = str3;
        this.f62912d = str4;
    }

    @NonNull
    public String getCloseText() {
        return this.f62912d;
    }

    @NonNull
    public String getMessage() {
        return this.f62910b;
    }

    @NonNull
    public String getResumeText() {
        return this.f62911c;
    }

    @NonNull
    public String getTitle() {
        return this.f62909a;
    }
}
