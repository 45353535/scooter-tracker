package com.appodeal.ads;

import android.content.Context;
import android.location.Location;

/* JADX INFO: loaded from: classes6.dex */
public final class jd implements LocationData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Location f13519d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc f13520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f13521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f13522c;

    public jd(Context context, zc zcVar) {
        this.f13520a = zcVar;
        if (context == null || b9.f13136b.f13137a.f14931f.get()) {
            this.f13521b = f13519d;
        } else {
            Location locationO = j2.o(context);
            this.f13521b = locationO;
            if (locationO != null) {
                f13519d = locationO;
            }
        }
        this.f13522c = Integer.valueOf(this.f13521b == null ? 0 : 1);
    }

    @Override // com.appodeal.ads.LocationData
    public final Location getDeviceLocation() {
        if (this.f13520a.canSendLocation()) {
            return this.f13521b;
        }
        return null;
    }

    @Override // com.appodeal.ads.LocationData
    public final Integer getDeviceLocationType() {
        if (this.f13520a.canSendLocationType()) {
            return this.f13522c;
        }
        return null;
    }

    @Override // com.appodeal.ads.LocationData
    public final Float obtainLatitude() {
        if (!this.f13520a.canSendLocation()) {
            return null;
        }
        Location location = this.f13521b;
        return location != null ? Float.valueOf(Double.valueOf(location.getLatitude()).floatValue()) : o6.a().f14250f;
    }

    @Override // com.appodeal.ads.LocationData
    public final Location obtainLocation() {
        Float fObtainLatitude;
        Float fObtainLongitude;
        if (!this.f13520a.canSendLocation() || (fObtainLatitude = obtainLatitude()) == null || (fObtainLongitude = obtainLongitude()) == null) {
            return null;
        }
        Location location = new Location("unknown");
        location.setLatitude(fObtainLatitude.floatValue());
        location.setLongitude(fObtainLongitude.floatValue());
        return location;
    }

    @Override // com.appodeal.ads.LocationData
    public final Float obtainLongitude() {
        if (!this.f13520a.canSendLocation()) {
            return null;
        }
        Location location = this.f13521b;
        return location != null ? Float.valueOf(Double.valueOf(location.getLongitude()).floatValue()) : o6.a().f14251g;
    }
}
