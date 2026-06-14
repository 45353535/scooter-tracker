package com.my.tracker;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTrackerAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f61201a;

    private MyTrackerAttribution(String str) {
        this.f61201a = str;
    }

    @NonNull
    public static MyTrackerAttribution newAttribution(@NonNull String str) {
        return new MyTrackerAttribution(str);
    }

    @NonNull
    public String getDeeplink() {
        return this.f61201a;
    }
}
