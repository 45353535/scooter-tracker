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
public abstract class t2 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91228a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f91229b = a.f91230f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91230f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t2 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(t2.f91228a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ t2 b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final t2 a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((r2) BuiltInParserKt.getBuiltInParserComponent().d0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends t2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final i0 f91231c;

        public c(i0 i0Var) {
            super(null);
            this.f91231c = i0Var;
        }

        public final i0 c() {
            return this.f91231c;
        }
    }

    public static final class d extends t2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n0 f91232c;

        public d(n0 n0Var) {
            super(null);
            this.f91232c = n0Var;
        }

        public final n0 c() {
            return this.f91232c;
        }
    }

    public /* synthetic */ t2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "text";
        }
        if (this instanceof d) {
            return "url";
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
        return ((r2) BuiltInParserKt.getBuiltInParserComponent().d0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private t2() {
    }
}
