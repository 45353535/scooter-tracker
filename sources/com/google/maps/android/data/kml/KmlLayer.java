package com.google.maps.android.data.kml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.RawRes;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import com.google.maps.android.data.Renderer;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes9.dex */
public class KmlLayer extends Layer {
    public KmlLayer(GoogleMap googleMap, int i10, Context context) throws XmlPullParserException, IOException {
        this(googleMap, context.getResources().openRawResource(i10), context, new MarkerManager(googleMap), new PolygonManager(googleMap), new PolylineManager(googleMap), new GroundOverlayManager(googleMap), (Renderer.ImagesCache) null);
    }

    private static XmlPullParser g(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return xmlPullParserNewPullParser;
    }

    private static KmlParser h(InputStream inputStream) throws XmlPullParserException, IOException {
        KmlParser kmlParser = new KmlParser(g(inputStream));
        kmlParser.f();
        return kmlParser;
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.c();
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<KmlContainer> getContainers() {
        return super.getContainers();
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return super.getGroundOverlays();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return getFeatures();
    }

    @Override // com.google.maps.android.data.Layer
    public boolean hasContainers() {
        return super.hasContainers();
    }

    public boolean hasPlacemarks() {
        return d();
    }

    public KmlLayer(GoogleMap googleMap, InputStream inputStream, Context context) throws XmlPullParserException, IOException {
        this(googleMap, inputStream, context, new MarkerManager(googleMap), new PolygonManager(googleMap), new PolylineManager(googleMap), new GroundOverlayManager(googleMap), (Renderer.ImagesCache) null);
    }

    public KmlLayer(GoogleMap googleMap, @RawRes int i10, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) throws XmlPullParserException, IOException {
        this(googleMap, context.getResources().openRawResource(i10), context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
    }

    public KmlLayer(GoogleMap googleMap, InputStream inputStream, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) throws XmlPullParserException, IOException {
        if (inputStream != null) {
            KmlRenderer kmlRenderer = new KmlRenderer(googleMap, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(1024);
            ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    HashMap map = new HashMap();
                    KmlParser kmlParserH = null;
                    while (nextEntry != null) {
                        if (kmlParserH == null && nextEntry.getName().toLowerCase().endsWith(".kml")) {
                            kmlParserH = h(zipInputStream);
                        } else {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(zipInputStream);
                            if (bitmapDecodeStream != null) {
                                map.put(nextEntry.getName(), bitmapDecodeStream);
                            } else {
                                Log.w("KmlLayer", "Unsupported KMZ contents file type: " + nextEntry.getName());
                            }
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                    if (kmlParserH != null) {
                        kmlRenderer.O0(kmlParserH.e(), kmlParserH.d(), kmlParserH.c(), kmlParserH.a(), kmlParserH.b(), map);
                    } else {
                        throw new IllegalArgumentException("KML not found in InputStream");
                    }
                } else {
                    bufferedInputStream.reset();
                    KmlParser kmlParserH2 = h(bufferedInputStream);
                    kmlRenderer.N0(kmlParserH2.e(), kmlParserH2.d(), kmlParserH2.c(), kmlParserH2.a(), kmlParserH2.b());
                    kmlRenderer = kmlRenderer;
                }
                f(kmlRenderer);
                inputStream.close();
                bufferedInputStream.close();
                zipInputStream.close();
                return;
            } catch (Throwable th2) {
                inputStream.close();
                bufferedInputStream.close();
                zipInputStream.close();
                throw th2;
            }
        }
        throw new IllegalArgumentException("KML InputStream cannot be null");
    }
}
