package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes9.dex */
final class CalendarStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CalendarItemStyle f26290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final CalendarItemStyle f26291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CalendarItemStyle f26292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CalendarItemStyle f26293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final CalendarItemStyle f26294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final CalendarItemStyle f26295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CalendarItemStyle f26296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f26297h;

    CalendarStyle(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), R.styleable.MaterialCalendar);
        this.f26290a = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0));
        this.f26296g = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f26291b = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f26292c = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendar_rangeFillColor);
        this.f26293d = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0));
        this.f26294e = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f26295f = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f26297h = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
