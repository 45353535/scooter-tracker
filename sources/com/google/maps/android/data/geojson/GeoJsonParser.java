package com.google.maps.android.data.geojson;

import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.Geometry;
import com.ironsource.C4257c4;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class GeoJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f33973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f33974b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLngBounds f33975c = null;

    private static class LatLngAlt {
        public final Double altitude;
        public final LatLng latLng;

        LatLngAlt(LatLng latLng, Double d10) {
            this.latLng = latLng;
            this.altitude = d10;
        }
    }

    public GeoJsonParser(JSONObject jSONObject) {
        this.f33973a = jSONObject;
        p();
    }

    private static Geometry a(String str, JSONArray jSONArray) {
        str.getClass();
        switch (str) {
            case "MultiPolygon":
                return f(jSONArray);
            case "MultiPoint":
                return e(jSONArray);
            case "MultiLineString":
                return d(jSONArray);
            case "Point":
                return g(jSONArray);
            case "Polygon":
                return h(jSONArray);
            case "LineString":
                return c(jSONArray);
            case "GeometryCollection":
                return b(jSONArray);
            default:
                return null;
        }
    }

    private static GeoJsonGeometryCollection b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Geometry geometry = parseGeometry(jSONArray.getJSONObject(i10));
            if (geometry != null) {
                arrayList.add(geometry);
            }
        }
        return new GeoJsonGeometryCollection(arrayList);
    }

    private static GeoJsonLineString c(JSONArray jSONArray) {
        ArrayList<LatLngAlt> arrayListL = l(jSONArray);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (LatLngAlt latLngAlt : arrayListL) {
            arrayList.add(latLngAlt.latLng);
            Double d10 = latLngAlt.altitude;
            if (d10 != null) {
                arrayList2.add(d10);
            }
        }
        return new GeoJsonLineString(arrayList, arrayList2);
    }

    private static GeoJsonMultiLineString d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(c(jSONArray.getJSONArray(i10)));
        }
        return new GeoJsonMultiLineString(arrayList);
    }

    private static GeoJsonMultiPoint e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(g(jSONArray.getJSONArray(i10)));
        }
        return new GeoJsonMultiPoint(arrayList);
    }

    private static GeoJsonMultiPolygon f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(h(jSONArray.getJSONArray(i10)));
        }
        return new GeoJsonMultiPolygon(arrayList);
    }

    private static GeoJsonPoint g(JSONArray jSONArray) {
        LatLngAlt latLngAltK = k(jSONArray);
        return new GeoJsonPoint(latLngAltK.latLng, latLngAltK.altitude);
    }

    private static GeoJsonPolygon h(JSONArray jSONArray) {
        return new GeoJsonPolygon(m(jSONArray));
    }

    private static boolean i(String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    private static LatLngBounds j(JSONArray jSONArray) {
        return new LatLngBounds(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    private static LatLngAlt k(JSONArray jSONArray) {
        return new LatLngAlt(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), jSONArray.length() < 3 ? null : Double.valueOf(jSONArray.getDouble(2)));
    }

    private static ArrayList l(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(k(jSONArray.getJSONArray(i10)));
        }
        return arrayList;
    }

    private static ArrayList m(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            ArrayList arrayListL = l(jSONArray.getJSONArray(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayListL.iterator();
            while (it.hasNext()) {
                arrayList2.add(((LatLngAlt) it.next()).latLng);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private static GeoJsonFeature n(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            String string = jSONObject.has("id") ? jSONObject.getString("id") : null;
            LatLngBounds latLngBoundsJ = jSONObject.has("bbox") ? j(jSONObject.getJSONArray("bbox")) : null;
            Geometry geometry = (!jSONObject.has("geometry") || jSONObject.isNull("geometry")) ? null : parseGeometry(jSONObject.getJSONObject("geometry"));
            if (jSONObject.has("properties") && !jSONObject.isNull("properties")) {
                map = r(jSONObject.getJSONObject("properties"));
            }
            return new GeoJsonFeature(geometry, string, map, latLngBoundsJ);
        } catch (JSONException unused) {
            Log.w("GeoJsonParser", "Feature could not be successfully parsed " + jSONObject.toString());
            return null;
        }
    }

    private ArrayList o(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(AdaptiveRenderingConfig.NATIVE_FEATURES_KEY);
            if (jSONObject.has("bbox")) {
                this.f33975c = j(jSONObject.getJSONArray("bbox"));
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    if (jSONObject2.getString("type").equals("Feature")) {
                        GeoJsonFeature geoJsonFeatureN = n(jSONObject2);
                        if (geoJsonFeatureN != null) {
                            arrayList.add(geoJsonFeatureN);
                        } else {
                            Log.w("GeoJsonParser", "Index of Feature in Feature Collection that could not be created: " + i10);
                        }
                    }
                } catch (JSONException unused) {
                    Log.w("GeoJsonParser", "Index of Feature in Feature Collection that could not be created: " + i10);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            Log.w("GeoJsonParser", "Feature Collection could not be created.");
            return arrayList;
        }
    }

    private void p() {
        try {
            String string = this.f33973a.getString("type");
            if (string.equals("Feature")) {
                GeoJsonFeature geoJsonFeatureN = n(this.f33973a);
                if (geoJsonFeatureN != null) {
                    this.f33974b.add(geoJsonFeatureN);
                    return;
                }
                return;
            }
            if (string.equals("FeatureCollection")) {
                this.f33974b.addAll(o(this.f33973a));
                return;
            }
            if (!i(string)) {
                Log.w("GeoJsonParser", "GeoJSON file could not be parsed.");
                return;
            }
            GeoJsonFeature geoJsonFeatureQ = q(this.f33973a);
            if (geoJsonFeatureQ != null) {
                this.f33974b.add(geoJsonFeatureQ);
            }
        } catch (JSONException unused) {
            Log.w("GeoJsonParser", "GeoJSON file could not be parsed.");
        }
    }

    public static Geometry parseGeometry(JSONObject jSONObject) {
        String string;
        JSONArray jSONArray;
        try {
            string = jSONObject.getString("type");
        } catch (JSONException unused) {
        }
        if (!string.equals("GeometryCollection")) {
            if (i(string)) {
                jSONArray = jSONObject.getJSONArray(C4257c4.f42802f);
            }
            return null;
        }
        jSONArray = jSONObject.getJSONArray("geometries");
        return a(string, jSONArray);
    }

    private static GeoJsonFeature q(JSONObject jSONObject) {
        Geometry geometry = parseGeometry(jSONObject);
        if (geometry != null) {
            return new GeoJsonFeature(geometry, null, new HashMap(), null);
        }
        Log.w("GeoJsonParser", "Geometry could not be parsed");
        return null;
    }

    private static HashMap r(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
        }
        return map;
    }

    public LatLngBounds getBoundingBox() {
        return this.f33975c;
    }

    public ArrayList<GeoJsonFeature> getFeatures() {
        return this.f33974b;
    }
}
