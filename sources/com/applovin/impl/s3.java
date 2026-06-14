package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f10389c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f10390d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s3 f10391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s3 f10392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s3 f10393g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f10395b;

    public enum a {
        SESSION(com.taurusx.tax.g.b.f66095s),
        INSTALL("install");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10399a;

        a(String str) {
            this.f10399a = str;
        }

        public String b() {
            return this.f10399a;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f10391e = a("ars", aVar, a.INSTALL);
        f10392f = a("ar", aVar);
        f10393g = a("ttdasi_ms", aVar);
    }

    private s3(String str, Set set) {
        this.f10394a = str;
        this.f10395b = set;
    }

    protected boolean a(Object obj) {
        return obj instanceof s3;
    }

    public Set b() {
        return this.f10395b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        if (!s3Var.a(this)) {
            return false;
        }
        String strA = a();
        String strA2 = s3Var.a();
        if (strA != null ? !strA.equals(strA2) : strA2 != null) {
            return false;
        }
        Set setB = b();
        Set setB2 = s3Var.b();
        return setB != null ? setB.equals(setB2) : setB2 == null;
    }

    public int hashCode() {
        String strA = a();
        int iHashCode = strA == null ? 43 : strA.hashCode();
        Set setB = b();
        return ((iHashCode + 59) * 59) + (setB != null ? setB.hashCode() : 43);
    }

    public String toString() {
        return this.f10394a;
    }

    public String a() {
        return this.f10394a;
    }

    private static s3 a(String str, a... aVarArr) {
        Set set = f10389c;
        if (!set.contains(str)) {
            s3 s3Var = new s3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f10390d.put(str, s3Var);
            return s3Var;
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public boolean a(a aVar) {
        return this.f10395b.contains(aVar);
    }

    public static s3 a(String str) {
        return (s3) f10390d.get(str);
    }
}
