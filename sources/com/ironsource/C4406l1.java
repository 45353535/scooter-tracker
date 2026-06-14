package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4406l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4406l1 f43505a = new C4406l1();

    /* JADX INFO: renamed from: com.ironsource.l1$a */
    public static final class a implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final IronSource.a f43506a;

        public a(@NotNull IronSource.a value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f43506a = value;
        }

        private final IronSource.a a() {
            return this.f43506a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f43506a == ((a) obj).f43506a;
        }

        public int hashCode() {
            return this.f43506a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdFormatEntity(value=" + this.f43506a + ")";
        }

        @NotNull
        public final a a(@NotNull IronSource.a value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new a(value);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar2 = aVar.f43506a;
            }
            return aVar.a(aVar2);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(C4456nf.c(this.f43506a)));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$b */
    public static final class b implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43507a;

        public b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f43507a = value;
        }

        private final String a() {
            return this.f43507a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f43507a, ((b) obj).f43507a);
        }

        public int hashCode() {
            return this.f43507a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdIdentifier(value=" + this.f43507a + ")";
        }

        @NotNull
        public final b a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new b(value);
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f43507a;
            }
            return bVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f43507a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$c */
    public static final class c implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final AdSize f43508a;

        public c(@NotNull AdSize size) {
            Intrinsics.checkNotNullParameter(size, "size");
            this.f43508a = size;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC4423m1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                com.unity3d.ironsourceads.AdSize r0 = r3.f43508a
                java.lang.String r0 = r0.getSizeDescription()
                int r1 = r0.hashCode()
                r2 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
                if (r1 == r2) goto L45
                r2 = 72205083(0x44dc31b, float:2.4187222E-36)
                if (r1 == r2) goto L3a
                r2 = 446888797(0x1aa2fb5d, float:6.740773E-23)
                if (r1 == r2) goto L2f
                r2 = 1951953708(0x7458732c, float:6.859571E31)
                if (r1 == r2) goto L24
                goto L4d
            L24:
                java.lang.String r1 = "BANNER"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2d
                goto L4d
            L2d:
                r0 = 1
                goto L50
            L2f:
                java.lang.String r1 = "LEADERBOARD"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L38
                goto L4d
            L38:
                r0 = 4
                goto L50
            L3a:
                java.lang.String r1 = "LARGE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L43
                goto L4d
            L43:
                r0 = 2
                goto L50
            L45:
                java.lang.String r1 = "MEDIUM_RECTANGLE"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L4f
            L4d:
                r0 = 0
                goto L50
            L4f:
                r0 = 3
            L50:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.String r1 = "bannerAdSize"
                r4.put(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C4406l1.c.a(java.util.Map):void");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$d */
    public static final class d implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43509a;

        public d(@NotNull String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f43509a = auctionId;
        }

        private final String a() {
            return this.f43509a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f43509a, ((d) obj).f43509a);
        }

        public int hashCode() {
            return this.f43509a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AuctionId(auctionId=" + this.f43509a + ")";
        }

        @NotNull
        public final d a(@NotNull String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            return new d(auctionId);
        }

        public static /* synthetic */ d a(d dVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dVar.f43509a;
            }
            return dVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.f43509a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$e */
    public static final class e implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43510a;

        public e(int i10) {
            this.f43510a = i10;
        }

        private final int a() {
            return this.f43510a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f43510a == ((e) obj).f43510a;
        }

        public int hashCode() {
            return this.f43510a;
        }

        @NotNull
        public String toString() {
            return "DemandOnly(value=" + this.f43510a + ")";
        }

        @NotNull
        public final e a(int i10) {
            return new e(i10);
        }

        public static /* synthetic */ e a(e eVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = eVar.f43510a;
            }
            return eVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f43510a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$f */
    public static final class f implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f43511a;

        public f(long j10) {
            this.f43511a = j10;
        }

        private final long a() {
            return this.f43511a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f43511a == ((f) obj).f43511a;
        }

        public int hashCode() {
            return androidx.collection.b.a(this.f43511a);
        }

        @NotNull
        public String toString() {
            return "Duration(duration=" + this.f43511a + ")";
        }

        @NotNull
        public final f a(long j10) {
            return new f(j10);
        }

        public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = fVar.f43511a;
            }
            return fVar.a(j10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("duration", Long.valueOf(this.f43511a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$g */
    public static final class g implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43512a;

        public g(@NotNull String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.f43512a = dynamicSourceId;
        }

        private final String a() {
            return this.f43512a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f43512a, ((g) obj).f43512a);
        }

        public int hashCode() {
            return this.f43512a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f43512a + ")";
        }

        @NotNull
        public final g a(@NotNull String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        public static /* synthetic */ g a(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.f43512a;
            }
            return gVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f43512a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$h */
    public static final class h implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43513a;

        public h(@NotNull String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.f43513a = sourceId;
        }

        private final String a() {
            return this.f43513a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f43513a, ((h) obj).f43513a);
        }

        public int hashCode() {
            return this.f43513a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f43513a + ")";
        }

        @NotNull
        public final h a(@NotNull String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new h(sourceId);
        }

        public static /* synthetic */ h a(h hVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.f43513a;
            }
            return hVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f43513a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$i */
    public static final class i implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final i f43514a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$j */
    public static final class j implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43515a;

        public j(int i10) {
            this.f43515a = i10;
        }

        private final int a() {
            return this.f43515a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f43515a == ((j) obj).f43515a;
        }

        public int hashCode() {
            return this.f43515a;
        }

        @NotNull
        public String toString() {
            return "ErrorCode(code=" + this.f43515a + ")";
        }

        @NotNull
        public final j a(int i10) {
            return new j(i10);
        }

        public static /* synthetic */ j a(j jVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = jVar.f43515a;
            }
            return jVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("errorCode", Integer.valueOf(this.f43515a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$k */
    public static final class k implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f43516a;

        public k(@Nullable String str) {
            this.f43516a = str;
        }

        private final String a() {
            return this.f43516a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(this.f43516a, ((k) obj).f43516a);
        }

        public int hashCode() {
            String str = this.f43516a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "ErrorReason(reason=" + this.f43516a + ")";
        }

        @NotNull
        public final k a(@Nullable String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = kVar.f43516a;
            }
            return kVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String str = this.f43516a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f43516a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$l */
    public static final class l implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43517a;

        public l(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f43517a = value;
        }

        private final String a() {
            return this.f43517a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.areEqual(this.f43517a, ((l) obj).f43517a);
        }

        public int hashCode() {
            return this.f43517a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ext1(value=" + this.f43517a + ")";
        }

        @NotNull
        public final l a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new l(value);
        }

        public static /* synthetic */ l a(l lVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = lVar.f43517a;
            }
            return lVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f43517a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$m */
    public static final class m implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f43518a;

        public m(@Nullable JSONObject jSONObject) {
            this.f43518a = jSONObject;
        }

        private final JSONObject a() {
            return this.f43518a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.areEqual(this.f43518a, ((m) obj).f43518a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f43518a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "GenericParams(genericParams=" + this.f43518a + ")";
        }

        @NotNull
        public final m a(@Nullable JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jSONObject = mVar.f43518a;
            }
            return mVar.a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            JSONObject jSONObject = this.f43518a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$n */
    public static final class n implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43519a;

        public n(int i10) {
            this.f43519a = i10;
        }

        private final int a() {
            return this.f43519a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f43519a == ((n) obj).f43519a;
        }

        public int hashCode() {
            return this.f43519a;
        }

        @NotNull
        public String toString() {
            return "InstanceType(instanceType=" + this.f43519a + ")";
        }

        @NotNull
        public final n a(int i10) {
            return new n(i10);
        }

        public static /* synthetic */ n a(n nVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = nVar.f43519a;
            }
            return nVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f43519a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$o */
    public static final class o implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43520a;

        public o(int i10) {
            this.f43520a = i10;
        }

        private final int a() {
            return this.f43520a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f43520a == ((o) obj).f43520a;
        }

        public int hashCode() {
            return this.f43520a;
        }

        @NotNull
        public String toString() {
            return "MultipleAdObjects(value=" + this.f43520a + ")";
        }

        @NotNull
        public final o a(int i10) {
            return new o(i10);
        }

        public static /* synthetic */ o a(o oVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = oVar.f43520a;
            }
            return oVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f43520a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$p */
    public static final class p implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43521a;

        public p(int i10) {
            this.f43521a = i10;
        }

        private final int a() {
            return this.f43521a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f43521a == ((p) obj).f43521a;
        }

        public int hashCode() {
            return this.f43521a;
        }

        @NotNull
        public String toString() {
            return "OneFlow(value=" + this.f43521a + ")";
        }

        @NotNull
        public final p a(int i10) {
            return new p(i10);
        }

        public static /* synthetic */ p a(p pVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = pVar.f43521a;
            }
            return pVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f43521a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$q */
    public static final class q implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43522a;

        public q(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f43522a = value;
        }

        private final String a() {
            return this.f43522a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.areEqual(this.f43522a, ((q) obj).f43522a);
        }

        public int hashCode() {
            return this.f43522a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Placement(value=" + this.f43522a + ")";
        }

        @NotNull
        public final q a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new q(value);
        }

        public static /* synthetic */ q a(q qVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = qVar.f43522a;
            }
            return qVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.f43522a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$r */
    public static final class r implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43523a;

        public r(int i10) {
            this.f43523a = i10;
        }

        private final int a() {
            return this.f43523a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f43523a == ((r) obj).f43523a;
        }

        public int hashCode() {
            return this.f43523a;
        }

        @NotNull
        public String toString() {
            return "Programmatic(programmatic=" + this.f43523a + ")";
        }

        @NotNull
        public final r a(int i10) {
            return new r(i10);
        }

        public static /* synthetic */ r a(r rVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = rVar.f43523a;
            }
            return rVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f43523a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$s */
    public static final class s implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43524a;

        public s(@NotNull String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            this.f43524a = sourceName;
        }

        private final String a() {
            return this.f43524a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.areEqual(this.f43524a, ((s) obj).f43524a);
        }

        public int hashCode() {
            return this.f43524a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Provider(sourceName=" + this.f43524a + ")";
        }

        @NotNull
        public final s a(@NotNull String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            return new s(sourceName);
        }

        public static /* synthetic */ s a(s sVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sVar.f43524a;
            }
            return sVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f43524a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$t */
    public static final class t implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43525a;

        public t(int i10) {
            this.f43525a = i10;
        }

        private final int a() {
            return this.f43525a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f43525a == ((t) obj).f43525a;
        }

        public int hashCode() {
            return this.f43525a;
        }

        @NotNull
        public String toString() {
            return "RewardAmount(value=" + this.f43525a + ")";
        }

        @NotNull
        public final t a(int i10) {
            return new t(i10);
        }

        public static /* synthetic */ t a(t tVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = tVar.f43525a;
            }
            return tVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f43525a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$u */
    public static final class u implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43526a;

        public u(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f43526a = value;
        }

        private final String a() {
            return this.f43526a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && Intrinsics.areEqual(this.f43526a, ((u) obj).f43526a);
        }

        public int hashCode() {
            return this.f43526a.hashCode();
        }

        @NotNull
        public String toString() {
            return "RewardName(value=" + this.f43526a + ")";
        }

        @NotNull
        public final u a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new u(value);
        }

        public static /* synthetic */ u a(u uVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uVar.f43526a;
            }
            return uVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f43526a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$v */
    public static final class v implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43527a;

        public v(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.f43527a = version;
        }

        private final String a() {
            return this.f43527a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && Intrinsics.areEqual(this.f43527a, ((v) obj).f43527a);
        }

        public int hashCode() {
            return this.f43527a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SdkVersion(version=" + this.f43527a + ")";
        }

        @NotNull
        public final v a(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new v(version);
        }

        public static /* synthetic */ v a(v vVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = vVar.f43527a;
            }
            return vVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f43527a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$w */
    public static final class w implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43528a;

        public w(int i10) {
            this.f43528a = i10;
        }

        private final int a() {
            return this.f43528a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f43528a == ((w) obj).f43528a;
        }

        public int hashCode() {
            return this.f43528a;
        }

        @NotNull
        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f43528a + ")";
        }

        @NotNull
        public final w a(int i10) {
            return new w(i10);
        }

        public static /* synthetic */ w a(w wVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = wVar.f43528a;
            }
            return wVar.a(i10);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f43528a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$x */
    public static final class x implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43529a;

        public x(@NotNull String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            this.f43529a = subProviderId;
        }

        private final String a() {
            return this.f43529a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && Intrinsics.areEqual(this.f43529a, ((x) obj).f43529a);
        }

        public int hashCode() {
            return this.f43529a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SubProviderId(subProviderId=" + this.f43529a + ")";
        }

        @NotNull
        public final x a(@NotNull String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        public static /* synthetic */ x a(x xVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = xVar.f43529a;
            }
            return xVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.f43529a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.l1$y */
    public static final class y implements InterfaceC4423m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f43530a;

        public y(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f43530a = value;
        }

        private final String a() {
            return this.f43530a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && Intrinsics.areEqual(this.f43530a, ((y) obj).f43530a);
        }

        public int hashCode() {
            return this.f43530a.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransId(value=" + this.f43530a + ")";
        }

        @NotNull
        public final y a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new y(value);
        }

        public static /* synthetic */ y a(y yVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = yVar.f43530a;
            }
            return yVar.a(str);
        }

        @Override // com.ironsource.InterfaceC4423m1
        public void a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f43530a);
        }
    }

    private C4406l1() {
    }
}
