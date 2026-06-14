package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class rq extends mml {
    public rq(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    List<ObjectAnimator> qdl() {
        float f10;
        float fRq = (float) this.f16298ud.rq();
        float fFs = (float) this.f16298ud.fs();
        String strJtx = this.f16298ud.jtx();
        float f11 = 1.0f;
        if ("reverse".equals(strJtx) || "alternate-reverse".equals(strJtx)) {
            f10 = 1.0f;
        } else {
            f10 = fFs;
            fFs = 1.0f;
            f11 = fRq;
            fRq = 1.0f;
        }
        this.lnr.setTag(2097610710, this.f16298ud.ud());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "scaleX", fRq, f11).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lnr, "scaleY", fFs, f10).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        arrayList.add(qdl(duration2));
        return arrayList;
    }
}
