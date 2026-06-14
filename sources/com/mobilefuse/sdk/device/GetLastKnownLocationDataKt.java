package com.mobilefuse.sdk.device;

import android.location.Location;
import android.os.SystemClock;
import com.mobilefuse.sdk.LocationService;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"getLastKnownLocationData", "Lcom/mobilefuse/sdk/device/LocationData;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class GetLastKnownLocationDataKt {
    @Nullable
    public static final LocationData getLastKnownLocationData() {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object value = null;
        try {
            Location lastKnownLocation = LocationService.getLastKnownLocation();
            if (lastKnownLocation == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(lastKnownLocation, "LocationService.getLastK…Location() ?: return null");
            float accuracy = lastKnownLocation.getAccuracy();
            Integer numValueOf = (accuracy == 0.0f || Float.isNaN(accuracy)) ? null : Integer.valueOf(a.d(accuracy));
            double altitude = lastKnownLocation.getAltitude();
            errorResult = new SuccessResult(new LocationData(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), altitude == 0.0d ? null : Double.valueOf(altitude), numValueOf, (int) Math.max(0L, (SystemClock.elapsedRealtime() - (lastKnownLocation.getElapsedRealtimeNanos() / ((long) 1000000))) / ((long) 1000))));
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (LocationData) value;
    }
}
