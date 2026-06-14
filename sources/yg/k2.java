package yg;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k2 {
    public static final int b(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.h().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableA = wg.i.a(serialDescriptor);
        Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strH = ((SerialDescriptor) it.next()).h();
            if (strH != null) {
                iHashCode3 = strH.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            wg.l kind = ((SerialDescriptor) it2.next()).getKind();
            iHashCode2 = i12 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }

    public static final String c(final SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return CollectionsKt.joinToString$default(kotlin.ranges.g.v(0, serialDescriptor.e()), ", ", serialDescriptor.h() + '(', ")", 0, null, new Function1() { // from class: yg.j2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.d(serialDescriptor, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(SerialDescriptor serialDescriptor, int i10) {
        return serialDescriptor.f(i10) + ": " + serialDescriptor.d(i10).h();
    }
}
