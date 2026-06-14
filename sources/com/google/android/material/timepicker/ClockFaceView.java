package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClockHandView f28128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f28129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RectF f28130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f28131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f28132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AccessibilityDelegateCompat f28133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f28134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float[] f28135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f28136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f28137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f28138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f28139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String[] f28140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f28141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ColorStateList f28142s;

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    private void k() {
        RectF currentSelectorBox = this.f28128e.getCurrentSelectorBox();
        TextView textViewN = n(currentSelectorBox);
        for (int i10 = 0; i10 < this.f28132i.size(); i10++) {
            TextView textView = (TextView) this.f28132i.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewN);
                textView.getPaint().setShader(m(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient m(RectF rectF, TextView textView) {
        textView.getHitRect(this.f28129f);
        this.f28130g.set(this.f28129f);
        textView.getLineBounds(0, this.f28131h);
        RectF rectF2 = this.f28130g;
        Rect rect = this.f28131h;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f28130g)) {
            return new RadialGradient(rectF.centerX() - this.f28130g.left, rectF.centerY() - this.f28130g.top, rectF.width() * 0.5f, this.f28134k, this.f28135l, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView n(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f28132i.size(); i10++) {
            TextView textView2 = (TextView) this.f28132i.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f28129f);
                this.f28130g.set(this.f28129f);
                this.f28130g.union(rectF);
                float fWidth = this.f28130g.width() * this.f28130g.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float o(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void q(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f28132i.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f28140q.length, size); i11++) {
            TextView textView = (TextView) this.f28132i.get(i11);
            if (i11 >= this.f28140q.length) {
                removeView(textView);
                this.f28132i.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.f28132i.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f28140q[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.f28133j);
                textView.setTextColor(this.f28142s);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f28140q[i11]));
                }
            }
        }
        this.f28128e.l(z10);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void e() {
        super.e();
        for (int i10 = 0; i10 < this.f28132i.size(); i10++) {
            ((TextView) this.f28132i.get(i10)).setVisibility(0);
        }
    }

    int l() {
        return this.f28128e.d();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f28140q.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iO = (int) (this.f28139p / o(this.f28137n / displayMetrics.heightPixels, this.f28138o / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iO, 1073741824);
        setMeasuredDimension(iO, iO);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f10, boolean z10) {
        if (Math.abs(this.f28141r - f10) > 0.001f) {
            this.f28141r = f10;
            k();
        }
    }

    void p(int i10) {
        this.f28128e.j(i10);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f10) {
        this.f28128e.setHandRotation(f10);
        k();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i10) {
        if (i10 != getRadius()) {
            super.setRadius(i10);
            this.f28128e.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, @StringRes int i10) {
        this.f28140q = strArr;
        q(i10);
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28129f = new Rect();
        this.f28130g = new RectF();
        this.f28131h = new Rect();
        this.f28132i = new SparseArray();
        this.f28135l = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.f28142s = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f28128e = clockHandView;
        this.f28136m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.f28134k = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f28128e.getSelectorRadius()) - ClockFaceView.this.f28136m);
                return true;
            }
        });
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.f28133j = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.f28132i.get(iIntValue - 1));
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
                if (i11 != 16) {
                    return super.performAccessibilityAction(view, i11, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.f28129f);
                float fCenterX = ClockFaceView.this.f28129f.centerX();
                float fCenterY = ClockFaceView.this.f28129f.centerY();
                ClockFaceView.this.f28128e.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                ClockFaceView.this.f28128e.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.f28137n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f28138o = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f28139p = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
