package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A6;
import io.appmetrica.analytics.impl.C5023cl;
import io.appmetrica.analytics.impl.C5082f3;
import io.appmetrica.analytics.impl.C5587z4;
import io.appmetrica.analytics.impl.Gi;
import io.appmetrica.analytics.impl.InterfaceC5129go;
import io.appmetrica.analytics.impl.InterfaceC5410s2;
import io.appmetrica.analytics.impl.uo;

/* JADX INFO: loaded from: classes12.dex */
public class BooleanAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A6 f78920a;

    BooleanAttribute(String str, uo uoVar, InterfaceC5410s2 interfaceC5410s2) {
        this.f78920a = new A6(str, uoVar, interfaceC5410s2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValue(boolean z10) {
        A6 a62 = this.f78920a;
        return new UserProfileUpdate<>(new C5082f3(a62.f75496c, z10, a62.f75494a, new C5587z4(a62.f75495b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueIfUndefined(boolean z10) {
        A6 a62 = this.f78920a;
        return new UserProfileUpdate<>(new C5082f3(a62.f75496c, z10, a62.f75494a, new C5023cl(a62.f75495b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5129go> withValueReset() {
        A6 a62 = this.f78920a;
        return new UserProfileUpdate<>(new Gi(3, a62.f75496c, a62.f75494a, a62.f75495b));
    }
}
