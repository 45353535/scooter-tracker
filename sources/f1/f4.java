package f1;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f69800a;

    public f4(SharedPreferences defaultSharedPreferences) {
        Intrinsics.checkNotNullParameter(defaultSharedPreferences, "defaultSharedPreferences");
        this.f69800a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f69800a.getString("IABTCF_TCString", null);
    }
}
