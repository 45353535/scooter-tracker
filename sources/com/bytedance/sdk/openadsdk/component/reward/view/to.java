package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.tvp.bjy;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    private final String jpc;
    private final Activity mo;
    com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo qdl;
    private boolean rq;

    @NonNull
    private com.bytedance.sdk.openadsdk.component.reward.qdl.qdl to;
    private mml tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    Handler f17128ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final ljh f17129wd;
    boolean lnr = false;
    boolean mml = false;
    boolean mzz = false;

    public to(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.to = qdlVar;
        this.mo = qdlVar.f17086ag;
        this.f17129wd = qdlVar.f17090ud;
        this.jpc = qdlVar.mzz;
    }

    public void bjy() {
        if (ljh.mzz(this.f17129wd) && this.f17129wd.fzn() == 3 && this.f17129wd.gg() == 0) {
            try {
                if (this.f17129wd.jb() == 1) {
                    int iUd = ax.ud(yt.qdl(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.tvp.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iUd;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void exu() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.jl();
    }

    public boolean fs() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            return mmlVar.koa instanceof com.bytedance.sdk.component.adexpress.mzz.qdl;
        }
        return false;
    }

    public void jpc() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.rq();
        }
    }

    public boolean lnr() {
        return this.lnr;
    }

    public boolean mml() {
        return this.mml;
    }

    public void mo() {
        if (this.rq) {
            return;
        }
        this.rq = true;
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.fs();
        }
        Handler handler = this.f17128ud;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public Handler mzz() {
        if (this.f17128ud == null) {
            this.f17128ud = new Handler(Looper.getMainLooper());
        }
        return this.f17128ud;
    }

    public void qdl(AdSlot adSlot, aaj aajVar) {
        if (this.mzz) {
            return;
        }
        this.mzz = true;
        mml mmlVar = new mml(this.to, adSlot, this.jpc);
        this.tvp = mmlVar;
        aajVar.qdl(mmlVar, mmlVar.getVideoFrameLayout());
    }

    public void rdp() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.exc();
        this.tvp.to();
    }

    public int rq() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            return mmlVar.getDynamicShowType();
        }
        return 0;
    }

    public boolean to() {
        mml mmlVar = this.tvp;
        return mmlVar != null && mmlVar.ljh();
    }

    public boolean tvp() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return false;
        }
        return mmlVar.jyq();
    }

    public FrameLayout ud() {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return null;
        }
        FrameLayout videoFrameLayout = mmlVar.getVideoFrameLayout();
        if (this.tvp.jyq()) {
            bjy();
        }
        return videoFrameLayout;
    }

    public void wd() {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.to();
        }
    }

    public mml qdl() {
        return this.tvp;
    }

    public void ud(boolean z10) {
        this.mml = z10;
    }

    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo ud(ljh ljhVar) {
        if (ljhVar.ygv() == 4) {
            return com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mo, this.jpc);
        }
        return null;
    }

    public void qdl(boolean z10) {
        this.lnr = z10;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.tvp.tvp tvpVar, com.bytedance.sdk.openadsdk.core.tvp.jpc jpcVar) {
        ljh ljhVar;
        if (this.tvp == null || (ljhVar = this.f17129wd) == null) {
            return;
        }
        this.qdl = ud(ljhVar);
        tvpVar.qdl(this.tvp);
        tvpVar.qdl(this.qdl);
        this.tvp.setClickListener(tvpVar);
        jpcVar.qdl((View) this.tvp);
        jpcVar.qdl(this.qdl);
        this.tvp.setClickCreativeListener(jpcVar);
    }

    public void qdl(bjy bjyVar) {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.setExpressVideoListenerProxy(bjyVar);
    }

    public void qdl(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        mml mmlVar = this.tvp;
        if (mmlVar == null) {
            return;
        }
        mmlVar.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public JSONObject qdl(JSONObject jSONObject) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            return mmlVar.qdl(jSONObject, this.to.f17090ud);
        }
        return null;
    }

    public void qdl(int i10, boolean z10) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.qdl(i10, z10, false);
        }
    }

    public void qdl(int i10, String str) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.ud(i10, str);
        }
    }

    public void qdl(ljh ljhVar) {
        mml mmlVar = this.tvp;
        if (mmlVar != null) {
            mmlVar.qdl(ljhVar, ljhVar.ji(), ljhVar.mzz(), this.to.gt, !r1.f17088ra);
        }
    }

    public void qdl(@NonNull com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.to = qdlVar;
    }
}
