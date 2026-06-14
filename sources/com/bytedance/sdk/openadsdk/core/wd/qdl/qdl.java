package com.bytedance.sdk.openadsdk.core.wd.qdl;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.ud.rq;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.model.jtx;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends lnr implements com.bytedance.sdk.component.adexpress.dynamic.mo.qdl {
    protected WeakReference<View> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private rq f17551ud;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mo.qdl
    public void qdl(rq rqVar) {
        this.f17551ud = rqVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mo.qdl
    public void qdl(View view) {
        this.qdl = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr
    public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, boolean z10) {
        qdl(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void qdl(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray) {
        if (this.f17551ud != null) {
            String strValueOf = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.qdl.jyq;
                if (view.getTag(i11) != null) {
                    strValueOf = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.f17551ud.qdl(view, i10, new jtx.qdl().mml(f10).lnr(f11).ud(f12).qdl(f13).ud(this.bch).qdl(this.uw).qdl(sparseArray).qdl(this.f17294rc).qdl(strValueOf).qdl());
        }
    }
}
