package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final String X0 = "BaseSlider";
    static final int Y0 = R.style.Widget_MaterialComponents_Slider;
    private static final int Z0 = R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final int f27692a1 = R.attr.motionDurationShort3;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final int f27693b1 = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int f27694c1 = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    private int A;
    private ColorStateList A0;
    private int B;
    private ColorStateList B0;
    private int C;
    private ColorStateList C0;
    private int D;
    private ColorStateList D0;
    private int E;
    private final Path E0;
    private int F;
    private final RectF F0;
    private int G;
    private final RectF G0;
    private int H;
    private final RectF H0;
    private int I;
    private final RectF I0;
    private int J;
    private final Rect J0;
    private int K;
    private final RectF K0;
    private int L;
    private final Rect L0;
    private int M;
    private final Matrix M0;
    private int N;
    private final MaterialShapeDrawable N0;
    private int O;
    private Drawable O0;
    private boolean P;
    private List P0;
    private Drawable Q;
    private float Q0;
    private boolean R;
    private int R0;
    private Drawable S;
    private final int S0;
    private boolean T;
    private final ViewTreeObserver.OnScrollChangedListener T0;
    private ColorStateList U;
    private final ViewTreeObserver.OnGlobalLayoutListener U0;
    private Drawable V;
    private final Runnable V0;
    private boolean W;
    private boolean W0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Drawable f27695a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f27696b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f27697b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f27698c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f27699c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f27700d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f27701d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f27702e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f27703e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f27704f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f27705f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f27706g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f27707g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f27708h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f27709h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AccessibilityHelper f27710i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private MotionEvent f27711i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AccessibilityManager f27712j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private LabelFormatter f27713j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AccessibilityEventSender f27714k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f27715k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27716l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f27717l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f27718m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f27719m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f27720n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private ArrayList f27721n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f27722o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f27723o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f27724p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f27725p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f27726q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f27727q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f27728r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float[] f27729r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f27730s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f27731s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27732t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f27733t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27734u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f27735u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27736v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f27737v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27738w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f27739w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27740x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f27741x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27742y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f27743y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f27744z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ColorStateList f27745z0;

    private class AccessibilityEventSender implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27747b;

        private AccessibilityEventSender() {
            this.f27747b = -1;
        }

        void a(int i10) {
            this.f27747b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f27710i.sendEventForVirtualView(this.f27747b, 4);
        }
    }

    public static class AccessibilityHelper extends ExploreByTouchHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BaseSlider f27749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f27750b;

        AccessibilityHelper(BaseSlider baseSlider) {
            super(baseSlider);
            this.f27750b = new Rect();
            this.f27749a = baseSlider;
        }

        private String startOrEndDescription(int i10) {
            return i10 == this.f27749a.getValues().size() + (-1) ? this.f27749a.getContext().getString(R.string.material_slider_range_end) : i10 == 0 ? this.f27749a.getContext().getString(R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float f10, float f11) {
            for (int i10 = 0; i10 < this.f27749a.getValues().size(); i10++) {
                this.f27749a.O0(i10, this.f27750b);
                if (this.f27750b.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(List list) {
            for (int i10 = 0; i10 < this.f27749a.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            if (!this.f27749a.isEnabled()) {
                return false;
            }
            if (i11 != 4096 && i11 != 8192) {
                if (i11 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                    if (this.f27749a.M0(i10, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                        this.f27749a.P0();
                        this.f27749a.postInvalidate();
                        invalidateVirtualView(i10);
                        return true;
                    }
                }
                return false;
            }
            float fU = this.f27749a.u(20);
            if (i11 == 8192) {
                fU = -fU;
            }
            if (this.f27749a.n0()) {
                fU = -fU;
            }
            if (!this.f27749a.M0(i10, MathUtils.clamp(this.f27749a.getValues().get(i10).floatValue() + fU, this.f27749a.getValueFrom(), this.f27749a.getValueTo()))) {
                return false;
            }
            this.f27749a.setActiveThumbIndex(i10);
            this.f27749a.scheduleTooltipTimeout();
            this.f27749a.P0();
            this.f27749a.postInvalidate();
            invalidateVirtualView(i10);
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.f27749a.getValues();
            Float f10 = values.get(i10);
            float fFloatValue = f10.floatValue();
            float valueFrom = this.f27749a.getValueFrom();
            float valueTo = this.f27749a.getValueTo();
            if (this.f27749a.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (fFloatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(BaseSlider.X0, String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", f10, Float.valueOf(valueFrom), Float.valueOf(valueTo)));
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, fFloatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f27749a.getContentDescription() != null) {
                sb2.append(this.f27749a.getContentDescription());
                sb2.append(StringUtils.COMMA);
            }
            String strQ = this.f27749a.Q(fFloatValue);
            String string = this.f27749a.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i10);
            }
            CharSequence stateDescription = ViewCompat.getStateDescription(this.f27749a);
            if (TextUtils.isEmpty(stateDescription)) {
                sb2.append(String.format(Locale.getDefault(), "%s, %s", string, strQ));
            } else {
                accessibilityNodeInfoCompat.setStateDescription(stateDescription);
            }
            accessibilityNodeInfoCompat.setContentDescription(sb2.toString());
            this.f27749a.O0(i10, this.f27750b);
            accessibilityNodeInfoCompat.setBoundsInParent(this.f27750b);
        }
    }

    private enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f27752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f27753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f27754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f27755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f27756f;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f27752b);
            parcel.writeFloat(this.f27753c);
            parcel.writeList(this.f27754d);
            parcel.writeFloat(this.f27755e);
            parcel.writeBooleanArray(new boolean[]{this.f27756f});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.f27752b = parcel.readFloat();
            this.f27753c = parcel.readFloat();
            ArrayList arrayList = new ArrayList();
            this.f27754d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f27755e = parcel.readFloat();
            this.f27756f = parcel.createBooleanArray()[0];
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private void A(TooltipDrawable tooltipDrawable) {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return;
        }
        contentView.getOverlay().remove(tooltipDrawable);
        tooltipDrawable.detachView(contentView);
    }

    private void A0() {
        Iterator it = this.f27722o.iterator();
        while (it.hasNext()) {
            ((BaseOnSliderTouchListener) it.next()).onStartTrackingTouch(this);
        }
    }

    private float B(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - this.F) / this.f27737v0;
        float f12 = this.f27717l0;
        return (f11 * (f12 - this.f27719m0)) + f12;
    }

    private void B0() {
        Iterator it = this.f27722o.iterator();
        while (it.hasNext()) {
            ((BaseOnSliderTouchListener) it.next()).onStopTrackingTouch(this);
        }
    }

    private void C(int i10) {
        Iterator it = this.f27720n.iterator();
        while (it.hasNext()) {
            ((BaseOnChangeListener) it.next()).onValueChange(this, ((Float) this.f27721n0.get(i10)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f27712j;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        F0(i10);
    }

    private void D() {
        for (BaseOnChangeListener baseOnChangeListener : this.f27720n) {
            Iterator it = this.f27721n0.iterator();
            while (it.hasNext()) {
                baseOnChangeListener.onValueChange(this, ((Float) it.next()).floatValue(), false);
            }
        }
    }

    private void D0(TooltipDrawable tooltipDrawable, float f10) {
        r(tooltipDrawable, f10);
        if (isVertical()) {
            RectF rectF = new RectF(this.J0);
            this.M0.mapRect(rectF);
            rectF.round(this.J0);
        }
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, this.J0);
        tooltipDrawable.setBounds(this.J0);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void E(android.graphics.Canvas r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.E(android.graphics.Canvas, int, int):void");
    }

    private void E0(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i10, Y0, new int[0]);
        setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_android_orientation, 0));
        this.f27716l = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.f27717l0 = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.f27719m0 = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f27717l0));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_centered, false));
        this.f27727q0 = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.f27744z = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, MaterialAttributes.resolveMinimumAccessibleTouchTarget(context)));
        int i11 = R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        int i12 = zHasValue ? i11 : R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i11 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i12);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i11);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.N0.setFillColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_thumbColor));
        int i13 = R.styleable.Slider_thumbStrokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i13));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        int i14 = R.styleable.Slider_tickVisibilityMode;
        this.f27731s0 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getInt(i14, -1) : x(typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true));
        int i15 = R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i15);
        int i16 = zHasValue2 ? i15 : R.styleable.Slider_tickColorInactive;
        if (!zHasValue2) {
            i15 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i16);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i15);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.M / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.M / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void F(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF, FullCornerDirection fullCornerDirection) {
        if (f11 - f10 > getTrackCornerSize() - this.J) {
            rectF.set(f10, f12, f11, f13);
        } else {
            rectF.setEmpty();
        }
        W0(canvas, this.f27696b, rectF, getTrackCornerSize(), fullCornerDirection);
    }

    private void F0(int i10) {
        AccessibilityEventSender accessibilityEventSender = this.f27714k;
        if (accessibilityEventSender == null) {
            this.f27714k = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.f27714k.a(i10);
        postDelayed(this.f27714k, 200L);
    }

    private void G(Canvas canvas, int i10, int i11) {
        float[] fArrR = R();
        float f10 = i11;
        int i12 = this.E;
        float f11 = f10 - (i12 / 2.0f);
        float f12 = f10 + (i12 / 2.0f);
        float f13 = i10;
        F(this.F - getTrackCornerSize(), (this.F + (fArrR[0] * f13)) - this.J, f11, f12, canvas, this.G0, FullCornerDirection.LEFT);
        F(this.F + (fArrR[1] * f13) + this.J, r13 + i10 + getTrackCornerSize(), f11, f12, canvas, this.H0, FullCornerDirection.RIGHT);
    }

    private void G0(TooltipDrawable tooltipDrawable, float f10) {
        tooltipDrawable.setText(Q(f10));
        D0(tooltipDrawable, f10);
        ViewOverlay viewOverlayV = V();
        if (viewOverlayV == null) {
            return;
        }
        viewOverlayV.add(tooltipDrawable);
    }

    private void H(Canvas canvas, float f10, float f11) {
        Iterator it = this.f27721n0.iterator();
        while (it.hasNext()) {
            float fI1 = i1(((Float) it.next()).floatValue());
            float f12 = this.J + (this.G / 2.0f);
            if (f10 >= fI1 - f12 && f10 <= fI1 + f12) {
                return;
            }
        }
        if (isVertical()) {
            canvas.drawPoint(f11, f10, this.f27708h);
        } else {
            canvas.drawPoint(f10, f11, this.f27708h);
        }
    }

    private void H0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f27721n0.size() == arrayList.size() && this.f27721n0.equals(arrayList)) {
            return;
        }
        this.f27721n0 = arrayList;
        this.f27743y0 = true;
        this.f27725p0 = 0;
        P0();
        z();
        D();
        postInvalidate();
    }

    private void I(Canvas canvas, int i10, int i11, float f10, Drawable drawable) {
        canvas.save();
        if (isVertical()) {
            canvas.concat(this.M0);
        }
        canvas.translate((this.F + ((int) (y0(f10) * i10))) - (drawable.getBounds().width() / 2.0f), i11 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private boolean I0() {
        return this.D == 3;
    }

    private void J(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        int i12;
        int i13;
        int i14 = 0;
        while (i14 < this.f27721n0.size()) {
            float fFloatValue = ((Float) this.f27721n0.get(i14)).floatValue();
            Drawable drawable = this.O0;
            if (drawable != null) {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                I(canvas2, i12, i13, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i12 = i10;
                i13 = i11;
                if (i14 < this.P0.size()) {
                    I(canvas2, i12, i13, fFloatValue, (Drawable) this.P0.get(i14));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.F + (y0(fFloatValue) * i12), i13, getThumbRadius(), this.f27700d);
                    }
                    I(canvas2, i12, i13, fFloatValue, this.N0);
                }
            }
            i14++;
            canvas = canvas2;
            i10 = i12;
            i11 = i13;
        }
    }

    private boolean J0() {
        return this.f27739w0 || !(getBackground() instanceof RippleDrawable);
    }

    private void K(int i10, int i11, Canvas canvas, Paint paint) {
        while (i10 < i11) {
            float f10 = isVertical() ? this.f27729r0[i10 + 1] : this.f27729r0[i10];
            if (!k0(f10) && (!isCentered() || !j0(f10))) {
                float[] fArr = this.f27729r0;
                canvas.drawPoint(fArr[i10], fArr[i10 + 1], paint);
            }
            i10 += 2;
        }
    }

    private boolean K0(float f10) {
        return M0(this.f27723o0, f10);
    }

    private void L(Canvas canvas, RectF rectF, Drawable drawable) {
        if (isVertical()) {
            this.M0.mapRect(rectF);
        }
        rectF.round(this.L0);
        drawable.setBounds(this.L0);
        drawable.draw(canvas);
    }

    private double L0(float f10) {
        float f11 = this.f27727q0;
        if (f11 <= 0.0f) {
            return f10;
        }
        int i10 = (int) ((this.f27719m0 - this.f27717l0) / f11);
        return ((double) Math.round(f10 * i10)) / ((double) i10);
    }

    private void M(Canvas canvas, RectF rectF, RectF rectF2) {
        if (c0()) {
            if (this.f27721n0.size() > 1) {
                Log.w(X0, "Track icons can only be used when only 1 thumb is present.");
            }
            o(canvas, rectF, this.Q, true);
            o(canvas, rectF2, this.V, true);
            o(canvas, rectF, this.S, false);
            o(canvas, rectF2, this.f27695a0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M0(int i10, float f10) {
        this.f27725p0 = i10;
        if (Math.abs(f10 - ((Float) this.f27721n0.get(i10)).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.f27721n0.set(i10, Float.valueOf(T(i10, f10)));
        C(i10);
        return true;
    }

    private void N() {
        if (!this.f27724p) {
            this.f27724p = true;
            ValueAnimator valueAnimatorY = y(true);
            this.f27726q = valueAnimatorY;
            this.f27728r = null;
            valueAnimatorY.start();
        }
        Iterator it = this.f27718m.iterator();
        for (int i10 = 0; i10 < this.f27721n0.size() && it.hasNext(); i10++) {
            if (i10 != this.f27725p0) {
                G0((TooltipDrawable) it.next(), ((Float) this.f27721n0.get(i10)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f27718m.size()), Integer.valueOf(this.f27721n0.size())));
        }
        G0((TooltipDrawable) it.next(), ((Float) this.f27721n0.get(this.f27725p0)).floatValue());
    }

    private boolean N0() {
        return K0(Z());
    }

    private void O() {
        if (this.f27724p) {
            this.f27724p = false;
            ValueAnimator valueAnimatorY = y(false);
            this.f27728r = valueAnimatorY;
            this.f27726q = null;
            valueAnimatorY.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlay viewOverlayV = BaseSlider.this.V();
                    if (viewOverlayV == null) {
                        return;
                    }
                    Iterator it = BaseSlider.this.f27718m.iterator();
                    while (it.hasNext()) {
                        viewOverlayV.remove((TooltipDrawable) it.next());
                    }
                }
            });
            this.f27728r.start();
        }
    }

    private void P(int i10) {
        if (i10 == 1) {
            w0(Integer.MAX_VALUE);
            return;
        }
        if (i10 == 2) {
            w0(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            x0(Integer.MAX_VALUE);
        } else {
            if (i10 != 66) {
                return;
            }
            x0(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        if (J0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fY0 = (y0(((Float) this.f27721n0.get(this.f27725p0)).floatValue()) * this.f27737v0) + this.F;
            int iV = v();
            int i10 = this.I;
            float[] fArr = {fY0 - i10, iV - i10, fY0 + i10, iV + i10};
            if (isVertical()) {
                this.M0.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Q(float f10) {
        if (hasLabelFormatter()) {
            return this.f27713j0.getFormattedValue(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    private void Q0() {
        float f10;
        boolean zIsVertical = isVertical();
        boolean zN0 = n0();
        float f11 = 0.5f;
        if (zIsVertical && zN0) {
            f10 = 0.5f;
            f11 = -0.2f;
        } else {
            f10 = 1.2f;
            if (zIsVertical) {
                f11 = 1.2f;
                f10 = 0.5f;
            }
        }
        Iterator it = this.f27718m.iterator();
        while (it.hasNext()) {
            ((TooltipDrawable) it.next()).setPivots(f11, f10);
        }
    }

    private float[] R() {
        float fFloatValue = ((Float) this.f27721n0.get(0)).floatValue();
        ArrayList arrayList = this.f27721n0;
        float fFloatValue2 = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.f27721n0.size() == 1) {
            fFloatValue = this.f27717l0;
        }
        float fY0 = y0(fFloatValue);
        float fY02 = y0(fFloatValue2);
        if (isCentered()) {
            float fMin = Math.min(0.5f, fY02);
            fY02 = Math.max(0.5f, fY02);
            fY0 = fMin;
        }
        return (isCentered() || !(n0() || isVertical())) ? new float[]{fY0, fY02} : new float[]{fY02, fY0};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        Q0();
        int i10 = this.D;
        if (i10 == 0 || i10 == 1) {
            if (this.f27723o0 == -1 || !isEnabled()) {
                O();
                return;
            } else {
                N();
                return;
            }
        }
        if (i10 == 2) {
            O();
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.D);
        }
        if (isEnabled() && o0()) {
            N();
        } else {
            O();
        }
    }

    private static float S(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private void S0() {
        float fV = v();
        this.M0.reset();
        this.M0.setRotate(90.0f, fV, fV);
    }

    private float T(int i10, float f10) {
        float minSeparation = getMinSeparation();
        if (this.R0 == 0) {
            minSeparation = B(minSeparation);
        }
        if (n0() || isVertical()) {
            minSeparation = -minSeparation;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        return MathUtils.clamp(f10, i12 < 0 ? this.f27717l0 : ((Float) this.f27721n0.get(i12)).floatValue() + minSeparation, i11 >= this.f27721n0.size() ? this.f27719m0 : ((Float) this.f27721n0.get(i11)).floatValue() - minSeparation);
    }

    private void T0() {
        if (b0()) {
            int i10 = this.G;
            this.K = i10;
            this.L = this.J;
            int iRound = Math.round(i10 * 0.5f);
            int i11 = this.G - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.J - (i11 / 2));
        }
    }

    private int U(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private void U0() {
        d1();
        int iMin = 0;
        if (this.f27727q0 <= 0.0f) {
            V0(0);
            return;
        }
        int i10 = this.f27731s0;
        if (i10 == 0) {
            iMin = Math.min(X(), Y());
        } else if (i10 == 1) {
            int iX = X();
            if (iX <= Y()) {
                iMin = iX;
            }
        } else if (i10 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f27731s0);
        }
        V0(iMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewOverlay V() {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return null;
        }
        return contentView.getOverlay();
    }

    private void V0(int i10) {
        if (i10 == 0) {
            this.f27729r0 = null;
            return;
        }
        float[] fArr = this.f27729r0;
        if (fArr == null || fArr.length != i10 * 2) {
            this.f27729r0 = new float[i10 * 2];
        }
        float f10 = this.f27737v0 / (i10 - 1);
        float fV = v();
        for (int i11 = 0; i11 < i10 * 2; i11 += 2) {
            float[] fArr2 = this.f27729r0;
            fArr2[i11] = this.F + ((i11 / 2.0f) * f10);
            fArr2[i11 + 1] = fV;
        }
        if (isVertical()) {
            this.M0.mapPoints(this.f27729r0);
        }
    }

    private float[] W(float f10, float f11) {
        return isVertical() ? new float[]{f10, f10, f10, f10, f11, f11, f11, f11} : new float[]{f10, f10, f11, f11, f11, f11, f10, f10};
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void W0(android.graphics.Canvas r7, android.graphics.Paint r8, android.graphics.RectF r9, float r10, com.google.android.material.slider.BaseSlider.FullCornerDirection r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.W0(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, com.google.android.material.slider.BaseSlider$FullCornerDirection):void");
    }

    private int X() {
        return (int) (((this.f27719m0 - this.f27717l0) / this.f27727q0) + 1.0f);
    }

    private void X0() {
        Drawable drawable = this.S;
        if (drawable != null) {
            if (!this.T && this.U != null) {
                this.S = DrawableCompat.wrap(drawable).mutate();
                this.T = true;
            }
            if (this.T) {
                this.S.setTintList(this.U);
            }
        }
    }

    private int Y() {
        return (this.f27737v0 / this.f27742y) + 1;
    }

    private void Y0() {
        Drawable drawable = this.Q;
        if (drawable != null) {
            if (!this.R && this.U != null) {
                this.Q = DrawableCompat.wrap(drawable).mutate();
                this.R = true;
            }
            if (this.R) {
                this.Q.setTintList(this.U);
            }
        }
    }

    private float Z() {
        double dL0 = L0(this.Q0);
        if (n0() || isVertical()) {
            dL0 = 1.0d - dL0;
        }
        float f10 = this.f27719m0;
        float f11 = this.f27717l0;
        return (float) ((dL0 * ((double) (f10 - f11))) + ((double) f11));
    }

    private void Z0() {
        Drawable drawable = this.f27695a0;
        if (drawable != null) {
            if (!this.f27697b0 && this.f27699c0 != null) {
                this.f27695a0 = DrawableCompat.wrap(drawable).mutate();
                this.f27697b0 = true;
            }
            if (this.f27697b0) {
                this.f27695a0.setTintList(this.f27699c0);
            }
        }
    }

    public static /* synthetic */ void a(BaseSlider baseSlider) {
        baseSlider.setActiveThumbIndex(-1);
        baseSlider.invalidate();
    }

    private float a0() {
        float f10 = this.Q0;
        if (n0() || isVertical()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.f27719m0;
        float f12 = this.f27717l0;
        return (f10 * (f11 - f12)) + f12;
    }

    private void a1() {
        Drawable drawable = this.V;
        if (drawable != null) {
            if (!this.W && this.f27699c0 != null) {
                this.V = DrawableCompat.wrap(drawable).mutate();
                this.W = true;
            }
            if (this.W) {
                this.V.setTintList(this.f27699c0);
            }
        }
    }

    public static /* synthetic */ void b(BaseSlider baseSlider, ValueAnimator valueAnimator) {
        baseSlider.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it = baseSlider.f27718m.iterator();
        while (it.hasNext()) {
            ((TooltipDrawable) it.next()).setRevealFraction(fFloatValue);
        }
        baseSlider.postInvalidateOnAnimation();
    }

    private boolean b0() {
        return this.J > 0;
    }

    private void b1(int i10) {
        this.f27737v0 = Math.max(i10 - (this.F * 2), 0);
        U0();
    }

    private boolean c0() {
        return (this.Q == null && this.S == null && this.V == null && this.f27695a0 == null) ? false : true;
    }

    private void c1(boolean z10) {
        boolean zV0 = v0();
        boolean zU0 = u0();
        if (isVertical()) {
            S0();
        }
        if (zV0 || z10) {
            requestLayout();
        } else if (zU0) {
            postInvalidate();
        }
    }

    private Drawable d0(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void d1() {
        if (this.f27743y0) {
            g1();
            f1();
            e1();
            j1();
            this.f27743y0 = false;
        }
    }

    private void e0() {
        this.f27696b.setStrokeWidth(this.E);
        this.f27698c.setStrokeWidth(this.E);
    }

    private void e1() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
        }
        float f10 = this.f27727q0;
        if (f10 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.R0 != 1) {
            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f27727q0)));
        }
        if (minSeparation < f10 || !i0(minSeparation)) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f27727q0), Float.valueOf(this.f27727q0)));
        }
    }

    private boolean f0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void f1() {
        if (this.f27727q0 > 0.0f && !h1(this.f27719m0)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f27727q0), Float.valueOf(this.f27717l0), Float.valueOf(this.f27719m0)));
        }
    }

    private boolean g0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void g1() {
        if (this.f27717l0 >= this.f27719m0) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f27717l0), Float.valueOf(this.f27719m0)));
        }
        for (Float f10 : this.f27721n0) {
            if (f10.floatValue() < this.f27717l0 || f10.floatValue() > this.f27719m0) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f10, Float.valueOf(this.f27717l0), Float.valueOf(this.f27719m0)));
            }
            if (this.f27727q0 > 0.0f && !h1(f10.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f10, Float.valueOf(this.f27717l0), Float.valueOf(this.f27727q0), Float.valueOf(this.f27727q0)));
            }
        }
    }

    private static boolean h0(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean h1(float f10) {
        return i0(new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.f27717l0)), MathContext.DECIMAL64).doubleValue());
    }

    private boolean i0(double d10) {
        double dDoubleValue = new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Float.toString(this.f27727q0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    private float i1(float f10) {
        return (y0(f10) * this.f27737v0) + this.F;
    }

    private boolean j0(float f10) {
        float f11 = this.J + (this.G / 2.0f);
        float f12 = (this.f27737v0 + (this.F * 2)) / 2.0f;
        return f10 >= f12 - f11 && f10 <= f12 + f11;
    }

    private void j1() {
        float f10 = this.f27727q0;
        if (f10 == 0.0f) {
            return;
        }
        if (((int) f10) != f10) {
            Log.w(X0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f10)));
        }
        float f11 = this.f27717l0;
        if (((int) f11) != f11) {
            Log.w(X0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f11)));
        }
        float f12 = this.f27719m0;
        if (((int) f12) != f12) {
            Log.w(X0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f12)));
        }
    }

    private boolean k0(float f10) {
        float f11 = this.J + (this.G / 2.0f);
        Iterator it = this.f27721n0.iterator();
        if (it.hasNext()) {
            float fI1 = i1(((Float) it.next()).floatValue());
            if (f10 >= fI1 - f11 && f10 <= fI1 + f11) {
                return true;
            }
        }
        return false;
    }

    private boolean l0(MotionEvent motionEvent) {
        return !h0(motionEvent) && f0();
    }

    private void m(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.G, this.H);
        } else {
            float fMax = Math.max(this.G, this.H) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private boolean m0(MotionEvent motionEvent) {
        return !h0(motionEvent) && g0();
    }

    private void n(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    private void o(Canvas canvas, RectF rectF, Drawable drawable, boolean z10) {
        if (drawable != null) {
            w(rectF, this.K0, this.f27701d0, this.f27703e0, z10);
            if (this.K0.isEmpty()) {
                return;
            }
            L(canvas, this.K0, drawable);
        }
    }

    private boolean o0() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && p0();
    }

    private float p(float f10) {
        if (this.f27721n0.isEmpty() || !b0()) {
            return f10;
        }
        float fI1 = i1(((Float) this.f27721n0.get((n0() || isVertical()) ? 0 : this.f27721n0.size() - 1)).floatValue()) - this.F;
        int i10 = this.f27737v0;
        return fI1 > ((float) i10) - f10 ? Math.max(i10 - fI1, this.O) : f10;
    }

    private boolean p0() {
        return Build.VERSION.SDK_INT >= 24 ? this.W0 : isShown();
    }

    private Float q(int i10) {
        float fU = this.f27741x0 ? u(20) : t();
        if (i10 == 69) {
            return Float.valueOf(-fU);
        }
        if (i10 == 70 || i10 == 81) {
            return Float.valueOf(fU);
        }
        switch (i10) {
            case 19:
                if (isVertical()) {
                    return Float.valueOf(fU);
                }
                return null;
            case 20:
                if (isVertical()) {
                    return Float.valueOf(-fU);
                }
                return null;
            case 21:
                if (!n0()) {
                    fU = -fU;
                }
                return Float.valueOf(fU);
            case 22:
                if (n0()) {
                    fU = -fU;
                }
                return Float.valueOf(fU);
            default:
                return null;
        }
    }

    private void q0(Resources resources) {
        this.B = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f27732t = dimensionPixelOffset;
        this.F = dimensionPixelOffset;
        this.f27734u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f27736v = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        int i10 = R.dimen.mtrl_slider_tick_radius;
        this.f27738w = resources.getDimensionPixelSize(i10);
        this.f27740x = resources.getDimensionPixelSize(i10);
        this.f27742y = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.f27705f0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.f27703e0 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
    }

    private void r(TooltipDrawable tooltipDrawable, float f10) {
        int iY0;
        int intrinsicWidth;
        int iV;
        int intrinsicHeight;
        int i10;
        if (isVertical()) {
            iY0 = (this.F + ((int) (y0(f10) * this.f27737v0))) - (tooltipDrawable.getIntrinsicHeight() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicHeight() + iY0;
            if (!n0()) {
                int iV2 = v() + this.f27705f0 + (this.H / 2);
                iV = tooltipDrawable.getIntrinsicWidth() + iV2;
                i10 = iV2;
                this.J0.set(iY0, i10, intrinsicWidth, iV);
            }
            iV = v() - (this.f27705f0 + (this.H / 2));
            intrinsicHeight = tooltipDrawable.getIntrinsicWidth();
        } else {
            iY0 = (this.F + ((int) (y0(f10) * this.f27737v0))) - (tooltipDrawable.getIntrinsicWidth() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicWidth() + iY0;
            iV = v() - (this.f27705f0 + (this.H / 2));
            intrinsicHeight = tooltipDrawable.getIntrinsicHeight();
        }
        i10 = iV - intrinsicHeight;
        this.J0.set(iY0, i10, intrinsicWidth, iV);
    }

    private void r0(Canvas canvas, int i10, int i11) {
        Canvas canvas2;
        if (J0()) {
            float[] fArr = {this.F + (y0(((Float) this.f27721n0.get(this.f27725p0)).floatValue()) * i10), i11};
            if (isVertical()) {
                this.M0.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f10 = fArr[0];
                int i12 = this.I;
                float f11 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f10 - i12, f11 - i12, f10 + i12, f11 + i12, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.I, this.f27702e);
        }
    }

    private float s(float f10) {
        if (this.f27721n0.isEmpty() || !b0()) {
            return f10;
        }
        float fI1 = i1(((Float) this.f27721n0.get((n0() || isVertical()) ? this.f27721n0.size() - 1 : 0)).floatValue()) - this.F;
        return fI1 < f10 ? Math.max(fI1, this.O) : f10;
    }

    private void s0(Canvas canvas, int i10) {
        if (this.M <= 0 || this.f27721n0.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f27721n0;
        float fFloatValue = ((Float) arrayList.get(arrayList.size() - 1)).floatValue();
        float f10 = this.f27719m0;
        if (fFloatValue < f10) {
            H(canvas, i1(f10), i10);
        }
        if (isCentered() || (this.f27721n0.size() > 1 && ((Float) this.f27721n0.get(0)).floatValue() > this.f27717l0)) {
            H(canvas, i1(this.f27717l0), i10);
        }
    }

    private float t() {
        float f10 = this.f27727q0;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    private void t0(Canvas canvas) {
        float[] fArr = this.f27729r0;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] fArrR = R();
        int iCeil = (int) Math.ceil(fArrR[0] * ((this.f27729r0.length / 2.0f) - 1.0f));
        int iFloor = (int) Math.floor(fArrR[1] * ((this.f27729r0.length / 2.0f) - 1.0f));
        if (iCeil > 0) {
            K(0, iCeil * 2, canvas, this.f27704f);
        }
        if (iCeil <= iFloor) {
            K(iCeil * 2, (iFloor + 1) * 2, canvas, this.f27706g);
        }
        int i10 = (iFloor + 1) * 2;
        float[] fArr2 = this.f27729r0;
        if (i10 < fArr2.length) {
            K(i10, fArr2.length, canvas, this.f27704f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float u(int i10) {
        float fT = t();
        return (this.f27719m0 - this.f27717l0) / fT <= i10 ? fT : Math.round(r1 / r4) * fT;
    }

    private boolean u0() {
        int iMax = this.f27732t + Math.max(Math.max(Math.max((this.G / 2) - this.f27734u, 0), Math.max((this.E - this.f27736v) / 2, 0)), Math.max(Math.max(this.f27733t0 - this.f27738w, 0), Math.max(this.f27735u0 - this.f27740x, 0)));
        if (this.F == iMax) {
            return false;
        }
        this.F = iMax;
        if (!isLaidOut()) {
            return true;
        }
        b1(isVertical() ? getHeight() : getWidth());
        return true;
    }

    private int v() {
        return (this.C / 2) + ((this.D == 1 || I0()) ? ((TooltipDrawable) this.f27718m.get(0)).getIntrinsicHeight() : 0);
    }

    private boolean v0() {
        int paddingTop;
        int paddingBottom;
        if (isVertical()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i10 = paddingTop + paddingBottom;
        int iMax = Math.max(this.B, Math.max(this.E + i10, this.H + i10));
        if (iMax == this.C) {
            return false;
        }
        this.C = iMax;
        return true;
    }

    private void w(RectF rectF, RectF rectF2, int i10, int i11, boolean z10) {
        if (rectF.right - rectF.left < (i11 * 2) + i10) {
            rectF2.setEmpty();
            return;
        }
        float f10 = z10 ^ (n0() || isVertical()) ? rectF.left + i11 : (rectF.right - i11) - i10;
        float f11 = i10;
        float fV = v() - (f11 / 2.0f);
        rectF2.set(f10, fV, f10 + f11, f11 + fV);
    }

    private boolean w0(int i10) {
        int i11 = this.f27725p0;
        int iClamp = (int) MathUtils.clamp(((long) i11) + ((long) i10), 0L, this.f27721n0.size() - 1);
        this.f27725p0 = iClamp;
        if (iClamp == i11) {
            return false;
        }
        if (this.f27723o0 != -1) {
            this.f27723o0 = iClamp;
        }
        P0();
        postInvalidate();
        return true;
    }

    private int x(boolean z10) {
        return z10 ? 0 : 2;
    }

    private boolean x0(int i10) {
        if (n0() || isVertical()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        return w0(i10);
    }

    private ValueAnimator y(boolean z10) {
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(S(z10 ? this.f27728r : this.f27726q, z10 ? 0.0f : 1.0f), z10 ? 1.0f : 0.0f);
        if (z10) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), Z0, 83);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f27693b1, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), f27692a1, 117);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), f27694c1, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseSlider.b(this.f27761b, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private float y0(float f10) {
        float f11 = this.f27717l0;
        float f12 = (f10 - f11) / (this.f27719m0 - f11);
        return (n0() || isVertical()) ? 1.0f - f12 : f12;
    }

    private void z() {
        if (this.f27718m.size() > this.f27721n0.size()) {
            List<TooltipDrawable> listSubList = this.f27718m.subList(this.f27721n0.size(), this.f27718m.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (isAttachedToWindow()) {
                    A(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.f27718m.size() >= this.f27721n0.size()) {
                break;
            }
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.f27716l);
            this.f27718m.add(tooltipDrawableCreateFromAttributes);
            if (isAttachedToWindow()) {
                n(tooltipDrawableCreateFromAttributes);
            }
        }
        int i10 = this.f27718m.size() != 1 ? 1 : 0;
        Iterator it = this.f27718m.iterator();
        while (it.hasNext()) {
            ((TooltipDrawable) it.next()).setStrokeWidth(i10);
        }
    }

    private Boolean z0(int i10, KeyEvent keyEvent) {
        if (i10 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(w0(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(w0(-1)) : Boolean.FALSE;
        }
        if (i10 != 66) {
            if (i10 != 81) {
                if (i10 == 69) {
                    w0(-1);
                    return Boolean.TRUE;
                }
                if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            x0(-1);
                            break;
                        case 22:
                            x0(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            w0(1);
            return Boolean.TRUE;
        }
        this.f27723o0 = this.f27725p0;
        postInvalidate();
        return Boolean.TRUE;
    }

    protected boolean C0() {
        if (this.f27723o0 != -1) {
            return true;
        }
        float fA0 = a0();
        float fI1 = i1(fA0);
        this.f27723o0 = 0;
        float fAbs = Math.abs(((Float) this.f27721n0.get(0)).floatValue() - fA0);
        for (int i10 = 1; i10 < this.f27721n0.size(); i10++) {
            float fAbs2 = Math.abs(((Float) this.f27721n0.get(i10)).floatValue() - fA0);
            float fI12 = i1(((Float) this.f27721n0.get(i10)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z10 = n0() || isVertical() ? fI12 - fI1 > 0.0f : fI12 - fI1 < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.f27723o0 = i10;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fI12 - fI1) < this.f27730s) {
                        this.f27723o0 = -1;
                        return false;
                    }
                    if (z10) {
                        this.f27723o0 = i10;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.f27723o0 != -1;
    }

    void O0(int i10, Rect rect) {
        int iY0 = this.F + ((int) (y0(getValues().get(i10).floatValue()) * this.f27737v0));
        int iV = v();
        int iMax = Math.max(this.G / 2, this.f27744z / 2);
        int iMax2 = Math.max(this.H / 2, this.f27744z / 2);
        RectF rectF = new RectF(iY0 - iMax, iV - iMax2, iY0 + iMax, iV + iMax2);
        if (isVertical()) {
            this.M0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public void addOnChangeListener(@NonNull L l10) {
        this.f27720n.add(l10);
    }

    public void addOnSliderTouchListener(@NonNull T t10) {
        this.f27722o.add(t10);
    }

    public void clearOnChangeListeners() {
        this.f27720n.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.f27722o.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f27710i.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f27696b.setColor(U(this.D0));
        this.f27698c.setColor(U(this.C0));
        this.f27704f.setColor(U(this.B0));
        this.f27706g.setColor(U(this.A0));
        this.f27708h.setColor(U(this.B0));
        for (TooltipDrawable tooltipDrawable : this.f27718m) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.N0.isStateful()) {
            this.N0.setState(getDrawableState());
        }
        this.f27702e.setColor(U(this.f27745z0));
        this.f27702e.setAlpha(63);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    final int getAccessibilityFocusedVirtualViewId() {
        return this.f27710i.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.f27723o0;
    }

    public int getFocusedThumbIndex() {
        return this.f27725p0;
    }

    @Px
    public int getHaloRadius() {
        return this.I;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f27745z0;
    }

    public int getLabelBehavior() {
        return this.D;
    }

    protected float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f27727q0;
    }

    public float getThumbElevation() {
        return this.N0.getElevation();
    }

    @Px
    public int getThumbHeight() {
        return this.H;
    }

    @Px
    public int getThumbRadius() {
        return this.G / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.N0.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.N0.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.N0.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.J;
    }

    @Px
    public int getThumbWidth() {
        return this.G;
    }

    @Px
    public int getTickActiveRadius() {
        return this.f27733t0;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.A0;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.f27735u0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.B0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.B0.equals(this.A0)) {
            return this.A0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.f27731s0;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.C0;
    }

    @Px
    public int getTrackCornerSize() {
        int i10 = this.N;
        return i10 == -1 ? this.E / 2 : i10;
    }

    @Px
    public int getTrackHeight() {
        return this.E;
    }

    @Nullable
    public ColorStateList getTrackIconActiveColor() {
        return this.U;
    }

    @Nullable
    public Drawable getTrackIconActiveEnd() {
        return this.S;
    }

    @Nullable
    public Drawable getTrackIconActiveStart() {
        return this.Q;
    }

    @Nullable
    public ColorStateList getTrackIconInactiveColor() {
        return this.f27699c0;
    }

    @Nullable
    public Drawable getTrackIconInactiveEnd() {
        return this.f27695a0;
    }

    @Nullable
    public Drawable getTrackIconInactiveStart() {
        return this.V;
    }

    public int getTrackIconSize() {
        return this.f27701d0;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.D0;
    }

    public int getTrackInsideCornerSize() {
        return this.O;
    }

    @Px
    public int getTrackSidePadding() {
        return this.F;
    }

    public int getTrackStopIndicatorSize() {
        return this.M;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.D0.equals(this.C0)) {
            return this.C0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.f27737v0;
    }

    public float getValueFrom() {
        return this.f27717l0;
    }

    public float getValueTo() {
        return this.f27719m0;
    }

    @NonNull
    List<Float> getValues() {
        return new ArrayList(this.f27721n0);
    }

    public boolean hasLabelFormatter() {
        return this.f27713j0 != null;
    }

    public boolean isCentered() {
        return this.P;
    }

    public boolean isTickVisible() {
        int i10 = this.f27731s0;
        if (i10 == 0) {
            return true;
        }
        if (i10 == 1) {
            return X() <= Y();
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.f27731s0);
    }

    public boolean isVertical() {
        return this.A == 1;
    }

    final boolean n0() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W0 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.T0);
        getViewTreeObserver().addOnGlobalLayoutListener(this.U0);
        Iterator it = this.f27718m.iterator();
        while (it.hasNext()) {
            n((TooltipDrawable) it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        AccessibilityEventSender accessibilityEventSender = this.f27714k;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.f27724p = false;
        Iterator it = this.f27718m.iterator();
        while (it.hasNext()) {
            A((TooltipDrawable) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.T0);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.U0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f27743y0) {
            d1();
            U0();
        }
        super.onDraw(canvas);
        int iV = v();
        G(canvas, this.f27737v0, iV);
        E(canvas, this.f27737v0, iV);
        if (n0() || isVertical()) {
            M(canvas, this.F0, this.G0);
        } else {
            M(canvas, this.F0, this.H0);
        }
        t0(canvas);
        s0(canvas, iV);
        if ((this.f27715k0 || isFocused()) && isEnabled()) {
            r0(canvas, this.f27737v0, iV);
        }
        R0();
        J(canvas, this.f27737v0, iV);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            P(i10);
            this.f27710i.requestKeyboardFocusForVirtualView(this.f27725p0);
        } else {
            this.f27723o0 = -1;
            this.f27710i.clearKeyboardFocusForVirtualView(this.f27725p0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f27721n0.size() == 1) {
            this.f27723o0 = 0;
        }
        if (this.f27723o0 == -1) {
            Boolean boolZ0 = z0(i10, keyEvent);
            return boolZ0 != null ? boolZ0.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        this.f27741x0 |= keyEvent.isLongPress();
        Float fQ = q(i10);
        if (fQ != null) {
            if (K0(((Float) this.f27721n0.get(this.f27723o0)).floatValue() + fQ.floatValue())) {
                P0();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return w0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return w0(-1);
                }
                return false;
            }
            if (i10 != 66) {
                return super.onKeyDown(i10, keyEvent);
            }
        }
        this.f27723o0 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, @NonNull KeyEvent keyEvent) {
        this.f27741x0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.C + ((this.D == 1 || I0()) ? ((TooltipDrawable) this.f27718m.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (isVertical()) {
            super.onMeasure(iMakeMeasureSpec, i11);
        } else {
            super.onMeasure(i10, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f27717l0 = sliderState.f27752b;
        this.f27719m0 = sliderState.f27753c;
        H0(sliderState.f27754d);
        this.f27727q0 = sliderState.f27755e;
        if (sliderState.f27756f) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f27752b = this.f27717l0;
        sliderState.f27753c = this.f27719m0;
        sliderState.f27754d = new ArrayList(this.f27721n0);
        sliderState.f27755e = this.f27727q0;
        sliderState.f27756f = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (isVertical()) {
            i10 = i11;
        }
        b1(i10);
        P0();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
        this.W0 = z10;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        ViewOverlay viewOverlayV;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 || (viewOverlayV = V()) == null) {
            return;
        }
        Iterator it = this.f27718m.iterator();
        while (it.hasNext()) {
            viewOverlayV.remove((TooltipDrawable) it.next());
        }
    }

    public void removeOnChangeListener(@NonNull L l10) {
        this.f27720n.remove(l10);
    }

    public void removeOnSliderTouchListener(@NonNull T t10) {
        this.f27722o.remove(t10);
    }

    public void scheduleTooltipTimeout() {
        removeCallbacks(this.V0);
        postDelayed(this.V0, this.S0);
    }

    protected void setActiveThumbIndex(int i10) {
        this.f27723o0 = i10;
    }

    public void setCentered(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        if (z10) {
            setValues(Float.valueOf((this.f27717l0 + this.f27719m0) / 2.0f));
        } else {
            setValues(Float.valueOf(this.f27717l0));
        }
        c1(true);
    }

    void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            drawableArr[i10] = getResources().getDrawable(iArr[i10]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f27721n0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f27725p0 = i10;
        this.f27710i.requestKeyboardFocusForVirtualView(i10);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i10) {
        if (i10 == this.I) {
            return;
        }
        this.I = i10;
        Drawable background = getBackground();
        if (J0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.I);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f27745z0)) {
            return;
        }
        this.f27745z0 = colorStateList;
        Drawable background = getBackground();
        if (!J0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f27702e.setColor(U(colorStateList));
        this.f27702e.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i10) {
        if (this.D != i10) {
            this.D = i10;
            c1(true);
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.f27713j0 = labelFormatter;
    }

    public void setOrientation(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        c1(true);
    }

    protected void setSeparationUnit(int i10) {
        this.R0 = i10;
        this.f27743y0 = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.f27717l0), Float.valueOf(this.f27719m0)));
        }
        if (this.f27727q0 != f10) {
            this.f27727q0 = f10;
            this.f27743y0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        this.N0.setElevation(f10);
    }

    public void setThumbElevationResource(@DimenRes int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i10) {
        if (i10 == this.H) {
            return;
        }
        this.H = i10;
        this.N0.setBounds(0, 0, this.G, i10);
        Drawable drawable = this.O0;
        if (drawable != null) {
            m(drawable);
        }
        Iterator it = this.P0.iterator();
        while (it.hasNext()) {
            m((Drawable) it.next());
        }
        c1(false);
    }

    public void setThumbHeightResource(@DimenRes int i10) {
        setThumbHeight(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i10) {
        int i11 = i10 * 2;
        setThumbWidth(i11);
        setThumbHeight(i11);
    }

    public void setThumbRadiusResource(@DimenRes int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.N0.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.N0.setStrokeWidth(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.N0.getFillColor())) {
            return;
        }
        this.N0.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i10) {
        if (this.J == i10) {
            return;
        }
        this.J = i10;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i10) {
        if (i10 == this.G) {
            return;
        }
        this.G = i10;
        this.N0.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.G / 2.0f).build());
        this.N0.setBounds(0, 0, this.G, this.H);
        Drawable drawable = this.O0;
        if (drawable != null) {
            m(drawable);
        }
        Iterator it = this.P0.iterator();
        while (it.hasNext()) {
            m((Drawable) it.next());
        }
        c1(false);
    }

    public void setThumbWidthResource(@DimenRes int i10) {
        setThumbWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i10) {
        if (this.f27733t0 != i10) {
            this.f27733t0 = i10;
            this.f27706g.setStrokeWidth(i10 * 2);
            c1(false);
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.A0)) {
            return;
        }
        this.A0 = colorStateList;
        this.f27706g.setColor(U(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i10) {
        if (this.f27735u0 != i10) {
            this.f27735u0 = i10;
            this.f27704f.setStrokeWidth(i10 * 2);
            c1(false);
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.B0)) {
            return;
        }
        this.B0 = colorStateList;
        this.f27704f.setColor(U(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i10) {
        if (this.f27731s0 != i10) {
            this.f27731s0 = i10;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z10) {
        setTickVisibilityMode(x(z10));
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.C0)) {
            return;
        }
        this.C0 = colorStateList;
        this.f27698c.setColor(U(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(@Px int i10) {
        if (this.N == i10) {
            return;
        }
        this.N = i10;
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i10) {
        if (this.E != i10) {
            this.E = i10;
            e0();
            c1(false);
        }
    }

    public void setTrackIconActiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.U) {
            return;
        }
        this.U = colorStateList;
        Y0();
        X0();
        invalidate();
    }

    public void setTrackIconActiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.S) {
            return;
        }
        this.S = drawable;
        this.T = false;
        X0();
        invalidate();
    }

    public void setTrackIconActiveStart(@Nullable Drawable drawable) {
        if (drawable == this.Q) {
            return;
        }
        this.Q = drawable;
        this.R = false;
        Y0();
        invalidate();
    }

    public void setTrackIconInactiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.f27699c0) {
            return;
        }
        this.f27699c0 = colorStateList;
        a1();
        Z0();
        invalidate();
    }

    public void setTrackIconInactiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.f27695a0) {
            return;
        }
        this.f27695a0 = drawable;
        this.f27697b0 = false;
        Z0();
        invalidate();
    }

    public void setTrackIconInactiveStart(@Nullable Drawable drawable) {
        if (drawable == this.V) {
            return;
        }
        this.V = drawable;
        this.W = false;
        a1();
        invalidate();
    }

    public void setTrackIconSize(@Px int i10) {
        if (this.f27701d0 == i10) {
            return;
        }
        this.f27701d0 = i10;
        invalidate();
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.D0)) {
            return;
        }
        this.D0 = colorStateList;
        this.f27696b.setColor(U(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i10) {
        if (this.O == i10) {
            return;
        }
        this.O = i10;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i10) {
        if (this.M == i10) {
            return;
        }
        this.M = i10;
        this.f27708h.setStrokeWidth(i10);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.f27717l0 = f10;
        this.f27743y0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.f27719m0 = f10;
        this.f27743y0 = true;
        postInvalidate();
    }

    void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        H0(arrayList);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    void setCustomThumbDrawable(Drawable drawable) {
        this.O0 = d0(drawable);
        this.P0.clear();
        postInvalidate();
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, Y0), attributeSet, i10);
        this.f27718m = new ArrayList();
        this.f27720n = new ArrayList();
        this.f27722o = new ArrayList();
        this.f27724p = false;
        this.K = -1;
        this.L = -1;
        this.P = false;
        this.R = false;
        this.T = false;
        this.W = false;
        this.f27697b0 = false;
        this.f27715k0 = false;
        this.f27721n0 = new ArrayList();
        this.f27723o0 = -1;
        this.f27725p0 = -1;
        this.f27727q0 = 0.0f;
        this.f27741x0 = false;
        this.E0 = new Path();
        this.F0 = new RectF();
        this.G0 = new RectF();
        this.H0 = new RectF();
        this.I0 = new RectF();
        this.J0 = new Rect();
        this.K0 = new RectF();
        this.L0 = new Rect();
        this.M0 = new Matrix();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.N0 = materialShapeDrawable;
        this.P0 = Collections.EMPTY_LIST;
        this.R0 = 0;
        this.T0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f27762b.R0();
            }
        };
        this.U0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f27763b.R0();
            }
        };
        this.V0 = new Runnable() { // from class: com.google.android.material.slider.e
            @Override // java.lang.Runnable
            public final void run() {
                BaseSlider.a(this.f27764b);
            }
        };
        Context context2 = getContext();
        this.W0 = isShown();
        this.f27696b = new Paint();
        this.f27698c = new Paint();
        Paint paint = new Paint(1);
        this.f27700d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f27702e = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f27704f = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f27706g = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f27708h = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        q0(context2.getResources());
        E0(context2, attributeSet, i10);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.f27730s = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.f27710i = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f27712j = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.S0 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.S0 = 120000;
        }
    }

    void setValues(@NonNull List<Float> list) {
        H0(new ArrayList(list));
    }

    void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.O0 = null;
        this.P0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.P0.add(d0(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(@DrawableRes int i10) {
        setTrackIconActiveEnd(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setTrackIconActiveStart(@DrawableRes int i10) {
        setTrackIconActiveStart(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setTrackIconInactiveEnd(@DrawableRes int i10) {
        setTrackIconInactiveEnd(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setTrackIconInactiveStart(@DrawableRes int i10) {
        setTrackIconInactiveStart(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }
}
