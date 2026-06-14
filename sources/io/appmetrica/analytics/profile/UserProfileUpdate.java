package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Hd;
import io.appmetrica.analytics.impl.InterfaceC5129go;

/* JADX INFO: loaded from: classes12.dex */
public class UserProfileUpdate<T extends InterfaceC5129go> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5129go f78930a;

    UserProfileUpdate(Hd hd2) {
        this.f78930a = hd2;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f78930a;
    }
}
