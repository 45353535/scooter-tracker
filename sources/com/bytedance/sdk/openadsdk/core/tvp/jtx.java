package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class jtx extends com.bytedance.sdk.openadsdk.core.exu.ud.mo implements View.OnClickListener {
    private boolean yt;

    public jtx(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, com.bytedance.sdk.openadsdk.mml.wd wdVar, boolean z10) {
        super(context, ljhVar, false, str, false, false, wdVar);
        this.yt = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z10);
    }

    private void exc() {
        wd();
        RelativeLayout relativeLayout = this.f17197wd;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.qdl.tdy().to(), this.qdl.tdy().lnr(), this.qdl.tdy().ud(), this.jpc, this.qdl);
            }
        }
        jl();
    }

    private void jl() {
        ax.qdl((View) this.f17197wd, 0);
        ax.qdl((View) this.jpc, 0);
        ax.qdl((View) this.to, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo
    protected void lnr() {
        if (this.yt) {
            super.lnr();
        }
    }

    public void mml() {
        ImageView imageView = this.to;
        if (imageView != null) {
            ax.qdl((View) imageView, 8);
        }
    }

    protected void mzz() {
        wd();
        ax.qdl((View) this.f17197wd, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.tvp;
        if (imageView != null && imageView.getVisibility() == 0) {
            ax.mzz(this.f17197wd);
        }
        lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        ImageView imageView = this.tvp;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z10);
        } else {
            exc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.tvp;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i10);
        } else {
            exc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo
    protected void qdl(boolean z10) {
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.yt = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.mzz(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVarFs;
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr lnrVar = this.f17195ud;
        if (lnrVar == null || (mzzVarFs = lnrVar.fs()) == null) {
            return;
        }
        mzzVarFs.qdl(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo
    protected void ud() {
        if (!this.mzz || !bch.ud(this.fs)) {
            this.mml = false;
        }
        super.ud();
    }

    public void qdl(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr lnrVar = this.f17195ud;
        if (lnrVar != null) {
            lnrVar.ud(i10, i11);
        }
    }
}
