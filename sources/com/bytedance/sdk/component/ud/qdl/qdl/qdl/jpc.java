package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.component.ud.qdl.bjy;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends rdp {
    public static int qdl = -1;
    fs lnr;
    int mml;
    String mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    HttpURLConnection f16695ud;

    public jpc(HttpURLConnection httpURLConnection, fs fsVar) {
        this.mml = qdl;
        this.f16695ud = httpURLConnection;
        this.lnr = fsVar;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            mo().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public com.bytedance.sdk.component.ud.qdl.to jpc() {
        if (tvp() == null || tvp().f16690ud == null) {
            return null;
        }
        return new com.bytedance.sdk.component.ud.qdl.to(tvp().f16690ud);
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public int lnr() {
        try {
            return this.f16695ud.getResponseCode();
        } catch (Exception unused) {
            return this.mml;
        }
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public boolean mml() {
        return lnr() >= 200 && lnr() < 300;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public bjy mo() {
        tvp tvpVar;
        com.bytedance.sdk.component.lnr.qdl.qdl qdlVar;
        com.bytedance.sdk.component.lnr.qdl.qdl qdlVar2;
        fs fsVar = this.lnr;
        if (fsVar != null && (qdlVar2 = fsVar.f16690ud) != null) {
            qdlVar2.rq();
        }
        try {
            try {
                tvpVar = new tvp(this.f16695ud);
            } catch (Throwable th2) {
                th2.getMessage();
                tvpVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.f16695ud;
            tvpVar = new tvp(httpURLConnection, httpURLConnection.getErrorStream());
        }
        fs fsVar2 = this.lnr;
        if (fsVar2 != null && (qdlVar = fsVar2.f16690ud) != null) {
            qdlVar.exu();
        }
        return tvpVar;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public String mzz() throws IOException {
        return !TextUtils.isEmpty(this.mzz) ? this.mzz : this.f16695ud.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public long qdl() {
        return 0L;
    }

    public String toString() {
        return "";
    }

    public fs tvp() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public long ud() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.rdp
    public com.bytedance.sdk.component.ud.qdl.mo wd() {
        if (this.f16695ud == null) {
            return new com.bytedance.sdk.component.ud.qdl.mo(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f16695ud.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(entry.getKey()) || lnr() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.ud.qdl.mo((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public jpc(int i10, String str, fs fsVar) {
        this.mzz = str;
        this.lnr = fsVar;
        this.mml = i10;
    }
}
