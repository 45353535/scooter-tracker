package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.m8;
import k8.n8;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class k8 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f88577e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f88578f = "it";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f88579g = a.f88584f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f88582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f88583d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88584f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return k8.f88577e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k8 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((m8.b) BuiltInParserKt.getBuiltInParserComponent().d2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f88585e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Expression f88586f = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f88587g = a.f88592f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y0 f88588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f88589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f88590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f88591d;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88592f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f88585e.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((n8.b) BuiltInParserKt.getBuiltInParserComponent().g2().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(y0 y0Var, Expression expression, Expression expression2) {
            this.f88588a = y0Var;
            this.f88589b = expression;
            this.f88590c = expression2;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (cVar != null && this.f88588a.a(cVar.f88588a, expressionResolver, expressionResolver2)) {
                Expression expression = this.f88589b;
                String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                Expression expression2 = cVar.f88589b;
                if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && ((Boolean) this.f88590c.evaluate(expressionResolver)).booleanValue() == ((Boolean) cVar.f88590c.evaluate(expressionResolver2)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f88591d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode() + this.f88588a.hash();
            Expression expression = this.f88589b;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f88590c.hashCode();
            this.f88591d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((n8.b) BuiltInParserKt.getBuiltInParserComponent().g2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public k8(Expression expression, String str, List list) {
        this.f88580a = expression;
        this.f88581b = str;
        this.f88582c = list;
    }

    public final boolean a(k8 k8Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (k8Var != null && Intrinsics.areEqual(this.f88580a.evaluate(expressionResolver), k8Var.f88580a.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.f88581b, k8Var.f88581b)) {
            List list = this.f88582c;
            List list2 = k8Var.f88582c;
            if (list.size() == list2.size()) {
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (((c) obj).a((c) list2.get(i10), expressionResolver, expressionResolver2)) {
                        i10 = i11;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88583d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(k8.class).hashCode() + this.f88580a.hashCode() + this.f88581b.hashCode();
        Iterator it = this.f88582c.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((c) it.next()).hash();
        }
        int i10 = iHashCode + iHash;
        this.f88583d = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((m8.b) BuiltInParserKt.getBuiltInParserComponent().d2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
