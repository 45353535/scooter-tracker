package com.bytedance.sdk.openadsdk.core.exu.ud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.s;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.exu.ud.lnr;
import com.bytedance.sdk.openadsdk.core.hzv;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.tvp.bch;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.mml.wd;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class mo extends com.bytedance.sdk.openadsdk.core.mo.lnr implements lnr.qdl, koa.qdl, lnr.qdl {
    private boolean aaj;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private final AtomicBoolean f17193ag;
    private ViewTreeObserver.OnGlobalLayoutListener ax;
    private String bch;
    protected boolean bjy;
    private boolean bqt;
    private final ViewTreeObserver.OnScrollChangedListener cx;
    private boolean ekw;
    private boolean exc;
    protected int exu;
    private final String fco;
    protected String fs;
    private lnr.InterfaceC0200lnr gy;
    private long hkc;
    private boolean hzv;
    private ViewGroup jl;
    protected ImageView jpc;
    public ud jtx;
    private String jyq;
    private final Handler kdv;
    private boolean koa;
    protected FrameLayout lnr;
    protected boolean mml;
    public wd mo;
    private View mrf;
    public boolean mzz;
    private final AtomicBoolean om;
    protected final ljh qdl;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private final boolean f17194rc;
    boolean rdp;
    protected boolean rq;
    protected ImageView to;
    protected ImageView tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected lnr f17195ud;
    private boolean uw;
    private long vu;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    private final Runnable f17196wc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected RelativeLayout f17197wd;
    private boolean xmv;
    private final Context yt;
    private static final Integer oth = 0;
    private static final Integer ljh = 1;

    public interface qdl {
        void qdl(View view, int i10);
    }

    public interface ud {
        void qdl(boolean z10, long j10, long j11, long j12, boolean z11);
    }

    public mo(@NonNull Context context, @NonNull ljh ljhVar, boolean z10, wd wdVar) {
        this(context, ljhVar, z10, "embeded_ad", false, false, wdVar);
    }

    private void aaj() {
        lnr lnrVar = this.f17195ud;
        if (lnrVar == null) {
            return;
        }
        lnrVar.mml(this.exc);
        this.f17195ud.qdl((lnr.qdl) this);
        this.f17195ud.qdl((lnr.qdl) this);
    }

    private void bch() {
        this.ekw = fs();
        fco.qdl(this.f17196wc);
    }

    private void bqt() {
        if (ekw() || !uw()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    private boolean ekw() {
        return this.aaj;
    }

    private void exc() {
        this.f17195ud = new lnr(this.yt, this.lnr, this.qdl, this.fs, !ekw(), this.xmv, this.bqt, this.mo);
        aaj();
        if (this.ax == null) {
            this.ax = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mo.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    mo moVar;
                    lnr lnrVar;
                    if (mo.this.jl == null || mo.this.jl.getViewTreeObserver() == null || (lnrVar = (moVar = mo.this).f17195ud) == null) {
                        return;
                    }
                    lnrVar.qdl(moVar.jl.getWidth(), mo.this.jl.getHeight());
                    mo.this.jl.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    mo.this.ax = null;
                }
            };
            this.jl.getViewTreeObserver().addOnGlobalLayoutListener(this.ax);
        }
    }

    private void hkc() {
        ax.mzz(this.tvp);
        ax.mzz(this.f17197wd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jl() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.kdv;
        if (handler == null || jElapsedRealtime - this.hkc <= 500) {
            return;
        }
        this.hkc = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private void jyq() {
        lnr lnrVar = this.f17195ud;
        if (lnrVar == null) {
            exc();
        } else if (s.a(lnrVar) && !ekw()) {
            this.f17195ud.jtx();
        }
        if (this.f17195ud == null || !this.f17193ag.get()) {
            return;
        }
        this.f17193ag.set(false);
        ud();
        if (!jpc()) {
            if (this.f17195ud.exu()) {
                this.f17195ud.exu();
                ud(true);
                return;
            } else {
                wd();
                ax.qdl((View) this.f17197wd, 0);
                return;
            }
        }
        ax.qdl((View) this.f17197wd, 8);
        ImageView imageView = this.tvp;
        if (imageView != null) {
            ax.qdl((View) imageView, 8);
        }
        ljh ljhVar = this.qdl;
        if (ljhVar == null || ljhVar.tdy() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(this.qdl.lhl()).lnr(), this.qdl);
        udVarQdl.ud(this.qdl.yre());
        udVarQdl.ud(this.jl.getWidth());
        udVarQdl.lnr(this.jl.getHeight());
        udVarQdl.lnr(this.qdl.ir());
        udVarQdl.qdl(0L);
        udVarQdl.qdl(tvp());
        qdl(udVarQdl);
        this.f17195ud.qdl(udVarQdl);
        this.f17195ud.ud(false);
    }

    private boolean kdv() {
        return 5 == yt.mml().ud(this.qdl.fz());
    }

    private void koa() {
        this.kdv.removeMessages(1);
        rdp.lnr().removeCallbacks(this.f17196wc);
    }

    private void ljh() {
        if (!this.f17193ag.get()) {
            this.f17193ag.set(true);
            lnr lnrVar = this.f17195ud;
            if (lnrVar != null) {
                lnrVar.qdl(true, 3);
            }
        }
        this.om.set(false);
    }

    private void mml() {
        qdl(0L, 0);
        this.gy = null;
    }

    private void mzz() {
        addView(qdl(this.yt));
        exc();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mo.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                mo.this.jl();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                mo.this.jl();
            }
        });
    }

    private void oth() {
        this.jtx = null;
        if (s.a(this.f17195ud) && !ekw()) {
            this.f17195ud.fco();
        }
        rq();
        qdl(false);
        ljh();
    }

    private boolean rc() {
        return 2 == yt.mml().ud(this.qdl.fz());
    }

    private boolean uw() {
        ljh ljhVar = this.qdl;
        if (ljhVar == null) {
            return false;
        }
        return ljhVar.hz();
    }

    private void vu() {
        if (this.f17195ud == null || ekw()) {
            return;
        }
        if ((!uw() || com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_is_update_flag", false)) && uw()) {
            long jTvp = this.f17195ud.tvp();
            long jWd = this.f17195ud.wd() + jTvp;
            boolean zQdl = com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_native_video_complete", false);
            long jQdl = com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jQdl2 = com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_total_play_duration", jWd);
            long jQdl3 = com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_duration", jTvp);
            com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.f17195ud.ud(zQdl);
            this.f17195ud.ud(jQdl);
            this.f17195ud.lnr(jQdl2);
            this.f17195ud.mml(jQdl3);
        }
    }

    private boolean xmv() {
        if (ekw() || !uw()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.mml.qdl.qdl("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    public void bjy() {
        if (jl.lnr(yt.qdl()) != 0 && fs()) {
            if (this.f17195ud.rq() != null) {
                if (this.f17195ud.rq().wd()) {
                    qdl(true, ljh.intValue());
                    ud();
                    Handler handler = this.kdv;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.f17195ud.rq().ud() && !this.bjy) {
                    to();
                    if (s.a(this.f17195ud)) {
                        this.f17195ud.gy();
                        return;
                    }
                    return;
                }
            }
            if (jpc() || this.om.get()) {
                return;
            }
            this.om.set(true);
            hkc();
            ljh ljhVar = this.qdl;
            if (ljhVar != null && ljhVar.tdy() != null) {
                hkc();
                this.qdl.tdy();
                com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(this.qdl.lhl()).lnr(), this.qdl);
                udVarQdl.ud(this.qdl.yre());
                udVarQdl.ud(this.jl.getWidth());
                udVarQdl.lnr(this.jl.getHeight());
                udVarQdl.lnr(this.qdl.ir());
                udVarQdl.qdl(this.vu);
                udVarQdl.qdl(tvp());
                udVarQdl.qdl(CacheDirFactory.getICacheDir(this.qdl.lhl()).lnr());
                qdl(udVarQdl);
                this.f17195ud.qdl(udVarQdl);
            }
            Handler handler2 = this.kdv;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            qdl(false);
        }
    }

    public boolean exu() {
        boolean z10 = false;
        if (jl.lnr(yt.qdl()) == 0) {
            return false;
        }
        if (this.f17195ud.rq() != null && this.f17195ud.rq().mo()) {
            qdl(false, oth.intValue());
            Handler handler = this.kdv;
            z10 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z10;
    }

    boolean fs() {
        return hzv.qdl(this, 50, bch.ud(this.fs) ? 1 : 5, false);
    }

    public double getCurrentPlayTime() {
        if (this.f17195ud != null) {
            return (r0.mo() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public lnr getNativeVideoController() {
        return this.f17195ud;
    }

    public boolean jpc() {
        return this.exc;
    }

    public void jtx() {
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        ljh ljhVar = this.qdl;
        if (ljhVar == null || (mmlVarZm = ljhVar.zm()) == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.mzz(this.vu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.lnr.qdl
    public void mo() {
        lnr.InterfaceC0200lnr interfaceC0200lnr = this.gy;
        if (interfaceC0200lnr != null) {
            interfaceC0200lnr.e_();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        jyq();
        if (this.bjy) {
            getViewTreeObserver().addOnScrollChangedListener(this.cx);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oth();
        if (this.bjy) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.cx);
            }
            ViewGroup viewGroup = this.jl;
            if (viewGroup == null || this.ax == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.ax);
                this.ax = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        jyq();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ud udVar;
        lnr lnrVar;
        if (!this.aaj && (udVar = this.jtx) != null && (lnrVar = this.f17195ud) != null) {
            udVar.qdl(lnrVar.exu(), this.f17195ud.tvp(), this.f17195ud.hkc(), this.f17195ud.mo(), this.exc);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        oth();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        lnr lnrVar;
        lnr lnrVar2;
        lnr lnrVar3;
        lnr lnrVar4;
        if ("open_ad".equals(this.fs)) {
            koa();
            return;
        }
        this.uw = z10;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(this.qdl, z10);
        vu();
        if (this.bjy) {
            if (xmv() && (lnrVar4 = this.f17195ud) != null && lnrVar4.exu()) {
                bqt();
                ax.qdl((View) this.f17197wd, 8);
                ud(true);
                mml();
                return;
            }
            ud();
            if (!ekw() && jpc() && (lnrVar2 = this.f17195ud) != null && !lnrVar2.ljh()) {
                if (this.kdv != null) {
                    if (z10 && (lnrVar3 = this.f17195ud) != null && !lnrVar3.exu()) {
                        this.kdv.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        koa();
                        qdl(false, oth.intValue());
                        return;
                    }
                }
                return;
            }
            if (jpc()) {
                return;
            }
            if (!z10 && (lnrVar = this.f17195ud) != null && lnrVar.rq() != null && this.f17195ud.rq().mo()) {
                koa();
                qdl(false, oth.intValue());
            } else if (z10) {
                this.kdv.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        lnr lnrVar;
        ljh ljhVar;
        lnr lnrVar2;
        lnr lnrVar3;
        super.onWindowVisibilityChanged(i10);
        vu();
        if (xmv() && (lnrVar3 = this.f17195ud) != null && lnrVar3.exu()) {
            bqt();
            ax.qdl((View) this.f17197wd, 8);
            ud(true);
            mml();
            return;
        }
        ud();
        if (ekw() || !jpc() || (lnrVar = this.f17195ud) == null || lnrVar.ljh() || (ljhVar = this.qdl) == null) {
            return;
        }
        if (this.koa && ljhVar.tdy() != null) {
            this.qdl.tdy();
            com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(this.qdl.lhl()).lnr(), this.qdl);
            udVarQdl.ud(this.qdl.yre());
            udVarQdl.ud(this.jl.getWidth());
            udVarQdl.lnr(this.jl.getHeight());
            udVarQdl.lnr(this.qdl.ir());
            udVarQdl.qdl(this.vu);
            udVarQdl.qdl(tvp());
            qdl(udVarQdl);
            this.f17195ud.qdl(udVarQdl);
            this.koa = false;
            ax.qdl((View) this.f17197wd, 8);
        }
        if (i10 != 0 || !this.bjy || this.kdv == null || (lnrVar2 = this.f17195ud) == null || lnrVar2.exu()) {
            return;
        }
        this.kdv.obtainMessage(1).sendToTarget();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
    public void qdl() {
    }

    public void rdp() {
        if (getNativeVideoController() == null || !s.a(getNativeVideoController())) {
            return;
        }
        lnr nativeVideoController = getNativeVideoController();
        nativeVideoController.qdl(nativeVideoController.fs(), this);
    }

    public void rq() {
        mzz mzzVarJyq;
        lnr lnrVar = this.f17195ud;
        if (lnrVar == null || (mzzVarJyq = lnrVar.fs()) == null) {
            return;
        }
        mzzVarJyq.qdl();
        View viewLnr = mzzVarJyq.lnr();
        if (viewLnr != null) {
            viewLnr.setVisibility(8);
            if (viewLnr.getParent() != null) {
                ((ViewGroup) viewLnr.getParent()).removeView(viewLnr);
            }
        }
    }

    public void setAdCreativeClickListener(qdl qdlVar) {
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.qdl(qdlVar);
        }
    }

    public void setControllerStatusCallBack(ud udVar) {
        this.jtx = udVar;
    }

    public void setIsAutoPlay(boolean z10) {
        if (this.hzv) {
            return;
        }
        int iUd = yt.mml().ud(this.qdl.fz());
        if (z10 && iUd != 4 && (!jl.mzz(this.yt) ? !(!jl.mo(this.yt) ? jl.mml(this.yt) : rc() || kdv()) : !rc())) {
            z10 = false;
        }
        this.exc = z10;
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.mml(z10);
        }
        if (this.exc) {
            ax.qdl((View) this.f17197wd, 8);
        } else {
            wd();
            RelativeLayout relativeLayout = this.f17197wd;
            if (relativeLayout != null) {
                ax.qdl((View) relativeLayout, 0);
                ljh ljhVar = this.qdl;
                if (ljhVar != null && ljhVar.tdy() != null) {
                    com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.qdl.tdy().to(), this.qdl.tdy().lnr(), this.qdl.tdy().ud(), this.jpc, this.qdl);
                }
            }
        }
        this.hzv = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.rq = z10;
    }

    public void setNeedSelfManagerVideo(boolean z10) {
        this.bjy = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.qdl(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(lnr.InterfaceC0200lnr interfaceC0200lnr) {
        this.gy = interfaceC0200lnr;
    }

    public void setVideoAdLoadListener(lnr.mml mmlVar) {
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.qdl(mmlVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.jyq = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.exu.ud.ud udVar) {
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.qdl(udVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            ljh();
        }
    }

    public void to() {
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            mzz mzzVarJyq = lnrVar.fs();
            if (mzzVarJyq != null) {
                mzzVarJyq.qdl();
            }
            hkc();
        }
    }

    public boolean tvp() {
        return this.mml;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
    public void ud(long j10, int i10) {
    }

    public void wd() {
        View view;
        if (this.yt == null || (view = this.mrf) == null || view.getParent() == null || this.qdl == null || this.f17197wd != null) {
            return;
        }
        ViewParent parent = this.mrf.getParent();
        RelativeLayout relativeLayoutUd = ud(this.yt);
        if (parent != null && (parent instanceof ViewGroup)) {
            qdl(relativeLayoutUd, (ViewGroup) parent, this.mrf);
        }
        this.f17197wd = relativeLayoutUd;
        if (this.rq) {
            ax.qdl((View) this.to, 0);
        }
        if (this.qdl.tdy() != null && this.qdl.tdy().to() != null) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.qdl.tdy().to(), this.qdl.tdy().lnr(), this.qdl.tdy().ud(), this.jpc, this.qdl);
        }
        ImageView imageView = this.to;
        if (imageView != null) {
            imageView.setClickable(true);
            this.to.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mo.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    mo.this.lnr();
                }
            });
        }
    }

    public mo(@NonNull Context context, @NonNull ljh ljhVar, String str, boolean z10, boolean z11, wd wdVar) {
        this(context, ljhVar, false, str, z10, z11, wdVar);
    }

    protected void lnr() {
        if (exu()) {
            return;
        }
        bjy();
    }

    public mo(@NonNull Context context, @NonNull ljh ljhVar, wd wdVar) {
        this(context, ljhVar, false, wdVar);
    }

    protected void ud() {
        ljh ljhVar = this.qdl;
        if (ljhVar == null) {
            return;
        }
        int iFz = ljhVar.fz();
        int iUd = yt.mml().ud(iFz);
        int iLnr = jl.lnr(yt.qdl());
        if (iUd == 1) {
            this.exc = gy.mml(iLnr);
        } else if (iUd == 2) {
            this.exc = gy.mzz(iLnr) || gy.mml(iLnr) || gy.mo(iLnr);
        } else if (iUd == 3) {
            this.exc = false;
        } else if (iUd == 4) {
            this.rdp = true;
        } else if (iUd == 5) {
            this.exc = gy.mml(iLnr) || gy.mo(iLnr);
        }
        if (!this.aaj) {
            if (!this.mzz || !bch.ud(this.fs)) {
                this.mml = yt.mml().lnr(String.valueOf(iFz));
            }
        } else {
            this.mml = false;
        }
        if ("open_ad".equals(this.fs)) {
            this.exc = true;
            this.mml = true;
        }
        if (bch.ud(this.fs)) {
            this.mml = true;
        }
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.mml(this.exc);
        }
        this.mzz = true;
    }

    public mo(@NonNull Context context, @NonNull ljh ljhVar, boolean z10, String str, boolean z11, boolean z12, wd wdVar) {
        super(context);
        this.exc = true;
        this.mml = true;
        this.aaj = false;
        this.mzz = false;
        this.uw = true;
        this.xmv = false;
        this.bqt = true;
        this.rq = true;
        this.fs = "embeded_ad";
        this.exu = 50;
        this.koa = true;
        this.f17194rc = false;
        this.kdv = new koa(rdp.ud().getLooper(), this);
        this.hzv = false;
        this.fco = Build.MODEL;
        this.rdp = false;
        this.bjy = true;
        this.f17193ag = new AtomicBoolean(false);
        this.f17196wc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mo.4
            @Override // java.lang.Runnable
            public void run() {
                mo moVar = mo.this;
                moVar.qdl(moVar.ekw, mo.oth.intValue());
            }
        };
        this.om = new AtomicBoolean(false);
        this.cx = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mo.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                mo.this.jl();
            }
        };
        try {
            if (ljhVar.ks()) {
                this.bch = CacheDirFactory.getICacheDir(0).ud();
            }
        } catch (Throwable unused) {
        }
        if (wdVar != null) {
            this.mo = wdVar;
        }
        this.fs = str;
        this.yt = context;
        this.qdl = ljhVar;
        this.aaj = z10;
        setContentDescription("NativeVideoTsView");
        this.xmv = z11;
        this.bqt = z12;
        ud();
        mzz();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
    public void qdl(long j10, int i10) {
        lnr.InterfaceC0200lnr interfaceC0200lnr = this.gy;
        if (interfaceC0200lnr != null) {
            interfaceC0200lnr.h_();
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
    public void qdl(long j10, long j11) {
        lnr.InterfaceC0200lnr interfaceC0200lnr = this.gy;
        if (interfaceC0200lnr != null) {
            interfaceC0200lnr.qdl(j10, j11);
        }
    }

    private View qdl(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.jl = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.lnr = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.mrf = view;
        return frameLayout;
    }

    private RelativeLayout ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(context);
        wdVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        wdVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        mmlVar.setLayoutParams(layoutParams);
        mmlVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.jpc = mmlVar;
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        mmlVar2.setLayoutParams(layoutParams2);
        mmlVar2.setVisibility(8);
        mmlVar2.setBackground(com.bytedance.sdk.component.utils.ljh.lnr(context, "tt_new_play_video"));
        this.to = mmlVar2;
        wdVar.addView(mmlVar);
        wdVar.addView(mmlVar2);
        return wdVar;
    }

    private void qdl(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public boolean qdl(long j10, boolean z10, boolean z11) {
        boolean zQdl = false;
        this.jl.setVisibility(0);
        this.vu = j10;
        if (!ekw()) {
            return true;
        }
        this.f17195ud.qdl(false);
        ljh ljhVar = this.qdl;
        if (ljhVar != null && ljhVar.tdy() != null) {
            com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(this.qdl.lhl()).lnr(), this.qdl);
            udVarQdl.ud(this.qdl.yre());
            udVarQdl.ud(this.jl.getWidth());
            udVarQdl.lnr(this.jl.getHeight());
            udVarQdl.lnr(this.qdl.ir());
            udVarQdl.qdl(j10);
            udVarQdl.qdl(tvp());
            qdl(udVarQdl);
            if (z11) {
                this.f17195ud.ud(udVarQdl);
                return true;
            }
            zQdl = this.f17195ud.qdl(udVarQdl);
        }
        if (((j10 > 0 && !z10 && !z11) || (j10 > 0 && z10)) && this.f17195ud != null) {
            bjy.qdl qdlVar = new bjy.qdl();
            qdlVar.ud(this.f17195ud.mo());
            qdlVar.mml(this.f17195ud.tvp());
            qdlVar.lnr(this.f17195ud.wd());
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.ud(this.f17195ud.fs(), qdlVar);
        }
        return zQdl;
    }

    public void ud(boolean z10) {
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.ud(z10);
            mzz mzzVarJyq = this.f17195ud.fs();
            if (mzzVarJyq != null) {
                mzzVarJyq.ud();
                View viewLnr = mzzVarJyq.lnr();
                if (viewLnr != null) {
                    if (viewLnr.getParent() != null) {
                        ((ViewGroup) viewLnr.getParent()).removeView(viewLnr);
                    }
                    viewLnr.setVisibility(0);
                    addView(viewLnr);
                    mzzVarJyq.qdl(this.qdl, new WeakReference<>(this.yt), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
        if (message.what == 1) {
            bch();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(boolean z10, int i10) {
        if (this.qdl == null || this.f17195ud == null) {
            return;
        }
        boolean zXmv = xmv();
        bqt();
        if (zXmv && this.f17195ud.exu()) {
            this.f17195ud.exu();
            ud(true);
            mml();
            return;
        }
        if (z10 && this.uw && !this.f17195ud.exu() && !this.f17195ud.ljh()) {
            if (this.f17195ud.rq() != null && this.f17195ud.rq().wd()) {
                if (this.exc || i10 == 1) {
                    lnr lnrVar = this.f17195ud;
                    if (lnrVar != null) {
                        qdl(lnrVar.bch(), "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.fco)) {
                        this.f17195ud.lnr();
                    } else {
                        if (!tvp.ud().bjy()) {
                            zXmv = true;
                        }
                        this.f17195ud.wd(zXmv);
                    }
                    qdl(false);
                    lnr.InterfaceC0200lnr interfaceC0200lnr = this.gy;
                    if (interfaceC0200lnr != null) {
                        interfaceC0200lnr.g_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.exc && this.f17195ud.rq() == null) {
                if (!this.f17193ag.get()) {
                    this.f17193ag.set(true);
                }
                this.om.set(false);
                jyq();
                return;
            }
            return;
        }
        if (this.f17195ud.rq() == null || !this.f17195ud.rq().mo()) {
            return;
        }
        this.f17195ud.ud();
        qdl(true);
        lnr.InterfaceC0200lnr interfaceC0200lnr2 = this.gy;
        if (interfaceC0200lnr2 != null) {
            interfaceC0200lnr2.f_();
        }
    }

    public void qdl(boolean z10, String str) {
        if (bch.ud(this.fs)) {
            z10 = true;
        }
        this.mml = z10;
        lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.qdl(z10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.lnr.qdl
    public void qdl(int i10) {
        ud();
    }

    protected void qdl(boolean z10) {
        if (this.tvp == null) {
            this.tvp = new ImageView(getContext());
            if (tvp.ud().jtx() != null) {
                this.tvp.setImageBitmap(tvp.ud().jtx());
            } else {
                this.tvp.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(yt.qdl(), "tt_new_play_video"));
            }
            this.tvp.setScaleType(ImageView.ScaleType.FIT_XY);
            int iUd = ax.ud(getContext(), this.exu);
            int iUd2 = ax.ud(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iUd, iUd);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iUd2;
            layoutParams.bottomMargin = iUd2;
            this.jl.addView(this.tvp, layoutParams);
            this.tvp.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.exu.ud.mo.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    mo.this.bjy();
                }
            });
        }
        if (z10) {
            this.tvp.setVisibility(0);
        } else {
            this.tvp.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.fs.mo qdl(List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (s.a(this.f17195ud)) {
            return this.f17195ud.qdl(this, list);
        }
        return null;
    }

    private void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        try {
            if (this.qdl.ks()) {
                lnrVar.qdl(this.bch);
            }
        } catch (Throwable unused) {
        }
    }
}
