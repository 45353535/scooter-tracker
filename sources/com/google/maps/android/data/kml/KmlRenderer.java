package com.google.maps.android.data.kml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import com.google.maps.android.data.Renderer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class KmlRenderer extends Renderer {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Set f34004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f34005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f34006y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList f34007z;

    private class GroundOverlayImageDownload extends AsyncTask<String, Void, Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34008a;

        public GroundOverlayImageDownload(String str) {
            this.f34008a = str;
            KmlRenderer.this.w();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.H0(this.f34008a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f34008a);
            } catch (IOException e10) {
                Log.e("KmlRenderer", "Image [" + this.f34008a + "] download issue", e10);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f34008a);
            } else {
                KmlRenderer.this.r(this.f34008a, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.x0(this.f34008a, kmlRenderer.getGroundOverlayMap(), true);
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.w0(this.f34008a, kmlRenderer2.f34007z, true);
                }
            }
            KmlRenderer.this.v();
        }
    }

    private class MarkerIconImageDownload extends AsyncTask<String, Void, Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34010a;

        public MarkerIconImageDownload(String str) {
            this.f34010a = str;
            KmlRenderer.this.w();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.H0(this.f34010a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f34010a);
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f34010a);
            } else {
                KmlRenderer.this.r(this.f34010a, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.C0(this.f34010a, kmlRenderer.x());
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.t0(this.f34010a, kmlRenderer2.f34007z);
                }
            }
            KmlRenderer.this.v();
        }
    }

    KmlRenderer(GoogleMap googleMap, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) {
        super(googleMap, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
        this.f34004w = new HashSet();
        this.f34005x = false;
        this.f34006y = false;
    }

    private void A0(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Geometry geometry, Object obj) {
        if (geometry == null) {
            return;
        }
        if ("Point".equals(geometry.getGeometryType())) {
            B0(str, kmlStyle, kmlStyle2, (Marker) obj);
        } else if ("MultiGeometry".equals(geometry.getGeometryType())) {
            D0(str, kmlStyle, kmlStyle2, (MultiGeometry) geometry, (List) obj);
        }
    }

    private void B0(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Marker marker) {
        boolean z10 = false;
        boolean z11 = kmlStyle2 != null && str.equals(kmlStyle2.getIconUrl());
        if (kmlStyle != null && str.equals(kmlStyle.getIconUrl())) {
            z10 = true;
        }
        if (z11) {
            M0(kmlStyle2, marker);
        } else if (z10) {
            M0(kmlStyle, marker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(String str, HashMap map) {
        for (Feature feature : map.keySet()) {
            A0(str, (KmlStyle) K().get(feature.getId()), ((KmlPlacemark) feature).getInlineStyle(), feature.getGeometry(), map.get(feature));
        }
    }

    private void D0(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, MultiGeometry multiGeometry, List list) {
        Iterator<Geometry> it = multiGeometry.getGeometryObject().iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            A0(str, kmlStyle, kmlStyle2, it.next(), it2.next());
        }
    }

    private void E0(HashMap map) {
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            e((Feature) it.next());
        }
    }

    private void F0() {
        this.f34006y = true;
        Iterator it = this.f34004w.iterator();
        while (it.hasNext()) {
            new GroundOverlayImageDownload((String) it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private void G0() {
        this.f34005x = true;
        Iterator it = G().iterator();
        while (it.hasNext()) {
            new MarkerIconImageDownload((String) it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap H0(String str) {
        return BitmapFactory.decodeStream(J0(new URL(str).openConnection()));
    }

    static boolean I0(KmlContainer kmlContainer, boolean z10) {
        return z10 && (!kmlContainer.hasProperty("visibility") || Integer.parseInt(kmlContainer.getProperty("visibility")) != 0);
    }

    private InputStream J0(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        boolean z10;
        HttpURLConnection httpURLConnection;
        int responseCode;
        int i10 = 0;
        do {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            }
            inputStream = uRLConnection.getInputStream();
            if (!(uRLConnection instanceof HttpURLConnection) || (responseCode = (httpURLConnection = (HttpURLConnection) uRLConnection).getResponseCode()) < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                z10 = false;
            } else {
                URL url = httpURLConnection.getURL();
                String headerField = httpURLConnection.getHeaderField("Location");
                URL url2 = headerField != null ? new URL(url, headerField) : null;
                httpURLConnection.disconnect();
                if (url2 == null || (!(url2.getProtocol().equals("http") || url2.getProtocol().equals("https")) || i10 >= 5)) {
                    throw new SecurityException("illegal URL redirect");
                }
                uRLConnection = url2.openConnection();
                i10++;
                z10 = true;
            }
        } while (z10);
        return inputStream;
    }

    private void K0(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            KmlContainer kmlContainer = (KmlContainer) it.next();
            L0(kmlContainer.b());
            W(kmlContainer.a());
            K0(kmlContainer.getContainers());
        }
    }

    private void L0(HashMap map) {
        U(map);
    }

    private void M0(KmlStyle kmlStyle, Marker marker) {
        marker.setIcon(z(kmlStyle.getIconUrl(), kmlStyle.getIconScale()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(String str, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            KmlContainer kmlContainer = (KmlContainer) it.next();
            C0(str, kmlContainer.b());
            if (kmlContainer.hasContainers()) {
                t0(str, kmlContainer.getContainers());
            }
        }
    }

    private void u0(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            KmlContainer kmlContainer = (KmlContainer) it.next();
            boolean zI0 = I0(kmlContainer, z10);
            if (kmlContainer.d() != null) {
                R(kmlContainer.d());
            }
            if (kmlContainer.c() != null) {
                super.assignStyleMap(kmlContainer.c(), K());
            }
            v0(kmlContainer, zI0);
            if (kmlContainer.hasContainers()) {
                u0(kmlContainer.getContainers(), zI0);
            }
        }
    }

    private void v0(KmlContainer kmlContainer, boolean z10) {
        for (KmlPlacemark kmlPlacemark : kmlContainer.getPlacemarks()) {
            boolean z11 = z10 && Renderer.I(kmlPlacemark);
            if (kmlPlacemark.getGeometry() != null) {
                KmlPlacemark kmlPlacemark2 = kmlPlacemark;
                Object objH = h(kmlPlacemark2, kmlPlacemark.getGeometry(), H(kmlPlacemark.getId()), kmlPlacemark2.getInlineStyle(), z11);
                kmlContainer.e(kmlPlacemark2, objH);
                N(objH, kmlPlacemark);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(String str, Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            KmlContainer kmlContainer = (KmlContainer) it.next();
            boolean zI0 = I0(kmlContainer, z10);
            x0(str, kmlContainer.a(), zI0);
            if (kmlContainer.hasContainers()) {
                w0(str, kmlContainer.getContainers(), zI0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(String str, HashMap map, boolean z10) {
        BitmapDescriptor bitmapDescriptorY = y(str);
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            if (kmlGroundOverlay.getImageUrl().equals(str)) {
                GroundOverlay groundOverlayQ = q(kmlGroundOverlay.a().image(bitmapDescriptorY));
                if (!z10) {
                    groundOverlayQ.setVisible(false);
                }
                map.put(kmlGroundOverlay, groundOverlayQ);
            }
        }
    }

    private void y0(HashMap map) {
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            String imageUrl = kmlGroundOverlay.getImageUrl();
            if (imageUrl != null && kmlGroundOverlay.getLatLngBox() != null) {
                if (y(imageUrl) != null) {
                    x0(imageUrl, map, true);
                } else {
                    this.f34004w.add(imageUrl);
                }
            }
        }
    }

    private void z0(HashMap map, Iterable iterable) {
        y0(map);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            KmlContainer kmlContainer = (KmlContainer) it.next();
            z0(kmlContainer.a(), kmlContainer.getContainers());
        }
    }

    void N0(HashMap map, HashMap map2, HashMap map3, ArrayList arrayList, HashMap map4) {
        f0(map, map2, map3, arrayList, map4);
    }

    void O0(HashMap map, HashMap map2, HashMap map3, ArrayList arrayList, HashMap map4, HashMap map5) {
        f0(map, map2, map3, arrayList, map4);
        for (Map.Entry entry : map5.entrySet()) {
            r((String) entry.getKey(), (Bitmap) entry.getValue());
        }
    }

    public void addLayerToMap() {
        c0(true);
        this.f34007z = B();
        Q();
        assignStyleMap(J(), K());
        z0(getGroundOverlayMap(), this.f34007z);
        u0(this.f34007z, true);
        E0(x());
        if (!this.f34006y) {
            F0();
        }
        if (!this.f34005x) {
            G0();
        }
        s();
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return getGroundOverlayMap().keySet();
    }

    public Iterable<KmlContainer> getNestedContainers() {
        return this.f34007z;
    }

    public boolean hasNestedContainers() {
        return this.f34007z.size() > 0;
    }

    public void removeLayerFromMap() {
        L0(x());
        W(getGroundOverlayMap());
        if (hasNestedContainers()) {
            K0(getNestedContainers());
        }
        c0(false);
        t();
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(GoogleMap googleMap) {
        removeLayerFromMap();
        super.setMap(googleMap);
        addLayerToMap();
    }
}
