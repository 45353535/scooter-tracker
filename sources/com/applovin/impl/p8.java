package com.applovin.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class p8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p8 f10120f = new p8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p8 f10121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f10124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final List f10125e;

    public p8(String str, Map map, p8 p8Var) {
        this.f10121a = p8Var;
        this.f10122b = str;
        this.f10123c = DesugarCollections.unmodifiableMap(map);
        this.f10125e = new ArrayList();
    }

    public Map a() {
        return this.f10123c;
    }

    public List b() {
        return DesugarCollections.unmodifiableList(this.f10125e);
    }

    public String c() {
        return this.f10122b;
    }

    public String d() {
        return this.f10124d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f10122b + "', text='" + this.f10124d + "', attributes=" + this.f10123c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f10125e.size());
        for (p8 p8Var : this.f10125e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                arrayList.add(p8Var);
            }
        }
        return arrayList;
    }

    public p8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f10125e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            p8 p8Var = (p8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
            arrayList.addAll(p8Var.b());
        }
        return null;
    }

    public p8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (p8 p8Var : this.f10125e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
        }
        return null;
    }

    private p8() {
        this.f10121a = null;
        this.f10122b = "";
        this.f10123c = Collections.EMPTY_MAP;
        this.f10124d = "";
        this.f10125e = Collections.EMPTY_LIST;
    }
}
