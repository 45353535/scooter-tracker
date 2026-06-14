package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.dw;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bw implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f86582e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f86583f = Expression.Companion.constant$default(Expression.INSTANCE, c.ON_CONDITION, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f86584g = a.f86589f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f86585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f86586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f86587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f86588d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86589f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bw invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return bw.f86582e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bw a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((dw.c) BuiltInParserKt.getBuiltInParserComponent().e9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1031c f86590c = new C1031c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f86591d = b.f86598f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f86592e = a.f86597f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f86596b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f86597f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f86590c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f86598f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f86590c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.bw$c$c, reason: collision with other inner class name */
        public static final class C1031c {
            public /* synthetic */ C1031c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.ON_CONDITION;
                if (Intrinsics.areEqual(str, cVar.f86596b)) {
                    return cVar;
                }
                c cVar2 = c.ON_VARIABLE;
                if (Intrinsics.areEqual(str, cVar2.f86596b)) {
                    return cVar2;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f86596b;
            }

            private C1031c() {
            }
        }

        c(String str) {
            this.f86596b = str;
        }
    }

    public bw(List list, Expression expression, Expression expression2) {
        this.f86585a = list;
        this.f86586b = expression;
        this.f86587c = expression2;
    }

    public final boolean a(bw bwVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (bwVar == null) {
            return false;
        }
        List list = this.f86585a;
        List list2 = bwVar.f86585a;
        if (list.size() == list2.size()) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (((Boolean) this.f86586b.evaluate(expressionResolver)).booleanValue() != ((Boolean) bwVar.f86586b.evaluate(expressionResolver2)).booleanValue() || this.f86587c.evaluate(expressionResolver) != bwVar.f86587c.evaluate(expressionResolver2)) {
                        break;
                    }
                    return true;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((j1) next).a((j1) list2.get(i10), expressionResolver, expressionResolver2)) {
                    break;
                }
                i10 = i11;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86588d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(bw.class).hashCode();
        Iterator it = this.f86585a.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((j1) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + this.f86586b.hashCode() + this.f86587c.hashCode();
        this.f86588d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((dw.c) BuiltInParserKt.getBuiltInParserComponent().e9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
