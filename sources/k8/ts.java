package k8;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ts implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91500a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f91501b = a.f91502f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91502f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ts invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(ts.f91500a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ts b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final ts a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((xh) BuiltInParserKt.getBuiltInParserComponent().N4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d9 f91503c;

        public c(d9 d9Var) {
            super(null);
            this.f91503c = d9Var;
        }

        public final d9 c() {
            return this.f91503c;
        }
    }

    public static final class d extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final da f91504c;

        public d(da daVar) {
            super(null);
            this.f91504c = daVar;
        }

        public final da c() {
            return this.f91504c;
        }
    }

    public static final class e extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final de f91505c;

        public e(de deVar) {
            super(null);
            this.f91505c = deVar;
        }

        public final de c() {
            return this.f91505c;
        }
    }

    public static final class f extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ke f91506c;

        public f(ke keVar) {
            super(null);
            this.f91506c = keVar;
        }

        public final ke c() {
            return this.f91506c;
        }
    }

    public static final class g extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final se f91507c;

        public g(se seVar) {
            super(null);
            this.f91507c = seVar;
        }

        public final se c() {
            return this.f91507c;
        }
    }

    public static final class h extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ef f91508c;

        public h(ef efVar) {
            super(null);
            this.f91508c = efVar;
        }

        public final ef c() {
            return this.f91508c;
        }
    }

    public static final class i extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sf f91509c;

        public i(sf sfVar) {
            super(null);
            this.f91509c = sfVar;
        }

        public final sf c() {
            return this.f91509c;
        }
    }

    public static final class j extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final hh f91510c;

        public j(hh hhVar) {
            super(null);
            this.f91510c = hhVar;
        }

        public final hh c() {
            return this.f91510c;
        }
    }

    public static final class k extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vk f91511c;

        public k(vk vkVar) {
            super(null);
            this.f91511c = vkVar;
        }

        public final vk c() {
            return this.f91511c;
        }
    }

    public static final class l extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fo f91512c;

        public l(fo foVar) {
            super(null);
            this.f91512c = foVar;
        }

        public final fo c() {
            return this.f91512c;
        }
    }

    public static final class m extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final no f91513c;

        public m(no noVar) {
            super(null);
            this.f91513c = noVar;
        }

        public final no c() {
            return this.f91513c;
        }
    }

    public static final class n extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final cq f91514c;

        public n(cq cqVar) {
            super(null);
            this.f91514c = cqVar;
        }

        public final cq c() {
            return this.f91514c;
        }
    }

    public static final class o extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vq f91515c;

        public o(vq vqVar) {
            super(null);
            this.f91515c = vqVar;
        }

        public final vq c() {
            return this.f91515c;
        }
    }

    public static final class p extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zr f91516c;

        public p(zr zrVar) {
            super(null);
            this.f91516c = zrVar;
        }

        public final zr c() {
            return this.f91516c;
        }
    }

    public static final class q extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ss f91517c;

        public q(ss ssVar) {
            super(null);
            this.f91517c = ssVar;
        }

        public final ss c() {
            return this.f91517c;
        }
    }

    public static final class r extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xu f91518c;

        public r(xu xuVar) {
            super(null);
            this.f91518c = xuVar;
        }

        public final xu c() {
            return this.f91518c;
        }
    }

    public static final class s extends ts {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fx f91519c;

        public s(fx fxVar) {
            super(null);
            this.f91519c = fxVar;
        }

        public final fx c() {
            return this.f91519c;
        }
    }

    public /* synthetic */ ts(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof h) {
            return "image";
        }
        if (this instanceof f) {
            return "gif";
        }
        if (this instanceof r) {
            return "text";
        }
        if (this instanceof m) {
            return "separator";
        }
        if (this instanceof c) {
            return "container";
        }
        if (this instanceof g) {
            return "grid";
        }
        if (this instanceof e) {
            return "gallery";
        }
        if (this instanceof k) {
            return "pager";
        }
        if (this instanceof q) {
            return "tabs";
        }
        if (this instanceof o) {
            return "state";
        }
        if (this instanceof d) {
            return "custom";
        }
        if (this instanceof i) {
            return "indicator";
        }
        if (this instanceof n) {
            return "slider";
        }
        if (this instanceof p) {
            return "switch";
        }
        if (this instanceof j) {
            return "input";
        }
        if (this instanceof l) {
            return "select";
        }
        if (this instanceof s) {
            return "video";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((xh) BuiltInParserKt.getBuiltInParserComponent().N4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private ts() {
    }
}
