package com.appodeal.ads;

import android.location.Location;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0002\u0010\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/LocationData;", "", "obtainLatitude", "", "()Ljava/lang/Float;", "obtainLongitude", "obtainLocation", "Landroid/location/Location;", "getDeviceLocation", "getDeviceLocationType", "", "()Ljava/lang/Integer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface LocationData {
    @Nullable
    Location getDeviceLocation();

    @Nullable
    Integer getDeviceLocationType();

    @Nullable
    Float obtainLatitude();

    @Nullable
    Location obtainLocation();

    @Nullable
    Float obtainLongitude();
}
