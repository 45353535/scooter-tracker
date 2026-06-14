package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.my.target.nativeads.constants.NativeAdColor;
import com.my.target.nativeads.views.MediaAdView;

/* JADX INFO: loaded from: classes11.dex */
public class pb extends RelativeLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f60557g = kb.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60558h = kb.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f60559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f60560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f60561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2 f60562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb f60563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f60564f;

    public pb(Context context, kb kbVar, boolean z10) {
        super(context);
        this.f60563e = kbVar;
        this.f60564f = z10;
        f2 f2Var = new f2(context, kbVar, z10);
        this.f60562d = f2Var;
        kb.b(f2Var, "footer_layout");
        q0 q0Var = new q0(context, kbVar, z10);
        this.f60559a = q0Var;
        kb.b(q0Var, "body_layout");
        Button button = new Button(context);
        this.f60560b = button;
        kb.b(button, "cta_button");
        r0 r0Var = new r0(context);
        this.f60561c = r0Var;
        kb.b(r0Var, "age_bordering");
    }

    public void a(int i10, int i11, boolean z10) {
        int iMax = Math.max(i11, i10) / 8;
        this.f60559a.a(z10);
        this.f60562d.a();
        View view = new View(getContext());
        view.setBackgroundColor(-5592406);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
        f2 f2Var = this.f60562d;
        int i12 = f60557g;
        f2Var.setId(i12);
        this.f60562d.a(iMax, z10);
        this.f60560b.setPadding(this.f60563e.b(15), 0, this.f60563e.b(15), 0);
        this.f60560b.setMinimumWidth(this.f60563e.b(100));
        this.f60560b.setTransformationMethod(null);
        this.f60560b.setSingleLine();
        this.f60560b.setEllipsize(TextUtils.TruncateAt.END);
        this.f60561c.a(1, -7829368);
        this.f60561c.setPadding(this.f60563e.b(2), 0, 0, 0);
        this.f60561c.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        this.f60561c.setMaxEms(5);
        this.f60561c.a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f60563e.b(3));
        this.f60561c.setBackgroundColor(1711276032);
        q0 q0Var = this.f60559a;
        int i13 = f60558h;
        q0Var.setId(i13);
        if (z10) {
            this.f60559a.setPadding(this.f60563e.b(4), this.f60563e.b(4), this.f60563e.b(4), this.f60563e.b(4));
        } else {
            this.f60559a.setPadding(this.f60563e.b(16), this.f60563e.b(16), this.f60563e.b(16), this.f60563e.b(16));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, i12);
        this.f60559a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(this.f60563e.b(16), z10 ? this.f60563e.b(8) : this.f60563e.b(16), this.f60563e.b(16), this.f60563e.b(4));
        layoutParams2.addRule(21, -1);
        this.f60561c.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, this.f60564f ? this.f60563e.b(64) : this.f60563e.b(52));
        layoutParams3.addRule(14, -1);
        layoutParams3.addRule(8, i13);
        if (z10) {
            layoutParams3.bottomMargin = (int) (((double) (-this.f60563e.b(52))) / 1.5d);
        } else {
            layoutParams3.bottomMargin = (-this.f60563e.b(52)) / 2;
        }
        this.f60560b.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, iMax);
        layoutParams4.addRule(12, -1);
        this.f60562d.setLayoutParams(layoutParams4);
        addView(this.f60559a);
        addView(view);
        addView(this.f60561c);
        addView(this.f60562d);
        addView(this.f60560b);
        setClickable(true);
        if (this.f60564f) {
            this.f60560b.setTextSize(2, 32.0f);
        } else {
            this.f60560b.setTextSize(2, 22.0f);
        }
    }

    public void setBanner(@NonNull o4 o4Var) {
        this.f60559a.setBanner(o4Var);
        this.f60560b.setText(o4Var.i());
        this.f60562d.setBackgroundColor(-39322);
        if (TextUtils.isEmpty(o4Var.c())) {
            this.f60561c.setVisibility(8);
        } else {
            this.f60561c.setText(o4Var.c());
        }
        kb.b(this.f60560b, -16733198, -16746839, this.f60563e.b(2));
        this.f60560b.setTextColor(-1);
    }

    public void a(final d1 d1Var, final m8 m8Var) {
        final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: k5.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86125b.a(m8Var, view);
            }
        };
        this.f60559a.a(d1Var, onClickListener);
        if (d1Var.f59463m) {
            this.f60560b.setOnClickListener(onClickListener);
            return;
        }
        if (d1Var.f59457g) {
            this.f60560b.setOnClickListener(onClickListener);
            this.f60560b.setEnabled(true);
        } else {
            this.f60560b.setOnClickListener(null);
            this.f60560b.setEnabled(false);
        }
        this.f60561c.setOnTouchListener(new View.OnTouchListener() { // from class: k5.s1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f86130b.a(d1Var, onClickListener, view, motionEvent);
            }
        });
    }

    public final /* synthetic */ void a(m8 m8Var, View view) {
        m8Var.a(view, view == this.f60560b ? 2 : 1);
    }

    public final /* synthetic */ boolean a(d1 d1Var, View.OnClickListener onClickListener, View view, MotionEvent motionEvent) {
        if (!d1Var.f59458h) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f60559a.setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            this.f60559a.setBackgroundColor(-1);
            onClickListener.onClick(view);
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }
}
