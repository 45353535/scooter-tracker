package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g11 implements er1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111025b;

    public g11(String str) {
        this.f111025b = str;
    }

    @Override // yads.er1
    public /* synthetic */ yv0 a() {
        return i6.a(this);
    }

    @Override // yads.er1
    public /* synthetic */ byte[] b() {
        return i6.c(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f111025b;
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }
}
