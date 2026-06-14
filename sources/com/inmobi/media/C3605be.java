package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3605be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InMobiNativeImage f38269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f38271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f38273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaView f38275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f38276j;

    public C3605be(String str, String str2, InMobiNativeImage iconImage, String str3, JSONObject extras, String str4, Float f10, boolean z10, MediaView mediaView, View view) {
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f38267a = str;
        this.f38268b = str2;
        this.f38269c = iconImage;
        this.f38270d = str3;
        this.f38271e = extras;
        this.f38272f = str4;
        this.f38273g = f10;
        this.f38274h = z10;
        this.f38275i = mediaView;
        this.f38276j = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3605be)) {
            return false;
        }
        C3605be c3605be = (C3605be) obj;
        return Intrinsics.areEqual(this.f38267a, c3605be.f38267a) && Intrinsics.areEqual(this.f38268b, c3605be.f38268b) && Intrinsics.areEqual(this.f38269c, c3605be.f38269c) && Intrinsics.areEqual(this.f38270d, c3605be.f38270d) && Intrinsics.areEqual(this.f38271e, c3605be.f38271e) && Intrinsics.areEqual(this.f38272f, c3605be.f38272f) && Intrinsics.areEqual((Object) this.f38273g, (Object) c3605be.f38273g) && this.f38274h == c3605be.f38274h && Intrinsics.areEqual(this.f38275i, c3605be.f38275i) && Intrinsics.areEqual(this.f38276j, c3605be.f38276j);
    }

    public final int hashCode() {
        String str = this.f38267a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38268b;
        int iHashCode2 = (this.f38269c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f38270d;
        int iHashCode3 = (this.f38271e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f38272f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.f38273g;
        int iA = (androidx.compose.foundation.c.a(this.f38274h) + ((iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31)) * 31;
        MediaView mediaView = this.f38275i;
        int iHashCode5 = (iA + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f38276j;
        return iHashCode5 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "NativePubData(title=" + this.f38267a + ", description=" + this.f38268b + ", iconImage=" + this.f38269c + ", ctaText=" + this.f38270d + ", extras=" + this.f38271e + ", sponsored=" + this.f38272f + ", adRating=" + this.f38273g + ", isVideo=" + this.f38274h + ", mediaView=" + this.f38275i + ", adChoiceIcon=" + this.f38276j + ")";
    }
}
