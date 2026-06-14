package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.g5;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class z4 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f92865f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f92866g = a.f92872f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f92870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f92871e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92872f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z4 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return z4.f92865f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z4 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((a5) BuiltInParserKt.getBuiltInParserComponent().V0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f92873e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Expression f92874f = Expression.Companion.constant$default(Expression.INSTANCE, d.POST, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f92875g = a.f92880f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f92877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f92878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f92879d;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92880f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f92873e.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((g5.c) BuiltInParserKt.getBuiltInParserComponent().b1().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        /* JADX INFO: renamed from: k8.z4$c$c, reason: collision with other inner class name */
        public static final class C1058c implements JSONSerializable, Hashable {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final b f92881d = new b(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final Function2 f92882e = a.f92886f;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Expression f92883a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Expression f92884b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Integer f92885c;

            /* JADX INFO: renamed from: k8.z4$c$c$a */
            static final class a extends Lambda implements Function2 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final a f92886f = new a();

                a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C1058c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return C1058c.f92881d.a(parsingEnvironment, jSONObject);
                }
            }

            /* JADX INFO: renamed from: k8.z4$c$c$b */
            public static final class b {
                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C1058c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return ((d5) BuiltInParserKt.getBuiltInParserComponent().Y0().getValue()).deserialize(parsingEnvironment, jSONObject);
                }

                private b() {
                }
            }

            public C1058c(Expression expression, Expression expression2) {
                this.f92883a = expression;
                this.f92884b = expression2;
            }

            public final boolean a(C1058c c1058c, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                return c1058c != null && Intrinsics.areEqual(this.f92883a.evaluate(expressionResolver), c1058c.f92883a.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.f92884b.evaluate(expressionResolver), c1058c.f92884b.evaluate(expressionResolver2));
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this.f92885c;
                if (num != null) {
                    return num.intValue();
                }
                int iHashCode = kotlin.jvm.internal.v0.b(C1058c.class).hashCode() + this.f92883a.hashCode() + this.f92884b.hashCode();
                this.f92885c = Integer.valueOf(iHashCode);
                return iHashCode;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((d5) BuiltInParserKt.getBuiltInParserComponent().Y0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        public enum d {
            GET("get"),
            POST("post"),
            PUT("put"),
            PATCH("patch"),
            DELETE("delete"),
            HEAD("head"),
            OPTIONS("options");


            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1059c f92887c = new C1059c(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final Function1 f92888d = b.f92900f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final Function1 f92889e = a.f92899f;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f92898b;

            static final class a extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final a f92899f = new a();

                a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d invoke(String str) {
                    return d.f92887c.a(str);
                }
            }

            static final class b extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final b f92900f = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(d dVar) {
                    return d.f92887c.b(dVar);
                }
            }

            /* JADX INFO: renamed from: k8.z4$c$d$c, reason: collision with other inner class name */
            public static final class C1059c {
                public /* synthetic */ C1059c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final d a(String str) {
                    d dVar = d.GET;
                    if (Intrinsics.areEqual(str, dVar.f92898b)) {
                        return dVar;
                    }
                    d dVar2 = d.POST;
                    if (Intrinsics.areEqual(str, dVar2.f92898b)) {
                        return dVar2;
                    }
                    d dVar3 = d.PUT;
                    if (Intrinsics.areEqual(str, dVar3.f92898b)) {
                        return dVar3;
                    }
                    d dVar4 = d.PATCH;
                    if (Intrinsics.areEqual(str, dVar4.f92898b)) {
                        return dVar4;
                    }
                    d dVar5 = d.DELETE;
                    if (Intrinsics.areEqual(str, dVar5.f92898b)) {
                        return dVar5;
                    }
                    d dVar6 = d.HEAD;
                    if (Intrinsics.areEqual(str, dVar6.f92898b)) {
                        return dVar6;
                    }
                    d dVar7 = d.OPTIONS;
                    if (Intrinsics.areEqual(str, dVar7.f92898b)) {
                        return dVar7;
                    }
                    return null;
                }

                public final String b(d dVar) {
                    return dVar.f92898b;
                }

                private C1059c() {
                }
            }

            d(String str) {
                this.f92898b = str;
            }
        }

        public c(List list, Expression expression, Expression expression2) {
            this.f92876a = list;
            this.f92877b = expression;
            this.f92878c = expression2;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (cVar == null) {
                return false;
            }
            List list = this.f92876a;
            if (list != null) {
                List list2 = cVar.f92876a;
                if (list2 != null && list.size() == list2.size()) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((C1058c) obj).a((C1058c) list2.get(i10), expressionResolver, expressionResolver2)) {
                            break;
                        }
                        i10 = i11;
                    }
                    if (this.f92877b.evaluate(expressionResolver) == cVar.f92877b.evaluate(expressionResolver2) || !Intrinsics.areEqual(this.f92878c.evaluate(expressionResolver), cVar.f92878c.evaluate(expressionResolver2))) {
                        break;
                    }
                    return true;
                }
            } else if (cVar.f92876a == null) {
                if (this.f92877b.evaluate(expressionResolver) == cVar.f92877b.evaluate(expressionResolver2)) {
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f92879d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode();
            List list = this.f92876a;
            int iHash = 0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((C1058c) it.next()).hash();
                }
            }
            int iHashCode2 = iHashCode + iHash + this.f92877b.hashCode() + this.f92878c.hashCode();
            this.f92879d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((g5.c) BuiltInParserKt.getBuiltInParserComponent().b1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public z4(Expression expression, List list, List list2, c cVar) {
        this.f92867a = expression;
        this.f92868b = list;
        this.f92869c = list2;
        this.f92870d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.z4 r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            com.yandex.div.json.expressions.Expression r1 = r6.f92867a
            java.lang.Object r1 = r1.evaluate(r8)
            com.yandex.div.json.expressions.Expression r2 = r7.f92867a
            java.lang.Object r2 = r2.evaluate(r9)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto La5
            java.util.List r1 = r6.f92868b
            if (r1 == 0) goto L54
            java.util.List r2 = r7.f92868b
            if (r2 != 0) goto L1f
            return r0
        L1f:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L2b
            goto La5
        L2b:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L32:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L43
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L43:
            java.lang.Object r3 = r2.get(r3)
            k8.j1 r3 = (k8.j1) r3
            k8.j1 r4 = (k8.j1) r4
            boolean r3 = r4.a(r3, r8, r9)
            if (r3 != 0) goto L52
            goto La5
        L52:
            r3 = r5
            goto L32
        L54:
            java.util.List r1 = r7.f92868b
            if (r1 != 0) goto La5
        L58:
            java.util.List r1 = r6.f92869c
            if (r1 == 0) goto L95
            java.util.List r2 = r7.f92869c
            if (r2 != 0) goto L61
            return r0
        L61:
            int r3 = r1.size()
            int r4 = r2.size()
            if (r3 == r4) goto L6c
            goto La5
        L6c:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = r0
        L73:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L84
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L84:
            java.lang.Object r3 = r2.get(r3)
            k8.j1 r3 = (k8.j1) r3
            k8.j1 r4 = (k8.j1) r4
            boolean r3 = r4.a(r3, r8, r9)
            if (r3 != 0) goto L93
            goto La5
        L93:
            r3 = r5
            goto L73
        L95:
            java.util.List r1 = r7.f92869c
            if (r1 != 0) goto La5
        L99:
            k8.z4$c r1 = r6.f92870d
            k8.z4$c r7 = r7.f92870d
            boolean r7 = r1.a(r7, r8, r9)
            if (r7 == 0) goto La5
            r7 = 1
            return r7
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.z4.a(k8.z4, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f92871e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(z4.class).hashCode() + this.f92867a.hashCode();
        List list = this.f92868b;
        int iHash2 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode + iHash;
        List list2 = this.f92869c;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                iHash2 += ((j1) it2.next()).hash();
            }
        }
        int iHash3 = i10 + iHash2 + this.f92870d.hash();
        this.f92871e = Integer.valueOf(iHash3);
        return iHash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((a5) BuiltInParserKt.getBuiltInParserComponent().V0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
