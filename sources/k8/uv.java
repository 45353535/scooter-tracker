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
public abstract class uv implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91862a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f91863b = a.f91864f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91864f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uv invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(uv.f91862a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ uv b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final uv a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((iv) BuiltInParserKt.getBuiltInParserComponent().T8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends uv {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ov f91865c;

        public c(ov ovVar) {
            super(null);
            this.f91865c = ovVar;
        }

        public final ov c() {
            return this.f91865c;
        }
    }

    public static final class d extends uv {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final tv f91866c;

        public d(tv tvVar) {
            super(null);
            this.f91866c = tvVar;
        }

        public final tv c() {
            return this.f91866c;
        }
    }

    public /* synthetic */ uv(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "non_modal";
        }
        if (this instanceof c) {
            return "modal";
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
        return ((iv) BuiltInParserKt.getBuiltInParserComponent().T8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private uv() {
    }
}
