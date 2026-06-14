package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C5023cl;
import io.appmetrica.analytics.impl.C5273me;
import io.appmetrica.analytics.impl.C5437t4;
import io.appmetrica.analytics.impl.C5544xb;
import io.appmetrica.analytics.impl.C5587z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC5129go;
import io.appmetrica.analytics.impl.Nb;

/* JADX INFO: loaded from: classes12.dex */
public final class NumberAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A6 f78925a;

    NumberAttribute(String str, C5544xb c5544xb, Nb nb2) {
        this.f78925a = new A6(str, c5544xb, nb2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValue(double d10) {
        return new UserProfileUpdate<>(new C5273me(this.f78925a.f75496c, d10, new C5544xb(), new C5587z4(new Nb(new C5437t4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueIfUndefined(double d10) {
        return new UserProfileUpdate<>(new C5273me(this.f78925a.f75496c, d10, new C5544xb(), new C5023cl(new Nb(new C5437t4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueReset() {
        return new UserProfileUpdate<>(new Gi(1, this.f78925a.f75496c, new C5544xb(), new Nb(new C5437t4(100))));
    }
}
