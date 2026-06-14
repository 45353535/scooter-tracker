package com.google.maps.android.data;

import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.data.geojson.GeoJsonLineStringStyle;
import com.google.maps.android.data.geojson.GeoJsonPointStyle;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;
import com.google.maps.android.data.geojson.GeoJsonRenderer;
import com.google.maps.android.data.kml.KmlRenderer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Layer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Renderer f33925a;

    public interface OnFeatureClickListener {
        void onFeatureClick(Feature feature);
    }

    protected void a(Feature feature) {
        this.f33925a.e(feature);
    }

    public abstract void addLayerToMap();

    protected void b() {
        Renderer renderer = this.f33925a;
        if (!(renderer instanceof GeoJsonRenderer)) {
            throw new UnsupportedOperationException("Stored renderer is not a GeoJsonRenderer");
        }
        ((GeoJsonRenderer) renderer).addLayerToMap();
    }

    protected void c() {
        Renderer renderer = this.f33925a;
        if (!(renderer instanceof KmlRenderer)) {
            throw new UnsupportedOperationException("Stored renderer is not a KmlRenderer");
        }
        ((KmlRenderer) renderer).addLayerToMap();
    }

    protected boolean d() {
        return this.f33925a.L();
    }

    protected void e(Feature feature) {
        this.f33925a.S(feature);
    }

    protected void f(Renderer renderer) {
        this.f33925a = renderer;
    }

    public Feature getContainerFeature(Object obj) {
        return this.f33925a.A(obj);
    }

    protected Iterable getContainers() {
        Renderer renderer = this.f33925a;
        if (renderer instanceof KmlRenderer) {
            return ((KmlRenderer) renderer).getNestedContainers();
        }
        return null;
    }

    public GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.f33925a.C();
    }

    public GeoJsonPointStyle getDefaultPointStyle() {
        return this.f33925a.D();
    }

    public GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.f33925a.E();
    }

    public Feature getFeature(Object obj) {
        return this.f33925a.F(obj);
    }

    public Iterable<? extends Feature> getFeatures() {
        return this.f33925a.getFeatures();
    }

    protected Iterable getGroundOverlays() {
        Renderer renderer = this.f33925a;
        if (renderer instanceof KmlRenderer) {
            return ((KmlRenderer) renderer).getGroundOverlays();
        }
        return null;
    }

    public GoogleMap getMap() {
        return this.f33925a.getMap();
    }

    protected boolean hasContainers() {
        Renderer renderer = this.f33925a;
        if (renderer instanceof KmlRenderer) {
            return ((KmlRenderer) renderer).hasNestedContainers();
        }
        return false;
    }

    public boolean isLayerOnMap() {
        return this.f33925a.isLayerOnMap();
    }

    public void removeLayerFromMap() {
        Renderer renderer = this.f33925a;
        if (renderer instanceof GeoJsonRenderer) {
            ((GeoJsonRenderer) renderer).removeLayerFromMap();
        } else if (renderer instanceof KmlRenderer) {
            ((KmlRenderer) renderer).removeLayerFromMap();
        }
    }

    public void setMap(GoogleMap googleMap) {
        this.f33925a.setMap(googleMap);
    }

    public void setOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        this.f33925a.e0(onFeatureClickListener);
    }
}
