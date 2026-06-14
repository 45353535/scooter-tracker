package com.bytedance.sdk.openadsdk.jtx;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static int lnr = 1;
    public static int mml = 2;
    public static int mzz = 3;
    public static int qdl = -1;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static int f17614ud;
    private int mo = qdl;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private long f17615wd = 0;
    private long jpc = 0;
    private final List<lnr> tvp = new ArrayList();
    private long to = 0;

    public void lnr(long j10) {
        int i10;
        int i11 = this.mo;
        if (i11 == qdl || i11 == (i10 = mml) || i11 == mzz) {
            return;
        }
        this.mo = i10;
        this.to = j10;
    }

    public void mml(long j10) {
        int i10 = this.mo;
        if (i10 == qdl || i10 != mml) {
            return;
        }
        this.mo = lnr;
        this.tvp.add(new lnr(this.to, j10));
        this.to = 0L;
    }

    public void qdl(long j10) {
        this.mo = f17614ud;
        this.f17615wd = j10;
    }

    public void ud(long j10) {
        int i10;
        int i11 = this.mo;
        if (i11 == qdl || i11 == (i10 = mzz)) {
            return;
        }
        this.mo = i10;
        this.jpc = j10;
    }

    public long qdl(long j10, long j11) {
        long j12;
        long j13;
        long jUd;
        long j14 = this.jpc;
        if (j14 != 0 && j10 > j14) {
            return 0L;
        }
        int i10 = 0;
        for (lnr lnrVar : this.tvp) {
            if (lnrVar.ud() > j10) {
                if (j10 < lnrVar.qdl()) {
                    j13 = i10;
                    jUd = lnrVar.ud() - lnrVar.qdl();
                } else {
                    j13 = i10;
                    jUd = lnrVar.ud() - j10;
                }
                i10 = (int) (j13 + jUd);
            }
        }
        long j15 = this.f17615wd;
        if (j15 < j10) {
            long j16 = this.to;
            if (j16 == 0) {
                j16 = this.jpc;
                if (j16 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j16 <= j10) {
                return 0L;
            }
            return (j16 - j10) - ((long) i10);
        }
        long j17 = this.to;
        if (j17 == 0) {
            j17 = this.jpc;
            if (j17 == 0) {
                j12 = j11 - j15;
            }
        } else if (j17 <= j15) {
            return 0L;
        }
        return (j17 - j15) - ((long) i10);
        return j12 - ((long) i10);
    }

    public int qdl() {
        return this.mo;
    }
}
