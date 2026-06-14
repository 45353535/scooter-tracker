package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f81424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f81425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81426d;

    public interface b {
    }

    private final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f81427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f81428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f81429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f81430e;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f81427b = f10;
            this.f81428c = f11;
            this.f81429d = z10;
            if (this.f81430e) {
                return;
            }
            this.f81430e = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f81430e = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81426d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f81521a, 0, 0);
            try {
                this.f81426d = typedArrayObtainStyledAttributes.getInt(R$styleable.f81523b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f81424b = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f81426d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f81425c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f81425c / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f81424b.a(this.f81425c, f14, false);
            return;
        }
        int i12 = this.f81426d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f81425c;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f81425c;
                    } else {
                        f11 = this.f81425c;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f81425c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f81425c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f81425c;
            measuredWidth = (int) (f13 * f10);
        }
        this.f81424b.a(this.f81425c, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f81425c != f10) {
            this.f81425c = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f81426d != i10) {
            this.f81426d = i10;
            requestLayout();
        }
    }
}
