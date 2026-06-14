package net.pubnative.lite.sdk.mraid.properties;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class MRAIDOrientationProperties {
    public static final int FORCE_ORIENTATION_LANDSCAPE = 1;
    public static final int FORCE_ORIENTATION_NONE = 2;
    public static final int FORCE_ORIENTATION_PORTRAIT = 0;
    public boolean allowOrientationChange;
    public int forceOrientation;

    public MRAIDOrientationProperties() {
        this(true, 2);
    }

    public static int forceOrientationFromString(String str) {
        int iIndexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        return 2;
    }

    public String forceOrientationString() {
        int i10 = this.forceOrientation;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "error" : "none" : "landscape" : "portrait";
    }

    public MRAIDOrientationProperties(boolean z10, int i10) {
        this.allowOrientationChange = z10;
        this.forceOrientation = i10;
    }
}
