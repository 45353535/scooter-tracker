package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ul3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ql3 f116710c;

    public ul3(int i10, ql3 ql3Var) {
        this.f116709b = i10;
        this.f116710c = ql3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f116709b, ((ul3) obj).f116709b);
    }
}
