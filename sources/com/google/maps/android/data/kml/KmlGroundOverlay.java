package com.google.maps.android.data.kml;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class KmlGroundOverlay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GroundOverlayOptions f33989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LatLngBounds f33991d;

    KmlGroundOverlay(String str, LatLngBounds latLngBounds, float f10, int i10, HashMap map, float f11) {
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        this.f33989b = groundOverlayOptions;
        this.f33990c = str;
        this.f33988a = map;
        if (latLngBounds == null) {
            throw new IllegalArgumentException("No LatLonBox given");
        }
        this.f33991d = latLngBounds;
        groundOverlayOptions.positionFromBounds(latLngBounds);
        groundOverlayOptions.bearing(f11);
        groundOverlayOptions.zIndex(f10);
        groundOverlayOptions.visible(i10 != 0);
    }

    GroundOverlayOptions a() {
        return this.f33989b;
    }

    public String getImageUrl() {
        return this.f33990c;
    }

    public LatLngBounds getLatLngBox() {
        return this.f33991d;
    }

    public Iterable<String> getProperties() {
        return this.f33988a.keySet();
    }

    public String getProperty(String str) {
        return (String) this.f33988a.get(str);
    }

    public boolean hasProperty(String str) {
        return this.f33988a.get(str) != null;
    }

    @NonNull
    public String toString() {
        return "GroundOverlay{\n properties=" + this.f33988a + ",\n image url=" + this.f33990c + ",\n LatLngBox=" + this.f33991d + "\n}\n";
    }
}
