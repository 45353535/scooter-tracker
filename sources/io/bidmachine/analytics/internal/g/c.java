package io.bidmachine.analytics.internal.g;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f79545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f79546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f79547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f79548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f79549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f79550g;

    public interface a {

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.g.c$a$a, reason: collision with other inner class name */
        public static final class C0949a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f79551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f79552b;

            public C0949a(String str, String str2) {
                this.f79551a = str;
                this.f79552b = str2;
            }

            public final String a() {
                return this.f79552b;
            }

            public final String b() {
                return this.f79551a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0949a)) {
                    return false;
                }
                C0949a c0949a = (C0949a) obj;
                return Intrinsics.areEqual(this.f79551a, c0949a.f79551a) && Intrinsics.areEqual(this.f79552b, c0949a.f79552b);
            }

            public int hashCode() {
                return (this.f79551a.hashCode() * 31) + this.f79552b.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f79553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f79554b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f79555c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f79556d;

            public b(String str, String str2, String str3, boolean z10) {
                this.f79553a = str;
                this.f79554b = str2;
                this.f79555c = str3;
                this.f79556d = z10;
            }

            public final String a() {
                return this.f79554b;
            }

            public final String b() {
                return this.f79555c;
            }

            public final boolean c() {
                return this.f79556d;
            }

            public final String d() {
                return this.f79553a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f79553a, bVar.f79553a) && Intrinsics.areEqual(this.f79554b, bVar.f79554b) && Intrinsics.areEqual(this.f79555c, bVar.f79555c) && this.f79556d == bVar.f79556d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v6, types: [int] */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v9 */
            public int hashCode() {
                int iHashCode = ((this.f79553a.hashCode() * 31) + this.f79554b.hashCode()) * 31;
                String str = this.f79555c;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                boolean z10 = this.f79556d;
                ?? r12 = z10;
                if (z10) {
                    r12 = 1;
                }
                return iHashCode2 + r12;
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public c(String str, String str2, long j10, String str3, a aVar, e eVar, boolean z10) {
        this.f79544a = str;
        this.f79545b = str2;
        this.f79546c = j10;
        this.f79547d = str3;
        this.f79548e = aVar;
        this.f79549f = eVar;
        this.f79550g = z10;
    }

    public final c a(String str, String str2, long j10, String str3, a aVar, e eVar, boolean z10) {
        return new c(str, str2, j10, str3, aVar, eVar, z10);
    }

    public final e b() {
        return this.f79549f;
    }

    public final String c() {
        return this.f79544a;
    }

    public final String d() {
        return this.f79545b;
    }

    public final a e() {
        return this.f79548e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f79544a, cVar.f79544a) && Intrinsics.areEqual(this.f79545b, cVar.f79545b) && this.f79546c == cVar.f79546c && Intrinsics.areEqual(this.f79547d, cVar.f79547d) && Intrinsics.areEqual(this.f79548e, cVar.f79548e) && Intrinsics.areEqual(this.f79549f, cVar.f79549f) && this.f79550g == cVar.f79550g;
    }

    public final long f() {
        return this.f79546c;
    }

    public final boolean g() {
        return this.f79550g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    public int hashCode() {
        int iHashCode = ((((((((this.f79544a.hashCode() * 31) + this.f79545b.hashCode()) * 31) + androidx.collection.b.a(this.f79546c)) * 31) + this.f79547d.hashCode()) * 31) + this.f79548e.hashCode()) * 31;
        e eVar = this.f79549f;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        boolean z10 = this.f79550g;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode2 + r12;
    }

    public String toString() {
        return "ReaderRecord(id=" + this.f79544a + ", name=" + this.f79545b + ", timestamp=" + this.f79546c + ", dataHash=" + this.f79547d + ", rule=" + this.f79548e + ", error=" + this.f79549f + ", isDirty=" + this.f79550g + ')';
    }

    public static /* synthetic */ c a(c cVar, String str, String str2, long j10, String str3, a aVar, e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f79544a;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.f79545b;
        }
        if ((i10 & 4) != 0) {
            j10 = cVar.f79546c;
        }
        if ((i10 & 8) != 0) {
            str3 = cVar.f79547d;
        }
        if ((i10 & 16) != 0) {
            aVar = cVar.f79548e;
        }
        if ((i10 & 32) != 0) {
            eVar = cVar.f79549f;
        }
        if ((i10 & 64) != 0) {
            z10 = cVar.f79550g;
        }
        long j11 = j10;
        return cVar.a(str, str2, j11, str3, aVar, eVar, z10);
    }

    public final String a() {
        return this.f79547d;
    }

    public /* synthetic */ c(String str, String str2, long j10, String str3, a aVar, e eVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, (i10 & 4) != 0 ? System.currentTimeMillis() : j10, str3, aVar, (i10 & 32) != 0 ? null : eVar, (i10 & 64) != 0 ? true : z10);
    }
}
