package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes9.dex */
public class BuildIdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31982c;

    public BuildIdInfo(String str, String str2, String str3) {
        this.f31980a = str;
        this.f31981b = str2;
        this.f31982c = str3;
    }

    public String getArch() {
        return this.f31981b;
    }

    public String getBuildId() {
        return this.f31982c;
    }

    public String getLibraryName() {
        return this.f31980a;
    }
}
