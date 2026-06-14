package sg.bigo.ads.common.l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes4.dex */
final class a {
    @Nullable
    public static sg.bigo.ads.common.a a(@NonNull Context context) {
        try {
            int i10 = AdvertisingIdClient.f25284a;
            Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            Boolean bool = (Boolean) objInvoke.getClass().getMethod(C4240b4.j.M, null).invoke(objInvoke, null);
            String str = (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
            if (str != null && bool != null) {
                return new sg.bigo.ads.common.a(str, bool.booleanValue());
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
