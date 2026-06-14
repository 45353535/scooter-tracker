package com.google.maps.android.data.geojson;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Renderer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonRenderer extends Renderer implements Observer {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Object f33980w = null;

    GeoJsonRenderer(GoogleMap googleMap, HashMap map, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        super(googleMap, map, markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    private void g0(GeoJsonFeature geoJsonFeature) {
        h0(geoJsonFeature, getMap());
    }

    private void h0(GeoJsonFeature geoJsonFeature, GoogleMap googleMap) {
        V(x().get(geoJsonFeature));
        O(geoJsonFeature, f33980w);
        if (googleMap == null || !geoJsonFeature.hasGeometry()) {
            return;
        }
        O(geoJsonFeature, f(geoJsonFeature, geoJsonFeature.getGeometry()));
    }

    public void addFeature(@NonNull GeoJsonFeature geoJsonFeature) {
        super.e(geoJsonFeature);
        if (isLayerOnMap()) {
            geoJsonFeature.addObserver(this);
        }
    }

    public void addLayerToMap() {
        if (isLayerOnMap()) {
            return;
        }
        c0(true);
        Iterator<Feature> it = super.getFeatures().iterator();
        while (it.hasNext()) {
            addFeature((GeoJsonFeature) it.next());
        }
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        super.S(geoJsonFeature);
        if (super.getFeatures().contains(geoJsonFeature)) {
            geoJsonFeature.deleteObserver(this);
        }
    }

    public void removeLayerFromMap() {
        if (isLayerOnMap()) {
            for (Feature feature : super.getFeatures()) {
                V(super.x().get(feature));
                feature.deleteObserver(this);
            }
            c0(false);
        }
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(GoogleMap googleMap) {
        super.setMap(googleMap);
        Iterator<Feature> it = super.getFeatures().iterator();
        while (it.hasNext()) {
            h0((GeoJsonFeature) it.next(), googleMap);
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof GeoJsonFeature) {
            GeoJsonFeature geoJsonFeature = (GeoJsonFeature) observable;
            Object obj2 = x().get(geoJsonFeature);
            Object obj3 = f33980w;
            boolean z10 = obj2 != obj3;
            if (z10 && geoJsonFeature.hasGeometry()) {
                g0(geoJsonFeature);
                return;
            }
            if (z10 && !geoJsonFeature.hasGeometry()) {
                V(x().get(geoJsonFeature));
                O(geoJsonFeature, obj3);
            } else {
                if (z10 || !geoJsonFeature.hasGeometry()) {
                    return;
                }
                addFeature(geoJsonFeature);
            }
        }
    }
}
