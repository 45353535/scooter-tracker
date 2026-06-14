package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class jpc {
    private final List<com.bytedance.adsdk.ud.lnr.ud.jpc> lnr;
    private final List<qdl<com.bytedance.adsdk.ud.lnr.ud.rdp, Path>> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final List<qdl<Integer, Integer>> f16103ud;

    public jpc(List<com.bytedance.adsdk.ud.lnr.ud.jpc> list) {
        this.lnr = list;
        this.qdl = new ArrayList(list.size());
        this.f16103ud = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.qdl.add(list.get(i10).ud().qdl());
            this.f16103ud.add(list.get(i10).lnr().qdl());
        }
    }

    public List<qdl<Integer, Integer>> lnr() {
        return this.f16103ud;
    }

    public List<com.bytedance.adsdk.ud.lnr.ud.jpc> qdl() {
        return this.lnr;
    }

    public List<qdl<com.bytedance.adsdk.ud.lnr.ud.rdp, Path>> ud() {
        return this.qdl;
    }
}
