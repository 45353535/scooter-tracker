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
public abstract class m6 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f88958a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f88959b = b.f88961f;

    public static final class a extends m6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t8 f88960c;

        public a(t8 t8Var) {
            super(null);
            this.f88960c = t8Var;
        }

        public final t8 c() {
            return this.f88960c;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f88961f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return c.b(m6.f88958a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ m6 b(c cVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return cVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final m6 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((k6) BuiltInParserKt.getBuiltInParserComponent().u1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends m6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fj f88962c;

        public d(fj fjVar) {
            super(null);
            this.f88962c = fjVar;
        }

        public final fj c() {
            return this.f88962c;
        }
    }

    public /* synthetic */ m6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return "color_animator";
        }
        if (this instanceof d) {
            return "number_animator";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((k6) BuiltInParserKt.getBuiltInParserComponent().u1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private m6() {
    }
}
