package io.bidmachine.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import io.bidmachine.media3.ui.h0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class b extends View implements h0 {
    private final float A;
    private int B;
    private long C;
    private int D;
    private Rect E;
    private ValueAnimator F;
    private float G;
    private boolean H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long[] O;
    private boolean[] P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f81608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f81609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f81610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f81611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f81612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f81613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f81614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f81615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f81616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Paint f81617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Drawable f81618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f81619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f81620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f81621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f81622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f81623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f81624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f81625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f81626t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f81627u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final StringBuilder f81628v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Formatter f81629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f81630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final CopyOnWriteArraySet f81631y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Point f81632z;

    public b(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f81608b = new Rect();
        this.f81609c = new Rect();
        this.f81610d = new Rect();
        this.f81611e = new Rect();
        Paint paint = new Paint();
        this.f81612f = paint;
        Paint paint2 = new Paint();
        this.f81613g = paint2;
        Paint paint3 = new Paint();
        this.f81614h = paint3;
        Paint paint4 = new Paint();
        this.f81615i = paint4;
        Paint paint5 = new Paint();
        this.f81616j = paint5;
        Paint paint6 = new Paint();
        this.f81617k = paint6;
        paint6.setAntiAlias(true);
        this.f81631y = new CopyOnWriteArraySet();
        this.f81632z = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A = f10;
        this.f81627u = d(f10, -50);
        int iD = d(f10, 4);
        int iD2 = d(f10, 26);
        int iD3 = d(f10, 4);
        int iD4 = d(f10, 12);
        int iD5 = d(f10, 0);
        int iD6 = d(f10, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.f81529e, i10, i11);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.f81551p);
                this.f81618l = drawable;
                if (drawable != null) {
                    n(drawable);
                    iD2 = Math.max(drawable.getMinimumHeight(), iD2);
                }
                this.f81619m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f81537i, iD);
                this.f81620n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f81555r, iD2);
                this.f81621o = typedArrayObtainStyledAttributes.getInt(R$styleable.f81535h, 0);
                this.f81622p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f81533g, iD3);
                this.f81623q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f81553q, iD4);
                this.f81624r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f81547n, iD5);
                this.f81625s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.f81549o, iD6);
                int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81543l, -1);
                int i13 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81545m, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81539j, -855638017);
                int i15 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81557s, 872415231);
                int i16 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81531f, -1291845888);
                int i17 = typedArrayObtainStyledAttributes.getInt(R$styleable.f81541k, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint4.setColor(i16);
                paint5.setColor(i17);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f81619m = iD;
            this.f81620n = iD2;
            this.f81621o = 0;
            this.f81622p = iD3;
            this.f81623q = iD4;
            this.f81624r = iD5;
            this.f81625s = iD6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f81618l = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f81628v = sb2;
        this.f81629w = new Formatter(sb2, Locale.getDefault());
        this.f81630x = new Runnable() { // from class: yb.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f118899b.t(false);
            }
        };
        Drawable drawable2 = this.f81618l;
        if (drawable2 != null) {
            this.f81626t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f81626t = (Math.max(this.f81624r, Math.max(this.f81623q, this.f81625s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yb.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                io.bidmachine.media3.ui.b.c(this.f118900b, valueAnimator2);
            }
        });
        this.K = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static /* synthetic */ void c(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        bVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.invalidate(bVar.f81608b);
    }

    private static int d(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private void e(Canvas canvas) {
        if (this.K <= 0) {
            return;
        }
        Rect rect = this.f81611e;
        int iP = o0.p(rect.right, rect.left, this.f81609c.right);
        int iCenterY = this.f81611e.centerY();
        if (this.f81618l == null) {
            canvas.drawCircle(iP, iCenterY, (int) ((((this.I || isFocused()) ? this.f81625s : isEnabled() ? this.f81623q : this.f81624r) * this.G) / 2.0f), this.f81617k);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.f81618l.getIntrinsicHeight() * this.G)) / 2;
        this.f81618l.setBounds(iP - intrinsicWidth, iCenterY - intrinsicHeight, iP + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f81618l.draw(canvas);
    }

    private void f(Canvas canvas) {
        int iHeight = this.f81609c.height();
        int iCenterY = this.f81609c.centerY() - (iHeight / 2);
        int i10 = iHeight + iCenterY;
        if (this.K <= 0) {
            Rect rect = this.f81609c;
            canvas.drawRect(rect.left, iCenterY, rect.right, i10, this.f81614h);
            return;
        }
        Rect rect2 = this.f81610d;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int iMax = Math.max(Math.max(this.f81609c.left, i12), this.f81611e.right);
        int i13 = this.f81609c.right;
        if (iMax < i13) {
            canvas.drawRect(iMax, iCenterY, i13, i10, this.f81614h);
        }
        int iMax2 = Math.max(i11, this.f81611e.right);
        if (i12 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i12, i10, this.f81613g);
        }
        if (this.f81611e.width() > 0) {
            Rect rect3 = this.f81611e;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i10, this.f81612f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) q9.a.e(this.O);
        boolean[] zArr = (boolean[]) q9.a.e(this.P);
        int i14 = this.f81622p / 2;
        for (int i15 = 0; i15 < this.N; i15++) {
            int iWidth = ((int) ((((long) this.f81609c.width()) * o0.q(jArr[i15], 0L, this.K)) / this.K)) - i14;
            Rect rect4 = this.f81609c;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f81622p, Math.max(0, iWidth)), iCenterY, r10 + this.f81622p, i10, zArr[i15] ? this.f81616j : this.f81615i);
        }
    }

    private long getPositionIncrement() {
        long j10 = this.C;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.K;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        return j11 / ((long) this.B);
    }

    private String getProgressText() {
        return o0.o0(this.f81628v, this.f81629w, this.L);
    }

    private long getScrubberPosition() {
        if (this.f81609c.width() <= 0 || this.K == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f81611e.width()) * this.K) / ((long) this.f81609c.width());
    }

    private boolean i(float f10, float f11) {
        return this.f81608b.contains((int) f10, (int) f11);
    }

    private void j(float f10) {
        Rect rect = this.f81611e;
        Rect rect2 = this.f81609c;
        rect.right = o0.p((int) f10, rect2.left, rect2.right);
    }

    private static int k(float f10, int i10) {
        return (int) (i10 / f10);
    }

    private Point l(MotionEvent motionEvent) {
        this.f81632z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f81632z;
    }

    private boolean m(long j10) {
        long j11 = this.K;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.I ? this.J : this.L;
        long jQ = o0.q(j12 + j10, 0L, j11);
        if (jQ == j12) {
            return false;
        }
        if (this.I) {
            w(jQ);
        } else {
            s(jQ);
        }
        u();
        return true;
    }

    private boolean n(Drawable drawable) {
        return o0.f98837a >= 23 && o(drawable, getLayoutDirection());
    }

    private static boolean o(Drawable drawable, int i10) {
        return o0.f98837a >= 23 && drawable.setLayoutDirection(i10);
    }

    private void p(int i10, int i11) {
        Rect rect = this.E;
        if (rect != null && rect.width() == i10 && this.E.height() == i11) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i10, i11);
        this.E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void s(long j10) {
        this.J = j10;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f81631y.iterator();
        while (it.hasNext()) {
            ((h0.a) it.next()).s(this, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z10) {
        removeCallbacks(this.f81630x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f81631y.iterator();
        while (it.hasNext()) {
            ((h0.a) it.next()).v(this, this.J, z10);
        }
    }

    private void u() {
        this.f81610d.set(this.f81609c);
        this.f81611e.set(this.f81609c);
        long j10 = this.I ? this.J : this.L;
        if (this.K > 0) {
            int iWidth = (int) ((((long) this.f81609c.width()) * this.M) / this.K);
            Rect rect = this.f81610d;
            Rect rect2 = this.f81609c;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f81609c.width()) * j10) / this.K);
            Rect rect3 = this.f81611e;
            Rect rect4 = this.f81609c;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f81610d;
            int i10 = this.f81609c.left;
            rect5.right = i10;
            this.f81611e.right = i10;
        }
        invalidate(this.f81608b);
    }

    private void v() {
        Drawable drawable = this.f81618l;
        if (drawable != null && drawable.isStateful() && this.f81618l.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void w(long j10) {
        if (this.J == j10) {
            return;
        }
        this.J = j10;
        Iterator it = this.f81631y.iterator();
        while (it.hasNext()) {
            ((h0.a) it.next()).p(this, j10);
        }
    }

    @Override // io.bidmachine.media3.ui.h0
    public void a(h0.a aVar) {
        q9.a.e(aVar);
        this.f81631y.add(aVar);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        v();
    }

    public void g(long j10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.F.setFloatValues(this.G, 0.0f);
        this.F.setDuration(j10);
        this.F.start();
    }

    @Override // io.bidmachine.media3.ui.h0
    public long getPreferredUpdateDelay() {
        int iK = k(this.A, this.f81609c.width());
        if (iK == 0) {
            return Long.MAX_VALUE;
        }
        long j10 = this.K;
        if (j10 == 0 || j10 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j10 / ((long) iK);
    }

    public void h(boolean z10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = z10;
        this.G = 0.0f;
        invalidate(this.f81608b);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f81618l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        f(canvas);
        e(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.I || z10) {
            return;
        }
        t(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f81630x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f81630x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.I
            if (r0 == 0) goto L30
            r5 = 0
            r4.t(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int iMax;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.H ? 0 : this.f81626t;
        if (this.f81621o == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - this.f81620n;
            int paddingBottom2 = i15 - getPaddingBottom();
            int i17 = this.f81619m;
            iMax = (paddingBottom2 - i17) - Math.max(i16 - (i17 / 2), 0);
        } else {
            paddingBottom = (i15 - this.f81620n) / 2;
            iMax = (i15 - this.f81619m) / 2;
        }
        this.f81608b.set(paddingLeft, paddingBottom, paddingRight, this.f81620n + paddingBottom);
        Rect rect = this.f81609c;
        Rect rect2 = this.f81608b;
        rect.set(rect2.left + i16, iMax, rect2.right - i16, this.f81619m + iMax);
        if (o0.f98837a >= 29) {
            p(i14, i15);
        }
        u();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f81620n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f81620n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        v();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f81618l;
        if (drawable == null || !o(drawable, i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.l(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.I
            if (r8 == 0) goto L76
            int r8 = r7.f81627u
            if (r0 >= r8) goto L3a
            int r8 = r7.D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.j(r8)
            goto L40
        L3a:
            r7.D = r2
            float r8 = (float) r2
            r7.j(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.w(r0)
            r7.u()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.I
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.t(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.i(r8, r0)
            if (r0 == 0) goto L76
            r7.j(r8)
            long r0 = r7.getScrubberPosition()
            r7.s(r0)
            r7.u()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (m(-getPositionIncrement())) {
                t(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (m(getPositionIncrement())) {
                t(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void q() {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.G = 1.0f;
        invalidate(this.f81608b);
    }

    public void r(long j10) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.F.setFloatValues(this.G, 1.0f);
        this.F.setDuration(j10);
        this.F.start();
    }

    @Override // io.bidmachine.media3.ui.h0
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i10) {
        q9.a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.N = i10;
        this.O = jArr;
        this.P = zArr;
        u();
    }

    public void setAdMarkerColor(@ColorInt int i10) {
        this.f81615i.setColor(i10);
        invalidate(this.f81608b);
    }

    public void setBufferedColor(@ColorInt int i10) {
        this.f81613g.setColor(i10);
        invalidate(this.f81608b);
    }

    @Override // io.bidmachine.media3.ui.h0
    public void setBufferedPosition(long j10) {
        if (this.M == j10) {
            return;
        }
        this.M = j10;
        u();
    }

    @Override // io.bidmachine.media3.ui.h0
    public void setDuration(long j10) {
        if (this.K == j10) {
            return;
        }
        this.K = j10;
        if (this.I && j10 == -9223372036854775807L) {
            t(true);
        }
        u();
    }

    @Override // android.view.View, io.bidmachine.media3.ui.h0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.I || z10) {
            return;
        }
        t(true);
    }

    public void setKeyCountIncrement(int i10) {
        q9.a.a(i10 > 0);
        this.B = i10;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        q9.a.a(j10 > 0);
        this.B = -1;
        this.C = j10;
    }

    public void setPlayedAdMarkerColor(@ColorInt int i10) {
        this.f81616j.setColor(i10);
        invalidate(this.f81608b);
    }

    public void setPlayedColor(@ColorInt int i10) {
        this.f81612f.setColor(i10);
        invalidate(this.f81608b);
    }

    @Override // io.bidmachine.media3.ui.h0
    public void setPosition(long j10) {
        if (this.L == j10) {
            return;
        }
        this.L = j10;
        setContentDescription(getProgressText());
        u();
    }

    public void setScrubberColor(@ColorInt int i10) {
        this.f81617k.setColor(i10);
        invalidate(this.f81608b);
    }

    public void setUnplayedColor(@ColorInt int i10) {
        this.f81614h.setColor(i10);
        invalidate(this.f81608b);
    }
}
