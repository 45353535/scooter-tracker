package k8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ow implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f90268a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f90269b = d.f90273f;

    public static final class a extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k8.j f90270c;

        public a(k8.j jVar) {
            super(null);
            this.f90270c = jVar;
        }

        public final k8.j c() {
            return this.f90270c;
        }
    }

    public static final class b extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t f90271c;

        public b(t tVar) {
            super(null);
            this.f90271c = tVar;
        }

        public final t c() {
            return this.f90271c;
        }
    }

    public static final class c extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0 f90272c;

        public c(d0 d0Var) {
            super(null);
            this.f90272c = d0Var;
        }

        public final d0 c() {
            return this.f90272c;
        }
    }

    static final class d extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f90273f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ow invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return e.b(ow.f90268a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ow b(e eVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return eVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final ow a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((mw) BuiltInParserKt.getBuiltInParserComponent().l9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private e() {
        }
    }

    public static final class f extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x0 f90274c;

        public f(x0 x0Var) {
            super(null);
            this.f90274c = x0Var;
        }

        public final x0 c() {
            return this.f90274c;
        }
    }

    public static final class g extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ly f90275c;

        public g(ly lyVar) {
            super(null);
            this.f90275c = lyVar;
        }

        public final ly c() {
            return this.f90275c;
        }
    }

    public static final class h extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wy f90276c;

        public h(wy wyVar) {
            super(null);
            this.f90276c = wyVar;
        }

        public final wy c() {
            return this.f90276c;
        }
    }

    public static final class i extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ez f90277c;

        public i(ez ezVar) {
            super(null);
            this.f90277c = ezVar;
        }

        public final ez c() {
            return this.f90277c;
        }
    }

    public static final class j extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final tz f90278c;

        public j(tz tzVar) {
            super(null);
            this.f90278c = tzVar;
        }

        public final tz c() {
            return this.f90278c;
        }
    }

    public static final class k extends ow {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d00 f90279c;

        public k(d00 d00Var) {
            super(null);
            this.f90279c = d00Var;
        }

        public final d00 c() {
            return this.f90279c;
        }
    }

    public /* synthetic */ ow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof j) {
            return TypedValues.Custom.S_STRING;
        }
        if (this instanceof h) {
            return "number";
        }
        if (this instanceof g) {
            return TypedValues.Custom.S_INT;
        }
        if (this instanceof b) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (this instanceof c) {
            return "color";
        }
        if (this instanceof k) {
            return "url";
        }
        if (this instanceof f) {
            return "dict";
        }
        if (this instanceof a) {
            return "array";
        }
        if (this instanceof i) {
            return "property";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((mw) BuiltInParserKt.getBuiltInParserComponent().l9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private ow() {
    }
}
