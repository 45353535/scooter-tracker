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
public abstract class wt implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f92233a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f92234b = b.f92236f;

    public static final class a extends wt {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j8 f92235c;

        public a(j8 j8Var) {
            super(null);
            this.f92235c = j8Var;
        }

        public final j8 c() {
            return this.f92235c;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f92236f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wt invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return c.b(wt.f92233a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ wt b(c cVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return cVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final wt a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((ut) BuiltInParserKt.getBuiltInParserComponent().t8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends wt {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kq f92237c;

        public d(kq kqVar) {
            super(null);
            this.f92237c = kqVar;
        }

        public final kq c() {
            return this.f92237c;
        }
    }

    public /* synthetic */ wt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "solid";
        }
        if (this instanceof a) {
            return "cloud";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ut) BuiltInParserKt.getBuiltInParserComponent().t8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private wt() {
    }
}
