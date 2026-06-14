package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.aaj.qdl.qdl;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends tvp implements Handler.Callback {
    private final Handler aaj;
    private boolean bch;
    private boolean bqt;
    private boolean jyq;
    private int ljh;
    int lnr;
    int mml;
    boolean mo;
    int mzz;
    private int oth;
    boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    long f17104ud;
    private int uw;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected int f17105wd;
    private int xmv;

    public wd(qdl qdlVar) {
        super(qdlVar);
        this.aaj = new Handler(this);
        this.qdl = false;
        this.f17104ud = 0L;
        this.lnr = 0;
        this.mml = 0;
        this.mzz = 0;
        this.mo = false;
        this.jyq = false;
        this.oth = 0;
        this.bch = false;
        this.uw = 0;
        this.xmv = 0;
        this.bqt = false;
        this.f17105wd = vu.tvp(this.to);
        this.mml = this.to.icv();
        int iSxp = this.to.sxp();
        this.mzz = iSxp;
        this.uw = Math.max(0, this.mml - iSxp);
    }

    private boolean jl() {
        return this.jpc && vu.lnr(this.fs.f17090ud) && !this.exc.get();
    }

    private boolean jtx() {
        if (this.fs.f17088ra) {
            return false;
        }
        int i10 = this.f17105wd;
        return 1 == i10 || 2 == i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yt() {
        int i10 = !this.bch ? this.mzz - this.lnr : this.mzz + this.xmv;
        int i11 = com.bytedance.sdk.openadsdk.core.yt.mml().xmv(String.valueOf(this.fs.mo)).mo;
        int i12 = this.mml;
        boolean z10 = false;
        boolean z11 = i12 <= 0 || (((float) i10) / ((float) i12)) * 100.0f >= ((float) i11);
        int iQdl = com.bytedance.sdk.openadsdk.core.yt.mml().qdl(String.valueOf(this.fs.mo));
        if (iQdl == 0) {
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.jl;
            boolean zMo = qdlVar != null ? qdlVar.mo() : false;
            if (this.bjy) {
                zMo = true;
            }
            if (z11 && zMo) {
                z10 = true;
            }
        } else if (iQdl == 1) {
            z10 = z11;
        }
        if (z10) {
            this.fs.f17091wc.ud(true);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !jl()) {
            return true;
        }
        int i10 = message.arg1;
        boolean z10 = false;
        if (this.bch) {
            int i11 = this.mzz;
            int i12 = this.xmv;
            int i13 = i11 + i12;
            int i14 = this.mml;
            if (i13 < i14) {
                this.xmv = i12 + 1;
                Message messageObtain = Message.obtain();
                messageObtain.what = 900;
                messageObtain.arg1 = 0;
                this.aaj.sendMessageDelayed(messageObtain, 1000L);
            } else {
                this.xmv = i14 - i11;
            }
        } else if (i10 > 0) {
            if (this.oth == 0 && 2 == this.f17105wd) {
                z10 = true;
            }
            this.fs.fco.mml(true);
            if (!z10) {
                this.fs.fco.qdl(String.valueOf(i10), null);
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 900;
            int i15 = i10 - 1;
            messageObtain2.arg1 = i15;
            this.aaj.sendMessageDelayed(messageObtain2, 1000L);
            this.lnr = i15;
            this.ljh = i10;
        } else {
            this.mo = true;
            if (!vu.jpc(this.to) || (vu.aaj(this.to) && this.jl.mzz())) {
                this.fs.fco.mml(false);
                this.fs.exc.set(true);
                this.fs.en.bjy();
            } else {
                this.fs.fco.lnr();
                this.fs.fco.mzz(true);
            }
            com.bytedance.sdk.openadsdk.aaj.qdl.qdl qdlVar = this.jl;
            if (qdlVar == null || qdlVar.mzz()) {
                this.bjy = true;
            }
            if (this.uw > 0) {
                this.bch = true;
                this.xmv++;
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 900;
                messageObtain3.arg1 = 0;
                this.aaj.sendMessageDelayed(messageObtain3, 1000L);
            }
            this.ljh = 0;
        }
        yt();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public int jpc() {
        return this.ljh;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void lnr() {
        if (this.rdp) {
            this.jpc = true;
            boolean zJtx = jtx();
            if (zJtx) {
                this.jl.qdl(new qdl.InterfaceC0244qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.wd.2
                    @Override // com.bytedance.sdk.openadsdk.aaj.qdl.qdl.InterfaceC0244qdl
                    public void qdl(int i10) {
                        if (wd.this.bqt) {
                            return;
                        }
                        wd.this.oth = i10;
                        wd.this.jl.qdl((qdl.InterfaceC0244qdl) null);
                        wd.this.ud(i10);
                    }
                });
            }
            this.jl.qdl();
            if (vu.jpc(this.to)) {
                this.fs.hkc.mo();
            }
            this.f17104ud = System.currentTimeMillis();
            if (!zJtx) {
                ud(0);
            }
            this.fs.f17091wc.yt();
            com.bytedance.sdk.openadsdk.component.reward.rq rqVar = this.fs.f17087gg;
            if (rqVar != null) {
                rqVar.qdl(this.mml);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void mml() {
        com.bytedance.sdk.openadsdk.core.widget.ud udVar;
        if (this.rdp) {
            super.mml();
            if (DeviceUtils.wd() == 0) {
                this.fs.gt = true;
            }
            qdl qdlVar = this.fs;
            if (qdlVar.gt) {
                qdlVar.fco.ud(true);
                lnr(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar2 = this.fs.en;
            if ((udVar2 == null || (udVar = udVar2.exu) == null || !udVar.isShowing()) && rq() && wd() > 0) {
                qdl(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void mo() {
        if (this.rdp && !this.jtx) {
            super.mo();
            this.aaj.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void mzz() {
        if (this.rdp) {
            super.mzz();
            tvp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public boolean to() {
        return this.mo;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void tvp() {
        if (this.rdp) {
            this.jyq = true;
            this.aaj.removeMessages(900);
            this.aaj.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public int wd() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void qdl() {
        if (this.rdp && !this.exu) {
            super.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    protected com.bytedance.sdk.openadsdk.fs.mo ud() {
        return new com.bytedance.sdk.openadsdk.fs.mo() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.wd.1
            @Override // com.bytedance.sdk.openadsdk.fs.mo
            public void qdl() {
                wd.this.yt();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(int i10) {
        qdl(this.mzz);
        if (this.jyq) {
            return;
        }
        Handler handler = this.aaj;
        handler.sendMessage(handler.obtainMessage(900, this.mzz, i10));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    protected void qdl(boolean z10) {
        if (this.yt != null) {
            try {
                com.bytedance.sdk.openadsdk.aaj.qdl.ud udVarQdl = com.bytedance.sdk.openadsdk.aaj.qdl.mml.qdl().qdl(this.to, this.yt, ud());
                this.jl = udVarQdl;
                udVarQdl.qdl(this.fs.f17091wc);
            } catch (Throwable th2) {
                aaj.lnr("RVIVPlayableNewManager", "PreRender injection exception" + th2.getMessage());
            }
            if (this.jl == null) {
                super.qdl(z10);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void qdl(int i10) {
        this.lnr = i10;
        this.ljh = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.tvp
    public void qdl(long j10) {
        if (this.rdp && this.jpc && !this.fs.rq.get() && this.jyq) {
            this.jyq = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 900;
            messageObtain.arg1 = wd();
            messageObtain.arg2 = this.oth;
            this.aaj.sendMessageDelayed(messageObtain, j10);
        }
    }
}
