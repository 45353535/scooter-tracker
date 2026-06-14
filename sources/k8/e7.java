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
public abstract class e7 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f87172a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f87173b = a.f87174f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87174f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(e7.f87172a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ e7 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final e7 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((c7) BuiltInParserKt.getBuiltInParserComponent().G1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends e7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xe f87175c;

        public c(xe xeVar) {
            super(null);
            this.f87175c = xeVar;
        }

        public final xe c() {
            return this.f87175c;
        }
    }

    public static final class d extends e7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final mi f87176c;

        public d(mi miVar) {
            super(null);
            this.f87176c = miVar;
        }

        public final mi c() {
            return this.f87176c;
        }
    }

    public static final class e extends e7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final aj f87177c;

        public e(aj ajVar) {
            super(null);
            this.f87177c = ajVar;
        }

        public final aj c() {
            return this.f87177c;
        }
    }

    public static final class f extends e7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fn f87178c;

        public f(fn fnVar) {
            super(null);
            this.f87178c = fnVar;
        }

        public final fn c() {
            return this.f87178c;
        }
    }

    public static final class g extends e7 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kq f87179c;

        public g(kq kqVar) {
            super(null);
            this.f87179c = kqVar;
        }

        public final kq c() {
            return this.f87179c;
        }
    }

    public /* synthetic */ e7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "gradient";
        }
        if (this instanceof f) {
            return "radial_gradient";
        }
        if (this instanceof c) {
            return "image";
        }
        if (this instanceof g) {
            return "solid";
        }
        if (this instanceof e) {
            return "nine_patch_image";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
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
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((c7) BuiltInParserKt.getBuiltInParserComponent().G1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private e7() {
    }
}
