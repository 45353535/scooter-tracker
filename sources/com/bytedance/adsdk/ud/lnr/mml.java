package com.bytedance.adsdk.ud.lnr;

import com.bytedance.adsdk.ud.lnr.ud.jtx;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private final double lnr;
    private final double mml;
    private final String mo;
    private final String mzz;
    private final List<jtx> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final char f16011ud;

    public mml(List<jtx> list, char c10, double d10, double d11, String str, String str2) {
        this.qdl = list;
        this.f16011ud = c10;
        this.lnr = d10;
        this.mml = d11;
        this.mzz = str;
        this.mo = str2;
    }

    public static int qdl(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return qdl(this.f16011ud, this.mo, this.mzz);
    }

    public double ud() {
        return this.mml;
    }

    public List<jtx> qdl() {
        return this.qdl;
    }
}
