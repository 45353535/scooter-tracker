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
public abstract class c8 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f86627a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f86628b = b.f86630f;

    public static final class a extends c8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t7 f86629c;

        public a(t7 t7Var) {
            super(null);
            this.f86629c = t7Var;
        }

        public final t7 c() {
            return this.f86629c;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f86630f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return c.b(c8.f86627a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c8 b(c cVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return cVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final c8 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((a8) BuiltInParserKt.getBuiltInParserComponent().V1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends c8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x7 f86631c;

        public d(x7 x7Var) {
            super(null);
            this.f86631c = x7Var;
        }

        public final x7 c() {
            return this.f86631c;
        }
    }

    public /* synthetic */ c8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "set";
        }
        if (this instanceof a) {
            return "change_bounds";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((a8) BuiltInParserKt.getBuiltInParserComponent().V1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private c8() {
    }
}
