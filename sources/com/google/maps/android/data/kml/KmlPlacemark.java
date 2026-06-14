package com.google.maps.android.data.kml;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class KmlPlacemark extends Feature {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final KmlStyle f34000e;

    public KmlPlacemark(Geometry geometry, String str, KmlStyle kmlStyle, Map<String, String> map) {
        super(geometry, str, map);
        this.f33999d = str;
        this.f34000e = kmlStyle;
    }

    public KmlStyle getInlineStyle() {
        return this.f34000e;
    }

    public MarkerOptions getMarkerOptions() {
        KmlStyle kmlStyle = this.f34000e;
        if (kmlStyle == null) {
            return null;
        }
        return kmlStyle.getMarkerOptions();
    }

    public PolygonOptions getPolygonOptions() {
        KmlStyle kmlStyle = this.f34000e;
        if (kmlStyle == null) {
            return null;
        }
        return kmlStyle.getPolygonOptions();
    }

    public PolylineOptions getPolylineOptions() {
        KmlStyle kmlStyle = this.f34000e;
        if (kmlStyle == null) {
            return null;
        }
        return kmlStyle.getPolylineOptions();
    }

    public String getStyleId() {
        return super.getId();
    }

    @NonNull
    public String toString() {
        return "Placemark{\n style id=" + this.f33999d + ",\n inline style=" + this.f34000e + "\n}\n";
    }
}
