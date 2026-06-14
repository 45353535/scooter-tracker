package w2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.internal.e;
import com.facebook.internal.z;
import com.facebook.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import lf.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v2.m;
import w2.f;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f106950a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f106951b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f106952c = CollectionsKt.listOf((Object[]) new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f106953d = CollectionsKt.listOf((Object[]) new String[]{"none", "address", "health"});

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: w2.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1322a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String g() {
            int i10 = C1322a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "integrity_detect";
            }
            if (i10 == 2) {
                return "app_event_pred";
            }
            throw new m();
        }

        public final String h() {
            int i10 = C1322a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i10 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new m();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f106957i = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f106958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f106959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f106960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f106961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float[] f106962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private File f106963f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private w2.b f106964g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Runnable f106965h;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final void d(String str, int i10) {
                File[] fileArrListFiles;
                File fileA = j.a();
                if (fileA == null || (fileArrListFiles = fileA.listFiles()) == null || fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i10;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    if (StringsKt.a0(name, str, false, 2, null) && !StringsKt.a0(name, str2, false, 2, null)) {
                        file.delete();
                    }
                }
            }

            private final void e(String str, String str2, m.a aVar) {
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new v2.m(str, file, aVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(List slaves, File file) {
                Intrinsics.checkNotNullParameter(slaves, "$slaves");
                Intrinsics.checkNotNullParameter(file, "file");
                final w2.b bVarA = w2.b.f106936m.a(file);
                if (bVarA != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f106957i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new m.a() { // from class: w2.h
                            @Override // v2.m.a
                            public final void a(File file2) {
                                f.b.a.h(bVar, bVarA, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(b slave, w2.b bVar, File file) {
                Intrinsics.checkNotNullParameter(slave, "$slave");
                Intrinsics.checkNotNullParameter(file, "file");
                slave.i(bVar);
                slave.k(file);
                Runnable runnable = slave.f106965h;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public final b c(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString("use_case");
                    String assetUri = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i10 = jSONObject.getInt("version_id");
                    float[] fArrD = f.d(f.f106950a, jSONObject.getJSONArray("thresholds"));
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new b(useCase, assetUri, strOptString, i10, fArrD);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void f(b master, final List slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                d(master.g(), master.h());
                e(master.b(), master.g() + '_' + master.h(), new m.a() { // from class: w2.g
                    @Override // v2.m.a
                    public final void a(File file) {
                        f.b.a.g(slaves, file);
                    }
                });
            }

            private a() {
            }
        }

        public b(String useCase, String assetUri, String str, int i10, float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.f106958a = useCase;
            this.f106959b = assetUri;
            this.f106960c = str;
            this.f106961d = i10;
            this.f106962e = fArr;
        }

        public final String b() {
            return this.f106959b;
        }

        public final w2.b c() {
            return this.f106964g;
        }

        public final File d() {
            return this.f106963f;
        }

        public final String e() {
            return this.f106960c;
        }

        public final float[] f() {
            return this.f106962e;
        }

        public final String g() {
            return this.f106958a;
        }

        public final int h() {
            return this.f106961d;
        }

        public final void i(w2.b bVar) {
            this.f106964g = bVar;
        }

        public final b j(Runnable runnable) {
            this.f106965h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f106963f = file;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private f() {
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    private final void e(JSONObject jSONObject) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    b bVarC = b.f106957i.c(jSONObject.getJSONObject(itKeys.next()));
                    if (bVarC != null) {
                        f106951b.put(bVarC.g(), bVarC);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void f() {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            z.l0(new Runnable() { // from class: w2.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.g();
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = s.m().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
            long j10 = sharedPreferences.getLong("model_request_timestamp", 0L);
            if (!com.facebook.internal.e.g(e.b.ModelRequest) || jSONObject.length() == 0 || !f106950a.n(j10)) {
                jSONObject = f106950a.k();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            f fVar = f106950a;
            fVar.e(jSONObject);
            fVar.h();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    private final void h() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String strB = null;
            int iMax = 0;
            for (Map.Entry entry : f106951b.entrySet()) {
                String str = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                if (Intrinsics.areEqual(str, a.MTML_APP_EVENT_PREDICTION.h())) {
                    String strB2 = bVar.b();
                    int iMax2 = Math.max(iMax, bVar.h());
                    if (com.facebook.internal.e.g(e.b.SuggestedEvents) && m()) {
                        arrayList.add(bVar.j(new Runnable() { // from class: w2.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.i();
                            }
                        }));
                    }
                    strB = strB2;
                    iMax = iMax2;
                }
                if (Intrinsics.areEqual(str, a.MTML_INTEGRITY_DETECT.h())) {
                    strB = bVar.b();
                    iMax = Math.max(iMax, bVar.h());
                    if (com.facebook.internal.e.g(e.b.IntelligentIntegrity)) {
                        arrayList.add(bVar.j(new Runnable() { // from class: w2.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.j();
                            }
                        }));
                    }
                }
            }
            if (strB == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f106957i.f(new b("MTML", strB, null, iMax, null), arrayList);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i() {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            z2.e.b();
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        if (e3.a.d(f.class)) {
            return;
        }
        try {
            u2.c.a();
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
        }
    }

    private final JSONObject k() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(StringUtils.COMMA, new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest graphRequestX = GraphRequest.f19547n.x(null, "app/model_asset", null);
            graphRequestX.G(bundle);
            JSONObject jSONObjectC = graphRequestX.k().c();
            if (jSONObjectC == null) {
                return null;
            }
            return p(jSONObjectC);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final File l(a task) {
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            b bVar = (b) f106951b.get(task.h());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    private final boolean m() {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            Locale localeL = z.L();
            if (localeL == null) {
                return true;
            }
            String language = localeL.getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "locale.language");
            return StringsKt.g0(language, "en", false, 2, null);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean n(long j10) {
        if (e3.a.d(this) || j10 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j10 < 259200000;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final float[] o(JSONArray jSONArray) {
        if (e3.a.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    fArr[i10] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final JSONObject p(JSONObject jSONObject) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final String[] q(a task, float[][] denses, String[] texts) {
        w2.b bVarC;
        if (e3.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            b bVar = (b) f106951b.get(task.h());
            if (bVar != null && (bVarC = bVar.c()) != null) {
                float[] fArrF = bVar.f();
                int length = texts.length;
                int length2 = denses[0].length;
                w2.a aVar = new w2.a(new int[]{length, length2});
                for (int i10 = 0; i10 < length; i10++) {
                    System.arraycopy(denses[i10], 0, aVar.a(), i10 * length2, length2);
                }
                w2.a aVarB = bVarC.b(aVar, texts, task.g());
                if (aVarB != null && fArrF != null && aVarB.a().length != 0 && fArrF.length != 0) {
                    int i11 = c.$EnumSwitchMapping$0[task.ordinal()];
                    if (i11 == 1) {
                        return f106950a.s(aVarB, fArrF);
                    }
                    if (i11 == 2) {
                        return f106950a.r(aVarB, fArrF);
                    }
                    throw new lf.m();
                }
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, f.class);
            return null;
        }
    }

    private final String[] r(w2.a aVar, float[] fArr) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            IntRange intRangeV = kotlin.ranges.g.v(0, iB);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
            Iterator it = intRangeV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Object obj = "none";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (fArrA[(iNextInt * iB2) + i11] >= fArr[i10]) {
                        obj = f106953d.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final String[] s(w2.a aVar, float[] fArr) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] fArrA = aVar.a();
            if (iB2 != fArr.length) {
                return null;
            }
            IntRange intRangeV = kotlin.ranges.g.v(0, iB);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
            Iterator it = intRangeV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Object obj = "other";
                int length = fArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    if (fArrA[(iNextInt * iB2) + i11] >= fArr[i10]) {
                        obj = f106952c.get(i11);
                    }
                    i10++;
                    i11 = i12;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }
}
