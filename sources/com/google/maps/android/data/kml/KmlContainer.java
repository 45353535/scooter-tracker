package com.google.maps.android.data.kml;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class KmlContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f33981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f33982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f33983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f33984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f33985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap f33986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33987g;

    KmlContainer(HashMap map, HashMap map2, HashMap map3, HashMap map4, ArrayList arrayList, HashMap map5, String str) {
        this.f33981a = map;
        this.f33982b = map3;
        this.f33986f = map2;
        this.f33985e = map4;
        this.f33983c = arrayList;
        this.f33984d = map5;
        this.f33987g = str;
    }

    HashMap a() {
        return this.f33984d;
    }

    HashMap b() {
        return this.f33982b;
    }

    HashMap c() {
        return this.f33985e;
    }

    HashMap d() {
        return this.f33986f;
    }

    void e(KmlPlacemark kmlPlacemark, Object obj) {
        this.f33982b.put(kmlPlacemark, obj);
    }

    public String getContainerId() {
        return this.f33987g;
    }

    public Iterable<KmlContainer> getContainers() {
        return this.f33983c;
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return this.f33984d.keySet();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return this.f33982b.keySet();
    }

    public Iterable<String> getProperties() {
        return this.f33981a.keySet();
    }

    public String getProperty(String str) {
        return (String) this.f33981a.get(str);
    }

    public KmlStyle getStyle(String str) {
        return (KmlStyle) this.f33986f.get(str);
    }

    public String getStyleIdFromMap(String str) {
        return (String) this.f33985e.get(str);
    }

    public boolean hasContainers() {
        return this.f33983c.size() > 0;
    }

    public boolean hasPlacemarks() {
        return this.f33982b.size() > 0;
    }

    public boolean hasProperties() {
        return this.f33981a.size() > 0;
    }

    public boolean hasProperty(String str) {
        return this.f33981a.containsKey(str);
    }

    @NonNull
    public String toString() {
        return "Container{\n properties=" + this.f33981a + ",\n placemarks=" + this.f33982b + ",\n containers=" + this.f33983c + ",\n ground overlays=" + this.f33984d + ",\n style maps=" + this.f33985e + ",\n styles=" + this.f33986f + "\n}\n";
    }
}
