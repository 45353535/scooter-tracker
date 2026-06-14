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
public abstract class yl implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f92748a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f92749b = a.f92750f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92750f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(yl.f92748a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ yl b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final yl a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((rl) BuiltInParserKt.getBuiltInParserComponent().U5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends yl {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final pl f92751c;

        public c(pl plVar) {
            super(null);
            this.f92751c = plVar;
        }

        public final pl c() {
            return this.f92751c;
        }
    }

    public static final class d extends yl {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final xl f92752c;

        public d(xl xlVar) {
            super(null);
            this.f92752c = xlVar;
        }

        public final xl c() {
            return this.f92752c;
        }
    }

    public /* synthetic */ yl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "pivot-fixed";
        }
        if (this instanceof d) {
            return "pivot-percentage";
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
        return ((rl) BuiltInParserKt.getBuiltInParserComponent().U5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private yl() {
    }
}
