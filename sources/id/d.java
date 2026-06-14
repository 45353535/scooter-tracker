package id;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f74407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f74408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f74409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f74410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f74411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f74412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f74413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f74414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f74415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f74416j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f74417a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private k f74425i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f74418b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f74419c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f74420d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Map f74421e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f74422f = new HashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f74423g = new EnumMap(f.class);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f74424h = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f74426j = ViewCompat.MEASURED_STATE_MASK;

        public a(int i10) {
            this.f74417a = i10;
        }

        public final a a(id.a adElementParams) {
            Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
            this.f74418b.add(adElementParams);
            return this;
        }

        public final a b(id.a adElementParams) {
            Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
            this.f74419c.add(adElementParams);
            return this;
        }

        public final a c(b0 eventParams) {
            Intrinsics.checkNotNullParameter(eventParams, "eventParams");
            List listA = eventParams.a();
            if (listA.isEmpty()) {
                return this;
            }
            String strC = eventParams.c();
            Map enumMap = (Map) this.f74421e.get(strC);
            if (enumMap == null) {
                enumMap = new EnumMap(e0.class);
                this.f74421e.put(strC, enumMap);
            }
            e0 e0VarB = eventParams.b();
            List arrayList = (List) enumMap.get(e0VarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                enumMap.put(e0VarB, arrayList);
            }
            arrayList.addAll(listA);
            return this;
        }

        public final a d(r0 methodParams) {
            Intrinsics.checkNotNullParameter(methodParams, "methodParams");
            this.f74420d.add(methodParams);
            return this;
        }

        public final d e() {
            return new d(this.f74417a, this.f74425i, Integer.valueOf(this.f74426j), this.f74418b, this.f74419c, this.f74420d, this.f74421e, this.f74422f, this.f74423g, this.f74424h);
        }

        public final a f(Map map) {
            pd.g0.G(this.f74423g, map);
            return this;
        }

        public final a g(k kVar) {
            this.f74425i = kVar;
            return this;
        }

        public final a h(int i10) {
            this.f74426j = i10;
            return this;
        }

        public final a i(Map map) {
            pd.g0.G(this.f74422f, map);
            return this;
        }

        public final a j(List list) {
            pd.g0.F(this.f74424h, list);
            return this;
        }
    }

    public d(int i10, k kVar, Integer num, List adsList, List controlsList, List methodParamsList, Map sourceEventTypeMap, Map customParams, Map animationParams, List stateGroups) {
        Intrinsics.checkNotNullParameter(adsList, "adsList");
        Intrinsics.checkNotNullParameter(controlsList, "controlsList");
        Intrinsics.checkNotNullParameter(methodParamsList, "methodParamsList");
        Intrinsics.checkNotNullParameter(sourceEventTypeMap, "sourceEventTypeMap");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        Intrinsics.checkNotNullParameter(animationParams, "animationParams");
        Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
        this.f74407a = i10;
        this.f74408b = kVar;
        this.f74409c = num;
        this.f74410d = adsList;
        this.f74411e = controlsList;
        this.f74412f = methodParamsList;
        this.f74413g = sourceEventTypeMap;
        this.f74414h = customParams;
        this.f74415i = animationParams;
        this.f74416j = stateGroups;
    }

    public final List a() {
        return this.f74410d;
    }

    public final Map b() {
        return this.f74415i;
    }

    public final k c() {
        return this.f74408b;
    }

    public final Integer d() {
        return this.f74409c;
    }

    public final List e() {
        return this.f74411e;
    }

    public final Map f(String sourceName) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        return (Map) this.f74413g.get(sourceName);
    }

    public final List g() {
        return this.f74412f;
    }

    public final int h() {
        return this.f74407a;
    }

    public final List i() {
        return this.f74416j;
    }
}
