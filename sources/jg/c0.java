package jg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static final b0 b(Object obj) {
        if (obj == b.f85862a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (b0) obj;
    }

    public static final boolean c(Object obj) {
        return obj == b.f85862a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
