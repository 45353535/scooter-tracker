package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.x3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class w3 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f92079g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f92080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f92081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f92082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f92083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Function2 f92084l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f92087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f92088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f92089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f92090f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92091f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w3 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return w3.f92079g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w3 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((x3.c) BuiltInParserKt.getBuiltInParserComponent().A0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        CLAMP("clamp"),
        RING("ring");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1054c f92092c = new C1054c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f92093d = b.f92100f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f92094e = a.f92099f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f92098b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92099f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f92092c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f92100f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f92092c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.w3$c$c, reason: collision with other inner class name */
        public static final class C1054c {
            public /* synthetic */ C1054c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.CLAMP;
                if (Intrinsics.areEqual(str, cVar.f92098b)) {
                    return cVar;
                }
                c cVar2 = c.RING;
                if (Intrinsics.areEqual(str, cVar2.f92098b)) {
                    return cVar2;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f92098b;
            }

            private C1054c() {
            }
        }

        c(String str) {
            this.f92098b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f92080h = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f92081i = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92082j = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f92083k = Expression.Companion.constant$default(companion, c.CLAMP, null, 2, null);
        f92084l = a.f92091f;
    }

    public w3(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        this.f92085a = expression;
        this.f92086b = expression2;
        this.f92087c = expression3;
        this.f92088d = expression4;
        this.f92089e = expression5;
    }

    public final boolean a(w3 w3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return w3Var != null && ((Boolean) this.f92085a.evaluate(expressionResolver)).booleanValue() == ((Boolean) w3Var.f92085a.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.f92086b.evaluate(expressionResolver), w3Var.f92086b.evaluate(expressionResolver2)) && ((Number) this.f92087c.evaluate(expressionResolver)).longValue() == ((Number) w3Var.f92087c.evaluate(expressionResolver2)).longValue() && ((Number) this.f92088d.evaluate(expressionResolver)).longValue() == ((Number) w3Var.f92088d.evaluate(expressionResolver2)).longValue() && this.f92089e.evaluate(expressionResolver) == w3Var.f92089e.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92090f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(w3.class).hashCode() + this.f92085a.hashCode() + this.f92086b.hashCode() + this.f92087c.hashCode() + this.f92088d.hashCode() + this.f92089e.hashCode();
        this.f92090f = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((x3.c) BuiltInParserKt.getBuiltInParserComponent().A0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
