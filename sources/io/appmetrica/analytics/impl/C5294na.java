package io.appmetrica.analytics.impl;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5294na extends H4 {
    public C5294na(@NotNull E4 e42) {
        super(e42);
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(@NotNull W5 w52, @NotNull B4 b42) {
        Bundle bundle = w52.f76626m;
        C5064eb c5064eb = bundle != null ? (C5064eb) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (c5064eb != null) {
            if (c5064eb.f77106d) {
                C5487v4 c5487v4 = b42.f75570b.f75712d.f75740a;
                Boolean bool = c5487v4.f78422n;
                Boolean bool2 = c5487v4.f78417i;
                C5468ua.H.c().c(bool != null ? bool.booleanValue() : true);
                C5468ua.H.h().b(bool2);
            }
        }
        this.f75841a.a(c5064eb);
        return false;
    }
}
