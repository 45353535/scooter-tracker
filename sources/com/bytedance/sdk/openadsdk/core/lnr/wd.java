package com.bytedance.sdk.openadsdk.core.lnr;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wd extends lnr {
    private lnr lnr;
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.fs.qdl f17302ud;

    public wd(String str, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) {
        this(str, qdlVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public void qdl(lnr lnrVar) {
        this.lnr = lnrVar;
    }

    public wd(String str, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, lnr lnrVar) {
        this.qdl = str;
        this.f17302ud = qdlVar;
        this.lnr = lnrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr
    protected void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar = this.f17302ud;
        if (qdlVar != null) {
            qdlVar.mzz(this.qdl);
        }
        if (view != null) {
            if (view.getId() == jtx.lnr) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == jtx.f17872wd) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.qdl);
            }
        }
        lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.bch = this.bch;
            lnrVar.uw = this.uw;
            lnrVar.xmv = this.xmv;
            int i10 = this.xmv;
            lnrVar.bqt = i10;
            lnrVar.koa = i10;
            lnrVar.qdl(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }
}
