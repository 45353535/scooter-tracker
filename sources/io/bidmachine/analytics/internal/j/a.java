package io.bidmachine.analytics.internal.j;

import android.content.Context;
import io.bidmachine.analytics.internal.g.e;
import io.bidmachine.analytics.internal.i.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends io.bidmachine.analytics.internal.i.a implements io.bidmachine.analytics.internal.h.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.bidmachine.analytics.internal.h.b f79596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f79597e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f79598f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f79599g;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.j.a$a, reason: collision with other inner class name */
    public enum EnumC0951a {
        UNSPECIFIED,
        BANNER,
        INTERSTITIAL,
        REWARDED,
        NATIVE
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f79606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f79607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Float f79608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f79609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f79610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f79611f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Float f79612g;

        public b(String str, int i10, Float f10, String str2, String str3, boolean z10) {
            this.f79606a = str;
            this.f79607b = i10;
            this.f79608c = f10;
            this.f79609d = str2;
            this.f79610e = str3;
            this.f79611f = z10;
            this.f79612g = f10 != null ? Float.valueOf(f10.floatValue() * 1000) : null;
        }

        public final b a(String str, int i10, Float f10, String str2, String str3, boolean z10) {
            return new b(str, i10, f10, str2, str3, z10);
        }

        public final int b() {
            return this.f79607b;
        }

        public final Float c() {
            return this.f79612g;
        }

        public final String d() {
            return this.f79606a;
        }

        public final String e() {
            return this.f79609d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f79606a, bVar.f79606a) && this.f79607b == bVar.f79607b && Intrinsics.areEqual((Object) this.f79608c, (Object) bVar.f79608c) && Intrinsics.areEqual(this.f79609d, bVar.f79609d) && Intrinsics.areEqual(this.f79610e, bVar.f79610e) && this.f79611f == bVar.f79611f;
        }

        public final boolean f() {
            return this.f79611f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v9, types: [int] */
        public int hashCode() {
            int iHashCode = ((this.f79606a.hashCode() * 31) + this.f79607b) * 31;
            Float f10 = this.f79608c;
            int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            String str = this.f79609d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f79610e;
            int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z10 = this.f79611f;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode4 + r12;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Float f10, String str2, String str3, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f79606a;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.f79607b;
            }
            if ((i11 & 4) != 0) {
                f10 = bVar.f79608c;
            }
            if ((i11 & 8) != 0) {
                str2 = bVar.f79609d;
            }
            if ((i11 & 16) != 0) {
                str3 = bVar.f79610e;
            }
            if ((i11 & 32) != 0) {
                z10 = bVar.f79611f;
            }
            String str4 = str3;
            boolean z11 = z10;
            return bVar.a(str, i10, f10, str2, str4, z11);
        }

        public final String a() {
            return this.f79610e;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ b(java.lang.String r3, int r4, java.lang.Float r5, java.lang.String r6, java.lang.String r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r2 = this;
                r10 = r9 & 1
                if (r10 == 0) goto Lc
                java.util.UUID r3 = java.util.UUID.randomUUID()
                java.lang.String r3 = r3.toString()
            Lc:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto L12
                r4 = r0
            L12:
                r10 = r9 & 4
                r1 = 0
                if (r10 == 0) goto L18
                r5 = r1
            L18:
                r10 = r9 & 8
                if (r10 == 0) goto L1d
                r6 = r1
            L1d:
                r10 = r9 & 16
                if (r10 == 0) goto L22
                r7 = r1
            L22:
                r9 = r9 & 32
                if (r9 == 0) goto L2e
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L35
            L2e:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L35:
                r4.<init>(r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.j.a.b.<init>(java.lang.String, int, java.lang.Float, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public void a(a.C0950a c0950a) {
        this.f79596d = c0950a.a();
    }

    public final b b() {
        b bVar;
        synchronized (this.f79597e) {
            bVar = this.f79599g;
        }
        return bVar;
    }

    public abstract b b(Map map);

    public abstract EnumC0951a c(Map map);

    @Override // io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        synchronized (this.f79597e) {
            this.f79598f.clear();
            this.f79599g = null;
            Unit unit = Unit.f93236a;
        }
    }

    @Override // io.bidmachine.analytics.internal.h.b
    public void a(Map map) {
        b bVarB;
        b bVarA;
        io.bidmachine.analytics.internal.h.b bVar = this.f79596d;
        if (bVar != null) {
            bVar.a(map);
        }
        EnumC0951a enumC0951aC = c(map);
        if (enumC0951aC == null || (bVarB = b(map)) == null) {
            return;
        }
        synchronized (this.f79597e) {
            try {
                b bVar2 = this.f79599g;
                if (Intrinsics.areEqual(bVar2 != null ? bVar2.d() : null, bVarB.d())) {
                    b bVar3 = this.f79599g;
                    bVarA = b.a(bVarB, null, bVar3 != null ? bVar3.b() : 0, null, null, null, false, 61, null);
                } else {
                    b bVar4 = this.f79599g;
                    bVarA = b.a(bVarB, null, (bVar4 != null ? bVar4.b() : 0) + 1, null, null, null, false, 61, null);
                }
                this.f79599g = bVarA;
                b bVar5 = (b) this.f79598f.get(enumC0951aC);
                this.f79598f.put(enumC0951aC, bVar5 == null ? b.a(bVarB, null, 1, null, null, null, false, 61, null) : Intrinsics.areEqual(bVarB.d(), bVar5.d()) ? b.a(bVarB, null, bVar5.b(), null, null, null, false, 61, null) : b.a(bVarB, null, bVar5.b() + 1, null, null, null, false, 61, null));
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.bidmachine.analytics.internal.h.b
    public void a(e eVar) {
        io.bidmachine.analytics.internal.h.b bVar = this.f79596d;
        if (bVar != null) {
            bVar.a(eVar);
        }
    }

    public final b a(EnumC0951a enumC0951a) {
        b bVar;
        synchronized (this.f79597e) {
            bVar = (b) this.f79598f.get(enumC0951a);
        }
        return bVar;
    }
}
