package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.rp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class op implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f90239g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f90240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f90241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f90242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f90243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Function2 f90244l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa f90245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f90246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f90247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f90248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f90249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f90250f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90251f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final op invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return op.f90239g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final op a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rp.d) BuiltInParserKt.getBuiltInParserComponent().e7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1046c f90252c = new C1046c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f90253d = b.f90262f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f90254e = a.f90261f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f90260b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f90261f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f90252c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f90262f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f90252c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.op$c$c, reason: collision with other inner class name */
        public static final class C1046c {
            public /* synthetic */ C1046c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.LEFT;
                if (Intrinsics.areEqual(str, cVar.f90260b)) {
                    return cVar;
                }
                c cVar2 = c.TOP;
                if (Intrinsics.areEqual(str, cVar2.f90260b)) {
                    return cVar2;
                }
                c cVar3 = c.RIGHT;
                if (Intrinsics.areEqual(str, cVar3.f90260b)) {
                    return cVar3;
                }
                c cVar4 = c.BOTTOM;
                if (Intrinsics.areEqual(str, cVar4.f90260b)) {
                    return cVar4;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f90260b;
            }

            private C1046c() {
            }
        }

        c(String str) {
            this.f90260b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90240h = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f90241i = Expression.Companion.constant$default(companion, c.BOTTOM, null, 2, null);
        f90242j = Expression.Companion.constant$default(companion, c6.EASE_IN_OUT, null, 2, null);
        f90243k = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90244l = a.f90251f;
    }

    public op(oa oaVar, Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.f90245a = oaVar;
        this.f90246b = expression;
        this.f90247c = expression2;
        this.f90248d = expression3;
        this.f90249e = expression4;
    }

    public final boolean a(op opVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (opVar == null) {
            return false;
        }
        oa oaVar = this.f90245a;
        return (oaVar != null ? oaVar.a(opVar.f90245a, expressionResolver, expressionResolver2) : opVar.f90245a == null) && ((Number) b().evaluate(expressionResolver)).longValue() == ((Number) opVar.b().evaluate(expressionResolver2)).longValue() && this.f90247c.evaluate(expressionResolver) == opVar.f90247c.evaluate(expressionResolver2) && c().evaluate(expressionResolver) == opVar.c().evaluate(expressionResolver2) && ((Number) d().evaluate(expressionResolver)).longValue() == ((Number) opVar.d().evaluate(expressionResolver2)).longValue();
    }

    public Expression b() {
        return this.f90246b;
    }

    public Expression c() {
        return this.f90248d;
    }

    public Expression d() {
        return this.f90249e;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90250f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(op.class).hashCode();
        oa oaVar = this.f90245a;
        int iHash = iHashCode + (oaVar != null ? oaVar.hash() : 0) + b().hashCode() + this.f90247c.hashCode() + c().hashCode() + d().hashCode();
        this.f90250f = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rp.d) BuiltInParserKt.getBuiltInParserComponent().e7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
