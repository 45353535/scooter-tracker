package com.mobilefuse.sdk.device;

import androidx.collection.a;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/mobilefuse/sdk/device/LocationData;", "", "latitude", "", "longitude", "altitude", "accuracy", "", "lastFixSeconds", "(DDLjava/lang/Double;Ljava/lang/Integer;I)V", "getAccuracy", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAltitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastFixSeconds", "()I", "getLatitude", "()D", "getLongitude", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "(DDLjava/lang/Double;Ljava/lang/Integer;I)Lcom/mobilefuse/sdk/device/LocationData;", "equals", "", "other", "hashCode", "toString", "", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class LocationData {

    @Nullable
    private final Integer accuracy;

    @Nullable
    private final Double altitude;
    private final int lastFixSeconds;
    private final double latitude;
    private final double longitude;

    public LocationData(double d10, double d11, @Nullable Double d12, @Nullable Integer num, int i10) {
        this.latitude = d10;
        this.longitude = d11;
        this.altitude = d12;
        this.accuracy = num;
        this.lastFixSeconds = i10;
    }

    public static /* synthetic */ LocationData copy$default(LocationData locationData, double d10, double d11, Double d12, Integer num, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = locationData.latitude;
        }
        double d13 = d10;
        if ((i11 & 2) != 0) {
            d11 = locationData.longitude;
        }
        double d14 = d11;
        if ((i11 & 4) != 0) {
            d12 = locationData.altitude;
        }
        Double d15 = d12;
        if ((i11 & 8) != 0) {
            num = locationData.accuracy;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            i10 = locationData.lastFixSeconds;
        }
        return locationData.copy(d13, d14, d15, num2, i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getAltitude() {
        return this.altitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLastFixSeconds() {
        return this.lastFixSeconds;
    }

    @NotNull
    public final LocationData copy(double latitude, double longitude, @Nullable Double altitude, @Nullable Integer accuracy, int lastFixSeconds) {
        return new LocationData(latitude, longitude, altitude, accuracy, lastFixSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) other;
        return Double.compare(this.latitude, locationData.latitude) == 0 && Double.compare(this.longitude, locationData.longitude) == 0 && Intrinsics.areEqual((Object) this.altitude, (Object) locationData.altitude) && Intrinsics.areEqual(this.accuracy, locationData.accuracy) && this.lastFixSeconds == locationData.lastFixSeconds;
    }

    @Nullable
    public final Integer getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final Double getAltitude() {
        return this.altitude;
    }

    public final int getLastFixSeconds() {
        return this.lastFixSeconds;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int iA = ((a.a(this.latitude) * 31) + a.a(this.longitude)) * 31;
        Double d10 = this.altitude;
        int iHashCode = (iA + (d10 != null ? d10.hashCode() : 0)) * 31;
        Integer num = this.accuracy;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.lastFixSeconds;
    }

    @NotNull
    public String toString() {
        return "LocationData(latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", accuracy=" + this.accuracy + ", lastFixSeconds=" + this.lastFixSeconds + ")";
    }
}
