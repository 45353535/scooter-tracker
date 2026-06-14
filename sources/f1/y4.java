package f1;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y4 {
    public static boolean a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Invalid activity context passed during intitalization");
            }
            int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
            boolean z10 = context.checkSelfPermission("android.permission.INTERNET") != 0;
            boolean z11 = iCheckSelfPermission != 0;
            if (z10) {
                throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
            }
            if (z11) {
                throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean b(AtomicReference atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new ga(jSONObject));
            return true;
        } catch (Exception e10) {
            eg.i("updateConfig: " + e10, null);
            return false;
        }
    }
}
