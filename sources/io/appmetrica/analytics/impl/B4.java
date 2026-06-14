package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes12.dex */
public final class B4 implements InterfaceC5263m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E4 f75570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f75571c;

    public B4(@NonNull Context context, @NonNull E4 e42, @NonNull C5512w4 c5512w4) {
        this.f75569a = context;
        this.f75570b = e42;
        this.f75571c = c5512w4.f78482c;
        e42.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5263m4
    public final void a(@NonNull W5 w52, @NonNull C5512w4 c5512w4) {
        this.f75570b.a(c5512w4.f78481b);
        this.f75570b.a(w52, this);
    }

    @NonNull
    public final E4 b() {
        return this.f75570b;
    }

    @NonNull
    public final Context c() {
        return this.f75569a;
    }

    @NonNull
    @VisibleForTesting
    public final ResultReceiver d() {
        return this.f75571c;
    }

    public final void a(@NonNull C4954a4 c4954a4) {
        I6.a(this.f75571c, c4954a4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5263m4
    public final void a() {
        this.f75570b.b(this);
    }
}
