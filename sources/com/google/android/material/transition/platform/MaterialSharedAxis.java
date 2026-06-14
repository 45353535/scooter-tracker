package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f28560g = R.attr.motionDurationLong1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f28561h = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f28563f;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Axis {
    }

    public MaterialSharedAxis(int i10, boolean z10) {
        super(g(i10, z10), i());
        this.f28562e = i10;
        this.f28563f = z10;
    }

    private static VisibilityAnimatorProvider g(int i10, boolean z10) {
        if (i10 == 0) {
            return new SlideDistanceProvider(z10 ? GravityCompat.END : GravityCompat.START);
        }
        if (i10 == 1) {
            return new SlideDistanceProvider(z10 ? 80 : 48);
        }
        if (i10 == 2) {
            return new ScaleProvider(z10);
        }
        throw new IllegalArgumentException("Invalid axis: " + i10);
    }

    private static VisibilityAnimatorProvider i() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    int d(boolean z10) {
        return f28560g;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    int e(boolean z10) {
        return f28561h;
    }

    public int getAxis() {
        return this.f28562e;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.f28563f;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
