package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InlineParams f37904e;

    public Va(boolean z10, String landingScheme, boolean z11, boolean z12, InlineParams inlineParams) {
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f37900a = z10;
        this.f37901b = landingScheme;
        this.f37902c = z11;
        this.f37903d = z12;
        this.f37904e = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Va)) {
            return false;
        }
        Va va2 = (Va) obj;
        return this.f37900a == va2.f37900a && Intrinsics.areEqual(this.f37901b, va2.f37901b) && this.f37902c == va2.f37902c && this.f37903d == va2.f37903d && Intrinsics.areEqual(this.f37904e, va2.f37904e);
    }

    public final int hashCode() {
        int iA = (androidx.compose.foundation.c.a(this.f37903d) + ((androidx.compose.foundation.c.a(this.f37902c) + ((this.f37901b.hashCode() + (androidx.compose.foundation.c.a(this.f37900a) * 31)) * 31)) * 31)) * 31;
        InlineParams inlineParams = this.f37904e;
        return iA + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f37900a + ", landingScheme=" + this.f37901b + ", isCCTEnabled=" + this.f37902c + ", isPartialTabsEnabled=" + this.f37903d + ", inlineParams=" + this.f37904e + ")";
    }

    public /* synthetic */ Va(boolean z10, String str, boolean z11, int i10) {
        this(z10, (i10 & 2) != 0 ? "DEFAULT" : str, z11, false, null);
    }
}
