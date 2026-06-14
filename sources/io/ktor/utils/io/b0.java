package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {
    public static final Object a(c0 serializer, Object value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(value, "value");
        return new z(serializer, value);
    }
}
