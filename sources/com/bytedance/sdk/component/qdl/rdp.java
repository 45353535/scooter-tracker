package com.bytedance.sdk.component.qdl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class rdp {
    public final String jpc;
    public final String lnr;
    public final String mml;
    public final String mo;
    public final String mzz;
    public final int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public final String f16663ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public final String f16664wd;

    public static final class qdl {
        private String lnr;
        private String mml;
        private String mo;
        private String mzz;
        private String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private String f16665ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private String f16666wd;

        private qdl() {
        }

        public qdl lnr(String str) {
            this.lnr = str;
            return this;
        }

        public qdl mml(String str) {
            this.mml = str;
            return this;
        }

        public qdl mo(String str) {
            this.mo = str;
            return this;
        }

        public qdl mzz(String str) {
            this.mzz = str;
            return this;
        }

        public qdl qdl(String str) {
            this.qdl = str;
            return this;
        }

        public qdl ud(String str) {
            this.f16665ud = str;
            return this;
        }

        public qdl wd(String str) {
            this.f16666wd = str;
            return this;
        }

        public rdp qdl() {
            return new rdp(this);
        }
    }

    public static qdl qdl() {
        return new qdl();
    }

    public String toString() {
        return "methodName: " + this.mml + ", params: " + this.mzz + ", callbackId: " + this.mo + ", type: " + this.lnr + ", version: " + this.f16663ud + ", ";
    }

    private rdp(String str, int i10) {
        this.f16663ud = null;
        this.lnr = null;
        this.mml = null;
        this.mzz = null;
        this.mo = str;
        this.f16664wd = null;
        this.qdl = i10;
        this.jpc = null;
    }

    public static rdp qdl(String str, int i10) {
        return new rdp(str, i10);
    }

    public static boolean qdl(rdp rdpVar) {
        return rdpVar == null || rdpVar.qdl != 1 || TextUtils.isEmpty(rdpVar.mml) || TextUtils.isEmpty(rdpVar.mzz);
    }

    private rdp(qdl qdlVar) {
        this.f16663ud = qdlVar.qdl;
        this.lnr = qdlVar.f16665ud;
        this.mml = qdlVar.lnr;
        this.mzz = qdlVar.mml;
        this.mo = qdlVar.mzz;
        this.f16664wd = qdlVar.mo;
        this.qdl = 1;
        this.jpc = qdlVar.f16666wd;
    }
}
