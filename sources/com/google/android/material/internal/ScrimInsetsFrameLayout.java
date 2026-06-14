package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable f26830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Rect f26831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f26832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26836h;

    public ScrimInsetsFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    protected void a(WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f26831c == null || this.f26830b == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f26833e) {
            this.f26832d.set(0, 0, width, this.f26831c.top);
            this.f26830b.setBounds(this.f26832d);
            this.f26830b.draw(canvas);
        }
        if (this.f26834f) {
            this.f26832d.set(0, height - this.f26831c.bottom, width, height);
            this.f26830b.setBounds(this.f26832d);
            this.f26830b.draw(canvas);
        }
        if (this.f26835g) {
            Rect rect = this.f26832d;
            Rect rect2 = this.f26831c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f26830b.setBounds(this.f26832d);
            this.f26830b.draw(canvas);
        }
        if (this.f26836h) {
            Rect rect3 = this.f26832d;
            Rect rect4 = this.f26831c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f26830b.setBounds(this.f26832d);
            this.f26830b.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f26830b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f26830b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f26834f = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f26835g = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f26836h = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f26833e = z10;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f26830b = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26832d = new Rect();
        this.f26833e = true;
        this.f26834f = true;
        this.f26835g = true;
        this.f26836h = true;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.ScrimInsetsFrameLayout, i10, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f26830b = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                if (scrimInsetsFrameLayout.f26831c == null) {
                    scrimInsetsFrameLayout.f26831c = new Rect();
                }
                ScrimInsetsFrameLayout.this.f26831c.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                ScrimInsetsFrameLayout.this.a(windowInsetsCompat);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!windowInsetsCompat.hasSystemWindowInsets() || ScrimInsetsFrameLayout.this.f26830b == null);
                ScrimInsetsFrameLayout.this.postInvalidateOnAnimation();
                return windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }
}
