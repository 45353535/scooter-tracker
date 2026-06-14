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
public abstract class dh implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f87039a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f87040b = a.f87041f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87041f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dh invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(dh.f87039a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ dh b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final dh a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((bh) BuiltInParserKt.getBuiltInParserComponent().w4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends dh {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w9 f87042c;

        public c(w9 w9Var) {
            super(null);
            this.f87042c = w9Var;
        }

        public final w9 c() {
            return this.f87042c;
        }
    }

    public static final class d extends dh {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wc f87043c;

        public d(wc wcVar) {
            super(null);
            this.f87043c = wcVar;
        }

        public final wc c() {
            return this.f87043c;
        }
    }

    public static final class e extends dh {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ll f87044c;

        public e(ll llVar) {
            super(null);
            this.f87044c = llVar;
        }

        public final ll c() {
            return this.f87044c;
        }
    }

    public /* synthetic */ dh(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "fixed_length";
        }
        if (this instanceof c) {
            return "currency";
        }
        if (this instanceof e) {
            return "phone";
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
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((bh) BuiltInParserKt.getBuiltInParserComponent().w4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private dh() {
    }
}
