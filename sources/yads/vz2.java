package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vz2 implements er1 {
    @Override // yads.er1
    public /* synthetic */ yv0 a() {
        return i6.a(this);
    }

    @Override // yads.er1
    public /* synthetic */ byte[] b() {
        return i6.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }

    @Override // yads.er1
    public /* synthetic */ void a(uk1 uk1Var) {
        i6.b(this, uk1Var);
    }
}
