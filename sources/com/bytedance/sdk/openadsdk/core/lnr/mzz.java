package com.bytedance.sdk.openadsdk.core.lnr;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mzz extends qdl {
    public mzz(@NonNull Context context, @NonNull ljh ljhVar, @NonNull String str, int i10) {
        super(context, ljhVar, str, i10);
    }

    protected abstract void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, int i10, int i11, int i12, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl, com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
    public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, boolean z10) {
        if (qdl(view, z10)) {
            qdl(view, f10, f11, f12, f13, sparseArray, this.koa, this.xmv, this.bqt, z10);
        }
        super.qdl(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
