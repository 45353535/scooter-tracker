package com.bytedance.adsdk.ud.lnr.lnr;

import com.bytedance.adsdk.ud.lnr.qdl.fs;
import com.bytedance.adsdk.ud.lnr.qdl.rq;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private final List<com.bytedance.adsdk.ud.wd.qdl<Float>> aaj;
    private final com.bytedance.adsdk.ud.mzz.to bch;
    private final float bjy;
    private final com.bytedance.adsdk.ud.lnr.qdl.ud exc;
    private final float exu;
    private final int fs;
    private final rq jl;
    private final List<com.bytedance.adsdk.ud.lnr.ud.jpc> jpc;
    private final float jtx;
    private final ud jyq;
    private final com.bytedance.adsdk.ud.lnr.ud.qdl ljh;
    private final String lnr;
    private final long mml;
    private final long mo;
    private final qdl mzz;
    private final boolean oth;
    private final List<com.bytedance.adsdk.ud.lnr.ud.lnr> qdl;
    private final float rdp;
    private final int rq;
    private final int to;
    private final fs tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.wd f15997ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final String f15998wd;
    private final com.bytedance.adsdk.ud.lnr.qdl.to yt;

    public enum qdl {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum ud {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public mzz(List<com.bytedance.adsdk.ud.lnr.ud.lnr> list, com.bytedance.adsdk.ud.wd wdVar, String str, long j10, qdl qdlVar, long j11, String str2, List<com.bytedance.adsdk.ud.lnr.ud.jpc> list2, fs fsVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.ud.lnr.qdl.to toVar, rq rqVar, List<com.bytedance.adsdk.ud.wd.qdl<Float>> list3, ud udVar, com.bytedance.adsdk.ud.lnr.qdl.ud udVar2, boolean z10, com.bytedance.adsdk.ud.lnr.ud.qdl qdlVar2, com.bytedance.adsdk.ud.mzz.to toVar2) {
        this.qdl = list;
        this.f15997ud = wdVar;
        this.lnr = str;
        this.mml = j10;
        this.mzz = qdlVar;
        this.mo = j11;
        this.f15998wd = str2;
        this.jpc = list2;
        this.tvp = fsVar;
        this.to = i10;
        this.rq = i11;
        this.fs = i12;
        this.exu = f10;
        this.rdp = f11;
        this.bjy = f12;
        this.jtx = f13;
        this.yt = toVar;
        this.jl = rqVar;
        this.aaj = list3;
        this.jyq = udVar;
        this.exc = udVar2;
        this.oth = z10;
        this.ljh = qdlVar2;
        this.bch = toVar2;
    }

    rq aaj() {
        return this.jl;
    }

    public com.bytedance.adsdk.ud.mzz.to bch() {
        return this.bch;
    }

    fs bjy() {
        return this.tvp;
    }

    com.bytedance.adsdk.ud.lnr.qdl.to exc() {
        return this.yt;
    }

    long exu() {
        return this.mo;
    }

    ud fs() {
        return this.jyq;
    }

    int jl() {
        return this.to;
    }

    float jpc() {
        return this.bjy;
    }

    int jtx() {
        return this.fs;
    }

    com.bytedance.adsdk.ud.lnr.qdl.ud jyq() {
        return this.exc;
    }

    public com.bytedance.adsdk.ud.lnr.ud.qdl ljh() {
        return this.ljh;
    }

    float lnr() {
        return this.rdp / this.f15997ud.yt();
    }

    List<com.bytedance.adsdk.ud.wd.qdl<Float>> mml() {
        return this.aaj;
    }

    public String mo() {
        return this.lnr;
    }

    public long mzz() {
        return this.mml;
    }

    public boolean oth() {
        return this.oth;
    }

    com.bytedance.adsdk.ud.wd qdl() {
        return this.f15997ud;
    }

    List<com.bytedance.adsdk.ud.lnr.ud.lnr> rdp() {
        return this.qdl;
    }

    public qdl rq() {
        return this.mzz;
    }

    List<com.bytedance.adsdk.ud.lnr.ud.jpc> to() {
        return this.jpc;
    }

    public String toString() {
        return qdl("");
    }

    float tvp() {
        return this.jtx;
    }

    float ud() {
        return this.exu;
    }

    public String wd() {
        return this.f15998wd;
    }

    int yt() {
        return this.rq;
    }

    public String qdl(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(mo());
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        mzz mzzVarQdl = this.f15997ud.qdl(exu());
        if (mzzVarQdl != null) {
            sb2.append("\t\tParents: ");
            sb2.append(mzzVarQdl.mo());
            mzz mzzVarQdl2 = this.f15997ud.qdl(mzzVarQdl.exu());
            while (mzzVarQdl2 != null) {
                sb2.append("->");
                sb2.append(mzzVarQdl2.mo());
                mzzVarQdl2 = this.f15997ud.qdl(mzzVarQdl2.exu());
            }
            sb2.append(str);
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (!to().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(to().size());
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (jl() != 0 && yt() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(jl()), Integer.valueOf(yt()), Integer.valueOf(jtx())));
        }
        if (!this.qdl.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (com.bytedance.adsdk.ud.lnr.ud.lnr lnrVar : this.qdl) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(lnrVar);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb2.toString();
    }
}
