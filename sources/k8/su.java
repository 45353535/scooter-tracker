package k8;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ru;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class su implements JSONSerializable, JsonTemplate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f91189f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f91190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f91191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f91192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final xc f91193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f91194k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f91195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f91196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f91197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f91198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f91199e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91200f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final su invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new su(parsingEnvironment, null, false, jSONObject, 6, null);
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
        f91190g = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        f91191h = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f91192i = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f91193j = new xc(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        f91194k = a.f91200f;
    }

    public su(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.f91195a = field;
        this.f91196b = field2;
        this.f91197c = field3;
        this.f91198d = field4;
        this.f91199e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ru.c) BuiltInParserKt.getBuiltInParserComponent().H8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ su(ParsingEnvironment parsingEnvironment, su suVar, boolean z10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : suVar, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public su(ParsingEnvironment parsingEnvironment, su suVar, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.INSTANCE;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
