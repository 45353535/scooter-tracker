package com.bytedance.sdk.component.mo.qdl;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private long exu;
    private int fs;
    private boolean jpc;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl lnr;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mml;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mo;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mzz;
    private com.bytedance.sdk.component.mo.qdl.qdl.mzz qdl;
    private int rq;
    private boolean to;
    private mzz tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private com.bytedance.sdk.component.mo.qdl.ud.lnr f16535ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl f16536wd;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mo.qdl.qdl$qdl, reason: collision with other inner class name */
    public static class C0230qdl {
        private long fs;
        private com.bytedance.sdk.component.mo.qdl.qdl.mzz jpc;
        private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl lnr;
        private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mml;
        private boolean mo;
        private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mzz;
        private com.bytedance.sdk.component.mo.qdl.ud.lnr qdl;
        private boolean tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl f16537ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private mzz f16538wd;
        private int to = 5000;
        private int rq = 10;

        public C0230qdl lnr(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
            this.mml = qdlVar;
            return this;
        }

        public C0230qdl qdl(long j10) {
            this.fs = j10;
            return this;
        }

        public C0230qdl ud(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
            this.lnr = qdlVar;
            return this;
        }

        public C0230qdl qdl(com.bytedance.sdk.component.mo.qdl.qdl.mzz mzzVar) {
            this.jpc = mzzVar;
            return this;
        }

        public C0230qdl ud(int i10) {
            this.rq = i10;
            return this;
        }

        public C0230qdl qdl(mzz mzzVar) {
            this.f16538wd = mzzVar;
            return this;
        }

        public C0230qdl qdl(boolean z10) {
            this.mo = z10;
            return this;
        }

        public C0230qdl qdl(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
            this.f16537ud = qdlVar;
            return this;
        }

        public C0230qdl qdl(com.bytedance.sdk.component.mo.qdl.ud.lnr lnrVar) {
            this.qdl = lnrVar;
            return this;
        }

        public C0230qdl qdl(int i10) {
            this.to = i10;
            return this;
        }

        public qdl qdl() {
            qdl qdlVar = new qdl();
            qdlVar.f16535ud = this.qdl;
            qdlVar.lnr = this.f16537ud;
            qdlVar.mml = this.lnr;
            qdlVar.mzz = this.mml;
            qdlVar.mo = this.mzz;
            qdlVar.jpc = this.mo;
            qdlVar.tvp = this.f16538wd;
            qdlVar.qdl = this.jpc;
            qdlVar.to = this.tvp;
            qdlVar.fs = this.rq;
            qdlVar.rq = this.to;
            qdlVar.exu = this.fs;
            return qdlVar;
        }
    }

    public int exu() {
        return this.fs;
    }

    public int fs() {
        return this.rq;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl jpc() {
        return this.mml;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl mo() {
        return this.f16536wd;
    }

    public long mzz() {
        return this.exu;
    }

    public boolean rq() {
        return this.jpc;
    }

    public com.bytedance.sdk.component.mo.qdl.ud.lnr to() {
        return this.f16535ud;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl tvp() {
        return this.mzz;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl wd() {
        return this.lnr;
    }

    private qdl() {
        this.rq = 200;
        this.fs = 10;
    }

    public boolean lnr() {
        return this.to;
    }

    public mzz mml() {
        return this.tvp;
    }

    public com.bytedance.sdk.component.mo.qdl.mml.ud.qdl ud() {
        return this.mo;
    }

    public com.bytedance.sdk.component.mo.qdl.qdl.mzz qdl() {
        return this.qdl;
    }
}
