package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DtbConstants;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes11.dex */
public class POBAdSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62208b;
    public static final POBAdSize BANNER_SIZE_320x50 = new POBAdSize(320, 50);
    public static final POBAdSize BANNER_SIZE_320x100 = new POBAdSize(320, 100);
    public static final POBAdSize BANNER_SIZE_300x250 = new POBAdSize(300, 250);
    public static final POBAdSize BANNER_SIZE_300x300 = new POBAdSize(300, 300);
    public static final POBAdSize BANNER_SIZE_250x250 = new POBAdSize(250, 250);
    public static final POBAdSize BANNER_SIZE_468x60 = new POBAdSize(468, 60);
    public static final POBAdSize BANNER_SIZE_728x90 = new POBAdSize(728, 90);
    public static final POBAdSize BANNER_SIZE_120x600 = new POBAdSize(120, 600);
    public static final POBAdSize INTERSTITIAL_320x480 = new POBAdSize(320, DtbConstants.DEFAULT_PLAYER_HEIGHT);
    public static final POBAdSize INTERSTITIAL_480x320 = new POBAdSize(DtbConstants.DEFAULT_PLAYER_HEIGHT, 320);
    public static final POBAdSize INTERSTITIAL_768x1024 = new POBAdSize(ViewUtils.EDGE_TO_EDGE_FLAGS, 1024);
    public static final POBAdSize INTERSTITIAL_1024x768 = new POBAdSize(1024, ViewUtils.EDGE_TO_EDGE_FLAGS);

    public POBAdSize(int i10, int i11) {
        this();
        this.f62207a = i10;
        this.f62208b = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof POBAdSize)) {
            return false;
        }
        POBAdSize pOBAdSize = (POBAdSize) obj;
        return this.f62207a == pOBAdSize.f62207a && this.f62208b == pOBAdSize.f62208b;
    }

    public int getAdHeight() {
        return this.f62208b;
    }

    public int getAdWidth() {
        return this.f62207a;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isMREC() {
        return equals(BANNER_SIZE_300x250) || equals(BANNER_SIZE_300x300) || equals(BANNER_SIZE_250x250);
    }

    @NonNull
    public String toString() {
        return this.f62207a + "x" + this.f62208b;
    }

    private POBAdSize() {
    }
}
