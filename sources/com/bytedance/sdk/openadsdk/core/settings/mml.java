package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private static String lnr = null;
    private static volatile int mml = 0;
    private static volatile String qdl = "";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static volatile String f17470ud = "";

    public static String lnr() {
        if (mml != 0) {
            return f17470ud;
        }
        qdl();
        return f17470ud;
    }

    public static String mml() {
        if (TextUtils.isEmpty(lnr)) {
            lnr = yt.qdl().getPackageManager().getInstallerPackageName(gy.mo());
        }
        if (lnr == null) {
            lnr = "";
        }
        return lnr;
    }

    public static String ud() {
        if (mml != 0) {
            return qdl;
        }
        qdl();
        return qdl;
    }

    public static void qdl() {
        try {
            AppSet.getClient(yt.qdl()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = mml.qdl = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = mml.f17470ud = appSetIdInfo.getId();
                    int unused3 = mml.mml = 1;
                }
            });
        } catch (Throwable unused) {
            mml = 2;
        }
    }
}
