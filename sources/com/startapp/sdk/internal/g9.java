package com.startapp.sdk.internal;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9 f64550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f64553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f64554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f64555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f64556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f64557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f64558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f64559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f64560k;

    public g9(h9 h9Var) {
        if (h9Var != h9.f64611f) {
            this.f64550a = h9Var;
        } else {
            this.f64550a = h9.f64610e;
        }
        h9 h9Var2 = this.f64550a;
        if (h9Var2 == h9.f64610e || h9Var2 == h9.f64609d) {
            this.f64558i = vi.a(vi.a(0));
        }
        this.f64551b = 0L;
    }

    @DoNotInline
    public static void a(@NonNull Throwable th2) {
        try {
            new g9(th2).a();
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.U.f65426a;
            if (aVar != null) {
                ((w9) aVar.f64190q.a()).a(this);
            }
        } catch (Throwable unused) {
        }
    }

    @DoNotInline
    public static void a(@NonNull Throwable th2, @NonNull h9 h9Var) {
        try {
            new g9(th2, h9Var).a();
        } catch (Throwable unused) {
        }
    }

    public g9(Throwable th2) {
        this.f64550a = h9.f64611f;
        this.f64554e = vi.b(th2);
        this.f64553d = vi.a(vi.a(th2));
        this.f64558i = vi.a(vi.a(1));
        this.f64551b = 0L;
    }

    public g9(Throwable th2, h9 h9Var) {
        boolean z10 = h9Var == h9.f64612g;
        this.f64550a = h9Var;
        this.f64554e = vi.b(th2);
        this.f64553d = vi.a(vi.a(th2));
        this.f64558i = z10 ? th2.getClass().getName() : vi.a(vi.a(1));
        this.f64551b = 0L;
    }

    public g9(h9 h9Var, long j10) {
        this.f64550a = h9Var;
        this.f64551b = j10;
    }
}
