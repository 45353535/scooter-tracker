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
public abstract class wm implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f92218a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f92219b = a.f92220f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92220f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wm invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return b.b(wm.f92218a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ wm b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final wm a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((um) BuiltInParserKt.getBuiltInParserComponent().p6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends wm {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ad f92221c;

        public c(ad adVar) {
            super(null);
            this.f92221c = adVar;
        }

        public final ad c() {
            return this.f92221c;
        }
    }

    public static final class d extends wm {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final en f92222c;

        public d(en enVar) {
            super(null);
            this.f92222c = enVar;
        }

        public final en c() {
            return this.f92222c;
        }
    }

    public /* synthetic */ wm(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof c) {
            return "fixed";
        }
        if (this instanceof d) {
            return "relative";
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
        return ((um) BuiltInParserKt.getBuiltInParserComponent().p6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private wm() {
    }
}
