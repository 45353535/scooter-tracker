package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class fs extends mml {
    public fs(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> qdl() {
        int i10;
        int i11;
        this.lnr.setTag(2097610711, Integer.valueOf(this.f16298ud.mml()));
        View view = this.lnr;
        if (view == null || !com.bytedance.sdk.component.adexpress.mml.ud.qdl(view.getContext())) {
            i10 = 0;
            i11 = 1;
        } else {
            i11 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "shineValue", i10, i11).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        return arrayList;
    }
}
