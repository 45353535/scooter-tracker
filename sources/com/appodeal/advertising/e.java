package com.appodeal.advertising;

import com.appodeal.advertising.AdvertisingInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvertisingInfo.AdvertisingProfile f15336a;

    public e(AdvertisingInfo.AdvertisingProfile advertisingProfile) {
        Intrinsics.checkNotNullParameter(advertisingProfile, "advertisingProfile");
        this.f15336a = advertisingProfile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f15336a, ((e) obj).f15336a);
    }

    public final int hashCode() {
        return this.f15336a.hashCode();
    }

    public final String toString() {
        return "Initialized(advertisingProfile=" + this.f15336a + ")";
    }
}
