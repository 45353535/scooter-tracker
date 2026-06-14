package com.mbridge.msdk.config.component.pipeline.util;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            q0.b("PipelineUtil", "Pipeline convert delay time error, will use 0");
            return 0;
        }
    }

    public static String a() {
        int iLastIndexOf;
        Package r02 = com.mbridge.msdk.config.component.pipeline.a.class.getPackage();
        if (r02 != null) {
            String name = r02.getName();
            if (!TextUtils.isEmpty(name) && (iLastIndexOf = name.lastIndexOf(".")) != 0) {
                String strSubstring = name.substring(0, iLastIndexOf);
                return !TextUtils.isEmpty(strSubstring) ? strSubstring : "com.mbridge.msdk.config.component";
            }
            return "com.mbridge.msdk.config.component";
        }
        return "com.mbridge.msdk.config.component";
    }
}
