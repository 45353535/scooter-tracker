package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class rk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rk f115468e = new rk(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115472d;

    public rk(int i10, int i11, int i12) {
        this.f115469a = i10;
        this.f115470b = i11;
        this.f115471c = i12;
        this.f115472d = w83.e(i12) ? w83.b(i12, i11) : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f115469a + ", channelCount=" + this.f115470b + ", encoding=" + this.f115471c + ']';
    }
}
