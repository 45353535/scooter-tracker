package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends mml {
    public mo(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    List<ObjectAnimator> qdl() {
        float f10 = this.lnr.getLayoutParams().width;
        this.lnr.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "translationX", f10, 0.0f).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.lnr, "alpha", 0.0f, 1.0f).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        arrayList.add(qdl(duration2));
        return arrayList;
    }
}
