package com.explorestack.protobuf;

import com.explorestack.protobuf.g0;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f19391b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f19392c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile w f19393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final w f19394e = new w(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19395a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f19396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19397b;

        a(Object obj, int i10) {
            this.f19396a = obj;
            this.f19397b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19396a == aVar.f19396a && this.f19397b == aVar.f19397b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19396a) * 65535) + this.f19397b;
        }
    }

    w(w wVar) {
        if (wVar == f19394e) {
            this.f19395a = Collections.EMPTY_MAP;
        } else {
            this.f19395a = DesugarCollections.unmodifiableMap(wVar.f19395a);
        }
    }

    public static w b() {
        w wVarA;
        w wVar = f19393d;
        if (wVar != null) {
            return wVar;
        }
        synchronized (w.class) {
            try {
                wVarA = f19393d;
                if (wVarA == null) {
                    wVarA = f19392c ? v.a() : f19394e;
                    f19393d = wVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVarA;
    }

    public static boolean c() {
        return f19391b;
    }

    public g0.a a(MessageLite messageLite, int i10) {
        androidx.privacysandbox.ads.adservices.topics.a.a(this.f19395a.get(new a(messageLite, i10)));
        return null;
    }

    w(boolean z10) {
        this.f19395a = Collections.EMPTY_MAP;
    }
}
