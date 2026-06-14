package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C5544xb;
import io.appmetrica.analytics.impl.InterfaceC5129go;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.impl.X5;

/* JADX INFO: loaded from: classes12.dex */
public final class CounterAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A6 f78921a;

    CounterAttribute(String str, C5544xb c5544xb, Nb nb2) {
        this.f78921a = new A6(str, c5544xb, nb2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withDelta(double d10) {
        return new UserProfileUpdate<>(new X5(this.f78921a.f75496c, d10));
    }
}
