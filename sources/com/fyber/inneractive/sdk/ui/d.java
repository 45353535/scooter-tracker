package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.R;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f23832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f23833b;

    public d(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f23833b = fyberAdIdentifierLocal;
        this.f23832a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f23833b;
        if (fyberAdIdentifierLocal.f23805o) {
            fyberAdIdentifierLocal.f23803m.setImageResource(R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f23833b;
            FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.f23803m, fyberAdIdentifierLocal2.f23821g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f23808r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f23803m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f23803m.setImageResource(R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.a(this.f23833b.f23803m, null);
        }
        this.f23832a.start();
        this.f23833b.f23806p = this.f23832a;
    }
}
