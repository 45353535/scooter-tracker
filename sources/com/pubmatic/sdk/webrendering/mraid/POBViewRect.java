package com.pubmatic.sdk.webrendering.mraid;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class POBViewRect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f63380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f63381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f63382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f63383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f63384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f63385f;

    public POBViewRect(int i10, int i11, int i12, int i13, boolean z10, @Nullable String str) {
        this.f63382c = i10;
        this.f63383d = i11;
        this.f63384e = i12;
        this.f63385f = i13;
        this.f63380a = z10;
        this.f63381b = str;
    }

    public int getHeight() {
        return this.f63384e;
    }

    @Nullable
    public String getStatusMsg() {
        return this.f63381b;
    }

    public int getWidth() {
        return this.f63385f;
    }

    public int getxPosition() {
        return this.f63382c;
    }

    public int getyPosition() {
        return this.f63383d;
    }

    public boolean isStatus() {
        return this.f63380a;
    }

    public POBViewRect(boolean z10, @Nullable String str) {
        this.f63380a = z10;
        this.f63381b = str;
    }
}
