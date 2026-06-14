package com.bytedance.adsdk.ud.lnr;

import com.bytedance.adsdk.ud.rdp;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private static final mzz qdl = new mzz();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final rdp<String, com.bytedance.adsdk.ud.wd> f16013ud = new rdp<>(20);

    mzz() {
    }

    public static mzz qdl() {
        return qdl;
    }

    public com.bytedance.adsdk.ud.wd qdl(String str) {
        if (str == null) {
            return null;
        }
        return this.f16013ud.qdl(str);
    }

    public void qdl(String str, com.bytedance.adsdk.ud.wd wdVar) {
        if (str == null) {
            return;
        }
        this.f16013ud.qdl(str, wdVar);
    }
}
