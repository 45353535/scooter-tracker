package p9;

import android.os.Bundle;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f98125d = o0.C0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f98126e = o0.C0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f98127f = o0.C0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98130c;

    public h(int i10, int i11, int i12) {
        this.f98128a = i10;
        this.f98129b = i11;
        this.f98130c = i12;
    }

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f98125d), bundle.getInt(f98126e), bundle.getInt(f98127f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f98125d, this.f98128a);
        bundle.putInt(f98126e, this.f98129b);
        bundle.putInt(f98127f, this.f98130c);
        return bundle;
    }
}
