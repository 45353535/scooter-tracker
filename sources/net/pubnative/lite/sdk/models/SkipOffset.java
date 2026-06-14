package net.pubnative.lite.sdk.models;

/* JADX INFO: loaded from: classes3.dex */
public class SkipOffset {
    private final boolean isCustom;
    private final int offset;

    public SkipOffset(int i10, boolean z10) {
        this.offset = i10;
        this.isCustom = z10;
    }

    public int getOffset() {
        return this.offset;
    }

    public boolean isCustom() {
        return this.isCustom;
    }
}
