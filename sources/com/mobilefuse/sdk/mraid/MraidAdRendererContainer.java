package com.mobilefuse.sdk.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class MraidAdRendererContainer extends AdRendererContainer {
    private static final int MIN_MS_BETWEEN_CHECKPOSITION = 50;
    private boolean attachedToWindow;
    private int checkPositionTimeInterval;
    private Handler handler;
    private boolean isOnscreen;
    private boolean isVideoOnScreen;
    private boolean isVisible;

    @Nullable
    private OnLayoutListener onLayoutListener;
    private Date timeOfLastCheckPosition;
    private ViewableChangeListener viewableChangeListener;
    private boolean viewableCheckPaused;

    public interface OnLayoutListener {
        void onLayout(boolean z10, int i10, int i11, int i12, int i13);
    }

    public interface ViewableChangeListener {
        void onViewableChange(int i10, int i11, int i12, int i13, double d10, Rect rect) throws Throwable;
    }

    public MraidAdRendererContainer(@NonNull Context context) throws Throwable {
        super(context);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }

    public static /* synthetic */ void b(MraidAdRendererContainer mraidAdRendererContainer) {
        mraidAdRendererContainer.getClass();
        try {
            mraidAdRendererContainer.checkPosition();
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRendererContainer, th2);
        }
    }

    public static /* synthetic */ void c(MraidAdRendererContainer mraidAdRendererContainer) {
        mraidAdRendererContainer.getClass();
        try {
            mraidAdRendererContainer.checkPosition();
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRendererContainer, th2);
        }
    }

    public static /* synthetic */ void d(MraidAdRendererContainer mraidAdRendererContainer) {
        mraidAdRendererContainer.getClass();
        try {
            mraidAdRendererContainer.checkPosition();
        } catch (Throwable th2) {
            StabilityHelper.logException(mraidAdRendererContainer, th2);
        }
    }

    private boolean tooManyCheckPositionRequests() throws Throwable {
        return new Date().getTime() - this.timeOfLastCheckPosition.getTime() < 50;
    }

    public double checkPosition() throws Throwable {
        Rect rect;
        if (!this.attachedToWindow) {
            return 0.0d;
        }
        if (tooManyCheckPositionRequests()) {
            return -1.0d;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect2 = new Rect();
        boolean globalVisibleRect = getGlobalVisibleRect(rect2);
        boolean z10 = false;
        if (!globalVisibleRect) {
            rect2 = new Rect(0, 0, 0, 0);
        }
        int i10 = iArr[0];
        int width = getWidth() + i10;
        int i11 = iArr[1];
        int height = getHeight() + i11;
        double dHeight = rect2.height() * rect2.width();
        double height2 = getHeight() * getWidth();
        double d10 = height2 != 0.0d ? 100.0d * (dHeight / height2) : 0.0d;
        int[] screenSizeAsPixels = Utils.getScreenSizeAsPixels(getContext());
        if (width > 0 && i10 < screenSizeAsPixels[0] && height > 0 && i11 < screenSizeAsPixels[1]) {
            z10 = true;
        }
        this.isOnscreen = z10;
        if (this.viewableChangeListener != null) {
            if (globalVisibleRect) {
                rect = new Rect();
                getLocalVisibleRect(rect);
            } else {
                rect = null;
            }
            this.viewableChangeListener.onViewableChange(i10, i11, getWidth(), getHeight(), d10, rect);
        }
        this.timeOfLastCheckPosition = new Date();
        return d10;
    }

    @Nullable
    public OnLayoutListener getOnLayoutListener() {
        return this.onLayoutListener;
    }

    boolean isViewable() {
        return this.isOnscreen && this.isVisible;
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        try {
            getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.mraid.n
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    MraidAdRendererContainer.d(this.f53409b);
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.attachedToWindow = false;
        try {
            getViewTreeObserver().removeOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.mraid.p
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    MraidAdRendererContainer.b(this.f53411b);
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        try {
            OnLayoutListener onLayoutListener = this.onLayoutListener;
            if (onLayoutListener != null) {
                onLayoutListener.onLayout(z10, i10, i11, i12, i13);
            }
            this.handler.postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.mraid.o
                @Override // java.lang.Runnable
                public final void run() {
                    MraidAdRendererContainer.c(this.f53410b);
                }
            }, 50L);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void setOnLayoutListener(@Nullable OnLayoutListener onLayoutListener) {
        this.onLayoutListener = onLayoutListener;
    }

    public void setViewableChangeListener(ViewableChangeListener viewableChangeListener) {
        this.viewableChangeListener = viewableChangeListener;
    }

    public MraidAdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }

    public MraidAdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) throws Throwable {
        super(context, attributeSet, i10);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }

    @RequiresApi(api = 21)
    public MraidAdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) throws Throwable {
        super(context, attributeSet, i10, i11);
        this.isOnscreen = false;
        this.isVideoOnScreen = false;
        this.isVisible = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.viewableCheckPaused = false;
        this.checkPositionTimeInterval = 1000;
        this.timeOfLastCheckPosition = new Date();
    }
}
