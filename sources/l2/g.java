package l2;

import com.facebook.GraphRequest;
import com.facebook.d0;
import com.facebook.internal.r;
import com.facebook.internal.z;
import com.ironsource.D5;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import l2.g;
import lf.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f93919a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f93920b = SetsKt.hashSetOf(200, 202);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashSet f93921c = SetsKt.hashSetOf(503, 504, 429);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f93922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static List f93923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f93924f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f93925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f93926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f93927c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.f93925a = datasetID;
            this.f93926b = cloudBridgeURL;
            this.f93927c = accessKey;
        }

        public final String a() {
            return this.f93927c;
        }

        public final String b() {
            return this.f93926b;
        }

        public final String c() {
            return this.f93925a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f93925a, aVar.f93925a) && Intrinsics.areEqual(this.f93926b, aVar.f93926b) && Intrinsics.areEqual(this.f93927c, aVar.f93927c);
        }

        public int hashCode() {
            return (((this.f93925a.hashCode() * 31) + this.f93926b.hashCode()) * 31) + this.f93927c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f93925a + ", cloudBridgeURL=" + this.f93926b + ", accessKey=" + this.f93927c + ')';
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f93928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(2);
            this.f93928f = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Integer num, List processedEvents) {
            Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
            if (CollectionsKt.contains(g.f93920b, num)) {
                return;
            }
            g.f93919a.g(num, processedEvents, 5);
        }

        public final void b(String str, final Integer num) {
            final List list = this.f93928f;
            z.l0(new Runnable() { // from class: l2.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.c(num, list);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (Integer) obj2);
            return Unit.f93236a;
        }
    }

    private g() {
    }

    public static final void d(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        r.f19964e.c(d0.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        g gVar = f93919a;
        gVar.i(new a(datasetID, url, accessKey));
        gVar.j(new ArrayList());
    }

    private final List k(GraphRequest graphRequest) {
        JSONObject jSONObjectQ = graphRequest.q();
        if (jSONObjectQ == null) {
            return null;
        }
        Map mutableMap = MapsKt.toMutableMap(z.n(jSONObjectQ));
        Object objW = graphRequest.w();
        Intrinsics.checkNotNull(objW, "null cannot be cast to non-null type kotlin.Any");
        mutableMap.put("custom_events", objW);
        StringBuilder sb2 = new StringBuilder();
        for (String str : mutableMap.keySet()) {
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(mutableMap.get(str));
            sb2.append(System.getProperty("line.separator"));
        }
        r.f19964e.c(d0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb2);
        return e.f93899a.e(mutableMap);
    }

    public static final void l(final GraphRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        z.l0(new Runnable() { // from class: l2.f
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                g.m(request);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(GraphRequest request) throws JSONException {
        Intrinsics.checkNotNullParameter(request, "$request");
        String strR = request.r();
        List listSplit$default = strR != null ? StringsKt.split$default(strR, new String[]{"/"}, false, 0, 6, null) : null;
        if (listSplit$default == null || listSplit$default.size() != 2) {
            r.f19964e.c(d0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            g gVar = f93919a;
            String str = gVar.e().b() + "/capi/" + gVar.e().c() + "/events";
            List listK = gVar.k(request);
            if (listK == null) {
                return;
            }
            gVar.c(listK);
            int iMin = Math.min(gVar.f().size(), 10);
            List listSlice = CollectionsKt.slice(gVar.f(), new IntRange(0, iMin - 1));
            gVar.f().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listSlice);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", gVar.e().a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            r.a aVar = r.f19964e;
            d0 d0Var = d0.APP_EVENTS;
            String string = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(string, "jsonBodyStr.toString(2)");
            aVar.c(d0Var, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, string);
            gVar.h(str, "POST", jSONObject.toString(), MapsKt.mapOf(TuplesKt.to("Content-Type", D5.L)), 60000, new b(listSlice));
        } catch (a0 e10) {
            r.f19964e.c(d0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e10);
        }
    }

    public final void c(List list) {
        if (list != null) {
            f().addAll(list);
        }
        int iMax = Math.max(0, f().size() - 1000);
        if (iMax > 0) {
            List listDrop = CollectionsKt.drop(f(), iMax);
            Intrinsics.checkNotNull(listDrop, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            j(b1.c(listDrop));
        }
    }

    public final a e() {
        a aVar = f93922d;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentials");
        return null;
    }

    public final List f() {
        List list = f93923e;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        return null;
    }

    public final void g(Integer num, List processedEvents, int i10) {
        Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        if (CollectionsKt.contains(f93921c, num)) {
            if (f93924f >= i10) {
                f().clear();
                f93924f = 0;
            } else {
                f().addAll(0, processedEvents);
                f93924f++;
            }
        }
    }

    public final void h(String urlStr, String requestMethod, String str, Map map, int i10, Function2 function2) {
        Set<String> setKeySet;
        Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(urlStr).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (String str2 : setKeySet) {
                    httpURLConnection.setRequestProperty(str2, (String) map.get(str2));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT"));
            httpURLConnection.setConnectTimeout(i10);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb2 = new StringBuilder();
            if (f93920b.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb2.append(line);
                        }
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            uf.c.a(bufferedReader, th);
                        }
                    }
                }
                Unit unit = Unit.f93236a;
                uf.c.a(bufferedReader, null);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "connResponseSB.toString()");
            r.f19964e.c(d0.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (function2 != null) {
                function2.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e10) {
            r.f19964e.c(d0.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e10.toString());
            if (function2 != null) {
                function2.invoke(null, 503);
            }
        } catch (IOException e11) {
            r.f19964e.c(d0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e11.toString());
        }
    }

    public final void i(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f93922d = aVar;
    }

    public final void j(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        f93923e = list;
    }
}
