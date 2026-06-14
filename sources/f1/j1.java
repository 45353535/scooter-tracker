package f1;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f70143a;

    public j1(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f70143a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f70143a.getString(com.taurusx.tax.g.q.f66282l, null);
    }

    public final String b() {
        return this.f70143a.getString("IABGPP_HDR_GppString", null);
    }
}
