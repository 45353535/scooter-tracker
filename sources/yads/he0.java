package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class he0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111561c;

    public he0(yv0 yv0Var, int i10) {
        this.f111560b = (yv0Var.f118390e & 1) != 0;
        this.f111561c = re0.a(false, i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        he0 he0Var = (he0) obj;
        return ox.a(cq.a(this.f111561c, he0Var.f111561c)).a(this.f111560b, he0Var.f111560b).a();
    }
}
