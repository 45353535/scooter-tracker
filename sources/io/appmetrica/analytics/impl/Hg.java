package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes12.dex */
public final class Hg implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5084f5 f75867a;

    public Hg(@NonNull InterfaceC5084f5 interfaceC5084f5) {
        this.f75867a = interfaceC5084f5;
    }

    @Override // io.appmetrica.analytics.impl.U7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Gg a(@NonNull Context context, @NonNull X4 x42, @NonNull C5512w4 c5512w4) {
        return new Gg(context, x42, c5512w4, this.f75867a, new Y4(), Ll.a());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5084f5 a() {
        return this.f75867a;
    }
}
