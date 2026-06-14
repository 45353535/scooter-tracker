package zg;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yg.e0 f119424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f119425b;

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function2 {
        a(Object obj) {
            super(2, obj, f0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean a(SerialDescriptor p02, int i10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(((f0) this.receiver).e(p02, i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((SerialDescriptor) obj, ((Number) obj2).intValue());
        }
    }

    public f0(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f119424a = new yg.e0(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = !serialDescriptor.i(i10) && serialDescriptor.d(i10).b();
        this.f119425b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f119425b;
    }

    public final void c(int i10) {
        this.f119424a.a(i10);
    }

    public final int d() {
        return this.f119424a.d();
    }
}
