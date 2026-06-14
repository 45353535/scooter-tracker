package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class jl {
    private int lnr;
    private double mml;
    private String mo;
    private boolean mzz;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17353ud;

    public int lnr() {
        return this.lnr;
    }

    public double mml() {
        return this.mml;
    }

    public boolean mo() {
        return this.mzz;
    }

    public boolean mzz() {
        return !TextUtils.isEmpty(this.qdl) && this.f17353ud > 0 && this.lnr > 0;
    }

    public String qdl() {
        return this.qdl;
    }

    public int ud() {
        return this.f17353ud;
    }

    public String wd() {
        return this.mo;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(int i10) {
        this.lnr = i10;
    }

    public void qdl(int i10) {
        this.f17353ud = i10;
    }

    public void ud(String str) {
        this.mo = str;
    }

    public void qdl(boolean z10) {
        this.mzz = z10;
    }
}
