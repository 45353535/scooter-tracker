package yads;

import android.os.Build;
import io.bidmachine.ads.networks.nast.NastAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x23 implements s83 {
    public final String a() {
        String property;
        String property2 = null;
        try {
            property = System.getProperty("http.agent");
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            property = null;
        }
        if (property != null && property.length() != 0) {
            return property;
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Dalvik/");
        try {
            property2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
            boolean z11 = lb1.f113032a;
        }
        if (property2 == null || property2.length() == 0) {
            property2 = "1.0.0";
        }
        sb2.append(property2);
        sb2.append(" (Linux; U; Android ");
        String str = Build.VERSION.RELEASE;
        if (str.length() == 0) {
            str = NastAdapter.ADAPTER_SDK_VERSION_NAME;
        }
        sb2.append(str);
        if (Intrinsics.areEqual("REL", Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                sb2.append("; ");
                sb2.append(str2);
            }
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            sb2.append(" Build/");
            sb2.append(str3);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
