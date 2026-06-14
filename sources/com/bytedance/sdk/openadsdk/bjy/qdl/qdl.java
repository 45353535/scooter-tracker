package com.bytedance.sdk.openadsdk.bjy.qdl;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    String bjy;
    float exu;
    float fs;
    float jpc;
    float jtx;
    float lnr;
    float mml;
    int mo;
    float mzz;
    String qdl;
    int rdp;
    float rq;
    int to;
    float tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    int f16959ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    float f16960wd;
    int yt;
    int jl = -1;
    String exc = "";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.bjy.qdl.qdl$qdl, reason: collision with other inner class name */
    public static class C0249qdl {
        qdl qdl = new qdl();

        public C0249qdl jpc(float f10) {
            this.qdl.jpc(f10);
            return this;
        }

        public C0249qdl lnr(float f10) {
            this.qdl.lnr(f10);
            return this;
        }

        public C0249qdl mml(float f10) {
            this.qdl.mml(f10);
            return this;
        }

        public C0249qdl mo(float f10) {
            this.qdl.mo(f10);
            return this;
        }

        public C0249qdl mzz(float f10) {
            this.qdl.mzz(f10);
            return this;
        }

        public C0249qdl qdl(String str) {
            this.qdl.ud(str);
            return this;
        }

        public C0249qdl to(float f10) {
            this.qdl.to(f10);
            return this;
        }

        public C0249qdl tvp(float f10) {
            this.qdl.tvp(f10);
            return this;
        }

        public C0249qdl ud(float f10) {
            this.qdl.ud(f10);
            return this;
        }

        public C0249qdl wd(float f10) {
            this.qdl.wd(f10);
            return this;
        }

        public C0249qdl lnr(int i10) {
            this.qdl.mo(i10);
            return this;
        }

        public C0249qdl qdl(int i10) {
            this.qdl.ud(i10);
            return this;
        }

        public C0249qdl ud(int i10) {
            this.qdl.mzz(i10);
            return this;
        }

        public C0249qdl qdl(float f10) {
            this.qdl.qdl(f10);
            return this;
        }

        public C0249qdl ud(String str) {
            this.qdl.lnr(str);
            return this;
        }

        public qdl qdl() {
            return this.qdl;
        }
    }

    public BigDecimal bjy() {
        return new BigDecimal(this.exu).setScale(3, RoundingMode.HALF_UP);
    }

    public int exc() {
        return this.yt;
    }

    public float exu() {
        return this.rq;
    }

    public int fs() {
        return this.to;
    }

    public float jl() {
        return this.jtx;
    }

    public int jpc() {
        return this.mo;
    }

    public int jtx() {
        return this.rdp;
    }

    public String lnr() {
        return this.qdl;
    }

    public int mml() {
        return this.f16959ud;
    }

    public float mo() {
        return this.mml;
    }

    public float mzz() {
        return this.lnr;
    }

    public int qdl() {
        return this.jl;
    }

    public float rdp() {
        return this.fs;
    }

    public float rq() {
        return this.tvp;
    }

    public float to() {
        return this.jpc;
    }

    public float tvp() {
        return this.f16960wd;
    }

    public String ud() {
        return this.exc;
    }

    public float wd() {
        return this.mzz;
    }

    public String yt() {
        return this.bjy;
    }

    public void jpc(float f10) {
        this.fs = f10;
    }

    public void lnr(float f10) {
        this.mzz = f10;
    }

    public void mml(float f10) {
        this.f16960wd = f10;
    }

    public void mo(float f10) {
        this.tvp = f10;
    }

    public void mzz(float f10) {
        this.jpc = f10;
    }

    public void qdl(int i10) {
        this.jl = i10;
    }

    public void to(float f10) {
        this.jtx = f10;
    }

    public void tvp(float f10) {
        this.exu = f10;
    }

    public void ud(String str) {
        this.qdl = str;
    }

    public void wd(float f10) {
        this.rq = f10;
    }

    public void lnr(int i10) {
        this.mo = i10;
    }

    public void mml(int i10) {
        this.to = i10;
    }

    public void mo(int i10) {
        this.yt = i10;
    }

    public void mzz(int i10) {
        this.rdp = i10;
    }

    public void qdl(String str) {
        this.exc = str;
    }

    public void ud(int i10) {
        this.f16959ud = i10;
    }

    public void lnr(String str) {
        this.bjy = str;
    }

    public void qdl(float f10) {
        this.lnr = f10;
    }

    public void ud(float f10) {
        this.mml = f10;
    }
}
