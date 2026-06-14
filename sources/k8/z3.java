package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class z3 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f92857b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f92858c = a.f92860f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f92859a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92860f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z3 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return z3.f92857b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z3 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((a4) BuiltInParserKt.getBuiltInParserComponent().D0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends z3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sx f92861d;

        public c(sx sxVar) {
            super(null);
            this.f92861d = sxVar;
        }

        public final sx c() {
            return this.f92861d;
        }
    }

    public static final class d extends z3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final xx f92862d;

        public d(xx xxVar) {
            super(null);
            this.f92862d = xxVar;
        }

        public final xx c() {
            return this.f92862d;
        }
    }

    public static final class e extends z3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final xy f92863d;

        public e(xy xyVar) {
            super(null);
            this.f92863d = xyVar;
        }

        public final xy c() {
            return this.f92863d;
        }
    }

    public static final class f extends z3 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final fz f92864d;

        public f(fz fzVar) {
            super(null);
            this.f92864d = fzVar;
        }

        public final fz c() {
            return this.f92864d;
        }
    }

    public /* synthetic */ z3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(z3 z3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (z3Var == null) {
            return false;
        }
        if (this instanceof e) {
            xy xyVarC = ((e) this).c();
            Object objB = z3Var.b();
            return xyVarC.a(objB instanceof xy ? (xy) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            xx xxVarC = ((d) this).c();
            Object objB2 = z3Var.b();
            return xxVarC.a(objB2 instanceof xx ? (xx) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            fz fzVarC = ((f) this).c();
            Object objB3 = z3Var.b();
            return fzVarC.a(objB3 instanceof fz ? (fz) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        sx sxVarC = ((c) this).c();
        Object objB4 = z3Var.b();
        return sxVarC.a(objB4 instanceof sx ? (sx) objB4 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f92859a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new lf.m();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f92859a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((a4) BuiltInParserKt.getBuiltInParserComponent().D0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private z3() {
    }
}
