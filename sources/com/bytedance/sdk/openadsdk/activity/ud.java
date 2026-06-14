package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.reward.exu;
import com.bytedance.sdk.openadsdk.component.reward.qdl.rq;
import com.bytedance.sdk.openadsdk.component.reward.rq;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.bch;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static com.bytedance.sdk.openadsdk.qdl.lnr.ud lnr;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.qdl.mzz.qdl f16893ud;
    private boolean aaj;
    private Bundle bjy;
    private Activity exu;
    private final boolean fs;
    private Runnable jl;
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud jpc;
    private boolean jtx;
    private boolean jyq;
    private final ljh mml;
    private final com.bytedance.sdk.openadsdk.fs.tvp mo;
    private final boolean oth;
    public rq qdl;
    private int rdp;
    private com.bytedance.sdk.openadsdk.activity.lnr rq;
    private final boolean to;
    private final boolean tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.qdl.mzz.qdl f16894wd;
    private boolean yt;
    private final Bundle mzz = new Bundle();
    private final rq.ud exc = new rq.ud();

    public static class lnr implements Runnable {
        private final ljh qdl;

        public lnr(ljh ljhVar) {
            this.qdl = ljhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.qdl.ilu()) {
                return;
            }
            if (this.qdl.mq()) {
                exu.qdl(yt.qdl()).qdl(this.qdl.ji());
            } else {
                com.bytedance.sdk.openadsdk.component.reward.mzz.qdl(yt.qdl()).qdl(this.qdl.ji());
            }
        }
    }

    static class mml extends AbstractC0247ud {
        private boolean fs;
        private int rq;
        private final int to;

        public mml(ud udVar, ljh ljhVar, com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar) {
            super(udVar, ljhVar, lnrVar);
            if (ljhVar == null) {
                this.to = 100;
            } else if (ljhVar.ijp() >= 0) {
                this.to = Math.min(100, ljhVar.ijp());
            } else {
                this.to = yt.mml().xmv(String.valueOf(ljhVar.fz())).mo;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ud.AbstractC0247ud, android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (!this.fs && this.mml <= this.rq) {
                this.fs = true;
                jpc jpcVar = this.qdl.to();
                if (jpcVar != null) {
                    jpcVar.xi();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ud.AbstractC0247ud
        protected int qdl(ljh ljhVar) {
            if (ljhVar != null) {
                return ljhVar.ka();
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ud.AbstractC0247ud
        public void qdl(int i10, ljh ljhVar) {
            boolean z10 = this.mo == 0;
            int i11 = this.mml;
            super.qdl(i10, ljhVar);
            if (!z10) {
                if (this.lnr < i11) {
                    this.rq = (int) ((1.0f - (this.to / 100.0f)) * this.mml);
                    return;
                }
                return;
            }
            if (this.mo == 1) {
                this.rq = 3;
            } else {
                this.rq = (int) ((1.0f - (this.to / 100.0f)) * this.lnr);
            }
            com.bytedance.sdk.openadsdk.component.reward.rq rqVar = this.qdl.qdl;
            if (rqVar != null) {
                rqVar.qdl(this.mml);
            }
        }
    }

    public static class mzz {
        public final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl lnr;
        public boolean mml;
        public boolean mzz;
        public final Bundle qdl = new Bundle();

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public final int f16898ud;

        public mzz(int i10, com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
            this.f16898ud = i10;
            this.lnr = qdlVar;
        }

        public String toString() {
            return super.toString();
        }
    }

    static class qdl extends AbstractC0247ud {
        public qdl(ud udVar, ljh ljhVar, com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar) {
            super(udVar, ljhVar, lnrVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.ud.AbstractC0247ud
        protected int qdl(ljh ljhVar) {
            if (ljhVar != null) {
                return ljhVar.qgg();
            }
            return 5;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.ud$ud, reason: collision with other inner class name */
    static abstract class AbstractC0247ud implements Handler.Callback {
        private int aaj;

        /* JADX INFO: renamed from: ag, reason: collision with root package name */
        private int f16899ag;
        private int ax;
        private int bch;
        private boolean bjy;
        private boolean bqt;
        private boolean cx;
        private int ekw;
        private boolean fco;
        private final Context fs;
        private boolean gy;
        private int hkc;
        private int hzv;
        private float jl;
        private boolean jtx;
        private int jyq;
        private int koa;
        private int ljh;
        protected float lnr;
        protected int mml;
        protected int mo;
        private boolean mrf;
        protected int mzz;
        private boolean om;
        private int oth;
        protected final ud qdl;

        /* JADX INFO: renamed from: rc, reason: collision with root package name */
        private int f16900rc;
        private boolean rdp;
        private final com.bytedance.sdk.openadsdk.component.reward.top.lnr rq;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        protected ljh f16901ud;
        private int uw;
        private boolean vu;

        /* JADX INFO: renamed from: wc, reason: collision with root package name */
        private int f16902wc;
        private boolean xmv;

        /* JADX INFO: renamed from: yh, reason: collision with root package name */
        private boolean f16904yh;
        private boolean yt;
        private final Handler to = new Handler(Looper.getMainLooper(), this);
        private final int exu = 1000;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        protected int f16903wd = -1;
        private int exc = 1000;
        private boolean kdv = false;
        boolean jpc = false;
        public int tvp = -1;

        public AbstractC0247ud(ud udVar, ljh ljhVar, com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar) {
            this.qdl = udVar;
            this.f16901ud = ljhVar;
            this.rq = lnrVar;
            this.fs = lnrVar.getContext();
            this.mml = qdl(ljhVar);
        }

        private void exu() {
            int i10 = this.hkc;
            int i11 = this.ax;
            boolean z10 = this.cx;
            int i12 = this.f16902wc;
            int i13 = this.f16899ag;
            if (i10 < i11 || z10) {
                return;
            }
            if (i12 >= i13) {
                this.om = false;
            } else {
                this.f16902wc = i12 + 1;
                rdp();
            }
        }

        private void fs() {
            com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar;
            if (this.vu || this.bjy || this.jtx || (lnrVar = this.rq) == null) {
                return;
            }
            lnrVar.setShowEndCardNextAd(true, this.f16901ud);
        }

        private void mml(int i10) {
            if (this.f16903wd > 0 && this.yt && i10 == 3) {
                this.mo = i10;
                qdl(i10, 1000);
            }
        }

        private void mzz(int i10) {
            if (this.f16904yh && i10 == 4) {
                this.mo = i10;
                qdl(i10, 1000);
            }
        }

        private void rdp() {
            jpc jpcVar;
            this.cx = true;
            this.hkc = 0;
            ud udVar = this.qdl;
            if (udVar == null || (jpcVar = udVar.to()) == null || jpcVar.mlb()) {
                return;
            }
            fs();
        }

        private void rq() {
            if (this.qdl.jl()) {
                this.rq.showSkipButton();
                this.bjy = true;
            } else {
                this.jtx = true;
                this.rq.showCloseButton();
            }
            this.rq.setShowPlayableNextAd(false, this.f16901ud);
        }

        private void to() {
            int i10 = this.f16903wd;
            if (i10 > 0) {
                this.f16903wd = i10 - 1;
            }
            if (this.f16903wd == 0 && this.yt) {
                this.yt = false;
                ud udVar = this.qdl;
                if (udVar == null || udVar.to() == null) {
                    return;
                }
                jpc jpcVar = this.qdl.to();
                if (jpcVar instanceof com.bytedance.sdk.openadsdk.activity.mzz) {
                    ((com.bytedance.sdk.openadsdk.activity.mzz) jpcVar).to();
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                qdl(message);
            } else if (i10 == 3) {
                if (this.f16903wd > 0) {
                    to();
                    if (this.f16903wd >= 0) {
                        qdl(message.what, 1000);
                    }
                }
            } else if (i10 == 4) {
                if (this.f16904yh) {
                    mzz();
                    if (this.f16904yh && !this.vu) {
                        qdl(message.what, 1000);
                    }
                }
            } else if (i10 == 5 && this.om) {
                wd();
                if (this.om && !this.vu) {
                    qdl(message.what, 1000);
                }
            }
            return true;
        }

        public void jpc() {
            if (this.om) {
                fs();
                this.cx = false;
            }
        }

        public void lnr() {
            this.to.removeMessages(this.mo);
        }

        public void mo() {
            this.bqt = true;
        }

        public int qdl() {
            return this.mml;
        }

        protected abstract int qdl(ljh ljhVar);

        public void tvp() {
            if (this.om) {
                this.cx = true;
            }
        }

        public void ud() {
            this.f16904yh = false;
            this.om = false;
            this.jpc = false;
            this.f16900rc = 0;
            this.tvp = -1;
            this.cx = false;
            this.f16899ag = 0;
            this.hkc = 0;
            this.ekw = 0;
            this.xmv = false;
            this.f16902wc = 0;
            this.kdv = false;
            com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.rq;
            if (lnrVar != null) {
                lnrVar.setShowPlayableNextAd(false, this.f16901ud);
            }
        }

        public void wd() {
            if (this.bqt && this.om && !this.vu) {
                int i10 = this.ekw;
                int i11 = this.hkc;
                boolean z10 = this.xmv;
                int i12 = i10 + 1;
                this.ekw = i12;
                this.hkc = i11 + 1;
                if (z10 && i12 >= this.hzv) {
                    fs();
                }
                if (this.mrf || this.fco) {
                    exu();
                }
            }
        }

        public void lnr(int i10) {
            this.f16903wd = i10;
            if (i10 > 0) {
                this.yt = true;
                if (this.mml <= 0 || this.bjy) {
                    mml(3);
                }
            }
        }

        public void qdl(boolean z10) {
            this.xmv = z10;
            this.hkc = 0;
            if (z10) {
                int i10 = this.ljh;
                int i11 = this.jyq;
                this.aaj = i10 - i11;
                this.uw = i11;
                this.bch = i10;
            }
        }

        public void mml() {
            if (this.bjy || this.jtx) {
                return;
            }
            qdl(-1);
            this.kdv = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.rq;
            if (lnrVar != null) {
                lnrVar.setCountDownFor1InN("", -1);
                this.rq.setShowEndCardNextAd(true, this.f16901ud);
            }
        }

        public void mzz() {
            if (this.bqt && this.f16904yh) {
                if (this.jtx) {
                    this.f16904yh = false;
                }
                if (this.vu) {
                    return;
                }
                int i10 = this.koa;
                boolean z10 = this.xmv;
                int i11 = i10 + 1;
                this.koa = i11;
                if (z10) {
                    this.bch = this.ljh;
                } else {
                    this.bch = this.aaj + this.jyq;
                }
                if (i11 >= this.aaj) {
                    if (!this.jpc) {
                        this.f16900rc++;
                        this.jpc = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.mml);
                            jSONObject.put("hint_sequence", this.f16900rc);
                            com.bytedance.sdk.openadsdk.mml.lnr.mml(this.f16901ud, this.qdl.to().b_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.lnr lnrVar = this.qdl.rq;
                    int i12 = this.uw;
                    this.uw = i12 - 1;
                    lnrVar.qdl(i12, this.mml);
                } else {
                    this.jpc = false;
                    this.qdl.rq.qdl(-1, this.mml);
                }
                if (this.xmv && this.koa >= this.oth) {
                    boolean z11 = this.bjy;
                    boolean z12 = this.jtx;
                    if (!z11 && !z12) {
                        this.rq.setShowPlayableNextAd(true, this.f16901ud);
                    }
                }
                if (this.koa < this.bch || this.qdl.to() == null) {
                    return;
                }
                jpc jpcVar = this.qdl.to();
                if (jpcVar instanceof com.bytedance.sdk.openadsdk.activity.mzz) {
                    this.to.removeMessages(4);
                    ((com.bytedance.sdk.openadsdk.activity.mzz) jpcVar).to();
                }
            }
        }

        public void qdl(int i10) {
            int i11 = this.mo;
            if (i10 != -1) {
                this.tvp = i10;
            }
            this.to.removeMessages(i11);
        }

        private void qdl(@NonNull Message message) {
            int i10 = this.mml;
            if (i10 > 0) {
                int i11 = this.mzz;
                int i12 = (int) ((((double) (i11 - i10)) * 100.0d) / ((double) i11));
                com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.rq;
                StringBuilder sb2 = new StringBuilder();
                int i13 = this.mml;
                this.mml = i13 - 1;
                sb2.append(i13);
                sb2.append("s");
                lnrVar.setCountDownFor1InN(sb2.toString(), i12);
                to();
                mzz();
                if (this.mml >= 0) {
                    qdl(message.what, this.exc);
                }
                wd();
                return;
            }
            mml(3);
            mzz(4);
            qdl(5, true);
            rq();
        }

        public void ud(int i10) {
            if (this.tvp != 2 || i10 == 1) {
                if (i10 != -1) {
                    this.tvp = i10;
                }
                if (this.to.hasMessages(this.mo) || this.kdv) {
                    return;
                }
                ud udVar = this.qdl;
                if (udVar == null || udVar.to() == null || this.qdl.to().xmv() == null || !this.qdl.to().xmv().rq.get()) {
                    int i11 = this.mml;
                    boolean z10 = this.bjy;
                    int i12 = this.mo;
                    if (i12 == 1 || i12 == 2) {
                        if (i11 < 0 || z10 || this.jtx) {
                            return;
                        }
                        this.to.sendEmptyMessageDelayed(i12, this.exc);
                        return;
                    }
                    if (i12 == 3) {
                        mml(3);
                    } else if (i12 == 4) {
                        mzz(4);
                    } else if (i12 == 5) {
                        qdl(5, true);
                    }
                }
            }
        }

        private void qdl(int i10, int i11) {
            if (this.kdv) {
                return;
            }
            this.to.removeMessages(i10);
            this.to.sendEmptyMessageDelayed(i10, i11);
        }

        private void qdl(int i10, boolean z10) {
            if (this.om && i10 == 5) {
                this.mo = i10;
                if (z10) {
                    qdl(i10, 1000);
                } else {
                    this.to.sendEmptyMessage(i10);
                }
            }
        }

        public void ud(boolean z10) {
            if (z10) {
                this.exc = (int) (1000.0f / this.jl);
            } else {
                this.exc = 1000;
            }
        }

        public void qdl(ljh ljhVar, boolean z10) {
            this.aaj = vu.jyq(ljhVar);
            this.jyq = vu.uw(ljhVar);
            this.oth = vu.xmv(ljhVar);
            this.ljh = vu.bqt(ljhVar);
            this.uw = this.jyq;
            this.bqt = false;
            this.xmv = false;
            this.koa = 0;
            this.f16904yh = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lnr lnrVar = this.rq;
            if (lnrVar != null) {
                lnrVar.setShowPlayableNextAd(false, ljhVar);
            }
            this.vu = z10;
            if (this.mml <= 0 || this.bjy) {
                mzz(4);
            }
        }

        public void qdl(int i10, ljh ljhVar) {
            if (ljhVar != null && ljhVar.eu() != null) {
                this.jl = ljhVar.eu().qdl();
                this.f16901ud = ljhVar;
            }
            int i11 = this.mml;
            boolean z10 = this.bjy;
            boolean z11 = this.jtx;
            int i12 = this.mo;
            if (z10 || z11) {
                return;
            }
            float f10 = i10;
            this.lnr = f10;
            if (f10 <= i11) {
                this.mo = 2;
                this.mml = (int) f10;
            } else if (i12 == 0) {
                this.mo = 1;
            }
            if (!this.rdp) {
                this.mzz = this.mml;
                this.rdp = true;
            }
            int i13 = this.mo;
            if (i12 == i13 && this.to.hasMessages(i13)) {
                return;
            }
            this.to.removeCallbacksAndMessages(null);
            this.to.sendEmptyMessage(this.mo);
        }

        public void qdl(jpc jpcVar) {
            ljh ljhVar;
            bch bchVarQdl;
            if (jpcVar == null || (ljhVar = jpcVar.mo) == null || (bchVarQdl = ljhVar.qdl()) == null) {
                return;
            }
            this.hzv = bchVarQdl.lnr();
            this.vu = jpcVar.yt;
            this.f16899ag = bchVarQdl.qdl();
            this.gy = jpcVar.jtx;
            this.ax = bchVarQdl.ud();
            this.fco = aaj.mo(jpcVar.mo);
            this.mrf = aaj.mzz(jpcVar.mo);
            this.om = true;
            if ((this.mml <= 0 || this.bjy) && !this.to.hasMessages(5)) {
                qdl(5, false);
            }
        }
    }

    public ud(Activity activity, ljh ljhVar, boolean z10) {
        this.mml = ljhVar;
        this.jyq = z10;
        this.exu = activity;
        this.mo = new com.bytedance.sdk.openadsdk.fs.tvp(activity.getApplicationContext());
        boolean zAx = ljhVar.ax();
        this.tvp = zAx;
        this.to = zAx && 39 == ljhVar.taz();
        this.fs = zAx && 40 == ljhVar.taz();
        int iTaz = ljhVar.taz();
        if (iTaz == 43 || iTaz == 44) {
            this.rq = new com.bytedance.sdk.openadsdk.activity.mml(this.exu, ljhVar, this);
        } else {
            this.rq = new tvp(this.exu, ljhVar, this);
        }
        boolean z11 = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("adapt_decor_size", 0) == 1;
        this.oth = z11;
        com.bytedance.sdk.component.utils.aaj.qdl("BVA", "scene manager isAdaptDecorSize =" + z11);
        this.rq.qdl();
        kdv();
    }

    private void kdv() {
        if (this.mml.mq()) {
            this.qdl = new com.bytedance.sdk.openadsdk.component.reward.rq(new rq.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.ud.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.rq.qdl
                public void qdl() {
                    jpc jpcVar;
                    if (ud.this.rq().getBoolean("reward_verify", false) || ud.this.bjy() || ud.this.rq().getBoolean("user_has_give_up_reward", false) || (jpcVar = ud.this.to()) != null) {
                        return;
                    }
                    jpcVar.mml(1);
                }
            });
        }
    }

    public com.bytedance.sdk.openadsdk.fs.tvp aaj() {
        return this.mo;
    }

    public boolean bch() {
        return this.rq instanceof com.bytedance.sdk.openadsdk.activity.mml;
    }

    public boolean bjy() {
        return this.yt;
    }

    public void bqt() {
        this.rq.yt();
    }

    public void exc() {
        this.jtx = true;
        this.rq.jtx();
    }

    public void exu() {
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.f16894wd;
        if (qdlVar != null) {
            qdlVar.ud();
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.jpc;
        if (udVar != null) {
            udVar.ud();
        }
    }

    public void fs() {
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.f16894wd;
        if (qdlVar != null) {
            qdlVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.jpc;
        if (udVar != null) {
            udVar.onAdClicked();
        }
    }

    public boolean jl() {
        return this.rq.mml();
    }

    public void jpc() {
        this.rq.tvp();
    }

    public void jtx() {
        this.yt = true;
        com.bytedance.sdk.openadsdk.component.reward.rq rqVar = this.qdl;
        if (rqVar != null) {
            rqVar.lnr();
        }
    }

    public boolean jyq() {
        return this.rq.mzz();
    }

    public void koa() {
        this.rq.jl();
    }

    public jpc ljh() {
        return this.rq.exu();
    }

    public boolean lnr() {
        return this.fs;
    }

    public boolean mml() {
        if (this.mml != null && this.tvp) {
            return this.to || this.fs;
        }
        return false;
    }

    public void mo() {
        Activity activity = this.exu;
        if (activity != null) {
            activity.finish();
        }
    }

    public boolean mzz() {
        return this.tvp;
    }

    public com.bytedance.sdk.openadsdk.component.reward.top.lnr oth() {
        return this.rq.fs();
    }

    public int rc() {
        return this.rq.jpc();
    }

    public void rdp() {
        if (yt()) {
            return;
        }
        exc();
        Objects.toString(this.f16894wd);
        Objects.toString(this.jpc);
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.f16894wd;
        if (qdlVar != null) {
            qdlVar.qdl();
        } else {
            com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.jpc;
            if (udVar != null) {
                udVar.qdl();
            }
        }
        Runnable runnable = this.jl;
        if (runnable != null) {
            runnable.run();
            this.jl = null;
        }
    }

    public Bundle rq() {
        return this.mzz;
    }

    public jpc to() {
        return this.rq.rq();
    }

    public int tvp() {
        return this.rq.to();
    }

    public boolean uw() {
        return this.aaj;
    }

    public void vu() {
        this.rq.exc();
    }

    public Activity wd() {
        com.bytedance.sdk.openadsdk.activity.lnr lnrVar = this.rq;
        return lnrVar == null ? this.exu : lnrVar.qdl;
    }

    public List<ljh> xmv() {
        return this.rq.bjy();
    }

    public boolean yt() {
        return this.jtx;
    }

    public void lnr(TTAdActivity tTAdActivity) {
        this.rdp = 4;
        this.rq.lnr();
        com.bytedance.sdk.openadsdk.component.reward.rq rqVar = this.qdl;
        if (rqVar != null) {
            rqVar.qdl();
        }
    }

    public void mzz(TTAdActivity tTAdActivity) {
        this.rdp = 6;
        this.rq.qdl(tTAdActivity);
        this.exc.qdl(tTAdActivity);
        this.exu = null;
    }

    public ljh qdl() {
        return this.mml;
    }

    public boolean ud() {
        return this.oth;
    }

    public boolean qdl(ljh ljhVar) {
        return (ljhVar == null || aaj.fs(ljhVar) || ljhVar.vg() || ljhVar.raf() == null || ljhVar.raf().mml() <= 0) ? false : true;
    }

    public void ud(TTAdActivity tTAdActivity) {
        this.rdp = 3;
        this.rq.ud();
        com.bytedance.sdk.openadsdk.component.reward.rq rqVar = this.qdl;
        if (rqVar != null) {
            rqVar.ud();
        }
        this.exc.qdl(tTAdActivity, this.mml.jb(), this.mml.nv(), this.oth);
    }

    public void mml(TTAdActivity tTAdActivity) {
        this.rdp = 5;
        this.rq.wd();
    }

    public void qdl(TTAdActivity tTAdActivity, Bundle bundle, com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar, com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar) {
        this.bjy = bundle;
        this.rdp = 1;
        this.f16894wd = qdlVar;
        this.jpc = udVar;
        if (!this.jyq && bundle != null) {
            if (qdlVar == null) {
                this.f16894wd = f16893ud;
                f16893ud = null;
            }
            if (udVar == null) {
                this.jpc = lnr;
                lnr = null;
            }
        }
        this.rq.qdl(bundle);
    }

    public void ud(jpc jpcVar) {
        jpcVar.qdl(this.exu, this.bjy);
        int i10 = this.rdp;
        if (i10 == 2) {
            jpcVar.exu();
            return;
        }
        if (i10 == 3) {
            jpcVar.exu();
            jpcVar.lnr();
            jpcVar.lnr(true);
        } else if (i10 == 4) {
            jpcVar.lnr(false);
            jpcVar.rdp();
        } else {
            if (i10 != 5) {
                return;
            }
            jpcVar.mml();
        }
    }

    public void qdl(TTAdActivity tTAdActivity) {
        this.rdp = 2;
        this.rq.mo();
    }

    public void ud(jpc jpcVar, mzz mzzVar) {
        this.rq.qdl(jpcVar, mzzVar);
    }

    public void qdl(boolean z10) {
        this.rq.qdl(z10);
    }

    public void ud(boolean z10) {
        this.aaj = z10;
    }

    public void qdl(TTAdActivity tTAdActivity, Bundle bundle, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(this.mml, tTAdActivity != null ? tTAdActivity.getIntent() : null, bundle, i10);
        if (this.jyq) {
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.f16894wd;
        if (qdlVar != null) {
            f16893ud = qdlVar;
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.jpc;
        if (udVar != null) {
            lnr = udVar;
        }
    }

    public void ud(jpc jpcVar, int i10) {
        this.rq.ud(jpcVar, i10);
    }

    public void qdl(jpc jpcVar, mzz mzzVar) {
        this.rq.qdl(jpcVar, null, mzzVar);
    }

    public void qdl(Activity activity) {
        this.rq.ud(activity);
    }

    public void qdl(final jpc jpcVar, final boolean z10, final int i10, final String str, final int i11, final String str2) {
        Activity activity;
        if (!this.jtx) {
            this.jl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ud.2
                @Override // java.lang.Runnable
                public void run() {
                    ud.this.qdl(jpcVar, z10, i10, str, i11, str2);
                }
            };
            return;
        }
        if (bjy()) {
            return;
        }
        jtx();
        if (this.f16894wd == null || (activity = this.exu) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ud.3
            @Override // java.lang.Runnable
            public void run() {
                ud.this.f16894wd.qdl(z10, i10, str, i11, str2);
            }
        });
        if (mzz()) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), jpcVar.mo, jpcVar.b_(), z10 ? "reward_success" : "reward_fail");
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.activity.qdl qdlVar, boolean z10) {
        this.rq.qdl(qdlVar, z10);
    }

    public void qdl(jpc jpcVar) {
        com.bytedance.sdk.openadsdk.activity.lnr lnrVar = this.rq;
        if (lnrVar == null) {
            return;
        }
        lnrVar.qdl(jpcVar);
    }

    public void qdl(jpc jpcVar, boolean z10) {
        com.bytedance.sdk.openadsdk.activity.lnr lnrVar = this.rq;
        if (lnrVar == null) {
            return;
        }
        lnrVar.qdl(jpcVar, z10);
    }

    public void qdl(View view) {
        this.rq.qdl(view);
    }

    public void qdl(View view, boolean z10) {
        this.rq.qdl(view, z10);
    }

    public boolean qdl(jpc jpcVar, int i10) {
        return this.rq.qdl(jpcVar, i10);
    }

    public void qdl(float f10) {
        this.rq.qdl(f10);
    }

    public void qdl(Map<String, Object> map, jpc jpcVar, float f10, float f11) {
        this.rq.qdl(map, jpcVar, f10, f11);
    }

    public void qdl(int i10) {
        this.rq.qdl(i10);
    }

    public void qdl(jpc jpcVar, boolean z10, boolean z11, boolean z12, int i10) {
        this.rq.qdl(jpcVar, z10, z11, z12, i10);
    }
}
