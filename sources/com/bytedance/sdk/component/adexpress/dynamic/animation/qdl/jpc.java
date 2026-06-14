package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends mml {
    public jpc(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> qdl() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ((ViewGroup) this.lnr.getParent()).setClipChildren(false);
        ((ViewGroup) this.lnr.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.lnr.getParent().getParent().getParent()).setClipChildren(false);
        this.lnr.setTag(2097610712, this.f16298ud.jpc());
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        return arrayList;
    }
}
