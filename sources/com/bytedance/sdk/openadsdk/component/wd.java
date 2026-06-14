package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.mo;
import com.bytedance.sdk.openadsdk.core.aaj;
import com.bytedance.sdk.openadsdk.core.jpc;
import com.bytedance.sdk.openadsdk.core.jyq;
import com.bytedance.sdk.openadsdk.core.model.bqt;
import com.bytedance.sdk.openadsdk.core.model.kdv;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class wd implements koa.qdl {
    private int jpc;
    private final mo lnr;
    private AdSlot mo;
    private final Context qdl;
    private boolean rq;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final oth<com.bytedance.sdk.openadsdk.mml.qdl> f17148ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private PAGAppOpenAdLoadListener f17149wd;
    private final AtomicBoolean mml = new AtomicBoolean(false);
    private int mzz = 0;
    private volatile int tvp = 0;
    private final kdv to = new kdv();

    public wd(Context context) {
        if (context != null) {
            this.qdl = context.getApplicationContext();
        } else {
            this.qdl = yt.qdl();
        }
        this.f17148ud = yt.lnr();
        this.lnr = mo.qdl(this.qdl);
    }

    private void lnr(final AdSlot adSlot) {
        final mrf mrfVarUd = mrf.ud();
        bqt bqtVar = new bqt();
        bqtVar.rq = this.to;
        bqtVar.mml = 1;
        bqtVar.tvp = 2;
        this.f17148ud.qdl(adSlot, bqtVar, 3, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.wd.1
            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
                wd.this.tvp = 3;
                wd.this.qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                wd.this.qdl(qdlVar, lnrVar, adSlot, mrfVarUd);
            }
        });
    }

    private void mml(final AdSlot adSlot) {
        final mrf mrfVarUd = mrf.ud();
        bqt bqtVar = new bqt();
        bqtVar.rq = this.to;
        bqtVar.mml = 1;
        bqtVar.tvp = 2;
        this.f17148ud.qdl(adSlot, bqtVar, 3, new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.component.wd.2
            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
                wd.this.tvp = 3;
                wd.this.qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                wd.this.qdl(qdlVar, lnrVar, adSlot, mrfVarUd);
            }
        });
    }

    private void ud(@NonNull AdSlot adSlot) {
        this.tvp = 1;
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            lnr(adSlot);
        } else {
            mml(adSlot);
        }
    }

    public static wd qdl(Context context) {
        return new wd(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud() {
        final mrf mrfVarUd = mrf.ud();
        bqt bqtVar = new bqt();
        bqtVar.rq = this.to;
        bqtVar.mml = 1;
        bqtVar.tvp = 2;
        this.tvp = 1;
        this.f17148ud.qdl(this.mo, bqtVar, 3, (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.component.wd.5
            boolean qdl = false;

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public String qdl() {
                return wd.this.lnr.lnr(wd.this.mzz);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.aaj
            public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
                ljh ljhVarMo;
                if (qdlVar != null && qdlVar.mzz() && (ljhVarMo = qdlVar.mo()) != null) {
                    boolean zMzz = ljh.mzz(ljhVarMo);
                    if (!ljhVarMo.xmv() && zMzz && TextUtils.isEmpty(wd.this.lnr.qdl(ljhVarMo))) {
                        this.qdl = false;
                        com.bytedance.sdk.openadsdk.component.mml.qdl.ud(qdlVar.mo());
                    } else {
                        this.qdl = true;
                    }
                    com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(ljhVarMo);
                }
                return this.qdl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(int i10, String str) {
                wd.this.tvp = 3;
                wd.this.qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
            public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                if (this.qdl) {
                    wd.this.qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 101, qdlVar.mo(), (com.bytedance.sdk.openadsdk.core.model.qdl) null));
                } else {
                    wd wdVar = wd.this;
                    wdVar.qdl(qdlVar, lnrVar, wdVar.mo, mrfVarUd);
                }
            }
        });
    }

    public void qdl(@NonNull AdSlot adSlot, com.bytedance.sdk.openadsdk.common.mo moVar, int i10) {
        if (moVar == null) {
            return;
        }
        if (i10 <= 0) {
            i10 = 3500;
        }
        this.mo = adSlot;
        this.to.qdl = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (moVar instanceof PAGAppOpenAdLoadListener) {
            this.f17149wd = (PAGAppOpenAdLoadListener) moVar;
        }
        this.mzz = qdl(this.mo);
        this.jpc = i10;
        this.to.qdl(mrf.ud());
        if (Build.VERSION.SDK_INT >= 24) {
            this.to.ud(com.bytedance.sdk.openadsdk.component.wd.qdl.ud());
            this.to.ud(com.bytedance.sdk.openadsdk.component.wd.qdl.lnr());
        }
        if (this.to.qdl) {
            ud(this.mo);
        } else {
            new koa(rdp.ud().getLooper(), this).sendEmptyMessageDelayed(1, i10);
            qdl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr() {
        ljh ljhVarMml = this.lnr.mml(this.mzz);
        if (ljhVarMml != null) {
            if (ljhVarMml.ji() == null) {
                ljhVarMml.qdl(this.mo);
            }
            com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(ljhVarMml);
            boolean zMzz = ljh.mzz(ljhVarMml);
            if (!ljhVarMml.xmv() && zMzz) {
                if (TextUtils.isEmpty(this.lnr.qdl(ljhVarMml))) {
                    qdl(false);
                    com.bytedance.sdk.openadsdk.component.mml.qdl.ud(ljhVarMml);
                    return;
                } else {
                    qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 101, ljhVarMml, (com.bytedance.sdk.openadsdk.core.model.qdl) null));
                    return;
                }
            }
            qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 101, ljhVarMml, (com.bytedance.sdk.openadsdk.core.model.qdl) null));
            return;
        }
        qdl(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar, AdSlot adSlot, mrf mrfVar) {
        this.tvp = 2;
        if (qdlVar != null && qdlVar.mml() != null && qdlVar.mml().size() != 0) {
            final ljh ljhVar = qdlVar.mml().get(0);
            long jJjk = ljhVar.jjk();
            this.to.f17361ud = jJjk;
            boolean zWd = ljh.wd(ljhVar);
            if (ljhVar.xmv()) {
                qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar));
                return;
            }
            if (!zWd && !ljhVar.ilu()) {
                if (ljh.mzz(ljhVar)) {
                    int iFs = yt.mml().fs();
                    if (iFs != 1 && iFs != 3) {
                        qdl(ljhVar, adSlot, !this.to.qdl, qdlVar);
                        if (this.to.qdl) {
                            com.bytedance.sdk.openadsdk.bjy.lnr.qdl(ljhVar, mrfVar.mml());
                            if (jJjk == 0) {
                                this.to.qdl(2);
                                qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar));
                                return;
                            } else {
                                rdp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.wd.3
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        wd.this.to.qdl(2);
                                        wd.this.qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar));
                                    }
                                }, jJjk);
                                return;
                            }
                        }
                        return;
                    }
                    kdv kdvVar = this.to;
                    kdvVar.f17361ud = -1L;
                    kdvVar.qdl(3);
                    qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar));
                    qdl(ljhVar, adSlot, false, qdlVar);
                    return;
                }
                kdv kdvVar2 = this.to;
                kdvVar2.f17361ud = -1L;
                kdvVar2.qdl(3);
                qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar));
                qdl(ljhVar, false, qdlVar);
                return;
            }
            qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar));
            if (ljh.mzz(ljhVar)) {
                qdl(ljhVar, adSlot, false, qdlVar);
                return;
            } else {
                qdl(ljhVar, false, qdlVar);
                return;
            }
        }
        this.tvp = 3;
        qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(2, 100, 20001, jpc.qdl(20001)));
        lnrVar.qdl(-3);
        lnrVar.lnr(3);
        com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
    }

    private void qdl() {
        fco.ud(new com.bytedance.sdk.component.jpc.jpc("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.wd.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
                    wd.this.ud();
                } else {
                    wd.this.lnr();
                }
            }
        });
    }

    private void qdl(boolean z10) {
        if (z10) {
            this.lnr.mo(this.mzz);
        }
        ud(this.mo);
    }

    private void qdl(@NonNull final ljh ljhVar, AdSlot adSlot, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        this.lnr.qdl(ljhVar, adSlot, this.to, new mo.ud() { // from class: com.bytedance.sdk.openadsdk.component.wd.6
            @Override // com.bytedance.sdk.openadsdk.component.mo.ud
            public void qdl() {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z10) {
                    wd.this.tvp = 4;
                    com.bytedance.sdk.openadsdk.component.mzz.ud udVar = new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar);
                    udVar.qdl(true);
                    wd.this.qdl(udVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.mo.ud
            public void qdl(int i10, String str) {
                if (z10) {
                    wd.this.tvp = 5;
                    wd.this.qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(2, 100, 10003, jpc.qdl(10003)));
                }
            }
        });
    }

    private void qdl(@NonNull final ljh ljhVar, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        this.lnr.qdl(ljhVar, this.to, new mo.qdl() { // from class: com.bytedance.sdk.openadsdk.component.wd.7
            @Override // com.bytedance.sdk.openadsdk.component.mo.qdl
            public void qdl(com.bytedance.sdk.openadsdk.jl.qdl.ud udVar) {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z10) {
                    wd.this.tvp = 4;
                    com.bytedance.sdk.openadsdk.component.mzz.ud udVar2 = new com.bytedance.sdk.openadsdk.component.mzz.ud(1, 100, ljhVar, qdlVar);
                    udVar2.qdl(true);
                    wd.this.qdl(udVar2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.mo.qdl
            public void qdl() {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z10) {
                    wd.this.tvp = 5;
                    wd.this.qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(2, 100, 10003, jpc.qdl(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.component.mzz.ud udVar) {
        int iUd = udVar.ud();
        int iLnr = udVar.lnr();
        com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(this.to, iLnr, iUd);
        if (!this.mml.compareAndSet(false, true)) {
            if (iUd == 1 && iLnr == 100 && !this.to.qdl) {
                mo.qdl(yt.qdl()).qdl(new com.bytedance.sdk.openadsdk.component.mzz.qdl(this.mzz, udVar.mml(), udVar.qdl()));
                if (this.rq) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(udVar.mml(), 1, this.to);
                return;
            }
            return;
        }
        if (iUd != 1) {
            if (iUd == 2 || iUd == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.f17149wd;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(udVar.mzz(), udVar.mo());
                }
                if (iUd == 3) {
                    com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(this.tvp, this.jpc);
                    return;
                }
                return;
            }
            return;
        }
        if (iLnr == 100 && !this.to.qdl) {
            this.lnr.qdl(new com.bytedance.sdk.openadsdk.component.mzz.qdl(this.mzz, udVar.mml(), udVar.qdl()));
        }
        if (this.f17149wd != null) {
            this.f17149wd.onAdLoaded(new mml(this.qdl, udVar.mml(), iLnr == 101, this.mo));
        }
        if (iLnr == 101) {
            com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(udVar.mml(), this.to.qdl().mml());
        } else if (iLnr == 100) {
            com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(udVar.mml(), 0, this.to);
            this.rq = true;
        }
    }

    public int qdl(@NonNull AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        if (message.what != 1 || this.mml.get()) {
            return;
        }
        qdl(new com.bytedance.sdk.openadsdk.component.mzz.ud(3, 102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, jpc.qdl(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
