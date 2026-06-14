package com.bytedance.sdk.openadsdk.mml;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class tvp {
    private final WebView jpc;
    private int mo;
    private final boolean mzz;
    private final ljh qdl;
    private long to;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17743wd;
    private String tvp = "landingpage";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Map<Integer, Long> f17742ud = new HashMap();
    private final List<Integer> lnr = new ArrayList();
    private final Map<Integer, String> mml = new HashMap();

    public tvp(ljh ljhVar, WebView webView, boolean z10) {
        this.qdl = ljhVar;
        this.jpc = webView;
        this.mzz = z10;
    }

    public void lnr(String str) {
        this.tvp = str;
    }

    public void qdl(String str, int i10) {
        if (this.mzz) {
            i10++;
        }
        if (qdl(true)) {
            lnr.qdl(this.qdl, this.tvp, this.mo, str, i10);
            this.mml.put(Integer.valueOf(this.mo), str);
            this.to = SystemClock.elapsedRealtime();
        }
    }

    public void ud(String str) {
        String str2 = this.mml.get(Integer.valueOf(this.mo));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i10 = this.mo;
        if (i10 > 0) {
            lnr.qdl(this.qdl, this.tvp, i10, str3, str, 1);
        }
    }

    private void ud(boolean z10) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.jpc.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z10) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.mo = currentIndex + 1;
                    if (this.mzz) {
                        this.mo = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.f17743wd = currentIndex2 + 1;
                if (this.mzz) {
                    this.f17743wd = currentIndex2 + 2;
                }
            }
        } catch (Throwable th2) {
            aaj.lnr("ArbitrageLandingLog", th2.toString());
        }
    }

    public void qdl(String str) {
        if (qdl(false)) {
            lnr.qdl(this.qdl, this.tvp, this.mo, str, SystemClock.elapsedRealtime() - this.to);
        }
    }

    public void qdl(WebView webView, String str) {
        ljh ljhVar = this.qdl;
        if (ljhVar == null || !com.bytedance.sdk.component.tvp.ud.qdl(ljhVar.jyq().lnr(), str)) {
            return;
        }
        String str2 = this.mml.get(Integer.valueOf(this.mo));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        lnr.qdl(this.qdl, this.tvp, this.mo, str2, str, 2);
    }

    private boolean qdl(boolean z10) {
        int i10 = z10 ? this.mo : this.f17743wd;
        ud(z10);
        int i11 = z10 ? this.mo : this.f17743wd;
        return i11 > 0 && i11 != i10;
    }
}
