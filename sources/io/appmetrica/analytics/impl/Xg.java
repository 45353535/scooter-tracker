package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Xg implements InterfaceC5214k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5161i4 f76668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f76669c = C5468ua.k().x().e();

    public Xg(@NotNull Context context, @NotNull C5161i4 c5161i4) {
        this.f76667a = context;
        this.f76668b = c5161i4;
    }

    public final void a(@NotNull W5 w52, @Nullable Bundle bundle) {
        if (w52.m()) {
            return;
        }
        this.f76669c.execute(new RunnableC5376qh(this.f76667a, w52, bundle, this.f76668b));
    }

    public final void a(@NotNull X3 x32, @NotNull W5 w52, @NotNull C5512w4 c5512w4) {
        this.f76668b.a(x32, c5512w4).a(w52, c5512w4);
        this.f76668b.a(x32.f76658b, x32.f76659c, x32.f76660d);
    }
}
