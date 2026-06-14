package com.bytedance.adsdk.ud.wd;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16146ud;

    public lnr(float f10, float f11) {
        this.qdl = f10;
        this.f16146ud = f11;
    }

    public float qdl() {
        return this.qdl;
    }

    public String toString() {
        return qdl() + "x" + ud();
    }

    public float ud() {
        return this.f16146ud;
    }

    public void qdl(float f10, float f11) {
        this.qdl = f10;
        this.f16146ud = f11;
    }

    public boolean ud(float f10, float f11) {
        return this.qdl == f10 && this.f16146ud == f11;
    }

    public lnr() {
        this(1.0f, 1.0f);
    }
}
