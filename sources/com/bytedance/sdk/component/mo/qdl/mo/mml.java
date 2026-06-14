package com.bytedance.sdk.component.mo.qdl.mo;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private String jpc;
    private final boolean lnr;
    private final String mo;
    private final int mzz;
    private final String qdl;
    private boolean rq;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f16532ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private String f16533wd;
    private int mml = -1;
    private int tvp = 0;
    private String to = null;

    mml(String str, String str2, boolean z10, int i10, String str3) {
        this.qdl = str;
        this.f16532ud = str2;
        this.lnr = z10;
        this.mzz = i10;
        this.mo = str3;
    }

    public int jpc() {
        return this.tvp;
    }

    public boolean lnr() {
        return this.lnr;
    }

    public int mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public int mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public boolean rq() {
        return this.mml == -1;
    }

    public boolean to() {
        return this.rq;
    }

    public String tvp() {
        return this.jpc;
    }

    public String ud() {
        return this.f16532ud;
    }

    public String wd() {
        return this.f16533wd;
    }

    public void lnr(String str) {
        this.to = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.jpc)) {
            this.jpc = String.valueOf(this.to);
            return;
        }
        this.jpc += StringUtils.COMMA + this.to;
    }

    public void qdl(int i10) {
        this.mml = i10;
    }

    public void ud(int i10) {
        this.tvp = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f16533wd)) {
            this.f16533wd = String.valueOf(this.tvp);
            return;
        }
        this.f16533wd += StringUtils.COMMA + this.tvp;
    }

    public void qdl(String str) {
        this.f16533wd = str;
    }

    public void qdl(boolean z10) {
        this.rq = z10;
    }

    public Runnable qdl(String str, Map<String, String> map) {
        return qdl.qdl().qdl(this, str, map);
    }

    public void ud(String str) {
        this.jpc = str;
    }
}
