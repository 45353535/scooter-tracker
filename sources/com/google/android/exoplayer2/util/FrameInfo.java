package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes7.dex */
public class FrameInfo {
    public final int height;
    public final float pixelWidthHeightRatio;
    public final long streamOffsetUs;
    public final int width;

    public FrameInfo(int i10, int i11, float f10, long j10) {
        Assertions.checkArgument(i10 > 0, "width must be positive, but is: " + i10);
        Assertions.checkArgument(i11 > 0, "height must be positive, but is: " + i11);
        this.width = i10;
        this.height = i11;
        this.pixelWidthHeightRatio = f10;
        this.streamOffsetUs = j10;
    }
}
