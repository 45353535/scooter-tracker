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
public abstract class jw implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f88524a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f88525b = d.f88529f;

    public static final class a extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k8.e f88526c;

        public a(k8.e eVar) {
            super(null);
            this.f88526c = eVar;
        }

        public final k8.e c() {
            return this.f88526c;
        }
    }

    public static final class b extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o f88527c;

        public b(o oVar) {
            super(null);
            this.f88527c = oVar;
        }

        public final o c() {
            return this.f88527c;
        }
    }

    public static final class c extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y f88528c;

        public c(y yVar) {
            super(null);
            this.f88528c = yVar;
        }

        public final y c() {
            return this.f88528c;
        }
    }

    static final class d extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f88529f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jw invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return e.b(jw.f88524a, parsingEnvironment, false, jSONObject, 2, null);
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ jw b(e eVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return eVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final jw a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) {
            return ((hw) BuiltInParserKt.getBuiltInParserComponent().i9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private e() {
        }
    }

    public static final class f extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s0 f88530c;

        public f(s0 s0Var) {
            super(null);
            this.f88530c = s0Var;
        }

        public final s0 c() {
            return this.f88530c;
        }
    }

    public static final class g extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final gy f88531c;

        public g(gy gyVar) {
            super(null);
            this.f88531c = gyVar;
        }

        public final gy c() {
            return this.f88531c;
        }
    }

    public static final class h extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ry f88532c;

        public h(ry ryVar) {
            super(null);
            this.f88532c = ryVar;
        }

        public final ry c() {
            return this.f88532c;
        }
    }

    public static final class i extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final oz f88533c;

        public i(oz ozVar) {
            super(null);
            this.f88533c = ozVar;
        }

        public final oz c() {
            return this.f88533c;
        }
    }

    public static final class j extends jw {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yz f88534c;

        public j(yz yzVar) {
            super(null);
            this.f88534c = yzVar;
        }

        public final yz c() {
            return this.f88534c;
        }
    }

    public /* synthetic */ jw(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof i) {
            return TypedValues.Custom.S_STRING;
        }
        if (this instanceof g) {
            return TypedValues.Custom.S_INT;
        }
        if (this instanceof h) {
            return "number";
        }
        if (this instanceof c) {
            return "color";
        }
        if (this instanceof b) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (this instanceof j) {
            return "url";
        }
        if (this instanceof f) {
            return "dict";
        }
        if (this instanceof a) {
            return "array";
        }
        throw new lf.m();
    }

    public final Object b() {
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((hw) BuiltInParserKt.getBuiltInParserComponent().i9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private jw() {
    }
}
