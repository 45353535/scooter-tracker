package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes4.dex */
public class ViewFlow extends sg.bigo.ads.common.view.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Interpolator f102950s = new Interpolator() { // from class: sg.bigo.ads.common.view.ViewFlow.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private float A;
    private float B;
    private int C;
    private VelocityTracker D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private final Runnable J;
    private int K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f102951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f102952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f102953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f102954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected View f102955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected View f102956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f102957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f102958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f102959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f102960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f102961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f102962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f102963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f102964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f102965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f102966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p f102967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f102968r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Scroller f102969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f102970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f102971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f102972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f102973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f102974y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f102975z;

    static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f102979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f102980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewFlow f102981c;

        private a(ViewFlow viewFlow) {
            this.f102980b = 0;
            this.f102981c = viewFlow;
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i10) {
            this.f102981c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i11 = aVar.f102980b;
                    int i12 = i10;
                    if (i11 == i12) {
                        return;
                    }
                    aVar.f102980b = i12;
                    c cVar = aVar.f102979a;
                    if (cVar != null) {
                        cVar.a(i12);
                    }
                }
            });
        }

        /* synthetic */ a(ViewFlow viewFlow, byte b10) {
            this(viewFlow);
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i10, final int i11) {
            this.f102981c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f102979a;
                    if (cVar != null) {
                        cVar.a(i10, i11);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i10) {
            this.f102981c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f102979a;
                    if (cVar != null) {
                        cVar.a(view, i10);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i10, final float f10) {
            this.f102981c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f102979a;
                    if (cVar != null) {
                        cVar.a(view, i10, f10);
                    }
                }
            });
        }
    }

    public static class b extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f102995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f102996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f102997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f102998e;

        public b() {
            this((byte) 0);
        }

        private b(byte b10) {
            super(-1, -1);
            this.f102998e = 17;
        }
    }

    public interface c {
        void a(int i10);

        void a(int i10, int i11);

        void a(@NonNull View view, int i10);

        void a(@NonNull View view, int i10, float f10);
    }

    public interface d {
        void a();
    }

    public ViewFlow(Context context) {
        this(context, null);
    }

    private static float b(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void c(@IntRange(from = 0) int i10) {
        a(i10, true, -20);
    }

    private boolean f() {
        int i10 = this.f102953c;
        return i10 == 2 || i10 == 3;
    }

    private boolean g() {
        this.C = -1;
        i();
        return true;
    }

    private int getScrollRange() {
        return Math.max(0, this.f102964n - getMeasuredWidth());
    }

    private void h() {
        this.f102958h = false;
        this.f102971v = true;
    }

    private void i() {
        this.f102971v = false;
        this.f102972w = false;
        this.f102958h = false;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
    }

    private void j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final int a(View view) {
        if (view == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i10 = 0; i10 < items.size(); i10++) {
            if (items.get(i10) == view) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (i10 < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.f102956f) {
                i10 = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.f102955e) {
                i10++;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f102970u = true;
        if (this.f102969t.isFinished() || !this.f102969t.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f102969t.getCurrX();
        int currY = this.f102969t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
        }
        sg.bigo.ads.common.e.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f102957g = true;
        if (!this.M) {
            onTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final boolean e() {
        int measuredWidth = this.f102964n;
        View view = this.f102955e;
        if (view != null) {
            measuredWidth -= view.getRight();
        }
        View view2 = this.f102956f;
        if (view2 != null) {
            measuredWidth -= view2.getMeasuredWidth();
        }
        return getWidth() >= measuredWidth;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getContentMaxWidthSpace() {
        return this.f102954d;
    }

    @IntRange(from = 0)
    public int getCurrentItem() {
        return this.f102951a;
    }

    @IntRange(from = 0)
    public int getItemCount() {
        return this.f102952b;
    }

    @NonNull
    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f102955e && childAt != this.f102956f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public c getOnItemChangeListener() {
        return this.f102961k.f102979a;
    }

    public int getViewStyle() {
        return this.f102953c;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.J);
        Scroller scroller = this.f102969t;
        if (scroller != null && !scroller.isFinished()) {
            this.f102969t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M = false;
        if (this.f102968r) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.f102971v) {
                return true;
            }
            if (this.f102972w) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.A = x10;
            this.f102974y = x10;
            float y10 = motionEvent.getY();
            this.B = y10;
            this.f102975z = y10;
            this.C = motionEvent.getPointerId(0);
            this.f102972w = false;
            this.f102970u = true;
            this.f102969t.computeScrollOffset();
            if (this.K != 2 || Math.abs(this.f102969t.getFinalX() - this.f102969t.getCurrX()) <= this.H) {
                a(false);
                this.f102971v = false;
            } else {
                this.f102969t.abortAnimation();
                h();
                j();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.C;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f102974y;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.B);
                if (f10 != 0.0f) {
                    float f11 = this.f102974y;
                    if ((f11 >= this.f102960j || f10 <= 0.0f) && ((f11 <= getWidth() - this.f102960j || f10 >= 0.0f) && getWidth() < this.f102964n)) {
                        this.f102974y = x11;
                        this.f102975z = y11;
                        this.f102972w = true;
                        return false;
                    }
                }
                int i11 = this.f102973x;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    h();
                    j();
                    setScrollState(1);
                    float f12 = this.A;
                    float f13 = this.f102973x;
                    this.f102974y = f10 > 0.0f ? f12 + f13 : f12 - f13;
                    this.f102975z = y11;
                } else if (fAbs2 > i11) {
                    this.f102972w = true;
                }
                if (this.f102971v) {
                    a(x11);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        return this.f102971v;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int iMin;
        super.onScrollChanged(i10, i11, i12, i13);
        View childAt = getChildAt(0);
        if (childAt == null || childAt != this.f102955e) {
            i14 = 0;
            iMin = i10;
        } else {
            iMin = Math.max(childAt.getRight(), i10);
            i14 = 1;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.f102956f) {
            iMin = Math.min(childAt2.getLeft() - getMeasuredWidth(), iMin);
            childCount--;
        }
        float measuredWidth = f() ? iMin + ((getMeasuredWidth() * 1.0f) / 2.0f) : iMin + this.f102954d;
        View childAt3 = getChildAt(this.f102951a + i14);
        int measuredWidth2 = (childAt3 == null || childAt3.getMeasuredWidth() <= 0) ? getMeasuredWidth() - (this.f102954d * 2) : childAt3.getMeasuredWidth();
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- begin -----");
        for (int i15 = i14; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            if (childAt4 != null) {
                float fMax = Math.max(-1.0f, Math.min(1.0f, (f() ? (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - measuredWidth) + 0.5f) : childAt4.getLeft() - measuredWidth) / measuredWidth2));
                int i16 = i15 - i14;
                if (childAt4.getLeft() < measuredWidth && childAt4.getRight() > measuredWidth) {
                    this.f102962l = i16;
                }
                this.f102961k.a(childAt4, i16, fMax);
                if (fMax == 0.0f && this.f102951a != i16) {
                    this.f102951a = i16;
                    this.f102962l = i16;
                    this.f102961k.a(childAt4, i16);
                }
            }
        }
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- end -----");
        a aVar = this.f102961k;
        if (aVar != null) {
            aVar.a(i10, getScrollRange());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0217 A[PHI: r1
  0x0217: PHI (r1v12 sg.bigo.ads.common.view.ViewFlow$d) = (r1v11 sg.bigo.ads.common.view.ViewFlow$d), (r1v13 sg.bigo.ads.common.view.ViewFlow$d) binds: [B:127:0x023c, B:117:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == this.f102956f || view == this.f102955e || view == null) {
            return;
        }
        this.f102952b++;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f102956f || view == this.f102955e || view == null) {
            return;
        }
        this.f102952b--;
    }

    public void setContentMaxWidthSpace(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f102954d != iMax) {
            this.f102954d = iMax;
            requestLayout();
        }
    }

    public void setDividerWidth(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f102963m != iMax) {
            this.f102963m = iMax;
            if (this.f102953c != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.f102956f;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f102956f = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(p pVar) {
        this.f102967q = pVar;
    }

    public void setOnEndViewShowListener(d dVar) {
        this.f102966p = dVar;
    }

    public void setOnItemChangeListener(c cVar) {
        this.f102961k.f102979a = cVar;
    }

    public void setOnStartViewShowListener(d dVar) {
        this.f102965o = dVar;
    }

    public void setScrollEnabled(boolean z10) {
        this.f102968r = z10;
    }

    void setScrollState(int i10) {
        if (this.K == i10) {
            return;
        }
        this.K = i10;
    }

    public void setStartView(View view) {
        View view2 = this.f102955e;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f102955e = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i10) {
        if (this.f102953c != i10) {
            this.f102953c = i10;
            requestLayout();
        }
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102961k = new a(this, (byte) 0);
        this.f102951a = 0;
        this.f102952b = 0;
        this.f102962l = 0;
        this.f102953c = 3;
        this.f102968r = true;
        this.f102957g = false;
        this.f102958h = false;
        this.C = -1;
        this.I = true;
        this.J = new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewFlow.this.setScrollState(0);
            }
        };
        this.K = 0;
        this.M = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.f102969t = new Scroller(context2, f102950s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f102973x = viewConfiguration.getScaledPagingTouchSlop();
        this.E = (int) (400.0f * f10);
        this.F = viewConfiguration.getScaledMaximumFlingVelocity();
        this.G = (int) (25.0f * f10);
        this.H = (int) (2.0f * f10);
        this.f102959i = (int) (f10 * 16.0f);
    }

    @Nullable
    public final View a(int i10) {
        List<View> items = getItems();
        if (i10 < 0 || i10 >= items.size()) {
            return null;
        }
        return items.get(i10);
    }

    public final void b(int i10) {
        this.f102951a = i10;
        if (this.I) {
            requestLayout();
        } else {
            c(i10);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    @Override // sg.bigo.ads.common.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a() {
        /*
            r5 = this;
            int r0 = r5.getItemCount()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r2 = r5.getCurrentItem()
            boolean r3 = r5.L
            if (r3 == 0) goto L1a
            if (r2 != 0) goto L17
            int r2 = r2 + r1
            r0 = 0
            r5.L = r0
            goto L3a
        L17:
            int r2 = r2 + (-1)
            goto L3a
        L1a:
            int r0 = r0 - r1
            if (r2 == r0) goto L36
            android.view.View r0 = r5.f102956f
            int r3 = r5.f102964n
            if (r0 == 0) goto L28
            int r0 = r0.getMeasuredWidth()
            int r3 = r3 - r0
        L28:
            int r0 = r5.getScrollX()
            int r4 = r5.getMeasuredWidth()
            int r0 = r0 + r4
            if (r0 < r3) goto L34
            goto L36
        L34:
            int r2 = r2 + r1
            goto L3a
        L36:
            int r2 = r2 + (-1)
            r5.L = r1
        L3a:
            r5.c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.a():void");
    }

    @Override // sg.bigo.ads.common.view.a
    protected final boolean b() {
        return !this.f102971v;
    }

    private void a(int i10, int i11) {
        int scrollX;
        if (this.f102952b == 0) {
            return;
        }
        Scroller scroller = this.f102969t;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f102970u ? this.f102969t.getCurrX() : this.f102969t.getStartX();
            this.f102969t.abortAnimation();
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i10 - i12;
        int i14 = 0 - scrollY;
        if (i13 == 0 && i14 == 0) {
            a(false);
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int measuredWidth = getMeasuredWidth();
        float f10 = measuredWidth / 2;
        float fB = f10 + (b(Math.min(1.0f, (Math.abs(i13) * 1.0f) / measuredWidth)) * f10);
        int iAbs = Math.abs(i11);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fB / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i13) / getChildAt(this.f102951a).getWidth()) + 1.0f) * 100.0f), 600);
        this.f102970u = false;
        this.f102969t.startScroll(i12, scrollY, i13, i14, iMin);
        sg.bigo.ads.common.e.a.a(this);
    }

    private void a(@IntRange(from = 0) int i10, boolean z10, int i11) {
        int measuredWidth;
        int measuredWidth2;
        if (this.f102952b <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(0, i10), this.f102952b - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.f102955e) {
            iMin++;
        }
        View childAt2 = getChildAt(iMin);
        int left = childAt2 != null ? f() ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.f102954d, this.f102963m) : 0;
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.f102956f != null) {
                measuredWidth = this.f102964n - getMeasuredWidth();
                measuredWidth2 = this.f102956f.getMeasuredWidth();
            } else {
                measuredWidth = this.f102964n;
                measuredWidth2 = getMeasuredWidth();
            }
            left = (int) Math.max(0.0f, Math.min(left, measuredWidth - measuredWidth2));
        }
        if (left == getScrollX()) {
            return;
        }
        if (z10) {
            a(left, i11);
        } else {
            a(false);
            scrollTo(left, 0);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f102974y = motionEvent.getX(i10);
            this.C = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    static /* synthetic */ void a(ViewFlow viewFlow) {
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.f102955e != null) {
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.f102955e;
            if (childAt == view && scrollX < view.getRight()) {
                viewFlow.c(0);
                return;
            }
        }
        if (viewFlow.f102956f != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.f102956f;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            viewFlow.c(viewFlow.getItemCount() - 1);
        }
    }

    private void a(boolean z10) {
        boolean z11 = this.K == 2;
        if (z11 && !this.f102969t.isFinished()) {
            this.f102969t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f102969t.getCurrX();
            int currY = this.f102969t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z11) {
            if (z10) {
                sg.bigo.ads.common.e.a.a(this, this.J);
            } else {
                this.J.run();
            }
        }
    }

    private boolean a(float f10) {
        float f11 = this.f102974y - f10;
        this.f102974y = f10;
        float fMax = Math.max(0.0f, Math.min(getScrollX() + f11, getScrollRange()));
        sg.bigo.ads.common.t.a.b("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + fMax);
        int i10 = (int) fMax;
        this.f102974y = this.f102974y + (fMax - ((float) i10));
        scrollTo(i10, getScrollY());
        return false;
    }
}
