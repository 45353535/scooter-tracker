package io.appmetrica.analytics.impl;

import android.os.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5444tb implements InterfaceC5074el {
    @Override // io.appmetrica.analytics.impl.InterfaceC5074el
    public final boolean a(@NotNull C5370qb c5370qb) {
        Integer num = c5370qb.f78064f;
        return num == null || num.intValue() != Process.myPid();
    }
}
