package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xk extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f117840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv0 f117841d;

    public xk(int i10, int i11, int i12, int i13, yv0 yv0Var, boolean z10, RuntimeException runtimeException) {
        StringBuilder sb2 = new StringBuilder("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(")");
        sb2.append(z10 ? " (recoverable)" : "");
        super(sb2.toString(), runtimeException);
        this.f117839b = i10;
        this.f117840c = z10;
        this.f117841d = yv0Var;
    }
}
