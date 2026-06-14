package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5078f implements InterfaceC5263m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gg f77138b;

    public AbstractC5078f(@NonNull Context context, @NonNull Gg gg2) {
        this.f77137a = context.getApplicationContext();
        this.f77138b = gg2;
        gg2.a(this);
        C5468ua.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5263m4
    public final void a(@NonNull W5 w52, @NonNull C5512w4 c5512w4) {
        b(w52, c5512w4);
    }

    @NonNull
    public final Gg b() {
        return this.f77138b;
    }

    public abstract void b(@NonNull W5 w52, @NonNull C5512w4 c5512w4);

    @NonNull
    public final Context c() {
        return this.f77137a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5263m4
    public final void a() {
        this.f77138b.b(this);
        C5468ua.H.m().a(this);
    }
}
