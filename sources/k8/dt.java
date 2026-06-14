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
public abstract class dt implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f87073a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f87074b = a.f87075f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87075f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dt invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(dt.f87073a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ dt b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final dt a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((bt) BuiltInParserKt.getBuiltInParserComponent().h8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends dt {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final mi f87076c;

        public c(mi miVar) {
            super(null);
            this.f87076c = miVar;
        }

        public final mi c() {
            return this.f87076c;
        }
    }

    public static final class d extends dt {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final fn f87077c;

        public d(fn fnVar) {
            super(null);
            this.f87077c = fnVar;
        }

        public final fn c() {
            return this.f87077c;
        }
    }

    public /* synthetic */ dt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "gradient";
        }
        if (this instanceof d) {
            return "radial_gradient";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((bt) BuiltInParserKt.getBuiltInParserComponent().h8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private dt() {
    }
}
