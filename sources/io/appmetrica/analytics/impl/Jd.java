package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Jd implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xg f75995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F0 f75996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sd f75997c;

    public Jd(@NotNull Xg xg2, @NotNull F0 f02, @NotNull Sd sd2) {
        this.f75995a = xg2;
        this.f75996b = f02;
        this.f75997c = sd2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@NotNull String str) {
        Xg xg2 = this.f75995a;
        F0 f02 = this.f75996b;
        String str2 = f02.f75748a;
        String str3 = f02.f75749b;
        Integer numValueOf = Integer.valueOf(f02.f75751d);
        F0 f03 = this.f75996b;
        X3 x32 = new X3(str2, str3, numValueOf, f03.f75752e, f03.f75750c);
        Sd sd2 = this.f75997c;
        EnumC5168ib enumC5168ib = sd2.f76440b;
        E0 e02 = sd2.f76439a;
        String str4 = e02.f75691c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(e02.f75694f.f75748a);
        Set set = D9.f75657a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        U3 u32 = new U3("", "", enumC5168ib.f77427a, orCreatePublicLogger);
        if (str != null) {
            u32.f(str);
        }
        u32.f76626m = bundle;
        u32.f76616c = sd2.f76439a.f75694f.f75753f;
        xg2.a(x32, u32, new C5512w4(new C5050dm(), new C5487v4(), null));
    }
}
