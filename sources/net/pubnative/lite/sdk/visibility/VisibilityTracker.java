package net.pubnative.lite.sdk.visibility;

import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.utils.HybidConsumer;

/* JADX INFO: loaded from: classes3.dex */
public class VisibilityTracker {
    private static final String TAG = "VisibilityTracker";
    private static final int VISIBILITY_CHECK_DELAY = 100;
    private WeakReference<HybidConsumer<Double>> mPercentageConsumer;
    protected WeakReference<View> mDeviceView = null;
    protected WeakReference<Listener> mListener = null;
    protected final List<PubnativeVisibilityTrackerItem> mTrackedViews = new ArrayList();
    protected Handler mHandler = new Handler();
    protected boolean mIsVisibilityCheckScheduled = false;
    protected final VisibilityRunnable mVisibilityRunnable = new VisibilityRunnable();
    protected ViewTreeObserver.OnPreDrawListener mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: net.pubnative.lite.sdk.visibility.b
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            return VisibilityTracker.a(this.f96055b);
        }
    };

    public interface Listener {
        void onVisibilityCheck(List<View> list, List<View> list2);
    }

    protected static class PubnativeVisibilityTrackerItem {
        private final String TAG = PubnativeVisibilityTrackerItem.class.getSimpleName();
        public double mMinVisibilityPercent;
        public View mTrackingView;

        protected PubnativeVisibilityTrackerItem() {
        }

        public boolean equals(Object obj) {
            return obj instanceof View ? obj.equals(this.mTrackingView) : super.equals(obj);
        }
    }

    protected class VisibilityRunnable implements Runnable {
        private boolean mHasReportedVisibility = false;
        private final Rect mVisibleRect = new Rect();
        private final ArrayList<View> mInvisibleViews = new ArrayList<>();
        private final ArrayList<View> mVisibleViews = new ArrayList<>();

        VisibilityRunnable() {
        }

        protected boolean isVisible(PubnativeVisibilityTrackerItem pubnativeVisibilityTrackerItem) {
            View view = pubnativeVisibilityTrackerItem.mTrackingView;
            if (view != null && view.isShown() && view.getParent() != null && view.getLocalVisibleRect(this.mVisibleRect)) {
                double dHeight = ((double) (this.mVisibleRect.height() * this.mVisibleRect.width())) / ((double) (view.getHeight() * view.getWidth()));
                z = dHeight >= pubnativeVisibilityTrackerItem.mMinVisibilityPercent;
                if (z && VisibilityTracker.this.mPercentageConsumer.get() != null && !this.mHasReportedVisibility) {
                    ((HybidConsumer) VisibilityTracker.this.mPercentageConsumer.get()).accept(Double.valueOf(dHeight));
                    this.mHasReportedVisibility = true;
                }
            }
            return z;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisibilityTracker visibilityTracker = VisibilityTracker.this;
            visibilityTracker.mIsVisibilityCheckScheduled = false;
            for (PubnativeVisibilityTrackerItem pubnativeVisibilityTrackerItem : visibilityTracker.mTrackedViews) {
                if (isVisible(pubnativeVisibilityTrackerItem)) {
                    this.mVisibleViews.add(pubnativeVisibilityTrackerItem.mTrackingView);
                } else {
                    this.mInvisibleViews.add(pubnativeVisibilityTrackerItem.mTrackingView);
                }
            }
            WeakReference<Listener> weakReference = VisibilityTracker.this.mListener;
            if (weakReference != null && weakReference.get() != null) {
                VisibilityTracker.this.mListener.get().onVisibilityCheck(this.mVisibleViews, this.mInvisibleViews);
            }
            this.mInvisibleViews.clear();
            this.mVisibleViews.clear();
        }
    }

    public static /* synthetic */ boolean a(VisibilityTracker visibilityTracker) {
        WeakReference<Listener> weakReference = visibilityTracker.mListener;
        if (weakReference == null || weakReference.get() == null) {
            visibilityTracker.clear();
            return true;
        }
        visibilityTracker.scheduleVisibilityCheck();
        return true;
    }

    public void addView(View view, double d10, HybidConsumer<Double> hybidConsumer) {
        if (this.mDeviceView == null) {
            this.mDeviceView = new WeakReference<>(view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(this.mOnPreDrawListener);
            } else {
                Log.d(TAG, "Unable to start tracking, Window ViewTreeObserver is not alive");
            }
        }
        this.mPercentageConsumer = new WeakReference<>(hybidConsumer);
        if (containsTrackedView(view)) {
            return;
        }
        PubnativeVisibilityTrackerItem pubnativeVisibilityTrackerItem = new PubnativeVisibilityTrackerItem();
        pubnativeVisibilityTrackerItem.mTrackingView = view;
        pubnativeVisibilityTrackerItem.mMinVisibilityPercent = d10;
        this.mTrackedViews.add(pubnativeVisibilityTrackerItem);
        scheduleVisibilityCheck();
    }

    public void clear() {
        View view;
        this.mHandler.removeMessages(0);
        this.mPercentageConsumer.clear();
        this.mTrackedViews.clear();
        this.mIsVisibilityCheckScheduled = false;
        WeakReference<View> weakReference = this.mDeviceView;
        if (weakReference != null && (view = weakReference.get()) != null && this.mOnPreDrawListener != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.mOnPreDrawListener);
            }
            this.mOnPreDrawListener = null;
        }
        this.mListener = null;
    }

    protected boolean containsTrackedView(View view) {
        return indexOfTrackedView(view) >= 0;
    }

    protected int indexOfTrackedView(View view) {
        for (int i10 = 0; i10 < this.mTrackedViews.size(); i10++) {
            if (this.mTrackedViews.get(i10).equals(view)) {
                return i10;
            }
        }
        return -1;
    }

    public void removeView(View view) {
        this.mTrackedViews.remove(view);
    }

    protected void scheduleVisibilityCheck() {
        if (this.mIsVisibilityCheckScheduled) {
            return;
        }
        this.mIsVisibilityCheckScheduled = true;
        this.mHandler.postDelayed(this.mVisibilityRunnable, 100L);
    }

    public void setListener(Listener listener) {
        this.mListener = new WeakReference<>(listener);
    }
}
