package com.startapp.sdk.ads.list3d;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.sdk.internal.qb;
import com.startapp.sdk.internal.u6;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"ViewConstructor"})
public class List3DView extends AdapterView<Adapter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Adapter f63804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f63805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f63806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f63807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f63808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f63809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f63810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f63811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f63812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f63813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private VelocityTracker f63814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected u6 f63815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f63816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedList f63817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f63818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Rect f63819p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Camera f63820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Matrix f63821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Paint f63822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f63823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f63824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f63825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f63826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f63827x;

    public List3DView(List3DActivity list3DActivity) {
        super(list3DActivity, null);
        this.f63805b = 0;
        this.f63817n = new LinkedList();
        this.f63823t = Integer.MIN_VALUE;
        this.f63824u = false;
        this.f63825v = false;
        this.f63826w = false;
        this.f63827x = false;
    }

    private void a(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (this.f63820q == null) {
            this.f63820q = new Camera();
        }
        this.f63820q.save();
        this.f63820q.translate(0.0f, 0.0f, i13);
        this.f63820q.rotateX(f11);
        float f12 = -i13;
        this.f63820q.translate(0.0f, 0.0f, f12);
        if (this.f63821r == null) {
            this.f63821r = new Matrix();
        }
        this.f63820q.getMatrix(this.f63821r);
        this.f63820q.restore();
        this.f63821r.preTranslate(-i12, f12);
        this.f63821r.postScale(f10, f10);
        this.f63821r.postTranslate(i11 + i12, i10 + i13);
        if (this.f63822s == null) {
            Paint paint = new Paint();
            this.f63822s = paint;
            paint.setAntiAlias(true);
            this.f63822s.setFilterBitmap(true);
        }
        Paint paint2 = this.f63822s;
        double dCos = Math.cos((((double) f11) * 3.141592653589793d) / 180.0d);
        int i14 = ((int) (dCos * 200.0d)) + 55;
        int iPow = (int) (Math.pow(dCos, 200.0d) * 70.0d);
        if (i14 > 255) {
            i14 = 255;
        }
        if (iPow > 255) {
            iPow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i14, i14, i14), Color.rgb(iPow, iPow, iPow)));
        canvas.drawBitmap(bitmap, this.f63821r, this.f63822s);
    }

    protected final void b(int i10) {
        int height;
        int i11 = this.f63808e + i10;
        this.f63809f = i11;
        int height2 = (-(i11 * 270)) / getHeight();
        this.f63811h = height2;
        int i12 = height2 % 90;
        if (i12 < 45) {
            height = (getHeight() * (-(height2 - i12))) / 270;
        } else {
            height = (getHeight() * (-((height2 + 90) - i12))) / 270;
        }
        if (this.f63823t == Integer.MIN_VALUE && this.f63813j == this.f63804a.getCount() - 1) {
            if (getChildAt(getChildCount() - 1).getBottom() + ((int) ((r4.getMeasuredHeight() * 0.35000002f) / 2.0f)) < getHeight()) {
                this.f63823t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i13 = this.f63823t;
            if (height < i13) {
                height = i13;
            }
        }
        u6 u6Var = this.f63815l;
        float f10 = height;
        u6Var.f65335c = f10;
        u6Var.f65336d = f10;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j10) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j10);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f10 = ((top + height) - height2) / height2;
        float fCos = (float) (1.0d - ((1.0d - Math.cos(f10)) * 0.15000000596046448d));
        float f11 = (this.f63811h - (f10 * 20.0f)) % 90.0f;
        if (f11 < 0.0f) {
            f11 += 90.0f;
        }
        if (f11 < 45.0f) {
            a(canvas, drawingCache, top, left, width, height, fCos, f11 - 90.0f);
            a(canvas, drawingCache, top, left, width, height, fCos, f11);
            return false;
        }
        float f12 = f11;
        a(canvas, drawingCache, top, left, width, height, fCos, f12);
        a(canvas, drawingCache, top, left, width, height, fCos, f12 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f63804a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f63816m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f63824u || this.f63804a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.f63826w) {
                this.f63809f = getHeight() / 3;
            }
            this.f63813j = -1;
            int measuredHeight = this.f63809f;
            while (measuredHeight < getHeight() && this.f63813j < this.f63804a.getCount() - 1) {
                int i15 = this.f63813j + 1;
                this.f63813j = i15;
                View view = this.f63804a.getView(i15, this.f63817n.size() != 0 ? (View) this.f63817n.removeFirst() : null, this);
                a(view, 0);
                measuredHeight += (((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view.getMeasuredHeight();
            }
        } else {
            int iA = (this.f63809f + this.f63810g) - a(getChildAt(0));
            int childCount = getChildCount();
            if (this.f63813j != this.f63804a.getCount() - 1 && childCount > 1) {
                View childAt = getChildAt(0);
                while (childAt != null && childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) + iA < 0) {
                    removeViewInLayout(childAt);
                    childCount--;
                    this.f63817n.addLast(childAt);
                    this.f63812i++;
                    this.f63810g = (((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + childAt.getMeasuredHeight() + this.f63810g;
                    childAt = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.f63812i != 0 && childCount > 1) {
                View childAt2 = getChildAt(childCount - 1);
                while (childAt2 != null && a(childAt2) + iA > getHeight()) {
                    removeViewInLayout(childAt2);
                    int i16 = childCount - 1;
                    this.f63817n.addLast(childAt2);
                    this.f63813j--;
                    childAt2 = i16 > 1 ? getChildAt(childCount - 2) : null;
                    childCount = i16;
                }
            }
            int bottom = getChildAt(getChildCount() - 1).getBottom();
            int measuredHeight2 = (int) ((r2.getMeasuredHeight() * 0.35000002f) / 2.0f);
            while (true) {
                bottom += measuredHeight2;
                if (bottom + iA >= getHeight() || this.f63813j >= this.f63804a.getCount() - 1) {
                    break;
                }
                int i17 = this.f63813j + 1;
                this.f63813j = i17;
                View view2 = this.f63804a.getView(i17, this.f63817n.size() != 0 ? (View) this.f63817n.removeFirst() : null, this);
                a(view2, 0);
                measuredHeight2 = (((int) ((view2.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view2.getMeasuredHeight();
            }
            int iA2 = a(getChildAt(0));
            while (iA2 + iA > 0 && (i14 = this.f63812i) > 0) {
                int i18 = i14 - 1;
                this.f63812i = i18;
                View view3 = this.f63804a.getView(i18, this.f63817n.size() != 0 ? (View) this.f63817n.removeFirst() : null, this);
                a(view3, 1);
                int measuredHeight3 = (((int) ((view3.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view3.getMeasuredHeight();
                iA2 -= measuredHeight3;
                this.f63810g -= measuredHeight3;
            }
        }
        int i19 = this.f63809f + this.f63810g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i20 = 0; i20 < getChildCount(); i20++) {
            View childAt3 = getChildAt(i20);
            int iSin = (int) (Math.sin(((double) height) * 6.283185307179586d * ((double) i19)) * ((double) width));
            int measuredWidth = childAt3.getMeasuredWidth();
            int measuredHeight4 = childAt3.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + iSin;
            int measuredHeight5 = (int) ((childAt3.getMeasuredHeight() * 0.35000002f) / 2.0f);
            int i21 = i19 + measuredHeight5;
            childAt3.layout(width2, i21, measuredWidth + width2, i21 + measuredHeight4);
            i19 += (measuredHeight5 * 2) + measuredHeight4;
        }
        if (this.f63826w && !this.f63827x) {
            this.f63827x = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new qb(this), 5L);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (this.f63825v) {
            setAlpha(0.0f);
        }
        this.f63804a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(u6 u6Var) {
        u6 u6Var2 = this.f63815l;
        if (u6Var2 != null) {
            float f10 = u6Var2.f65333a;
            float f11 = u6Var2.f65334b;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            u6Var.f65334b = f11;
            u6Var.f65333a = f10;
            u6Var.f65337e = jCurrentAnimationTimeMillis;
        }
        this.f63815l = u6Var;
    }

    public void setFade(boolean z10) {
        this.f63825v = z10;
    }

    public void setHint(boolean z10) {
        this.f63826w = z10;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i10) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f63824u = true;
    }

    private void a(float f10) {
        VelocityTracker velocityTracker = this.f63814k;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.f63814k = null;
        removeCallbacks(this.f63818o);
        if (this.f63816m == null) {
            this.f63816m = new c(this);
        }
        u6 u6Var = this.f63815l;
        if (u6Var != null) {
            float f11 = this.f63809f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            u6Var.f65334b = f10;
            u6Var.f65333a = f11;
            u6Var.f65337e = jCurrentAnimationTimeMillis;
            post(this.f63816m);
        }
        this.f63805b = 0;
    }

    protected final int a(int i10, int i11) {
        if (this.f63819p == null) {
            this.f63819p = new Rect();
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).getHitRect(this.f63819p);
            if (this.f63819p.contains(i10, i11)) {
                return i12;
            }
        }
        return -1;
    }

    protected final void a(int i10) {
        View childAt = getChildAt(i10);
        int i11 = this.f63812i + i10;
        long itemId = this.f63804a.getItemId(i11);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i11, itemId);
        }
    }

    private void a(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i11 = i10 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i11, layoutParams, true);
        view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
    }

    protected static int a(View view) {
        return view.getTop() - ((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f));
    }
}
