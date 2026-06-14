package zg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.l;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o1 {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, ah.b module) {
        SerialDescriptor serialDescriptorA;
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(serialDescriptor.getKind(), l.a.f108006a)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.d(0), module) : serialDescriptor;
        }
        SerialDescriptor serialDescriptorB = wg.b.b(module, serialDescriptor);
        return (serialDescriptorB == null || (serialDescriptorA = a(serialDescriptorB, module)) == null) ? serialDescriptor : serialDescriptorA;
    }

    public static final n1 b(kotlinx.serialization.json.b bVar, SerialDescriptor desc) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        wg.l kind = desc.getKind();
        if (kind instanceof wg.d) {
            return n1.f119454g;
        }
        if (Intrinsics.areEqual(kind, m.b.f108009a)) {
            return n1.f119452e;
        }
        if (!Intrinsics.areEqual(kind, m.c.f108010a)) {
            return n1.f119451d;
        }
        SerialDescriptor serialDescriptorA = a(desc.d(0), bVar.a());
        wg.l kind2 = serialDescriptorA.getKind();
        if ((kind2 instanceof wg.e) || Intrinsics.areEqual(kind2, l.b.f108007a)) {
            return n1.f119453f;
        }
        if (bVar.e().c()) {
            return n1.f119452e;
        }
        throw i0.d(serialDescriptorA);
    }
}
