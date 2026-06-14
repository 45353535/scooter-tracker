package w2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w2.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f106936m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f106937n = MapsKt.hashMapOf(TuplesKt.to("embedding.weight", "embed.weight"), TuplesKt.to("dense1.weight", "fc1.weight"), TuplesKt.to("dense2.weight", "fc2.weight"), TuplesKt.to("dense3.weight", "fc3.weight"), TuplesKt.to("dense1.bias", "fc1.bias"), TuplesKt.to("dense2.bias", "fc2.bias"), TuplesKt.to("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2.a f106938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w2.a f106939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w2.a f106940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w2.a f106941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w2.a f106942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w2.a f106943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w2.a f106944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w2.a f106945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w2.a f106946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w2.a f106947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w2.a f106948k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f106949l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map b(File file) {
            Map mapC = j.c(file);
            if (mapC == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapA = b.a();
            for (Map.Entry entry : mapC.entrySet()) {
                String str = (String) entry.getKey();
                if (mapA.containsKey(entry.getKey()) && (str = (String) mapA.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(str, entry.getValue());
            }
            return map;
        }

        public final b a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            Map mapB = b(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapB == null) {
                return null;
            }
            try {
                return new b(mapB, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ b(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (e3.a.d(b.class)) {
            return null;
        }
        try {
            return f106937n;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return null;
        }
    }

    public final w2.a b(w2.a dense, String[] texts, String task) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            w2.a aVarC = i.c(i.e(texts, 128, this.f106938a), this.f106939b);
            i.a(aVarC, this.f106942e);
            i.i(aVarC);
            w2.a aVarC2 = i.c(aVarC, this.f106940c);
            i.a(aVarC2, this.f106943f);
            i.i(aVarC2);
            w2.a aVarG = i.g(aVarC2, 2);
            w2.a aVarC3 = i.c(aVarG, this.f106941d);
            i.a(aVarC3, this.f106944g);
            i.i(aVarC3);
            w2.a aVarG2 = i.g(aVarC, aVarC.b(1));
            w2.a aVarG3 = i.g(aVarG, aVarG.b(1));
            w2.a aVarG4 = i.g(aVarC3, aVarC3.b(1));
            i.f(aVarG2, 1);
            i.f(aVarG3, 1);
            i.f(aVarG4, 1);
            w2.a aVarD = i.d(i.b(new w2.a[]{aVarG2, aVarG3, aVarG4, dense}), this.f106945h, this.f106947j);
            i.i(aVarD);
            w2.a aVarD2 = i.d(aVarD, this.f106946i, this.f106948k);
            i.i(aVarD2);
            w2.a aVar = (w2.a) this.f106949l.get(task + ".weight");
            w2.a aVar2 = (w2.a) this.f106949l.get(task + ".bias");
            if (aVar != null && aVar2 != null) {
                w2.a aVarD3 = i.d(aVarD2, aVar, aVar2);
                i.j(aVarD3);
                return aVarD3;
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private b(Map map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106938a = (w2.a) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106939b = i.l((w2.a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106940c = i.l((w2.a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106941d = i.l((w2.a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106942e = (w2.a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106943f = (w2.a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106944g = (w2.a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106945h = i.k((w2.a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106946i = i.k((w2.a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106947j = (w2.a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f106948k = (w2.a) obj11;
        this.f106949l = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{f.a.MTML_INTEGRITY_DETECT.g(), f.a.MTML_APP_EVENT_PREDICTION.g()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            w2.a aVar = (w2.a) map.get(str2);
            w2.a aVar2 = (w2.a) map.get(str3);
            if (aVar != null) {
                this.f106949l.put(str2, i.k(aVar));
            }
            if (aVar2 != null) {
                this.f106949l.put(str3, aVar2);
            }
        }
    }
}
