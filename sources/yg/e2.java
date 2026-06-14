package yg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e2 {
    public static final void a(int i10, int i11, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.f(i13));
            }
            i12 >>>= 1;
        }
        throw new ug.d(arrayList, descriptor.h());
    }
}
