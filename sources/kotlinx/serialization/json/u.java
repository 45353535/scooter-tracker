package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import zg.o0;

/* JADX INFO: loaded from: classes3.dex */
final class u extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g configuration, ah.b module) {
        super(configuration, module, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        g();
    }

    private final void g() {
        if (Intrinsics.areEqual(a(), ah.c.a())) {
            return;
        }
        a().a(new o0(e()));
    }
}
