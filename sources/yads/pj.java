package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114688a;

    public pj(int i10) {
        this.f114688a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f114688a);
    }
}
