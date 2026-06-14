package com.bytedance.adsdk.ugeno.jpc;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends ViewGroup {
    private float aaj;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private int f16174ag;
    private VelocityTracker ax;
    private boolean bch;
    private mo bjy;
    private int bqt;
    private List<Object> car;
    private int cx;
    private int dk;
    private int ekw;
    private final Runnable en;
    private int exc;
    private Scroller exu;
    private float fco;
    private ClassLoader fs;
    private EdgeEffect gt;
    private int gy;
    private float hkc;
    private float hzv;
    private ArrayList<View> ijp;
    private boolean irn;
    private boolean jjk;
    private int jl;
    private final ud jpc;
    private int jtx;
    private float jyq;
    private int kdv;
    private boolean koa;
    private int ljh;
    com.bytedance.adsdk.ugeno.jpc.ud lnr;
    private int lte;
    private mzz mlb;
    int mml;
    private float mrf;
    private int nz;
    private int om;
    private int oth;
    private int qdl;

    /* JADX INFO: renamed from: rc, reason: collision with root package name */
    private int f16175rc;
    private boolean rdp;
    private Parcelable rq;
    private mml sy;
    private List<mml> taz;
    private mml tid;
    private int to;
    private final Rect tvp;
    private boolean uw;
    private boolean vu;
    private EdgeEffect wak;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    private int f16176wc;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final ArrayList<ud> f16177wd;
    private boolean xi;
    private boolean xmv;

    /* JADX INFO: renamed from: yh, reason: collision with root package name */
    private boolean f16178yh;
    private Drawable yt;
    private int zlt;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    static final int[] f16173ud = {R.attr.layout_gravity};
    private static final Comparator<ud> mzz = new Comparator<ud>() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compare(ud udVar, ud udVar2) {
            return udVar.f16180ud - udVar2.f16180ud;
        }
    };
    private static final Interpolator mo = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final jpc zy = new jpc();

    static class jpc implements Comparator<View> {
        jpc() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0207lnr c0207lnr = (C0207lnr) view.getLayoutParams();
            C0207lnr c0207lnr2 = (C0207lnr) view2.getLayoutParams();
            boolean z10 = c0207lnr.qdl;
            return z10 != c0207lnr2.qdl ? z10 ? 1 : -1 : c0207lnr.mzz - c0207lnr2.mzz;
        }
    }

    public interface mml {
        void fs(int i10);

        void qdl(int i10, float f10, int i11);

        void rq(int i10);
    }

    private class mo extends DataSetObserver {
        mo() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            lnr.this.ud();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            lnr.this.ud();
        }
    }

    public interface mzz {
        void qdl(View view, float f10);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface qdl {
    }

    static class ud {
        boolean lnr;
        float mml;
        float mzz;
        Object qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f16180ud;

        ud() {
        }
    }

    public static class wd extends com.bytedance.adsdk.ugeno.jpc.qdl {
        public static final Parcelable.Creator<wd> CREATOR = new Parcelable.ClassLoaderCreator<wd>() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.wd.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public wd createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new wd(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public wd createFromParcel(Parcel parcel) {
                return new wd(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public wd[] newArray(int i10) {
                return new wd[i10];
            }
        };
        Parcelable lnr;
        ClassLoader mml;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f16181ud;

        public wd(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f16181ud + "}";
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.qdl, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16181ud);
            parcel.writeParcelable(this.lnr, i10);
        }

        wd(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f16181ud = parcel.readInt();
            this.lnr = parcel.readParcelable(classLoader);
            this.mml = classLoader;
        }
    }

    public lnr(Context context) {
        super(context);
        this.f16177wd = new ArrayList<>();
        this.jpc = new ud();
        this.tvp = new Rect();
        this.to = -1;
        this.rq = null;
        this.fs = null;
        this.aaj = -3.4028235E38f;
        this.jyq = Float.MAX_VALUE;
        this.bqt = 1;
        this.gy = -1;
        this.irn = true;
        this.xi = false;
        this.en = new Runnable() { // from class: com.bytedance.adsdk.ugeno.jpc.lnr.3
            @Override // java.lang.Runnable
            public void run() {
                lnr.this.setScrollState(0);
                lnr.this.lnr();
            }
        };
        this.nz = 0;
        qdl();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean jpc() {
        this.gy = -1;
        to();
        this.wak.onRelease();
        this.gt.onRelease();
        return this.wak.isFinished() || this.gt.isFinished();
    }

    private boolean mml(int i10) {
        if (this.f16177wd.size() == 0) {
            if (this.irn) {
                return false;
            }
            this.jjk = false;
            qdl(0, 0.0f, 0);
            if (this.jjk) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ud udVarTvp = tvp();
        int clientWidth = getClientWidth();
        int i11 = this.jtx;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = udVarTvp.f16180ud;
        float f11 = ((i10 / f10) - udVarTvp.mzz) / (udVarTvp.mml + (i11 / f10));
        this.jjk = false;
        qdl(i13, f11, (int) (i12 * f11));
        if (this.jjk) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void mo() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0207lnr) getChildAt(i10).getLayoutParams()).qdl) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void mzz(int i10) {
        mml mmlVar = this.tid;
        if (mmlVar != null) {
            mmlVar.rq(i10);
        }
        List<mml> list = this.taz;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                mml mmlVar2 = this.taz.get(i11);
                if (mmlVar2 != null) {
                    mmlVar2.rq(i10);
                }
            }
        }
        mml mmlVar3 = this.sy;
        if (mmlVar3 != null) {
            mmlVar3.rq(i10);
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.uw != z10) {
            this.uw = z10;
        }
    }

    private void to() {
        this.koa = false;
        this.vu = false;
        VelocityTracker velocityTracker = this.ax;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ax = null;
        }
    }

    private ud tvp() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.jtx / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        ud udVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f16177wd.size()) {
            ud udVar2 = this.f16177wd.get(i11);
            if (!z10 && udVar2.f16180ud != (i10 = i12 + 1)) {
                udVar2 = this.jpc;
                udVar2.mzz = f10 + f12 + f11;
                udVar2.f16180ud = i10;
                udVar2.mml = this.lnr.qdl(i10);
                i11--;
            }
            ud udVar3 = udVar2;
            f10 = udVar3.mzz;
            float f13 = udVar3.mml + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.f16177wd.size() - 1) {
                return udVar3;
            }
            int i13 = udVar3.f16180ud;
            float f14 = udVar3.mml;
            i11++;
            i12 = i13;
            f12 = f14;
            udVar = udVar3;
            z10 = false;
        }
        return udVar;
    }

    private void wd() {
        if (this.dk != 0) {
            ArrayList<View> arrayList = this.ijp;
            if (arrayList == null) {
                this.ijp = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.ijp.add(getChildAt(i10));
            }
            Collections.sort(this.ijp, zy);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ud udVarQdl;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.f16180ud == this.mml) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ud udVarQdl;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.f16180ud == this.mml) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0207lnr c0207lnr = (C0207lnr) layoutParams;
        boolean zLnr = c0207lnr.qdl | lnr(view);
        c0207lnr.qdl = zLnr;
        if (!this.bch) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zLnr) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0207lnr.mml = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.lnr == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.aaj)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.jyq));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0207lnr) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.rdp = true;
        if (this.exu.isFinished() || !this.exu.computeScrollOffset()) {
            qdl(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.exu.getCurrX();
        int currY = this.exu.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!mml(currX)) {
                this.exu.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || qdl(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ud udVarQdl;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.f16180ud == this.mml && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (udVar = this.lnr) != null && udVar.qdl() > 1)) {
            if (!this.wak.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.aaj * width);
                this.wak.setSize(height, width);
                zDraw = this.wak.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.gt.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.jyq + 1.0f)) * width2);
                this.gt.setSize(height2, width2);
                zDraw |= this.gt.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.wak.finish();
            this.gt.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.yt;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0207lnr();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.jpc.ud getAdapter() {
        return this.lnr;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.dk == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0207lnr) this.ijp.get(i11).getLayoutParams()).mo;
    }

    public int getCurrentItem() {
        return this.mml;
    }

    public int getOffscreenPageLimit() {
        return this.bqt;
    }

    public int getPageMargin() {
        return this.jtx;
    }

    void lnr() {
        qdl(this.mml);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.irn = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.en);
        Scroller scroller = this.exu;
        if (scroller != null && !scroller.isFinished()) {
            this.exu.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.jtx <= 0 || this.yt == null || this.f16177wd.size() <= 0 || this.lnr == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.jtx / width;
        int i12 = 0;
        ud udVar = this.f16177wd.get(0);
        float f12 = udVar.mzz;
        int size = this.f16177wd.size();
        int i13 = udVar.f16180ud;
        int i14 = this.f16177wd.get(size - 1).f16180ud;
        while (i13 < i14) {
            while (true) {
                i10 = udVar.f16180ud;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                udVar = this.f16177wd.get(i12);
            }
            if (i13 == i10) {
                float f13 = udVar.mzz;
                float f14 = udVar.mml;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fQdl = this.lnr.qdl(i13);
                f10 = (f12 + fQdl) * width;
                f12 += fQdl + f11;
            }
            if (this.jtx + f10 > scrollX) {
                i11 = scrollX;
                this.yt.setBounds(Math.round(f10), this.jl, Math.round(this.jtx + f10), this.exc);
                this.yt.draw(canvas);
            } else {
                i11 = scrollX;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            jpc();
            return false;
        }
        if (action != 0) {
            if (this.koa) {
                return true;
            }
            if (this.vu) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.fco = x10;
            this.hkc = x10;
            float y10 = motionEvent.getY();
            this.mrf = y10;
            this.hzv = y10;
            this.gy = motionEvent.getPointerId(0);
            this.vu = false;
            this.rdp = true;
            this.exu.computeScrollOffset();
            if (this.nz != 2 || Math.abs(this.exu.getFinalX() - this.exu.getCurrX()) <= this.cx) {
                qdl(false);
                this.koa = false;
            } else {
                this.exu.abortAnimation();
                this.xmv = false;
                lnr();
                this.koa = true;
                lnr(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.gy;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.hkc;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.mrf);
                if (f10 != 0.0f && !qdl(this.hkc, f10) && qdl(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.hkc = x11;
                    this.hzv = y11;
                    this.vu = true;
                    return false;
                }
                int i11 = this.ekw;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.koa = true;
                    lnr(true);
                    setScrollState(1);
                    this.hkc = f10 > 0.0f ? this.fco + this.ekw : this.fco - this.ekw;
                    this.hzv = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.vu = true;
                }
                if (this.koa && ud(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            qdl(motionEvent);
        }
        if (this.ax == null) {
            this.ax = VelocityTracker.obtain();
        }
        this.ax.addMovement(motionEvent);
        return this.koa;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.jpc.lnr.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        C0207lnr c0207lnr;
        C0207lnr c0207lnr2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.kdv = Math.min(measuredWidth / 10, this.f16175rc);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0207lnr2 = (C0207lnr) childAt.getLayoutParams()) != null && c0207lnr2.qdl) {
                int i15 = c0207lnr2.f16179ud;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0207lnr2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0207lnr2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.oth = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.ljh = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.bch = true;
        lnr();
        this.bch = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0207lnr = (C0207lnr) childAt2.getLayoutParams()) == null || !c0207lnr.qdl)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0207lnr.lnr), 1073741824), this.ljh);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        ud udVarQdl;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (udVarQdl = qdl(childAt)) != null && udVarQdl.f16180ud == this.mml && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wd wdVar = (wd) parcelable;
        super.onRestoreInstanceState(wdVar.qdl());
        if (this.lnr != null) {
            qdl(wdVar.f16181ud, false, true);
            return;
        }
        this.to = wdVar.f16181ud;
        this.rq = wdVar.lnr;
        this.fs = wdVar.mml;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        wd wdVar = new wd(super.onSaveInstanceState());
        wdVar.f16181ud = this.mml;
        com.bytedance.adsdk.ugeno.jpc.ud udVar = this.lnr;
        if (udVar != null) {
            wdVar.lnr = udVar.ud();
        }
        return wdVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.jtx;
            qdl(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar;
        int iFindPointerIndex;
        if (this.f16178yh) {
            return true;
        }
        boolean zJpc = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (udVar = this.lnr) == null || udVar.qdl() == 0) {
            return false;
        }
        if (this.ax == null) {
            this.ax = VelocityTracker.obtain();
        }
        this.ax.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.exu.abortAnimation();
            this.xmv = false;
            lnr();
            float x10 = motionEvent.getX();
            this.fco = x10;
            this.hkc = x10;
            float y10 = motionEvent.getY();
            this.mrf = y10;
            this.hzv = y10;
            this.gy = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.hkc = motionEvent.getX(actionIndex);
                            this.gy = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        qdl(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.gy);
                        if (iFindPointerIndex2 != -1) {
                            this.hkc = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.koa) {
                    qdl(this.mml, true, 0, false);
                    zJpc = jpc();
                }
            } else if (!this.koa) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.gy);
                if (iFindPointerIndex3 == -1) {
                    zJpc = jpc();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.hkc);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.hzv);
                    if (fAbs > this.ekw && fAbs > fAbs2) {
                        this.koa = true;
                        lnr(true);
                        float f10 = this.fco;
                        this.hkc = x11 - f10 > 0.0f ? f10 + this.ekw : f10 - this.ekw;
                        this.hzv = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.koa) {
                        zJpc = ud(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.koa && (iFindPointerIndex = motionEvent.findPointerIndex(this.gy)) != -1) {
                zJpc = ud(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.koa) {
            VelocityTracker velocityTracker = this.ax;
            velocityTracker.computeCurrentVelocity(1000, this.f16176wc);
            int xVelocity = (int) velocityTracker.getXVelocity(this.gy);
            this.xmv = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ud udVarTvp = tvp();
            float f11 = clientWidth;
            int i10 = udVarTvp.f16180ud;
            float f12 = ((scrollX / f11) - udVarTvp.mzz) / (udVarTvp.mml + (this.jtx / f11));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.gy);
            if (iFindPointerIndex4 != -1) {
                qdl(qdl(i10, f12, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.fco)), true, true, xVelocity);
                zJpc = jpc();
            }
        }
        if (zJpc) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    void qdl() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.exu = new Scroller(context, mo);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.ekw = viewConfiguration.getScaledPagingTouchSlop();
        this.f16174ag = (int) (400.0f * f10);
        this.f16176wc = viewConfiguration.getScaledMaximumFlingVelocity();
        this.wak = new EdgeEffect(context);
        this.gt = new EdgeEffect(context);
        this.om = (int) (25.0f * f10);
        this.cx = (int) (2.0f * f10);
        this.f16175rc = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.bch) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.jpc.ud udVar) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar2 = this.lnr;
        if (udVar2 != null) {
            udVar2.qdl((DataSetObserver) null);
            for (int i10 = 0; i10 < this.f16177wd.size(); i10++) {
                ud udVar3 = this.f16177wd.get(i10);
                this.lnr.qdl((ViewGroup) this, udVar3.f16180ud, udVar3.qdl);
            }
            this.f16177wd.clear();
            mo();
            this.mml = 0;
            scrollTo(0, 0);
        }
        this.lnr = udVar;
        this.qdl = 0;
        if (udVar != null) {
            if (this.bjy == null) {
                this.bjy = new mo();
            }
            this.lnr.qdl((DataSetObserver) this.bjy);
            this.xmv = false;
            boolean z10 = this.irn;
            this.irn = true;
            this.qdl = this.lnr.qdl();
            int i11 = this.to;
            if (i11 >= 0) {
                qdl(i11, false, true);
                this.to = -1;
                this.rq = null;
                this.fs = null;
            } else if (z10) {
                requestLayout();
            } else {
                lnr();
            }
        }
        List<Object> list = this.car;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.car.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.car.get(i12);
        }
    }

    public void setCurrentItem(int i10) {
        this.xmv = false;
        qdl(i10, !this.irn, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.bqt) {
            this.bqt = i10;
            lnr();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(mml mmlVar) {
        this.tid = mmlVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.jtx;
        this.jtx = i10;
        int width = getWidth();
        qdl(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.yt = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.nz == i10) {
            return;
        }
        this.nz = i10;
        if (this.mlb != null) {
            ud(i10 != 0);
        }
        mo(i10);
    }

    public void setScroller(Scroller scroller) {
        this.exu = scroller;
    }

    public void ud(mml mmlVar) {
        List<mml> list = this.taz;
        if (list != null) {
            list.remove(mmlVar);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.yt;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.jpc.lnr$lnr, reason: collision with other inner class name */
    public static class C0207lnr extends ViewGroup.LayoutParams {
        float lnr;
        boolean mml;
        int mo;
        int mzz;
        public boolean qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public int f16179ud;

        public C0207lnr() {
            super(-1, -1);
            this.lnr = 0.0f;
        }

        public C0207lnr(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.lnr = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lnr.f16173ud);
            this.f16179ud = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean lnr(View view) {
        return view.getClass().getAnnotation(qdl.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0207lnr(getContext(), attributeSet);
    }

    void ud() {
        int iQdl = this.lnr.qdl();
        this.qdl = iQdl;
        boolean z10 = this.f16177wd.size() < (this.bqt * 2) + 1 && this.f16177wd.size() < iQdl;
        int iMax = this.mml;
        int i10 = 0;
        while (i10 < this.f16177wd.size()) {
            ud udVar = this.f16177wd.get(i10);
            int iQdl2 = this.lnr.qdl(udVar.qdl);
            if (iQdl2 != -1) {
                if (iQdl2 == -2) {
                    this.f16177wd.remove(i10);
                    i10--;
                    this.lnr.qdl((ViewGroup) this, udVar.f16180ud, udVar.qdl);
                    int i11 = this.mml;
                    if (i11 == udVar.f16180ud) {
                        iMax = Math.max(0, Math.min(i11, iQdl - 1));
                    }
                } else {
                    int i12 = udVar.f16180ud;
                    if (i12 != iQdl2) {
                        if (i12 == this.mml) {
                            iMax = iQdl2;
                        }
                        udVar.f16180ud = iQdl2;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.f16177wd, mzz);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0207lnr c0207lnr = (C0207lnr) getChildAt(i13).getLayoutParams();
                if (!c0207lnr.qdl) {
                    c0207lnr.lnr = 0.0f;
                }
            }
            qdl(iMax, false, true);
            requestLayout();
        }
    }

    private void lnr(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void mo(int i10) {
        mml mmlVar = this.tid;
        if (mmlVar != null) {
            mmlVar.fs(i10);
        }
        List<mml> list = this.taz;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                mml mmlVar2 = this.taz.get(i11);
                if (mmlVar2 != null) {
                    mmlVar2.fs(i10);
                }
            }
        }
        mml mmlVar3 = this.sy;
        if (mmlVar3 != null) {
            mmlVar3.fs(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean lnr(int r5) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.jpc.lnr.lnr(int):boolean");
    }

    boolean mzz() {
        com.bytedance.adsdk.ugeno.jpc.ud udVar = this.lnr;
        if (udVar == null || this.mml >= udVar.qdl() - 1) {
            return false;
        }
        qdl(this.mml + 1, true);
        return true;
    }

    boolean mml() {
        int i10 = this.mml;
        if (i10 <= 0) {
            return false;
        }
        qdl(i10 - 1, true);
        return true;
    }

    public void qdl(int i10, boolean z10) {
        this.xmv = false;
        qdl(i10, z10, false);
    }

    void qdl(int i10, boolean z10, boolean z11) {
        qdl(i10, z10, z11, 0);
    }

    void qdl(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.jpc.ud udVar = this.lnr;
        if (udVar != null && udVar.qdl() > 0) {
            if (!z11 && this.mml == i10 && this.f16177wd.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.lnr.qdl()) {
                i10 = this.lnr.qdl() - 1;
            }
            int i12 = this.bqt;
            int i13 = this.mml;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f16177wd.size(); i14++) {
                    this.f16177wd.get(i14).lnr = true;
                }
            }
            boolean z12 = this.mml != i10;
            if (this.irn) {
                this.mml = i10;
                if (z12) {
                    mzz(i10);
                }
                requestLayout();
                return;
            }
            qdl(i10);
            qdl(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    ud ud(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return qdl(view);
            }
        }
    }

    ud ud(int i10) {
        for (int i11 = 0; i11 < this.f16177wd.size(); i11++) {
            ud udVar = this.f16177wd.get(i11);
            if (udVar.f16180ud == i10) {
                return udVar;
            }
        }
        return null;
    }

    private void ud(int i10, float f10, int i11) {
        mml mmlVar = this.tid;
        if (mmlVar != null) {
            mmlVar.qdl(i10, f10, i11);
        }
        List<mml> list = this.taz;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                mml mmlVar2 = this.taz.get(i12);
                if (mmlVar2 != null) {
                    mmlVar2.qdl(i10, f10, i11);
                }
            }
        }
        mml mmlVar3 = this.sy;
        if (mmlVar3 != null) {
            mmlVar3.qdl(i10, f10, i11);
        }
    }

    private void qdl(int i10, boolean z10, int i11, boolean z11) {
        ud udVarUd = ud(i10);
        int clientWidth = udVarUd != null ? (int) (getClientWidth() * Math.max(this.aaj, Math.min(udVarUd.mzz, this.jyq))) : 0;
        if (z10) {
            qdl(clientWidth, 0, i11);
            if (z11) {
                mzz(i10);
                return;
            }
            return;
        }
        if (z11) {
            mzz(i10);
        }
        qdl(false);
        scrollTo(clientWidth, 0);
        mml(clientWidth);
    }

    private void ud(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.lte : 0, null);
        }
    }

    private boolean ud(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.hkc - f10;
        this.hkc = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.aaj * clientWidth;
        float f13 = this.jyq * clientWidth;
        boolean z12 = false;
        ud udVar = this.f16177wd.get(0);
        ArrayList<ud> arrayList = this.f16177wd;
        ud udVar2 = arrayList.get(arrayList.size() - 1);
        if (udVar.f16180ud != 0) {
            f12 = udVar.mzz * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (udVar2.f16180ud != this.lnr.qdl() - 1) {
            f13 = udVar2.mzz * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.wak.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.gt.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.hkc += scrollX - i10;
        scrollTo(i10, getScrollY());
        mml(i10);
        return z12;
    }

    public void qdl(mml mmlVar) {
        if (this.taz == null) {
            this.taz = new ArrayList();
        }
        this.taz.add(mmlVar);
    }

    public void qdl(boolean z10, mzz mzzVar) {
        qdl(z10, mzzVar, 2);
    }

    public void qdl(boolean z10, mzz mzzVar, int i10) {
        boolean z11 = mzzVar != null;
        boolean z12 = z11 != (this.mlb != null);
        this.mlb = mzzVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.dk = z10 ? 2 : 1;
            this.lte = i10;
        } else {
            this.dk = 0;
        }
        if (z12) {
            lnr();
        }
    }

    float qdl(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    void qdl(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.exu;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.rdp ? this.exu.getCurrX() : this.exu.getStartX();
            this.exu.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            qdl(false);
            lnr();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fQdl = f11 + (qdl(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fQdl / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.lnr.qdl(this.mml)) + this.jtx)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.rdp = false;
        this.exu.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    ud qdl(int i10, int i11) {
        ud udVar = new ud();
        udVar.f16180ud = i10;
        udVar.qdl = this.lnr.qdl((ViewGroup) this, i10);
        udVar.mml = this.lnr.qdl(i10);
        if (i11 >= 0 && i11 < this.f16177wd.size()) {
            this.f16177wd.add(i11, udVar);
            return udVar;
        }
        this.f16177wd.add(udVar);
        return udVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6 A[PHI: r7 r10 r15
  0x00c6: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c6: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void qdl(int r18) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.jpc.lnr.qdl(int):void");
    }

    private void qdl(ud udVar, int i10, ud udVar2) {
        int i11;
        int i12;
        ud udVar3;
        ud udVar4;
        int iQdl = this.lnr.qdl();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.jtx / clientWidth : 0.0f;
        if (udVar2 != null) {
            int i13 = udVar2.f16180ud;
            int i14 = udVar.f16180ud;
            if (i13 < i14) {
                float fQdl = udVar2.mzz + udVar2.mml + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= udVar.f16180ud && i16 < this.f16177wd.size()) {
                    ud udVar5 = this.f16177wd.get(i16);
                    while (true) {
                        udVar4 = udVar5;
                        if (i15 <= udVar4.f16180ud || i16 >= this.f16177wd.size() - 1) {
                            break;
                        }
                        i16++;
                        udVar5 = this.f16177wd.get(i16);
                    }
                    while (i15 < udVar4.f16180ud) {
                        fQdl += this.lnr.qdl(i15) + f10;
                        i15++;
                    }
                    udVar4.mzz = fQdl;
                    fQdl += udVar4.mml + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f16177wd.size() - 1;
                float fQdl2 = udVar2.mzz;
                while (true) {
                    i13--;
                    if (i13 < udVar.f16180ud || size < 0) {
                        break;
                    }
                    ud udVar6 = this.f16177wd.get(size);
                    while (true) {
                        udVar3 = udVar6;
                        if (i13 >= udVar3.f16180ud || size <= 0) {
                            break;
                        }
                        size--;
                        udVar6 = this.f16177wd.get(size);
                    }
                    while (i13 > udVar3.f16180ud) {
                        fQdl2 -= this.lnr.qdl(i13) + f10;
                        i13--;
                    }
                    fQdl2 -= udVar3.mml + f10;
                    udVar3.mzz = fQdl2;
                }
            }
        }
        int size2 = this.f16177wd.size();
        float fQdl3 = udVar.mzz;
        int i17 = udVar.f16180ud;
        int i18 = i17 - 1;
        this.aaj = i17 == 0 ? fQdl3 : -3.4028235E38f;
        int i19 = iQdl - 1;
        this.jyq = i17 == i19 ? (udVar.mml + fQdl3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            ud udVar7 = this.f16177wd.get(i20);
            while (true) {
                i12 = udVar7.f16180ud;
                if (i18 <= i12) {
                    break;
                }
                fQdl3 -= this.lnr.qdl(i18) + f10;
                i18--;
            }
            fQdl3 -= udVar7.mml + f10;
            udVar7.mzz = fQdl3;
            if (i12 == 0) {
                this.aaj = fQdl3;
            }
            i20--;
            i18--;
        }
        float fQdl4 = udVar.mzz + udVar.mml + f10;
        int i21 = udVar.f16180ud + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            ud udVar8 = this.f16177wd.get(i22);
            while (true) {
                i11 = udVar8.f16180ud;
                if (i21 >= i11) {
                    break;
                }
                fQdl4 += this.lnr.qdl(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.jyq = (udVar8.mml + fQdl4) - 1.0f;
            }
            udVar8.mzz = fQdl4;
            fQdl4 += udVar8.mml + f10;
            i22++;
            i21++;
        }
        this.xi = false;
    }

    ud qdl(View view) {
        for (int i10 = 0; i10 < this.f16177wd.size(); i10++) {
            ud udVar = this.f16177wd.get(i10);
            if (this.lnr.qdl(view, udVar.qdl)) {
                return udVar;
            }
        }
        return null;
    }

    private void qdl(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f16177wd.isEmpty()) {
            if (!this.exu.isFinished()) {
                this.exu.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        ud udVarUd = ud(this.mml);
        int iMin = (int) ((udVarUd != null ? Math.min(udVarUd.mzz, this.jyq) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            qdl(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void qdl(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.zlt
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.jpc.lnr$lnr r9 = (com.bytedance.adsdk.ugeno.jpc.lnr.C0207lnr) r9
            boolean r10 = r9.qdl
            if (r10 == 0) goto L68
            int r9 = r9.f16179ud
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5c
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L45:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5c
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L45
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.ud(r13, r14, r15)
            com.bytedance.adsdk.ugeno.jpc.lnr$mzz r13 = r12.mlb
            if (r13 == 0) goto L9e
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9e
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.jpc.lnr$lnr r0 = (com.bytedance.adsdk.ugeno.jpc.lnr.C0207lnr) r0
            boolean r0 = r0.qdl
            if (r0 != 0) goto L9b
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.jpc.lnr$mzz r3 = r12.mlb
            r3.qdl(r15, r0)
        L9b:
            int r1 = r1 + 1
            goto L7a
        L9e:
            r12.jjk = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.jpc.lnr.qdl(int, float, int):void");
    }

    private void qdl(boolean z10) {
        boolean z11 = this.nz == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.exu.isFinished()) {
                this.exu.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.exu.getCurrX();
                int currY = this.exu.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        mml(currX);
                    }
                }
            }
        }
        this.xmv = false;
        for (int i10 = 0; i10 < this.f16177wd.size(); i10++) {
            ud udVar = this.f16177wd.get(i10);
            if (udVar.lnr) {
                udVar.lnr = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.en);
            } else {
                this.en.run();
            }
        }
    }

    private boolean qdl(float f10, float f11) {
        if (f10 >= this.kdv || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.kdv)) && f11 < 0.0f;
        }
        return true;
    }

    private int qdl(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.om || Math.abs(i11) <= this.f16174ag) {
            i10 += (int) (f10 + (i10 >= this.mml ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f16177wd.size() <= 0) {
            return i10;
        }
        return Math.max(this.f16177wd.get(0).f16180ud, Math.min(i10, this.f16177wd.get(r4.size() - 1).f16180ud));
    }

    private void qdl(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.gy) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.hkc = motionEvent.getX(i10);
            this.gy = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.ax;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    protected boolean qdl(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && qdl(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean qdl(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return mml();
            }
            return lnr(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return mzz();
            }
            return lnr(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return lnr(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return lnr(1);
        }
        return false;
    }

    private Rect qdl(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
