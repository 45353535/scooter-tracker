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
public abstract class vh implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91927a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f91928b = a.f91929f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91929f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vh invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(vh.f91927a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ vh b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final vh a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((qh) BuiltInParserKt.getBuiltInParserComponent().H4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends vh {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final oh f91930c;

        public c(oh ohVar) {
            super(null);
            this.f91930c = ohVar;
        }

        public final oh c() {
            return this.f91930c;
        }
    }

    public static final class d extends vh {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final uh f91931c;

        public d(uh uhVar) {
            super(null);
            this.f91931c = uhVar;
        }

        public final uh c() {
            return this.f91931c;
        }
    }

    public /* synthetic */ vh(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "regex";
        }
        if (this instanceof c) {
            return "expression";
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
        return ((qh) BuiltInParserKt.getBuiltInParserComponent().H4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private vh() {
    }
}
