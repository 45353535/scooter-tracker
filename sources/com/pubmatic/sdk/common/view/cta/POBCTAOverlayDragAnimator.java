package com.pubmatic.sdk.common.view.cta;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0013J\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0015J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0016J\u0017\u0010\r\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u0018J'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayDragAnimator;", "Landroid/view/View$OnTouchListener;", "", "bottomDismissThreshold", "Lkotlin/Function0;", "", "onViewDraggedBeyondParent", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "touchY", "b", "(Landroid/view/View;F)V", "currentTouchY", "a", "currentTranslationY", "deltaY", "(FF)F", "stretchDistance", "(F)F", "(Landroid/view/View;)V", "", "(Landroid/view/View;)Z", "", "duration", "bouncer", "(Landroid/view/View;JF)V", "Landroid/view/MotionEvent;", "event", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "I", "Lkotlin/jvm/functions/Function0;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "F", "lastTouchY", "Landroid/view/VelocityTracker;", "d", "Landroid/view/VelocityTracker;", "velocityTracker", y.f66058y, "common_release"}, k = 1, mv = {1, 7, 1})
public final class POBCTAOverlayDragAnimator implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int bottomDismissThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Function0 onViewDraggedBeyondParent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float lastTouchY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private VelocityTracker velocityTracker;

    public POBCTAOverlayDragAnimator(int i10, @Nullable Function0<Unit> function0) {
        this.bottomDismissThreshold = i10;
        this.onViewDraggedBeyondParent = function0;
    }

    private final void a(View view, float currentTouchY) {
        view.setTranslationY(b(view.getTranslationY(), currentTouchY - this.lastTouchY));
        this.lastTouchY = currentTouchY;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        int action = event.getAction();
        if (action == 0) {
            b(view, event.getRawY());
        } else if (action == 1) {
            view.performClick();
            a(view);
        } else if (action != 2) {
            if (action != 3) {
                return false;
            }
            view.performClick();
            a(view);
        } else {
            a(view, event.getRawY());
        }
        return true;
    }

    private final void b(View view, float touchY) {
        this.lastTouchY = touchY;
        view.animate().cancel();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = VelocityTracker.obtain();
    }

    public /* synthetic */ POBCTAOverlayDragAnimator(int i10, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : function0);
    }

    private final float a(float currentTranslationY, float deltaY) {
        return g.d(currentTranslationY + (deltaY * a(-currentTranslationY)), -300.0f);
    }

    private final float b(float currentTranslationY, float deltaY) {
        float f10 = currentTranslationY + deltaY;
        return f10 >= 0.0f ? f10 : a(currentTranslationY, deltaY);
    }

    private final float a(float stretchDistance) {
        return g.d(1.0f - ((stretchDistance / 10.0f) * 0.1f), 0.05f);
    }

    private final boolean b(View view) {
        float height = view.getHeight() + this.bottomDismissThreshold;
        if (view.getTranslationY() >= height) {
            return true;
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        boolean z10 = (velocityTracker2 != null ? velocityTracker2.getYVelocity() : 0.0f) > 1000.0f && view.getTranslationY() > height / ((float) 2);
        VelocityTracker velocityTracker3 = this.velocityTracker;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
        }
        this.velocityTracker = null;
        return z10;
    }

    private final void a(final View view) {
        if (view.getTranslationY() < 0.0f) {
            a(view, 250L, 2.0f);
        } else if (b(view)) {
            view.post(new Runnable() { // from class: com.pubmatic.sdk.common.view.cta.a
                @Override // java.lang.Runnable
                public final void run() {
                    POBCTAOverlayDragAnimator.a(this.f62616b, view);
                }
            });
        } else {
            a(view, 100L, 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBCTAOverlayDragAnimator this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Function0 function0 = this$0.onViewDraggedBeyondParent;
        if (function0 != null) {
            function0.invoke();
        }
        this$0.a(view, 100L, 1.0f);
    }

    private final void a(View view, long duration, float bouncer) {
        view.animate().translationY(0.0f).setDuration(duration).setInterpolator(new OvershootInterpolator(bouncer)).start();
    }
}
