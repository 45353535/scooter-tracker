package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class to extends mml {
    private qdl mml;
    private float mo;
    private float mzz;

    private class qdl {

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private View f16303ud;

        public qdl(View view) {
            this.f16303ud = view;
        }

        public void qdl(int i10) {
            if (!"top".equals(to.this.f16298ud.qdl())) {
                ViewGroup.LayoutParams layoutParams = this.f16303ud.getLayoutParams();
                layoutParams.height = i10;
                this.f16303ud.setLayoutParams(layoutParams);
                this.f16303ud.requestLayout();
                return;
            }
            if (to.this.lnr instanceof ViewGroup) {
                for (int i11 = 0; i11 < ((ViewGroup) to.this.lnr).getChildCount(); i11++) {
                    ((ViewGroup) to.this.lnr).getChildAt(i11).setTranslationY(i10 - to.this.mzz);
                }
            }
            to toVar = to.this;
            toVar.lnr.setTranslationY(toVar.mzz - i10);
        }
    }

    public to(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    List<ObjectAnimator> qdl() {
        int i10;
        String str;
        View view = this.lnr;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz)) {
            this.lnr = (View) this.lnr.getParent();
        }
        this.lnr.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "alpha", 0.0f, 1.0f).setDuration((int) (this.f16298ud.to() * 1000.0d));
        this.mml = new qdl(this.lnr);
        final int i11 = this.lnr.getLayoutParams().height;
        this.mzz = i11;
        this.mo = this.lnr.getLayoutParams().width;
        if ("left".equals(this.f16298ud.qdl()) || "right".equals(this.f16298ud.qdl())) {
            i10 = (int) this.mo;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.mml, str, 0, i10).setDuration((int) (this.f16298ud.to() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(qdl(duration));
        arrayList.add(qdl(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.to.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                to.this.mml.qdl(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }
        });
        return arrayList;
    }
}
