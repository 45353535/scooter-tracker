package ah;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import lf.m;
import ug.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f4276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f4277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f4278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f4274a = class2ContextualFactory;
        this.f4275b = polyBase2Serializers;
        this.f4276c = polyBase2DefaultSerializerProvider;
        this.f4277d = polyBase2NamedSerializers;
        this.f4278e = polyBase2DefaultDeserializerProvider;
        this.f4279f = z10;
    }

    @Override // ah.b
    public void a(d collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Iterator it = this.f4274a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            androidx.privacysandbox.ads.adservices.topics.a.a(entry.getValue());
            throw new m();
        }
        for (Map.Entry entry2 : this.f4275b.entrySet()) {
            KClass kClass = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass2 = (KClass) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                Intrinsics.checkNotNull(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.c(kClass, kClass2, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.f4276c.entrySet()) {
            KClass kClass3 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.checkNotNull(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.b(kClass3, (Function1) b1.g(function1, 1));
        }
        for (Map.Entry entry5 : this.f4278e.entrySet()) {
            KClass kClass4 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.checkNotNull(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.a(kClass4, (Function1) b1.g(function12, 1));
        }
    }

    @Override // ah.b
    public KSerializer b(KClass kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        androidx.privacysandbox.ads.adservices.topics.a.a(this.f4274a.get(kClass));
        return null;
    }

    @Override // ah.b
    public boolean d() {
        return this.f4279f;
    }

    @Override // ah.b
    public ug.c e(KClass baseClass, String str) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) this.f4277d.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f4278e.get(baseClass);
        Function1 function1 = b1.o(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (ug.c) function1.invoke(str);
        }
        return null;
    }

    @Override // ah.b
    public n f(KClass baseClass, Object value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map map = (Map) this.f4275b.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(v0.b(value.getClass())) : null;
        KSerializer kSerializer2 = kSerializer instanceof n ? kSerializer : null;
        if (kSerializer2 != null) {
            return kSerializer2;
        }
        Object obj = this.f4276c.get(baseClass);
        Function1 function1 = b1.o(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (n) function1.invoke(value);
        }
        return null;
    }
}
