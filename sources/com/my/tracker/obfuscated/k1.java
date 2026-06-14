package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import hh.z;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 extends s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final hh.w f61619d = hh.w.f("application/octet-stream");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s0.a f61620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MyTrackerConfig.OkHttpClientProvider f61621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f61622c;

    k1(s0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z10) {
        this.f61620a = aVar;
        this.f61621b = okHttpClientProvider;
        this.f61622c = z10;
    }

    @Override // com.my.tracker.obfuscated.s0
    public s0.b a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        s0.b bVarD = s0.b.d();
        hh.b0 b0Var = null;
        try {
            x2.a("OkHttpPostRequest: send request to " + str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (this.f61622c) {
                        x2.a("OkHttpPostRequest: populating post request body using gzip");
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            this.f61620a.a(gZIPOutputStream);
                            gZIPOutputStream.finish();
                        } catch (Throwable th2) {
                            th = th2;
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        x2.a("OkHttpPostRequest: populating post request body without using gzip");
                        this.f61620a.a(byteArrayOutputStream);
                        byteArrayOutputStream.flush();
                        gZIPOutputStream = null;
                    }
                    hh.z zVarB = new z.a().n(str).f("Content-Encoding", "gzip").i(hh.a0.create(byteArrayOutputStream.toByteArray(), f61619d)).b();
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    byteArrayOutputStream.close();
                    hh.b0 b0VarExecute = this.f61621b.getOkHttpClient().a(zVarB).execute();
                    try {
                        int iQ = b0VarExecute.q();
                        if (iQ == 200 || iQ == 204) {
                            x2.a("OkHttpPostRequest: response successfully received");
                            bVarD.f61818a = true;
                        } else {
                            x2.a("OkHttpPostRequest error: response code " + iQ);
                            bVarD.f61818a = false;
                        }
                        if (iQ == 200) {
                            x2.a("OkHttpPostRequest: processing server response");
                            hh.c0 c0VarM = b0VarExecute.m();
                            String strString = c0VarM != null ? c0VarM.string() : null;
                            if (TextUtils.isEmpty(strString)) {
                                x2.a("OkHttpPostRequest: response data is empty");
                            } else {
                                bVarD.f61819b = strString;
                            }
                        }
                        b0VarExecute.close();
                        return bVarD;
                    } catch (Throwable th3) {
                        b0Var = b0VarExecute;
                        th = th3;
                        try {
                            x2.a("OkHttpPostRequest error: error while sending data", th);
                            bVarD.f61818a = false;
                            bVarD.f61820c = "OkHttpPostRequest error: error while sending data";
                            return bVarD;
                        } finally {
                            if (b0Var != null) {
                                b0Var.close();
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
