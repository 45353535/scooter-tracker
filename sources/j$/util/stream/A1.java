package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class A1 extends AbstractC5773v1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f84985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f84986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f84987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f84988k;

    public /* synthetic */ A1(EnumC5676b3 enumC5676b3, Object obj, Object obj2, Object obj3, int i10) {
        this.f84985h = i10;
        this.f84987j = obj;
        this.f84988k = obj2;
        this.f84986i = obj3;
    }

    @Override // j$.util.stream.AbstractC5773v1
    public final Q1 Q() {
        switch (this.f84985h) {
            case 0:
                return new C5783x1((Supplier) this.f84986i, (ObjLongConsumer) this.f84988k, (C5737o) this.f84987j);
            case 1:
                return new D1((Supplier) this.f84986i, (ObjDoubleConsumer) this.f84988k, (C5737o) this.f84987j);
            case 2:
                return new F1(this.f84986i, (BiFunction) this.f84988k, (BinaryOperator) this.f84987j);
            case 3:
                return new J1((Supplier) this.f84986i, (BiConsumer) this.f84988k, (BiConsumer) this.f84987j);
            default:
                return new N1((Supplier) this.f84986i, (ObjIntConsumer) this.f84988k, (C5737o) this.f84987j);
        }
    }
}
