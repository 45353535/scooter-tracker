package net.pubnative.lite.sdk.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class PNHttpClient {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final int MAX_RETRIES = 5;
    private static final int READ_TIMEOUT = 10000;
    private static final int RETRY_MULTIPLIER = 2;
    private static final String TAG = "PNHttpClient";
    private static final Handler sUiHandler = new Handler(Looper.getMainLooper());
    private static final Queue<PendingRequest> sPendingRequests = new ArrayDeque();
    private static final Queue<PendingRequest> sCurrentRequests = new ArrayDeque();

    public interface Listener {
        void onFailure(Throwable th2);

        void onFinally(String str, int i10);

        void onSuccess(String str, Map<String, List<String>> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Response {
        private Exception exception;
        private Map<String, List<String>> headers;
        private String response;
        private int responseCode;

        public Exception getException() {
            return this.exception;
        }

        public String getResponse() {
            return this.response;
        }

        public int getResponseCode() {
            return this.responseCode;
        }

        private Response() {
        }
    }

    public static /* synthetic */ void a(PendingRequest pendingRequest) {
        pendingRequest.countRetry();
        if (sendRequest(pendingRequest.getUrl(), pendingRequest.getHeaders(), pendingRequest.getPostBody()).exception == null || pendingRequest.isLimitReached() || TextUtils.isEmpty(pendingRequest.getUrl())) {
            return;
        }
        sPendingRequests.add(pendingRequest);
    }

    public static /* synthetic */ void b(Listener listener, Response response) {
        if (listener != null) {
            listener.onFailure(response.exception);
        }
    }

    public static /* synthetic */ void c(String str, Map map, String str2, boolean z10, boolean z11, final Listener listener, Context context) throws Throwable {
        String str3;
        final Response responseSendRequest = sendRequest(str, map, str2);
        if (responseSendRequest.exception != null) {
            if (!z10 || TextUtils.isEmpty(str)) {
                str3 = str;
            } else {
                str3 = str;
                sPendingRequests.add(new PendingRequest(str3, str2, map, 5, 2));
            }
            if (z11) {
                sUiHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.network.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        PNHttpClient.b(listener, responseSendRequest);
                    }
                });
            } else if (listener != null) {
                listener.onFailure(responseSendRequest.exception);
            }
        } else {
            str3 = str;
            if (z11) {
                sUiHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.network.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        PNHttpClient.d(listener, responseSendRequest);
                    }
                });
            } else if (listener != null) {
                listener.onSuccess(responseSendRequest.response, responseSendRequest.headers);
            }
        }
        if (listener != null) {
            listener.onFinally(str3, responseSendRequest.responseCode);
        }
        performPendingRequests(context);
    }

    public static /* synthetic */ void d(Listener listener, Response response) {
        if (listener != null) {
            listener.onSuccess(response.response, response.headers);
        }
    }

    private static NetworkInfo getActiveNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    private static String getStringFromStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private static boolean isHttpSuccess(int i10) {
        return i10 / 100 == 2;
    }

    public static synchronized void makePendingRequest(Context context, final PendingRequest pendingRequest) {
        if (pendingRequest != null) {
            if (!pendingRequest.shouldRetry()) {
                pendingRequest.countAttempt();
                sPendingRequests.add(pendingRequest);
                return;
            }
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0)) {
                try {
                    ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.network.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            PNHttpClient.a(pendingRequest);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    Logger.e(TAG, pendingRequest.getUrl(), e10);
                }
            }
        }
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, Listener listener) {
        makeRequest(context, str, map, str2, true, listener);
    }

    private static void performPendingRequests(Context context) {
        Queue<PendingRequest> queue = sCurrentRequests;
        if (queue.isEmpty()) {
            Queue<PendingRequest> queue2 = sPendingRequests;
            if (!queue2.isEmpty()) {
                queue.addAll(queue2);
                queue2.clear();
            }
        }
        if (queue.isEmpty()) {
            return;
        }
        Iterator<PendingRequest> it = queue.iterator();
        while (it.hasNext()) {
            makePendingRequest(context, it.next());
        }
        sCurrentRequests.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [net.pubnative.lite.sdk.network.f] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private static Response sendRequest(String str, Map<String, String> map, String str2) throws Throwable {
        ?? r22 = 0;
        r22 = 0;
        Response response = new Response();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestMethod("GET");
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        dataOutputStream.writeBytes(str2);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    response.responseCode = responseCode;
                    Log.d("Response Code: ", String.valueOf(response.getResponseCode()));
                    if (isHttpSuccess(responseCode)) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        response.response = getStringFromStream(inputStream);
                        inputStream.close();
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        if (headerFields != null && !headerFields.isEmpty()) {
                            response.headers = new HashMap(headerFields);
                        }
                    } else {
                        response.exception = new Exception(String.format(Locale.ENGLISH, "Network request failed with code: %s", Integer.valueOf(responseCode)));
                    }
                    httpURLConnection.disconnect();
                    return response;
                } catch (Exception e10) {
                    e = e10;
                    r22 = httpURLConnection;
                    response.exception = e;
                    if (r22 != 0) {
                        r22.disconnect();
                    }
                    return response;
                } catch (Throwable th2) {
                    th = th2;
                    r22 = httpURLConnection;
                    if (r22 != 0) {
                        r22.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, boolean z10, Listener listener) {
        makeRequest(context, str, map, str2, z10, false, listener);
    }

    public static void makeRequest(final Context context, String str, final Map<String, String> map, final String str2, final boolean z10, final boolean z11, Listener listener) {
        final String str3;
        final Listener listener2;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 0)) {
            if (listener != null) {
                listener.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. No network connection.\"}"));
                return;
            }
            return;
        }
        try {
            str3 = str;
            listener2 = listener;
        } catch (RejectedExecutionException e10) {
            e = e10;
            str3 = str;
            listener2 = listener;
        }
        try {
            ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.network.a
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    PNHttpClient.c(str3, map, str2, z11, z10, listener2, context);
                }
            });
        } catch (RejectedExecutionException e11) {
            e = e11;
            Logger.e(TAG, str3, e);
            listener2.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. Too many requests.\"}"));
        }
    }
}
