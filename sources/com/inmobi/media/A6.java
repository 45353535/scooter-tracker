package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class A6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaView f36551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3840kl f36552b;

    public A6(MediaView mediaView, C3840kl c3840kl) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f36551a = mediaView;
        this.f36552b = c3840kl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A6)) {
            return false;
        }
        A6 a62 = (A6) obj;
        return Intrinsics.areEqual(this.f36551a, a62.f36551a) && Intrinsics.areEqual(this.f36552b, a62.f36552b);
    }

    public final int hashCode() {
        int iHashCode = this.f36551a.hashCode() * 31;
        C3840kl c3840kl = this.f36552b;
        return iHashCode + (c3840kl == null ? 0 : c3840kl.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.f36551a + ", vastBeaconData=" + this.f36552b + ")";
    }
}
