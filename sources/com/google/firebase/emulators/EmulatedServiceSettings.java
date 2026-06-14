package com.google.firebase.emulators;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class EmulatedServiceSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32752b;

    public EmulatedServiceSettings(@NonNull String str, int i10) {
        this.f32751a = str;
        this.f32752b = i10;
    }

    public String getHost() {
        return this.f32751a;
    }

    public int getPort() {
        return this.f32752b;
    }
}
