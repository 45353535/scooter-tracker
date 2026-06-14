package com.bytedance.sdk.openadsdk.core.exu.ud;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.WorkerThread;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bykv.vk.openvk.qdl.qdl.qdl.qdl;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.bqt;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.component.utils.tvp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.exu.ud.mo;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.bch;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.mml.wd;
import com.bytedance.sdk.openadsdk.rdp.exu;
import com.bytedance.sdk.openadsdk.rdp.rdp;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends com.bytedance.sdk.openadsdk.core.exu.qdl.qdl {

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private final boolean f17180ag;
    private final boolean ax;
    private boolean car;
    private WeakReference<qdl> cx;
    private long fco;
    private wd gt;
    private final String gy;
    private long hzv;
    private ud irn;
    private final qdl.InterfaceC0202qdl jjk;
    private final boolean mrf;
    private WeakReference<lnr.mml> om;
    private int sy;
    private final Runnable taz;
    private final bqt.qdl tid;
    private int wak;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    private boolean f17181wc;
    private int xi;

    /* JADX INFO: renamed from: yh, reason: collision with root package name */
    private int f17182yh;
    private int zlt;

    public interface qdl {
        void mo();

        void qdl(int i10);
    }

    public lnr(Context context, ViewGroup viewGroup, ljh ljhVar, String str, boolean z10, boolean z11, boolean z12, wd wdVar) {
        super(context, ljhVar, viewGroup);
        this.hzv = 0L;
        this.fco = 0L;
        this.f17181wc = true;
        this.f17182yh = 0;
        this.wak = 0;
        this.jjk = new qdl.InterfaceC0202qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1
            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void mml(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc.zm();
                if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    mmlVarQdl.ud(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).tvp);
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, 3);
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu != null) {
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu.qdl(0);
                }
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void mzz(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc.zm();
                if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    mmlVarQdl.lnr(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).tvp);
                }
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu != null) {
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu.qdl(1);
                }
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, 5);
                            com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, 5);
                            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu != null) {
                                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu.qdl(9);
                            }
                        } catch (Exception unused) {
                        }
                        lnr.this.ag();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc.zm();
                if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                    return;
                }
                mmlVarQdl.mml(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).tvp);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.removeCallbacks(lnr.this.taz);
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (lnr.this.om != null && lnr.this.om.get() != null) {
                            lnr.this.om.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd != null) {
                            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.ud();
                        }
                    }
                });
                if (lnr.this.mrf) {
                    return;
                }
                lnr lnrVar = lnr.this;
                lnrVar.qdl(lnrVar.gt);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, long j10) {
                if (!((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jyq.get()) {
                    lnr.this.koa();
                }
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).uw = false;
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.removeCallbacks(lnr.this.taz);
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd != null) {
                            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.ud();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).bjy || lnr.this.cx == null || lnr.this.cx.get() == null) {
                            return;
                        }
                        ((qdl) lnr.this.cx.get()).mo();
                    }
                });
                lnr.this.hzv();
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, 0);
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu != null) {
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu.lnr();
                }
                lnr lnrVar = lnr.this;
                lnrVar.qdl(lnrVar.gt);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, final com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar2) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                if (ljh.mo(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc)) {
                    com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.5
                        @Override // com.bytedance.sdk.openadsdk.yt.mml
                        public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                            com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                            try {
                                qdlVar3.ud("video_player");
                                qdlVar3.mml(gy.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc));
                                qdlVar3.qdl(BuildConfig.VERSION_NAME);
                            } catch (Throwable unused) {
                            }
                            return qdlVar3;
                        }
                    });
                }
                String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).qdl;
                qdlVar2.qdl();
                qdlVar2.ud();
                qdlVar2.lnr();
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        int iQdl = qdlVar2.qdl();
                        int iUd = qdlVar2.ud();
                        if (!lnr.this.bqt() || iUd == -1004) {
                            if (lnr.this.mml(iQdl, iUd)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).qdl;
                                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, (WeakReference<Context>) null, false);
                                lnr.this.ud(true);
                                lnr.this.mzz();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd != null) {
                                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.ud();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).koa != null) {
                                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).koa.ud(lnr.this.fco, com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).tvp, ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).ekw));
                            }
                            if (lnr.this.om == null || lnr.this.om.get() == null || lnr.this.bqt()) {
                                return;
                            }
                            ((lnr.mml) lnr.this.om.get()).qdl(iQdl, iUd);
                        }
                    }
                });
                lnr.this.qdl(qdlVar2);
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc.zm();
                if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    mmlVarQdl.qdl(com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, 6);
                com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc);
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu != null) {
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu.qdl(14);
                }
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, boolean z13) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd != null) {
                            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.ud();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10, int i11) {
                tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        lnr.this.om();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10, int i11, int i12) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).uw = true;
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd != null) {
                            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.yt();
                            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.postDelayed(lnr.this.taz, RtspMediaSource.DEFAULT_TIMEOUT_MS);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, 2);
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu != null) {
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu.qdl(4);
                }
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i10) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).uw = false;
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.removeCallbacks(lnr.this.taz);
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.10
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.ud();
                    }
                });
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, 0);
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu != null) {
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).vu.qdl(5);
                }
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0202qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, final long j10, final long j11) {
                if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).tvp) < 50) {
                    return;
                }
                if (!((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jyq.get()) {
                    lnr.this.koa();
                }
                lnr lnrVar = lnr.this;
                lnrVar.qdl(lnrVar.gt);
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        lnr.this.qdl(j10, j11);
                        lnr.this.ud(j10, j11);
                    }
                });
            }
        };
        this.zlt = 0;
        this.taz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd != null) {
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jpc, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.ud();
                    lnr.this.ud(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).qdl;
                }
            }
        };
        this.tid = new bqt.qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.6
            @Override // com.bytedance.sdk.component.utils.bqt.qdl
            @WorkerThread
            public void qdl(Context context2, Intent intent, boolean z13, final int i10) {
                fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lnr.this.mo(i10);
                    }
                });
            }
        };
        this.car = false;
        this.sy = jl.lnr(context);
        qdl(z10);
        this.gy = str;
        try {
            this.f17182yh = viewGroup.getWidth();
            this.wak = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        qdl(context);
        this.mrf = true;
        this.ax = z11;
        this.f17180ag = z12;
        if (wdVar != null) {
            this.gt = wdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mml(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        this.zlt++;
        mzz mzzVar = this.f17178wd;
        if (mzzVar == null) {
            return;
        }
        mzzVar.ud();
        lnr.qdl qdlVar = this.koa;
        if (qdlVar != null) {
            qdlVar.qdl(this.fco, com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(this.tvp, this.ekw));
        }
        this.fco = System.currentTimeMillis() - this.hzv;
        if (this.f17181wc) {
            this.f17178wd.qdl(this.jpc, (WeakReference<Context>) null, true);
        }
        if (!this.oth) {
            this.oth = true;
            long j10 = this.ekw;
            ud(j10, j10);
            long j11 = this.ekw;
            this.tvp = j11;
            this.to = j11;
            ud(this.gt);
        }
        if (!this.bjy && this.exc) {
            mzz(this.f17178wd, null);
        }
        this.rdp = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud cx() {
        mzz mzzVar;
        if (this.rq.getResources().getConfiguration().orientation != 1 || (mzzVar = this.f17178wd) == null) {
            return null;
        }
        return mzzVar.exu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar;
        int i10;
        int i11;
        try {
            if (cx() != null && (lnrVar = this.mo) != null && this.xmv != null) {
                int iMml = lnrVar.mml();
                int iMzz = this.mo.mzz();
                final int width = this.xmv.getWidth();
                final int height = this.xmv.getHeight();
                if (width > 0 && height > 0 && iMzz > 0 && iMml > 0) {
                    if (iMml == iMzz) {
                        i11 = width > height ? height : width;
                        i10 = i11;
                    } else if (iMml > iMzz) {
                        i11 = (int) ((((double) width) * 1.0d) / ((double) ((iMml * 1.0f) / iMzz)));
                        i10 = width;
                    } else {
                        i10 = (int) ((((double) height) * 1.0d) / ((double) ((iMzz * 1.0f) / iMml)));
                        i11 = height;
                    }
                    if (i11 <= height && i11 > 0) {
                        height = i11;
                    }
                    if (i10 <= width && i10 > 0) {
                        width = i10;
                    }
                    this.lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (lnr.this.cx() instanceof TextureView) {
                                    ((TextureView) lnr.this.cx()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).qdl;
                                } else if (lnr.this.cx() instanceof SurfaceView) {
                                    ((SurfaceView) lnr.this.cx()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).qdl;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).qdl;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.rq);
            Objects.toString(cx());
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    private void wc() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            if (!lnrVar.wd()) {
                this.mo.qdl(false, this.tvp, this.jtx);
            } else if (this.exu) {
                aaj();
            } else {
                ud(this.hkc);
            }
        }
        if (this.aaj.get()) {
            vu();
        }
    }

    public int ax() {
        return this.xi;
    }

    public void fco() {
        if (this.car && this.ljh) {
            this.car = false;
            bqt.qdl(this.tid);
        }
    }

    public void gy() {
        if (this.mo != null) {
            ud(false);
            kdv();
            this.aaj.set(false);
            this.oth = false;
            qdl(this.gt);
            this.mo.tvp();
        }
    }

    public void jtx() {
        if (this.car || !this.ljh) {
            return;
        }
        Context applicationContext = yt.qdl().getApplicationContext();
        this.car = true;
        bqt.qdl(this.tid, applicationContext);
    }

    public void mo(boolean z10) {
        this.f17181wc = z10;
    }

    public void mrf() {
        com.bytedance.sdk.openadsdk.core.fs.mo moVar = this.vu;
        if (moVar != null) {
            moVar.qdl(13);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void mzz() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.fs();
            this.mo = null;
        }
        if (this.f17181wc) {
            if ("embeded_ad".equals(this.gy)) {
                this.f17178wd.aaj();
            } else {
                this.f17178wd.qdl(this.jpc, (WeakReference<Context>) null, true);
            }
            this.lnr.removeCallbacksAndMessages(null);
            this.fs.clear();
            if (this.bjy) {
                fco();
            }
        }
    }

    public void wd(boolean z10) {
        mzz mzzVar = this.f17178wd;
        if (mzzVar != null) {
            mzzVar.qdl();
        }
        mzz mzzVar2 = this.f17178wd;
        if (mzzVar2 != null && z10) {
            mzzVar2.jl();
        }
        wc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo(int i10) {
        mzz(i10);
        if (i10 == 4) {
            this.yt = false;
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void mml() {
        qdl(true, 3);
    }

    private void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        lnrVar.mml(0);
        this.mo.qdl(lnrVar);
        this.hzv = System.currentTimeMillis();
        this.f17178wd.lnr(8);
        this.f17178wd.lnr(0);
        qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).mo == null) {
                    return;
                }
                lnr.this.hzv = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).f17178wd.mml(0);
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).mo.qdl(true, ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).tvp, ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) lnr.this).jtx);
            }
        });
        if (this.bjy) {
            jtx();
        }
    }

    public void mml(int i10) {
        this.xi = i10;
    }

    public void ud(int i10, int i11) {
        qdl(i10, i11);
        mzz mzzVar = this.f17178wd;
        if (mzzVar == null || i10 <= 0 || i11 <= 0) {
            return;
        }
        mzzVar.lnr(i10, i11);
        this.f17178wd.qdl(i10, i11);
        om();
    }

    public void qdl(final mo.qdl qdlVar) {
        mzz mzzVar;
        if (!this.bjy || (mzzVar = this.f17178wd) == null) {
            return;
        }
        mzzVar.qdl(new mo.qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.lnr.2
            @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.qdl
            public void qdl(View view, int i10) {
                mo.qdl qdlVar2 = qdlVar;
                if (qdlVar2 != null) {
                    qdlVar2.qdl(view, i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(long j10, long j11) {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        this.jpc.lnr(j10);
        this.tvp = j10;
        this.ekw = j11;
        this.f17178wd.qdl(j10, j11);
        this.f17178wd.qdl(com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(j10, j11));
        try {
            lnr.qdl qdlVar = this.koa;
            if (qdlVar != null) {
                qdlVar.qdl(j10, j11);
            }
        } catch (Throwable th2) {
            aaj.qdl(this.qdl, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.jpc.zm();
        if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.qdl(j10, j11, this.vu);
    }

    public void qdl(PAGNativeAd pAGNativeAd) {
        mzz mzzVar;
        if (!this.bjy || (mzzVar = this.f17178wd) == null) {
            return;
        }
        mzzVar.qdl(pAGNativeAd);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void lnr() {
        mzz mzzVar = this.f17178wd;
        if (mzzVar != null) {
            mzzVar.qdl();
        }
        mzz mzzVar2 = this.f17178wd;
        if (mzzVar2 != null) {
            mzzVar2.jl();
        }
        wc();
    }

    private void mzz(int i10) {
        if (this.sy == i10) {
            return;
        }
        this.sy = i10;
        if (i10 != 4 && i10 != 0) {
            this.jl = false;
        }
        if (!this.jl && !exu() && this.ax) {
            lnr(2, i10);
        }
        WeakReference<qdl> weakReference = this.cx;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.cx.get().qdl(this.sy);
    }

    public void qdl(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.f17182yh = i10;
        this.wak = i11;
    }

    public void qdl(ud udVar) {
        this.irn = udVar;
    }

    private void qdl(Context context) {
        ViewGroup exuVar;
        lnr lnrVar;
        if (this.bjy) {
            exuVar = new rdp(context);
        } else {
            exuVar = new exu(context);
        }
        ViewGroup viewGroup = exuVar;
        if (this.bjy) {
            lnrVar = this;
            lnrVar.f17178wd = new mzz(context, viewGroup, true, 17, this.jpc, lnrVar, oth());
        } else {
            lnrVar = this;
            lnrVar.f17178wd = new mml(context, viewGroup, true, 17, lnrVar.jpc, lnrVar, false);
        }
        lnrVar.f17178wd.qdl(this);
    }

    private boolean lnr(int i10, int i11) {
        if (i11 == 0) {
            ud();
            this.yt = true;
            mzz mzzVar = this.f17178wd;
            if (mzzVar != null) {
                mzzVar.qdl(this.jpc, (WeakReference<Context>) null, false);
            }
        }
        if (i11 != 4 && i11 != 0) {
            mzz mzzVar2 = this.f17178wd;
            if (mzzVar2 != null) {
                mzzVar2.qdl();
            }
            ud();
            this.yt = true;
            this.jl = false;
            mzz mzzVar3 = this.f17178wd;
            if (mzzVar3 != null) {
                return mzzVar3.qdl(i10, this.jpc.tdy(), this.f17180ag);
            }
        } else if (i11 == 4) {
            this.yt = false;
            mzz mzzVar4 = this.f17178wd;
            if (mzzVar4 != null) {
                mzzVar4.bjy();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.fs.mo qdl(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.jpc.qh()) {
            return null;
        }
        if (this.vu == null) {
            this.vu = com.bytedance.sdk.openadsdk.core.fs.mo.qdl();
        }
        this.vu.qdl(view, this.jpc);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.vu.qdl((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.vu;
    }

    public void lnr(int i10) {
        mzz(i10);
        if (i10 == 4) {
            this.yt = false;
            lnr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.qdl.qdl
    public void qdl(lnr.mml mmlVar) {
        this.om = new WeakReference<>(mmlVar);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.tvp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.qdl.qdl, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        super.qdl(lnrVar);
        if (this.mo != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(lnrVar.jtx())) {
            return false;
        }
        ud(false);
        lnrVar.jtx();
        lnrVar.ud(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("player_force_raw_url", 0) == 1);
        int i10 = this.xi + 1;
        this.xi = i10;
        lnrVar.mzz = i10;
        ud(lnrVar);
        kdv();
        com.bytedance.sdk.openadsdk.core.fs.mo moVar = this.vu;
        if (moVar != null) {
            moVar.qdl(false, 0.0f);
        }
        if (!bch.ud(this.gy) || this.tvp <= 0) {
            this.tvp = lnrVar.to();
        }
        if (bch.ud(this.gy) && this.tvp == this.ekw) {
            this.tvp = 0L;
        }
        if (lnrVar.to() <= 0) {
            this.oth = false;
            this.aaj.set(false);
        } else {
            long j10 = lnrVar.to();
            this.tvp = j10;
            this.to = Math.max(this.to, j10);
        }
        mzz mzzVar = this.f17178wd;
        if (mzzVar != null) {
            mzzVar.qdl();
            if (this.zlt == 0) {
                this.f17178wd.wd();
            }
            this.f17178wd.lnr(lnrVar.jpc(), lnrVar.tvp());
            this.f17178wd.lnr(this.xmv);
            this.f17178wd.qdl(lnrVar.jpc(), lnrVar.tvp());
        }
        if (this.mo == null) {
            com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.exu.mml.lnr();
            this.mo = lnrVar2;
            lnrVar2.qdl(this.jjk);
        }
        jl();
        this.fco = 0L;
        try {
            lnr(lnrVar);
            return true;
        } catch (Exception e10) {
            qdl(new com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl(-10, 0, e10.getMessage()));
            aaj.lnr(this.qdl, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e10)));
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl(boolean z10, int i10) {
        if (!this.oth && this.aaj.get()) {
            if (z10) {
                qdl(i10, false);
                this.oth = false;
            } else {
                rc();
            }
        }
        mzz();
        com.bytedance.sdk.openadsdk.core.fs.mo moVar = this.vu;
        if (moVar != null) {
            moVar.mml();
        }
    }

    public final void qdl(int i10, boolean z10) {
        if (z10 || this.kdv) {
            if (z10) {
                this.kdv = false;
            }
            if (this.oth || !this.aaj.get()) {
                return;
            }
            bjy.qdl qdlVar = new bjy.qdl();
            qdlVar.ud(mo());
            qdlVar.mml(tvp());
            qdlVar.lnr(wd());
            qdlVar.lnr(i10);
            qdlVar.mml(jpc());
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.f17178wd, qdlVar, this.gt);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view) {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return;
        }
        if (lnrVar.mo()) {
            ud();
            this.f17178wd.ud(true, false);
            this.f17178wd.mo();
            return;
        }
        if (!this.mo.wd()) {
            mzz mzzVar = this.f17178wd;
            if (mzzVar != null) {
                mzzVar.lnr(this.xmv);
            }
            mzz(this.tvp);
            mzz mzzVar2 = this.f17178wd;
            if (mzzVar2 != null) {
                mzzVar2.ud(false, false);
                return;
            }
            return;
        }
        wd(false);
        mzz mzzVar3 = this.f17178wd;
        if (mzzVar3 != null) {
            mzzVar3.ud(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.qdl.qdl
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view, boolean z10) {
        lnr(!this.exc);
        if (this.rq instanceof Activity) {
            mzz mzzVar = this.f17178wd;
            if (mzzVar != null) {
                mzzVar.ud(this.xmv);
                this.f17178wd.lnr(false);
            }
            qdl(1);
            WeakReference<lnr.ud> weakReference = this.bqt;
            lnr.ud udVar2 = weakReference != null ? weakReference.get() : null;
            if (udVar2 != null) {
                udVar2.qdl(this.exc);
            }
        }
    }

    public void qdl(qdl qdlVar) {
        this.cx = new WeakReference<>(qdlVar);
    }
}
