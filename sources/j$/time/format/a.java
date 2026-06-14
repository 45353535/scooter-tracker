package j$.time.format;

import j$.time.ZoneOffset;
import j$.time.w;
import j$.util.A;
import j$.util.C5800x;
import j$.util.C5801y;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function, IntFunction, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84614a;

    public /* synthetic */ a(int i10) {
        this.f84614a = i10;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f84614a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo7820andThen(Function function) {
        switch (this.f84614a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        return Double.valueOf(d10);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.f84614a) {
            default:
                Set set = Collectors.f85010a;
            case 8:
                return obj;
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d10, double d11) {
        switch (this.f84614a) {
            case 18:
                return Math.min(d10, d11);
            default:
                return Math.max(d10, d11);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.f84614a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f84614a) {
            case 10:
                return new C5800x();
            case 11:
                return new C5801y();
            case 12:
                return new A();
            case 14:
                return new LinkedHashSet();
            case 19:
                return new double[4];
            default:
                return new double[3];
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d10) {
        switch (this.f84614a) {
            case 20:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d10);
                dArr[3] = dArr[3] + d10;
                break;
            case 21:
            default:
                double[] dArr2 = (double[]) obj;
                Collectors.a(dArr2, d10);
                dArr2[2] = dArr2[2] + d10;
                break;
            case 22:
                ((C5800x) obj).accept(d10);
                break;
        }
    }

    public Object a(j$.time.temporal.n nVar) {
        switch (this.f84614a) {
            case 0:
                w wVar = (w) nVar.p(j$.time.temporal.r.f84716a);
                if (wVar == null || (wVar instanceof ZoneOffset)) {
                    return null;
                }
                return wVar;
            case 1:
                return (w) nVar.p(j$.time.temporal.r.f84716a);
            case 2:
                return (j$.time.chrono.m) nVar.p(j$.time.temporal.r.f84717b);
            case 3:
                return (j$.time.temporal.s) nVar.p(j$.time.temporal.r.f84718c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (nVar.f(aVar)) {
                    return ZoneOffset.I(nVar.k(aVar));
                }
                return null;
            case 5:
                w wVar2 = (w) nVar.p(j$.time.temporal.r.f84716a);
                return wVar2 != null ? wVar2 : (w) nVar.p(j$.time.temporal.r.f84719d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (nVar.f(aVar2)) {
                    return j$.time.g.L(nVar.t(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (nVar.f(aVar3)) {
                    return j$.time.j.G(nVar.t(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f84614a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f84614a) {
            case 15:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 16:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 17:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 18:
            case 19:
            case 20:
            default:
                ((C5800x) obj).b((C5800x) obj2);
                break;
            case 21:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f84614a) {
            case 9:
                return new Object[i10];
            default:
                return new Double[i10];
        }
    }
}
