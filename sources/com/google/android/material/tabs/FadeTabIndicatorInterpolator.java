package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes9.dex */
class FadeTabIndicatorInterpolator extends TabIndicatorInterpolator {
    FadeTabIndicatorInterpolator() {
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        if (f10 >= 0.5f) {
            view = view2;
        }
        RectF rectFA = TabIndicatorInterpolator.a(tabLayout, view);
        float fLerp = f10 < 0.5f ? AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f10) : AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f10);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fLerp * 255.0f));
    }
}
