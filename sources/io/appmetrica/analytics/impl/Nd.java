package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Nd implements InterfaceC5074el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76164a;

    public Nd(int i10) {
        this.f76164a = i10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5074el
    public final boolean a(@NotNull String str) {
        return this.f76164a != Process.myPid();
    }
}
