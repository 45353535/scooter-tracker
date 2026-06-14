package com.google.maps.android.data;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MultiGeometry implements Geometry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33927a = "MultiGeometry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f33928b;

    public MultiGeometry(List<? extends Geometry> list) {
        if (list == null) {
            throw new IllegalArgumentException("Geometries cannot be null");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Geometry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f33928b = arrayList;
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return this.f33927a;
    }

    public void setGeometryType(String str) {
        this.f33927a = str;
    }

    @NonNull
    public String toString() {
        String str = this.f33927a.equals("MultiPoint") ? "LineStrings=" : "Geometries=";
        if (this.f33927a.equals("MultiLineString")) {
            str = "points=";
        }
        if (this.f33927a.equals("MultiPolygon")) {
            str = "Polygons=";
        }
        StringBuilder sb2 = new StringBuilder(getGeometryType());
        sb2.append("{");
        sb2.append("\n " + str);
        sb2.append(getGeometryObject());
        sb2.append("\n}\n");
        return sb2.toString();
    }

    @Override // com.google.maps.android.data.Geometry
    public List<Geometry> getGeometryObject() {
        return this.f33928b;
    }
}
