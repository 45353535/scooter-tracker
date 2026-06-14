package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static d f53211h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f53212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f53213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f53214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f53215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f53216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f53217f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f53218g = "down_type";

    private d() {
        this.f53216e = false;
        try {
            this.f53214c = i.a();
            this.f53215d = f.a();
            this.f53212a = new CopyOnWriteArrayList<>();
            this.f53213b = new ConcurrentHashMap();
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null) {
                this.f53216e = gVarD.b(1);
            }
        } catch (Throwable th2) {
            q0.b("H5DownLoadManager", th2.getMessage(), th2);
        }
    }

    public static synchronized d a() {
        try {
            if (f53211h == null) {
                f53211h = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f53211h;
    }

    private String b(String str) {
        f fVar = this.f53215d;
        return fVar != null ? fVar.b(str) : str;
    }

    public String c(String str) {
        i iVar = this.f53214c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    public String a(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        return c(str);
                    }
                    return b(str);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str;
    }
}
