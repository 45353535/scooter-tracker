package mf;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1 f94870b;

    public c(Function1 function1) {
        this.f94870b = function1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function1 function1 = this.f94870b;
        return e.d((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
    }
}
