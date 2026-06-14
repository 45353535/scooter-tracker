package com.bytedance.sdk.openadsdk.qdl.ud.qdl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.jtx;
import com.bytedance.sdk.openadsdk.core.tvp.aaj;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends com.bytedance.sdk.openadsdk.core.tvp.qdl {
    private com.bytedance.sdk.openadsdk.qdl.ud.qdl exu;
    private aaj qdl;

    public qdl(@NonNull Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.qdl
    protected void qdl(View view, int i10, jtx jtxVar) {
        aaj aajVar = this.qdl;
        if (aajVar != null) {
            aajVar.qdl(view, i10, jtxVar);
        }
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar) {
        this.exu = qdlVar;
    }

    public void qdl(aaj aajVar) {
        this.qdl = aajVar;
        aajVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
