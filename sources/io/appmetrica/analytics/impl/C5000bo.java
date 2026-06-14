package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5000bo extends H4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L6 f76930b;

    public C5000bo(@NonNull E4 e42, @NonNull L6 l62) {
        super(e42);
        this.f76930b = l62;
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(@NonNull W5 w52, @NonNull B4 b42) {
        C5487v4 c5487v4 = b42.f75570b.f75712d.f75740a;
        this.f76930b.a(c5487v4.f78417i);
        Rb rbM = C5468ua.H.m();
        if (Boolean.TRUE.equals(c5487v4.f78410b)) {
            rbM.a(true);
        } else {
            if (Boolean.FALSE.equals(c5487v4.f78410b)) {
                rbM.a(false);
            }
        }
        rbM.a(c5487v4.f78411c);
        Boolean bool = c5487v4.f78422n;
        C5468ua.H.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
