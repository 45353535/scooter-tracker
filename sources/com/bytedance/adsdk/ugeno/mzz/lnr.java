package com.bytedance.adsdk.ugeno.mzz;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    int bjy;
    int exu;
    int fs;
    boolean jl;
    int jpc;
    int jtx;
    int mo;
    int mzz;
    float rq;
    float to;
    int tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    int f16205wd;
    boolean yt;
    int qdl = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    int f16204ud = Integer.MAX_VALUE;
    int lnr = Integer.MIN_VALUE;
    int mml = Integer.MIN_VALUE;
    List<Integer> rdp = new ArrayList();

    lnr() {
    }

    public int qdl() {
        return this.f16205wd;
    }

    public int ud() {
        return this.jpc - this.tvp;
    }

    void qdl(View view, int i10, int i11, int i12, int i13) {
        ud udVar = (ud) view.getLayoutParams();
        this.qdl = Math.min(this.qdl, (view.getLeft() - udVar.exu()) - i10);
        this.f16204ud = Math.min(this.f16204ud, (view.getTop() - udVar.rdp()) - i11);
        this.lnr = Math.max(this.lnr, view.getRight() + udVar.bjy() + i12);
        this.mml = Math.max(this.mml, view.getBottom() + udVar.jtx() + i13);
    }
}
