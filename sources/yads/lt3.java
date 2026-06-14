package yads;

import android.os.Build;
import com.amazon.device.ads.DtbDeviceData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lt3 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        st3.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        st3.a(jSONObject, DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, Integer.toString(Build.VERSION.SDK_INT));
        st3.a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
