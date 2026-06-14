package com.taurusx.tax.g.r0;

import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
@VisibleForTesting
public class o extends AsyncTask<String, Void, String> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66320w = 10;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final z f66321z;

    public interface z {
        void z(String str);

        void z(String str, Throwable th2);
    }

    public o(z zVar) {
        this.f66321z = zVar;
    }

    public static void z(String str, z zVar) {
        try {
            w.z(new o(zVar), str);
        } catch (Exception e10) {
            zVar.z("Failed to resolve url", e10);
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        this.f66321z.z("Task for resolving url was cancelled", null);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        if (isCancelled() || str == null) {
            onCancelled();
        } else {
            this.f66321z.z(str);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) throws Throwable {
        if (strArr != null && strArr.length != 0) {
            int i10 = 0;
            try {
                String strZ = strArr[0];
                String str = null;
                while (strZ != null && i10 < 10) {
                    if (!y.OPEN_IN_APP_BROWSER.shouldTryHandlingUrl(Uri.parse(strZ))) {
                        return strZ;
                    }
                    i10++;
                    str = strZ;
                    strZ = z(strZ);
                }
                return str;
            } catch (IOException | URISyntaxException unused) {
            }
        }
        return null;
    }

    private String z(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            String strZ = z(str, httpURLConnection);
            httpURLConnection.disconnect();
            return strZ;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    @VisibleForTesting
    public static String z(String str, HttpURLConnection httpURLConnection) throws URISyntaxException, IOException {
        URI uri = new URI(str);
        int responseCode = httpURLConnection.getResponseCode();
        String headerField = httpURLConnection.getHeaderField("Location");
        if (responseCode < 300 || responseCode >= 400) {
            return null;
        }
        try {
            return uri.resolve(headerField).toString();
        } catch (IllegalArgumentException unused) {
            throw new URISyntaxException(headerField, "Unable to parse invalid URL");
        }
    }
}
