package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bd implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f86503g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f86504h = a.f86511f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f86505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7 f86506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f86507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f86508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f86509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f86510f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86511f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bd invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return bd.f86503g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bd a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((cd) BuiltInParserKt.getBuiltInParserComponent().z3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f86512g = new b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Function2 f86513h = a.f86520f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f86514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f86515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f86516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression f86517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression f86518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f86519f;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86520f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f86512g.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((fd) BuiltInParserKt.getBuiltInParserComponent().C3().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
            this.f86514a = expression;
            this.f86515b = expression2;
            this.f86516c = expression3;
            this.f86517d = expression4;
            this.f86518e = expression5;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (cVar == null) {
                return false;
            }
            Expression expression = this.f86514a;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = cVar.f86514a;
            if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
                Expression expression3 = this.f86515b;
                String str2 = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
                Expression expression4 = cVar.f86515b;
                if (Intrinsics.areEqual(str2, expression4 != null ? (String) expression4.evaluate(expressionResolver2) : null)) {
                    Expression expression5 = this.f86516c;
                    String str3 = expression5 != null ? (String) expression5.evaluate(expressionResolver) : null;
                    Expression expression6 = cVar.f86516c;
                    if (Intrinsics.areEqual(str3, expression6 != null ? (String) expression6.evaluate(expressionResolver2) : null)) {
                        Expression expression7 = this.f86517d;
                        String str4 = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
                        Expression expression8 = cVar.f86517d;
                        if (Intrinsics.areEqual(str4, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null)) {
                            Expression expression9 = this.f86518e;
                            String str5 = expression9 != null ? (String) expression9.evaluate(expressionResolver) : null;
                            Expression expression10 = cVar.f86518e;
                            if (Intrinsics.areEqual(str5, expression10 != null ? (String) expression10.evaluate(expressionResolver2) : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f86519f;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode();
            Expression expression = this.f86514a;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            Expression expression2 = this.f86515b;
            int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
            Expression expression3 = this.f86516c;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression expression4 = this.f86517d;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression expression5 = this.f86518e;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0);
            this.f86519f = Integer.valueOf(iHashCode6);
            return iHashCode6;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((fd) BuiltInParserKt.getBuiltInParserComponent().C3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public bd(List list, l7 l7Var, c cVar, List list2, List list3) {
        this.f86505a = list;
        this.f86506b = l7Var;
        this.f86507c = cVar;
        this.f86508d = list2;
        this.f86509e = list3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.bd r8, com.yandex.div.json.expressions.ExpressionResolver r9, com.yandex.div.json.expressions.ExpressionResolver r10) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.bd.a(k8.bd, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f86510f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(bd.class).hashCode();
        List list = this.f86505a;
        int iHash3 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((a7) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        l7 l7Var = this.f86506b;
        int iHash4 = i10 + (l7Var != null ? l7Var.hash() : 0);
        c cVar = this.f86507c;
        int iHash5 = iHash4 + (cVar != null ? cVar.hash() : 0);
        List list2 = this.f86508d;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((j1) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHash5 + iHash2;
        List list3 = this.f86509e;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                iHash3 += ((j1) it3.next()).hash();
            }
        }
        int i12 = i11 + iHash3;
        this.f86510f = Integer.valueOf(i12);
        return i12;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((cd) BuiltInParserKt.getBuiltInParserComponent().z3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
