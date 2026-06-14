package com.bytedance.adsdk.ud.lnr.lnr;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.ud.lnr.ud.jtx;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends qdl {
    private final ud jpc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final com.bytedance.adsdk.ud.qdl.qdl.mml f16010wd;

    wd(com.bytedance.adsdk.ud.tvp tvpVar, mzz mzzVar, ud udVar, com.bytedance.adsdk.ud.wd wdVar) {
        super(tvpVar, mzzVar);
        this.jpc = udVar;
        com.bytedance.adsdk.ud.qdl.qdl.mml mmlVar = new com.bytedance.adsdk.ud.qdl.qdl.mml(tvpVar, this, new jtx("__container", mzzVar.rdp(), false), wdVar);
        this.f16010wd = mmlVar;
        List<com.bytedance.adsdk.ud.qdl.qdl.lnr> list = Collections.EMPTY_LIST;
        mmlVar.qdl(list, list);
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl, com.bytedance.adsdk.ud.qdl.qdl.mzz
    public void qdl(RectF rectF, Matrix matrix, boolean z10) {
        super.qdl(rectF, matrix, z10);
        this.f16010wd.qdl(rectF, this.qdl, z10);
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public com.bytedance.adsdk.ud.mzz.to rq() {
        com.bytedance.adsdk.ud.mzz.to toVarRq = super.rq();
        return toVarRq != null ? toVarRq : this.jpc.rq();
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public com.bytedance.adsdk.ud.lnr.ud.qdl to() {
        com.bytedance.adsdk.ud.lnr.ud.qdl qdlVar = super.to();
        return qdlVar != null ? qdlVar : this.jpc.to();
    }

    @Override // com.bytedance.adsdk.ud.lnr.lnr.qdl
    public void ud(Canvas canvas, Matrix matrix, int i10) {
        super.ud(canvas, matrix, i10);
        this.f16010wd.qdl(canvas, matrix, i10);
    }
}
