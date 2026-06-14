package com.bytedance.sdk.openadsdk.core.fs.lnr;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class lnr {
    private static boolean mml;
    private static SimpleDateFormat qdl;

    @NonNull
    private final Map<ud, String> lnr;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    @NonNull
    private final List<String> f17208ud;

    public lnr(@NonNull List<String> list, ljh ljhVar) {
        int iVz;
        this.f17208ud = list;
        HashMap map = new HashMap();
        this.lnr = map;
        map.put(ud.CACHEBUSTING, lnr());
        map.put(ud.TIMESTAMP, ud());
        map.put(ud.APPBUNDLE, yt.qdl().getPackageName());
        ud udVar = ud.PLAYERSTATE;
        map.put(udVar, "");
        if (ljhVar != null && ((iVz = ljhVar.vz()) == 3 || iVz == 7 || iVz == 8)) {
            map.put(udVar, "fullscreen");
        }
        map.put(ud.SERVERSIDE, "0");
    }

    @NonNull
    private String lnr() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String ud() {
        if (qdl == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                qdl = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
            } else {
                qdl = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault());
                mml = true;
            }
        }
        String str = qdl.format(new Date());
        if (!mml) {
            return str;
        }
        int iUw = gy.uw();
        if (iUw < 0) {
            if (iUw <= -10) {
                return str + iUw;
            }
            return str + "-0" + (-iUw);
        }
        if (iUw < 10) {
            return str + "+0" + iUw;
        }
        return str + "+" + iUw;
    }

    @NonNull
    public List<String> qdl() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.f17208ud) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (ud udVar : ud.values()) {
                    String str = this.lnr.get(udVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = udVar == ud.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(udVar.name(), str) : strReplaceAll.replaceAll("\\[" + udVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    @NonNull
    public lnr qdl(@Nullable com.bytedance.sdk.openadsdk.core.fs.qdl.qdl qdlVar) {
        if (qdlVar != null) {
            this.lnr.put(ud.ERRORCODE, qdlVar.qdl());
        }
        return this;
    }

    @NonNull
    public lnr qdl(@Nullable long j10) {
        if (j10 >= 0) {
            String strUd = ud(j10);
            if (!TextUtils.isEmpty(strUd)) {
                this.lnr.put(ud.CONTENTPLAYHEAD, strUd);
            }
        }
        return this;
    }

    @NonNull
    public lnr ud(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.lnr.put(ud.ASSETURI, str);
        }
        return this;
    }

    public lnr qdl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.lnr.put(ud.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    @NonNull
    private String ud(long j10) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }
}
