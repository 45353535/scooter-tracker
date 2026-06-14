package com.google.maps.android.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* JADX INFO: loaded from: classes9.dex */
public class Feature extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f33922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Geometry f33924c;

    public Feature(Geometry geometry, String str, Map<String, String> map) {
        this.f33924c = geometry;
        this.f33922a = str;
        if (map == null) {
            this.f33923b = new HashMap();
        } else {
            this.f33923b = map;
        }
    }

    public Geometry getGeometry() {
        return this.f33924c;
    }

    public String getId() {
        return this.f33922a;
    }

    public Iterable getProperties() {
        return this.f33923b.entrySet();
    }

    public String getProperty(String str) {
        return (String) this.f33923b.get(str);
    }

    public Iterable<String> getPropertyKeys() {
        return this.f33923b.keySet();
    }

    public boolean hasGeometry() {
        return this.f33924c != null;
    }

    public boolean hasProperties() {
        return this.f33923b.size() > 0;
    }

    public boolean hasProperty(String str) {
        return this.f33923b.containsKey(str);
    }

    protected String removeProperty(String str) {
        return (String) this.f33923b.remove(str);
    }

    protected void setGeometry(Geometry geometry) {
        this.f33924c = geometry;
    }

    protected String setProperty(String str, String str2) {
        return (String) this.f33923b.put(str, str2);
    }
}
