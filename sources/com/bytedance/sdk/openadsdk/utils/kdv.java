package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.exu.mml.qdl;

/* JADX INFO: loaded from: classes6.dex */
public class kdv implements Handler.Callback, qdl.InterfaceC0256qdl {
    private int fs;
    private boolean jpc;
    private final com.bytedance.sdk.openadsdk.core.model.ljh mml;
    private boolean mo;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl mzz;
    private int to;
    private boolean tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private boolean f17878wd;
    private float qdl = 1.0f;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17877ud = 1000;
    private final Handler lnr = new Handler(Looper.getMainLooper(), this);
    private int rq = 0;

    public kdv(@NonNull com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, @NonNull com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        this.to = 0;
        this.fs = 0;
        this.mzz = qdlVar;
        this.mml = ljhVar;
        if (ljhVar.mq()) {
            if (ljhVar.qg() >= 0) {
                this.fs = ljhVar.qg();
            } else {
                this.fs = com.bytedance.sdk.openadsdk.core.yt.mml().to(String.valueOf(ljhVar.fz()));
            }
        } else if (ljhVar.nni()) {
            if (ljhVar.ws() >= 0) {
                this.fs = ljhVar.ws();
            } else {
                this.fs = com.bytedance.sdk.openadsdk.core.yt.mml().exc(String.valueOf(ljhVar.fz()));
            }
        }
        this.to = (int) qdlVar.bch.fco();
        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "totalTime: " + this.to + ", skipTime=" + this.fs);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1024) {
            int i10 = this.to;
            int i11 = this.rq;
            int i12 = i10 - i11;
            this.mzz.bch.qdl(((long) i11) * 1000);
            com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.rq + ", mRemainTimeInSeconds=" + i12);
            if (i12 > 0) {
                Activity activity = this.mzz.f17086ag;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).lnr(((long) this.rq) * 1000, this.to);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.to toVar = this.mzz.bqt;
                boolean z10 = false;
                if (toVar != null && toVar.qdl() != null) {
                    this.mzz.bqt.qdl().setTime(String.valueOf(i12), this.rq, 0, false);
                }
                if (this.mml.mq()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.to toVar2 = this.mzz.bqt;
                    if (toVar2 != null) {
                        if (toVar2.tvp() && this.fs > 0) {
                            z10 = true;
                        }
                        this.tvp = z10;
                    }
                    if (!this.tvp || this.rq < this.fs || this.mzz.f17090ud.taz() == 5 || this.mzz.f17090ud.taz() == 33) {
                        this.mzz.fco.qdl(String.valueOf(i12), null);
                    } else {
                        this.mzz.qdl(true);
                        this.mzz.fco.qdl(String.valueOf(i12), TTAdDislikeToast.getSkipText());
                        this.mzz.fco.mzz(true);
                    }
                } else if (this.mml.nni() && (this.mzz.bqt.tvp() || this.mzz.f17090ud.au())) {
                    Activity activity2 = this.mzz.f17086ag;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).lnr(this.rq);
                    }
                    this.mzz.fco.mml(true);
                    this.mzz.fco.qdl(String.valueOf(i12), null);
                }
                this.rq++;
                if (this.mzz.bch.lnr()) {
                    com.bytedance.sdk.openadsdk.core.model.rc rcVarEu = this.mzz.f17090ud.eu();
                    if (rcVarEu != null) {
                        float fQdl = rcVarEu.qdl();
                        this.qdl = fQdl;
                        if (fQdl <= 0.0f) {
                            this.qdl = 1.0f;
                        }
                    }
                } else {
                    this.qdl = 1.0f;
                }
                int i13 = (int) (1000.0f / this.qdl);
                com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i13)));
                this.lnr.sendEmptyMessageDelayed(message.what, i13);
            }
        }
        return true;
    }

    public void lnr() {
        if (this.mo) {
            this.lnr.removeMessages(1024);
            this.lnr.sendEmptyMessage(1024);
            this.f17878wd = false;
        }
    }

    public void mml() {
        if (!this.mo || this.f17878wd) {
            return;
        }
        this.lnr.removeMessages(1024);
        this.f17878wd = true;
    }

    public void mzz() {
        this.lnr.removeMessages(1024);
        this.mo = false;
        this.jpc = true;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.mzz;
        if (qdlVar != null) {
            qdlVar.bch.rc();
        }
    }

    public boolean qdl() {
        return this.mo;
    }

    public void ud() {
        this.lnr.sendEmptyMessage(1024);
        this.f17878wd = false;
    }

    public void qdl(long j10) {
        int iCeil = (int) Math.ceil(j10 / 1000.0d);
        if (this.f17878wd && !this.jpc) {
            this.rq = iCeil;
            lnr();
        } else {
            if (this.mo || this.jpc) {
                return;
            }
            this.rq = iCeil;
            this.mo = true;
            ud();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.qdl.InterfaceC0256qdl
    public void qdl(int i10) {
        com.bytedance.sdk.component.utils.aaj.qdl("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i10)));
        if (i10 == 1) {
            lnr();
            return;
        }
        if (i10 == 2) {
            mml();
        } else if (i10 == 3 || i10 == 4) {
            mzz();
        }
    }
}
