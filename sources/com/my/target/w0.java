package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.v0;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 extends LinearLayout implements View.OnTouchListener, v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f60975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f60977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f60978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final aa f60979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f60980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f60981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f60982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f60983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v0.a f60984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageData f60985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f60986l;

    public w0(Context context, m9 m9Var, aa aaVar) {
        super(context);
        this.f60980f = new HashSet();
        setOrientation(1);
        this.f60979e = aaVar;
        this.f60975a = new ma(context);
        this.f60976b = new TextView(context);
        this.f60977c = new TextView(context);
        this.f60978d = new Button(context);
        this.f60981g = aaVar.a(aa.T);
        this.f60982h = aaVar.a(aa.f59156i);
        this.f60983i = aaVar.a(aa.H);
        a(m9Var);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull d1 d1Var) {
        setOnTouchListener(this);
        this.f60975a.setOnTouchListener(this);
        this.f60976b.setOnTouchListener(this);
        this.f60977c.setOnTouchListener(this);
        this.f60978d.setOnTouchListener(this);
        this.f60980f.clear();
        if (d1Var.f59463m) {
            this.f60986l = true;
            return;
        }
        if (d1Var.f59457g) {
            this.f60980f.add(this.f60978d);
        } else {
            this.f60978d.setEnabled(false);
            this.f60980f.remove(this.f60978d);
        }
        if (d1Var.f59462l) {
            this.f60980f.add(this);
        } else {
            this.f60980f.remove(this);
        }
        if (d1Var.f59451a) {
            this.f60980f.add(this.f60976b);
        } else {
            this.f60980f.remove(this.f60976b);
        }
        if (d1Var.f59452b) {
            this.f60980f.add(this.f60977c);
        } else {
            this.f60980f.remove(this.f60977c);
        }
        if (d1Var.f59454d) {
            this.f60980f.add(this.f60975a);
        } else {
            this.f60980f.remove(this.f60975a);
        }
    }

    @Override // com.my.target.v0
    public View a() {
        return this;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        a(i10, i11);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0 && getMeasuredWidth() == size) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = this.f60975a.getMeasuredWidth();
        int measuredHeight = this.f60975a.getMeasuredHeight();
        if (size > size2) {
            setMeasuredDimension(measuredWidth, measuredHeight);
            return;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            int measuredHeight2 = paddingBottom + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            paddingBottom = measuredHeight2 + layoutParams.topMargin + layoutParams.bottomMargin;
        }
        setMeasuredDimension(measuredWidth, paddingBottom);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean zContains;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                setBackgroundColor(0);
                this.f60978d.setPressed(false);
                if (this.f60984j != null) {
                    int i10 = 2;
                    if (!this.f60986l) {
                        zContains = this.f60980f.contains(view);
                        if (!zContains || view != this.f60978d) {
                            i10 = 1;
                        }
                    } else if (view == this.f60978d) {
                        zContains = true;
                    } else {
                        zContains = true;
                        i10 = 1;
                    }
                    this.f60984j.a(zContains, i10);
                }
            } else if (action == 3) {
                setBackgroundColor(0);
                this.f60978d.setPressed(false);
            }
        } else if (this.f60986l || this.f60980f.contains(view)) {
            Button button = this.f60978d;
            if (view == button) {
                button.setPressed(true);
            } else {
                setBackgroundColor(-13421773);
            }
        }
        return true;
    }

    @Override // com.my.target.v0
    public void setBanner(@Nullable g4 g4Var) {
        if (g4Var == null) {
            this.f60980f.clear();
            ImageData imageData = this.f60985k;
            if (imageData != null) {
                a3.a(imageData, this.f60975a);
            }
            this.f60975a.setPlaceholderDimensions(0, 0);
            this.f60976b.setVisibility(8);
            this.f60977c.setVisibility(8);
            this.f60978d.setVisibility(8);
            return;
        }
        ImageData imageDataS = g4Var.s();
        this.f60985k = imageDataS;
        if (imageDataS != null) {
            this.f60975a.setPlaceholderDimensions(imageDataS.getWidth(), this.f60985k.getHeight());
            a3.b(this.f60985k, this.f60975a);
        }
        if (g4Var.L()) {
            this.f60976b.setVisibility(8);
            this.f60977c.setVisibility(8);
            this.f60978d.setVisibility(8);
        } else {
            this.f60976b.setVisibility(0);
            this.f60977c.setVisibility(0);
            this.f60978d.setVisibility(0);
            this.f60976b.setText(g4Var.A());
            this.f60977c.setText(g4Var.k());
            this.f60978d.setText(g4Var.i());
        }
        setClickArea(g4Var.g());
    }

    @Override // com.my.target.v0
    public void setListener(@Nullable v0.a aVar) {
        this.f60984j = aVar;
    }

    public final void a(m9 m9Var) {
        this.f60978d.setTransformationMethod(null);
        this.f60978d.setSingleLine();
        this.f60978d.setTextSize(1, this.f60979e.a(aa.f59170w));
        Button button = this.f60978d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        this.f60978d.setGravity(17);
        this.f60978d.setIncludeFontPadding(false);
        Button button2 = this.f60978d;
        int i10 = this.f60982h;
        button2.setPadding(i10, 0, i10, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        aa aaVar = this.f60979e;
        int i11 = aa.P;
        layoutParams.leftMargin = aaVar.a(i11);
        layoutParams.rightMargin = this.f60979e.a(i11);
        layoutParams.topMargin = this.f60983i;
        layoutParams.gravity = 1;
        this.f60978d.setLayoutParams(layoutParams);
        kb.b(this.f60978d, m9Var.d(), m9Var.f(), this.f60979e.a(aa.f59162o));
        this.f60978d.setTextColor(m9Var.e());
        this.f60976b.setTextSize(1, this.f60979e.a(aa.Q));
        this.f60976b.setTextColor(m9Var.k());
        this.f60976b.setIncludeFontPadding(false);
        TextView textView = this.f60976b;
        aa aaVar2 = this.f60979e;
        int i12 = aa.O;
        textView.setPadding(aaVar2.a(i12), 0, this.f60979e.a(i12), 0);
        this.f60976b.setTypeface(null, 1);
        this.f60976b.setLines(this.f60979e.a(aa.D));
        this.f60976b.setEllipsize(truncateAt);
        this.f60976b.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = this.f60982h;
        this.f60976b.setLayoutParams(layoutParams2);
        this.f60977c.setTextColor(m9Var.j());
        this.f60977c.setIncludeFontPadding(false);
        this.f60977c.setLines(this.f60979e.a(aa.E));
        this.f60977c.setTextSize(1, this.f60979e.a(aa.R));
        this.f60977c.setEllipsize(truncateAt);
        this.f60977c.setPadding(this.f60979e.a(i12), 0, this.f60979e.a(i12), 0);
        this.f60977c.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        this.f60977c.setLayoutParams(layoutParams3);
        kb.b(this, "card_view");
        kb.b(this.f60976b, "card_title_text");
        kb.b(this.f60977c, "card_description_text");
        kb.b(this.f60978d, "card_cta_button");
        kb.b(this.f60975a, "card_image");
        addView(this.f60975a);
        addView(this.f60976b);
        addView(this.f60977c);
        addView(this.f60978d);
    }

    public final void a(int i10, int i11) {
        this.f60975a.measure(i10, i11);
        if (this.f60976b.getVisibility() == 0) {
            this.f60976b.measure(i10, i11);
        }
        if (this.f60977c.getVisibility() == 0) {
            this.f60977c.measure(i10, i11);
        }
        if (this.f60978d.getVisibility() == 0) {
            kb.a(this.f60978d, this.f60975a.getMeasuredWidth() - (this.f60979e.a(aa.P) * 2), this.f60981g, 1073741824);
        }
    }
}
