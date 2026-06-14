package com.pubmatic.sdk.common.view.cta;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayAnimationHandler;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Landroid/view/View;)V", "", "bottomDismissThreshold", "Lkotlin/Function0;", "", "onViewDraggedBeyondParent", "applyDragAnimator", "(ILkotlin/jvm/functions/Function0;)V", "onShow", "startEntranceAnimation", "(Lkotlin/jvm/functions/Function0;)V", "a", "Landroid/view/View;", "common_release"}, k = 1, mv = {1, 7, 1})
public final class POBCTAOverlayAnimationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    public POBCTAOverlayAnimationHandler(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void applyDragAnimator$default(POBCTAOverlayAnimationHandler pOBCTAOverlayAnimationHandler, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        pOBCTAOverlayAnimationHandler.applyDragAnimator(i10, function0);
    }

    public final void applyDragAnimator(int bottomDismissThreshold, @Nullable Function0<Unit> onViewDraggedBeyondParent) {
        this.view.setOnTouchListener(new POBCTAOverlayDragAnimator(bottomDismissThreshold, onViewDraggedBeyondParent));
    }

    public final void startEntranceAnimation(@NotNull final Function0<Unit> onShow) {
        Intrinsics.checkNotNullParameter(onShow, "onShow");
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        translateAnimation.setDuration(600L);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.pubmatic.sdk.common.view.cta.POBCTAOverlayAnimationHandler$startEntranceAnimation$animation$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f62603a.view.clearAnimation();
                onShow.invoke();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@NotNull Animation animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        this.view.startAnimation(translateAnimation);
    }
}
