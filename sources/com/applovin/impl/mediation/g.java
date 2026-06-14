package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9689c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9687a = DesugarCollections.synchronizedMap(new HashMap(16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9690d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f9691e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f9692f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9693g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f9694h = new HashSet();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f9697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f9698d;

        a(String str, String str2, y2 y2Var, com.applovin.impl.sdk.k kVar) {
            this.f9695a = str;
            this.f9696b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f9698d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var == null) {
                this.f9697c = null;
            } else {
                this.f9697c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            }
        }

        JSONObject a() {
            return this.f9698d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f9695a.equals(aVar.f9695a) || !this.f9696b.equals(aVar.f9696b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f9697c;
            MaxAdFormat maxAdFormat2 = aVar.f9697c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iHashCode = ((this.f9695a.hashCode() * 31) + this.f9696b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f9697c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f9695a + "', operationTag='" + this.f9696b + "', format=" + this.f9697c + '}';
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f9688b = kVar;
        this.f9689c = kVar.O();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f9693g) {
            try {
                arrayList = new ArrayList(this.f9694h.size());
                Iterator it = this.f9694h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f9690d) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f9692f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f9690d) {
            try {
                HashSet hashSet = new HashSet(this.f9691e.size());
                Iterator it = this.f9691e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return setUnmodifiableSet;
    }

    h a(k3 k3Var) {
        return a(k3Var, false);
    }

    h a(k3 k3Var, boolean z10) {
        Class clsA;
        h hVar;
        if (k3Var != null) {
            String strC = k3Var.c();
            String strB = k3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9689c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9689c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z10 && (hVar = (h) this.f9687a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f9690d) {
                try {
                    if (!this.f9692f.contains(strB)) {
                        if (this.f9691e.containsKey(strB)) {
                            clsA = (Class) this.f9691e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f9689c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                                }
                                this.f9692f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(k3Var, clsA, z10);
                        if (hVarA != null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f9689c.a("MediationAdapterManager", "Loaded " + strC);
                            }
                            this.f9691e.put(strB, clsA);
                            if (z10) {
                                this.f9687a.put(k3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f9689c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f9692f.add(strB);
                        return null;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9689c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.f9693g) {
            try {
                this.f9688b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9688b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f9694h.add(new a(str, str2, y2Var, this.f9688b));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private h a(k3 k3Var, Class cls, boolean z10) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f9688b.y0()), z10, this.f9688b);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th2);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
