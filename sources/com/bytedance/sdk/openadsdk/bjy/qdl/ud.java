package com.bytedance.sdk.openadsdk.bjy.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private String lnr;
    private int mml;
    private String mo;
    private boolean mzz;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ljh f16961ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f16962wd;
    private int jpc = 0;
    private int tvp = 0;

    public int jpc() {
        return this.jpc;
    }

    public String lnr() {
        ljh ljhVar;
        if (TextUtils.isEmpty(this.lnr) && (ljhVar = this.f16961ud) != null) {
            this.lnr = gy.qdl(ljhVar);
        }
        return this.lnr;
    }

    public int mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public int tvp() {
        return this.tvp;
    }

    public ljh ud() {
        return this.f16961ud;
    }

    public int wd() {
        return this.f16962wd;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(String str) {
        this.lnr = str;
    }

    public void qdl(ljh ljhVar) {
        this.f16961ud = ljhVar;
    }

    public void ud(int i10) {
        this.f16962wd = i10;
    }

    public void qdl(int i10) {
        this.mml = i10;
    }

    public void lnr(String str) {
        this.mo = str;
    }

    public void qdl(boolean z10) {
        this.mzz = z10;
    }
}
