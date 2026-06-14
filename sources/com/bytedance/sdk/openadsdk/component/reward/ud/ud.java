package com.bytedance.sdk.openadsdk.component.reward.ud;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.exu;
import com.bytedance.sdk.openadsdk.component.reward.qdl.bjy;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.component.reward.view.tvp;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.jl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.widget.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.bytedance.sdk.openadsdk.utils.rdp;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ud extends com.bytedance.sdk.openadsdk.component.reward.ud.qdl {
    private com.bytedance.sdk.openadsdk.fs.mo bjy;
    public com.bytedance.sdk.openadsdk.core.widget.ud exu;
    protected com.bytedance.sdk.openadsdk.core.lnr.mzz fs;
    public LinearLayout rdp;
    protected String rq;

    public interface qdl {
        void qdl(boolean z10);
    }

    public ud(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        super(qdlVar);
    }

    private void lnr(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        fs fsVar = qdlVar.gy;
        if (fsVar == null || fsVar.to() == null) {
            return;
        }
        qdlVar.gy.to().performClick();
    }

    public void aaj() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        fs fsVar = qdlVar.gy;
        if (fsVar != null) {
            fsVar.jtx();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        boolean z10 = qdlVar2.gt;
        qdlVar2.ekw.qdl();
        DeviceUtils.wd();
        this.qdl.hkc.bjy();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        if (qdlVar3.gt) {
            qdlVar3.f17086ag.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ud.ud.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ud.this.qdl.ekw.qdl() > 0) {
                        ud.this.qdl.ekw.qdl(false);
                    }
                }
            });
        }
    }

    public void bch() {
        this.fs = this.qdl.vu.lnr();
    }

    public void bjy() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (!qdlVar.f17092wd && qdlVar.mml()) {
            this.qdl.fco.mzz();
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
            if (qdlVar2.f17088ra && (qdlVar2.lq instanceof com.bytedance.sdk.openadsdk.activity.qdl)) {
                return;
            }
            qdlVar2.gy.mo(0);
        }
    }

    public final void bqt() {
        if (this.qdl.f17086ag.isFinishing()) {
            return;
        }
        this.qdl.hkc.to();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        String str = qdlVar.mml ? "reward_endcard" : "fullscreen_endcard";
        qdlVar.hkc.qdl(this.bjy, str, qdlVar.f17091wc);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        if (qdlVar2.rzg) {
            qdlVar2.xmv.qdl(qdlVar2.gt);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        qdlVar3.hkc.qdl(str, qdlVar3.f17091wc);
        this.qdl.hkc.mzz();
    }

    public void exc() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        qdlVar.irn = false;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        boolean z10 = qdlVar2.irn;
        boolean z11 = qdlVar2.gt;
        if (!qdlVar2.rq.get()) {
            this.qdl.bch.bjy();
        }
        jtx();
        this.qdl.hkc.jtx();
        this.qdl.xmv.jpc();
        this.qdl.oth.set(true);
        if (this.qdl.to.get()) {
            this.qdl.jyq.set(true);
        }
        rdp rdpVar = this.qdl.kab;
        if (rdpVar != null) {
            rdpVar.ud();
        }
        this.qdl.ud();
    }

    public void exu() {
    }

    public void fs() {
        LinearLayout linearLayout = (LinearLayout) this.qdl.ax.findViewById(jtx.exu);
        this.rdp = linearLayout;
        ax.qdl((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.ijp = new exu(qdlVar.f17086ag, qdlVar.f17090ud, "landingpage_endcard");
        this.qdl.ijp.lnr().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ud.ud.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ud.this.qdl.gy.to().performClick();
            }
        });
        this.rdp.addView(this.qdl.ijp.mzz(), new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        qdlVar2.hkc.qdl(qdlVar2.ijp);
    }

    protected void jl() {
        int i10;
        if (this.qdl.to.get()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            if (!qdlVar.f17092wd && qdlVar.jyq.getAndSet(false) && ((i10 = this.qdl.jpc) >= 0 || i10 == -1)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
                messageObtain.arg1 = qdlVar2.jpc;
                qdlVar2.cx.sendMessage(messageObtain);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        if (qdlVar3.tvp <= 0 || !qdlVar3.oth.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 900;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.qdl;
        messageObtain2.arg1 = qdlVar4.tvp;
        qdlVar4.cx.sendMessage(messageObtain2);
    }

    public RFEndCardBackUpLayout jpc() {
        return new RFEndCardBackUpLayout(this.qdl.om);
    }

    public void jtx() {
        this.to.removeMessages(300);
    }

    public void jyq() {
        ud(false);
    }

    protected boolean koa() {
        return true;
    }

    public void ljh() {
        this.qdl.fco.lnr();
        this.qdl.fco.mzz(true);
    }

    public qdl mml() {
        return null;
    }

    public abstract boolean mo();

    public abstract boolean mzz();

    public void oth() {
        if (!this.qdl.xmv.rq() && yt.mml().jyq(String.valueOf(this.qdl.mo)) == 1) {
            int iQdl = qdl(this.qdl);
            if (ud(this.qdl)) {
                lnr(this.qdl);
            } else if (qdl(this.qdl, iQdl)) {
                mml(this.qdl);
            }
        }
    }

    public abstract void qdl(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.ud.qdl
    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, koa koaVar) {
        super.qdl(udVar, koaVar);
        if (this.qdl.f17090ud.mo()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            if (qdlVar.nz) {
                qdlVar.hkc.qdl(false);
            }
        }
    }

    public void rdp() {
        com.bytedance.sdk.openadsdk.core.widget.ud udVar = this.exu;
        if (udVar == null || !udVar.isShowing()) {
            return;
        }
        this.exu.dismiss();
    }

    public void rq() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.koa.qdl(qdlVar.mml);
        this.qdl.gy.ud();
        this.qdl.mrf.qdl();
        if (!this.qdl.f17090ud.uj()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
            if (qdlVar2.f17092wd && TextUtils.isEmpty(ljh.qdl(qdlVar2.om, this.f17112ud))) {
                fs();
            }
            this.qdl.hkc.qdl();
            this.qdl.hzv.qdl();
        }
        this.qdl.xmv.wd();
        this.qdl.fco.qdl();
        if (vu.mo(this.qdl.f17090ud)) {
            this.qdl.gy.mml();
            ax.qdl((View) this.qdl.hkc.jpc(), 4);
        }
        if (aaj.mml(this.qdl.f17090ud) || aaj.ud(this.qdl.f17090ud) || aaj.wd(this.qdl.f17090ud)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        qdlVar3.gy.qdl(ax.ud(qdlVar3.om, qdlVar3.tid), ax.ud(this.qdl.om, r2.sy));
        this.qdl.uw.qdl();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.qdl;
        if (qdlVar4.zy) {
            qdlVar4.gy.qdl(0);
        }
    }

    public View to() {
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar;
        if (this.f17112ud.gg() != 5) {
            wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(this.qdl.f17086ag);
            wdVar.setId(jtx.f17860fc);
        } else {
            wdVar = null;
        }
        Objects.toString(wdVar);
        return wdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View tvp() {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ud.ud.tvp():android.view.View");
    }

    public void ud(boolean z10) {
        to toVar = this.qdl.bqt;
        if (toVar != null && !z10) {
            toVar.mo();
        }
        fs fsVar = this.qdl.gy;
        if (fsVar != null) {
            fsVar.rdp();
        }
        this.qdl.bch.ekw();
        if (!mzz()) {
            this.qdl.to.get();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.jtx jtxVar = this.qdl.hkc;
        if (jtxVar != null) {
            jtxVar.rq();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.jpc jpcVar = this.qdl.xmv;
        if (jpcVar != null) {
            jpcVar.lnr(com.bytedance.sdk.openadsdk.component.reward.qdl.jpc.qdl);
        }
        fs fsVar2 = this.qdl.gy;
        if (fsVar2 != null) {
            fsVar2.fs();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.mzz mzzVar = this.qdl.mrf;
        if (mzzVar != null) {
            mzzVar.lnr();
        }
        rdp rdpVar = this.qdl.kab;
        if (rdpVar != null) {
            rdpVar.lnr();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uw() {
        /*
            r4 = this;
            boolean r0 = r4.mo()
            if (r0 != 0) goto L16
            boolean r0 = r4 instanceof com.bytedance.sdk.openadsdk.component.reward.ud.wd
            if (r0 != 0) goto Le
            boolean r0 = r4 instanceof com.bytedance.sdk.openadsdk.component.reward.ud.jpc
            if (r0 == 0) goto L16
        Le:
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r4.qdl
            com.bytedance.sdk.openadsdk.component.reward.qdl.to r0 = r0.vu
            r0.ud()
            return
        L16:
            com.bytedance.sdk.openadsdk.core.exu.mml.ud r0 = r4.tvp
            com.bytedance.sdk.openadsdk.component.reward.qdl.bjy r1 = r4.mzz
            long r1 = r1.rdp()
            r3 = 0
            boolean r0 = r0.qdl(r1, r3)
            if (r0 != 0) goto L4f
            com.bytedance.sdk.component.utils.koa r0 = r4.to
            r1 = 300(0x12c, float:4.2E-43)
            r0.removeMessages(r1)
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r4.qdl
            boolean r1 = r0.f17088ra
            if (r1 == 0) goto L3e
            com.bytedance.sdk.openadsdk.activity.jpc r0 = r0.lq
            boolean r1 = r0 instanceof com.bytedance.sdk.openadsdk.activity.qdl
            if (r1 == 0) goto L3e
            com.bytedance.sdk.openadsdk.activity.qdl r0 = (com.bytedance.sdk.openadsdk.activity.qdl) r0
            r0.uw()
            goto L4f
        L3e:
            int r0 = com.bytedance.sdk.openadsdk.mml.ud.C0294ud.qdl
            r4.qdl(r0)
            com.bytedance.sdk.openadsdk.component.reward.qdl.bjy r0 = r4.mzz
            boolean r1 = r0.hzv()
            r1 = r1 ^ 1
            r2 = 4
            r0.qdl(r1, r2)
        L4f:
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r4.qdl
            if (r0 == 0) goto L6e
            com.bytedance.sdk.openadsdk.core.model.ljh r1 = r0.f17090ud
            if (r1 == 0) goto L6e
            com.bytedance.sdk.openadsdk.utils.rdp r0 = r0.kab
            if (r0 == 0) goto L6e
            boolean r0 = r1.au()
            if (r0 == 0) goto L6e
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r4.qdl
            com.bytedance.sdk.openadsdk.utils.rdp r1 = r0.kab
            com.bytedance.sdk.openadsdk.component.reward.qdl.bjy r0 = r0.bch
            long r2 = r0.xmv()
            r1.qdl(r2)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ud.ud.uw():void");
    }

    public abstract void wd();

    public void xmv() {
        lnr();
        if (!this.qdl.f17090ud.uj() && koa()) {
            bqt();
        }
        if (koa()) {
            this.qdl.mrf.ud();
        }
        if (aaj.mml(this.qdl.f17090ud) || aaj.wd(this.qdl.f17090ud)) {
            this.to.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.gy.qdl(qdlVar.taz == 100.0f);
        bch();
        wd();
    }

    public void yt() {
        if (this.qdl.lq != null || ((!vu.ud(this.f17112ud) && !vu.lnr(this.f17112ud)) || (vu.jpc(this.f17112ud) && this.qdl.hkc.vu() && !this.qdl.hkc.ekw()))) {
            jl();
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        rdp rdpVar = qdlVar.kab;
        if (rdpVar != null) {
            rdpVar.qdl();
        }
        this.qdl.qdl();
    }

    private void mml(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.fs fsVar = qdlVar.fco;
        if (fsVar != null) {
            fsVar.mml();
        }
    }

    public void qdl(tvp tvpVar) {
        qdl(tvpVar, this.qdl);
    }

    public void qdl(boolean z10, boolean z11, boolean z12, int i10) {
        this.qdl.mrf.qdl(z10, z11, z12, this, i10);
    }

    private int qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        if (vu.lnr(qdlVar.f17090ud)) {
            return qdlVar.f17090ud.sxp();
        }
        if (qdlVar.mml) {
            return qdlVar.f17090ud.qg();
        }
        return qdlVar.f17090ud.ws();
    }

    private boolean qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, int i10) {
        if (i10 == -1) {
            return false;
        }
        boolean z10 = !qdlVar.to.get() || vu.lnr(qdlVar.f17090ud);
        bjy bjyVar = qdlVar.bch;
        boolean z11 = bjyVar != null && bjyVar.exu() >= ((long) i10) * 1000;
        com.bytedance.sdk.openadsdk.component.reward.qdl.jpc jpcVar = qdlVar.xmv;
        return z10 && (z11 || (jpcVar != null && jpcVar.mml()));
    }

    private boolean ud(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        fs fsVar = qdlVar.gy;
        return fsVar != null && fsVar.tvp();
    }

    public void qdl(int i10) {
        this.mzz.exc();
        qdl(false, true, false, i10);
        if (this.qdl.mml) {
            this.tvp.ud(10000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ud.ud.qdl(android.os.Message):void");
    }

    private void qdl(long j10, long j11) {
        long j12 = j11 - j10;
        Activity activity = this.qdl.f17086ag;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).lnr(j12, j11);
        }
    }

    static void qdl(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        final com.bytedance.sdk.openadsdk.core.mo.mml mmlVar;
        Context context = frameLayout.getContext();
        if (qdlVar.nz) {
            com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
            lnrVar.setId(jtx.to);
            frameLayout.addView(lnrVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutQdl = qdl(context);
            String strQdl = "";
            if (ljh.mzz(qdlVar.f17090ud)) {
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = qdlVar.f17090ud.tdy();
                if (udVarTdy != null) {
                    strQdl = udVarTdy.to();
                }
            } else {
                List<jl> listVm = qdlVar.f17090ud.vm();
                if (listVm != null && !listVm.isEmpty()) {
                    strQdl = listVm.get(0).qdl();
                }
            }
            if (TextUtils.isEmpty(strQdl)) {
                mmlVar = null;
            } else {
                mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
                int i10 = jtx.f17865qh;
                mmlVar.setId(i10);
                mmlVar.setTag(i10, strQdl);
                mmlVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutQdl.addView(mmlVar);
            }
            lnrVar.addView(frameLayoutQdl);
            lnrVar.addView(new rq(context), new FrameLayout.LayoutParams(-1, -1));
            View mzzVar = new com.bytedance.sdk.openadsdk.component.reward.view.mzz(context);
            mzzVar.setId(jtx.fs);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(mzzVar, layoutParams);
            mzzVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ud.ud.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = qdlVar.ax.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = qdlVar.ax.findViewById(jtx.xmr);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = qdlVar.ax.findViewById(jtx.guw);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = mmlVar;
                    if (mmlVar2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = mmlVar2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            mmlVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
            mzzVar2.setId(jtx.exu);
            mzzVar2.setOrientation(1);
            mzzVar2.setVisibility(8);
            frameLayout.addView(mzzVar2, new FrameLayout.LayoutParams(-1, -1));
        }
        if (qdlVar.f17093yh) {
            View moVar = new com.bytedance.sdk.component.tvp.mo(context, true, mo.lnr.ENDCARD);
            moVar.setId(jtx.rdp);
            moVar.setLayerType(2, null);
            moVar.setVisibility(4);
            if (!qdlVar.ew && aaj.mo(qdlVar.f17090ud)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = ax.ud(qdlVar.om, 58.0f);
                frameLayout.addView(moVar, layoutParams2);
            } else {
                frameLayout.addView(moVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(jtx.bjy);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (vu.ud(qdlVar.f17090ud)) {
                View lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
                lnrVar2.setId(jtx.aoy);
                lnrVar2.setVisibility(4);
                frameLayout.addView(lnrVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    protected static FrameLayout qdl(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        lnrVar.setId(jtx.rq);
        lnrVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        lnrVar.setLayoutParams(layoutParams);
        return lnrVar;
    }
}
