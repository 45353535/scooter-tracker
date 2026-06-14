package f1;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f69531a;

    public ce(SharedPreferences sharedPrefs) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.f69531a = sharedPrefs;
    }

    public final String a(String sharedPrefsKey) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            return this.f69531a.getString(sharedPrefsKey, null);
        } catch (Exception e10) {
            eg.i("Load from shared prefs exception", e10);
            return null;
        }
    }

    public final void b(String sharedPrefsKey, String str) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            this.f69531a.edit().putString(sharedPrefsKey, str).apply();
        } catch (Exception e10) {
            eg.i("Save to shared prefs exception", e10);
        }
    }
}
