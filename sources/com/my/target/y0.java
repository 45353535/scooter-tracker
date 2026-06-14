package com.my.target;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class y0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f61054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c5 f61055b;

    public y0(v0 v0Var) {
        super(v0Var.a());
        this.f61054a = v0Var;
    }

    public void a(c5 c5Var, int i10) {
        this.f61055b = c5Var;
        c5Var.a(this.f61054a, i10);
    }

    public void a() {
        c5 c5Var = this.f61055b;
        if (c5Var != null) {
            c5Var.a(this.f61054a);
        }
        this.f61055b = null;
    }
}
