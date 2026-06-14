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
public abstract class v6 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91895a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f91896b = a.f91897f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91897f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(v6.f91895a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ v6 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final v6 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((t6) BuiltInParserKt.getBuiltInParserComponent().A1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends v6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final bc f91898c;

        public c(bc bcVar) {
            super(null);
            this.f91898c = bcVar;
        }

        public final bc c() {
            return this.f91898c;
        }
    }

    public static final class d extends v6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qn f91899c;

        public d(qn qnVar) {
            super(null);
            this.f91899c = qnVar;
        }

        public final qn c() {
            return this.f91899c;
        }
    }

    public static final class e extends v6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q6 f91900c;

        public e(q6 q6Var) {
            super(null);
            this.f91900c = q6Var;
        }

        public final q6 c() {
            return this.f91900c;
        }
    }

    public static final class f extends v6 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sp f91901c;

        public f(sp spVar) {
            super(null);
            this.f91901c = spVar;
        }

        public final sp c() {
            return this.f91901c;
        }
    }

    public /* synthetic */ v6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof e) {
            return "set";
        }
        if (this instanceof c) {
            return "fade";
        }
        if (this instanceof d) {
            return "scale";
        }
        if (this instanceof f) {
            return "slide";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((t6) BuiltInParserKt.getBuiltInParserComponent().A1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private v6() {
    }
}
