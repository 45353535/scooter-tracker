package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Ei extends H4 {
    public Ei(E4 e42) {
        super(e42);
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(@NonNull W5 w52, @NonNull B4 b42) {
        Bundle bundle = w52.f76626m;
        this.f75841a.f75719k.a(new D4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
