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
public abstract class ik implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f88254a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f88255b = a.f88256f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88256f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ik invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(ik.f88254a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ik b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final ik a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((sj) BuiltInParserKt.getBuiltInParserComponent().r5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends ik {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ak f88257c;

        public c(ak akVar) {
            super(null);
            this.f88257c = akVar;
        }

        public final ak c() {
            return this.f88257c;
        }
    }

    public static final class d extends ik {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final hk f88258c;

        public d(hk hkVar) {
            super(null);
            this.f88258c = hkVar;
        }

        public final hk c() {
            return this.f88258c;
        }
    }

    public /* synthetic */ ik(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof d) {
            return "slide";
        }
        if (this instanceof c) {
            return "overlap";
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
        return ((sj) BuiltInParserKt.getBuiltInParserComponent().r5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private ik() {
    }
}
