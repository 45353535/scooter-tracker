package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.cn;
import k8.fm;
import k8.lm;
import k8.rm;
import k8.sm;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class em implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f87334g = new c(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final fm.d f87335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final fm.d f87336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final sm.d f87337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f87338k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fm f87339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fm f87340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f87341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExpressionList f87342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sm f87343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f87344f;

    public static final class a implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f87345d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Function2 f87346e = C1035a.f87350f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f87347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f87348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f87349c;

        /* JADX INFO: renamed from: k8.em$a$a, reason: collision with other inner class name */
        static final class C1035a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1035a f87350f = new C1035a();

            C1035a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return a.f87345d.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((lm.b) BuiltInParserKt.getBuiltInParserComponent().f6().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public a(Expression expression, Expression expression2) {
            this.f87347a = expression;
            this.f87348b = expression2;
        }

        public final boolean a(a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            return aVar != null && ((Number) this.f87347a.evaluate(expressionResolver)).intValue() == ((Number) aVar.f87347a.evaluate(expressionResolver2)).intValue() && ((Number) this.f87348b.evaluate(expressionResolver)).doubleValue() == ((Number) aVar.f87348b.evaluate(expressionResolver2)).doubleValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f87349c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(a.class).hashCode() + this.f87347a.hashCode() + this.f87348b.hashCode();
            this.f87349c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((lm.b) BuiltInParserKt.getBuiltInParserComponent().f6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87351f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final em invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return em.f87334g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final em a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rm.b) BuiltInParserKt.getBuiltInParserComponent().l6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double dValueOf = Double.valueOf(0.5d);
        f87335h = new fm.d(new xm(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f87336i = new fm.d(new xm(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f87337j = new sm.d(new cn(Expression.Companion.constant$default(companion, cn.c.FARTHEST_CORNER, null, 2, null)));
        f87338k = b.f87351f;
    }

    public em(fm fmVar, fm fmVar2, List list, ExpressionList expressionList, sm smVar) {
        this.f87339a = fmVar;
        this.f87340b = fmVar2;
        this.f87341c = list;
        this.f87342d = expressionList;
        this.f87343e = smVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.em r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            k8.fm r1 = r6.f87339a
            k8.fm r2 = r7.f87339a
            boolean r1 = r1.a(r2, r8, r9)
            if (r1 == 0) goto Lb7
            k8.fm r1 = r6.f87340b
            k8.fm r2 = r7.f87340b
            boolean r1 = r1.a(r2, r8, r9)
            if (r1 == 0) goto Lb7
            java.util.List r1 = r6.f87341c
            if (r1 == 0) goto L56
            java.util.List r2 = r7.f87341c
            if (r2 != 0) goto L21
            return r0
        L21:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L2d
            goto Lb7
        L2d:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L34:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L45
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L45:
            java.lang.Object r3 = r2.get(r3)
            k8.em$a r3 = (k8.em.a) r3
            k8.em$a r4 = (k8.em.a) r4
            boolean r3 = r4.a(r3, r8, r9)
            if (r3 != 0) goto L54
            goto Lb7
        L54:
            r3 = r5
            goto L34
        L56:
            java.util.List r1 = r7.f87341c
            if (r1 != 0) goto Lb7
        L5a:
            com.yandex.div.json.expressions.ExpressionList r1 = r6.f87342d
            if (r1 == 0) goto La7
            java.util.List r1 = r1.evaluate(r8)
            if (r1 == 0) goto La7
            com.yandex.div.json.expressions.ExpressionList r2 = r7.f87342d
            if (r2 == 0) goto La6
            java.util.List r2 = r2.evaluate(r9)
            if (r2 != 0) goto L6f
            goto La6
        L6f:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L7a
            goto Lb7
        L7a:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L81:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L92
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L92:
            java.lang.Object r3 = r2.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto Lb7
            r3 = r5
            goto L81
        La6:
            return r0
        La7:
            com.yandex.div.json.expressions.ExpressionList r1 = r7.f87342d
            if (r1 != 0) goto Lb7
        Lab:
            k8.sm r1 = r6.f87343e
            k8.sm r7 = r7.f87343e
            boolean r7 = r1.a(r7, r8, r9)
            if (r7 == 0) goto Lb7
            r7 = 1
            return r7
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.em.a(k8.em, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87344f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(em.class).hashCode() + this.f87339a.hash() + this.f87340b.hash();
        List list = this.f87341c;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((a) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        ExpressionList expressionList = this.f87342d;
        int iHashCode2 = i10 + (expressionList != null ? expressionList.hashCode() : 0) + this.f87343e.hash();
        this.f87344f = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rm.b) BuiltInParserKt.getBuiltInParserComponent().l6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
