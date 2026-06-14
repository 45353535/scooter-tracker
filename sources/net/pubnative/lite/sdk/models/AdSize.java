package net.pubnative.lite.sdk.models;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.device.ads.DtbConstants;
import com.google.android.material.internal.ViewUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum AdSize {
    SIZE_320x50(320, 50, "s"),
    SIZE_300x250(300, 250, "m"),
    SIZE_300x50(300, 50, "s"),
    SIZE_320x480(320, DtbConstants.DEFAULT_PLAYER_HEIGHT, CmcdData.Factory.STREAM_TYPE_LIVE),
    SIZE_1024x768(1024, ViewUtils.EDGE_TO_EDGE_FLAGS, CmcdData.Factory.STREAM_TYPE_LIVE),
    SIZE_768x1024(ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, CmcdData.Factory.STREAM_TYPE_LIVE),
    SIZE_728x90(728, 90, "s"),
    SIZE_160x600(160, 600, "m"),
    SIZE_250x250(250, 250, "m"),
    SIZE_300x600(300, 600, CmcdData.Factory.STREAM_TYPE_LIVE),
    SIZE_320x100(320, 100, "s"),
    SIZE_480x320(DtbConstants.DEFAULT_PLAYER_HEIGHT, 320, CmcdData.Factory.STREAM_TYPE_LIVE),
    SIZE_INTERSTITIAL(0, 0, CmcdData.Factory.STREAM_TYPE_LIVE);

    private final String adLayoutSize;
    private final int height;
    private final int width;

    AdSize(int i10, int i11, String str) {
        this.width = i10;
        this.height = i11;
        this.adLayoutSize = str;
    }

    public String getAdLayoutSize() {
        return this.adLayoutSize;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.format(Locale.ENGLISH, "(%d x %d)", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }
}
