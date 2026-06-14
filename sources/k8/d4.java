package k8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d4 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f86894a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f86895b = a.f86896f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86896f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d4 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(d4.f86894a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ d4 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final d4 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((b4) BuiltInParserKt.getBuiltInParserComponent().E0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends d4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wx f86897c;

        public c(wx wxVar) {
            super(null);
            this.f86897c = wxVar;
        }

        public final wx c() {
            return this.f86897c;
        }
    }

    public static final class d extends d4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ay f86898c;

        public d(ay ayVar) {
            super(null);
            this.f86898c = ayVar;
        }

        public final ay c() {
            return this.f86898c;
        }
    }

    public static final class e extends d4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final az f86899c;

        public e(az azVar) {
            super(null);
            this.f86899c = azVar;
        }

        public final az c() {
            return this.f86899c;
        }
    }

    public static final class f extends d4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final jz f86900c;

        public f(jz jzVar) {
            super(null);
            this.f86900c = jzVar;
        }

        public final jz c() {
            return this.f86900c;
        }
    }

    public /* synthetic */ d4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof e) {
            return "offset";
        }
        if (this instanceof d) {
            return FirebaseAnalytics.Param.INDEX;
        }
        if (this instanceof f) {
            return "start";
        }
        if (this instanceof c) {
            return "end";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((b4) BuiltInParserKt.getBuiltInParserComponent().E0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private d4() {
    }
}
