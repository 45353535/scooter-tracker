package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5065ec implements LocationReceiverProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77107a = "Location receiver stub";

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f77107a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    @NotNull
    public final LocationReceiver getLocationReceiver(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new C5091fc();
    }
}
