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
public abstract class rr implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f90839a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f90840b = a.f90841f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90841f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rr invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(rr.f90839a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ rr b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final rr a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((kr) BuiltInParserKt.getBuiltInParserComponent().J7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends rr {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ir f90842c;

        public c(ir irVar) {
            super(null);
            this.f90842c = irVar;
        }

        public final ir c() {
            return this.f90842c;
        }
    }

    public static final class d extends rr {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qr f90843c;

        public d(qr qrVar) {
            super(null);
            this.f90843c = qrVar;
        }

        public final qr c() {
            return this.f90843c;
        }
    }

    public /* synthetic */ rr(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "solid";
        }
        if (this instanceof c) {
            return "dashed";
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
        return ((kr) BuiltInParserKt.getBuiltInParserComponent().J7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private rr() {
    }
}
