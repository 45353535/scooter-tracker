package jd;

import ic.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ud.b {
    private final void c(Object obj, Function0 function0) {
        if (v.j()) {
            if (obj != null) {
                v.g(obj, (String) function0.invoke(), new Object[0]);
            } else {
                v.h((String) function0.invoke(), new Object[0]);
            }
        }
    }

    @Override // ud.b
    public void a(Object obj, Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        c(obj, messageBuilder);
    }

    @Override // ud.b
    public void b(Object obj, Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        c(obj, messageBuilder);
    }
}
