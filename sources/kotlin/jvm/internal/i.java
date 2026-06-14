package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final Iterator a(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new h(array);
    }
}
