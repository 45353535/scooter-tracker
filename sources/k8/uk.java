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
public abstract class uk implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f91693a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f91694b = a.f91695f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91695f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uk invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(uk.f91693a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ uk b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final uk a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((sk) BuiltInParserKt.getBuiltInParserComponent().D5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends uk {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vi f91696c;

        public c(vi viVar) {
            super(null);
            this.f91696c = viVar;
        }

        public final vi c() {
            return this.f91696c;
        }
    }

    public static final class d extends uk {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final kj f91697c;

        public d(kj kjVar) {
            super(null);
            this.f91697c = kjVar;
        }

        public final kj c() {
            return this.f91697c;
        }
    }

    public static final class e extends uk {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final pj f91698c;

        public e(pj pjVar) {
            super(null);
            this.f91698c = pjVar;
        }

        public final pj c() {
            return this.f91698c;
        }
    }

    public /* synthetic */ uk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof e) {
            return "percentage";
        }
        if (this instanceof c) {
            return "fixed";
        }
        if (this instanceof d) {
            return "wrap_content";
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
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((sk) BuiltInParserKt.getBuiltInParserComponent().D5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private uk() {
    }
}
