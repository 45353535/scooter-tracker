package com.bykv.vk.openvk.qdl.qdl.ud.lnr;

import com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qdl implements lnr {
    private lnr.mml jpc;
    private lnr.ud lnr;
    private lnr.qdl mml;
    private lnr.wd mo;
    private lnr.mo mzz;
    protected boolean qdl = false;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private lnr.mzz f15925ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private lnr.InterfaceC0203lnr f15926wd;

    protected final void lnr() {
        try {
            lnr.ud udVar = this.lnr;
            if (udVar != null) {
                udVar.qdl(this);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void mml() {
        try {
            lnr.mo moVar = this.mzz;
            if (moVar != null) {
                moVar.lnr(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.mzz mzzVar) {
        this.f15925ud = mzzVar;
    }

    protected final void ud() {
        try {
            lnr.mzz mzzVar = this.f15925ud;
            if (mzzVar != null) {
                mzzVar.ud(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.ud udVar) {
        this.lnr = udVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.qdl qdlVar) {
        this.mml = qdlVar;
    }

    protected final boolean ud(int i10, int i11) {
        try {
            lnr.mml mmlVar = this.jpc;
            if (mmlVar != null) {
                if (mmlVar.ud(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.mo moVar) {
        this.mzz = moVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.InterfaceC0203lnr interfaceC0203lnr) {
        this.f15926wd = interfaceC0203lnr;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.mml mmlVar) {
        this.jpc = mmlVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.wd wdVar) {
        this.mo = wdVar;
    }

    public void qdl() {
        this.f15925ud = null;
        this.mml = null;
        this.lnr = null;
        this.mzz = null;
        this.mo = null;
        this.f15926wd = null;
        this.jpc = null;
    }

    protected final void qdl(int i10) {
        try {
            lnr.qdl qdlVar = this.mml;
            if (qdlVar != null) {
                qdlVar.qdl(this, i10);
            }
        } catch (Throwable unused) {
        }
    }

    protected final void qdl(int i10, int i11, int i12, int i13) {
        try {
            lnr.wd wdVar = this.mo;
            if (wdVar != null) {
                wdVar.qdl(this, i10, i11, i12, i13);
            }
        } catch (Throwable unused) {
        }
    }

    protected final boolean qdl(int i10, int i11) {
        try {
            lnr.InterfaceC0203lnr interfaceC0203lnr = this.f15926wd;
            if (interfaceC0203lnr != null) {
                if (interfaceC0203lnr.qdl(this, i10, i11)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void qdl(boolean z10) {
        this.qdl = z10;
    }
}
