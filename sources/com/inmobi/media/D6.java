package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class D6 {
    public static final void a(ProgressBar progressBar, Fg progressConfig, float f10) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        progressBar.setProgressTintList(ColorStateList.valueOf(AbstractC4196z3.a(progressConfig.f36856c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(AbstractC4196z3.a(progressConfig.f36857d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (progressConfig.f36858e * f10));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
