package com.bytedance.sdk.component.mzz.mml.lnr.qdl;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements com.bytedance.sdk.component.mzz.ud, Cloneable {
    private static volatile com.bytedance.sdk.component.mzz.ud tvp;
    private File jpc;
    private int lnr;
    private int mml;
    private boolean mo;
    private boolean mzz;
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16625ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f16626wd;

    public ud(int i10, int i11, int i12, long j10, File file) {
        this(i10, i11, i12, j10, i11 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.mzz.ud to() {
        return tvp;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public File jpc() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public int lnr() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public int mml() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean mo() {
        return this.f16626wd;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean mzz() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public long qdl() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean tvp() {
        return true;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public int ud() {
        return this.f16625ud;
    }

    @Override // com.bytedance.sdk.component.mzz.ud
    public boolean wd() {
        return this.mo;
    }

    public ud(int i10, int i11, int i12, long j10, boolean z10, boolean z11, File file) {
        this.qdl = j10;
        this.f16625ud = i10;
        this.lnr = i11;
        this.mml = i12;
        this.mzz = z10;
        this.mo = z11;
        this.jpc = file;
        this.f16626wd = i12 != 0;
    }

    public static void qdl(Context context, com.bytedance.sdk.component.mzz.ud udVar) {
        if (udVar != null) {
            tvp = udVar;
        } else {
            tvp = qdl(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.mzz.ud qdl(File file) {
        long jQdl;
        int iLnr;
        int iMml;
        file.mkdirs();
        if (tvp == null) {
            iLnr = 10;
            iMml = 14;
            jQdl = 20;
        } else {
            jQdl = tvp.qdl();
            iLnr = tvp.lnr();
            iMml = tvp.mml();
        }
        return new ud(0, iLnr, iMml, jQdl, file);
    }
}
