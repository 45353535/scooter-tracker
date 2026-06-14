package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.g1;
import k8.h1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f88168h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f88169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Expression f88170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final g1.d f88171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Function2 f88172l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f88173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f88174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f88175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f88176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f88177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field f88178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field f88179g;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88180f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new i1(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88169i = Expression.Companion.constant$default(companion, g1.c.DEFAULT, null, 2, null);
        f88170j = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f88171k = g1.d.AUTO;
        f88172l = a.f88180f;
    }

    public i1(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.f88173a = field;
        this.f88174b = field2;
        this.f88175c = field3;
        this.f88176d = field4;
        this.f88177e = field5;
        this.f88178f = field6;
        this.f88179g = field7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((h1.d) BuiltInParserKt.getBuiltInParserComponent().I().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ i1(ParsingEnvironment parsingEnvironment, i1 i1Var, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : i1Var, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i1(ParsingEnvironment parsingEnvironment, i1 i1Var, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
