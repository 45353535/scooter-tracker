package zg;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f119439a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119440b;

    protected final void a(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                if (this.f119440b + array.length < i.f119430a) {
                    this.f119440b += array.length / 2;
                    this.f119439a.addLast(array);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final byte[] b(int i10) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f119439a.removeLastOrNull();
            if (bArr != null) {
                this.f119440b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i10] : bArr;
    }
}
