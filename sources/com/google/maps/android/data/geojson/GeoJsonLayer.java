package com.google.maps.android.data.geojson;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonLayer extends Layer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLngBounds f33970b;

    public interface GeoJsonOnFeatureClickListener extends Layer.OnFeatureClickListener {
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("GeoJSON file cannot be null");
        }
        this.f33970b = null;
        GeoJsonParser geoJsonParser = new GeoJsonParser(jSONObject);
        this.f33970b = geoJsonParser.getBoundingBox();
        HashMap map = new HashMap();
        Iterator<GeoJsonFeature> it = geoJsonParser.getFeatures().iterator();
        while (it.hasNext()) {
            map.put(it.next(), null);
        }
        f(new GeoJsonRenderer(googleMap, map, markerManager, polygonManager, polylineManager, groundOverlayManager));
    }

    private static JSONObject g(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return new JSONObject(sb2.toString());
            }
            sb2.append(line);
        }
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.a(geoJsonFeature);
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.b();
    }

    public LatLngBounds getBoundingBox() {
        return this.f33970b;
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<GeoJsonFeature> getFeatures() {
        return super.getFeatures();
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        super.e(geoJsonFeature);
    }

    @NonNull
    public String toString() {
        return "Collection{\n Bounding box=" + this.f33970b + "\n}\n";
    }

    public GeoJsonLayer(GoogleMap googleMap, int i10, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) throws JSONException, IOException {
        this(googleMap, g(context.getResources().openRawResource(i10)), markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject) {
        this(googleMap, jSONObject, null, null, null, null);
    }

    public GeoJsonLayer(GoogleMap googleMap, int i10, Context context) throws JSONException, IOException {
        this(googleMap, g(context.getResources().openRawResource(i10)), null, null, null, null);
    }
}
