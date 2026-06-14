package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.component.reward.exu;
import com.bytedance.sdk.openadsdk.component.reward.qdl.bjy;
import com.bytedance.sdk.openadsdk.component.reward.qdl.rq;
import com.bytedance.sdk.openadsdk.component.reward.view.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.rc;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.mrf;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.ud;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.bqt;
import com.bytedance.sdk.openadsdk.utils.kdv;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements koa.qdl, com.bytedance.sdk.openadsdk.core.exu.mml.ud {
    private final AtomicBoolean aaj;
    private final AtomicBoolean bjy;
    private int exc;
    protected boolean exu;
    protected boolean fs;
    private final rq.ud jl;
    private boolean jtx;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.ud.ud lnr;
    final koa mml;
    int mo;
    protected IListenerManager mzz;
    public final String qdl;
    protected boolean rdp;
    int rq;
    protected kdv to;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl f16812ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    boolean f16813wd;
    private int yt;

    private static class qdl implements Runnable {
        boolean qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        AdSlot f16814ud;

        qdl(boolean z10, AdSlot adSlot) {
            this.qdl = z10;
            this.f16814ud = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.qdl) {
                exu.qdl(yt.qdl()).qdl(this.f16814ud);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.mzz.qdl(yt.qdl()).qdl(this.f16814ud);
            }
        }
    }

    public TTBaseVideoActivity() {
        this.qdl = aaj() ? Constants.REWARDED_VIDEO : "fullscreen_interstitial_ad";
        this.bjy = new AtomicBoolean(false);
        this.mml = new koa(Looper.getMainLooper(), this);
        this.jtx = false;
        this.yt = 0;
        this.rq = 1;
        this.jl = new rq.ud();
        this.fs = false;
        this.exc = -1;
        this.aaj = new AtomicBoolean(false);
    }

    private boolean kdv() {
        if (this.f16812ud.to.get() && this.f16812ud.f17092wd) {
            return false;
        }
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f16812ud.to.get();
        }
        return true;
    }

    private void rc() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar;
        if (this.f16812ud == null || (udVar = this.lnr) == null) {
            super.onBackPressed();
        } else {
            udVar.oth();
        }
    }

    private void vu() {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        this.lnr.xmv();
        this.mo = (int) this.f16812ud.bch.fco();
        exc();
        wd();
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.f16812ud.f17090ud.zm();
        if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.qdl(0L);
    }

    public abstract boolean aaj();

    protected void bch() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void bjy() {
        this.f16812ud.bch.mrf();
    }

    public void bqt() {
        if (!this.f16812ud.f17090ud.yh()) {
            if (!ljh.mzz(this.f16812ud.f17090ud)) {
                this.f16812ud.bch.qdl("skip", true);
            }
            finish();
        } else if (!this.f16812ud.f17090ud.mo()) {
            this.f16812ud.fco.lnr();
        } else if (this.f16812ud.bqt.rq() == 1) {
            this.f16812ud.fco.lnr();
        }
    }

    protected abstract void exc();

    protected void exu() {
        Message message = new Message();
        message.what = 400;
        if (aaj()) {
            ud(10000);
        }
        this.mml.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f16812ud == null) {
            return;
        }
        if (bqt.mzz()) {
            ax.ud((Activity) this);
        }
        if (!vu.mzz(this.f16812ud.f17090ud) || this.f16812ud.xmv.mml(com.bytedance.sdk.openadsdk.component.reward.qdl.jpc.f17066ud)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void fs() {
        mzz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void hkc() {
        this.fs = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
    }

    protected abstract void jpc();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public View jtx() {
        return this.f16812ud.bch.gy();
    }

    public abstract boolean jyq();

    public Map<String, Object> koa() {
        return null;
    }

    protected void ljh() {
        ljh ljhVar;
        rc rcVarEu;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || (ljhVar = qdlVar.f17090ud) == null || (rcVarEu = ljhVar.eu()) == null) {
            return;
        }
        if (rcVarEu.ud() == 1 || rcVarEu.ud() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.f16812ud;
            kdv kdvVar = new kdv(qdlVar2, qdlVar2.f17090ud);
            this.to = kdvVar;
            bjy bjyVar = this.f16812ud.bch;
            if (bjyVar != null) {
                bjyVar.qdl(kdvVar);
            }
        }
    }

    protected void lnr() {
        setContentView(this.f16812ud.ax);
        this.f16812ud.ax.qdl(this.lnr);
        this.lnr.qdl(this, this.mml);
        this.lnr.rq();
    }

    protected abstract void mml();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mml(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mo() {
    }

    public void mzz() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.exu();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null) {
            return;
        }
        qdlVar.koa.qdl();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        rc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        super.onCreate(bundle);
        this.exu = bundle != null ? bundle.getBoolean("enable_new_arch", false) : getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        aaj.qdl("BVA", "onCreate enableIvRvNewArch->" + this.exu + ",activity ->");
        yt.ud(getApplicationContext());
        if (!rdp.mzz()) {
            finish();
            return;
        }
        ljh ljhVarQdl = com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(getIntent(), bundle, this);
        if (ljhVarQdl == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ud.qdl(ljhVarQdl);
        this.rdp = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("adapt_decor_size", 0) == 1;
        aaj.qdl("BVA", "activity onCreate isAdaptDecorSize =" + this.rdp);
        ljhVarQdl.fco(String.valueOf(hashCode()));
        this.rq = ljhVarQdl.jb();
        qdl(ljhVarQdl, bundle);
        if (bundle != null) {
            if (ljhVarQdl.hkc()) {
                this.aaj.set(true);
            }
            if (ljhVarQdl.gy() && (qdlVar = this.f16812ud) != null) {
                qdlVar.exu.set(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.f16812ud;
            if (qdlVar2 != null) {
                qdlVar2.vu.wd();
            }
        }
        try {
            lnr();
            vu();
        } catch (Throwable th2) {
            aaj.qdl("TTAD.BVA", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.bjy.lnr.ud();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        aaj.qdl("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || this.lnr == null) {
            return;
        }
        if (qdlVar.dk > 0 && qdlVar.exu.get()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.f16812ud.dk);
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.f16812ud;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(strValueOf, qdlVar2.f17090ud, this.qdl, qdlVar2.bch.mzz());
            this.f16812ud.dk = 0L;
        }
        this.f16812ud.kdv.ud();
        this.mml.removeCallbacksAndMessages(null);
        this.lnr.jyq();
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.f16812ud.f17090ud);
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud(this.f16812ud.f17090ud);
        AdSlot adSlotJi = this.f16812ud.f17090ud.ji();
        if (!this.f16812ud.bch.kdv() && adSlotJi != null && TextUtils.isEmpty(adSlotJi.getBidAdm()) && !this.f16812ud.f17090ud.ilu()) {
            rdp.ud().post(new qdl(aaj(), adSlotJi));
        }
        com.bytedance.sdk.openadsdk.utils.bjy.qdl();
        kdv kdvVar = this.to;
        if (kdvVar != null) {
            kdvVar.mzz();
            this.to = null;
        }
        this.jl.qdl(this);
        mrf.qdl().qdl(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        aaj.qdl("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.exc();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        ljh ljhVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || (ljhVar = qdlVar.f17090ud) == null) {
            return;
        }
        if (this.jpc && !ljhVar.nln() && !TextUtils.isEmpty(ljh.qdl(this, ljhVar))) {
            finish();
        }
        if (ljhVar.nln()) {
            ljhVar.fs(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar;
        super.onResume();
        aaj.qdl("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.f16812ud == null || (udVar = this.lnr) == null) {
            return;
        }
        udVar.yt();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        qdlVar.irn = true;
        this.jl.qdl(this, qdlVar.zlt, qdlVar.taz, this.rdp);
        if (kdv()) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.f16812ud;
            qdlVar2.fco.qdl(qdlVar2.f17090ud.tvf());
        }
        this.f16812ud.gy.bjy();
        this.f16812ud.hkc.yt();
        this.f16812ud.xmv.mzz();
        if (this.lnr.ud()) {
            this.f16812ud.bch.qdl(this.lnr);
            this.f16812ud.bch.qdl(false, this, this.yt != 0);
        }
        this.yt++;
        tvp();
        to toVar = this.f16812ud.bqt;
        if (toVar != null) {
            toVar.wd();
        }
        this.f16812ud.koa.qdl(this.mml);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (qdlVar.exu.get()) {
            this.f16812ud.f17090ud.wd(true);
        }
        if (this.aaj.get()) {
            this.f16812ud.f17090ud.ekw();
        }
        if (!TextUtils.isEmpty(this.tvp)) {
            bundle.putString("single_process_listener_key", this.tvp);
        }
        bundle.putBoolean("enable_new_arch", this.exu);
        ljh ljhVar = this.f16812ud.f17090ud;
        int iQdl = ljhVar != null ? com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(ljhVar) : -1;
        this.exc = iQdl;
        com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(this.f16812ud, bundle, iQdl);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        aaj.qdl("BVA", "onStart mMetaIndex =" + this.exc + " this =" + this);
        if (this.exc >= 0) {
            com.bytedance.sdk.openadsdk.core.koa.qdl().lnr(this.exc);
            this.exc = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null) {
            return;
        }
        qdlVar.hkc.xmv();
        com.bytedance.sdk.openadsdk.utils.mml.qdl(this, this.f16812ud.f17090ud);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        aaj.qdl("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.aaj();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.to toVar;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || (toVar = qdlVar.vu) == null) {
            return;
        }
        toVar.ud(z10);
        this.f16812ud.vu.lnr(z10);
    }

    public boolean oth() {
        return false;
    }

    protected abstract void qdl(long j10, long j11);

    protected void qdl(@NonNull Intent intent) {
    }

    protected void rdp() {
        this.mml.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final void rq() {
        if (this.aaj.compareAndSet(false, true)) {
            aaj.qdl("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            jpc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void sy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public List<ljh> tid() {
        return this.f16812ud.f17090ud.gxp();
    }

    protected void to() {
    }

    protected void tvp() {
        if (oth() && !this.jtx) {
            this.jtx = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = tTBaseVideoActivity.f16812ud;
                    qdlVar.f17089rc.qdl(qdlVar.koa.qdl(tTBaseVideoActivity.rq));
                    TTBaseVideoActivity.this.to();
                }
            });
        }
    }

    protected void ud(boolean z10, boolean z11) {
    }

    protected void uw() {
    }

    protected void wd() {
        if (vu.lnr(this.f16812ud.f17090ud)) {
            qdl(false, ud.C0294ud.lnr);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar != null) {
            udVar.qdl(this.f16812ud.gy.mo());
            this.lnr.uw();
        }
    }

    public abstract FrameLayout xmv();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void yt() {
        if (!this.f16812ud.rdp.getAndSet(true) || vu.lnr(this.f16812ud.f17090ud)) {
            this.f16812ud.vu.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void ud() {
        rc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected boolean qdl() {
        return true;
    }

    private void qdl(ljh ljhVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = new com.bytedance.sdk.openadsdk.component.reward.qdl.qdl(this, this.mml, ljhVar, this, 0, this.rdp);
        this.f16812ud = qdlVar;
        com.bytedance.sdk.openadsdk.component.reward.qdl.ud.qdl(qdlVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            qdl(intent);
            ljhVar.qdl(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.f16812ud.mlb) {
            mml();
        }
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVarQdl = com.bytedance.sdk.openadsdk.component.reward.ud.mo.qdl(this.f16812ud);
        this.lnr = udVarQdl;
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.f16812ud;
        qdlVar2.en = udVarQdl;
        com.bytedance.sdk.openadsdk.utils.bjy.qdl(qdlVar2);
        Objects.toString(this.lnr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
        if (!this.exu || com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            return;
        }
        if (bundle != null) {
            this.tvp = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.tvp = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.tvp = "";
        }
    }

    public void qdl(boolean z10, int i10) {
        qdl(z10, false, i10);
    }

    public void qdl(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.qdl(z10, z11, false, i10);
    }

    public void qdl(boolean z10, boolean z11) {
        if (!this.exu || TextUtils.isEmpty(this.tvp)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(this.tvp, z10, z11);
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        if (udVar == null) {
            return;
        }
        udVar.qdl(message);
    }

    protected IListenerManager qdl(int i10) {
        if (this.mzz == null) {
            this.mzz = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(i10));
        }
        return this.mzz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public boolean qdl(long j10, boolean z10) {
        fs fsVar;
        com.bytedance.sdk.openadsdk.core.model.aaj aajVar;
        if (this.f16812ud == null) {
            return false;
        }
        this.bjy.set(false);
        com.bytedance.sdk.openadsdk.mml.wd wdVarMzz = this.f16812ud.mzz();
        FrameLayout frameLayoutXmv = xmv();
        if (frameLayoutXmv == null) {
            return false;
        }
        this.f16812ud.bch.qdl(frameLayoutXmv, wdVarMzz);
        Map<String, Object> mapKoa = koa();
        lnr.qdl qdlVar = new lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl(long j11, int i10) {
                com.bytedance.sdk.openadsdk.utils.rdp rdpVar;
                com.bytedance.sdk.openadsdk.utils.rdp rdpVar2;
                aaj.qdl("TTAD.BVA", "onComplete() called with: totalPlayTime = [" + j11 + "], percent = [" + i10 + "], mVideoHasCompleted=" + TTBaseVideoActivity.this.bjy.get());
                if (TTBaseVideoActivity.this.bjy.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.bjy.set(true);
                TTBaseVideoActivity.this.mml.removeMessages(300);
                TTBaseVideoActivity.this.rdp();
                TTBaseVideoActivity.this.bch();
                TTBaseVideoActivity.this.f16812ud.bch.qdl(j11, j11);
                boolean zOth = TTBaseVideoActivity.this.oth();
                if (zOth) {
                    TTBaseVideoActivity.this.f16812ud.bqt.ud(true);
                } else {
                    TTBaseVideoActivity.this.f16812ud.exc.set(true);
                }
                TTBaseVideoActivity.this.uw();
                if (TTBaseVideoActivity.this.f16812ud.f17090ud.taz() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTBaseVideoActivity.this.f16812ud;
                    if (qdlVar2.lnr) {
                        qdlVar2.uw.lnr().lnr(TTBaseVideoActivity.this.f16812ud.f17090ud);
                        com.bytedance.sdk.openadsdk.utils.bjy.ud();
                    }
                }
                if (!zOth && TTBaseVideoActivity.this.f16812ud.f17090ud.hrh()) {
                    TTBaseVideoActivity.this.f16812ud.f17090ud.om(1);
                    TTBaseVideoActivity.this.f16812ud.gy.yt();
                }
                if (TTBaseVideoActivity.this.f16812ud.f17090ud.taz() == 21 && !TTBaseVideoActivity.this.f16812ud.f17090ud.bjy()) {
                    TTBaseVideoActivity.this.f16812ud.f17090ud.mml(true);
                    TTBaseVideoActivity.this.f16812ud.gy.yt();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.fs && tTBaseVideoActivity.f16812ud.bqt.fs()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.oth()) {
                    if (com.bytedance.sdk.openadsdk.core.model.aaj.mml(TTBaseVideoActivity.this.f16812ud.f17090ud) || com.bytedance.sdk.openadsdk.core.model.aaj.ud(TTBaseVideoActivity.this.f16812ud.f17090ud) || com.bytedance.sdk.openadsdk.core.model.aaj.wd(TTBaseVideoActivity.this.f16812ud.f17090ud)) {
                        TTBaseVideoActivity.this.qdl(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.aaj.ud(TTBaseVideoActivity.this.f16812ud.f17090ud) || (rdpVar2 = TTBaseVideoActivity.this.f16812ud.kab) == null) {
                            return;
                        }
                        rdpVar2.qdl(0L);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.aaj.qdl(TTBaseVideoActivity.this.f16812ud.f17090ud) && !TTBaseVideoActivity.this.f16812ud.jtx.get()) {
                        TTBaseVideoActivity.this.f16812ud.qdl(true);
                        TTBaseVideoActivity.this.f16812ud.fco.mzz(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = tTBaseVideoActivity2.f16812ud;
                if (!qdlVar3.lnr) {
                    tTBaseVideoActivity2.bqt();
                    return;
                }
                if (qdlVar3.f17090ud.yh()) {
                    if (!zOth) {
                        TTBaseVideoActivity.this.f16812ud.fco.lnr();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.f16812ud.bqt.rq() == 1) {
                            TTBaseVideoActivity.this.f16812ud.fco.lnr();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.qdl(false, 5);
                if (!zOth && com.bytedance.sdk.openadsdk.core.model.aaj.ud(TTBaseVideoActivity.this.f16812ud.f17090ud) && (rdpVar = TTBaseVideoActivity.this.f16812ud.kab) != null) {
                    rdpVar.qdl(0L);
                }
                if (ljh.mzz(TTBaseVideoActivity.this.f16812ud.f17090ud)) {
                    return;
                }
                TTBaseVideoActivity.this.f16812ud.bch.qdl("skip", true);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void ud(long j11, int i10) {
                com.bytedance.sdk.openadsdk.core.model.aaj aajVar2;
                TTBaseVideoActivity.this.mml.removeMessages(300);
                fs fsVar2 = TTBaseVideoActivity.this.f16812ud.gy;
                if (fsVar2 != null && (aajVar2 = fsVar2.bjy) != null) {
                    aajVar2.to();
                }
                if (TTBaseVideoActivity.this.f16812ud.bch.mo()) {
                    TTBaseVideoActivity.this.exu();
                    return;
                }
                TTBaseVideoActivity.this.f16812ud.bch.exc();
                TTBaseVideoActivity.this.bch();
                if (TTBaseVideoActivity.this.f16812ud.f17090ud.mo()) {
                    TTBaseVideoActivity.this.f16812ud.bqt.qdl(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity.f16812ud.lnr) {
                    tTBaseVideoActivity.finish();
                    return;
                }
                tTBaseVideoActivity.qdl(false, true, 3);
                bjy bjyVar = TTBaseVideoActivity.this.f16812ud.bch;
                bjyVar.qdl(1 ^ (bjyVar.hzv() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl() {
                TTBaseVideoActivity.this.mml.removeMessages(300);
                TTBaseVideoActivity.this.rdp();
                TTBaseVideoActivity.this.bch();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.f16812ud.lnr) {
                    tTBaseVideoActivity.qdl(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                bjy bjyVar = TTBaseVideoActivity.this.f16812ud.bch;
                bjyVar.qdl(!bjyVar.hzv() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.f16812ud.bch.hzv() ? 1 : 0));
                TTBaseVideoActivity.this.f16812ud.bch.exc();
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
            public void qdl(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTBaseVideoActivity.this.f16812ud;
                if (!qdlVar2.irn && qdlVar2.bch.mo()) {
                    TTBaseVideoActivity.this.f16812ud.bch.jyq();
                }
                if (TTBaseVideoActivity.this.f16812ud.to.get()) {
                    return;
                }
                TTBaseVideoActivity.this.mml.removeMessages(300);
                if (j11 != TTBaseVideoActivity.this.f16812ud.bch.exu()) {
                    TTBaseVideoActivity.this.rdp();
                }
                if (!TTBaseVideoActivity.this.oth() || TTBaseVideoActivity.this.f16812ud.bch.mo()) {
                    TTBaseVideoActivity.this.f16812ud.bch.qdl(j11, j12);
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    long j13 = j11 / 1000;
                    tTBaseVideoActivity.mo = (int) (tTBaseVideoActivity.f16812ud.bch.fco() - j13);
                    int i10 = (int) j13;
                    if ((TTBaseVideoActivity.this.f16812ud.aaj.get() || TTBaseVideoActivity.this.f16812ud.rq.get()) && TTBaseVideoActivity.this.f16812ud.bch.mo()) {
                        TTBaseVideoActivity.this.f16812ud.bch.jyq();
                    }
                    if (TTBaseVideoActivity.this.aaj()) {
                        TTBaseVideoActivity.this.f16812ud.gy.mzz(i10);
                    }
                    if (TTBaseVideoActivity.this.jyq()) {
                        if (TTBaseVideoActivity.this.f16812ud.bch.mml()) {
                            kdv kdvVar = TTBaseVideoActivity.this.to;
                            if (kdvVar != null) {
                                kdvVar.qdl(j11);
                                return;
                            }
                            return;
                        }
                        kdv kdvVar2 = TTBaseVideoActivity.this.to;
                        if (kdvVar2 == null || !kdvVar2.qdl()) {
                            TTBaseVideoActivity.this.qdl(j11, j12);
                            return;
                        }
                        return;
                    }
                    TTBaseVideoActivity.this.qdl(j11, j12);
                }
            }
        };
        this.f16812ud.bch.qdl(qdlVar);
        if (!this.f16812ud.f17090ud.mo() && (fsVar = this.f16812ud.gy) != null && (aajVar = fsVar.bjy) != null) {
            aajVar.qdl(qdlVar);
        }
        boolean zQdl = this.f16812ud.bch.qdl(j10, z10, mapKoa, this.lnr);
        ud(zQdl, z10);
        return zQdl;
    }
}
