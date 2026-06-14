package yg;

import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f119095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f119096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f119097c;

    public x1(final String serialName, Object objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f119095a = objectInstance;
        this.f119096b = CollectionsKt.emptyList();
        this.f119097c = lf.i.b(lf.l.f94210c, new Function0() { // from class: yg.v1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x1.c(serialName, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor c(String str, final x1 x1Var) {
        return wg.k.d(str, m.d.f108011a, new SerialDescriptor[0], new Function1() { // from class: yg.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x1.d(this.f119091b, (wg.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(x1 x1Var, wg.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(x1Var.f119096b);
        return Unit.f93236a;
    }

    @Override // ug.c
    public Object deserialize(Decoder decoder) {
        int iX;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        xg.d dVarB = decoder.b(descriptor);
        if (dVarB.j() || (iX = dVarB.x(getDescriptor())) == -1) {
            Unit unit = Unit.f93236a;
            dVarB.c(descriptor);
            return this.f119095a;
        }
        throw new ug.m("Unexpected index " + iX);
    }

    @Override // kotlinx.serialization.KSerializer, ug.n, ug.c
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f119097c.getValue();
    }

    @Override // ug.n
    public void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
