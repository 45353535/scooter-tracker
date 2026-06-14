package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class RadialViewGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f28202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaterialShapeDrawable f28204d;

    public RadialViewGroup(@NonNull Context context) {
        this(context, null);
    }

    private void a(List list, ConstraintSet constraintSet, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            constraintSet.constrainCircle(((View) it.next()).getId(), R.id.circle_center, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable b() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f28204d = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.f28204d.setFillColor(ColorStateList.valueOf(-1));
        return this.f28204d;
    }

    private static boolean d(View view) {
        return "skip".equals(view.getTag());
    }

    private void f() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f28202b);
            handler.post(this.f28202b);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        f();
    }

    int c(int i10) {
        return i10 == 2 ? Math.round(this.f28203c * 0.66f) : this.f28203c;
    }

    protected void e() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !d(childAt)) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            a((List) entry.getValue(), constraintSet, c(((Integer) entry.getKey()).intValue()));
        }
        constraintSet.applyTo(this);
    }

    @Dimension
    public int getRadius() {
        return this.f28203c;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        f();
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i10) {
        this.f28204d.setFillColor(ColorStateList.valueOf(i10));
    }

    public void setRadius(@Dimension int i10) {
        this.f28203c = i10;
        e();
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        setBackground(b());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i10, 0);
        this.f28203c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f28202b = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f28263b.e();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
