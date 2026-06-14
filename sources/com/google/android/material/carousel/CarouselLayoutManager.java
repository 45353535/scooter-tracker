package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f25824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f25825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f25826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DebugItemDecoration f25828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CarouselStrategy f25829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private KeylineStateList f25830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private KeylineState f25831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f25833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CarouselOrientationHelper f25834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View.OnLayoutChangeListener f25835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f25836t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25837u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25838v;

    private static final class ChildCalculations {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f25840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f25841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f25842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final KeylineRange f25843d;

        ChildCalculations(View view, float f10, float f11, KeylineRange keylineRange) {
            this.f25840a = view;
            this.f25841b = f10;
            this.f25842c = f11;
            this.f25843d = keylineRange;
        }
    }

    private static class DebugItemDecoration extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f25844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f25845c;

        DebugItemDecoration() {
            Paint paint = new Paint();
            this.f25844b = paint;
            this.f25845c = DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void a(List list) {
            this.f25845c = DesugarCollections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.f25844b.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.f25845c) {
                this.f25844b.setColor(ColorUtils.blendARGB(-65281, -16776961, keyline.f25878c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.f25877b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).H(), keyline.f25877b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).D(), this.f25844b);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).E(), keyline.f25877b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).F(), keyline.f25877b, this.f25844b);
                }
            }
        }
    }

    private static class KeylineRange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final KeylineState.Keyline f25846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final KeylineState.Keyline f25847b;

        KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            Preconditions.checkArgument(keyline.f25876a <= keyline2.f25876a);
            this.f25846a = keyline;
            this.f25847b = keyline2;
        }
    }

    private static class LayoutDirection {
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private float A(float f10, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f25846a;
        float f11 = keyline.f25879d;
        KeylineState.Keyline keyline2 = keylineRange.f25847b;
        return AnimationUtils.lerp(f11, keyline2.f25879d, keyline.f25877b, keyline2.f25877b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D() {
        return this.f25834r.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E() {
        return this.f25834r.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F() {
        return this.f25834r.f();
    }

    private int G() {
        return this.f25834r.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        return this.f25834r.h();
    }

    private int I() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int J(int i10, KeylineState keylineState) {
        return M() ? (int) (((u() - keylineState.i().f25876a) - (i10 * keylineState.g())) - (keylineState.g() / 2.0f)) : (int) (((i10 * keylineState.g()) - keylineState.b().f25876a) + (keylineState.g() / 2.0f));
    }

    private int K(int i10, KeylineState keylineState) {
        int i11 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.f()) {
            float fG = (i10 * keylineState.g()) + (keylineState.g() / 2.0f);
            int iU = (M() ? (int) ((u() - keyline.f25876a) - fG) : (int) (fG - keyline.f25876a)) - this.f25824h;
            if (Math.abs(i11) > Math.abs(iU)) {
                i11 = iU;
            }
        }
        return i11;
    }

    private static KeylineRange L(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list.get(i14);
            float f15 = z10 ? keyline.f25877b : keyline.f25876a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new KeylineRange((KeylineState.Keyline) list.get(i10), (KeylineState.Keyline) list.get(i12));
    }

    private boolean N(float f10, KeylineRange keylineRange) {
        float fJ = j(f10, A(f10, keylineRange) / 2.0f);
        return M() ? fJ < 0.0f : fJ > ((float) u());
    }

    private boolean O(float f10, KeylineRange keylineRange) {
        float fI = i(f10, A(f10, keylineRange) / 2.0f);
        return M() ? fI > ((float) u()) : fI < 0.0f;
    }

    private void P() {
        if (this.f25827k && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                Log.d("CarouselLayoutManager", "item position " + getPosition(childAt) + ", center:" + v(childAt) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private ChildCalculations Q(RecyclerView.Recycler recycler, float f10, int i10) {
        View viewForPosition = recycler.getViewForPosition(i10);
        measureChildWithMargins(viewForPosition, 0, 0);
        float fI = i(f10, this.f25831o.g() / 2.0f);
        KeylineRange keylineRangeL = L(this.f25831o.h(), fI, false);
        return new ChildCalculations(viewForPosition, fI, n(fI, keylineRangeL), keylineRangeL);
    }

    private float R(View view, float f10, float f11, Rect rect) {
        float fI = i(f10, f11);
        KeylineRange keylineRangeL = L(this.f25831o.h(), fI, false);
        float fN = n(fI, keylineRangeL);
        super.getDecoratedBoundsWithMargins(view, rect);
        X(view, fI, keylineRangeL);
        this.f25834r.offsetChild(view, rect, f11, fN);
        return fN;
    }

    private void S(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        KeylineState keylineStateOnFirstChildMeasuredWithMargins = this.f25829m.onFirstChildMeasuredWithMargins(this, viewForPosition);
        if (M()) {
            keylineStateOnFirstChildMeasuredWithMargins = KeylineState.p(keylineStateOnFirstChildMeasuredWithMargins, u());
        }
        this.f25830n = KeylineStateList.f(this, keylineStateOnFirstChildMeasuredWithMargins, w(), z(), I(), this.f25829m.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.f25830n = null;
        requestLayout();
    }

    private void U(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fV = v(childAt);
            if (!O(fV, L(this.f25831o.h(), fV, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fV2 = v(childAt2);
            if (!N(fV2, L(this.f25831o.h(), fV2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
    }

    private void V(RecyclerView recyclerView, int i10) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void W(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void X(View view, float f10, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.f25846a;
            float f11 = keyline.f25878c;
            KeylineState.Keyline keyline2 = keylineRange.f25847b;
            float fLerp = AnimationUtils.lerp(f11, keyline2.f25878c, keyline.f25876a, keyline2.f25876a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF maskRect = this.f25834r.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, fLerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, fLerp));
            float fN = n(f10, keylineRange);
            RectF rectF = new RectF(fN - (maskRect.width() / 2.0f), fN - (maskRect.height() / 2.0f), fN + (maskRect.width() / 2.0f), (maskRect.height() / 2.0f) + fN);
            RectF rectF2 = new RectF(E(), H(), F(), D());
            if (this.f25829m.b() == CarouselStrategy.StrategyType.CONTAINED) {
                this.f25834r.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.f25834r.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((Maskable) view).setMaskRectF(maskRect);
        }
    }

    private void Y(KeylineStateList keylineStateList) {
        int i10 = this.f25826j;
        int i11 = this.f25825i;
        if (i10 <= i11) {
            this.f25831o = x(keylineStateList);
        } else {
            this.f25831o = keylineStateList.getShiftedState(this.f25824h, i11, i10);
        }
        this.f25828l.a(this.f25831o.h());
    }

    private void Z() {
        int itemCount = getItemCount();
        int i10 = this.f25836t;
        if (itemCount == i10 || this.f25830n == null) {
            return;
        }
        if (this.f25829m.shouldRefreshKeylineState(this, i10)) {
            T();
        }
        this.f25836t = itemCount;
    }

    private void a0() {
        if (!this.f25827k || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                P();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + position + "] and child at index [" + i11 + "] had adapter position [" + position2 + "].");
            }
            i10 = i11;
        }
    }

    public static /* synthetic */ void b(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.material.carousel.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f25905b.T();
            }
        });
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        int orientation = getOrientation();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (orientation == 0) {
                return M() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (orientation == 0) {
                return M() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130) {
            return orientation == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return Integer.MIN_VALUE;
    }

    private View getChildClosestToEnd() {
        return getChildAt(M() ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(M() ? getChildCount() - 1 : 0);
    }

    private void h(View view, int i10, ChildCalculations childCalculations) {
        float fG = this.f25831o.g() / 2.0f;
        addView(view, i10);
        measureChildWithMargins(view, 0, 0);
        float f10 = childCalculations.f25842c;
        this.f25834r.layoutDecoratedWithMargins(view, (int) (f10 - fG), (int) (f10 + fG));
        X(view, childCalculations.f25841b, childCalculations.f25843d);
    }

    private float i(float f10, float f11) {
        return M() ? f10 - f11 : f10 + f11;
    }

    private float j(float f10, float f11) {
        return M() ? f10 + f11 : f10 - f11;
    }

    private void k(RecyclerView.Recycler recycler, int i10, int i11) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return;
        }
        ChildCalculations childCalculationsQ = Q(recycler, o(i10), i10);
        h(childCalculationsQ.f25840a, i11, childCalculationsQ);
    }

    private void l(RecyclerView.Recycler recycler, RecyclerView.State state, int i10) {
        float fO = o(i10);
        while (i10 < state.getItemCount()) {
            float fI = i(fO, this.f25831o.g() / 2.0f);
            KeylineRange keylineRangeL = L(this.f25831o.h(), fI, false);
            float fN = n(fI, keylineRangeL);
            if (N(fN, keylineRangeL)) {
                return;
            }
            fO = i(fO, this.f25831o.g());
            if (!O(fN, keylineRangeL)) {
                View viewForPosition = recycler.getViewForPosition(i10);
                h(viewForPosition, -1, new ChildCalculations(viewForPosition, fI, fN, keylineRangeL));
            }
            i10++;
        }
    }

    private void m(RecyclerView.Recycler recycler, int i10) {
        float fO = o(i10);
        while (i10 >= 0) {
            float fI = i(fO, this.f25831o.g() / 2.0f);
            KeylineRange keylineRangeL = L(this.f25831o.h(), fI, false);
            float fN = n(fI, keylineRangeL);
            if (O(fN, keylineRangeL)) {
                return;
            }
            fO = j(fO, this.f25831o.g());
            if (!N(fN, keylineRangeL)) {
                View viewForPosition = recycler.getViewForPosition(i10);
                h(viewForPosition, 0, new ChildCalculations(viewForPosition, fI, fN, keylineRangeL));
            }
            i10--;
        }
    }

    private float n(float f10, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f25846a;
        float f11 = keyline.f25877b;
        KeylineState.Keyline keyline2 = keylineRange.f25847b;
        float fLerp = AnimationUtils.lerp(f11, keyline2.f25877b, keyline.f25876a, keyline2.f25876a, f10);
        if (keylineRange.f25847b != this.f25831o.d() && keylineRange.f25846a != this.f25831o.k()) {
            return fLerp;
        }
        KeylineState.Keyline keyline3 = keylineRange.f25847b;
        return fLerp + ((f10 - keyline3.f25876a) * (1.0f - keyline3.f25878c));
    }

    private float o(int i10) {
        return i(G() - this.f25824h, this.f25831o.g() * i10);
    }

    private int p(RecyclerView.State state, KeylineStateList keylineStateList) {
        boolean zM = M();
        KeylineState keylineStateK = zM ? keylineStateList.k() : keylineStateList.h();
        KeylineState.Keyline keylineB = zM ? keylineStateK.b() : keylineStateK.i();
        int itemCount = (int) (((((state.getItemCount() - 1) * keylineStateK.g()) * (zM ? -1.0f : 1.0f)) - (keylineB.f25876a - G())) + (((zM ? -1 : 1) * keylineB.f25879d) / 2.0f));
        return zM ? Math.min(0, itemCount) : Math.max(0, itemCount);
    }

    private static int r(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    private int s(KeylineStateList keylineStateList) {
        boolean zM = M();
        KeylineState keylineStateH = zM ? keylineStateList.h() : keylineStateList.k();
        return (int) (G() - j((zM ? keylineStateH.i() : keylineStateH.b()).f25876a, keylineStateH.g() / 2.0f));
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f25830n == null) {
            S(recycler);
        }
        if (getItemCount() <= x(this.f25830n).n()) {
            return 0;
        }
        int iR = r(i10, this.f25824h, this.f25825i, this.f25826j);
        this.f25824h += iR;
        Y(this.f25830n);
        float fG = this.f25831o.g() / 2.0f;
        float fO = o(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f10 = M() ? this.f25831o.i().f25877b : this.f25831o.b().f25877b;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            float fAbs = Math.abs(f10 - R(childAt, fO, fG, rect));
            if (childAt != null && fAbs < f11) {
                this.f25837u = getPosition(childAt);
                f11 = fAbs;
            }
            fO = i(fO, this.f25831o.g());
        }
        t(recycler, state);
        return iR;
    }

    private void t(RecyclerView.Recycler recycler, RecyclerView.State state) {
        U(recycler);
        if (getChildCount() == 0) {
            m(recycler, this.f25832p - 1);
            l(recycler, state, this.f25832p);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            m(recycler, position - 1);
            l(recycler, state, position2 + 1);
        }
        a0();
    }

    private int u() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    private float v(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return isHorizontal() ? r0.centerX() : r0.centerY();
    }

    private int w() {
        int i10;
        int i11;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.f25834r.f25848a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i10 + i11;
    }

    private KeylineState x(KeylineStateList keylineStateList) {
        return M() ? keylineStateList.h() : keylineStateList.k();
    }

    private KeylineState y(int i10) {
        KeylineState keylineState;
        Map map = this.f25833q;
        return (map == null || (keylineState = (KeylineState) map.get(Integer.valueOf(MathUtils.clamp(i10, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f25830n.g() : keylineState;
    }

    private int z() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    int B(int i10, KeylineState keylineState) {
        return J(i10, keylineState) - this.f25824h;
    }

    int C(int i10, boolean z10) {
        int iB = B(i10, this.f25830n.j(this.f25824h, this.f25825i, this.f25826j, true));
        int iB2 = this.f25833q != null ? B(i10, y(i10)) : iB;
        return (!z10 || Math.abs(iB2) >= Math.abs(iB)) ? iB : iB2;
    }

    boolean M() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f25830n == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f25830n.g().g() / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f25824h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.f25826j - this.f25825i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i10) {
        if (this.f25830n == null) {
            return null;
        }
        int iB = B(i10, y(i10));
        return isHorizontal() ? new PointF(iB, 0.0f) : new PointF(0.0f, iB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f25830n == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f25830n.g().g() / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.f25824h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.f25826j - this.f25825i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.f25838v;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        float fA = A(fCenterY, L(this.f25831o.h(), fCenterY, true));
        float fWidth = isHorizontal() ? (rect.width() - fA) / 2.0f : 0.0f;
        float fHeight = isHorizontal() ? 0.0f : (rect.height() - fA) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOrientation() {
        return this.f25834r.f25848a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.f25834r.f25848a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i10, int i11) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        KeylineStateList keylineStateList = this.f25830n;
        float fG = (keylineStateList == null || this.f25834r.f25848a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : keylineStateList.g().g();
        KeylineStateList keylineStateList2 = this.f25830n;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i12, (int) fG, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i13, (int) ((keylineStateList2 == null || this.f25834r.f25848a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : keylineStateList2.g().g()), canScrollVertically()));
    }

    public void notifyItemSizeChanged() {
        T();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f25829m.c(recyclerView.getContext());
        T();
        recyclerView.addOnLayoutChangeListener(this.f25835s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.f25835s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view, int i10, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            k(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        k(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        Z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        Z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        Z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0 || u() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.f25832p = 0;
            return;
        }
        boolean zM = M();
        KeylineStateList keylineStateList = this.f25830n;
        boolean z10 = keylineStateList == null;
        if (z10 || keylineStateList.g().a() != u()) {
            S(recycler);
        }
        int iS = s(this.f25830n);
        int iP = p(state, this.f25830n);
        this.f25825i = zM ? iP : iS;
        if (zM) {
            iP = iS;
        }
        this.f25826j = iP;
        if (z10) {
            this.f25824h = iS;
            this.f25833q = this.f25830n.i(getItemCount(), this.f25825i, this.f25826j, M());
            int i10 = this.f25837u;
            if (i10 != -1) {
                this.f25824h = J(i10, y(i10));
            }
        }
        int i11 = this.f25824h;
        this.f25824h = i11 + r(0, i11, this.f25825i, this.f25826j);
        this.f25832p = MathUtils.clamp(this.f25832p, 0, state.getItemCount());
        Y(this.f25830n);
        detachAndScrapAttachedViews(recycler);
        t(recycler, state);
        this.f25836t = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.f25832p = 0;
        } else {
            this.f25832p = getPosition(getChildAt(0));
        }
        a0();
    }

    int q(int i10) {
        return (int) (this.f25824h - J(i10, y(i10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
        int iK;
        if (this.f25830n == null || (iK = K(getPosition(view), y(getPosition(view)))) == 0) {
            return false;
        }
        V(recyclerView, K(getPosition(view), this.f25830n.getShiftedState(this.f25824h + r(iK, this.f25824h, this.f25825i, this.f25826j), this.f25825i, this.f25826j)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i10, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.f25837u = i10;
        if (this.f25830n == null) {
            return;
        }
        this.f25824h = J(i10, y(i10));
        this.f25832p = MathUtils.clamp(i10, 0, Math.max(0, getItemCount() - 1));
        Y(this.f25830n);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i10, recycler, state);
        }
        return 0;
    }

    public void setCarouselAlignment(int i10) {
        this.f25838v = i10;
        T();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.f25829m = carouselStrategy;
        T();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z10) {
        this.f25827k = z10;
        recyclerView.removeItemDecoration(this.f25828l);
        if (z10) {
            recyclerView.addItemDecoration(this.f25828l);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.f25834r;
        if (carouselOrientationHelper == null || i10 != carouselOrientationHelper.f25848a) {
            this.f25834r = CarouselOrientationHelper.b(this, i10);
            T();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDxToMakeVisible(View view, int i11) {
                if (CarouselLayoutManager.this.f25830n == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.q(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDyToMakeVisible(View view, int i11) {
                if (CarouselLayoutManager.this.f25830n == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.q(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            @Nullable
            public PointF computeScrollVectorForPosition(int i11) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i11);
            }
        };
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy, int i10) {
        this.f25827k = false;
        this.f25828l = new DebugItemDecoration();
        this.f25832p = 0;
        this.f25835s = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.b(this.f25904b, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f25837u = -1;
        this.f25838v = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f25827k = false;
        this.f25828l = new DebugItemDecoration();
        this.f25832p = 0;
        this.f25835s = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.b(this.f25904b, view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f25837u = -1;
        this.f25838v = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        W(context, attributeSet);
    }
}
