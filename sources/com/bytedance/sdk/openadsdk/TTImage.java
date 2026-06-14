package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes6.dex */
public class TTImage {
    private final String lnr;
    private double mml;
    private final int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int f16764ud;

    public TTImage(int i10, int i11, String str, double d10) {
        this.qdl = i10;
        this.f16764ud = i11;
        this.lnr = str;
        this.mml = d10;
    }

    public double getDuration() {
        return this.mml;
    }

    public int getHeight() {
        return this.qdl;
    }

    public String getImageUrl() {
        return this.lnr;
    }

    public int getWidth() {
        return this.f16764ud;
    }

    public boolean isValid() {
        String str;
        return this.qdl > 0 && this.f16764ud > 0 && (str = this.lnr) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
