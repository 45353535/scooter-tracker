package com.inmobi.ads;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.C4069u1;
import com.inmobi.media.C4094v1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final Animation a(InMobiBanner.AnimationType animationType, float f10, float f11) {
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i10 = a.f36517a[animationType.ordinal()];
        if (i10 == 1) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.5f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(false);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            return alphaAnimation;
        }
        if (i10 == 2) {
            C4069u1 c4069u1 = new C4069u1(f10 / 2.0f, f11 / 2.0f);
            c4069u1.setDuration(500L);
            c4069u1.setFillAfter(false);
            c4069u1.setInterpolator(new AccelerateInterpolator());
            return c4069u1;
        }
        if (i10 != 3) {
            return null;
        }
        C4094v1 c4094v1 = new C4094v1(f10 / 2.0f, f11 / 2.0f);
        c4094v1.setDuration(500L);
        c4094v1.setFillAfter(false);
        c4094v1.setInterpolator(new AccelerateInterpolator());
        return c4094v1;
    }
}
