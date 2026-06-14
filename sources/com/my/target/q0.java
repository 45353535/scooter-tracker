package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.constants.NativeAdColor;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class q0 extends FrameLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f60567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f60568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f60569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f60570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StarsRatingView f60571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f60572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kb f60573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f60574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f60575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f60576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View.OnClickListener f60577m;

    public q0(Context context, kb kbVar, boolean z10) {
        super(context);
        this.f60575k = new HashMap();
        TextView textView = new TextView(context);
        this.f60565a = textView;
        this.f60566b = new TextView(context);
        TextView textView2 = new TextView(context);
        this.f60567c = textView2;
        this.f60568d = new LinearLayout(context);
        TextView textView3 = new TextView(context);
        this.f60570f = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f60571g = starsRatingView;
        TextView textView4 = new TextView(context);
        this.f60572h = textView4;
        this.f60569e = new LinearLayout(context);
        kb.b(textView, "title_text");
        kb.b(textView2, "description_text");
        kb.b(textView3, "disclaimer_text");
        kb.b(starsRatingView, "stars_view");
        kb.b(textView4, "votes_text");
        this.f60573i = kbVar;
        this.f60574j = z10;
    }

    public void a(d1 d1Var, View.OnClickListener onClickListener) {
        if (d1Var.f59463m) {
            setOnClickListener(onClickListener);
            kb.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
            return;
        }
        this.f60577m = onClickListener;
        this.f60565a.setOnTouchListener(this);
        this.f60566b.setOnTouchListener(this);
        this.f60567c.setOnTouchListener(this);
        this.f60571g.setOnTouchListener(this);
        this.f60572h.setOnTouchListener(this);
        setOnTouchListener(this);
        this.f60575k.put(this.f60565a, Boolean.valueOf(d1Var.f59451a));
        if ("store".equals(this.f60576l)) {
            this.f60575k.put(this.f60566b, Boolean.valueOf(d1Var.f59461k));
        } else {
            this.f60575k.put(this.f60566b, Boolean.valueOf(d1Var.f59460j));
        }
        this.f60575k.put(this.f60567c, Boolean.valueOf(d1Var.f59452b));
        this.f60575k.put(this.f60571g, Boolean.valueOf(d1Var.f59455e));
        this.f60575k.put(this.f60572h, Boolean.valueOf(d1Var.f59456f));
        this.f60575k.put(this, Boolean.valueOf(d1Var.f59462l));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f60575k.containsKey(view)) {
            return false;
        }
        if (!((Boolean) this.f60575k.get(view)).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            setBackgroundColor(-1);
            View.OnClickListener onClickListener = this.f60577m;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    public void setBanner(@NonNull o4 o4Var) {
        this.f60576l = o4Var.t();
        this.f60565a.setText(o4Var.A());
        this.f60567c.setText(o4Var.k());
        this.f60571g.setRating(o4Var.w());
        this.f60572h.setText(String.valueOf(o4Var.F()));
        if ("store".equals(o4Var.t())) {
            kb.b(this.f60566b, "category_text");
            String strF = o4Var.f();
            String strZ = o4Var.z();
            String str = "";
            if (!TextUtils.isEmpty(strF)) {
                str = "" + strF;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strZ)) {
                str = str + ", ";
            }
            if (!TextUtils.isEmpty(strZ)) {
                str = str + strZ;
            }
            if (TextUtils.isEmpty(str)) {
                this.f60566b.setVisibility(8);
            } else {
                this.f60566b.setText(str);
                this.f60566b.setVisibility(0);
            }
            this.f60568d.setVisibility(0);
            this.f60568d.setGravity(16);
            if (o4Var.w() > 0.0f) {
                this.f60571g.setVisibility(0);
                if (o4Var.F() > 0) {
                    this.f60572h.setVisibility(0);
                } else {
                    this.f60572h.setVisibility(8);
                }
            } else {
                this.f60571g.setVisibility(8);
                this.f60572h.setVisibility(8);
            }
            this.f60566b.setTextColor(-3355444);
        } else {
            kb.b(this.f60566b, "domain_text");
            this.f60568d.setVisibility(8);
            this.f60566b.setText(o4Var.n());
            this.f60568d.setVisibility(8);
            this.f60566b.setTextColor(-16733198);
        }
        if (TextUtils.isEmpty(o4Var.l())) {
            this.f60570f.setVisibility(8);
        } else {
            this.f60570f.setVisibility(0);
            this.f60570f.setText(o4Var.l());
        }
        if (this.f60574j) {
            this.f60565a.setTextSize(2, 32.0f);
            this.f60567c.setTextSize(2, 24.0f);
            this.f60570f.setTextSize(2, 18.0f);
            this.f60566b.setTextSize(2, 18.0f);
            return;
        }
        this.f60565a.setTextSize(2, 20.0f);
        this.f60567c.setTextSize(2, 16.0f);
        this.f60570f.setTextSize(2, 14.0f);
        this.f60566b.setTextSize(2, 16.0f);
    }

    public void a(boolean z10) {
        this.f60569e.setOrientation(1);
        this.f60569e.setGravity(1);
        this.f60565a.setGravity(1);
        this.f60565a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.leftMargin = this.f60573i.b(8);
        layoutParams.rightMargin = this.f60573i.b(8);
        this.f60565a.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        this.f60566b.setLayoutParams(layoutParams2);
        this.f60566b.setLines(1);
        this.f60566b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.f60567c.setGravity(1);
        this.f60567c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (z10) {
            this.f60567c.setTextSize(2, 12.0f);
            this.f60567c.setLines(2);
            this.f60567c.setEllipsize(TextUtils.TruncateAt.END);
            layoutParams3.topMargin = 0;
            layoutParams3.leftMargin = this.f60573i.b(4);
            layoutParams3.rightMargin = this.f60573i.b(4);
        } else {
            this.f60567c.setTextSize(2, 16.0f);
            layoutParams3.topMargin = this.f60573i.b(8);
            layoutParams3.leftMargin = this.f60573i.b(16);
            layoutParams3.rightMargin = this.f60573i.b(16);
        }
        layoutParams3.gravity = 1;
        this.f60567c.setLayoutParams(layoutParams3);
        this.f60568d.setOrientation(0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        this.f60568d.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.f60573i.b(73), this.f60573i.b(12));
        layoutParams5.topMargin = this.f60573i.b(4);
        layoutParams5.rightMargin = this.f60573i.b(4);
        this.f60571g.setLayoutParams(layoutParams5);
        this.f60572h.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60572h.setTextSize(2, 14.0f);
        this.f60570f.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f60570f.setGravity(1);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 1;
        if (z10) {
            layoutParams6.leftMargin = this.f60573i.b(4);
            layoutParams6.rightMargin = this.f60573i.b(4);
        } else {
            layoutParams6.leftMargin = this.f60573i.b(16);
            layoutParams6.rightMargin = this.f60573i.b(16);
        }
        layoutParams6.gravity = 1;
        this.f60570f.setLayoutParams(layoutParams6);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        addView(this.f60569e, layoutParams7);
        this.f60569e.addView(this.f60565a);
        this.f60569e.addView(this.f60566b);
        this.f60569e.addView(this.f60568d);
        this.f60569e.addView(this.f60567c);
        this.f60569e.addView(this.f60570f);
        this.f60568d.addView(this.f60571g);
        this.f60568d.addView(this.f60572h);
    }
}
