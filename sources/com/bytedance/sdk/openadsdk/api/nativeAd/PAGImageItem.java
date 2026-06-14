package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes6.dex */
public class PAGImageItem {
    private final String lnr;
    private float mml;
    private final int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int f16925ud;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.qdl = i10;
        this.f16925ud = i11;
        this.lnr = str;
        this.mml = f10;
    }

    public float getDuration() {
        return this.mml;
    }

    public int getHeight() {
        return this.qdl;
    }

    public String getImageUrl() {
        return this.lnr;
    }

    public int getWidth() {
        return this.f16925ud;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
