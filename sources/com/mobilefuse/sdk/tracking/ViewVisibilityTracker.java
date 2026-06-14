package com.mobilefuse.sdk.tracking;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.internal.IntervalTaskRunner;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002%&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u001aJ$\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0!J\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/mobilefuse/sdk/tracking/ViewVisibilityTracker;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "VISIBILITY_CHECK_DELAY_MS", "", "getContext", "()Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/tracking/ViewVisibilityTracker$OnVisibilityChangeListener;", "timedListeners", "", "Lcom/mobilefuse/sdk/tracking/ViewVisibilityTracker$OnTimedVisibilityCompleteListener;", "timedVisibilityChecker", "Lcom/mobilefuse/sdk/internal/IntervalTaskRunner;", "getView", "()Landroid/view/View;", "visiblePercent", "getVisiblePercent", "()I", "setVisiblePercent", "(I)V", "checkTimedVisibility", "", "checkViewability", "dispose", "registerTimedVisibilityListener", "requiredMilliSeconds", "requiredPercent", "onComplete", "Lkotlin/Function0;", "setOnVisibilityChangeListener", "startVisibilityTracking", "stopVisibilityTracking", "OnTimedVisibilityCompleteListener", "OnVisibilityChangeListener", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class ViewVisibilityTracker {
    private final int VISIBILITY_CHECK_DELAY_MS;

    @NotNull
    private final Context context;
    private OnVisibilityChangeListener listener;
    private final List<OnTimedVisibilityCompleteListener> timedListeners;
    private final IntervalTaskRunner timedVisibilityChecker;

    @NotNull
    private final View view;
    private int visiblePercent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/tracking/ViewVisibilityTracker$OnTimedVisibilityCompleteListener;", "", "requiredMilliSeconds", "", "getRequiredMilliSeconds", "()I", "requiredViewPercent", "getRequiredViewPercent", "timeAtRequiredPercent", "getTimeAtRequiredPercent", "setTimeAtRequiredPercent", "(I)V", "onVisibilityComplete", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface OnTimedVisibilityCompleteListener {
        /* JADX INFO: renamed from: getRequiredMilliSeconds */
        int get$requiredMilliSeconds();

        /* JADX INFO: renamed from: getRequiredViewPercent */
        int get$requiredPercent();

        int getTimeAtRequiredPercent();

        void onVisibilityComplete();

        void setTimeAtRequiredPercent(int i10);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/tracking/ViewVisibilityTracker$OnVisibilityChangeListener;", "", "onVisibilityChange", "", "percentVisible", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public interface OnVisibilityChangeListener {
        void onVisibilityChange(int percentVisible);
    }

    public ViewVisibilityTracker(@NotNull Context context, @NotNull View view) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        this.context = context;
        this.view = view;
        this.VISIBILITY_CHECK_DELAY_MS = 200;
        this.timedListeners = new ArrayList();
        IntervalTaskRunner intervalTaskRunner = new IntervalTaskRunner(200, true, new IntervalTaskRunner.Listener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker$timedVisibilityChecker$1
            @Override // com.mobilefuse.sdk.internal.IntervalTaskRunner.Listener
            public final void onTaskRun() {
                this.this$0.checkTimedVisibility();
            }
        });
        this.timedVisibilityChecker = intervalTaskRunner;
        startVisibilityTracking();
        intervalTaskRunner.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkTimedVisibility() {
        try {
            checkViewability();
            HashSet hashSet = new HashSet();
            for (OnTimedVisibilityCompleteListener onTimedVisibilityCompleteListener : this.timedListeners) {
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                if (this.visiblePercent >= onTimedVisibilityCompleteListener.get$requiredPercent() && onTimedVisibilityCompleteListener.getTimeAtRequiredPercent() == 0) {
                    onTimedVisibilityCompleteListener.setTimeAtRequiredPercent(iCurrentTimeMillis);
                }
                if (this.visiblePercent < onTimedVisibilityCompleteListener.get$requiredPercent()) {
                    onTimedVisibilityCompleteListener.setTimeAtRequiredPercent(0);
                }
                if (onTimedVisibilityCompleteListener.getTimeAtRequiredPercent() < iCurrentTimeMillis - onTimedVisibilityCompleteListener.get$requiredMilliSeconds()) {
                    onTimedVisibilityCompleteListener.onVisibilityComplete();
                    hashSet.add(onTimedVisibilityCompleteListener);
                }
            }
            this.timedListeners.removeAll(hashSet);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkViewability() {
        Rect rect = new Rect();
        if (!this.view.getGlobalVisibleRect(rect)) {
            this.visiblePercent = 0;
            return;
        }
        double dHeight = rect.height() * rect.width();
        double height = this.view.getHeight() * this.view.getWidth();
        int i10 = height != 0.0d ? (int) ((dHeight / height) * ((double) 100)) : 0;
        if (i10 != this.visiblePercent) {
            this.visiblePercent = i10;
            OnVisibilityChangeListener onVisibilityChangeListener = this.listener;
            if (onVisibilityChangeListener != null) {
                onVisibilityChangeListener.onVisibilityChange(i10);
            }
        }
    }

    private final void startVisibilityTracking() {
        try {
            this.view.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker.startVisibilityTracking.1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    try {
                        ViewVisibilityTracker.this.checkViewability();
                    } catch (Throwable th2) {
                        StabilityHelper.logException(ViewVisibilityTracker.this, th2);
                    }
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void stopVisibilityTracking() {
        try {
            this.view.getViewTreeObserver().removeOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker.stopVisibilityTracking.1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    try {
                        ViewVisibilityTracker.this.checkViewability();
                    } catch (Throwable th2) {
                        StabilityHelper.logException(ViewVisibilityTracker.this, th2);
                    }
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void dispose() throws Throwable {
        stopVisibilityTracking();
        this.timedVisibilityChecker.reset();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final int getVisiblePercent() {
        return this.visiblePercent;
    }

    public final void registerTimedVisibilityListener(final int requiredMilliSeconds, final int requiredPercent, @NotNull final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.timedListeners.add(new OnTimedVisibilityCompleteListener() { // from class: com.mobilefuse.sdk.tracking.ViewVisibilityTracker$registerTimedVisibilityListener$timedListener$1
            private int timeAtRequiredPercent;

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            /* JADX INFO: renamed from: getRequiredMilliSeconds, reason: from getter */
            public int get$requiredMilliSeconds() {
                return requiredMilliSeconds;
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            /* JADX INFO: renamed from: getRequiredViewPercent, reason: from getter */
            public int get$requiredPercent() {
                return requiredPercent;
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public int getTimeAtRequiredPercent() {
                return this.timeAtRequiredPercent;
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public void onVisibilityComplete() {
                onComplete.invoke();
            }

            @Override // com.mobilefuse.sdk.tracking.ViewVisibilityTracker.OnTimedVisibilityCompleteListener
            public void setTimeAtRequiredPercent(int i10) {
                this.timeAtRequiredPercent = i10;
            }
        });
    }

    public final void setOnVisibilityChangeListener(@NotNull OnVisibilityChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setVisiblePercent(int i10) {
        this.visiblePercent = i10;
    }
}
