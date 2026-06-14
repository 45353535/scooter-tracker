package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
class InsetsAnimationCallback extends WindowInsetsAnimationCompat.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f25698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f25701e;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.f25701e = new int[2];
        this.f25698b = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f25698b.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f25698b.getLocationOnScreen(this.f25701e);
        this.f25699c = this.f25701e[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        Iterator<WindowInsetsAnimationCompat> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f25698b.setTranslationY(AnimationUtils.lerp(this.f25700d, 0, r0.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsAnimationCompat.BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.f25698b.getLocationOnScreen(this.f25701e);
        int i10 = this.f25699c - this.f25701e[1];
        this.f25700d = i10;
        this.f25698b.setTranslationY(i10);
        return boundsCompat;
    }
}
