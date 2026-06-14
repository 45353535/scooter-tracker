package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements LastKnownLocationExtractorProvider, LocationReceiverProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78720a = "location-passive-provider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f78721b;

    @NotNull
    public final r a(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @NotNull
    public final r b(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    public final synchronized r c(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        r rVar;
        try {
            if (this.f78721b == null) {
                this.f78721b = new r(context, iHandlerExecutor.getLooper(), new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION"), locationListener);
            }
            rVar = this.f78721b;
            if (rVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("passiveProviderLocationReceiver");
                rVar = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return rVar;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f78720a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}
