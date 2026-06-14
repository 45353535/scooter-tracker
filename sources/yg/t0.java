package yg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends i2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f119073m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(String name, o0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f119073m = true;
    }

    @Override // yg.i2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(h(), serialDescriptor.h())) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (!t0Var.isInline() || !Arrays.equals(s(), t0Var.s()) || e() != serialDescriptor.e()) {
            return false;
        }
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            if (!Intrinsics.areEqual(d(i10).h(), serialDescriptor.d(i10).h()) || !Intrinsics.areEqual(d(i10).getKind(), serialDescriptor.d(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // yg.i2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // yg.i2, kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f119073m;
    }
}
