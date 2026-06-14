package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class KmlTrack extends KmlLineString {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f34023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f34024d;

    public KmlTrack(ArrayList<LatLng> arrayList, ArrayList<Double> arrayList2, ArrayList<Long> arrayList3, HashMap<String, String> map) {
        super(arrayList, arrayList2);
        this.f34023c = arrayList3;
        this.f34024d = map;
    }

    public HashMap<String, String> getProperties() {
        return this.f34024d;
    }

    public ArrayList<Long> getTimestamps() {
        return this.f34023c;
    }
}
