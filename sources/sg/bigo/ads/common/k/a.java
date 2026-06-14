package sg.bigo.ads.common.k;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    @NonNull
    @WorkerThread
    public static sg.bigo.ads.common.a a(@NonNull Context context) {
        String string = "";
        boolean z10 = true;
        if ("Amazon".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) == 0) {
                    z10 = false;
                }
                string = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return new sg.bigo.ads.common.a(string, z10);
    }
}
