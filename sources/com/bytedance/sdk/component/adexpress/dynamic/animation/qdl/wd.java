package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class wd extends mml {
    public wd(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> qdl() {
        this.lnr.setTag(2097610709, Integer.valueOf(this.f16298ud.lnr()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        return arrayList;
    }
}
