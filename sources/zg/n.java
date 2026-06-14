package zg;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f119448a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119449b;

    protected final void a(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.f119449b + array.length < i.f119430a) {
                    this.f119449b += array.length;
                    this.f119448a.addLast(array);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final char[] b(int i10) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f119448a.removeLastOrNull();
            if (cArr != null) {
                this.f119449b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i10] : cArr;
    }
}
