package com.adjust.sdk.purchase;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ironsource.C4240b4;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class ADJPRequestHandler extends HandlerThread {
    private InternalHandler internalHandler;
    private OnADJPRequestFinished listener;

    private static final class InternalHandler extends Handler {
        private static final int SEND = 72400;
        private final WeakReference<ADJPRequestHandler> requestWorkerReference;

        protected InternalHandler(Looper looper, ADJPRequestHandler aDJPRequestHandler) {
            super(looper);
            this.requestWorkerReference = new WeakReference<>(aDJPRequestHandler);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ADJPRequestHandler aDJPRequestHandler = this.requestWorkerReference.get();
            if (aDJPRequestHandler != null && message.arg1 == SEND) {
                aDJPRequestHandler.sendInternal((ADJPVerificationPackage) message.obj);
            }
        }
    }

    public ADJPRequestHandler(OnADJPRequestFinished onADJPRequestFinished) {
        super(ADJPConstants.TAG, 1);
        setDaemon(true);
        start();
        this.listener = onADJPRequestFinished;
        this.internalHandler = new InternalHandler(getLooper(), this);
    }

    public static HttpsURLConnection createHttpsURLConnection(String str) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setConnectTimeout(5000);
        httpsURLConnection.setReadTimeout(5000);
        return httpsURLConnection;
    }

    private HttpsURLConnection createPOSTHttpsURLConnection(String str, Map<String, String> map) throws IOException {
        HttpsURLConnection httpsURLConnectionCreateHttpsURLConnection = createHttpsURLConnection(str);
        httpsURLConnectionCreateHttpsURLConnection.setRequestMethod("POST");
        httpsURLConnectionCreateHttpsURLConnection.setUseCaches(false);
        httpsURLConnectionCreateHttpsURLConnection.setDoInput(true);
        httpsURLConnectionCreateHttpsURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnectionCreateHttpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(getPostDataString(map));
        dataOutputStream.flush();
        dataOutputStream.close();
        return httpsURLConnectionCreateHttpsURLConnection;
    }

    private static String getPostDataString(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strEncode = URLEncoder.encode(entry.getKey(), "UTF-8");
            String value = entry.getValue();
            String strEncode2 = value != null ? URLEncoder.encode(value, "UTF-8") : "";
            if (sb2.length() > 0) {
                sb2.append(C4240b4.j.f42670c);
            }
            sb2.append(strEncode);
            sb2.append(C4240b4.j.f42668b);
            sb2.append(strEncode2);
        }
        String str = new SimpleDateFormat(ADJPConstants.DATE_FORMAT, Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        sb2.append(C4240b4.j.f42670c);
        sb2.append(URLEncoder.encode("sent_at", "UTF-8"));
        sb2.append(C4240b4.j.f42668b);
        sb2.append(URLEncoder.encode(str, "UTF-8"));
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[Catch: all -> 0x001e, Exception -> 0x005e, TRY_ENTER, TryCatch #1 {Exception -> 0x005e, blocks: (B:3:0x0008, B:19:0x0049, B:24:0x0064, B:27:0x007d, B:28:0x0092), top: B:38:0x0008, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.Object> readHttpsResponse(javax.net.ssl.HttpsURLConnection r11) throws java.lang.Exception {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "Verification state unknown"
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            int r4 = r11.getResponseCode()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r6 = 400(0x190, float:5.6E-43)
            if (r4 < r6) goto L21
            java.io.InputStream r6 = r11.getErrorStream()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
            goto L25
        L1e:
            r0 = move-exception
            goto Lbd
        L21:
            java.io.InputStream r6 = r11.getInputStream()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
        L25:
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
        L2f:
            java.lang.String r7 = r6.readLine()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
            if (r7 == 0) goto L39
            r3.append(r7)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
            goto L2f
        L39:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L3e
            goto L3f
        L3e:
            r3 = 0
        L3f:
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.String r7 = "adjust_state"
            java.lang.String r8 = "adjust_status_code"
            java.lang.String r9 = "adjust_message"
            if (r4 != r6) goto L60
            r2.put(r9, r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r8, r5)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPVerificationState r1 = com.adjust.sdk.purchase.ADJPVerificationState.ADJPVerificationStatePassed     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPLogger r1 = com.adjust.sdk.purchase.ADJPLogger.getInstance()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r1.info(r3, r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            goto La6
        L5e:
            r1 = move-exception
            goto Laa
        L60:
            r6 = 204(0xcc, float:2.86E-43)
            if (r4 != r6) goto L79
            r2.put(r9, r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r8, r5)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPVerificationState r3 = com.adjust.sdk.purchase.ADJPVerificationState.ADJPVerificationStateUnknown     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPLogger r3 = com.adjust.sdk.purchase.ADJPLogger.getInstance()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r3.info(r1, r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            goto La6
        L79:
            r1 = 406(0x196, float:5.69E-43)
            if (r4 != r1) goto L92
            r2.put(r9, r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r8, r5)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPVerificationState r1 = com.adjust.sdk.purchase.ADJPVerificationState.ADJPVerificationStateFailed     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPLogger r1 = com.adjust.sdk.purchase.ADJPLogger.getInstance()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r1.info(r3, r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            goto La6
        L92:
            r2.put(r9, r3)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r8, r5)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPVerificationState r1 = com.adjust.sdk.purchase.ADJPVerificationState.ADJPVerificationStateUnknown     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r2.put(r7, r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            com.adjust.sdk.purchase.ADJPLogger r1 = com.adjust.sdk.purchase.ADJPLogger.getInstance()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
            r1.info(r3, r4)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L5e
        La6:
            r11.disconnect()
            return r2
        Laa:
            com.adjust.sdk.purchase.ADJPLogger r2 = com.adjust.sdk.purchase.ADJPLogger.getInstance()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "Failed to read response. (%s)"
            java.lang.String r4 = r1.getMessage()     // Catch: java.lang.Throwable -> L1e
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1e
            r5[r0] = r4     // Catch: java.lang.Throwable -> L1e
            r2.error(r3, r5)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        Lbd:
            if (r11 == 0) goto Lc2
            r11.disconnect()
        Lc2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.purchase.ADJPRequestHandler.readHttpsResponse(javax.net.ssl.HttpsURLConnection):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInternal(ADJPVerificationPackage aDJPVerificationPackage) {
        sendURLRequest(aDJPVerificationPackage);
    }

    private void sendURLRequest(ADJPVerificationPackage aDJPVerificationPackage) {
        try {
            ADJPLogger.getInstance().verbose(aDJPVerificationPackage.getExtendedString(), new Object[0]);
            this.listener.requestFinished(readHttpsResponse(createPOSTHttpsURLConnection(ADJPConstants.BASE_URL, aDJPVerificationPackage.getParameters())), aDJPVerificationPackage);
        } catch (Exception e10) {
            HashMap map = new HashMap();
            map.put(ADJPConstants.KEY_ADJUST_MESSAGE, "Error while making URL request");
            map.put(ADJPConstants.KEY_ADJUST_STATUS_CODE, -1);
            map.put(ADJPConstants.KEY_ADJUST_STATE, ADJPVerificationState.ADJPVerificationStateNotVerified);
            ADJPLogger.getInstance().error("Error while making URL request", new Object[0]);
            ADJPLogger.getInstance().error(e10.getMessage(), new Object[0]);
            this.listener.requestFinished(map, aDJPVerificationPackage);
        }
    }

    public void sendPackage(ADJPVerificationPackage aDJPVerificationPackage) {
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = 72400;
        messageObtain.obj = aDJPVerificationPackage;
        this.internalHandler.sendMessage(messageObtain);
    }
}
