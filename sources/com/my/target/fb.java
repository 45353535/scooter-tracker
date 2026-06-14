package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class fb extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f59668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f59669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59671d;

    public fb(Context context) {
        super(context);
        kb kbVarE = kb.e(context);
        TextView textView = new TextView(context);
        this.f59668a = textView;
        r0 r0Var = new r0(context);
        this.f59669b = r0Var;
        r0Var.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.f59670c = kbVarE.b(4);
        this.f59671d = kbVarE.b(2);
        kb.b(textView, "title_text");
        kb.b(r0Var, "age_bordering");
        addView(textView);
        addView(r0Var);
    }

    @NonNull
    public TextView getLeftText() {
        return this.f59668a;
    }

    @NonNull
    public r0 getRightBorderedView() {
        return this.f59669b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f59668a.getMeasuredWidth();
        int measuredHeight = this.f59668a.getMeasuredHeight();
        int measuredWidth2 = this.f59669b.getMeasuredWidth();
        int measuredHeight2 = this.f59669b.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i14 = (measuredHeight3 - measuredHeight) / 2;
        int i15 = (measuredHeight3 - measuredHeight2) / 2;
        int i16 = this.f59670c + measuredWidth;
        this.f59668a.layout(0, i14, measuredWidth, measuredHeight + i14);
        this.f59669b.layout(i16, i15, measuredWidth2 + i16, measuredHeight2 + i15);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f59669b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f59671d * 2), Integer.MIN_VALUE));
        int i12 = size / 2;
        if (this.f59669b.getMeasuredWidth() > i12) {
            this.f59669b.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f59671d * 2), Integer.MIN_VALUE));
        }
        this.f59668a.measure(View.MeasureSpec.makeMeasureSpec((size - this.f59669b.getMeasuredWidth()) - this.f59670c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f59671d * 2), Integer.MIN_VALUE));
        setMeasuredDimension(this.f59668a.getMeasuredWidth() + this.f59669b.getMeasuredWidth() + this.f59670c, Math.max(this.f59668a.getMeasuredHeight(), this.f59669b.getMeasuredHeight()));
    }
}
