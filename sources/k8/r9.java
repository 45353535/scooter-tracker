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
public abstract class r9 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f90644a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f90645b = a.f90646f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90646f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r9 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(r9.f90644a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ r9 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final r9 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((p9) BuiltInParserKt.getBuiltInParserComponent().w2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends r9 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final pc f90647c;

        public c(pc pcVar) {
            super(null);
            this.f90647c = pcVar;
        }

        public final pc c() {
            return this.f90647c;
        }
    }

    public static final class d extends r9 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xf f90648c;

        public d(xf xfVar) {
            super(null);
            this.f90648c = xfVar;
        }

        public final xf c() {
            return this.f90648c;
        }
    }

    public /* synthetic */ r9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "infinity";
        }
        if (this instanceof c) {
            return "fixed";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((p9) BuiltInParserKt.getBuiltInParserComponent().w2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private r9() {
    }
}
