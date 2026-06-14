package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes11.dex */
public class f2 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f59631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f59632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f59633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kb f59634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f59635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnClickListener f59636f;

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f59637a;

        public a(Context context) {
            this.f59637a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://target.my.com/"));
                if (!(this.f59637a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.f59637a.startActivity(intent);
            } catch (Throwable th2) {
                gb.a("FooterView$GoToMyTargetClickListener: Error - " + th2.getMessage());
            }
        }
    }

    public f2(Context context, kb kbVar, boolean z10) {
        super(context);
        this.f59631a = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.f59632b = imageView;
        kb.b(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.f59633c = imageView2;
        kb.b(imageView2, "store_image");
        this.f59634d = kbVar;
        this.f59635e = z10;
        this.f59636f = new a(context);
    }

    public void a() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f59631a.setLayoutParams(layoutParams);
        this.f59632b.setImageBitmap(q4.a(getContext()));
        this.f59631a.addView(this.f59632b);
        this.f59631a.addView(this.f59633c);
        addView(this.f59631a);
    }

    public void a(int i10, boolean z10) {
        int i11 = i10 / 3;
        if (this.f59635e) {
            i11 = i10 / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i11);
        if (z10) {
            layoutParams.setMargins(this.f59634d.b(24), this.f59634d.b(4), this.f59634d.b(24), this.f59634d.b(8));
        } else {
            layoutParams.setMargins(this.f59634d.b(24), this.f59634d.b(16), this.f59634d.b(24), this.f59634d.b(16));
        }
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20);
        this.f59633c.setScaleType(ImageView.ScaleType.FIT_START);
        this.f59633c.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, i11);
        if (z10) {
            layoutParams2.setMargins(this.f59634d.b(8), this.f59634d.b(4), this.f59634d.b(8), this.f59634d.b(8));
        } else {
            layoutParams2.setMargins(this.f59634d.b(24), this.f59634d.b(16), this.f59634d.b(24), this.f59634d.b(16));
        }
        layoutParams2.addRule(15, -1);
        layoutParams2.addRule(21);
        this.f59632b.setScaleType(ImageView.ScaleType.FIT_END);
        this.f59632b.setLayoutParams(layoutParams2);
        this.f59632b.setOnClickListener(this.f59636f);
    }
}
