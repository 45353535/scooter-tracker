package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.dn;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class cn implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f86757c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f86758d = a.f86761f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f86760b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86761f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cn invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return cn.f86757c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cn a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((dn.c) BuiltInParserKt.getBuiltInParserComponent().u6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1033c f86762c = new C1033c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f86763d = b.f86772f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f86764e = a.f86771f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f86770b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86771f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f86762c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f86772f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f86762c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.cn$c$c, reason: collision with other inner class name */
        public static final class C1033c {
            public /* synthetic */ C1033c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.NEAREST_CORNER;
                if (Intrinsics.areEqual(str, cVar.f86770b)) {
                    return cVar;
                }
                c cVar2 = c.FARTHEST_CORNER;
                if (Intrinsics.areEqual(str, cVar2.f86770b)) {
                    return cVar2;
                }
                c cVar3 = c.NEAREST_SIDE;
                if (Intrinsics.areEqual(str, cVar3.f86770b)) {
                    return cVar3;
                }
                c cVar4 = c.FARTHEST_SIDE;
                if (Intrinsics.areEqual(str, cVar4.f86770b)) {
                    return cVar4;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f86770b;
            }

            private C1033c() {
            }
        }

        c(String str) {
            this.f86770b = str;
        }
    }

    public cn(Expression expression) {
        this.f86759a = expression;
    }

    public final boolean a(cn cnVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return cnVar != null && this.f86759a.evaluate(expressionResolver) == cnVar.f86759a.evaluate(expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86760b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(cn.class).hashCode() + this.f86759a.hashCode();
        this.f86760b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((dn.c) BuiltInParserKt.getBuiltInParserComponent().u6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
