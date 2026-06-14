package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Xi extends kotlin.coroutines.jvm.internal.k implements Function1 {
    public Xi(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new Xi(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Xi((Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Intrinsics.checkNotNullExpressionValue(Yi.f38063b, "access$getTAG$p(...)");
        C3880mb c3880mb = C3880mb.f39026a;
        if (C3880mb.d()) {
            LocationManager locationManager = C3880mb.f39027b;
            if (locationManager != null) {
                locationManager.removeUpdates(c3880mb);
            }
            GoogleApiClient googleApiClient = C3880mb.f39029d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        C3880mb.f39029d = null;
        return Unit.f93236a;
    }
}
