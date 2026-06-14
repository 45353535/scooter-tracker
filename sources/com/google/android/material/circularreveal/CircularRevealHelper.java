package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Delegate f26002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f26003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f26004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f26005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f26006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CircularRevealWidget.RevealInfo f26007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f26008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26009h;

    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(Delegate delegate) {
        this.f26002a = delegate;
        View view = (View) delegate;
        this.f26003b = view;
        view.setWillNotDraw(false);
        this.f26004c = new Path();
        this.f26005d = new Paint(7);
        Paint paint = new Paint(1);
        this.f26006e = paint;
        paint.setColor(0);
    }

    private void a(Canvas canvas) {
        if (e()) {
            Rect bounds = this.f26008g.getBounds();
            float fWidth = this.f26007f.centerX - (bounds.width() / 2.0f);
            float fHeight = this.f26007f.centerY - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f26008g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float b(CircularRevealWidget.RevealInfo revealInfo) {
        return MathUtils.distanceToFurthestCorner(revealInfo.centerX, revealInfo.centerY, 0.0f, 0.0f, this.f26003b.getWidth(), this.f26003b.getHeight());
    }

    private void c() {
        this.f26003b.invalidate();
    }

    private boolean d() {
        CircularRevealWidget.RevealInfo revealInfo = this.f26007f;
        return !(revealInfo == null || revealInfo.isInvalid());
    }

    private boolean e() {
        return (this.f26009h || this.f26008g == null || this.f26007f == null) ? false : true;
    }

    private boolean f() {
        return (this.f26009h || Color.alpha(this.f26006e.getColor()) == 0) ? false : true;
    }

    public void buildCircularRevealCache() {
    }

    public void destroyCircularRevealCache() {
    }

    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (d()) {
            this.f26002a.actualDraw(canvas);
            if (f()) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, this.f26003b.getWidth(), this.f26003b.getHeight(), this.f26006e);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.f26002a.actualDraw(canvas2);
            if (f()) {
                canvas2.drawRect(0.0f, 0.0f, this.f26003b.getWidth(), this.f26003b.getHeight(), this.f26006e);
            }
        }
        a(canvas2);
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f26008g;
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.f26006e.getColor();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        CircularRevealWidget.RevealInfo revealInfo = this.f26007f;
        if (revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(revealInfo);
        if (revealInfo2.isInvalid()) {
            revealInfo2.radius = b(revealInfo2);
        }
        return revealInfo2;
    }

    public boolean isOpaque() {
        return this.f26002a.actualIsOpaque() && !d();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f26008g = drawable;
        this.f26003b.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int i10) {
        this.f26006e.setColor(i10);
        this.f26003b.invalidate();
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        if (revealInfo == null) {
            this.f26007f = null;
        } else {
            CircularRevealWidget.RevealInfo revealInfo2 = this.f26007f;
            if (revealInfo2 == null) {
                this.f26007f = new CircularRevealWidget.RevealInfo(revealInfo);
            } else {
                revealInfo2.set(revealInfo);
            }
            if (MathUtils.geq(revealInfo.radius, b(revealInfo), 1.0E-4f)) {
                this.f26007f.radius = Float.MAX_VALUE;
            }
        }
        c();
    }
}
