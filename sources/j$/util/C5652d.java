package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5652d implements java.util.Comparator, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f84905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84906c;

    public /* synthetic */ C5652d(java.util.Comparator comparator, Object obj, int i10) {
        this.f84904a = i10;
        this.f84905b = comparator;
        this.f84906c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f84904a) {
            case 0:
                int iCompare = this.f84905b.compare(obj, obj2);
                return iCompare != 0 ? iCompare : ((java.util.Comparator) this.f84906c).compare(obj, obj2);
            default:
                Function function = (Function) this.f84906c;
                return this.f84905b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
