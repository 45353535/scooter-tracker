package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bytedance.sdk.openadsdk.core.exu.mml.qdl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr {
    private qdl.InterfaceC0256qdl jpc;
    private final com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl lnr;
    private final qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final ljh f17036ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private long f17037wd;
    private boolean mml = true;
    private long mzz = 0;
    private boolean mo = false;

    private static class qdl implements com.bykv.vk.openvk.qdl.qdl.qdl.qdl {
        private long jpc;
        private final com.bytedance.sdk.openadsdk.mml.wd lnr;
        private long mml;
        private CountDownTimer mo;
        private int mzz = 0;
        private final long qdl;
        private long tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl f17038ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private lnr.qdl f17039wd;

        public qdl(long j10, com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar, com.bytedance.sdk.openadsdk.mml.wd wdVar) {
            this.qdl = j10;
            this.f17038ud = qdlVar;
            this.lnr = wdVar;
        }

        public int bjy() {
            return 0;
        }

        public void exu() {
            this.mzz = 0;
            CountDownTimer countDownTimer = this.mo;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.mo = null;
            }
            if (this.f17039wd != null) {
                this.f17039wd = null;
            }
        }

        public void fs() {
            this.mzz = 2;
            this.mml = this.jpc;
            CountDownTimer countDownTimer = this.mo;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.mo = null;
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public boolean jpc() {
            return this.mzz == 0;
        }

        public long jtx() {
            return this.qdl;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public boolean lnr() {
            return false;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public int mml() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public int mzz() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public boolean qdl() {
            return false;
        }

        public long rdp() {
            return 0L;
        }

        public void rq() {
            if (this.mzz == 1) {
                return;
            }
            this.mzz = 1;
            final long jJtx = jtx();
            if (this.mml >= jJtx) {
                this.mml = 0L;
            }
            final long j10 = jJtx - this.mml;
            CountDownTimer countDownTimer = new CountDownTimer(j10, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.lnr.qdl.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (qdl.this.f17039wd != null) {
                        lnr.qdl qdlVar = qdl.this.f17039wd;
                        long j11 = jJtx;
                        qdlVar.qdl(j11, j11);
                    }
                    qdl.this.mzz = 4;
                    qdl.this.jpc = jJtx;
                    qdl.this.mml = jJtx;
                    if (qdl.this.f17039wd != null) {
                        qdl.this.f17039wd.qdl(qdl.this.yt(), 100);
                    }
                    bjy.qdl qdlVar2 = new bjy.qdl();
                    qdlVar2.ud(jJtx);
                    qdlVar2.mml(jJtx);
                    qdlVar2.lnr(qdl.this.rdp());
                    qdlVar2.mml(qdl.this.bjy());
                    qdlVar2.qdl(qdl.this.tvp());
                    com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.ud(qdl.this.f17038ud, qdlVar2, qdl.this.lnr);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j11) {
                    long j12 = (j10 - j11) + qdl.this.mml;
                    qdl.this.jpc = j12;
                    if (qdl.this.f17039wd != null) {
                        qdl.this.f17039wd.qdl(j12, jJtx);
                    }
                }
            };
            this.mo = countDownTimer;
            countDownTimer.start();
        }

        public void to() {
            this.jpc = 0L;
            rq();
        }

        public long tvp() {
            return this.tvp;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public boolean wd() {
            return this.mzz == 2;
        }

        public long yt() {
            return this.jpc;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public boolean mo() {
            return this.mzz == 1;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl
        public boolean ud() {
            return this.mzz == 4;
        }

        public void ud(long j10) {
            this.mml = j10;
        }

        public void qdl(long j10) {
            this.tvp = j10;
        }

        public void qdl(lnr.qdl qdlVar) {
            this.f17039wd = qdlVar;
        }
    }

    public lnr(ljh ljhVar, com.bytedance.sdk.openadsdk.mml.wd wdVar) {
        com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl qdlVar = new com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.lnr.1
        };
        this.lnr = qdlVar;
        this.f17036ud = ljhVar;
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
        long j10 = 10;
        long jMo = udVarTdy != null ? (long) udVarTdy.mo() : 10L;
        if (jMo <= 0) {
            udVarTdy.qdl(10.0d);
        } else {
            j10 = jMo;
        }
        this.qdl = new qdl(j10 * 1000, qdlVar, wdVar);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean bjy() {
        return false;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean exu() {
        return this.qdl.ud();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud fs() {
        return null;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public int jpc() {
        return 0;
    }

    public long jtx() {
        return this.f17037wd;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void lnr() {
        this.qdl.rq();
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(mo());
        qdlVar.mml(tvp());
        qdlVar.lnr(wd());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.ud(this.lnr, qdlVar);
        qdl.InterfaceC0256qdl interfaceC0256qdl = this.jpc;
        if (interfaceC0256qdl != null) {
            interfaceC0256qdl.qdl(1);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void mml() {
        this.qdl.exu();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public long mo() {
        return this.qdl.yt();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void mzz() {
        mml();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean qdl(float f10) {
        return false;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean rdp() {
        return false;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public com.bykv.vk.openvk.qdl.qdl.qdl.qdl rq() {
        return this.qdl;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public int to() {
        return com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(this.qdl.jpc, this.qdl.qdl);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public long tvp() {
        return this.qdl.jtx();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void ud() {
        this.qdl.fs();
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(mo());
        qdlVar.mml(tvp());
        qdlVar.lnr(wd());
        qdlVar.qdl(jtx());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.lnr, qdlVar);
        qdl.InterfaceC0256qdl interfaceC0256qdl = this.jpc;
        if (interfaceC0256qdl != null) {
            interfaceC0256qdl.qdl(2);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public long wd() {
        return 0L;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl yt() {
        return this.lnr;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl(long j10) {
        this.f17037wd = j10;
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            qdlVar.qdl(j10);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl(boolean z10, int i10) {
        mml();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        this.mo = lnrVar.rq();
        if (lnrVar.to() > 0) {
            this.qdl.ud(lnrVar.to());
        }
        lnrVar.ud(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.f17036ud, this.lnr, lnrVar);
        this.qdl.rq();
        qdl.InterfaceC0256qdl interfaceC0256qdl = this.jpc;
        if (interfaceC0256qdl != null) {
            interfaceC0256qdl.qdl(1);
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl(boolean z10, String str) {
        this.mo = z10;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl(lnr.qdl qdlVar) {
        this.qdl.qdl(qdlVar);
    }

    public void qdl(qdl.InterfaceC0256qdl interfaceC0256qdl) {
        this.jpc = interfaceC0256qdl;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl() {
        this.qdl.to();
    }
}
