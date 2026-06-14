package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class RunnableC4479p4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final JSONObject f44641a;

    public RunnableC4479p4(@NotNull JSONObject stringToSend) {
        Intrinsics.checkNotNullParameter(stringToSend, "stringToSend");
        this.f44641a = stringToSend;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection uRLConnectionOpenConnection = new URL(C4462o4.d().f44548h).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty("Accept", D5.L);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(this.f44641a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
            Log.i("MSG", httpURLConnection.getResponseMessage());
            httpURLConnection.disconnect();
            ironLog.verbose("sent crash report for type " + this.f44641a.get("crashType") + " and date " + this.f44641a.get("crashDate"));
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
