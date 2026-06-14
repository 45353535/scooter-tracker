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
public abstract class lc implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f88776a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f88777b = b.f88779f;

    public static final class a extends lc {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k7 f88778c;

        public a(k7 k7Var) {
            super(null);
            this.f88778c = k7Var;
        }

        public final k7 c() {
            return this.f88778c;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f88779f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return c.b(lc.f88776a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ lc b(c cVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return cVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final lc a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((ec) BuiltInParserKt.getBuiltInParserComponent().i3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends lc {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kc f88780c;

        public d(kc kcVar) {
            super(null);
            this.f88780c = kcVar;
        }

        public final kc c() {
            return this.f88780c;
        }
    }

    public /* synthetic */ lc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof a) {
            return "blur";
        }
        if (this instanceof d) {
            return "rtl_mirror";
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
        return ((ec) BuiltInParserKt.getBuiltInParserComponent().i3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private lc() {
    }
}
