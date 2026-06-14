package com.my.target;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class x extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f61011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f61012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f61014d;

    public interface a {
        void a();
    }

    public x(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f61011a = textView;
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setTextSize(2, 20.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
        layoutParams.addRule(15);
        layoutParams.addRule(1, 256);
        addView(textView, layoutParams);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (kb.a() + 0.5f));
        layoutParams2.addRule(12);
        View view = new View(context);
        this.f61012b = view;
        view.setBackgroundColor(-10066330);
        addView(view, layoutParams2);
        y2 y2Var = new y2(context);
        y2Var.a(d0.a(), false);
        y2Var.setId(256);
        y2Var.setOnClickListener(new View.OnClickListener() { // from class: k5.w2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f86156b.a(view2);
            }
        });
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        layoutParams3.addRule(15);
        layoutParams3.addRule(9);
        y2Var.setLayoutParams(layoutParams3);
        addView(y2Var);
    }

    public final /* synthetic */ void a(View view) {
        a aVar = this.f61014d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Nullable
    public String getTitle() {
        return this.f61013c;
    }

    public void setMainColor(int i10) {
        setBackgroundColor(i10);
    }

    public void setOnCloseClickListener(@Nullable a aVar) {
        this.f61014d = aVar;
    }

    public void setStripeColor(int i10) {
        this.f61012b.setBackgroundColor(i10);
    }

    public void setTitle(@Nullable String str) {
        this.f61013c = str;
        this.f61011a.setText(str);
    }

    public void setTitleColor(int i10) {
        this.f61011a.setTextColor(i10);
    }
}
