package sg.bigo.ads.common.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerLib;
import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f102290a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f102291b = true;

    @NonNull
    public static String a(@NonNull Context context) {
        if (!TextUtils.isEmpty(f102290a) || !f102291b) {
            return f102290a;
        }
        try {
            Object objInvoke = AppsFlyerLib.class.getMethod("getAppsFlyerUID", Context.class).invoke(AppsFlyerLib.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), context);
            if (objInvoke instanceof String) {
                f102290a = (String) objInvoke;
            }
        } catch (Exception unused) {
            f102291b = false;
        }
        return f102290a;
    }
}
