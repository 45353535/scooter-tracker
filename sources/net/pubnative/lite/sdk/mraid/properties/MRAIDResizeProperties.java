package net.pubnative.lite.sdk.mraid.properties;

import com.ironsource.C4240b4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class MRAIDResizeProperties {
    public static final int CUSTOM_CLOSE_POSITION_BOTTOM_CENTER = 5;
    public static final int CUSTOM_CLOSE_POSITION_BOTTOM_LEFT = 4;
    public static final int CUSTOM_CLOSE_POSITION_BOTTOM_RIGHT = 6;
    public static final int CUSTOM_CLOSE_POSITION_CENTER = 3;
    public static final int CUSTOM_CLOSE_POSITION_TOP_CENTER = 1;
    public static final int CUSTOM_CLOSE_POSITION_TOP_LEFT = 0;
    public static final int CUSTOM_CLOSE_POSITION_TOP_RIGHT = 2;
    public boolean allowOffscreen;
    public int customClosePosition;
    public int height;
    public int offsetX;
    public int offsetY;
    public int width;

    public MRAIDResizeProperties() {
        this(0, 0, 0, 0, 2, true);
    }

    public static int customClosePositionFromString(String str) {
        int iIndexOf = Arrays.asList(C4240b4.e.f42563c, "top-center", C4240b4.e.f42562b, "center", C4240b4.e.f42565e, "bottom-center", C4240b4.e.f42564d).indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        return 2;
    }

    public MRAIDResizeProperties(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.width = i10;
        this.height = i11;
        this.offsetX = i12;
        this.offsetY = i13;
        this.customClosePosition = i14;
        this.allowOffscreen = z10;
    }
}
