package com.bytedance.sdk.openadsdk.core.rq.ud.qdl;

import android.content.Context;
import com.bytedance.adsdk.ud.mo;
import com.bytedance.adsdk.ugeno.mml;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends mo {
    private mml qdl;

    public ud(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ud.mo, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // com.bytedance.adsdk.ud.mo, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    public void qdl(mml mmlVar) {
        this.qdl = mmlVar;
    }
}
