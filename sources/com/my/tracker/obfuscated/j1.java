package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import hh.z;

/* JADX INFO: loaded from: classes11.dex */
public final class j1 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f61595a;

    j1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f61595a = okHttpClientProvider;
    }

    @Override // com.my.tracker.obfuscated.s0
    public s0.b a(String str) {
        Throwable th2;
        hh.b0 b0VarExecute;
        s0.b bVarD = s0.b.d();
        try {
            x2.a("OkHttpGetRequest: send request to " + str);
            b0VarExecute = this.f61595a.getOkHttpClient().a(new z.a().n(str).d().b()).execute();
            try {
                int iQ = b0VarExecute.q();
                if (iQ == 200) {
                    x2.a("OkHttpGetRequest: response successfully received");
                    bVarD.f61818a = true;
                } else {
                    x2.a("OkHttpGetRequest error: response code " + iQ);
                    bVarD.f61818a = false;
                }
                if (iQ == 200) {
                    x2.a("OkHttpGetRequest: processing server response");
                    hh.c0 c0VarM = b0VarExecute.m();
                    String strString = c0VarM != null ? c0VarM.string() : null;
                    if (TextUtils.isEmpty(strString)) {
                        x2.a("OkHttpGetRequest: response data is empty");
                    } else {
                        bVarD.f61819b = strString;
                    }
                }
                b0VarExecute.close();
                return bVarD;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    x2.a("OkHttpGetRequest error: error while sending data", th2);
                    bVarD.f61818a = false;
                    bVarD.f61820c = "OkHttpGetRequest error: error while sending data";
                    return bVarD;
                } finally {
                    if (b0VarExecute != null) {
                        b0VarExecute.close();
                    }
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            b0VarExecute = null;
        }
    }
}
