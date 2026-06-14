package com.bytedance.sdk.openadsdk.component.jpc;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.lnr.qdl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements qdl.InterfaceC0263qdl {
    private ljh lnr;
    private ud mml;
    private boolean mzz = false;
    private Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private FrameLayout f16987ud;

    public lnr(Context context) {
        this.qdl = context.getApplicationContext();
    }

    public long bjy() {
        ud udVar = this.mml;
        if (udVar != null) {
            return udVar.tvp() + this.mml.wd();
        }
        return 0L;
    }

    public long exu() {
        ud udVar = this.mml;
        if (udVar != null) {
            return udVar.mo();
        }
        return 0L;
    }

    public void fs() {
        ud udVar = this.mml;
        if (udVar == null) {
            return;
        }
        this.qdl = null;
        udVar.mml();
        this.mml = null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0263qdl
    public long getVideoProgress() {
        return exu();
    }

    public void jpc() {
        try {
            if (mzz()) {
                this.mml.ud();
            }
        } catch (Throwable th2) {
            aaj.lnr("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public boolean lnr() {
        return this.mzz;
    }

    public boolean mml() {
        ud udVar = this.mml;
        return (udVar == null || udVar.rq() == null || !this.mml.rq().ud()) ? false : true;
    }

    public boolean mo() {
        ud udVar = this.mml;
        return (udVar == null || udVar.rq() == null || !this.mml.rq().wd()) ? false : true;
    }

    public boolean mzz() {
        ud udVar = this.mml;
        return (udVar == null || udVar.rq() == null || !this.mml.rq().mo()) ? false : true;
    }

    public void qdl(FrameLayout frameLayout, ljh ljhVar) {
        this.f16987ud = frameLayout;
        this.lnr = ljhVar;
        this.mml = new ud(this.qdl, frameLayout, ljhVar);
    }

    public long rdp() {
        ud udVar = this.mml;
        if (udVar != null) {
            return udVar.wd();
        }
        return 0L;
    }

    public void rq() {
        ud udVar = this.mml;
        if (udVar != null) {
            udVar.lnr();
        }
    }

    public void to() {
        ud udVar = this.mml;
        if (udVar == null) {
            return;
        }
        udVar.mml();
        this.mml = null;
    }

    public void tvp() {
        try {
            if (mo()) {
                rq();
            }
        } catch (Throwable th2) {
            aaj.lnr("TTAppOpenVideoManager", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public ud ud() {
        return this.mml;
    }

    public boolean wd() {
        ud udVar = this.mml;
        return udVar != null && udVar.rdp();
    }

    public boolean qdl() {
        com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(0).ud(), this.lnr);
        udVarQdl.ud(this.lnr.yre());
        udVarQdl.ud(this.f16987ud.getWidth());
        udVarQdl.lnr(this.f16987ud.getHeight());
        udVarQdl.lnr(this.lnr.ir());
        udVarQdl.qdl(0L);
        udVarQdl.qdl(true);
        return this.mml.qdl(udVarQdl);
    }

    public void qdl(boolean z10) {
        this.mzz = z10;
    }

    public void qdl(lnr.qdl qdlVar) {
        ud udVar = this.mml;
        if (udVar != null) {
            udVar.qdl(qdlVar);
        }
    }

    public boolean qdl(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.qdl qdlVar, ljh ljhVar) {
        qdl(frameLayout, ljhVar);
        qdl(qdlVar);
        try {
            return qdl();
        } catch (Throwable th2) {
            aaj.lnr("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th2.getMessage());
            return false;
        }
    }

    public boolean qdl(float f10) {
        try {
            ud udVar = this.mml;
            if (udVar != null) {
                return udVar.qdl(f10);
            }
        } catch (Throwable th2) {
            aaj.lnr("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th2.getMessage());
        }
        return false;
    }

    public void qdl(int i10) {
        if (this.mml != null) {
            bjy.qdl qdlVar = new bjy.qdl();
            qdlVar.ud(exu());
            qdlVar.mml(bjy());
            qdlVar.lnr(rdp());
            qdlVar.lnr(i10);
            qdlVar.mml(this.mml.jpc());
            qdlVar.qdl(this.mml.yt());
            this.mml.qdl(qdlVar);
        }
    }
}
