package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes10.dex */
final class TtmlRegion {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f50069id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public TtmlRegion(String str, float f10, float f11, int i10, int i11, float f12, int i12, float f13) {
        this.f50069id = str;
        this.position = f10;
        this.line = f11;
        this.lineType = i10;
        this.lineAnchor = i11;
        this.width = f12;
        this.textSizeType = i12;
        this.textSize = f13;
    }
}
