package j$.util.stream;

import j$.util.C5801y;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements Predicate, Supplier, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85012a;

    public /* synthetic */ D(int i10) {
        this.f85012a = i10;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f85012a) {
        }
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f85012a) {
            case 14:
                break;
            case 19:
                break;
            case 23:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        return Long.valueOf(j10);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i10, int i11) {
        switch (this.f85012a) {
            case 12:
                return Math.min(i10, i11);
            case 15:
                return i10 + i11;
            default:
                return Math.max(i10, i11);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j10, long j11) {
        switch (this.f85012a) {
            case 21:
                return Math.min(j10, j11);
            default:
                return Math.max(j10, j11);
        }
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f85012a) {
        }
        return j$.com.android.tools.r8.a.m(this, predicate);
    }

    public Predicate negate() {
        switch (this.f85012a) {
        }
        return new j$.time.format.r(3, this);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f85012a) {
            case 0:
                return ((j$.util.B) obj).f84773a;
            case 1:
            case 3:
            default:
                return ((Optional) obj).isPresent();
            case 2:
                return ((j$.util.C) obj).f84781a;
            case 4:
                return ((j$.util.D) obj).f84784a;
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f85012a) {
            case 1:
                return new E();
            case 3:
                return new F();
            case 5:
                return new G();
            case 7:
                return new H();
            case 17:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j10) {
        switch (this.f85012a) {
            case 20:
                ((j$.util.A) obj).accept(j10);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j10;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f85012a) {
            case 14:
                ((C5801y) obj).b((C5801y) obj2);
                break;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 23:
                ((j$.util.A) obj).b((j$.util.A) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i10) {
        switch (this.f85012a) {
            case 13:
                ((C5801y) obj).accept(i10);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i10);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f85012a) {
            case 8:
                return new Object[i10];
            case 9:
                return new Integer[i10];
            case 10:
            default:
                return new Long[i10];
            case 11:
                return Integer.valueOf(i10);
        }
    }
}
