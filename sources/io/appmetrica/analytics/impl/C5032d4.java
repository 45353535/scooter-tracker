package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5032d4 extends Qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4965af f77002a;

    public C5032d4(@NonNull Context context) {
        this(new C4965af(C5112g7.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i10) {
        this.f77002a.c(i10);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        return (int) this.f77002a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        return new SparseArray<>();
    }

    public C5032d4(C4965af c4965af) {
        this.f77002a = c4965af;
    }
}
