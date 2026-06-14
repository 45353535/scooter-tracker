package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class bjy extends mml {
    public bjy(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    List<ObjectAnimator> qdl() {
        float f10;
        float fQdl = com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.f16298ud.mo());
        float fQdl2 = com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.f16298ud.wd());
        float f11 = 0.0f;
        if ("reverse".equals(this.f16298ud.jtx())) {
            f10 = fQdl2;
            fQdl2 = 0.0f;
            f11 = fQdl;
            fQdl = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.mml.ud.qdl(this.lnr.getContext())) {
            fQdl = -fQdl;
            f11 = -f11;
        }
        this.lnr.setTranslationX(fQdl);
        this.lnr.setTranslationY(fQdl2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "translationX", fQdl, f11).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lnr, "translationY", fQdl2, f10).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        arrayList.add(qdl(duration2));
        return arrayList;
    }
}
