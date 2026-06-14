package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiNativeViewData f37729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f37730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f37731c;

    public Sg(InMobiNativeViewData pubView, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(pubView, "pubView");
        this.f37729a = pubView;
        this.f37730b = mediaView;
        this.f37731c = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sg)) {
            return false;
        }
        Sg sg2 = (Sg) obj;
        return Intrinsics.areEqual(this.f37729a, sg2.f37729a) && Intrinsics.areEqual(this.f37730b, sg2.f37730b) && Intrinsics.areEqual(this.f37731c, sg2.f37731c);
    }

    public final int hashCode() {
        int iHashCode = this.f37729a.hashCode() * 31;
        MediaView mediaView = this.f37730b;
        int iHashCode2 = (iHashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f37731c;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.f37729a + ", mediaView=" + this.f37730b + ", adChoice=" + this.f37731c + ")";
    }
}
