package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f84857k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k[] kVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(kVarArr, i10, i11, concurrentHashMap);
        this.f84857k = i12;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f84857k) {
            case 0:
                k kVar = this.f84872b;
                if (kVar == null) {
                    throw new NoSuchElementException();
                }
                this.f84852j = kVar;
                a();
                return kVar.f84864b;
            default:
                k kVar2 = this.f84872b;
                if (kVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = kVar2.f84865c;
                this.f84852j = kVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f84857k) {
        }
        return next();
    }
}
