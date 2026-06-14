package com.bytedance.sdk.openadsdk.core.rq.lnr;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.yt;
import com.bytedance.sdk.openadsdk.core.tvp.bjy;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private ljh lnr;
    private com.bytedance.sdk.openadsdk.core.rq.lnr.qdl mml;
    private final boolean mzz;
    private lnr qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Context f17425ud;

    public static class qdl {
        public static lnr qdl(Context context, ljh ljhVar, boolean z10) {
            if (yt.qdl(ljhVar, z10)) {
                return new mml(context, ljhVar, z10);
            }
            return null;
        }
    }

    public ud(Context context, ljh ljhVar) {
        this(context, ljhVar, false);
    }

    public View lnr() {
        lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            return lnrVar.mml();
        }
        return null;
    }

    public void mml() {
        lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            lnrVar.lnr();
        }
    }

    public void qdl(bjy bjyVar) {
        lnr lnrVarQdl = qdl.qdl(this.f17425ud, this.lnr, this.mzz);
        this.qdl = lnrVarQdl;
        if (lnrVarQdl != null) {
            lnrVarQdl.qdl();
            this.qdl.qdl(bjyVar);
        }
    }

    public void ud() {
        lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            lnrVar.ud();
        }
    }

    public ud(Context context, ljh ljhVar, boolean z10) {
        this.f17425ud = context;
        this.lnr = ljhVar;
        this.mzz = z10;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.rq.lnr.qdl qdlVar) {
        this.mml = qdlVar;
        lnr lnrVar = this.qdl;
        if (lnrVar != null) {
            lnrVar.qdl(qdlVar);
        }
    }

    public void qdl(int i10) {
        hkc hkcVarMzz;
        lnr lnrVar = this.qdl;
        if (!(lnrVar instanceof mml) || (hkcVarMzz = ((mml) lnrVar).mzz()) == null || hkcVarMzz.qdl() == null) {
            return;
        }
        hkcVarMzz.qdl().qdl(i10);
    }

    public lnr qdl() {
        return this.qdl;
    }
}
