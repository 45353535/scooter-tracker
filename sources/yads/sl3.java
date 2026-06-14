package yads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class sl3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f115868c = new Comparator() { // from class: yads.fq0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((sl3) obj).f115869a.f116293b, ((sl3) obj2).f115869a.f116293b);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl3 f115869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115870b;

    public sl3(tl3 tl3Var, int i10) {
        this.f115869a = tl3Var;
        this.f115870b = i10;
    }
}
