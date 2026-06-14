package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.w5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class v5 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f91880d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f91881e = b.f91894f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f91883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f91884c;

    public enum a {
        START("start"),
        PAUSE("pause");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f91885c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91886d = b.f91893f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91887e = C1053a.f91892f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91891b;

        /* JADX INFO: renamed from: k8.v5$a$a, reason: collision with other inner class name */
        static final class C1053a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1053a f91892f = new C1053a();

            C1053a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String str) {
                return a.f91885c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91893f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a aVar) {
                return a.f91885c.b(aVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                a aVar = a.START;
                if (Intrinsics.areEqual(str, aVar.f91891b)) {
                    return aVar;
                }
                a aVar2 = a.PAUSE;
                if (Intrinsics.areEqual(str, aVar2.f91891b)) {
                    return aVar2;
                }
                return null;
            }

            public final String b(a aVar) {
                return aVar.f91891b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f91891b = str;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f91894f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return v5.f91880d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v5 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((w5.c) BuiltInParserKt.getBuiltInParserComponent().n1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public v5(Expression expression, Expression expression2) {
        this.f91882a = expression;
        this.f91883b = expression2;
    }

    public final boolean a(v5 v5Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return v5Var != null && this.f91882a.evaluate(expressionResolver) == v5Var.f91882a.evaluate(expressionResolver2) && Intrinsics.areEqual(this.f91883b.evaluate(expressionResolver), v5Var.f91883b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91884c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(v5.class).hashCode() + this.f91882a.hashCode() + this.f91883b.hashCode();
        this.f91884c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((w5.c) BuiltInParserKt.getBuiltInParserComponent().n1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
