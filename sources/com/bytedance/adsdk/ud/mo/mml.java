package com.bytedance.adsdk.ud.mo;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16068ud;

    public void qdl(float f10) {
        float f11 = this.qdl + f10;
        this.qdl = f11;
        int i10 = this.f16068ud + 1;
        this.f16068ud = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.qdl = f11 / 2.0f;
            this.f16068ud = i10 / 2;
        }
    }
}
