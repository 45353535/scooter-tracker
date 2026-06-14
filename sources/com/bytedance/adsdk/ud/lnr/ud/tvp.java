package com.bytedance.adsdk.ud.lnr.ud;

/* JADX INFO: loaded from: classes6.dex */
public class tvp implements lnr {
    private final boolean lnr;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final qdl f16045ud;

    public enum qdl {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static qdl qdl(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public tvp(String str, qdl qdlVar, boolean z10) {
        this.qdl = str;
        this.f16045ud = qdlVar;
        this.lnr = z10;
    }

    public boolean lnr() {
        return this.lnr;
    }

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f16045ud + '}';
    }

    public qdl ud() {
        return this.f16045ud;
    }

    @Override // com.bytedance.adsdk.ud.lnr.ud.lnr
    public com.bytedance.adsdk.ud.qdl.qdl.lnr qdl(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.wd wdVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar) {
        return new com.bytedance.adsdk.ud.qdl.qdl.fs(this);
    }
}
