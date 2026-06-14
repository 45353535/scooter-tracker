package com.startapp.sdk.ads.banner.bannerstandard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4240b4;
import com.startapp.sdk.internal.g3;
import com.startapp.sdk.internal.l2;

/* JADX INFO: loaded from: classes11.dex */
public class CloseableLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g3 f63702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BitmapDrawable f63703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ClosePosition f63704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f63705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f63706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f63707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f63708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f63709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f63710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f63711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f63712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f63713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f63714n;

    public CloseableLayout(@NonNull Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f63708h) {
            this.f63708h = false;
            this.f63709i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f63704d;
            Rect rect = this.f63709i;
            Rect rect2 = this.f63710j;
            int i10 = this.f63705e;
            Gravity.apply(closePosition.a(), i10, i10, rect, rect2);
            this.f63712l.set(this.f63710j);
            Rect rect3 = this.f63712l;
            int i11 = this.f63707g;
            rect3.inset(i11, i11);
            ClosePosition closePosition2 = this.f63704d;
            Rect rect4 = this.f63712l;
            Rect rect5 = this.f63711k;
            int i12 = this.f63706f;
            Gravity.apply(closePosition2.a(), i12, i12, rect4, rect5);
            this.f63703c.setBounds(this.f63711k);
        }
        if (this.f63703c.isVisible()) {
            this.f63703c.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        Rect rect = this.f63710j;
        return x10 >= rect.left && y10 >= rect.top && x10 < rect.right && y10 < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f63708h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i10 = this.f63701a;
        Rect rect = this.f63710j;
        if (x10 < rect.left - i10 || y10 < rect.top - i10 || x10 >= rect.right + i10 || y10 >= rect.bottom + i10 || !(this.f63713m || this.f63703c.isVisible())) {
            a(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            a(true);
        } else if (action != 1) {
            if (action == 3) {
                a(false);
            }
        } else if (this.f63703c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.f63714n == null) {
                this.f63714n = new f(this);
            }
            postDelayed(this.f63714n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            g3 g3Var = this.f63702b;
            if (g3Var != null) {
                g3Var.a();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z10) {
        this.f63713m = z10;
    }

    @VisibleForTesting
    public void setCloseBoundChanged(boolean z10) {
        this.f63708h = z10;
    }

    @VisibleForTesting
    public void setCloseBounds(Rect rect) {
        this.f63710j.set(rect);
    }

    public void setClosePosition(@NonNull ClosePosition closePosition) {
        this.f63704d = closePosition;
        this.f63708h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z10) {
        if (this.f63703c.setVisible(z10, false)) {
            invalidate(this.f63710j);
        }
    }

    public void setOnCloseListener(@Nullable g3 g3Var) {
        this.f63702b = g3Var;
    }

    public CloseableLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ClosePosition closePosition, Rect rect, Rect rect2) {
        int i10 = this.f63705e;
        Gravity.apply(closePosition.a(), i10, i10, rect, rect2);
    }

    public CloseableLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f63709i = new Rect();
        this.f63710j = new Rect();
        this.f63711k = new Rect();
        this.f63712l = new Rect();
        BitmapDrawable bitmapDrawableA = l2.a(context.getResources());
        this.f63703c = bitmapDrawableA;
        this.f63704d = ClosePosition.TOP_RIGHT;
        bitmapDrawableA.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawableA.setCallback(this);
        this.f63701a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f63705e = Math.round(TypedValue.applyDimension(1, 50, context.getResources().getDisplayMetrics()));
        this.f63706f = Math.round(TypedValue.applyDimension(1, 30, context.getResources().getDisplayMetrics()));
        this.f63707g = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        setWillNotDraw(false);
        this.f63713m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        int[] state = this.f63703c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z10 == (state == iArr)) {
            return;
        }
        BitmapDrawable bitmapDrawable = this.f63703c;
        if (!z10) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        bitmapDrawable.setState(iArr);
        invalidate(this.f63710j);
    }

    public final boolean a() {
        return this.f63703c.isVisible();
    }

    @SuppressLint({"RtlHardcoded"})
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);

        private final int mGravity;

        ClosePosition(int i10) {
            this.mGravity = i10;
        }

        public static ClosePosition a(String str) {
            ClosePosition closePosition = TOP_RIGHT;
            if (!TextUtils.isEmpty(str)) {
                if (str.equals(C4240b4.e.f42563c)) {
                    return TOP_LEFT;
                }
                if (!str.equals(C4240b4.e.f42562b)) {
                    if (str.equals("center")) {
                        return CENTER;
                    }
                    if (str.equals(C4240b4.e.f42565e)) {
                        return BOTTOM_LEFT;
                    }
                    if (str.equals(C4240b4.e.f42564d)) {
                        return BOTTOM_RIGHT;
                    }
                    if (str.equals("top-center")) {
                        return TOP_CENTER;
                    }
                    if (str.equals("bottom-center")) {
                        return BOTTOM_CENTER;
                    }
                    throw new IllegalArgumentException(str);
                }
            }
            return closePosition;
        }

        public final int a() {
            return this.mGravity;
        }
    }
}
