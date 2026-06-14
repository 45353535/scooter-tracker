package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.my.target.common.views.StarsRatingView;
import com.my.target.nativeads.constants.NativeAdColor;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class u0 extends ViewGroup implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f60871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f60872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f60873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f60874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb f60875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StarsRatingView f60876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f60877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f60878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f60879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnClickListener f60880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View.OnClickListener f60881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f60882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f60883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f60884n;

    public u0(boolean z10, Context context) {
        super(context);
        this.f60878h = new HashMap();
        this.f60879i = z10;
        this.f60875e = kb.e(context);
        this.f60871a = new ma(context);
        this.f60872b = new TextView(context);
        this.f60873c = new TextView(context);
        this.f60874d = new Button(context);
        this.f60876f = new StarsRatingView(context);
        this.f60877g = new TextView(context);
        a();
    }

    public void a(View.OnClickListener onClickListener, d1 d1Var, View.OnClickListener onClickListener2) {
        this.f60880j = onClickListener;
        this.f60881k = onClickListener2;
        if (onClickListener == null || d1Var == null) {
            super.setOnClickListener(null);
            this.f60874d.setOnClickListener(null);
            return;
        }
        setOnTouchListener(this);
        this.f60871a.setOnTouchListener(this);
        this.f60872b.setOnTouchListener(this);
        this.f60873c.setOnTouchListener(this);
        this.f60876f.setOnTouchListener(this);
        this.f60877g.setOnTouchListener(this);
        this.f60874d.setOnTouchListener(this);
        boolean z10 = true;
        this.f60878h.put(this.f60871a, Boolean.valueOf(d1Var.f59454d || d1Var.f59463m));
        this.f60878h.put(this, Boolean.valueOf(d1Var.f59462l || d1Var.f59463m));
        this.f60878h.put(this.f60872b, Boolean.valueOf(d1Var.f59451a || d1Var.f59463m));
        this.f60878h.put(this.f60873c, Boolean.valueOf(d1Var.f59452b || d1Var.f59463m));
        this.f60878h.put(this.f60876f, Boolean.valueOf(d1Var.f59455e || d1Var.f59463m));
        this.f60878h.put(this.f60877g, Boolean.valueOf(d1Var.f59460j || d1Var.f59463m));
        HashMap map = this.f60878h;
        Button button = this.f60874d;
        if (!d1Var.f59457g && !d1Var.f59463m) {
            z10 = false;
        }
        map.put(button, Boolean.valueOf(z10));
    }

    @NonNull
    public Button getCtaButtonView() {
        return this.f60874d;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.f60873c;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.f60877g;
    }

    @NonNull
    public StarsRatingView getRatingView() {
        return this.f60876f;
    }

    @NonNull
    public ma getSmartImageView() {
        return this.f60871a;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.f60872b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = (i12 - i10) - (this.f60883m * 2);
        boolean z11 = !this.f60879i && getResources().getConfiguration().orientation == 2;
        ma maVar = this.f60871a;
        maVar.layout(0, 0, maVar.getMeasuredWidth(), this.f60871a.getMeasuredHeight());
        if (z11) {
            this.f60872b.setTypeface(null, 1);
            this.f60872b.layout(0, this.f60871a.getBottom(), i14, this.f60871a.getBottom() + this.f60872b.getMeasuredHeight());
            kb.a(this, 0, 0);
            this.f60873c.layout(0, 0, 0, 0);
            this.f60874d.layout(0, 0, 0, 0);
            this.f60876f.layout(0, 0, 0, 0);
            this.f60877g.layout(0, 0, 0, 0);
            return;
        }
        this.f60872b.setTypeface(null, 0);
        kb.a(this, 0, 0, -3355444, this.f60875e.b(1), 0);
        this.f60872b.layout(this.f60883m + this.f60884n, this.f60871a.getBottom(), this.f60872b.getMeasuredWidth() + this.f60883m + this.f60884n, this.f60871a.getBottom() + this.f60872b.getMeasuredHeight());
        this.f60873c.layout(this.f60883m + this.f60884n, this.f60872b.getBottom(), this.f60873c.getMeasuredWidth() + this.f60883m + this.f60884n, this.f60872b.getBottom() + this.f60873c.getMeasuredHeight());
        int measuredWidth = (i14 - this.f60874d.getMeasuredWidth()) / 2;
        Button button = this.f60874d;
        button.layout(measuredWidth, (i13 - button.getMeasuredHeight()) - this.f60884n, this.f60874d.getMeasuredWidth() + measuredWidth, i13 - this.f60884n);
        int measuredWidth2 = (i14 - this.f60876f.getMeasuredWidth()) / 2;
        this.f60876f.layout(measuredWidth2, (this.f60874d.getTop() - this.f60884n) - this.f60876f.getMeasuredHeight(), this.f60876f.getMeasuredWidth() + measuredWidth2, this.f60874d.getTop() - this.f60884n);
        int measuredWidth3 = (i14 - this.f60877g.getMeasuredWidth()) / 2;
        this.f60877g.layout(measuredWidth3, (this.f60874d.getTop() - this.f60877g.getMeasuredHeight()) - this.f60884n, this.f60877g.getMeasuredWidth() + measuredWidth3, this.f60874d.getTop() - this.f60884n);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        int measuredHeight2;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = !this.f60879i && getResources().getConfiguration().orientation == 2;
        a(size, size2, z10, size != 0 ? Integer.MIN_VALUE : 0);
        if (z10) {
            measuredHeight = size2 - this.f60872b.getMeasuredHeight();
            measuredHeight2 = this.f60883m;
        } else {
            measuredHeight = (((size2 - this.f60874d.getMeasuredHeight()) - (this.f60882l * 2)) - Math.max(this.f60876f.getMeasuredHeight(), this.f60877g.getMeasuredHeight())) - this.f60873c.getMeasuredHeight();
            measuredHeight2 = this.f60872b.getMeasuredHeight();
        }
        int i12 = measuredHeight - measuredHeight2;
        if (i12 <= size) {
            size = i12;
        }
        this.f60871a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f60878h.containsKey(view)) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) this.f60878h.get(view)).booleanValue();
        view.setClickable(zBooleanValue);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.f60880j != null) {
                    boolean zEquals = Boolean.TRUE.equals(this.f60878h.get(this.f60874d));
                    View.OnClickListener onClickListener = this.f60881k;
                    if (onClickListener != null && view == this.f60874d && zEquals) {
                        onClickListener.onClick(view);
                    } else {
                        this.f60880j.onClick(view);
                    }
                }
                if (zBooleanValue) {
                    Button button = this.f60874d;
                    if (view == button) {
                        button.setPressed(false);
                    } else {
                        kb.a(this, 0, 0, -3355444, this.f60875e.b(1), 0);
                    }
                }
            } else if (action == 3 && zBooleanValue) {
                Button button2 = this.f60874d;
                if (view == button2) {
                    button2.setPressed(false);
                } else {
                    kb.a(this, 0, 0, -3355444, this.f60875e.b(1), 0);
                }
            }
        } else if (zBooleanValue) {
            Button button3 = this.f60874d;
            if (view == button3) {
                button3.setPressed(true);
            } else {
                setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
            }
        }
        return true;
    }

    public final void a() {
        kb.a(this, 0, 0, -3355444, this.f60875e.b(1), 0);
        this.f60883m = this.f60875e.b(2);
        this.f60884n = this.f60875e.b(12);
        this.f60874d.setPadding(this.f60875e.b(15), this.f60875e.b(10), this.f60875e.b(15), this.f60875e.b(10));
        this.f60874d.setMinimumWidth(this.f60875e.b(100));
        this.f60874d.setTransformationMethod(null);
        this.f60874d.setSingleLine();
        if (this.f60879i) {
            this.f60874d.setTextSize(20.0f);
        } else {
            this.f60874d.setTextSize(18.0f);
        }
        Button button = this.f60874d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        this.f60874d.setElevation(this.f60875e.b(2));
        this.f60882l = this.f60875e.b(12);
        kb.b(this.f60874d, -16733198, -16746839, this.f60875e.b(2));
        this.f60874d.setTextColor(-1);
        if (this.f60879i) {
            this.f60872b.setTextSize(20.0f);
        } else {
            this.f60872b.setTextSize(18.0f);
        }
        this.f60872b.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f60872b.setTypeface(null, 1);
        this.f60872b.setLines(1);
        this.f60872b.setEllipsize(truncateAt);
        this.f60873c.setTextColor(-7829368);
        this.f60873c.setLines(2);
        if (this.f60879i) {
            this.f60873c.setTextSize(20.0f);
        } else {
            this.f60873c.setTextSize(18.0f);
        }
        this.f60873c.setEllipsize(truncateAt);
        if (this.f60879i) {
            this.f60876f.setStarSize(this.f60875e.b(24));
        } else {
            this.f60876f.setStarSize(this.f60875e.b(18));
        }
        this.f60876f.setStarsPadding(this.f60875e.b(4));
        kb.b(this, "card_view");
        kb.b(this.f60872b, "card_title_text");
        kb.b(this.f60873c, "card_description_text");
        kb.b(this.f60877g, "card_domain_text");
        kb.b(this.f60874d, "card_cta_button");
        kb.b(this.f60876f, "card_stars_view");
        kb.b(this.f60871a, "card_image");
        addView(this.f60871a);
        addView(this.f60873c);
        addView(this.f60872b);
        addView(this.f60874d);
        addView(this.f60876f);
        addView(this.f60877g);
    }

    public final void a(int i10, int i11, boolean z10, int i12) {
        int i13 = this.f60883m * 2;
        int i14 = i11 - i13;
        int i15 = i10 - i13;
        if (z10) {
            this.f60872b.measure(View.MeasureSpec.makeMeasureSpec(i10, i12), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
            this.f60873c.measure(0, 0);
            this.f60876f.measure(0, 0);
            this.f60877g.measure(0, 0);
            this.f60874d.measure(0, 0);
            return;
        }
        this.f60872b.measure(View.MeasureSpec.makeMeasureSpec(i15 - (this.f60884n * 2), i12), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60873c.measure(View.MeasureSpec.makeMeasureSpec(i15 - (this.f60884n * 2), i12), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60876f.measure(View.MeasureSpec.makeMeasureSpec(i15, i12), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60877g.measure(View.MeasureSpec.makeMeasureSpec(i15, i12), View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
        this.f60874d.measure(View.MeasureSpec.makeMeasureSpec(i15 - (this.f60884n * 2), i12), View.MeasureSpec.makeMeasureSpec(i14 - (this.f60884n * 2), Integer.MIN_VALUE));
    }
}
