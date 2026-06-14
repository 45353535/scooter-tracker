package net.pubnative.lite.sdk.vpaid.helpers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class EndCardFileDownloader {
    private static final String TAG = "EndCardFileDownloader";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static Bitmap mLoad(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? MStringToURL = mStringToURL(str);
        try {
            if (MStringToURL == 0) {
                return null;
            }
            try {
                httpURLConnection = (HttpURLConnection) MStringToURL.openConnection();
            } catch (IOException e10) {
                e = e10;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                MStringToURL = 0;
                if (MStringToURL != 0) {
                    MStringToURL.disconnect();
                }
                throw th;
            }
            try {
                httpURLConnection.connect();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream()));
                httpURLConnection.disconnect();
                return bitmapDecodeStream;
            } catch (IOException e11) {
                e = e11;
                Logger.e(TAG, e.getMessage());
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static URL mStringToURL(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            Logger.e(TAG, e10.getMessage());
            return null;
        }
    }
}
