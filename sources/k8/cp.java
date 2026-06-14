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
public abstract class cp implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f86774a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f86775b = b.f86777f;

    public static final class a extends cp {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f8 f86776c;

        public a(f8 f8Var) {
            super(null);
            this.f86776c = f8Var;
        }

        public final f8 c() {
            return this.f86776c;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f86777f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cp invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return c.b(cp.f86774a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ cp b(c cVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return cVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final cp a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((ap) BuiltInParserKt.getBuiltInParserComponent().W6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends cp {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final in f86778c;

        public d(in inVar) {
            super(null);
            this.f86778c = inVar;
        }

        public final in c() {
            return this.f86778c;
        }
    }

    public /* synthetic */ cp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "rounded_rectangle";
        }
        if (this instanceof a) {
            return "circle";
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
        return ((ap) BuiltInParserKt.getBuiltInParserComponent().W6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private cp() {
    }
}
