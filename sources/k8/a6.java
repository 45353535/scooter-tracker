package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.f6;
import k8.n9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a6 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f86186k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Expression f86187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Expression f86188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final n9.d f86189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f86190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Function2 f86191p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f86193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f86194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f86195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f86196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n9 f86197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression f86198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Expression f86199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f86200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f86201j;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86202f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return a6.f86186k.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a6 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((f6.d) BuiltInParserKt.getBuiltInParserComponent().q1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1029c f86203c = new C1029c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f86204d = b.f86215f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f86205e = a.f86214f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f86213b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86214f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f86203c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f86215f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f86203c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.a6$c$c, reason: collision with other inner class name */
        public static final class C1029c {
            public /* synthetic */ C1029c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.FADE;
                if (Intrinsics.areEqual(str, cVar.f86213b)) {
                    return cVar;
                }
                c cVar2 = c.TRANSLATE;
                if (Intrinsics.areEqual(str, cVar2.f86213b)) {
                    return cVar2;
                }
                c cVar3 = c.SCALE;
                if (Intrinsics.areEqual(str, cVar3.f86213b)) {
                    return cVar3;
                }
                c cVar4 = c.NATIVE;
                if (Intrinsics.areEqual(str, cVar4.f86213b)) {
                    return cVar4;
                }
                c cVar5 = c.SET;
                if (Intrinsics.areEqual(str, cVar5.f86213b)) {
                    return cVar5;
                }
                c cVar6 = c.NO_ANIMATION;
                if (Intrinsics.areEqual(str, cVar6.f86213b)) {
                    return cVar6;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f86213b;
            }

            private C1029c() {
            }
        }

        c(String str) {
            this.f86213b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86187l = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        f86188m = Expression.Companion.constant$default(companion, c6.SPRING, null, 2, null);
        f86189n = new n9.d(new tf());
        f86190o = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86191p = a.f86202f;
    }

    public a6(Expression expression, Expression expression2, Expression expression3, List list, Expression expression4, n9 n9Var, Expression expression5, Expression expression6) {
        this.f86192a = expression;
        this.f86193b = expression2;
        this.f86194c = expression3;
        this.f86195d = list;
        this.f86196e = expression4;
        this.f86197f = n9Var;
        this.f86198g = expression5;
        this.f86199h = expression6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(k8.a6 r8, com.yandex.div.json.expressions.ExpressionResolver r9, com.yandex.div.json.expressions.ExpressionResolver r10) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.a6.a(k8.a6, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    public int b() {
        Integer num = this.f86200i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(a6.class).hashCode() + this.f86192a.hashCode();
        Expression expression = this.f86193b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f86194c.hashCode() + this.f86196e.hashCode() + this.f86197f.hash() + this.f86198g.hashCode();
        Expression expression2 = this.f86199h;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this.f86200i = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86201j;
        if (num != null) {
            return num.intValue();
        }
        int iB = b();
        List list = this.f86195d;
        int iHash = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((a6) it.next()).hash();
            }
        }
        int i10 = iB + iHash;
        this.f86201j = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((f6.d) BuiltInParserKt.getBuiltInParserComponent().q1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ a6(com.yandex.div.json.expressions.Expression r2, com.yandex.div.json.expressions.Expression r3, com.yandex.div.json.expressions.Expression r4, java.util.List r5, com.yandex.div.json.expressions.Expression r6, k8.n9 r7, com.yandex.div.json.expressions.Expression r8, com.yandex.div.json.expressions.Expression r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            com.yandex.div.json.expressions.Expression r2 = k8.a6.f86187l
        L6:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lc
            r3 = r0
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L12
            com.yandex.div.json.expressions.Expression r4 = k8.a6.f86188m
        L12:
            r11 = r10 & 8
            if (r11 == 0) goto L17
            r5 = r0
        L17:
            r11 = r10 & 32
            if (r11 == 0) goto L1d
            k8.n9$d r7 = k8.a6.f86189n
        L1d:
            r11 = r10 & 64
            if (r11 == 0) goto L23
            com.yandex.div.json.expressions.Expression r8 = k8.a6.f86190o
        L23:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L31
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3a
        L31:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.a6.<init>(com.yandex.div.json.expressions.Expression, com.yandex.div.json.expressions.Expression, com.yandex.div.json.expressions.Expression, java.util.List, com.yandex.div.json.expressions.Expression, k8.n9, com.yandex.div.json.expressions.Expression, com.yandex.div.json.expressions.Expression, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
