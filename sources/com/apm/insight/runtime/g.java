package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8092a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8093b = -1;

    public static com.apm.insight.nativecrash.b a(Context context) {
        return new com.apm.insight.nativecrash.b(context, new ICommonParams() { // from class: com.apm.insight.runtime.g.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    public final boolean b() {
        return this.f8092a != null;
    }

    public final void a(String str) {
        this.f8092a = str;
        o.a().a(str);
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f8092a) && !"0".equals(this.f8092a)) {
            return this.f8092a;
        }
        String strD = com.apm.insight.e.a().d();
        this.f8092a = strD;
        if (!TextUtils.isEmpty(strD) && !"0".equals(this.f8092a)) {
            return this.f8092a;
        }
        String strB = o.a().b();
        this.f8092a = strB;
        return strB;
    }
}
