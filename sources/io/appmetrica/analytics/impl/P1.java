package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class P1 implements InterfaceC5176ik {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final O1 f76213b = new O1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76214c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5408s0 f76215a;

    public P1(@NotNull InterfaceC5408s0 interfaceC5408s0) {
        this.f76215a = interfaceC5408s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5176ik
    @WorkerThread
    public final void reportData(int i10, @NotNull Bundle bundle) {
        ((M1) this.f76215a).a(bundle);
    }
}
