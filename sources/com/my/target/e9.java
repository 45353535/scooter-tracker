package com.my.target;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8 f59597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f59598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59599c = true;

    public e9(l8 l8Var, Context context) {
        this.f59597a = l8Var;
        this.f59598b = context;
    }

    public static e9 a(l8 l8Var, Context context) {
        return new e9(l8Var, context);
    }

    public i5 b() {
        return new d9(this.f59598b, this);
    }

    public i5 c() {
        return new l9(this.f59598b, this.f59599c);
    }

    public void a(boolean z10) {
        this.f59599c = z10;
    }

    public pb b(kb kbVar, boolean z10) {
        return new pb(this.f59598b, kbVar, z10);
    }

    public q8 a(s5 s5Var) {
        return q8.a(s5Var, this.f59597a, this.f59598b);
    }

    public c1 a() {
        return new c1(this.f59598b);
    }

    public g9 a(kb kbVar, boolean z10) {
        return new g9(this.f59598b, kbVar, z10, this.f59599c);
    }
}
