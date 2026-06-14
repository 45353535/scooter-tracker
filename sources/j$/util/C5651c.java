package j$.util;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5651c implements java.util.Comparator, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84826b;

    public /* synthetic */ C5651c(int i10, Object obj) {
        this.f84825a = i10;
        this.f84826b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f84825a) {
            case 0:
                ToIntFunction toIntFunction = (ToIntFunction) this.f84826b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f84826b;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 2:
                Function function = (Function) this.f84826b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.f84826b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
