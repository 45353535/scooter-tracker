package com.my.target;

import com.my.target.c5;
import com.my.target.v0;

/* JADX INFO: loaded from: classes11.dex */
public class d5 implements c5, v0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4 f59494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5.a f59495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59496c;

    public d5(g4 g4Var, c5.a aVar) {
        this.f59494a = g4Var;
        this.f59495b = aVar;
    }

    public static c5 a(g4 g4Var, c5.a aVar) {
        return new d5(g4Var, aVar);
    }

    @Override // com.my.target.c5
    public void a(v0 v0Var, int i10) {
        this.f59496c = i10;
        this.f59495b.a(this.f59494a);
        v0Var.setBanner(this.f59494a);
        v0Var.setListener(this);
    }

    @Override // com.my.target.c5
    public void a(v0 v0Var) {
        v0Var.setBanner(null);
        v0Var.setListener(null);
    }

    @Override // com.my.target.v0.a
    public void a(boolean z10, int i10) {
        this.f59495b.a(this.f59494a, z10, this.f59496c, i10);
    }
}
