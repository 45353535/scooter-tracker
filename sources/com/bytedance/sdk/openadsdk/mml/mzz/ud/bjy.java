package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public class bjy {
    private int lnr;
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr mml;
    private ljh mzz;
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f17710ud;

    public static class qdl {
        private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl fs;
        private int jpc;
        private int mo;
        private int to;
        private int tvp;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private int f17712wd;
        private long qdl = 0;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private long f17711ud = 0;
        private long lnr = 0;
        private long mml = 0;
        private boolean mzz = false;
        private boolean rq = false;

        private void rdp() {
            long j10 = this.lnr;
            if (j10 > 0) {
                long j11 = this.qdl;
                if (j11 > j10) {
                    long j12 = j11 % j10;
                    this.qdl = j12;
                    if (j12 == 0) {
                        this.qdl = j10;
                    }
                }
            }
        }

        public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl exu() {
            return this.fs;
        }

        public boolean fs() {
            return this.mzz;
        }

        public int jpc() {
            return this.jpc;
        }

        public long lnr() {
            return this.f17711ud;
        }

        public long mml() {
            return this.lnr;
        }

        public int mo() {
            return this.f17712wd;
        }

        public int mzz() {
            return this.mo;
        }

        public long qdl() {
            return this.mml;
        }

        public boolean rq() {
            return this.rq;
        }

        public int to() {
            return this.to;
        }

        public int tvp() {
            return this.tvp;
        }

        public long ud() {
            return this.qdl;
        }

        public int wd() {
            long j10 = this.lnr;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.qdl * 100) / j10), 100);
        }

        public void lnr(long j10) {
            this.f17711ud = j10;
        }

        public void mml(long j10) {
            this.lnr = j10;
            rdp();
        }

        public void qdl(long j10) {
            this.mml = j10;
        }

        public void ud(long j10) {
            this.qdl = j10;
            rdp();
        }

        public void lnr(int i10) {
            this.jpc = i10;
        }

        public void qdl(int i10) {
            this.mo = i10;
        }

        public void mml(int i10) {
            this.to = i10;
        }

        public void qdl(boolean z10) {
            this.mzz = z10;
        }

        public void ud(int i10) {
            this.f17712wd = i10;
        }

        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar) {
            this.fs = qdlVar;
        }
    }

    public bjy(long j10, String str, int i10, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, ljh ljhVar) {
        this.qdl = j10;
        this.f17710ud = str;
        this.lnr = i10;
        this.mml = lnrVar;
        this.mzz = ljhVar;
    }

    public int lnr() {
        return this.lnr;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr mml() {
        return this.mml;
    }

    public ljh mzz() {
        return this.mzz;
    }

    public long qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.f17710ud;
    }
}
