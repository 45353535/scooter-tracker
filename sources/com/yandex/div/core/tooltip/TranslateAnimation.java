package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C4240b4;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import k8.dv;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/tooltip/TranslateAnimation;", "Landroid/transition/Visibility;", "Lk8/dv$c;", C4240b4.i.L, "", "percentage", "<init>", "(Lk8/dv$c;Ljava/lang/Float;)V", "initialDirectionX", "(Lk8/dv$c;)F", "initialDirectionY", "Landroid/view/ViewGroup;", "sceneRoot", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/transition/TransitionValues;", "startValues", "endValues", "Landroid/animation/Animator;", "onAppear", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/transition/TransitionValues;Landroid/transition/TransitionValues;)Landroid/animation/Animator;", "onDisappear", "Lk8/dv$c;", "Ljava/lang/Float;", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TranslateAnimation extends Visibility {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float percentage;

    @NotNull
    private final dv.c position;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/tooltip/TranslateAnimation$Companion;", "", "()V", "DEFAULT_TRANSLATION", "", "defaultTranslation", "", "Landroid/view/View;", "getDefaultTranslation", "(Landroid/view/View;)F", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getDefaultTranslation(View view) {
            return BaseDivViewExtensionsKt.dpToPxF(10, view.getResources().getDisplayMetrics());
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dv.c.values().length];
            try {
                iArr[dv.c.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dv.c.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dv.c.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dv.c.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dv.c.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[dv.c.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[dv.c.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[dv.c.TOP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[dv.c.BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TranslateAnimation(dv.c cVar, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i10 & 2) != 0 ? null : f10);
    }

    private final float initialDirectionX(dv.c position) {
        switch (WhenMappings.$EnumSwitchMapping$0[position.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 1.0f;
            case 4:
            case 5:
            case 6:
                return -1.0f;
            case 7:
                return 0.5f;
            case 8:
            case 9:
                return 0.0f;
            default:
                throw new m();
        }
    }

    private final float initialDirectionY(dv.c position) {
        switch (WhenMappings.$EnumSwitchMapping$0[position.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return 1.0f;
            case 2:
            case 5:
                return 0.0f;
            case 3:
            case 6:
            case 9:
                return -1.0f;
            case 7:
                return 0.5f;
            default:
                throw new m();
        }
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        float fInitialDirectionX = initialDirectionX(this.position);
        float fInitialDirectionY = initialDirectionY(this.position);
        view.setTranslationX(fInitialDirectionX * (this.percentage != null ? view.getWidth() * this.percentage.floatValue() : INSTANCE.getDefaultTranslation(view)));
        view.setTranslationY(fInitialDirectionY * (this.percentage != null ? view.getHeight() * this.percentage.floatValue() : INSTANCE.getDefaultTranslation(view)));
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f, initialDirectionX(this.position) * (this.percentage != null ? view.getWidth() * this.percentage.floatValue() : INSTANCE.getDefaultTranslation(view))), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, initialDirectionY(this.position) * (this.percentage != null ? view.getHeight() * this.percentage.floatValue() : INSTANCE.getDefaultTranslation(view))));
    }

    public TranslateAnimation(@NotNull dv.c cVar, @Nullable Float f10) {
        this.position = cVar;
        this.percentage = f10;
    }
}
