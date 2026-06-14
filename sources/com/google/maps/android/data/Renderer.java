package com.google.maps.android.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.R;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import com.google.maps.android.data.geojson.BiMultiMap;
import com.google.maps.android.data.geojson.GeoJsonFeature;
import com.google.maps.android.data.geojson.GeoJsonGeometryCollection;
import com.google.maps.android.data.geojson.GeoJsonLineString;
import com.google.maps.android.data.geojson.GeoJsonLineStringStyle;
import com.google.maps.android.data.geojson.GeoJsonMultiLineString;
import com.google.maps.android.data.geojson.GeoJsonMultiPoint;
import com.google.maps.android.data.geojson.GeoJsonMultiPolygon;
import com.google.maps.android.data.geojson.GeoJsonPoint;
import com.google.maps.android.data.geojson.GeoJsonPointStyle;
import com.google.maps.android.data.geojson.GeoJsonPolygon;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;
import com.google.maps.android.data.kml.KmlGroundOverlay;
import com.google.maps.android.data.kml.KmlMultiGeometry;
import com.google.maps.android.data.kml.KmlPlacemark;
import com.google.maps.android.data.kml.KmlPoint;
import com.google.maps.android.data.kml.KmlStyle;
import com.google.maps.android.data.kml.KmlUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class Renderer {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Object f33930u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final DecimalFormat f33931v = new DecimalFormat("#.####");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GoogleMap f33932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiMultiMap f33933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f33934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap f33935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap f33936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BiMultiMap f33937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap f33938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f33939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImagesCache f33940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f33943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f33944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GeoJsonPointStyle f33945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final GeoJsonLineStringStyle f33946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final GeoJsonPolygonStyle f33947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final MarkerManager.Collection f33948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final PolygonManager.Collection f33949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final PolylineManager.Collection f33950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GroundOverlayManager.Collection f33951t;

    public static final class ImagesCache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f33953a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f33954b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map f33955c = new HashMap();
    }

    public Renderer(GoogleMap googleMap, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, @Nullable ImagesCache imagesCache) {
        this(googleMap, new HashSet(), null, null, null, new BiMultiMap(), markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.f33943l = context;
        this.f33935d = new HashMap();
        this.f33940i = imagesCache == null ? new ImagesCache() : imagesCache;
    }

    protected static boolean I(Feature feature) {
        return (feature.hasProperty("visibility") && Integer.parseInt(feature.getProperty("visibility")) == 0) ? false : true;
    }

    private ArrayList M(Object obj) {
        for (Object obj2 : getValues()) {
            if (obj2.getClass().getSimpleName().equals("ArrayList")) {
                ArrayList arrayList = (ArrayList) obj2;
                if (arrayList.contains(obj)) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    private void P(String str, String str2, BitmapDescriptor bitmapDescriptor) {
        Map map = (Map) this.f33940i.f33953a.get(str);
        if (map == null) {
            map = new HashMap();
            this.f33940i.f33953a.put(str, map);
        }
        map.put(str2, bitmapDescriptor);
    }

    private void T(Collection collection) {
        for (Object obj : collection) {
            if (obj instanceof Collection) {
                T((Collection) obj);
            } else if (obj instanceof Marker) {
                this.f33948q.remove((Marker) obj);
            } else if (obj instanceof Polyline) {
                this.f33950s.remove((Polyline) obj);
            } else if (obj instanceof Polygon) {
                this.f33949r.remove((Polygon) obj);
            }
        }
    }

    private BitmapDescriptor X(Bitmap bitmap, double d10) {
        int i10;
        int i11 = (int) (((double) (this.f33943l.getResources().getDisplayMetrics().density * 32.0f)) * d10);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i10 = (int) ((height * i11) / width);
        } else if (width > height) {
            int i12 = (int) ((width * i11) / height);
            i10 = i11;
            i11 = i12;
        } else {
            i10 = i11;
        }
        return BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, i11, i10, false));
    }

    private void Y(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature.getPointStyle() == null) {
            geoJsonFeature.setPointStyle(this.f33945n);
        }
        if (geoJsonFeature.getLineStringStyle() == null) {
            geoJsonFeature.setLineStringStyle(this.f33946o);
        }
        if (geoJsonFeature.getPolygonStyle() == null) {
            geoJsonFeature.setPolygonStyle(this.f33947p);
        }
    }

    private void Z(PolylineOptions polylineOptions, KmlStyle kmlStyle) {
        PolylineOptions polylineOptions2 = kmlStyle.getPolylineOptions();
        if (kmlStyle.isStyleSet("outlineColor")) {
            polylineOptions.color(polylineOptions2.getColor());
        }
        if (kmlStyle.isStyleSet("width")) {
            polylineOptions.width(polylineOptions2.getWidth());
        }
        if (kmlStyle.isLineRandomColorMode()) {
            polylineOptions.color(KmlStyle.computeRandomColor(polylineOptions2.getColor()));
        }
    }

    public static /* synthetic */ void a(Renderer renderer, Layer.OnFeatureClickListener onFeatureClickListener, Polygon polygon) {
        if (renderer.F(polygon) != null) {
            onFeatureClickListener.onFeatureClick(renderer.F(polygon));
        } else if (renderer.A(polygon) != null) {
            onFeatureClickListener.onFeatureClick(renderer.A(polygon));
        } else {
            onFeatureClickListener.onFeatureClick(renderer.F(renderer.M(polygon)));
        }
    }

    private void a0(MarkerOptions markerOptions, KmlStyle kmlStyle, KmlStyle kmlStyle2) {
        MarkerOptions markerOptions2 = kmlStyle.getMarkerOptions();
        if (kmlStyle.isStyleSet("heading")) {
            markerOptions.rotation(markerOptions2.getRotation());
        }
        if (kmlStyle.isStyleSet("hotSpot")) {
            markerOptions.anchor(markerOptions2.getAnchorU(), markerOptions2.getAnchorV());
        }
        if (kmlStyle.isStyleSet("markerColor")) {
            markerOptions.icon(markerOptions2.getIcon());
        }
        double iconScale = kmlStyle.isStyleSet("iconScale") ? kmlStyle.getIconScale() : kmlStyle2.isStyleSet("iconScale") ? kmlStyle2.getIconScale() : 1.0d;
        if (kmlStyle.isStyleSet("iconUrl")) {
            j(kmlStyle.getIconUrl(), iconScale, markerOptions);
        } else if (kmlStyle2.getIconUrl() != null) {
            j(kmlStyle2.getIconUrl(), iconScale, markerOptions);
        }
    }

    public static /* synthetic */ boolean b(Renderer renderer, Layer.OnFeatureClickListener onFeatureClickListener, Marker marker) {
        if (renderer.F(marker) != null) {
            onFeatureClickListener.onFeatureClick(renderer.F(marker));
            return false;
        }
        if (renderer.A(marker) != null) {
            onFeatureClickListener.onFeatureClick(renderer.A(marker));
            return false;
        }
        onFeatureClickListener.onFeatureClick(renderer.F(renderer.M(marker)));
        return false;
    }

    private void b0(PolygonOptions polygonOptions, KmlStyle kmlStyle) {
        PolygonOptions polygonOptions2 = kmlStyle.getPolygonOptions();
        if (kmlStyle.hasFill() && kmlStyle.isStyleSet("fillColor")) {
            polygonOptions.fillColor(polygonOptions2.getFillColor());
        }
        if (kmlStyle.hasOutline()) {
            if (kmlStyle.isStyleSet("outlineColor")) {
                polygonOptions.strokeColor(polygonOptions2.getStrokeColor());
            }
            if (kmlStyle.isStyleSet("width")) {
                polygonOptions.strokeWidth(polygonOptions2.getStrokeWidth());
            }
        }
        if (kmlStyle.isPolyRandomColorMode()) {
            polygonOptions.fillColor(KmlStyle.computeRandomColor(polygonOptions2.getFillColor()));
        }
    }

    public static /* synthetic */ void c(Renderer renderer, Layer.OnFeatureClickListener onFeatureClickListener, Polyline polyline) {
        if (renderer.F(polyline) != null) {
            onFeatureClickListener.onFeatureClick(renderer.F(polyline));
        } else if (renderer.A(polyline) != null) {
            onFeatureClickListener.onFeatureClick(renderer.A(polyline));
        } else {
            onFeatureClickListener.onFeatureClick(renderer.F(renderer.M(polyline)));
        }
    }

    private void d0(KmlStyle kmlStyle, Marker marker, KmlPlacemark kmlPlacemark) {
        boolean zHasProperty = kmlPlacemark.hasProperty("name");
        boolean zHasProperty2 = kmlPlacemark.hasProperty("description");
        boolean zHasBalloonStyle = kmlStyle.hasBalloonStyle();
        boolean zContainsKey = kmlStyle.getBalloonOptions().containsKey("text");
        if (zHasBalloonStyle && zContainsKey) {
            marker.setTitle(KmlUtil.substituteProperties(kmlStyle.getBalloonOptions().get("text"), kmlPlacemark));
            u();
            return;
        }
        if (zHasBalloonStyle && zHasProperty) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            u();
            return;
        }
        if (zHasProperty && zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            marker.setSnippet(kmlPlacemark.getProperty("description"));
            u();
        } else if (zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("description"));
            u();
        } else if (zHasProperty) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            u();
        }
    }

    private ArrayList g(GeoJsonFeature geoJsonFeature, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f(geoJsonFeature, (Geometry) it.next()));
        }
        return arrayList;
    }

    private Polyline i(PolylineOptions polylineOptions, LineString lineString) {
        polylineOptions.addAll(lineString.getGeometryObject());
        Polyline polylineAddPolyline = this.f33950s.addPolyline(polylineOptions);
        polylineAddPolyline.setClickable(polylineOptions.isClickable());
        return polylineAddPolyline;
    }

    private void j(String str, double d10, MarkerOptions markerOptions) {
        BitmapDescriptor bitmapDescriptorZ = z(str, d10);
        if (bitmapDescriptorZ != null) {
            markerOptions.icon(bitmapDescriptorZ);
        } else {
            this.f33939h.add(str);
        }
    }

    private ArrayList k(KmlPlacemark kmlPlacemark, KmlMultiGeometry kmlMultiGeometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator<Geometry> it = kmlMultiGeometry.getGeometryObject().iterator();
        while (it.hasNext()) {
            KmlPlacemark kmlPlacemark2 = kmlPlacemark;
            arrayList.add(h(kmlPlacemark2, it.next(), kmlStyle, kmlStyle2, z10));
            kmlPlacemark = kmlPlacemark2;
        }
        return arrayList;
    }

    private ArrayList l(GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonMultiLineString geoJsonMultiLineString) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeoJsonLineString> it = geoJsonMultiLineString.getLineStrings().iterator();
        while (it.hasNext()) {
            arrayList.add(i(geoJsonLineStringStyle.toPolylineOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList m(GeoJsonPointStyle geoJsonPointStyle, GeoJsonMultiPoint geoJsonMultiPoint) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeoJsonPoint> it = geoJsonMultiPoint.getPoints().iterator();
        while (it.hasNext()) {
            arrayList.add(o(geoJsonPointStyle.toMarkerOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList n(GeoJsonPolygonStyle geoJsonPolygonStyle, GeoJsonMultiPolygon geoJsonMultiPolygon) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeoJsonPolygon> it = geoJsonMultiPolygon.getPolygons().iterator();
        while (it.hasNext()) {
            arrayList.add(p(geoJsonPolygonStyle.toPolygonOptions(), it.next()));
        }
        return arrayList;
    }

    private Marker o(MarkerOptions markerOptions, Point point) {
        markerOptions.position(point.getGeometryObject());
        return this.f33948q.addMarker(markerOptions);
    }

    private Polygon p(PolygonOptions polygonOptions, DataPolygon dataPolygon) {
        polygonOptions.addAll(dataPolygon.getOuterBoundaryCoordinates());
        Iterator<List<LatLng>> it = dataPolygon.getInnerBoundaryCoordinates().iterator();
        while (it.hasNext()) {
            polygonOptions.addHole(it.next());
        }
        Polygon polygonAddPolygon = this.f33949r.addPolygon(polygonOptions);
        polygonAddPolygon.setClickable(polygonOptions.isClickable());
        return polygonAddPolygon;
    }

    private void u() {
        this.f33948q.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() { // from class: com.google.maps.android.data.Renderer.1
            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public View getInfoContents(@NonNull Marker marker) {
                View viewInflate = LayoutInflater.from(Renderer.this.f33943l).inflate(R.layout.amu_info_window, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.window);
                if (marker.getSnippet() == null) {
                    textView.setText(Html.fromHtml(marker.getTitle()));
                    return viewInflate;
                }
                textView.setText(Html.fromHtml(marker.getTitle() + "<br>" + marker.getSnippet()));
                return viewInflate;
            }

            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public View getInfoWindow(@NonNull Marker marker) {
                return null;
            }
        });
    }

    Feature A(Object obj) {
        BiMultiMap biMultiMap = this.f33937f;
        if (biMultiMap != null) {
            return (Feature) biMultiMap.getKey(obj);
        }
        return null;
    }

    protected ArrayList B() {
        return this.f33944m;
    }

    GeoJsonLineStringStyle C() {
        return this.f33946o;
    }

    GeoJsonPointStyle D() {
        return this.f33945n;
    }

    GeoJsonPolygonStyle E() {
        return this.f33947p;
    }

    Feature F(Object obj) {
        return (Feature) this.f33933b.getKey(obj);
    }

    protected Set G() {
        return this.f33939h;
    }

    protected KmlStyle H(String str) {
        return this.f33935d.get(str) != null ? (KmlStyle) this.f33935d.get(str) : (KmlStyle) this.f33935d.get(null);
    }

    protected HashMap J() {
        return this.f33936e;
    }

    protected HashMap K() {
        return this.f33935d;
    }

    protected boolean L() {
        return this.f33933b.size() > 0;
    }

    protected void N(Object obj, Feature feature) {
        this.f33937f.put(feature, obj);
    }

    protected void O(Feature feature, Object obj) {
        this.f33933b.put(feature, obj);
    }

    protected void Q() {
        this.f33935d.putAll(this.f33934c);
    }

    protected void R(HashMap map) {
        this.f33935d.putAll(map);
    }

    protected void S(Feature feature) {
        if (this.f33933b.containsKey(feature)) {
            V(this.f33933b.remove(feature));
        }
    }

    protected void U(HashMap map) {
        T(map.values());
    }

    protected void V(Object obj) {
        if (obj instanceof Marker) {
            this.f33948q.remove((Marker) obj);
            return;
        }
        if (obj instanceof Polyline) {
            this.f33950s.remove((Polyline) obj);
            return;
        }
        if (obj instanceof Polygon) {
            this.f33949r.remove((Polygon) obj);
            return;
        }
        if (obj instanceof GroundOverlay) {
            this.f33951t.remove((GroundOverlay) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                V(it.next());
            }
        }
    }

    protected void W(HashMap map) {
        for (GroundOverlay groundOverlay : map.values()) {
            if (groundOverlay != null) {
                this.f33951t.remove(groundOverlay);
            }
        }
    }

    public void assignStyleMap(HashMap<String, String> map, HashMap<String, KmlStyle> map2) {
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (map2.containsKey(str2)) {
                map2.put(str, map2.get(str2));
            }
        }
    }

    protected void c0(boolean z10) {
        this.f33942k = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void e(com.google.maps.android.data.Feature r8) {
        /*
            r7 = this;
            java.lang.Object r0 = com.google.maps.android.data.Renderer.f33930u
            boolean r1 = r8 instanceof com.google.maps.android.data.geojson.GeoJsonFeature
            if (r1 == 0) goto Lc
            r1 = r8
            com.google.maps.android.data.geojson.GeoJsonFeature r1 = (com.google.maps.android.data.geojson.GeoJsonFeature) r1
            r7.Y(r1)
        Lc:
            boolean r1 = r7.f33942k
            if (r1 == 0) goto L52
            com.google.maps.android.data.geojson.BiMultiMap r1 = r7.f33933b
            boolean r1 = r1.containsKey(r8)
            if (r1 == 0) goto L21
            com.google.maps.android.data.geojson.BiMultiMap r1 = r7.f33933b
            java.lang.Object r1 = r1.get(r8)
            r7.V(r1)
        L21:
            boolean r1 = r8.hasGeometry()
            if (r1 == 0) goto L52
            boolean r0 = r8 instanceof com.google.maps.android.data.kml.KmlPlacemark
            if (r0 == 0) goto L48
            boolean r6 = I(r8)
            java.lang.String r0 = r8.getId()
            com.google.maps.android.data.Geometry r3 = r8.getGeometry()
            com.google.maps.android.data.kml.KmlStyle r4 = r7.H(r0)
            r2 = r8
            com.google.maps.android.data.kml.KmlPlacemark r2 = (com.google.maps.android.data.kml.KmlPlacemark) r2
            com.google.maps.android.data.kml.KmlStyle r5 = r2.getInlineStyle()
            r1 = r7
            java.lang.Object r0 = r1.h(r2, r3, r4, r5, r6)
            goto L53
        L48:
            r1 = r7
            com.google.maps.android.data.Geometry r0 = r8.getGeometry()
            java.lang.Object r0 = r7.f(r8, r0)
            goto L53
        L52:
            r1 = r7
        L53:
            com.google.maps.android.data.geojson.BiMultiMap r2 = r1.f33933b
            r2.put(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.Renderer.e(com.google.maps.android.data.Feature):void");
    }

    void e0(final Layer.OnFeatureClickListener onFeatureClickListener) {
        this.f33949r.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() { // from class: com.google.maps.android.data.a
            @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
            public final void onPolygonClick(Polygon polygon) {
                Renderer.a(this.f33959a, onFeatureClickListener, polygon);
            }
        });
        this.f33948q.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.data.b
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return Renderer.b(this.f33961a, onFeatureClickListener, marker);
            }
        });
        this.f33950s.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() { // from class: com.google.maps.android.data.c
            @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
            public final void onPolylineClick(Polyline polyline) {
                Renderer.c(this.f33963a, onFeatureClickListener, polyline);
            }
        });
    }

    protected Object f(Feature feature, Geometry geometry) {
        MarkerOptions markerOptions;
        PolygonOptions polygonOptions;
        PolylineOptions polylineOptions;
        String geometryType = geometry.getGeometryType();
        geometryType.getClass();
        markerOptions = null;
        polylineOptions = null;
        polygonOptions = null;
        switch (geometryType) {
            case "MultiPolygon":
                return n(((GeoJsonFeature) feature).getPolygonStyle(), (GeoJsonMultiPolygon) geometry);
            case "MultiPoint":
                return m(((GeoJsonFeature) feature).getPointStyle(), (GeoJsonMultiPoint) geometry);
            case "MultiLineString":
                return l(((GeoJsonFeature) feature).getLineStringStyle(), (GeoJsonMultiLineString) geometry);
            case "Point":
                if (feature instanceof GeoJsonFeature) {
                    markerOptions = ((GeoJsonFeature) feature).getMarkerOptions();
                } else if (feature instanceof KmlPlacemark) {
                    markerOptions = ((KmlPlacemark) feature).getMarkerOptions();
                }
                return o(markerOptions, (GeoJsonPoint) geometry);
            case "Polygon":
                if (feature instanceof GeoJsonFeature) {
                    polygonOptions = ((GeoJsonFeature) feature).getPolygonOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polygonOptions = ((KmlPlacemark) feature).getPolygonOptions();
                }
                return p(polygonOptions, (DataPolygon) geometry);
            case "LineString":
                if (feature instanceof GeoJsonFeature) {
                    polylineOptions = ((GeoJsonFeature) feature).getPolylineOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polylineOptions = ((KmlPlacemark) feature).getPolylineOptions();
                }
                return i(polylineOptions, (GeoJsonLineString) geometry);
            case "GeometryCollection":
                return g((GeoJsonFeature) feature, ((GeoJsonGeometryCollection) geometry).getGeometries());
            default:
                return null;
        }
    }

    protected void f0(HashMap map, HashMap map2, HashMap map3, ArrayList arrayList, HashMap map4) {
        this.f33934c = map;
        this.f33936e = map2;
        this.f33933b.putAll(map3);
        this.f33944m = arrayList;
        this.f33938g = map4;
    }

    public Set<Feature> getFeatures() {
        return this.f33933b.keySet();
    }

    public HashMap<KmlGroundOverlay, GroundOverlay> getGroundOverlayMap() {
        return this.f33938g;
    }

    public GoogleMap getMap() {
        return this.f33932a;
    }

    public Collection<Object> getValues() {
        return this.f33933b.values();
    }

    protected Object h(KmlPlacemark kmlPlacemark, Geometry geometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z10) {
        boolean zHasProperty;
        float f10;
        String geometryType = geometry.getGeometryType();
        zHasProperty = kmlPlacemark.hasProperty("drawOrder");
        f10 = 0.0f;
        if (zHasProperty) {
            try {
                f10 = Float.parseFloat(kmlPlacemark.getProperty("drawOrder"));
            } catch (NumberFormatException unused) {
                zHasProperty = false;
            }
        }
        geometryType.getClass();
        switch (geometryType) {
            case "Point":
                MarkerOptions markerOptions = kmlStyle.getMarkerOptions();
                if (kmlStyle2 != null) {
                    a0(markerOptions, kmlStyle2, kmlStyle);
                } else if (kmlStyle.getIconUrl() != null) {
                    j(kmlStyle.getIconUrl(), kmlStyle.getIconScale(), markerOptions);
                }
                Marker markerO = o(markerOptions, (KmlPoint) geometry);
                markerO.setVisible(z10);
                d0(kmlStyle, markerO, kmlPlacemark);
                if (zHasProperty) {
                    markerO.setZIndex(f10);
                }
                return markerO;
            case "MultiGeometry":
                return k(kmlPlacemark, (KmlMultiGeometry) geometry, kmlStyle, kmlStyle2, z10);
            case "Polygon":
                PolygonOptions polygonOptions = kmlStyle.getPolygonOptions();
                if (kmlStyle2 != null) {
                    b0(polygonOptions, kmlStyle2);
                } else if (kmlStyle.isPolyRandomColorMode()) {
                    polygonOptions.fillColor(KmlStyle.computeRandomColor(polygonOptions.getFillColor()));
                }
                Polygon polygonP = p(polygonOptions, (DataPolygon) geometry);
                polygonP.setVisible(z10);
                if (zHasProperty) {
                    polygonP.setZIndex(f10);
                }
                return polygonP;
            case "LineString":
                PolylineOptions polylineOptions = kmlStyle.getPolylineOptions();
                if (kmlStyle2 != null) {
                    Z(polylineOptions, kmlStyle2);
                } else if (kmlStyle.isLineRandomColorMode()) {
                    polylineOptions.color(KmlStyle.computeRandomColor(polylineOptions.getColor()));
                }
                Polyline polylineI = i(polylineOptions, (LineString) geometry);
                polylineI.setVisible(z10);
                if (zHasProperty) {
                    polylineI.setZIndex(f10);
                }
                return polylineI;
            default:
                return null;
        }
    }

    public boolean isLayerOnMap() {
        return this.f33942k;
    }

    protected GroundOverlay q(GroundOverlayOptions groundOverlayOptions) {
        return this.f33951t.addGroundOverlay(groundOverlayOptions);
    }

    protected void r(String str, Bitmap bitmap) {
        this.f33940i.f33955c.put(str, bitmap);
    }

    protected void s() {
        ImagesCache imagesCache;
        if (this.f33941j != 0 || (imagesCache = this.f33940i) == null || imagesCache.f33955c.isEmpty()) {
            return;
        }
        this.f33940i.f33955c.clear();
    }

    public void setMap(GoogleMap googleMap) {
        this.f33932a = googleMap;
    }

    protected void t() {
        this.f33935d.clear();
    }

    protected void v() {
        this.f33941j--;
        s();
    }

    protected void w() {
        this.f33941j++;
    }

    protected HashMap x() {
        return this.f33933b;
    }

    protected BitmapDescriptor y(String str) {
        Bitmap bitmap;
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) this.f33940i.f33954b.get(str);
        if (bitmapDescriptor != null || (bitmap = (Bitmap) this.f33940i.f33955c.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
        this.f33940i.f33954b.put(str, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    protected BitmapDescriptor z(String str, double d10) {
        Bitmap bitmap;
        String str2 = f33931v.format(d10);
        Map map = (Map) this.f33940i.f33953a.get(str);
        BitmapDescriptor bitmapDescriptor = map != null ? (BitmapDescriptor) map.get(str2) : null;
        if (bitmapDescriptor != null || (bitmap = (Bitmap) this.f33940i.f33955c.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor bitmapDescriptorX = X(bitmap, d10);
        P(str, str2, bitmapDescriptorX);
        return bitmapDescriptorX;
    }

    public Renderer(GoogleMap googleMap, HashMap<? extends Feature, Object> map, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this(googleMap, null, new GeoJsonPointStyle(), new GeoJsonLineStringStyle(), new GeoJsonPolygonStyle(), null, markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.f33933b.putAll(map);
        this.f33940i = null;
    }

    private Renderer(GoogleMap googleMap, Set set, GeoJsonPointStyle geoJsonPointStyle, GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonPolygonStyle geoJsonPolygonStyle, BiMultiMap biMultiMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this.f33933b = new BiMultiMap();
        this.f33941j = 0;
        this.f33932a = googleMap;
        this.f33942k = false;
        this.f33939h = set;
        this.f33945n = geoJsonPointStyle;
        this.f33946o = geoJsonLineStringStyle;
        this.f33947p = geoJsonPolygonStyle;
        this.f33937f = biMultiMap;
        if (googleMap != null) {
            this.f33948q = (markerManager == null ? new MarkerManager(googleMap) : markerManager).newCollection();
            this.f33949r = (polygonManager == null ? new PolygonManager(googleMap) : polygonManager).newCollection();
            this.f33950s = (polylineManager == null ? new PolylineManager(googleMap) : polylineManager).newCollection();
            this.f33951t = (groundOverlayManager == null ? new GroundOverlayManager(googleMap) : groundOverlayManager).newCollection();
            return;
        }
        this.f33948q = null;
        this.f33949r = null;
        this.f33950s = null;
        this.f33951t = null;
    }
}
