package p9;

import android.os.Bundle;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f98121c = o0.C0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f98122d = o0.C0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98124b;

    public f(String str, int i10) {
        this.f98123a = str;
        this.f98124b = i10;
    }

    public static f a(Bundle bundle) {
        return new f((String) q9.a.e(bundle.getString(f98121c)), bundle.getInt(f98122d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f98121c, this.f98123a);
        bundle.putInt(f98122d, this.f98124b);
        return bundle;
    }
}
