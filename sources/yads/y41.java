package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class y41 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf0 f118071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vq f118072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f118073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f118074d;

    public y41(Context context, wf0 wf0Var) {
        super(context);
        this.f118071a = wf0Var;
        this.f118072b = new vq(context, wf0Var);
        this.f118073c = new TextView(context);
        this.f118074d = new View.OnClickListener() { // from class: yads.f71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y41.a(this.f110622b, view);
            }
        };
        a(context);
    }

    public static final void a(y41 y41Var, View view) {
        boolean zIsSelected = y41Var.f118072b.isSelected();
        y41Var.f118072b.setSelected(!zIsSelected);
        y41Var.f118073c.setVisibility(!zIsSelected ? 0 : 8);
    }

    public final void setDescription(@NotNull String str) {
        this.f118073c.setText(str);
    }

    public final void a(Context context) {
        setOrientation(0);
        this.f118071a.getClass();
        int iA = wf0.a(context, 4.0f);
        setPadding(iA, iA, iA, iA);
        this.f118072b.setOnClickListener(this.f118074d);
        addView(this.f118072b);
        this.f118071a.getClass();
        int iD = zf.a.d(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f118073c.setPadding(iD, iD, iD, iD);
        this.f118071a.getClass();
        int iD2 = zf.a.d(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iD2, SupportMenu.CATEGORY_MASK);
        this.f118073c.setBackgroundDrawable(gradientDrawable);
        addView(this.f118073c);
        this.f118071a.getClass();
        int iD3 = zf.a.d(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f118073c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(iD3, 0, iD3, iD3);
        this.f118073c.setLayoutParams(layoutParams2);
        this.f118073c.setVisibility(8);
    }
}
