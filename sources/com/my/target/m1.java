package com.my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public final class m1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f60122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60124c;

    public m1(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11) {
        this.f60123b = i10;
        this.f60124c = i11;
    }

    @NonNull
    public i getAdChoicesView() {
        return this.f60122a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f60123b;
        if (i12 <= 0 || this.f60124c <= 0) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f60124c, 1073741824));
        }
    }

    public m1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i iVar = new i(context);
        this.f60122a = iVar;
        int iA = kb.a(2, context);
        iVar.setPadding(iA, iA, iA, iA);
        iVar.setFixedHeight(kb.a(17, context));
        addView(iVar);
    }
}
