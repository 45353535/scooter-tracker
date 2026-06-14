package k8;

import com.my.target.common.menu.MenuActionType;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.k5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.pubnative.lite.sdk.utils.AtomManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class j5 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f88345d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f88346e = b.f88363f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f88349c;

    public enum a {
        START("start"),
        STOP(AtomManager.ATOM_STOP_METHOD_NAME),
        PAUSE("pause"),
        RESUME("resume"),
        CANCEL(MenuActionType.CANCEL),
        RESET("reset");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f88350c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f88351d = b.f88362f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f88352e = C1043a.f88361f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88360b;

        /* JADX INFO: renamed from: k8.j5$a$a, reason: collision with other inner class name */
        static final class C1043a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1043a f88361f = new C1043a();

            C1043a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String str) {
                return a.f88350c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f88362f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a aVar) {
                return a.f88350c.b(aVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                a aVar = a.START;
                if (Intrinsics.areEqual(str, aVar.f88360b)) {
                    return aVar;
                }
                a aVar2 = a.STOP;
                if (Intrinsics.areEqual(str, aVar2.f88360b)) {
                    return aVar2;
                }
                a aVar3 = a.PAUSE;
                if (Intrinsics.areEqual(str, aVar3.f88360b)) {
                    return aVar3;
                }
                a aVar4 = a.RESUME;
                if (Intrinsics.areEqual(str, aVar4.f88360b)) {
                    return aVar4;
                }
                a aVar5 = a.CANCEL;
                if (Intrinsics.areEqual(str, aVar5.f88360b)) {
                    return aVar5;
                }
                a aVar6 = a.RESET;
                if (Intrinsics.areEqual(str, aVar6.f88360b)) {
                    return aVar6;
                }
                return null;
            }

            public final String b(a aVar) {
                return aVar.f88360b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f88360b = str;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f88363f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return j5.f88345d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j5 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((k5.c) BuiltInParserKt.getBuiltInParserComponent().e1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public j5(Expression expression, Expression expression2) {
        this.f88347a = expression;
        this.f88348b = expression2;
    }

    public final boolean a(j5 j5Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return j5Var != null && this.f88347a.evaluate(expressionResolver) == j5Var.f88347a.evaluate(expressionResolver2) && Intrinsics.areEqual(this.f88348b.evaluate(expressionResolver), j5Var.f88348b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88349c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(j5.class).hashCode() + this.f88347a.hashCode() + this.f88348b.hashCode();
        this.f88349c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((k5.c) BuiltInParserKt.getBuiltInParserComponent().e1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
