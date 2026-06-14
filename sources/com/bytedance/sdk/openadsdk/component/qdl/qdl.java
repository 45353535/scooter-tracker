package com.bytedance.sdk.openadsdk.component.qdl;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.bch.ud.mzz;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends com.bytedance.sdk.openadsdk.core.lnr.qdl {
    private final com.bytedance.sdk.openadsdk.component.jpc.qdl qdl;

    public qdl(@NonNull Context context, @NonNull ljh ljhVar, @NonNull String str, int i10, com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar) {
        super(context, ljhVar, str, i10);
        this.qdl = qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl, com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
    public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, boolean z10) {
        if (view.getTag() == "open_ad_click_button_tag") {
            qdl("click_bar");
        } else {
            qdl("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.qdl.lnr()));
        qdl(map);
        super.qdl(view, f10, f11, f12, f13, sparseArray, z10);
        mzz.qdl(((com.bytedance.sdk.openadsdk.core.lnr.ud) this).mo, 9);
    }
}
