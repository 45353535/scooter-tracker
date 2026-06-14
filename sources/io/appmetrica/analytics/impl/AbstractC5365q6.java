package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5365q6 implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5340p6 f78033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f78034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T9 f78035c;

    public AbstractC5365q6(InterfaceC5340p6 interfaceC5340p6, ICrashTransformer iCrashTransformer, T9 t92) {
        this.f78033a = interfaceC5340p6;
        this.f78034b = iCrashTransformer;
        this.f78035c = t92;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(@Nullable Throwable th2, @NonNull V v10) {
        if (this.f78033a.a(th2)) {
            ICrashTransformer iCrashTransformer = this.f78034b;
            if (iCrashTransformer == null || th2 == null || (th2 = iCrashTransformer.process(th2)) != null) {
                Sn snA = Vn.a(th2, v10, null, (String) this.f78035c.f76495b.a(), (Boolean) this.f78035c.f76496c.a());
                C5271mc c5271mc = (C5271mc) ((Gh) this).f75831d;
                c5271mc.f76724a.a().a(c5271mc.f77756b).a(snA);
            }
        }
    }

    @VisibleForTesting
    public final InterfaceC5340p6 b() {
        return this.f78033a;
    }

    @Nullable
    @VisibleForTesting
    public final ICrashTransformer a() {
        return this.f78034b;
    }
}
