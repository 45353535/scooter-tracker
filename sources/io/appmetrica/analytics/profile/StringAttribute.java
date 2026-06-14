package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C4973an;
import io.appmetrica.analytics.impl.C4999bn;
import io.appmetrica.analytics.impl.C5023cl;
import io.appmetrica.analytics.impl.C5587z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC5129go;
import io.appmetrica.analytics.impl.InterfaceC5410s2;
import io.appmetrica.analytics.impl.Nn;
import io.appmetrica.analytics.impl.uo;

/* JADX INFO: loaded from: classes12.dex */
public class StringAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Nn f78926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A6 f78927b;

    StringAttribute(String str, C4973an c4973an, uo uoVar, InterfaceC5410s2 interfaceC5410s2) {
        this.f78927b = new A6(str, uoVar, interfaceC5410s2);
        this.f78926a = c4973an;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValue(@NonNull String str) {
        A6 a62 = this.f78927b;
        return new UserProfileUpdate<>(new C4999bn(a62.f75496c, str, this.f78926a, a62.f75494a, new C5587z4(a62.f75495b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueIfUndefined(@NonNull String str) {
        A6 a62 = this.f78927b;
        return new UserProfileUpdate<>(new C4999bn(a62.f75496c, str, this.f78926a, a62.f75494a, new C5023cl(a62.f75495b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueReset() {
        A6 a62 = this.f78927b;
        return new UserProfileUpdate<>(new Gi(0, a62.f75496c, a62.f75494a, a62.f75495b));
    }
}
