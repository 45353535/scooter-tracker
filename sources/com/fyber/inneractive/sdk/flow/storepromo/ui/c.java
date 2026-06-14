package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f20973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f20974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animation f20975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animation f20976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f20977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f20978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f20979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20980h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f20981i = new a(this);

    public c(Context context, View view, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        float f10;
        this.f20973a = view;
        this.f20975c = AnimationUtils.loadAnimation(context, R.anim.store_promo_appear_anim);
        this.f20976d = AnimationUtils.loadAnimation(context, R.anim.store_promo_disappear_anim);
        o oVar = IAConfigManager.O.f20315u.f20484b;
        oVar.getClass();
        try {
            f10 = Float.parseFloat(oVar.a("dtx_store_promo_height", Float.toString(0.7f)));
        } catch (Throwable unused) {
            f10 = 0.7f;
        }
        this.f20979g = Math.max(f10, 0.7f);
        this.f20978f = bVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dt_store_promo_layout, (ViewGroup) null);
        this.f20974b = viewGroup;
        viewGroup.setOnClickListener(null);
        this.f20974b.setBackgroundColor(context.getResources().getColor(R.color.dtx_store_promo_bg_fade));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        this.f20973a.setLayoutParams(layoutParams2);
        this.f20974b.setVisibility(8);
        ViewGroup viewGroup2 = this.f20974b;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
            this.f20974b.addView(this.f20973a);
        }
        if (this.f20977e == null) {
            b bVar2 = new b(this);
            this.f20977e = bVar2;
            com.fyber.inneractive.sdk.util.o.f23888a.registerReceiver(bVar2, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void a() {
        View view;
        int iC = com.fyber.inneractive.sdk.util.o.c();
        if (iC == this.f20980h || (view = this.f20973a) == null || view.getLayoutParams() == null) {
            return;
        }
        this.f20980h = iC;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20973a.getLayoutParams();
        layoutParams.height = iC == 2 ? com.fyber.inneractive.sdk.util.o.e() : (int) (com.fyber.inneractive.sdk.util.o.d() * this.f20979g);
        this.f20973a.setLayoutParams(layoutParams);
    }
}
