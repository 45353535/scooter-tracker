package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5066ed extends L2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77108b;

    public C5066ed(@NotNull String str, @NotNull InterfaceC5579yl interfaceC5579yl) {
        super(interfaceC5579yl);
        this.f77108b = str;
    }

    @Override // io.appmetrica.analytics.impl.L2
    @NotNull
    public final String a(@NotNull String str) {
        return str + '-' + this.f77108b;
    }
}
