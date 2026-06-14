package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class y63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f118107e;

    public y63(int i10, int i11, int i12) {
        String str;
        if (i10 != Integer.MIN_VALUE) {
            str = i10 + "/";
        } else {
            str = "";
        }
        this.f118103a = str;
        this.f118104b = i11;
        this.f118105c = i12;
        this.f118106d = Integer.MIN_VALUE;
        this.f118107e = "";
    }

    public final void a() {
        int i10 = this.f118106d;
        this.f118106d = i10 == Integer.MIN_VALUE ? this.f118104b : i10 + this.f118105c;
        this.f118107e = this.f118103a + this.f118106d;
    }

    public final void b() {
        if (this.f118106d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
