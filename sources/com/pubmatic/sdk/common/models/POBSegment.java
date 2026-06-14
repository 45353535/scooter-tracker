package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class POBSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62416c;

    public POBSegment(@NonNull String str) {
        this.f62414a = str;
    }

    @Nullable
    public String getName() {
        return this.f62415b;
    }

    @NonNull
    public String getSegId() {
        return this.f62414a;
    }

    @Nullable
    public String getValue() {
        return this.f62416c;
    }

    public void setValue(@NonNull String str) {
        this.f62416c = str;
    }

    public POBSegment(@NonNull String str, @NonNull String str2) {
        this.f62414a = str;
        this.f62415b = str2;
    }
}
