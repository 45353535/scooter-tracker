package j$.util.function;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f84922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f84923c;

    public /* synthetic */ c(Function function, Function function2, int i10) {
        this.f84921a = i10;
        this.f84922b = function;
        this.f84923c = function2;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo7820andThen(Function function) {
        switch (this.f84921a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f84921a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f84921a) {
            case 0:
                return this.f84923c.apply(this.f84922b.apply(obj));
            default:
                return this.f84922b.apply(this.f84923c.apply(obj));
        }
    }
}
