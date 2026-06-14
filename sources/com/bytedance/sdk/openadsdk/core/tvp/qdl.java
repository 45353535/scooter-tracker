package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.exu.ud.mo;
import com.bytedance.sdk.openadsdk.core.vu;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qdl extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    protected String fs;
    protected int jpc;
    protected com.bytedance.sdk.openadsdk.core.model.ljh lnr;
    protected com.bytedance.sdk.openadsdk.lnr.lnr mml;
    protected String mo;
    protected TTDislikeDialogAbstract mzz;
    private com.bytedance.sdk.openadsdk.mml.wd qdl;
    protected boolean rq;
    protected boolean to;
    protected int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected Context f17532ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected int f17533wd;

    public qdl(@NonNull Context context) {
        super(context);
        this.mo = "embeded_ad";
        this.to = true;
        this.rq = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    protected String getDescription() {
        return !TextUtils.isEmpty(this.lnr.gsv()) ? this.lnr.gsv() : !TextUtils.isEmpty(this.lnr.hvi()) ? this.lnr.hvi() : "";
    }

    protected String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.lnr;
        return ljhVar == null ? "" : (ljhVar.fhs() == null || TextUtils.isEmpty(this.lnr.fhs().ud())) ? !TextUtils.isEmpty(this.lnr.ca()) ? this.lnr.ca() : "" : this.lnr.fhs().ud();
    }

    public float getRealHeight() {
        return ax.lnr(this.f17532ud, this.jpc);
    }

    public float getRealWidth() {
        return ax.lnr(this.f17532ud, this.f17533wd);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    protected String getTitle() {
        return (this.lnr.fhs() == null || TextUtils.isEmpty(this.lnr.fhs().ud())) ? !TextUtils.isEmpty(this.lnr.ca()) ? this.lnr.ca() : !TextUtils.isEmpty(this.lnr.gsv()) ? this.lnr.gsv() : "" : this.lnr.fhs().ud();
    }

    protected com.bytedance.sdk.openadsdk.core.exu.ud.mo getVideoView() {
        com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar;
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.lnr;
        if (ljhVar != null && this.f17532ud != null) {
            if (com.bytedance.sdk.openadsdk.core.model.ljh.mzz(ljhVar)) {
                try {
                    moVar = new com.bytedance.sdk.openadsdk.core.exu.ud.mo(this.f17532ud, this.lnr, this.mo, true, false, this.qdl);
                    moVar.setVideoCacheUrl(this.fs);
                    moVar.setControllerStatusCallBack(new mo.ud() { // from class: com.bytedance.sdk.openadsdk.core.tvp.qdl.2
                        @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo.ud
                        public void qdl(boolean z10, long j10, long j11, long j12, boolean z11) {
                        }
                    });
                    moVar.setIsAutoPlay(this.to);
                    moVar.qdl(this.rq, "bannerGetVideoView");
                } catch (Throwable unused) {
                    moVar = null;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.ljh.mzz(this.lnr) && moVar != null && moVar.qdl(0L, true, false)) {
                    return moVar;
                }
            } else {
                moVar = null;
                if (!com.bytedance.sdk.openadsdk.core.model.ljh.mzz(this.lnr)) {
                }
            }
        }
        return null;
    }

    public void qdl() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.mzz;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lnr.lnr lnrVar = this.mml;
        if (lnrVar != null) {
            lnrVar.qdl();
        } else {
            TTDelegateActivity.qdl(this.lnr, (String) null);
        }
    }

    protected abstract void qdl(View view, int i10, com.bytedance.sdk.openadsdk.core.model.jtx jtxVar);

    public void setDislikeInner(vu vuVar) {
        if (vuVar instanceof com.bytedance.sdk.openadsdk.lnr.lnr) {
            this.mml = (com.bytedance.sdk.openadsdk.lnr.lnr) vuVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar;
        if (tTDislikeDialogAbstract != null && (ljhVar = this.lnr) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(ljhVar.ir(), this.lnr.fc());
        }
        this.mzz = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public qdl(@NonNull Context context, String str) {
        super(context);
        this.mo = "embeded_ad";
        this.to = true;
        this.rq = true;
        this.fs = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    protected void qdl(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.lnr.ud udVar;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.f17532ud;
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.lnr;
            String str = this.mo;
            udVar = new com.bytedance.sdk.openadsdk.core.lnr.qdl(context, ljhVar, str, gy.qdl(str));
        } else {
            Context context2 = this.f17532ud;
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 = this.lnr;
            String str2 = this.mo;
            udVar = new com.bytedance.sdk.openadsdk.core.lnr.ud(context2, ljhVar2, str2, gy.qdl(str2));
        }
        view.setOnTouchListener(udVar);
        view.setOnClickListener(udVar);
        udVar.qdl(new ud() { // from class: com.bytedance.sdk.openadsdk.core.tvp.qdl.1
            @Override // com.bytedance.sdk.openadsdk.core.tvp.ud
            public void qdl(View view2, int i10, com.bytedance.sdk.openadsdk.core.model.jtx jtxVar) {
                qdl.this.qdl(view2, i10, jtxVar);
            }
        });
    }

    protected void qdl(int i10) {
        this.rq = com.bytedance.sdk.openadsdk.core.yt.mml().lnr(String.valueOf(this.tvp));
        int iUd = com.bytedance.sdk.openadsdk.core.yt.mml().ud(i10);
        if (3 == iUd) {
            this.to = false;
            return;
        }
        int iLnr = com.bytedance.sdk.component.utils.jl.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl());
        if (1 != iUd || !gy.mml(iLnr)) {
            if (2 == iUd) {
                if (gy.mzz(iLnr) || gy.mml(iLnr) || gy.mo(iLnr)) {
                    this.to = true;
                    return;
                }
                return;
            }
            if (5 != iUd) {
                return;
            }
            if (!gy.mml(iLnr) && !gy.mo(iLnr)) {
                return;
            }
        }
        this.to = true;
    }

    protected void qdl(View view) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.lnr;
        if (ljhVar == null || ljhVar.tdy() == null || view == null) {
            return;
        }
        qdl(view, this.lnr.kab() == 1 && this.to);
    }
}
