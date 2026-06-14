package com.bytedance.sdk.component.wd;

import com.bytedance.sdk.component.ud.qdl.to;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    final Map<String, String> lnr;
    final String mml;
    final long mo;
    final long mzz;
    final int qdl;
    private final boolean tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    final String f16736ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    to f16737wd;
    private File jpc = null;
    private byte[] to = null;

    public ud(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.tvp = z10;
        this.qdl = i10;
        this.f16736ud = str;
        this.lnr = map;
        this.mml = str2;
        this.mzz = j10;
        this.mo = j11;
    }

    public Map<String, String> lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public boolean mo() {
        return this.tvp;
    }

    public File mzz() {
        return this.jpc;
    }

    public int qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.f16736ud;
    }

    public to wd() {
        return this.f16737wd;
    }

    public void qdl(File file) {
        this.jpc = file;
    }

    public void qdl(byte[] bArr) {
        this.to = bArr;
    }

    public void qdl(to toVar) {
        this.f16737wd = toVar;
    }
}
