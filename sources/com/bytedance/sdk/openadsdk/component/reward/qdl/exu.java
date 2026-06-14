package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class exu {
    private com.bytedance.adsdk.ugeno.ud.lnr exu;
    private volatile long jpc;
    private FrameLayout lnr;
    private volatile long mo;
    final ljh qdl;
    private com.bytedance.adsdk.ugeno.ud.lnr rdp;
    private String tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final qdl f17063ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private volatile long f17064wd;
    private boolean yt;
    private final AtomicBoolean mml = new AtomicBoolean(false);
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private final AtomicBoolean to = new AtomicBoolean(false);
    private long rq = 0;
    private long fs = 0;
    private String bjy = null;
    private boolean jtx = false;

    public exu(qdl qdlVar) {
        this.f17063ud = qdlVar;
        this.qdl = qdlVar.f17090ud;
        this.tvp = qdlVar.mzz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rdp() {
        com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVarRc;
        ljh ljhVar = this.qdl;
        if (ljhVar == null || (qdlVarRc = ljhVar.rc()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rq.mml.ud udVar = new com.bytedance.sdk.openadsdk.core.rq.mml.ud(this.f17063ud.f17086ag, this.qdl, qdlVarRc, this.tvp, new com.bytedance.sdk.openadsdk.core.rq.wd.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.3
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void ud(String str) {
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, true, exuVar.tvp, "success", SystemClock.elapsedRealtime() - exu.this.fs, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(String str) {
                exu.this.fs = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(int i10, String str, String str2) {
                exu.this.mzz.set(false);
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, true, exuVar.tvp, C4240b4.g.f42582e, SystemClock.elapsedRealtime() - exu.this.fs, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(int i10, String str) {
                exu.this.mzz.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
                exu.this.rdp = lnrVar;
                exu.this.mzz.set(true);
            }
        });
        udVar.qdl(new com.bytedance.sdk.openadsdk.core.rq.wd.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.4
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
            public String qdl() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
            public void ud() {
                exu.this.jtx = true;
                exu.this.f17063ud.gy.to().performClick();
            }
        });
        udVar.qdl();
        udVar.qdl(this.f17063ud.gy.to());
    }

    public boolean exu() {
        return this.mzz.get();
    }

    public boolean fs() {
        return this.mml.get();
    }

    public void rq() {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(SystemClock.elapsedRealtime() - this.jpc, this.qdl, this.tvp);
    }

    public void to() {
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(this.qdl, this.tvp);
    }

    public void jpc() {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.rdp;
        if (lnrVar != null) {
            this.lnr.addView(lnrVar.rq(), new FrameLayout.LayoutParams(this.rdp.fco(), this.rdp.mrf()));
        }
    }

    public boolean mml() {
        return this.jtx;
    }

    public void mo() {
        this.jpc = SystemClock.elapsedRealtime();
    }

    public void mzz() {
        this.mo = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.qdl, this.tvp);
    }

    public void tvp() {
        if (this.jpc <= 0 || this.f17064wd <= 0 || this.to.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(this.f17064wd - this.jpc, this.qdl, this.tvp, this.bjy);
    }

    public void wd() {
        to();
        tvp();
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.exu;
        if (lnrVar != null) {
            this.lnr.addView(lnrVar.rq(), new FrameLayout.LayoutParams(this.exu.fco(), this.exu.mrf()));
        }
    }

    public void lnr() {
        com.bytedance.sdk.openadsdk.core.rq.jpc.qdl qdlVarVu;
        ljh ljhVar = this.qdl;
        if (ljhVar == null || (qdlVarVu = ljhVar.vu()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.rq.mml.ud udVar = new com.bytedance.sdk.openadsdk.core.rq.mml.ud(this.f17063ud.f17086ag, this.qdl, qdlVarVu, this.tvp, new com.bytedance.sdk.openadsdk.core.rq.wd.ud() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.1
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(String str) {
                exu.this.rq = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void ud(String str) {
                exu.this.bjy = str;
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, false, exuVar.tvp, "success", SystemClock.elapsedRealtime() - exu.this.rq, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.lnr
            public void qdl(int i10, String str, String str2) {
                exu.this.bjy = str2;
                exu.this.mml.set(false);
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, false, exuVar.tvp, C4240b4.g.f42582e, SystemClock.elapsedRealtime() - exu.this.rq, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl() {
                exu.this.mzz();
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(int i10, String str) {
                exu.this.mml.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, exuVar.tvp, jElapsedRealtime - exu.this.mo, i10, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.ud
            public void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
                exu.this.exu = lnrVar;
                exu.this.mml.set(true);
                exu.this.f17064wd = SystemClock.elapsedRealtime();
                if (exu.this.f17063ud.hkc.aaj()) {
                    View view = exu.this.f17063ud.gy.to();
                    if (view instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                        ((com.bytedance.sdk.openadsdk.core.mo.mml) view).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(exu.this.f17063ud.om, "tt_skip_btn"));
                    }
                }
                exu.this.rdp();
                exu.this.tvp();
                exu exuVar = exu.this;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(exuVar.qdl, exuVar.tvp, exu.this.f17064wd - exu.this.mo);
            }
        });
        if (this.qdl.rc() != null) {
            udVar.qdl(new com.bytedance.sdk.openadsdk.core.rq.wd.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.exu.2
                @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
                public String qdl() {
                    return Constants.NORMAL;
                }

                @Override // com.bytedance.sdk.openadsdk.core.rq.wd.qdl
                public void ud() {
                }
            });
        }
        udVar.qdl();
        udVar.qdl(this.f17063ud.gy.to());
    }

    void ud() {
        this.lnr = (FrameLayout) this.f17063ud.ax.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.bjy);
    }

    public void qdl() {
        if (this.yt) {
            return;
        }
        this.yt = true;
        ud();
    }

    public void qdl(int i10) {
        ax.qdl((View) this.lnr, i10);
    }
}
