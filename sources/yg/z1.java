package yg;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 extends a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SerialDescriptor f119109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(final KSerializer keySerializer, final KSerializer valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f119109c = wg.k.c("kotlin.Pair", new SerialDescriptor[0], new Function1() { // from class: yg.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z1.g(keySerializer, valueSerializer, (wg.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(KSerializer kSerializer, KSerializer kSerializer2, wg.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        wg.a.b(buildClassSerialDescriptor, "first", kSerializer.getDescriptor(), null, false, 12, null);
        wg.a.b(buildClassSerialDescriptor, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        return Unit.f93236a;
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return this.f119109c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object a(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object c(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Pair e(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }
}
