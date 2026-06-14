package com.appodeal.ads.nativead.downloader;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13867a;

    public k(String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        this.f13867a = imagePath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.areEqual(this.f13867a, ((k) obj).f13867a);
    }

    public final int hashCode() {
        return this.f13867a.hashCode();
    }

    public final String toString() {
        return "Path(imagePath=" + this.f13867a + ")";
    }
}
