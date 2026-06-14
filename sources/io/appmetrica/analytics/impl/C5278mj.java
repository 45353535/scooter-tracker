package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5278mj implements InterfaceC5263m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gg f77764a;

    public C5278mj(@Nullable Gg gg2) {
        this.f77764a = gg2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5263m4
    public final void a() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5263m4
    public final void a(@NonNull W5 w52, @NonNull C5512w4 c5512w4) {
        Gg gg2 = this.f77764a;
        if (gg2 != null) {
            gg2.a(w52, c5512w4);
        }
    }
}
