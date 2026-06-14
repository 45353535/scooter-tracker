package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes4.dex */
public class b implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1279b f103145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1279b f103146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f103148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f103149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<a, C1279b> f103150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<a, List<C1279b>> f103151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f103152h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<a, C1279b> f103153i = b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<a, List<C1279b>> f103154j;

    static class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final f.a<a> f103156c = new f.a<a>() { // from class: sg.bigo.ads.controller.a.a.b.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a("", 0);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f103157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f103158b;

        protected a(String str, int i10) {
            this.f103157a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.f103158b = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f103157a = n.a(parcel, "");
            this.f103158b = n.a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f103157a, aVar.f103157a) && this.f103158b == aVar.f103158b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f103157a + "_" + this.f103158b).hashCode();
        }

        @NonNull
        public final String toString() {
            return super.toString();
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f103157a);
            parcel.writeInt(this.f103158b);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.controller.a.a.b$b, reason: collision with other inner class name */
    public static class C1279b extends j implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final f.a<C1279b> f103159e = new f.a<C1279b>() { // from class: sg.bigo.ads.controller.a.a.b.b.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new C1279b("", "", 0);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f103160d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f103161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f103162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f103163h;

        protected C1279b(String str, String str2, int i10) {
            super(str, str2, i10);
            this.f103160d = true;
            this.f103161f = 0;
            this.f103162g = 0L;
            this.f103163h = 0;
        }

        static /* synthetic */ int c(C1279b c1279b) {
            c1279b.f103163h = 0;
            return 0;
        }

        static /* synthetic */ int e(C1279b c1279b) {
            int i10 = c1279b.f103161f;
            c1279b.f103161f = i10 + 1;
            return i10;
        }

        static /* synthetic */ int f(C1279b c1279b) {
            c1279b.f103161f = 0;
            return 0;
        }

        static /* synthetic */ int g(C1279b c1279b) {
            int i10 = c1279b.f103163h;
            c1279b.f103163h = i10 + 1;
            return i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                return TextUtils.equals(this.f103300a, ((j) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f103300a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeString(this.f103300a);
            parcel.writeInt(this.f103302c);
            n.a(parcel, this.f103160d);
            parcel.writeString(this.f103301b);
            parcel.writeInt(this.f103161f);
            parcel.writeLong(this.f103162g);
            parcel.writeInt(this.f103163h);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f103300a = n.a(parcel, "");
            this.f103302c = n.a(parcel, 1);
            this.f103160d = n.b(parcel, true);
            this.f103301b = n.a(parcel, "");
            this.f103161f = n.a(parcel, 0);
            this.f103162g = n.a(parcel, 0L);
            this.f103163h = n.a(parcel, 0);
        }

        public final void a(String str) {
            this.f103301b = str;
        }
    }

    public b(@NonNull String str, @Nullable String str2) {
        this.f103148d = str;
        this.f103149e = str2;
    }

    @NonNull
    private Map<a, C1279b> b() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f103148d)) {
            map.put(new a("all", 0), new C1279b(this.f103148d, "", 0));
        }
        if (!TextUtils.isEmpty(this.f103149e)) {
            map.put(new a("ru", 0), new C1279b(this.f103149e, "", 0));
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0020 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.lang.String, java.lang.Integer> a(sg.bigo.ads.api.a.h r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r9.f103150f     // Catch: java.lang.Throwable -> Lc
            boolean r0 = sg.bigo.ads.common.utils.k.a(r0)     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            if (r0 == 0) goto Lf
        La:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r10 = move-exception
            goto L9f
        Lf:
            if (r10 != 0) goto L12
            goto La
        L12:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r9.f103150f     // Catch: java.lang.Throwable -> Lc
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Lc
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc
        L20:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc
            if (r4 == 0) goto La
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Lc
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lc
            sg.bigo.ads.controller.a.a.b$b r4 = (sg.bigo.ads.controller.a.a.b.C1279b) r4     // Catch: java.lang.Throwable -> Lc
            boolean r5 = r4.f103160d     // Catch: java.lang.Throwable -> Lc
            if (r5 != 0) goto L20
            int r5 = sg.bigo.ads.controller.a.a.b.C1279b.b(r4)     // Catch: java.lang.Throwable -> Lc
            int r6 = r10.y()     // Catch: java.lang.Throwable -> Lc
            int r5 = r5 % r6
            if (r5 != 0) goto L69
            sg.bigo.ads.controller.a.a.b.C1279b.c(r4)     // Catch: java.lang.Throwable -> Lc
            long r5 = sg.bigo.ads.controller.a.a.b.C1279b.d(r4)     // Catch: java.lang.Throwable -> Lc
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4f
            goto L84
        L4f:
            long r5 = sg.bigo.ads.controller.a.a.b.C1279b.d(r4)     // Catch: java.lang.Throwable -> Lc
            long r5 = r2 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> Lc
            float r5 = (float) r5     // Catch: java.lang.Throwable -> Lc
            r6 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)     // Catch: java.lang.Throwable -> Lc
            int r6 = r10.A()     // Catch: java.lang.Throwable -> Lc
            if (r5 <= r6) goto L83
            goto L84
        L69:
            long r5 = sg.bigo.ads.controller.a.a.b.C1279b.d(r4)     // Catch: java.lang.Throwable -> Lc
            long r5 = r2 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> Lc
            float r5 = (float) r5     // Catch: java.lang.Throwable -> Lc
            r6 = 1198153728(0x476a6000, float:60000.0)
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)     // Catch: java.lang.Throwable -> Lc
            int r6 = r10.z()     // Catch: java.lang.Throwable -> Lc
            if (r5 <= r6) goto L83
            goto L84
        L83:
            r4 = r1
        L84:
            if (r4 == 0) goto L20
            sg.bigo.ads.controller.a.a.b.C1279b.a(r4, r2)     // Catch: java.lang.Throwable -> Lc
            sg.bigo.ads.controller.a.a.b.C1279b.e(r4)     // Catch: java.lang.Throwable -> Lc
            android.util.Pair r10 = new android.util.Pair     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = r4.a()     // Catch: java.lang.Throwable -> Lc
            int r1 = sg.bigo.ads.controller.a.a.b.C1279b.b(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lc
            r10.<init>(r0, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lc
            return r10
        L9f:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lc
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.a.a.b.a(sg.bigo.ads.api.a.h):android.util.Pair");
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    @NonNull
    private static List<a> a(@NonNull a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.f103158b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.f103157a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    @Nullable
    private C1279b b(Map<a, List<C1279b>> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1279b c1279b = (C1279b) k.a(k.a(map.get(it.next()), new Comparable<C1279b>() { // from class: sg.bigo.ads.controller.a.a.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C1279b c1279b2) {
                        C1279b c1279b3 = c1279b2;
                        return (c1279b3 == null || !c1279b3.f103160d) ? 0 : 1;
                    }
                }));
                if (a(c1279b)) {
                    return c1279b;
                }
            }
        }
        return null;
    }

    @Nullable
    private static C1279b a(Map<a, C1279b> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C1279b c1279b = map.get(it.next());
                if (a(c1279b)) {
                    return c1279b;
                }
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.f103150f = n.a(parcel, a.f103156c, C1279b.f103159e);
                this.f103151g = n.b(parcel, a.f103156c, C1279b.f103159e);
                this.f103152h = n.a(parcel, 3);
                Map mapA = n.a(parcel, a.f103156c, C1279b.f103159e);
                this.f103154j = n.b(parcel, a.f103156c, C1279b.f103159e);
                this.f103145a = (C1279b) n.b(parcel, C1279b.f103159e);
                this.f103146b = (C1279b) n.b(parcel, C1279b.f103159e);
                this.f103147c = n.a(parcel, 0);
                this.f103153i = b();
                HashSet hashSet = new HashSet();
                for (C1279b c1279b : this.f103153i.values()) {
                    hashSet.add(c1279b.a());
                    if (!k.a(mapA)) {
                        for (C1279b c1279b2 : mapA.values()) {
                            if (TextUtils.equals(c1279b.a(), c1279b2.a())) {
                                c1279b.f103160d = c1279b2.f103160d;
                            }
                        }
                    }
                }
                C1279b c1279b3 = this.f103146b;
                if (c1279b3 != null && c1279b3.d() == 0 && !hashSet.contains(this.f103146b.a())) {
                    this.f103145a = this.f103146b;
                    this.f103146b = null;
                    this.f103147c = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[PHI: r0
  0x0034: PHI (r0v2 sg.bigo.ads.controller.a.a.b$b) = 
  (r0v1 sg.bigo.ads.controller.a.a.b$b)
  (r0v5 sg.bigo.ads.controller.a.a.b$b)
  (r0v7 sg.bigo.ads.controller.a.a.b$b)
  (r0v9 sg.bigo.ads.controller.a.a.b$b)
 binds: [B:3:0x000b, B:5:0x0017, B:7:0x0023, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private sg.bigo.ads.controller.a.a.b.C1279b a(sg.bigo.ads.controller.a.a.b.a r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.f103150f
            sg.bigo.ads.controller.a.a.b$b r0 = a(r0, r6)
            boolean r1 = a(r0)
            r2 = 0
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.f103151g
            sg.bigo.ads.controller.a.a.b$b r0 = r5.b(r0, r6)
            boolean r1 = a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.f103153i
            sg.bigo.ads.controller.a.a.b$b r0 = a(r0, r6)
            boolean r1 = a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.f103154j
            sg.bigo.ads.controller.a.a.b$b r0 = r5.b(r0, r6)
            boolean r1 = a(r0)
            if (r1 == 0) goto L32
            goto L34
        L32:
            r1 = r2
            goto L35
        L34:
            r1 = 1
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getBestHost "
            r3.<init>(r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = "success"
            goto L43
        L41:
            java.lang.String r1 = "fail"
        L43:
            r3.append(r1)
            if (r7 == 0) goto L4b
            java.lang.String r7 = " after reset"
            goto L4d
        L4b:
            java.lang.String r7 = ""
        L4d:
            r3.append(r7)
            java.lang.String r7 = ", countryKey="
            r3.append(r7)
            r3.append(r6)
            java.lang.String r6 = ", currentHost="
            r3.append(r6)
            sg.bigo.ads.controller.a.a.b$b r6 = r5.f103146b
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r7 = 3
            java.lang.String r1 = "AntiBanHost"
            sg.bigo.ads.common.t.a.a(r2, r7, r1, r6)
            boolean r6 = a(r0)
            if (r6 == 0) goto L73
            return r0
        L73:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.a.a.b.a(sg.bigo.ads.controller.a.a.b$a, boolean):sg.bigo.ads.controller.a.a.b$b");
    }

    @NonNull
    public final sg.bigo.ads.controller.a.e a(String str, int i10) {
        boolean z10;
        sg.bigo.ads.controller.a.e eVar;
        synchronized (this) {
            try {
                C1279b c1279b = this.f103146b;
                if (c1279b == null || this.f103147c >= this.f103152h) {
                    a aVar = new a(str, i10);
                    C1279b c1279bA = a(aVar, false);
                    if (a(c1279bA)) {
                        z10 = false;
                    } else {
                        a();
                        c1279bA = a(aVar, true);
                        z10 = true;
                    }
                    if (a(c1279bA)) {
                        c1279bA.f103160d = false;
                        this.f103145a = this.f103146b;
                        this.f103146b = new C1279b(c1279bA.a(), c1279bA.b(), c1279bA.d());
                        this.f103147c = 0;
                    }
                    if (this.f103146b == null) {
                        this.f103146b = new C1279b(this.f103148d, "", 0);
                    }
                    eVar = new sg.bigo.ads.controller.a.e(this.f103146b, z10, true);
                } else {
                    eVar = new sg.bigo.ads.controller.a.e(c1279b, false, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final void a() {
        Map<a, C1279b> map = this.f103150f;
        if (map != null) {
            Iterator<Map.Entry<a, C1279b>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                C1279b value = it.next().getValue();
                if (value != null) {
                    value.f103160d = true;
                }
            }
        }
        Map<a, List<C1279b>> map2 = this.f103151g;
        if (map2 != null) {
            Iterator<Map.Entry<a, List<C1279b>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                List<C1279b> value2 = it2.next().getValue();
                if (!k.a((Collection) value2)) {
                    Iterator<C1279b> it3 = value2.iterator();
                    while (it3.hasNext()) {
                        it3.next().f103160d = true;
                    }
                }
            }
        }
        Map<a, List<C1279b>> map3 = this.f103154j;
        if (map3 != null) {
            Iterator<Map.Entry<a, List<C1279b>>> it4 = map3.entrySet().iterator();
            while (it4.hasNext()) {
                List<C1279b> value3 = it4.next().getValue();
                if (!k.a((Collection) value3)) {
                    Iterator<C1279b> it5 = value3.iterator();
                    while (it5.hasNext()) {
                        it5.next().f103160d = true;
                    }
                }
            }
        }
        Map<a, C1279b> map4 = this.f103153i;
        if (map4 != null) {
            Iterator<Map.Entry<a, C1279b>> it6 = map4.entrySet().iterator();
            while (it6.hasNext()) {
                C1279b value4 = it6.next().getValue();
                if (value4 != null) {
                    value4.f103160d = true;
                }
            }
        }
        this.f103145a = this.f103146b;
        this.f103146b = null;
        this.f103147c = 0;
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f103150f);
            n.b(parcel, this.f103151g);
            parcel.writeInt(this.f103152h);
            n.a(parcel, this.f103153i);
            n.b(parcel, this.f103154j);
            n.a(parcel, this.f103145a);
            n.a(parcel, this.f103146b);
            parcel.writeInt(this.f103147c);
        }
    }

    private void a(Map<a, C1279b> map, Map<a, List<C1279b>> map2, String str, int i10) {
        C1279b value;
        C1279b c1279b;
        synchronized (this) {
            try {
                if (!k.a(this.f103150f) && !k.a(map)) {
                    for (Map.Entry<a, C1279b> entry : this.f103150f.entrySet()) {
                        a key = entry.getKey();
                        if (key != null && (value = entry.getValue()) != null && (c1279b = map.get(key)) != null && value.equals(c1279b)) {
                            value.a(c1279b.b());
                        }
                    }
                }
                if (!k.a(this.f103151g) && !k.a(map2)) {
                    for (Map.Entry<a, List<C1279b>> entry2 : this.f103151g.entrySet()) {
                        a key2 = entry2.getKey();
                        if (key2 != null) {
                            List<C1279b> value2 = entry2.getValue();
                            if (!k.a((Collection) value2)) {
                                List<C1279b> list = map2.get(key2);
                                if (!k.a((Collection) list)) {
                                    for (C1279b c1279b2 : value2) {
                                        if (c1279b2 != null) {
                                            Iterator<C1279b> it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    C1279b next = it.next();
                                                    if (c1279b2.equals(next)) {
                                                        c1279b2.a(next.b());
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C1279b c1279b3 = this.f103146b;
                if (c1279b3 != null) {
                    if (c1279b3.d() == 1) {
                        C1279b c1279b4 = this.f103150f.get(new a(str, i10));
                        if (this.f103146b.equals(c1279b4)) {
                            this.f103146b.a(c1279b4.b());
                        }
                    } else if (this.f103146b.d() == 2) {
                        List<C1279b> list2 = this.f103151g.get(new a(str, i10));
                        if (!k.a((Collection) list2)) {
                            Iterator<C1279b> it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C1279b next2 = it2.next();
                                if (this.f103146b.equals(next2)) {
                                    this.f103146b.a(next2.b());
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        synchronized (this) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("country_hosts");
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("host", "");
                            if (sg.bigo.ads.controller.a.d.a(strOptString)) {
                                map.put(new a(jSONObjectOptJSONObject.optString("country", "all"), jSONObjectOptJSONObject.optInt("app_flag", 0)), new C1279b(strOptString, jSONObjectOptJSONObject.optString("domain_front", ""), 1));
                            }
                        }
                    }
                }
                HashMap map2 = new HashMap();
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("backup_hosts");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i12);
                        if (jSONObjectOptJSONObject2 != null) {
                            a aVar = new a(jSONObjectOptJSONObject2.optString("country", "all"), jSONObjectOptJSONObject2.optInt("app_flag", 0));
                            List<C1279b> arrayList = map2.get(aVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                map2.put(aVar, arrayList);
                            }
                            String strOptString2 = jSONObjectOptJSONObject2.optString("domain_front", "");
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("hosts");
                            if (jSONArrayOptJSONArray3 != null) {
                                for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                                    String strOptString3 = jSONArrayOptJSONArray3.optString(i13, "");
                                    if (sg.bigo.ads.controller.a.d.a(strOptString3)) {
                                        C1279b c1279b = new C1279b(strOptString3, strOptString2, 2);
                                        if (!arrayList.contains(c1279b)) {
                                            arrayList.add(c1279b);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z10) {
                    a(map, map2, str, i10);
                } else {
                    int iOptInt = jSONObject.optInt("threshold", 3);
                    this.f103150f = map;
                    this.f103151g = map2;
                    this.f103152h = iOptInt;
                    this.f103154j = new HashMap();
                    this.f103153i = b();
                    this.f103145a = this.f103146b;
                    this.f103146b = null;
                    this.f103147c = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            try {
                if (sg.bigo.ads.controller.a.d.a(str2)) {
                    a aVar = new a(str, 0);
                    if (this.f103154j == null) {
                        this.f103154j = new HashMap();
                    }
                    List<C1279b> arrayList = this.f103154j.get(aVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.f103154j.put(aVar, arrayList);
                    }
                    C1279b c1279b = new C1279b(str2, "", 3);
                    if (!arrayList.contains(c1279b)) {
                        arrayList.add(c1279b);
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0185, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r6, java.lang.String r7, int r8, sg.bigo.ads.api.a.h r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.a.a.b.a(java.lang.String, java.lang.String, int, sg.bigo.ads.api.a.h, boolean):boolean");
    }

    private static boolean a(C1279b c1279b) {
        return c1279b != null && c1279b.f103160d;
    }
}
