package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f23863a;

    public d1(Looper looper, com.fyber.inneractive.sdk.network.f fVar) {
        super(looper);
        this.f23863a = new WeakReference(fVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strA;
        String string;
        super.handleMessage(message);
        e1 e1Var = (e1) v.a(this.f23863a);
        if (e1Var != null) {
            com.fyber.inneractive.sdk.network.f fVar = (com.fyber.inneractive.sdk.network.f) e1Var;
            int i10 = message.what;
            if (i10 == 12312329 || i10 == 20150330) {
                if (fVar.f21309f && fVar.f21304a.size() > 0) {
                    while (true) {
                        JSONObject jSONObject = null;
                        string = null;
                        if (fVar.f21304a.size() <= 0) {
                            break;
                        }
                        try {
                            jSONObject = (JSONObject) fVar.f21304a.poll();
                        } catch (Throwable unused) {
                        }
                        if (jSONObject != null) {
                            fVar.f21305b.put(jSONObject);
                        }
                    }
                    if (fVar.f21305b.length() > 0) {
                        JSONArray jSONArray = fVar.f21305b;
                        int i11 = com.fyber.inneractive.sdk.config.k.f20410a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (TextUtils.isEmpty(property)) {
                            strA = DtbConstants.HTTPS + IAConfigManager.O.f20303i.f20416f;
                        } else {
                            strA = com.fyber.inneractive.sdk.config.a.a(property, "Event");
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            string = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (string != null) {
                            IAConfigManager.O.f20313s.a(new com.fyber.inneractive.sdk.network.x0(new com.fyber.inneractive.sdk.network.e(strA, jSONArray, jCurrentTimeMillis), strA, string));
                        }
                        fVar.f21305b = new JSONArray();
                    }
                }
                d1 d1Var = fVar.f21307d;
                if (d1Var != null) {
                    d1Var.removeMessages(12312329);
                    long j10 = fVar.f21308e * 1000;
                    d1 d1Var2 = fVar.f21307d;
                    if (d1Var2 != null) {
                        d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j10));
                    }
                }
            }
        }
    }
}
