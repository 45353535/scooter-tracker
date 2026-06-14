package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: loaded from: classes9.dex */
final class CalendarItemStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f26284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f26285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f26286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f26287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f26288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ShapeAppearanceModel f26289f;

    private CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f26284a = rect;
        this.f26285b = colorStateList2;
        this.f26286c = colorStateList;
        this.f26287d = colorStateList3;
        this.f26288e = i10;
        this.f26289f = shapeAppearanceModel;
    }

    static CalendarItemStyle a(Context context, int i10) {
        Preconditions.checkArgument(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        return new CalendarItemStyle(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, shapeAppearanceModelBuild, rect);
    }

    int b() {
        return this.f26284a.bottom;
    }

    int c() {
        return this.f26284a.top;
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f26289f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f26289f);
        if (colorStateList == null) {
            colorStateList = this.f26286c;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.f26288e, this.f26287d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f26285b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f26285b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f26284a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
