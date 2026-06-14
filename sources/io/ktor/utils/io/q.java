package io.ktor.utils.io;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static final k a(k kVar, Function1 onClose) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        return new p(kVar, onClose);
    }
}
