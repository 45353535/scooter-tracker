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
public abstract class kf implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f88658a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f88659b = a.f88660f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88660f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kf invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(kf.f88658a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ kf b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final kf a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((Cif) BuiltInParserKt.getBuiltInParserComponent().b4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends kf {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final na f88661c;

        public c(na naVar) {
            super(null);
            this.f88661c = naVar;
        }

        public final na c() {
            return this.f88661c;
        }
    }

    public static final class d extends kf {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zq f88662c;

        public d(zq zqVar) {
            super(null);
            this.f88662c = zqVar;
        }

        public final zq c() {
            return this.f88662c;
        }
    }

    public /* synthetic */ kf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "default";
        }
        if (this instanceof d) {
            return "stretch";
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
        return ((Cif) BuiltInParserKt.getBuiltInParserComponent().b4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private kf() {
    }
}
