package com.bytedance.sdk.openadsdk.lnr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.lnr.to;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends ViewGroup implements to.lnr {
    private final to qdl;

    public jpc(Context context, to toVar) {
        super(context);
        this.qdl = toVar;
        toVar.qdl(this);
    }

    private View ud(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iUd = ax.ud(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iUd;
        marginLayoutParams.bottomMargin = iUd;
        textView.setTextColor(qdl());
        textView.setText(filterWord.getName());
        textView.setPadding(iUd, iUd, iUd, iUd);
        textView.setBackground(ud());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.jpc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jpc.this.qdl != null) {
                    if (view.isSelected()) {
                        jpc.this.qdl.qdl(to.qdl);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        jpc.this.qdl.qdl((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int childCount = getChildCount();
        int i15 = i12 - i10;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i19 = i16 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i19 + i17 < i15) {
                i14 = i17 + i19;
            } else {
                i18 += marginLayoutParams.bottomMargin + measuredHeight;
                i14 = 0;
            }
            childAt.layout(i14, marginLayoutParams.topMargin + i18, i14 + measuredWidth, measuredHeight + i18);
            i17 = i14 + measuredWidth + marginLayoutParams.rightMargin;
            i16++;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < getChildCount()) {
            View childAt = getChildAt(i12);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i10, i11);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i15 = i12 != 0 ? marginLayoutParams.leftMargin : 0;
            int i16 = (measuredWidth + i15) + i14 < size ? i14 + i15 : 0;
            if (i16 == 0) {
                i13 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i14 = i16 + measuredWidth + marginLayoutParams.rightMargin;
            i12++;
        }
        setMeasuredDimension(size, i13);
    }

    public void qdl(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                addView(ud(filterWord));
            }
        }
    }

    private ColorStateList qdl() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), ViewCompat.MEASURED_STATE_MASK});
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.lnr
    public void qdl(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                if (to.qdl.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    private Drawable ud() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fUd = ax.ud(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fUd);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(ax.ud(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fUd);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
