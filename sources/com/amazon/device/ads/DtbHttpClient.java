package com.amazon.device.ads;

import androidx.annotation.NonNull;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
class DtbHttpClient {
    private String message;
    private int responseCode;
    private String url;
    private boolean secure = true;
    private boolean isQueryParamsEnabled = false;
    private String response = null;
    private HashMap<String, Object> params = new HashMap<>();
    private HashMap<String, Object> headers = new HashMap<>();

    private enum HTTPMethod {
        POST,
        GET
    }

    protected DtbHttpClient(String str) {
        this.url = str;
    }

    @NonNull
    private static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line + IOUtils.LINE_SEPARATOR_UNIX);
                    }
                } catch (IOException e10) {
                    DtbLog.debug("Error converting stream to string. Ex=" + e10);
                }
                try {
                    break;
                } catch (IOException unused) {
                }
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        return sb2.toString();
    }

    private HttpURLConnection createDefaultConnection(URL url, int i10) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(i10);
        return httpURLConnection;
    }

    private void executeRequest(HTTPMethod hTTPMethod, URL url, int i10) throws JSONException, IOException {
        String paramsAsJsonString;
        HttpURLConnection httpURLConnectionCreateDefaultConnection = createDefaultConnection(url, i10);
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.headers.keySet()) {
            String string = this.headers.get(str) != null ? this.headers.get(str).toString() : "";
            httpURLConnectionCreateDefaultConnection.setRequestProperty(str, string);
            sb2.append(str + StringUtils.PROCESS_POSTFIX_DELIMITER + string + " ");
        }
        DtbLog.debug("with headers:[" + ((Object) sb2) + C4240b4.j.f42674e);
        if (hTTPMethod == HTTPMethod.POST) {
            httpURLConnectionCreateDefaultConnection.setDoOutput(true);
            if (!this.params.isEmpty()) {
                if (this.isQueryParamsEnabled) {
                    httpURLConnectionCreateDefaultConnection.setRequestProperty("content-type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                    paramsAsJsonString = getQueryParams();
                } else {
                    httpURLConnectionCreateDefaultConnection.setRequestProperty("content-type", "application/json; charset=utf-8");
                    paramsAsJsonString = getParamsAsJsonString();
                }
                DtbLog.debug("with json params:[" + paramsAsJsonString + C4240b4.j.f42674e);
                OutputStream outputStream = httpURLConnectionCreateDefaultConnection.getOutputStream();
                outputStream.write(paramsAsJsonString.getBytes());
                outputStream.flush();
                outputStream.close();
            }
        }
        try {
            InputStream inputStream = httpURLConnectionCreateDefaultConnection.getInputStream();
            if (inputStream == null) {
                return;
            }
            this.responseCode = httpURLConnectionCreateDefaultConnection.getResponseCode();
            this.message = httpURLConnectionCreateDefaultConnection.getResponseMessage();
            this.response = convertStreamToString(inputStream);
            inputStream.close();
            DtbLog.debug("Response :" + this.response);
            return;
        } catch (Exception e10) {
            this.response = null;
            DtbLog.debug("Error while connecting to remote server: " + httpURLConnectionCreateDefaultConnection.getURL().toString() + " with error:" + e10.getMessage());
            return;
        } finally {
            httpURLConnectionCreateDefaultConnection.disconnect();
        }
        httpURLConnectionCreateDefaultConnection.disconnect();
    }

    private String getParamsAsJsonString() throws JSONException {
        return DtbCommonUtils.getParamsAsJsonString(this.params);
    }

    private String getQueryParams() {
        String str = "";
        if (!this.params.isEmpty()) {
            for (String str2 : this.params.keySet()) {
                if (this.params.get(str2) != null) {
                    String str3 = str2 + C4240b4.j.f42668b + DtbCommonUtils.getURLEncodedString(this.params.get(str2).toString());
                    str = str.length() > 1 ? str + C4240b4.j.f42670c + str3 : str + str3;
                }
            }
        }
        return str;
    }

    protected void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    protected void addParam(String str, String str2) {
        this.params.put(str, str2);
    }

    public void enableQueryParams() {
        this.isQueryParamsEnabled = true;
    }

    protected void executeGET(int i10) throws JSONException, IOException {
        String str;
        if (this.params.isEmpty()) {
            str = "";
        } else {
            str = "?" + getQueryParams();
        }
        String string = this.url;
        String str2 = DtbConstants.HTTPS;
        if (!string.startsWith(DtbConstants.HTTPS) && !this.url.startsWith("http://")) {
            StringBuilder sb2 = new StringBuilder();
            if (!this.secure) {
                str2 = "http://";
            }
            sb2.append(str2);
            sb2.append(this.url);
            string = sb2.toString();
        }
        DtbLog.debug("GET URL:" + string);
        DtbLog.debug("with params: " + str);
        executeRequest(HTTPMethod.GET, new URL(string + str), i10);
    }

    protected void executePOST(int i10) throws JSONException, IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.secure ? DtbConstants.HTTPS : "http://");
        sb2.append(this.url);
        String string = sb2.toString();
        DtbLog.debug("POST URL:" + string);
        executeRequest(HTTPMethod.POST, new URL(string), i10);
    }

    protected String getErrorMessage() {
        return this.message;
    }

    protected HashMap<String, Object> getHeaders() {
        return this.headers;
    }

    protected HashMap<String, Object> getParams() {
        return this.params;
    }

    protected String getResponse() {
        return this.response;
    }

    protected int getResponseCode() {
        return this.responseCode;
    }

    protected String getUrl() {
        return this.url;
    }

    public boolean isHttpStatusCodeOK() {
        return this.responseCode == 200;
    }

    protected void setHeaders(HashMap<String, Object> map) {
        this.headers = map;
    }

    protected void setParams(HashMap<String, Object> map) {
        this.params = map;
    }

    protected void setUrl(String str) {
        this.url = str;
    }

    public void setUseSecure(boolean z10) {
        this.secure = z10;
    }
}
