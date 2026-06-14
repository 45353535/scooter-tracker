package com.bytedance.sdk.component.mo.qdl.ud.ud;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.qdl.qdl.mo;
import com.bytedance.sdk.component.mo.qdl.qdl.qdl.wd;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static ContentResolver lnr() {
        try {
            if (jpc.wd().mo() != null) {
                return jpc.wd().mo().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String mml() {
        return wd.f16548ud + "/ad_log_event/";
    }

    public static void qdl() {
        if (jpc.wd().mo() == null) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void ud() {
        if (jpc.wd().mo() == null) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "adLogDispatch?event=" + mo.qdl(qdlVar.mo())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void qdl(String str, List<String> list, boolean z10) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(mo.qdl(it.next()));
                sb2.append(StringUtils.COMMA);
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(mo.qdl(sb2.toString())) + "&replace=" + String.valueOf(z10);
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverLnr = lnr();
            if (contentResolverLnr != null) {
                contentResolverLnr.getType(Uri.parse(mml() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
