package yg;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wg.l;
import wg.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends i2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wg.l f118970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f118971n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(final String name, final int i10) {
        super(name, null, i10, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f118970m = l.b.f108007a;
        this.f118971n = lf.i.a(new Function0() { // from class: yg.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.y(i10, name, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] y(int i10, String str, g0 g0Var) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            serialDescriptorArr[i11] = wg.k.e(str + '.' + g0Var.f(i11), m.d.f108011a, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    private final SerialDescriptor[] z() {
        return (SerialDescriptor[]) this.f118971n.getValue();
    }

    @Override // yg.i2, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i10) {
        return z()[i10];
    }

    @Override // yg.i2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == l.b.f108007a && Intrinsics.areEqual(h(), serialDescriptor.h()) && Intrinsics.areEqual(d2.a(this), d2.a(serialDescriptor));
    }

    @Override // yg.i2, kotlinx.serialization.descriptors.SerialDescriptor
    public wg.l getKind() {
        return this.f118970m;
    }

    @Override // yg.i2
    public int hashCode() {
        int iHashCode = h().hashCode();
        int iHashCode2 = 1;
        for (String str : wg.i.b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // yg.i2
    public String toString() {
        return CollectionsKt.joinToString$default(wg.i.b(this), ", ", h() + '(', ")", 0, null, null, 56, null);
    }
}
