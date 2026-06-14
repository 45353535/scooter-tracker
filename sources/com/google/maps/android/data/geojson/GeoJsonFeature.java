package com.google.maps.android.data.geojson;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonFeature extends Feature implements Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LatLngBounds f33966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GeoJsonPointStyle f33967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private GeoJsonLineStringStyle f33968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GeoJsonPolygonStyle f33969g;

    public GeoJsonFeature(Geometry geometry, String str, HashMap<String, String> map, LatLngBounds latLngBounds) {
        super(geometry, str, map);
        this.f33922a = str;
        this.f33966d = latLngBounds;
    }

    private void a(GeoJsonStyle geoJsonStyle) {
        if (hasGeometry() && Arrays.asList(geoJsonStyle.getGeometryType()).contains(getGeometry().getGeometryType())) {
            setChanged();
            notifyObservers();
        }
    }

    public LatLngBounds getBoundingBox() {
        return this.f33966d;
    }

    public GeoJsonLineStringStyle getLineStringStyle() {
        return this.f33968f;
    }

    public MarkerOptions getMarkerOptions() {
        return this.f33967e.toMarkerOptions();
    }

    public GeoJsonPointStyle getPointStyle() {
        return this.f33967e;
    }

    public PolygonOptions getPolygonOptions() {
        return this.f33969g.toPolygonOptions();
    }

    public GeoJsonPolygonStyle getPolygonStyle() {
        return this.f33969g;
    }

    public PolylineOptions getPolylineOptions() {
        return this.f33968f.toPolylineOptions();
    }

    @Override // com.google.maps.android.data.Feature
    public String removeProperty(String str) {
        return super.removeProperty(str);
    }

    @Override // com.google.maps.android.data.Feature
    public void setGeometry(Geometry geometry) {
        super.setGeometry(geometry);
        setChanged();
        notifyObservers();
    }

    public void setLineStringStyle(GeoJsonLineStringStyle geoJsonLineStringStyle) {
        if (geoJsonLineStringStyle == null) {
            throw new IllegalArgumentException("Line string style cannot be null");
        }
        GeoJsonLineStringStyle geoJsonLineStringStyle2 = this.f33968f;
        if (geoJsonLineStringStyle2 != null) {
            geoJsonLineStringStyle2.deleteObserver(this);
        }
        this.f33968f = geoJsonLineStringStyle;
        geoJsonLineStringStyle.addObserver(this);
        a(this.f33968f);
    }

    public void setPointStyle(GeoJsonPointStyle geoJsonPointStyle) {
        if (geoJsonPointStyle == null) {
            throw new IllegalArgumentException("Point style cannot be null");
        }
        GeoJsonPointStyle geoJsonPointStyle2 = this.f33967e;
        if (geoJsonPointStyle2 != null) {
            geoJsonPointStyle2.deleteObserver(this);
        }
        this.f33967e = geoJsonPointStyle;
        geoJsonPointStyle.addObserver(this);
        a(this.f33967e);
    }

    public void setPolygonStyle(GeoJsonPolygonStyle geoJsonPolygonStyle) {
        if (geoJsonPolygonStyle == null) {
            throw new IllegalArgumentException("Polygon style cannot be null");
        }
        GeoJsonPolygonStyle geoJsonPolygonStyle2 = this.f33969g;
        if (geoJsonPolygonStyle2 != null) {
            geoJsonPolygonStyle2.deleteObserver(this);
        }
        this.f33969g = geoJsonPolygonStyle;
        geoJsonPolygonStyle.addObserver(this);
        a(this.f33969g);
    }

    @Override // com.google.maps.android.data.Feature
    public String setProperty(String str, String str2) {
        return super.setProperty(str, str2);
    }

    @NonNull
    public String toString() {
        return "Feature{\n bounding box=" + this.f33966d + ",\n geometry=" + getGeometry() + ",\n point style=" + this.f33967e + ",\n line string style=" + this.f33968f + ",\n polygon style=" + this.f33969g + ",\n id=" + this.f33922a + ",\n properties=" + getProperties() + "\n}\n";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof GeoJsonStyle) {
            a((GeoJsonStyle) observable);
        }
    }
}
