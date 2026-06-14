package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.R$dimen;
import com.yandex.div.R$id;
import com.yandex.div.R$style;
import com.yandex.div.R$styleable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseIndicatorTabLayout extends HorizontalScrollView {
    private static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final Pools.Pool<Tab> sTabPool = new Pools.SynchronizedPool(16);
    private long mAnimationDuration;
    private int mContentInsetEnd;
    private int mContentInsetStart;

    @Nullable
    private InputFocusTracker mInputFocusTracker;
    private final boolean mIsTabEllipsizeEnabled;
    private int mMode;
    private final NestedHorizontalScrollCompanion mNestedScrollCompanion;
    private OnTabSelectedListener mOnTabSelectedListener;
    private TabLayoutOnPageChangeListener mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private Tab mSelectedTab;
    private final OvalIndicators mTabIndicators;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private final int mTabScrollPadding;
    private final boolean mTabScrollPaddingEnabled;
    private int mTabTextAppearance;
    private boolean mTabTextBoldOnSelection;
    private ColorStateList mTabTextColors;
    private final TabTitleDelimitersController mTabTitleDelimitersController;

    @NonNull
    private final Pools.Pool<TabView> mTabViewPool;
    private final ArrayList<Tab> mTabs;
    private DivTypefaceProvider mTypefaceProvider;
    private ViewPager mViewPager;

    /* JADX INFO: renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType = iArr;
            try {
                iArr[AnimationType.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[AnimationType.SLIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AnimationType {
        SLIDE,
        FADE,
        NONE
    }

    public interface OnTabSelectedListener {
        void onTabReselected(Tab tab);

        void onTabSelected(Tab tab);

        void onTabUnselected(Tab tab);
    }

    static class OvalIndicators extends LinearLayout {
        private AnimationType mAnimationType;
        private final Path mClipPath;
        protected float[] mCornerRadii;
        private int mFutureSelectedPosition;
        private boolean mHasDelimiters;
        protected int mIndicatorHeight;
        private final Paint mIndicatorPaint;
        private final RectF mIndicatorRect;
        protected int[] mIndicatorsLeft;
        protected int[] mIndicatorsRight;
        protected int mItemSpacing;
        protected float mOffset;
        private float mOpacity;
        private final int mPaddingBottom;
        private final int mPaddingTop;
        protected int mSelectedColor;
        protected ValueAnimator mSelectedIndicatorAnimator;
        protected int mSelectedIndicatorLeft;
        protected int mSelectedIndicatorRight;
        protected int mSelectedPosition;
        private int mSize;
        protected int mUnselectedColor;

        /* synthetic */ OvalIndicators(Context context, int i10, int i11, AnonymousClass1 anonymousClass1) {
            this(context, i10, i11);
        }

        public static /* synthetic */ void a(OvalIndicators ovalIndicators, int i10, int i11, int i12, int i13, ValueAnimator valueAnimator) {
            ovalIndicators.getClass();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ovalIndicators.setSelectedIndicatorPosition(lerp(i10, i11, animatedFraction), lerp(i12, i13, animatedFraction));
            ViewCompat.postInvalidateOnAnimation(ovalIndicators);
        }

        public static /* synthetic */ void b(OvalIndicators ovalIndicators, ValueAnimator valueAnimator) {
            ovalIndicators.getClass();
            ovalIndicators.mOpacity = 1.0f - valueAnimator.getAnimatedFraction();
            ViewCompat.postInvalidateOnAnimation(ovalIndicators);
        }

        private static float clampCornerRadius(float f10, float f11, float f12) {
            if (f12 <= 0.0f || f11 <= 0.0f) {
                return 0.0f;
            }
            float fMin = Math.min(f12, f11) / 2.0f;
            if (f10 == -1.0f) {
                return fMin;
            }
            if (f10 > fMin) {
                Log.e("BaseIndicatorTabLayout", "Corner radius is too big");
            }
            return Math.min(f10, fMin);
        }

        private void drawRoundRect(Canvas canvas, int i10, int i11, float f10, int i12, float f11) {
            if (i10 < 0 || i11 <= i10) {
                return;
            }
            this.mIndicatorRect.set(i10, this.mPaddingTop, i11, f10 - this.mPaddingBottom);
            float fWidth = this.mIndicatorRect.width();
            float fHeight = this.mIndicatorRect.height();
            float[] fArr = new float[8];
            for (int i13 = 0; i13 < 8; i13++) {
                fArr[i13] = clampCornerRadius(this.mCornerRadii[i13], fWidth, fHeight);
            }
            this.mClipPath.reset();
            this.mClipPath.addRoundRect(this.mIndicatorRect, fArr, Path.Direction.CW);
            this.mClipPath.close();
            this.mIndicatorPaint.setColor(i12);
            this.mIndicatorPaint.setAlpha(Math.round(this.mIndicatorPaint.getAlpha() * f11));
            canvas.drawPath(this.mClipPath, this.mIndicatorPaint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTabPositionInLayout(int i10) {
            return (!this.mHasDelimiters || i10 == -1) ? i10 : i10 * 2;
        }

        private void initIndicatorArrays(int i10) {
            this.mSize = i10;
            this.mIndicatorsLeft = new int[i10];
            this.mIndicatorsRight = new int[i10];
            for (int i11 = 0; i11 < this.mSize; i11++) {
                this.mIndicatorsLeft[i11] = -1;
                this.mIndicatorsRight[i11] = -1;
            }
        }

        private static boolean isTransparentColor(@ColorInt int i10) {
            return (i10 >> 24) == 0;
        }

        private static int lerp(int i10, int i11, float f10) {
            return i10 + Math.round(f10 * (i11 - i10));
        }

        private ViewGroup.MarginLayoutParams setLeftMargin(ViewGroup.LayoutParams layoutParams, int i10) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i10;
            return marginLayoutParams;
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i10 < 0) {
                i10 = childCount;
            }
            if (i10 != 0) {
                super.addView(view, i10, setLeftMargin(layoutParams, this.mItemSpacing));
                return;
            }
            if (childCount != 0) {
                View childAt = getChildAt(0);
                updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
            }
            super.addView(view, i10, setLeftMargin(layoutParams, 0));
        }

        void animateSelectedIndicatorToPosition(int i10, long j10) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
                j10 = Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration());
            }
            long j11 = j10;
            View tab = getTab(i10);
            if (tab == null) {
                updateIndicatorsPosition();
                return;
            }
            int i11 = AnonymousClass1.$SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[this.mAnimationType.ordinal()];
            if (i11 == 1) {
                startSelectedIndicatorFadeAnimation(i10, j11);
            } else if (i11 != 2) {
                setSelectedIndicatorPositionFromTabPosition(i10, 0.0f);
            } else {
                startSelectedIndicatorSlideAnimation(i10, j11, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, tab.getLeft(), tab.getRight());
            }
        }

        boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            float height = getHeight();
            if (this.mUnselectedColor != -1) {
                int i10 = this.mSize;
                for (int i11 = 0; i11 < i10; i11++) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[i11], this.mIndicatorsRight[i11], height, this.mUnselectedColor, 1.0f);
                }
            }
            if (this.mSelectedColor != -1) {
                int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
                int tabPositionInLayout2 = getTabPositionInLayout(this.mFutureSelectedPosition);
                int i12 = AnonymousClass1.$SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[this.mAnimationType.ordinal()];
                if (i12 == 1) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, this.mOpacity);
                    if (this.mFutureSelectedPosition != -1) {
                        drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout2], this.mIndicatorsRight[tabPositionInLayout2], height, this.mSelectedColor, 1.0f - this.mOpacity);
                    }
                } else if (i12 != 2) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, 1.0f);
                } else {
                    drawRoundRect(canvas, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, height, this.mSelectedColor, 1.0f);
                }
            }
            super.draw(canvas);
        }

        View getTab(int i10) {
            return getChildAt(getTabPositionInLayout(i10));
        }

        boolean hasDelimiters() {
            return this.mHasDelimiters;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            updateIndicatorsPosition();
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.mSelectedIndicatorAnimator.cancel();
            animateSelectedIndicatorToPosition(this.mFutureSelectedPosition, Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration()));
        }

        void setAnimationType(AnimationType animationType) {
            if (this.mAnimationType != animationType) {
                this.mAnimationType = animationType;
                ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.mSelectedIndicatorAnimator.cancel();
            }
        }

        void setContainsDelimiters(boolean z10) {
            if (this.mHasDelimiters != z10) {
                this.mHasDelimiters = z10;
                updateOpacity();
                updateIndicatorsPosition();
            }
        }

        void setIndicatorColor(@ColorInt int i10) {
            if (this.mUnselectedColor != i10) {
                if (isTransparentColor(i10)) {
                    this.mUnselectedColor = -1;
                } else {
                    this.mUnselectedColor = i10;
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void setIndicatorCornersRadii(@NonNull float[] fArr) {
            if (Arrays.equals(this.mCornerRadii, fArr)) {
                return;
            }
            this.mCornerRadii = fArr;
            ViewCompat.postInvalidateOnAnimation(this);
        }

        void setIndicatorHeight(int i10) {
            if (this.mIndicatorHeight != i10) {
                this.mIndicatorHeight = i10;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void setItemSpacing(int i10) {
            if (i10 != this.mItemSpacing) {
                this.mItemSpacing = i10;
                int childCount = getChildCount();
                for (int i11 = 1; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
                }
            }
        }

        void setSelectedIndicatorColor(@ColorInt int i10) {
            if (this.mSelectedColor != i10) {
                if (isTransparentColor(i10)) {
                    this.mSelectedColor = -1;
                } else {
                    this.mSelectedColor = i10;
                }
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        protected void setSelectedIndicatorPosition(int i10, int i11) {
            if (i10 == this.mSelectedIndicatorLeft && i11 == this.mSelectedIndicatorRight) {
                return;
            }
            this.mSelectedIndicatorLeft = i10;
            this.mSelectedIndicatorRight = i11;
            ViewCompat.postInvalidateOnAnimation(this);
        }

        void setSelectedIndicatorPositionFromTabPosition(int i10, float f10) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i10;
            this.mOffset = f10;
            updateIndicatorsPosition();
            updateOpacity();
        }

        protected void setUnselectedIndicatorPosition(int i10, int i11, int i12) {
            int[] iArr = this.mIndicatorsLeft;
            int i13 = iArr[i10];
            int[] iArr2 = this.mIndicatorsRight;
            int i14 = iArr2[i10];
            if (i11 == i13 && i12 == i14) {
                return;
            }
            iArr[i10] = i11;
            iArr2[i10] = i12;
            ViewCompat.postInvalidateOnAnimation(this);
        }

        protected void startSelectedIndicatorFadeAnimation(int i10, long j10) {
            if (i10 != this.mSelectedPosition) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
                valueAnimatorOfFloat.setDuration(j10);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.i
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.OvalIndicators.b(this.f68163b, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.2
                    private boolean mHasCancel = false;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.mHasCancel = true;
                        OvalIndicators.this.mOpacity = 1.0f;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (this.mHasCancel) {
                            return;
                        }
                        OvalIndicators ovalIndicators = OvalIndicators.this;
                        ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                        OvalIndicators.this.mOffset = 0.0f;
                    }
                });
                this.mFutureSelectedPosition = i10;
                this.mSelectedIndicatorAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
            }
        }

        protected void startSelectedIndicatorSlideAnimation(int i10, long j10, final int i11, final int i12, final int i13, final int i14) {
            if (i11 == i13 && i12 == i14) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
            valueAnimatorOfFloat.setDuration(j10);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.h
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseIndicatorTabLayout.OvalIndicators.a(this.f68158b, i11, i13, i12, i14, valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.1
                private boolean mHasCancel = false;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.mHasCancel = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.mHasCancel) {
                        return;
                    }
                    OvalIndicators ovalIndicators = OvalIndicators.this;
                    ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                    OvalIndicators.this.mOffset = 0.0f;
                }
            });
            this.mFutureSelectedPosition = i10;
            this.mSelectedIndicatorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }

        protected void updateIndicatorsPosition() {
            int i10;
            int right;
            int i11;
            int i12;
            int childCount = getChildCount();
            if (childCount != this.mSize) {
                initIndicatorArrays(childCount);
            }
            int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TabView) {
                    if (childAt.getWidth() > 0) {
                        int left = childAt.getLeft();
                        right = childAt.getRight();
                        if (this.mAnimationType != AnimationType.SLIDE || i13 != tabPositionInLayout || this.mOffset <= 0.0f || i13 >= childCount - 1) {
                            i11 = left;
                            i12 = i11;
                            i10 = right;
                        } else {
                            View childAt2 = getChildAt(this.mHasDelimiters ? i13 + 2 : i13 + 1);
                            float left2 = this.mOffset * childAt2.getLeft();
                            float f10 = this.mOffset;
                            i12 = (int) (left2 + ((1.0f - f10) * left));
                            int right2 = (int) ((f10 * childAt2.getRight()) + ((1.0f - this.mOffset) * right));
                            i11 = left;
                            i10 = right2;
                        }
                    } else {
                        i10 = -1;
                        right = -1;
                        i11 = -1;
                        i12 = -1;
                    }
                    setUnselectedIndicatorPosition(i13, i11, right);
                    if (i13 == tabPositionInLayout) {
                        setSelectedIndicatorPosition(i12, i10);
                    }
                }
            }
        }

        protected void updateOpacity() {
            float f10 = 1.0f - this.mOffset;
            if (f10 != this.mOpacity) {
                this.mOpacity = f10;
                int i10 = this.mSelectedPosition + 1;
                if (i10 >= this.mSize) {
                    i10 = -1;
                }
                this.mFutureSelectedPosition = i10;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        private OvalIndicators(Context context, int i10, int i11) {
            super(context);
            this.mSelectedColor = -1;
            this.mUnselectedColor = -1;
            this.mSelectedPosition = -1;
            this.mItemSpacing = 0;
            this.mSelectedIndicatorLeft = -1;
            this.mSelectedIndicatorRight = -1;
            this.mOpacity = 1.0f;
            this.mFutureSelectedPosition = -1;
            this.mAnimationType = AnimationType.SLIDE;
            setId(R$id.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.mSize = childCount;
            if (this.mHasDelimiters) {
                this.mSize = (childCount + 1) / 2;
            }
            initIndicatorArrays(this.mSize);
            Paint paint = new Paint();
            this.mIndicatorPaint = paint;
            paint.setAntiAlias(true);
            this.mIndicatorRect = new RectF();
            this.mPaddingTop = i10;
            this.mPaddingBottom = i11;
            this.mClipPath = new Path();
            this.mCornerRadii = new float[8];
        }
    }

    private class PagerAdapterObserver extends DataSetObserver {
        private PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        /* synthetic */ PagerAdapterObserver(BaseIndicatorTabLayout baseIndicatorTabLayout, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static final class Tab {
        private BaseIndicatorTabLayout mParent;
        private int mPosition;

        @Nullable
        private CharSequence mText;
        private TabView mView;

        /* synthetic */ Tab(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mParent = null;
            this.mView = null;
            this.mText = null;
            this.mPosition = -1;
        }

        private void updateView() {
            TabView tabView = this.mView;
            if (tabView != null) {
                tabView.update();
            }
        }

        public int getPosition() {
            return this.mPosition;
        }

        @Nullable
        public TabView getTabView() {
            return this.mView;
        }

        @Nullable
        public CharSequence getText() {
            return this.mText;
        }

        public void select() {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mParent;
            if (baseIndicatorTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            baseIndicatorTabLayout.selectTab(this);
        }

        void setPosition(int i10) {
            this.mPosition = i10;
        }

        @NonNull
        public Tab setText(@Nullable CharSequence charSequence) {
            this.mText = charSequence;
            updateView();
            return this;
        }

        private Tab() {
            this.mPosition = -1;
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {
        private int mPreviousScrollState;
        private int mScrollState;
        private final WeakReference<BaseIndicatorTabLayout> mTabLayoutRef;

        TabLayoutOnPageChangeListener(BaseIndicatorTabLayout baseIndicatorTabLayout) {
            this.mTabLayoutRef = new WeakReference<>(baseIndicatorTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            this.mPreviousScrollState = this.mScrollState;
            this.mScrollState = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mTabLayoutRef.get();
            if (baseIndicatorTabLayout != null) {
                if (this.mScrollState != 2 || this.mPreviousScrollState == 1) {
                    baseIndicatorTabLayout.setScrollPosition(i10, f10, true, true);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mTabLayoutRef.get();
            if (baseIndicatorTabLayout == null || baseIndicatorTabLayout.getSelectedTabPosition() == i10) {
                return;
            }
            int i11 = this.mScrollState;
            baseIndicatorTabLayout.selectTab(baseIndicatorTabLayout.getTabAt(i10), i11 == 0 || (i11 == 2 && this.mPreviousScrollState == 0));
        }

        public void reset() {
            this.mScrollState = 0;
            this.mPreviousScrollState = 0;
        }
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager mViewPager;

        ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.mViewPager = viewPager;
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabSelected(Tab tab) {
            this.mViewPager.setCurrentItem(tab.getPosition());
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    @SuppressLint({"PrivateResource"})
    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mTabs = new ArrayList<>();
        this.mAnimationDuration = 300L;
        this.mTypefaceProvider = DivTypefaceProvider.DEFAULT;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mNestedScrollCompanion = new NestedHorizontalScrollCompanion(this);
        this.mTabViewPool = new Pools.SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i10, R$style.Div_Tabs_IndicatorTabLayout);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorTabLayout, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabIndicatorPaddingTop, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabIndicatorPaddingBottom, 0);
        this.mTabTextBoldOnSelection = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabTextBoldOnSelection, false);
        this.mContentInsetEnd = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabContentEnd, 0);
        this.mIsTabEllipsizeEnabled = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabEllipsizeEnabled, true);
        this.mTabScrollPaddingEnabled = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabScrollPaddingEnabled, false);
        this.mTabScrollPadding = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabScrollPadding, 0);
        typedArrayObtainStyledAttributes2.recycle();
        OvalIndicators ovalIndicators = new OvalIndicators(context, dimensionPixelSize, dimensionPixelSize2, null);
        this.mTabIndicators = ovalIndicators;
        super.addView(ovalIndicators, 0, new FrameLayout.LayoutParams(-2, -1));
        ovalIndicators.setIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0));
        ovalIndicators.setSelectedIndicatorColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        ovalIndicators.setIndicatorColor(typedArrayObtainStyledAttributes.getColor(R$styleable.TabLayout_tabBackground, 0));
        this.mTabTitleDelimitersController = new TabTitleDelimitersController(getContext(), ovalIndicators);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize3;
        this.mTabPaddingEnd = dimensionPixelSize3;
        this.mTabPaddingTop = dimensionPixelSize3;
        this.mTabPaddingStart = dimensionPixelSize3;
        this.mTabPaddingStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize3);
        this.mTabPaddingTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.Div_Tabs_IndicatorTabLayout_Text);
        this.mTabTextAppearance = resourceId;
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, R.styleable.TextAppearance);
        try {
            this.mTabTextColors = typedArrayObtainStyledAttributes3.getColorStateList(R.styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes3.recycle();
            int i11 = R$styleable.TabLayout_tabTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i11)) {
                this.mTabTextColors = typedArrayObtainStyledAttributes.getColorStateList(i11);
            }
            int i12 = R$styleable.TabLayout_tabSelectedTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), typedArrayObtainStyledAttributes.getColor(i12, 0));
            }
            this.mRequestedTabMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.mRequestedTabMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.mContentInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.mMode = typedArrayObtainStyledAttributes.getInt(R$styleable.TabLayout_tabMode, 1);
            typedArrayObtainStyledAttributes.recycle();
            this.mScrollableTabMinWidth = getResources().getDimensionPixelSize(R$dimen.tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes3.recycle();
            throw th2;
        }
    }

    public static /* synthetic */ void a(BaseIndicatorTabLayout baseIndicatorTabLayout, ValueAnimator valueAnimator) {
        baseIndicatorTabLayout.getClass();
        baseIndicatorTabLayout.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    private void addTabView(Tab tab, boolean z10) {
        TabView tabView = tab.mView;
        this.mTabIndicators.addView(tabView, createLayoutParamsForTabs());
        this.mTabTitleDelimitersController.tabAdded(this.mTabIndicators.getChildCount() - 1);
        if (z10) {
            tabView.setSelected(true);
        }
    }

    private void addViewInternal(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewsKt.isActuallyLaidOut(this) || this.mTabIndicators.childrenNeedLayout()) {
            setScrollPosition(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iCalculateScrollXForTab = calculateScrollXForTab(i10, 0.0f);
        if (scrollX != iCalculateScrollXForTab) {
            if (this.mScrollAnimator == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(new int[0]);
                this.mScrollAnimator = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(FAST_OUT_SLOW_IN_INTERPOLATOR);
                this.mScrollAnimator.setDuration(this.mAnimationDuration);
                this.mScrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.e
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.a(this.f68155b, valueAnimator);
                    }
                });
            }
            this.mScrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
            this.mScrollAnimator.start();
        }
        this.mTabIndicators.animateSelectedIndicatorToPosition(i10, this.mAnimationDuration);
    }

    private void applyModeAndGravity() {
        int iMax;
        int iMax2;
        if (this.mMode == 0) {
            iMax = Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
            iMax2 = Math.max(0, this.mContentInsetEnd - this.mTabPaddingEnd);
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        ViewCompat.setPaddingRelative(this.mTabIndicators, iMax, 0, iMax2, 0);
        if (this.mMode != 1) {
            this.mTabIndicators.setGravity(GravityCompat.START);
        } else {
            this.mTabIndicators.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i10, float f10) {
        View tab;
        int left;
        int width;
        if (this.mMode != 0 || (tab = this.mTabIndicators.getTab(i10)) == null) {
            return 0;
        }
        int width2 = tab.getWidth();
        if (this.mTabScrollPaddingEnabled) {
            left = tab.getLeft();
            width = this.mTabScrollPadding;
        } else {
            int i11 = i10 + 1;
            left = tab.getLeft() + ((int) ((width2 + ((i11 < this.mTabIndicators.getChildCount() ? this.mTabIndicators.getChildAt(i11) : null) != null ? r5.getWidth() : 0)) * f10 * 0.5f)) + (tab.getWidth() / 2);
            width = getWidth() / 2;
        }
        return left - width;
    }

    private void configureTab(Tab tab, int i10) {
        tab.setPosition(i10);
        this.mTabs.add(i10, tab);
        int size = this.mTabs.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            } else {
                this.mTabs.get(i10).setPosition(i10);
            }
        }
    }

    private void configureTabView(@NonNull TabView tabView) {
        tabView.setTabPadding(this.mTabPaddingStart, this.mTabPaddingTop, this.mTabPaddingEnd, this.mTabPaddingBottom);
        tabView.setTextTypeface(this.mTypefaceProvider, this.mTabTextAppearance);
        tabView.setInputFocusTracker(this.mInputFocusTracker);
        tabView.setTextColorList(this.mTabTextColors);
        tabView.setBoldTextOnSelection(this.mTabTextBoldOnSelection);
        tabView.setEllipsizeEnabled(this.mIsTabEllipsizeEnabled);
        tabView.setMaxWidthProvider(new TabView.MaxWidthProvider() { // from class: com.yandex.div.internal.widget.tabs.f
            @Override // com.yandex.div.internal.widget.tabs.TabView.MaxWidthProvider
            public final int getMaxWidth() {
                return this.f68156a.getTabMaxWidth();
            }
        });
        tabView.setOnUpdateListener(new TabView.OnUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.g
            @Override // com.yandex.div.internal.widget.tabs.TabView.OnUpdateListener
            public final void onUpdated(TabView tabView2) {
                this.f68157a.onTabViewUpdated(tabView2);
            }
        });
    }

    private static ColorStateList createColorStateList(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.mTabMaxWidth;
    }

    private int getTabMinWidth() {
        int i10 = this.mRequestedTabMinWidth;
        if (i10 != -1) {
            return i10;
        }
        if (this.mMode == 0) {
            return this.mScrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.mTabIndicators.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private TabView getTabView(@NonNull Tab tab) {
        TabView tabViewAcquire = this.mTabViewPool.acquire();
        if (tabViewAcquire == null) {
            tabViewAcquire = createTabView(getContext());
            configureTabView(tabViewAcquire);
            onTabViewCreated(tabViewAcquire);
        }
        tabViewAcquire.setTab(tab);
        tabViewAcquire.setFocusable(true);
        tabViewAcquire.setMinimumWidth(getTabMinWidth());
        return tabViewAcquire;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.mPagerAdapter;
        if (pagerAdapter == null) {
            removeAllTabs();
            return;
        }
        int count = pagerAdapter.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            addTab(newTab().setText(this.mPagerAdapter.getPageTitle(i10)), false);
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        selectTab(getTabAt(currentItem));
    }

    private void removeTabViewAt(int i10) {
        TabView tabView = (TabView) this.mTabIndicators.getChildAt(i10);
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i10);
        this.mTabIndicators.removeViewAt(tabPositionInLayout);
        this.mTabTitleDelimitersController.tabRemoved(tabPositionInLayout);
        if (tabView != null) {
            tabView.reset();
            this.mTabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void setPagerAdapter(@Nullable PagerAdapter pagerAdapter, boolean z10) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.mPagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = pagerAdapter;
        if (z10 && pagerAdapter != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new PagerAdapterObserver(this, null);
            }
            pagerAdapter.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private void setScrollToSelectedTab() {
        int position;
        Tab tab = this.mSelectedTab;
        if (tab == null || (position = tab.getPosition()) == -1) {
            return;
        }
        setScrollPosition(position, 0.0f, true);
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.mTabIndicators.getChildCount();
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i10);
        if (tabPositionInLayout >= childCount || this.mTabIndicators.getChildAt(tabPositionInLayout).isSelected()) {
            return;
        }
        int i11 = 0;
        while (i11 < childCount) {
            this.mTabIndicators.getChildAt(i11).setSelected(i11 == tabPositionInLayout);
            i11++;
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void updateTabViews(boolean z10) {
        for (int i10 = 0; i10 < this.mTabIndicators.getChildCount(); i10++) {
            View childAt = this.mTabIndicators.getChildAt(i10);
            if (childAt instanceof TabView) {
                childAt.setMinimumWidth(getTabMinWidth());
                updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
                if (z10) {
                    childAt.requestLayout();
                }
            }
        }
    }

    public void addTab(@NonNull Tab tab, boolean z10) {
        if (tab.mParent != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        addTabView(tab, z10);
        configureTab(tab, this.mTabs.size());
        if (z10) {
            tab.select();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    @NonNull
    @MainThread
    public void bindTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        this.mTypefaceProvider = divTypefaceProvider;
    }

    protected abstract TabView createTabView(@NonNull Context context);

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.mNestedScrollCompanion.dispatchTouchEventAfterSuperCall(motionEvent);
        return zDispatchTouchEvent;
    }

    @NonNull
    public TabLayoutOnPageChangeListener getPageChangeListener() {
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
        }
        return this.mPageChangeListener;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.mSelectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    @ColorInt
    public int getSelectedTabTextColor() {
        return this.mTabTextColors.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    @Nullable
    public Tab getTabAt(int i10) {
        return this.mTabs.get(i10);
    }

    public int getTabCount() {
        return this.mTabs.size();
    }

    public int getTabMode() {
        return this.mMode;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.mTabTextColors;
    }

    @NonNull
    public Tab newTab() {
        Tab tabAcquire = sTabPool.acquire();
        if (tabAcquire == null) {
            tabAcquire = new Tab(null);
        }
        tabAcquire.mParent = this;
        tabAcquire.mView = getTabView(tabAcquire);
        return tabAcquire;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"SwitchIntDef"})
    protected void onMeasure(int i10, int i11) {
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(44, getResources().getDisplayMetrics()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(iDpToPx, View.MeasureSpec.getSize(i11)), 1073741824);
        } else if (mode == 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(iDpToPx, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iDpToPx2 = this.mRequestedTabMaxWidth;
            if (iDpToPx2 <= 0) {
                iDpToPx2 = size - BaseDivViewExtensionsKt.dpToPx(56, getResources().getDisplayMetrics());
            }
            this.mTabMaxWidth = iDpToPx2;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.mMode != 1) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.onOverScrolled(i10, i11, z10, z11);
        this.mNestedScrollCompanion.dispatchOnOverScrolled(z10);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        this.mNestedScrollCompanion.dispatchOnScrollChanged();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i12 == 0 || i12 == i10) {
            return;
        }
        setScrollToSelectedTab();
    }

    protected void onTabViewCreated(@NonNull TextView textView) {
    }

    protected void onTabViewUpdated(@NonNull TextView textView) {
    }

    public void removeAllTabs() {
        for (int size = this.mTabs.size() - 1; size >= 0; size--) {
            removeTabViewAt(size);
        }
        Iterator<Tab> it = this.mTabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            sTabPool.release(next);
        }
        this.mSelectedTab = null;
    }

    void selectTab(Tab tab) {
        selectTab(tab, true);
    }

    public void setAnimationDuration(long j10) {
        this.mAnimationDuration = j10;
    }

    public void setAnimationType(AnimationType animationType) {
        this.mTabIndicators.setAnimationType(animationType);
    }

    public void setFocusTracker(InputFocusTracker inputFocusTracker) {
        this.mInputFocusTracker = inputFocusTracker;
    }

    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        this.mOnTabSelectedListener = onTabSelectedListener;
    }

    public void setScrollPosition(int i10, float f10, boolean z10) {
        setScrollPosition(i10, f10, z10, true);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i10) {
        this.mTabIndicators.setSelectedIndicatorColor(i10);
    }

    public void setTabBackgroundColor(@ColorInt int i10) {
        this.mTabIndicators.setIndicatorColor(i10);
    }

    public void setTabDelimiter(Bitmap bitmap, int i10, int i11) {
        this.mTabTitleDelimitersController.updateTitleDelimiters(bitmap, i10, i11);
    }

    public void setTabIndicatorCornersRadii(@NonNull float[] fArr) {
        this.mTabIndicators.setIndicatorCornersRadii(fArr);
    }

    public void setTabIndicatorHeight(int i10) {
        this.mTabIndicators.setIndicatorHeight(i10);
    }

    public void setTabItemSpacing(int i10) {
        this.mTabIndicators.setItemSpacing(i10);
    }

    public void setTabMode(int i10) {
        if (i10 != this.mMode) {
            this.mMode = i10;
            applyModeAndGravity();
        }
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            int size = this.mTabs.size();
            for (int i10 = 0; i10 < size; i10++) {
                TabView tabView = this.mTabs.get(i10).getTabView();
                if (tabView != null) {
                    tabView.setTextColorList(this.mTabTextColors);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z10) {
        for (int i10 = 0; i10 < this.mTabs.size(); i10++) {
            this.mTabs.get(i10).mView.setEnabled(z10);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener;
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (tabLayoutOnPageChangeListener = this.mPageChangeListener) != null) {
            viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
        }
        if (viewPager == null) {
            this.mViewPager = null;
            setOnTabSelectedListener(null);
            setPagerAdapter(null, true);
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.mViewPager = viewPager;
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
        }
        this.mPageChangeListener.reset();
        viewPager.addOnPageChangeListener(this.mPageChangeListener);
        setOnTabSelectedListener(new ViewPagerOnTabSelectedListener(viewPager));
        setPagerAdapter(adapter, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollPosition(int i10, float f10, boolean z10, boolean z11) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.mTabIndicators.getChildCount()) {
            return;
        }
        if (z11) {
            this.mTabIndicators.setSelectedIndicatorPositionFromTabPosition(i10, f10);
        }
        ValueAnimator valueAnimator = this.mScrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mScrollAnimator.cancel();
        }
        scrollTo(calculateScrollXForTab(i10, f10), 0);
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void selectTab(int i10) {
        Tab tabAt;
        if (getSelectedTabPosition() == i10 || (tabAt = getTabAt(i10)) == null) {
            return;
        }
        tabAt.select();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    void selectTab(Tab tab, boolean z10) {
        OnTabSelectedListener onTabSelectedListener;
        OnTabSelectedListener onTabSelectedListener2;
        Tab tab2 = this.mSelectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                OnTabSelectedListener onTabSelectedListener3 = this.mOnTabSelectedListener;
                if (onTabSelectedListener3 != null) {
                    onTabSelectedListener3.onTabReselected(tab2);
                }
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        if (z10) {
            int position = tab != null ? tab.getPosition() : -1;
            if (position != -1) {
                setSelectedTabView(position);
            }
            Tab tab3 = this.mSelectedTab;
            if ((tab3 == null || tab3.getPosition() == -1) && position != -1) {
                setScrollPosition(position, 0.0f, true);
            } else {
                animateToTab(position);
            }
        }
        Tab tab4 = this.mSelectedTab;
        if (tab4 != null && (onTabSelectedListener2 = this.mOnTabSelectedListener) != null) {
            onTabSelectedListener2.onTabUnselected(tab4);
        }
        this.mSelectedTab = tab;
        if (tab == null || (onTabSelectedListener = this.mOnTabSelectedListener) == null) {
            return;
        }
        onTabSelectedListener.onTabSelected(tab);
    }

    public void setTabTextColors(int i10, int i11) {
        setTabTextColors(createColorStateList(i10, i11));
    }
}
