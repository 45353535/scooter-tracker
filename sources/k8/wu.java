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
public abstract class wu implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f92238a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f92239b = a.f92240f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92240f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wu invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(wu.f92238a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ wu b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final wu a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((nu) BuiltInParserKt.getBuiltInParserComponent().E8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends wu {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final su f92241c;

        public c(su suVar) {
            super(null);
            this.f92241c = suVar;
        }

        public final su c() {
            return this.f92241c;
        }
    }

    public static final class d extends wu {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vu f92242c;

        public d(vu vuVar) {
            super(null);
            this.f92242c = vuVar;
        }

        public final vu c() {
            return this.f92242c;
        }
    }

    public /* synthetic */ wu(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "particles";
        }
        if (this instanceof d) {
            return "solid";
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
        return ((nu) BuiltInParserKt.getBuiltInParserComponent().E8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private wu() {
    }
}
