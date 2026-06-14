package de;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ud.b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.invoke();
    }

    @Override // ud.b
    public void a(Object obj, final Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        if (obj == null) {
            io.bidmachine.core.a.a(new ce.b() { // from class: de.d
                @Override // ce.b
                public final Object get() {
                    return h.g(messageBuilder);
                }
            });
        } else {
            io.bidmachine.core.a.b(obj, new ce.b() { // from class: de.e
                @Override // ce.b
                public final Object get() {
                    return h.h(messageBuilder);
                }
            });
        }
    }

    @Override // ud.b
    public void b(Object obj, final Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        if (obj == null) {
            io.bidmachine.core.a.k(new ce.b() { // from class: de.f
                @Override // ce.b
                public final Object get() {
                    return h.i(messageBuilder);
                }
            });
        } else {
            io.bidmachine.core.a.l(obj, new ce.b() { // from class: de.g
                @Override // ce.b
                public final Object get() {
                    return h.j(messageBuilder);
                }
            });
        }
    }
}
