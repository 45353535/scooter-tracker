package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5727m extends AbstractC5705h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f85306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f85307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5727m(AbstractC5667a abstractC5667a, InterfaceC5725l2 interfaceC5725l2, int i10) {
        super(interfaceC5725l2);
        this.f85306b = i10;
        this.f85307c = abstractC5667a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5727m(InterfaceC5725l2 interfaceC5725l2) {
        super(interfaceC5725l2);
        this.f85306b = 0;
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public void k() {
        switch (this.f85306b) {
            case 0:
                this.f85307c = null;
                this.f85274a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC5705h2, j$.util.stream.InterfaceC5725l2
    public void l(long j10) {
        switch (this.f85306b) {
            case 0:
                this.f85307c = new HashSet();
                this.f85274a.l(-1L);
                break;
            case 1:
            default:
                super.l(j10);
                break;
            case 2:
                this.f85274a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f85306b) {
            case 0:
                if (!((HashSet) this.f85307c).contains(obj)) {
                    ((HashSet) this.f85307c).add(obj);
                    this.f85274a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C5747q) this.f85307c).f85337n).accept(obj);
                this.f85274a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C5747q) this.f85307c).f85337n).test(obj)) {
                    this.f85274a.accept(obj);
                }
                break;
            case 3:
                this.f85274a.accept(((Function) ((C5747q) this.f85307c).f85337n).apply(obj));
                break;
            case 4:
                this.f85274a.accept(((ToIntFunction) ((U) this.f85307c).f85145m).applyAsInt(obj));
                break;
            case 5:
                this.f85274a.accept(((ToLongFunction) ((C5693f0) this.f85307c).f85260n).applyAsLong(obj));
                break;
            default:
                this.f85274a.accept(((ToDoubleFunction) ((C5771v) this.f85307c).f85373n).applyAsDouble(obj));
                break;
        }
    }
}
