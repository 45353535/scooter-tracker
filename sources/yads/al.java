package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class al extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f108708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv0 f108709d;

    public al(int i10, yv0 yv0Var, boolean z10) {
        super(he2.a("AudioTrack write failed: ", i10));
        this.f108708c = z10;
        this.f108707b = i10;
        this.f108709d = yv0Var;
    }
}
