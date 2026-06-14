package p9;

import android.os.Bundle;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f98131b = o0.C0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98132a;

    public i(String str) {
        this.f98132a = str;
    }

    public static i a(Bundle bundle) {
        return new i((String) q9.a.e(bundle.getString(f98131b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f98131b, this.f98132a);
        return bundle;
    }
}
