package com.moloco.sdk.internal.publisher;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f55164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55165b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55166a;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.f54776b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.f54777c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j0.f54778d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j0.f54781g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j0.f54782h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j0.f54780f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j0.f54779e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f55166a = iArr;
        }
    }

    public /* synthetic */ p(Map map, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, j10);
    }

    public final Map a() {
        return this.f55164a;
    }

    public final long b() {
        return this.f55165b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f55164a, pVar.f55164a) && kotlin.time.b.l(this.f55165b, pVar.f55165b);
    }

    public int hashCode() {
        return (this.f55164a.hashCode() * 31) + kotlin.time.b.y(this.f55165b);
    }

    public String toString() {
        return "AdCreatorConfiguration(adTimeouts=" + this.f55164a + ", defaultTimeoutDuration=" + ((Object) kotlin.time.b.L(this.f55165b)) + ')';
    }

    public p(Map adTimeouts, long j10) {
        Intrinsics.checkNotNullParameter(adTimeouts, "adTimeouts");
        this.f55164a = adTimeouts;
        this.f55165b = j10;
    }

    public /* synthetic */ p(Map map, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long jS;
        if ((i10 & 1) != 0) {
            j0[] j0VarArrValues = j0.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(j0VarArrValues.length), 16));
            for (j0 j0Var : j0VarArrValues) {
                switch (a.f55166a[j0Var.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        jS = kotlin.time.c.s(5, cg.b.f6839f);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        jS = kotlin.time.c.s(15, cg.b.f6839f);
                        break;
                    default:
                        throw new lf.m();
                }
                linkedHashMap.put(j0Var, kotlin.time.b.g(jS));
            }
            map = linkedHashMap;
        }
        this(map, (i10 & 2) != 0 ? kotlin.time.c.s(5, cg.b.f6839f) : j10, null);
    }
}
