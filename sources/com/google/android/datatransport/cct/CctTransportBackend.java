package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.common.net.HttpHeaders;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes7.dex */
final class CctTransportBackend implements TransportBackend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataEncoder f24129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f24130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f24131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f24132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Clock f24133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Clock f24134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f24135g;

    static final class HttpRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f24136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BatchedLogRequest f24137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f24138c;

        HttpRequest(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.f24136a = url;
            this.f24137b = batchedLogRequest;
            this.f24138c = str;
        }

        HttpRequest a(URL url) {
            return new HttpRequest(url, this.f24137b, this.f24138c);
        }
    }

    static final class HttpResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f24139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f24140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f24141c;

        HttpResponse(int i10, URL url, long j10) {
            this.f24139a = i10;
            this.f24140b = url;
            this.f24141c = j10;
        }
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2, int i10) {
        this.f24129a = BatchedLogRequest.createDataEncoder();
        this.f24131c = context;
        this.f24130b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f24132d = l(CCTDestination.f24123c);
        this.f24133e = clock2;
        this.f24134f = clock;
        this.f24135g = i10;
    }

    public static /* synthetic */ HttpRequest b(HttpRequest httpRequest, HttpResponse httpResponse) {
        URL url = httpResponse.f24140b;
        if (url == null) {
            return null;
        }
        Logging.d("CctTransportBackend", "Following redirect to: %s", url);
        return httpRequest.a(httpResponse.f24140b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HttpResponse c(HttpRequest httpRequest) throws IOException {
        Logging.i("CctTransportBackend", "Making request to: %s", httpRequest.f24136a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.f24136a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f24135g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", D5.L);
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
        String str = httpRequest.f24138c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f24129a.encode(httpRequest.f24137b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Logging.i("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    Logging.d("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    Logging.d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new HttpResponse(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamK = k(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            HttpResponse httpResponse = new HttpResponse(responseCode, null, LogResponse.fromJson(new BufferedReader(new InputStreamReader(inputStreamK))).getNextRequestWaitMillis());
                            if (inputStreamK != null) {
                                inputStreamK.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return httpResponse;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e10) {
            e = e10;
            Logging.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new HttpResponse(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            Logging.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new HttpResponse(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            Logging.e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new HttpResponse(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            Logging.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new HttpResponse(400, null, 0L);
        }
    }

    private static String d(Context context) {
        String simOperator = i(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int f(NetworkInfo networkInfo) {
        return networkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : networkInfo.getType();
    }

    private static int g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Logging.e("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private BatchedLogRequest h(BackendRequest backendRequest) {
        LogEvent.Builder builderProtoBuilder;
        HashMap map = new HashMap();
        for (EventInternal eventInternal : backendRequest.getEvents()) {
            String transportName = eventInternal.getTransportName();
            if (map.containsKey(transportName)) {
                ((List) map.get(transportName)).add(eventInternal);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                map.put(transportName, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder clientInfo = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(this.f24134f.getTime()).setRequestUptimeMs(this.f24133e.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(Integer.valueOf(eventInternal2.getInteger("sdk-version"))).setModel(eventInternal2.get("model")).setHardware(eventInternal2.get("hardware")).setDevice(eventInternal2.get(C4240b4.i.G)).setProduct(eventInternal2.get(AppLovinEventTypes.USER_VIEWED_PRODUCT)).setOsBuild(eventInternal2.get("os-uild")).setManufacturer(eventInternal2.get(CommonUrlParts.MANUFACTURER)).setFingerprint(eventInternal2.get("fingerprint")).setCountry(eventInternal2.get("country")).setLocale(eventInternal2.get(CommonUrlParts.LOCALE)).setMccMnc(eventInternal2.get("mcc_mnc")).setApplicationBuild(eventInternal2.get("application_build")).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayload = eventInternal3.getEncodedPayload();
                Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(Encoding.of("proto"))) {
                    builderProtoBuilder = LogEvent.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(Encoding.of("json"))) {
                    builderProtoBuilder = LogEvent.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName("UTF-8")));
                } else {
                    Logging.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                builderProtoBuilder.setEventTimeMs(eventInternal3.getEventMillis()).setEventUptimeMs(eventInternal3.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal3.getLong("tz-offset")).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkConnectionInfo.NetworkType.forNumber(eventInternal3.getInteger("net-type"))).setMobileSubtype(NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal3.getInteger("mobile-subtype"))).build());
                if (eventInternal3.getCode() != null) {
                    builderProtoBuilder.setEventCode(eventInternal3.getCode());
                }
                if (eventInternal3.getProductId() != null) {
                    builderProtoBuilder.setComplianceData(ComplianceData.builder().setPrivacyContext(ExternalPrivacyContext.builder().setPrequest(ExternalPRequestContext.builder().setOriginAssociatedProductId(eventInternal3.getProductId()).build()).build()).setProductIdOrigin(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE).build());
                }
                if (eventInternal3.getExperimentIdsClear() != null || eventInternal3.getExperimentIdsEncrypted() != null) {
                    ExperimentIds.Builder builder = ExperimentIds.builder();
                    if (eventInternal3.getExperimentIdsClear() != null) {
                        builder.setClearBlob(eventInternal3.getExperimentIdsClear());
                    }
                    if (eventInternal3.getExperimentIdsEncrypted() != null) {
                        builder.setEncryptedBlob(eventInternal3.getExperimentIdsEncrypted());
                    }
                    builderProtoBuilder.setExperimentIds(builder.build());
                }
                arrayList3.add(builderProtoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        return BatchedLogRequest.create(arrayList2);
    }

    private static TelephonyManager i(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long j() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream k(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL l(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public EventInternal decorate(EventInternal eventInternal) {
        NetworkInfo activeNetworkInfo = this.f24130b.getActiveNetworkInfo();
        return eventInternal.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata(C4240b4.i.G, Build.DEVICE).addMetadata(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT).addMetadata("tz-offset", j()).addMetadata("net-type", f(activeNetworkInfo)).addMetadata("mobile-subtype", e(activeNetworkInfo)).addMetadata("country", Locale.getDefault().getCountry()).addMetadata(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage()).addMetadata("mcc_mnc", d(this.f24131c)).addMetadata("application_build", Integer.toString(g(this.f24131c))).build();
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public BackendResponse send(BackendRequest backendRequest) {
        BatchedLogRequest batchedLogRequestH = h(backendRequest);
        URL urlL = this.f24132d;
        if (backendRequest.getExtras() != null) {
            try {
                CCTDestination cCTDestinationFromByteArray = CCTDestination.fromByteArray(backendRequest.getExtras());
                aPIKey = cCTDestinationFromByteArray.getAPIKey() != null ? cCTDestinationFromByteArray.getAPIKey() : null;
                if (cCTDestinationFromByteArray.getEndPoint() != null) {
                    urlL = l(cCTDestinationFromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.fatalError();
            }
        }
        try {
            HttpResponse httpResponse = (HttpResponse) Retries.retry(5, new HttpRequest(urlL, batchedLogRequestH, aPIKey), new Function() { // from class: com.google.android.datatransport.cct.a
                @Override // com.google.android.datatransport.runtime.retries.Function
                public final Object apply(Object obj) {
                    return this.f24142a.c((CctTransportBackend.HttpRequest) obj);
                }
            }, new RetryStrategy() { // from class: com.google.android.datatransport.cct.b
                @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
                public final Object shouldRetry(Object obj, Object obj2) {
                    return CctTransportBackend.b((CctTransportBackend.HttpRequest) obj, (CctTransportBackend.HttpResponse) obj2);
                }
            });
            int i10 = httpResponse.f24139a;
            if (i10 == 200) {
                return BackendResponse.ok(httpResponse.f24141c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? BackendResponse.invalidPayload() : BackendResponse.fatalError();
            }
            return BackendResponse.transientError();
        } catch (IOException e10) {
            Logging.e("CctTransportBackend", "Could not make request to the backend", e10);
            return BackendResponse.transientError();
        }
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 130000);
    }
}
