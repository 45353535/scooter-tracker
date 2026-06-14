package com.my.target;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f59068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma f59069b;

    public a(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f59068a = textView;
        ma maVar = new ma(context);
        this.f59069b = maVar;
        kb kbVarE = kb.e(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(kbVarE.a(1.0f), -1157627904);
        gradientDrawable.setCornerRadius(kbVarE.a(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(kbVarE.a(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius(kbVarE.a(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int iB = kbVarE.b(6);
        int iB2 = kbVarE.b(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int iA = kb.a(32, context);
        setPadding(iB2, iB, iB2, iB);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        kb.b(maVar, "ctc_icon");
        addView(maVar, iA, iA);
        kb.b(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    public void a(String str, ImageData imageData) {
        this.f59068a.setText(str);
        this.f59069b.setImageData(imageData);
        ((LinearLayout.LayoutParams) this.f59068a.getLayoutParams()).leftMargin = imageData == null ? 0 : kb.a(4, getContext()) * 2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
