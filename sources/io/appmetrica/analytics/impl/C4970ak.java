package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4970ak extends C5058e5 {
    public C4970ak(@NonNull Context context, @NonNull C5204jm c5204jm, @NonNull X4 x42, @NonNull C5487v4 c5487v4, @NonNull InterfaceC5276mh interfaceC5276mh, @NonNull AbstractC5007c5 abstractC5007c5, @NonNull W4 w42) {
        this(context, x42, new C5208k0(), new TimePassedChecker(), new C5187j5(context, x42, c5487v4, abstractC5007c5, c5204jm, interfaceC5276mh, C5468ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5468ua.k().l(), w42), c5487v4);
    }

    @Override // io.appmetrica.analytics.impl.C5058e5, io.appmetrica.analytics.impl.La
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C4970ak(Context context, X4 x42, C5208k0 c5208k0, TimePassedChecker timePassedChecker, C5187j5 c5187j5, C5487v4 c5487v4) {
        super(context, x42, c5208k0, timePassedChecker, c5187j5, c5487v4);
    }
}
