package io.bidmachine.analytics.internal.g;

import java.util.Map;
import java.util.UUID;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f79537g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f79539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f79540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f79541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f79542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f79543f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(String str, String str2, String str3, long j10, Map map, e eVar) {
        this.f79538a = str;
        this.f79539b = str2;
        this.f79540c = str3;
        this.f79541d = j10;
        this.f79542e = map;
        this.f79543f = eVar;
    }

    public final b a(String str, String str2, String str3, long j10, Map map, e eVar) {
        return new b(str, str2, str3, j10, map, eVar);
    }

    public final e b() {
        return this.f79543f;
    }

    public final String c() {
        return this.f79538a;
    }

    public final String d() {
        return this.f79539b;
    }

    public final String e() {
        return this.f79540c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f79538a, bVar.f79538a) && Intrinsics.areEqual(this.f79539b, bVar.f79539b) && Intrinsics.areEqual(this.f79540c, bVar.f79540c) && this.f79541d == bVar.f79541d && Intrinsics.areEqual(this.f79542e, bVar.f79542e) && Intrinsics.areEqual(this.f79543f, bVar.f79543f);
    }

    public final long f() {
        return this.f79541d;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f79538a.hashCode() * 31) + this.f79539b.hashCode()) * 31) + this.f79540c.hashCode()) * 31) + androidx.collection.b.a(this.f79541d)) * 31) + this.f79542e.hashCode()) * 31;
        e eVar = this.f79543f;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        return "MonitorRecord(id=" + this.f79538a + ", name=" + this.f79539b + ", sessionId=" + this.f79540c + ", timestamp=" + this.f79541d + ", data=" + this.f79542e + ", error=" + this.f79543f + ')';
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, String str3, long j10, Map map, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f79538a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f79539b;
        }
        if ((i10 & 4) != 0) {
            str3 = bVar.f79540c;
        }
        if ((i10 & 8) != 0) {
            j10 = bVar.f79541d;
        }
        if ((i10 & 16) != 0) {
            map = bVar.f79542e;
        }
        if ((i10 & 32) != 0) {
            eVar = bVar.f79543f;
        }
        long j11 = j10;
        String str4 = str3;
        return bVar.a(str, str2, str4, j11, map, eVar);
    }

    public final Map a() {
        return this.f79542e;
    }

    public /* synthetic */ b(String str, String str2, String str3, long j10, Map map, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, (i10 & 8) != 0 ? System.currentTimeMillis() : j10, (i10 & 16) != 0 ? MapsKt.emptyMap() : map, (i10 & 32) != 0 ? null : eVar);
    }
}
