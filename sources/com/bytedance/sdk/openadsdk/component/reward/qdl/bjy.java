package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.exu.mml.qdl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class bjy {
    private String aaj;
    private boolean bch;
    private boolean bjy;
    private long exc;
    private boolean exu;
    private long fs;
    private long jl;
    private final ljh jpc;
    private final qdl ljh;
    boolean lnr;
    final boolean mml;
    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr mo;
    private boolean oth;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.mml.wd f17060rc;
    private boolean rdp;
    private long rq;
    private final String to;
    private FrameLayout tvp;
    private qdl.InterfaceC0256qdl vu;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final Activity f17062wd;
    protected boolean qdl = false;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    boolean f17061ud = false;
    protected boolean mzz = false;
    private long jtx = -1;
    private int yt = -1;
    private boolean uw = false;
    private int xmv = 0;
    private float bqt = 1.0f;
    private boolean koa = false;
    private HashSet<String> jyq = new HashSet<>();

    public bjy(qdl qdlVar) {
        this.ljh = qdlVar;
        this.f17062wd = qdlVar.f17086ag;
        this.jpc = qdlVar.f17090ud;
        this.mml = qdlVar.mml;
        this.to = qdlVar.mzz;
    }

    private void yh() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null || lnrVar.rq() == null) {
            return;
        }
        this.rq = this.mo.mo();
        if (this.mo.rq().lnr() || !this.mo.rq().ud()) {
            this.mo.ud();
            this.mo.mml();
            this.qdl = true;
        }
    }

    public void aaj() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.lnr();
        }
    }

    public void ag() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).ag();
        }
    }

    public void ax() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).ax();
        }
    }

    public int bch() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.jpc();
        }
        return 0;
    }

    public void bjy() {
        try {
            if (mo()) {
                this.mo.ud();
            }
        } catch (Throwable th2) {
            aaj.lnr("RewardFullVideoPlayerManager onPause throw Exception :" + th2.getMessage(), new Object[0]);
        }
    }

    public boolean bqt() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            if (lnrVar.rq() != null) {
                com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVarRq = this.mo.rq();
                if (qdlVarRq.wd() || qdlVarRq.jpc()) {
                    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar2 = this.mo;
                    if (lnrVar2 instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
                        ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar2).mrf();
                    }
                    return true;
                }
            } else if (rq()) {
                qdl(false);
                com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar3 = this.mo;
                if (lnrVar3 instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
                    ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar3).mrf();
                }
                return true;
            }
        }
        return false;
    }

    public boolean cx() {
        return this.exu;
    }

    public void ekw() {
        this.uw = false;
        jl();
    }

    public void exc() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.mzz();
        }
    }

    public long exu() {
        return this.fs;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double fco() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.model.ljh r0 = r5.jpc
            com.bytedance.sdk.openadsdk.core.model.jyq r0 = r0.aaj()
            com.bytedance.sdk.openadsdk.core.model.ljh r1 = r5.jpc
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.aaj.mml(r1)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            long r0 = r0.ud()
        L14:
            double r0 = (double) r0
            goto L3b
        L16:
            com.bytedance.sdk.openadsdk.core.model.ljh r1 = r5.jpc
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.aaj.wd(r1)
            if (r1 == 0) goto L25
            if (r0 == 0) goto L25
            long r0 = r0.mml()
            goto L14
        L25:
            com.bytedance.sdk.openadsdk.core.model.ljh r0 = r5.jpc
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud r0 = r0.tdy()
            if (r0 == 0) goto L39
            double r1 = r0.mo()
            int r0 = r0.oth()
            double r3 = (double) r0
            double r0 = r1 * r3
            goto L3b
        L39:
            r0 = 0
        L3b:
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r2 = r5.ljh
            com.bytedance.sdk.openadsdk.component.reward.rq r2 = r2.f17087gg
            if (r2 == 0) goto L45
            long r3 = (long) r0
            r2.qdl(r3)
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.qdl.bjy.fco():double");
    }

    public long fs() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null ? lnrVar.mo() : this.rq;
    }

    public View gy() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            return (View) ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).gy();
        }
        return null;
    }

    public void hkc() {
        try {
            if (mo()) {
                this.mzz = true;
                jyq();
            }
        } catch (Exception e10) {
            aaj.lnr("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e10.getMessage());
        }
    }

    public boolean hzv() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null || lnrVar.rq() == null) {
            return false;
        }
        return this.mo.rq().qdl();
    }

    public void jl() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return;
        }
        lnrVar.mml();
        this.mo = null;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.ud.qdl jpc() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar instanceof com.bytedance.sdk.openadsdk.component.reward.lnr ? ((com.bytedance.sdk.openadsdk.component.reward.lnr) lnrVar).yt() : lnrVar.fs();
        }
        return null;
    }

    public long jtx() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.wd();
        }
        return 0L;
    }

    public void jyq() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.ud();
        }
    }

    public boolean kdv() {
        return this.lnr;
    }

    public boolean koa() {
        return this.mo != null;
    }

    public int ljh() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.to();
        }
        return 0;
    }

    public boolean mml() {
        int i10;
        return this.koa ? this.uw && this.xmv == 1 : this.uw && ((i10 = this.xmv) == 2 || i10 == 1);
    }

    public boolean mo() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return (lnrVar == null || lnrVar.rq() == null || !this.mo.rq().mo()) ? false : true;
    }

    public void mrf() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).fco();
        }
    }

    public com.bytedance.sdk.openadsdk.mml.wd mzz() {
        return this.f17060rc;
    }

    public void om() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar == null || lnrVar.rq() == null) {
            return;
        }
        this.rq = this.mo.mo();
        exc();
        qdl(true);
        this.exu = true;
    }

    public long oth() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.tvp();
        }
        return 0L;
    }

    public void rc() {
        int i10 = this.xmv;
        if (i10 == 1 || i10 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                qdl(jSONObject);
            } catch (Throwable th2) {
                aaj.qdl("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th2);
            }
        }
    }

    public long rdp() {
        return this.rq;
    }

    public boolean rq() {
        return this.qdl;
    }

    public boolean to() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null && lnrVar.rdp();
    }

    public boolean tvp() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return (lnrVar == null || lnrVar.rq() == null || !this.mo.rq().wd()) ? false : true;
    }

    public long uw() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.tvp() + this.mo.wd();
        }
        return 0L;
    }

    public boolean vu() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null && lnrVar.rq() == null;
    }

    public void wc() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl();
        }
    }

    public boolean wd() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        return lnrVar != null && lnrVar.exu();
    }

    public long xmv() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.tvp();
        }
        return 0L;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.qdl yt() {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.rq();
        }
        return null;
    }

    public boolean lnr() {
        return this.uw;
    }

    public void mzz(boolean z10) {
        this.bjy = z10;
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) lnrVar).mo(z10);
        }
    }

    public long qdl() {
        return this.jtx;
    }

    public long ud() {
        return this.jl;
    }

    private void ud(long j10, long j11) {
        int iAbs = (int) Math.abs(((long) this.yt) - j10);
        int i10 = this.yt;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.jyq.contains(this.aaj)) {
            return;
        }
        if (this.yt > j10) {
            com.bytedance.sdk.openadsdk.core.rdp.lnr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.bjy.1
                @Override // java.lang.Runnable
                public void run() {
                    bjy.this.hkc();
                    bjy.this.ljh.bqt.qdl(bjy.this.yt, bjy.this.aaj);
                }
            }, iAbs);
        } else {
            hkc();
            this.ljh.bqt.qdl(this.yt, this.aaj);
        }
        this.jyq.add(this.aaj);
    }

    public void lnr(boolean z10) {
        this.lnr = z10;
    }

    public void qdl(long j10) {
        this.jtx = j10;
    }

    public void mml(boolean z10) {
        this.bch = z10;
        if (this.mo instanceof com.bytedance.sdk.openadsdk.core.exu.mml.qdl) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).ud(this.jpc.tdy().oth());
            } else {
                this.jpc.tdy().to(1);
                ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).ud(1);
            }
        }
    }

    public void qdl(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.mml.wd wdVar) {
        if (this.oth) {
            return;
        }
        this.oth = true;
        this.tvp = frameLayout;
        if (this.jpc.eu() != null) {
            this.xmv = this.jpc.eu().ud();
            this.bqt = this.jpc.eu().qdl();
        }
        this.f17060rc = wdVar;
        if (ljh.mzz(this.jpc)) {
            this.koa = true;
            this.mo = new com.bytedance.sdk.openadsdk.core.exu.mml.qdl(this.f17062wd, this.tvp, this.jpc, wdVar);
            mml(this.bch);
            qdl.InterfaceC0256qdl interfaceC0256qdl = this.vu;
            if (interfaceC0256qdl != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).qdl(interfaceC0256qdl);
            }
            ((com.bytedance.sdk.openadsdk.core.exu.mml.qdl) this.mo).mo(this.bjy);
            return;
        }
        this.koa = false;
        com.bytedance.sdk.openadsdk.component.reward.lnr lnrVar = new com.bytedance.sdk.openadsdk.component.reward.lnr(this.jpc, wdVar);
        this.mo = lnrVar;
        qdl.InterfaceC0256qdl interfaceC0256qdl2 = this.vu;
        if (interfaceC0256qdl2 != null) {
            lnrVar.qdl(interfaceC0256qdl2);
        }
    }

    public void ud(long j10) {
        this.rq = j10;
    }

    public void ud(boolean z10) {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.ud();
            this.rdp = z10;
        }
    }

    protected void ud(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        if (!bqt() || udVar == null) {
            return;
        }
        udVar.qdl(rdp(), true);
    }

    public void qdl(com.bytedance.sdk.openadsdk.mml.wd wdVar) {
        this.f17060rc = wdVar;
    }

    public void qdl(long j10, long j11) {
        this.fs = j10;
        ud(j10, j11);
    }

    public void qdl(int i10, String str) {
        this.yt = i10;
        this.aaj = str;
    }

    public void qdl(boolean z10) {
        this.qdl = z10;
    }

    public void qdl(int i10, int i11) {
        if (this.mo != null) {
            bjy.qdl qdlVar = new bjy.qdl();
            qdlVar.lnr(jtx());
            qdlVar.mml(uw());
            qdlVar.ud(fs());
            qdlVar.qdl(i10);
            qdlVar.ud(i11);
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.mml(this.mo.fs(), qdlVar);
        }
    }

    public void qdl(lnr.qdl qdlVar) {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(qdlVar);
        }
    }

    public void qdl(boolean z10, String str) {
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(z10, str);
        }
    }

    public void qdl(String str, boolean z10) {
        if (this.mo != null) {
            long jFs = fs();
            if (this.jpc.yh()) {
                jFs = this.ljh.lnr();
            }
            long j10 = jFs;
            JSONObject jSONObjectQdl = gy.qdl(this.jpc, this.mo.wd(), this.mo.rq());
            try {
                jSONObjectQdl.put("auto_click", z10);
                if (!z10) {
                    qdl qdlVar = this.ljh;
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(jSONObjectQdl, qdlVar.mml ? qdlVar.f17090ud.qg() : qdlVar.f17090ud.ws(), (int) j10);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.jpc, this.to, str, j10, ljh(), jSONObjectQdl, this.f17060rc);
            uw();
            ljh();
        }
        ax();
    }

    public boolean qdl(long j10, boolean z10, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        boolean zQdl;
        boolean z11 = false;
        if (!koa()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.aaj.mml(this.ljh.f17090ud) || com.bytedance.sdk.openadsdk.core.model.aaj.wd(this.ljh.f17090ud)) {
            return true;
        }
        if (!z10 || !vu()) {
            qdl(udVar);
        }
        try {
            zQdl = qdl(j10, this.ljh.gt);
            try {
                this.exu = false;
            } catch (Exception e10) {
                e = e10;
                z11 = zQdl;
                Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
                zQdl = z11;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (zQdl && !z10) {
            this.ljh.vu.qdl(map);
        }
        return zQdl;
    }

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        if (this.ljh.to.get()) {
            return;
        }
        qdl qdlVar = this.ljh;
        if (!qdlVar.irn || vu.lnr(qdlVar.f17090ud)) {
            return;
        }
        if ((!ljh.mzz(this.ljh.f17090ud) && com.bytedance.sdk.openadsdk.core.yt.mml().exu(String.valueOf(this.ljh.mo)) == 1 && this.ljh.bqt.mml()) || com.bytedance.sdk.openadsdk.core.model.aaj.mml(this.ljh.f17090ud) || com.bytedance.sdk.openadsdk.core.model.aaj.wd(this.ljh.f17090ud) || this.mzz || !udVar.mo()) {
            return;
        }
        this.ljh.cx.removeMessages(300);
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        this.ljh.cx.sendMessageDelayed(messageObtain, 5000L);
    }

    public boolean qdl(JSONObject jSONObject) {
        int i10;
        if (this.mo != null && jSONObject != null && ((i10 = this.xmv) == 1 || i10 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.bqt = fOptDouble;
            if (fOptDouble <= 0.0f && this.ljh.f17090ud.eu() != null) {
                this.bqt = this.ljh.f17090ud.eu().qdl();
            }
            if (iOptInt == 0) {
                this.bqt = 1.0f;
                if (this.uw) {
                    long jCurrentTimeMillis = this.jl + (System.currentTimeMillis() - this.exc);
                    this.jl = jCurrentTimeMillis;
                    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar = this.mo;
                    if (lnrVar != null) {
                        lnrVar.qdl(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar = this.ljh.f17091wc;
                    if (udVar != null) {
                        udVar.mml(false);
                    }
                }
            } else if (iOptInt == 1 && !this.uw) {
                this.exc = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar2 = this.ljh.f17091wc;
                if (udVar2 != null) {
                    udVar2.mml(true);
                }
            }
            this.uw = iOptInt == 1;
            if (this.xmv == 1) {
                return true;
            }
            com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar2 = this.mo;
            if (lnrVar2 == null) {
                return false;
            }
            return lnrVar2.qdl(this.bqt);
        }
        this.uw = false;
        return false;
    }

    private boolean qdl(long j10, boolean z10) {
        if (this.mo == null || this.jpc.tdy() == null) {
            return false;
        }
        String strQdl = CacheDirFactory.getICacheDir(this.jpc.lhl()).qdl();
        File file = new File(strQdl, this.jpc.tdy().rdp());
        if (file.exists() && file.length() > 0) {
            this.f17061ud = true;
        }
        com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(strQdl, this.jpc);
        udVarQdl.ud(this.jpc.yre());
        udVarQdl.ud(this.tvp.getWidth());
        udVarQdl.lnr(this.tvp.getHeight());
        udVarQdl.lnr(this.jpc.ir());
        udVarQdl.qdl(j10);
        udVarQdl.qdl(z10);
        return this.mo.qdl(udVarQdl);
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        try {
            this.mzz = false;
            if (rq()) {
                yh();
                ud(udVar);
            } else if (tvp()) {
                aaj();
            }
        } catch (Throwable th2) {
            aaj.lnr("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public void qdl(boolean z10, com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, boolean z11) {
        if (this.rdp || !(!z11 || z10 || this.mzz)) {
            if (tvp()) {
                aaj();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                yh();
                ud(udVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.rdp = false;
        }
    }

    public void qdl(qdl.InterfaceC0256qdl interfaceC0256qdl) {
        this.vu = interfaceC0256qdl;
    }
}
