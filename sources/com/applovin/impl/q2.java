package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f10224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f10225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f10226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f10227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r2 f10228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10229f;

    public void a(int i10) {
        this.f10229f = i10;
    }

    public r2 b() {
        return this.f10228e;
    }

    public int a() {
        return this.f10229f;
    }

    public void a(r2 r2Var) {
        this.f10228e = r2Var;
        this.f10224a.setText(r2Var.k());
        this.f10224a.setTextColor(r2Var.l());
        if (this.f10225b != null) {
            if (!TextUtils.isEmpty(r2Var.f())) {
                this.f10225b.setTypeface(null, 0);
                this.f10225b.setVisibility(0);
                this.f10225b.setText(r2Var.f());
                this.f10225b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.f10225b.setTypeface(null, 1);
                }
            } else {
                this.f10225b.setVisibility(8);
            }
        }
        if (this.f10226c != null) {
            if (r2Var.h() > 0) {
                this.f10226c.setImageResource(r2Var.h());
                this.f10226c.setColorFilter(r2Var.i());
                this.f10226c.setVisibility(0);
            } else {
                this.f10226c.setVisibility(8);
            }
        }
        if (this.f10227d != null) {
            if (r2Var.d() > 0) {
                this.f10227d.setImageResource(r2Var.d());
                this.f10227d.setColorFilter(r2Var.e());
                this.f10227d.setVisibility(0);
                return;
            }
            this.f10227d.setVisibility(8);
        }
    }
}
