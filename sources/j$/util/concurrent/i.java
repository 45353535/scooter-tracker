package j$.util.concurrent;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends o implements Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f84859j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k[] kVarArr, int i10, int i11, int i12, long j10, int i13) {
        super(kVarArr, i10, i11, i12);
        this.f84858i = i13;
        this.f84859j = j10;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f84858i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f84858i) {
        }
        return AbstractC5650b.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        switch (this.f84858i) {
        }
        return AbstractC5650b.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f84858i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f84858i) {
            case 0:
                int i10 = this.f84876f;
                int i11 = this.f84877g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                k[] kVarArr = this.f84871a;
                this.f84877g = i12;
                long j10 = this.f84859j >>> 1;
                this.f84859j = j10;
                return new i(kVarArr, this.f84878h, i12, i11, j10, 0);
            default:
                int i13 = this.f84876f;
                int i14 = this.f84877g;
                int i15 = (i13 + i14) >>> 1;
                if (i15 <= i13) {
                    return null;
                }
                k[] kVarArr2 = this.f84871a;
                this.f84877g = i15;
                long j11 = this.f84859j >>> 1;
                this.f84859j = j11;
                return new i(kVarArr2, this.f84878h, i15, i14, j11, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f84858i) {
            case 0:
                consumer.getClass();
                while (true) {
                    k kVarA = a();
                    if (kVarA != null) {
                        consumer.accept(kVarA.f84864b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    k kVarA2 = a();
                    if (kVarA2 != null) {
                        consumer.accept(kVarA2.f84865c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f84858i) {
            case 0:
                consumer.getClass();
                k kVarA = a();
                if (kVarA != null) {
                    consumer.accept(kVarA.f84864b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                k kVarA2 = a();
                if (kVarA2 != null) {
                    consumer.accept(kVarA2.f84865c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f84858i) {
        }
        return this.f84859j;
    }
}
