package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.media3.common.MimeTypes;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.GraphRequest;
import com.facebook.internal.r;
import com.facebook.z;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class GraphRequest {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f19547n = new c(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f19548o = GraphRequest.class.getSimpleName();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f19549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f19550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f19551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static volatile String f19552s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AccessToken f19553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f19555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f19556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bundle f19559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f19560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f19561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f19562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b0 f19563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f19565m;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u0016*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "Landroid/os/Parcel;", "source", "<init>", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "b", "Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "()Ljava/lang/String;", "mimeType", "Landroid/os/Parcelable;", "d", "()Landroid/os/Parcelable;", com.taurusx.tax.g.n.f66163g, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String mimeType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Parcelable resource;

        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new ParcelableResourceWithMimeType(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType[] newArray(int i10) {
                return new ParcelableResourceWithMimeType[i10];
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Parcelable getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = parcel.readParcelable(s.m().getClassLoader());
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GraphRequest f19569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f19570b;

        public a(GraphRequest request, Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f19569a = request;
            this.f19570b = obj;
        }

        public final GraphRequest a() {
            return this.f19569a;
        }

        public final Object b() {
            return this.f19570b;
        }
    }

    public interface b {
        void a(a0 a0Var);
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            Intrinsics.checkNotNullExpressionValue(str, "iso8601DateFormat.format(value)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void D(org.json.JSONObject r10, java.lang.String r11, com.facebook.GraphRequest.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r3 = r11
                int r11 = kotlin.text.StringsKt.v0(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r0 = kotlin.text.StringsKt.v0(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r11 <= r3) goto L23
                r3 = -1
                if (r0 == r3) goto L21
                if (r11 >= r0) goto L23
            L21:
                r11 = r1
                goto L24
            L23:
                r11 = r2
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.StringsKt.N(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = r1
                goto L45
            L44:
                r5 = r2
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.c.D(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$e):void");
        }

        private final void E(String str, Object obj, e eVar, boolean z10) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (z10) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        a1 a1Var = a1.f93282a;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(objOpt, "jsonObject.opt(propertyName)");
                        E(str2, objOpt, eVar, z10);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\"id\")");
                    E(str, strOptString, eVar, z10);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObject.optString(\"url\")");
                    E(str, strOptString2, eVar, z10);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
                        E(str, string, eVar, z10);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    a1 a1Var2 = a1.f93282a;
                    String str3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                    Object objOpt2 = jSONArray.opt(i10);
                    Intrinsics.checkNotNullExpressionValue(objOpt2, "jsonArray.opt(i)");
                    E(str3, objOpt2, eVar, z10);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                eVar.a(str, obj.toString());
                return;
            }
            if (Date.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.Date");
                String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                Intrinsics.checkNotNullExpressionValue(str4, "iso8601DateFormat.format(date)");
                eVar.a(str, str4);
                return;
            }
            com.facebook.internal.z.a0(GraphRequest.f19548o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
        }

        private final void F(z zVar, com.facebook.internal.r rVar, int i10, URL url, OutputStream outputStream, boolean z10) throws Throwable {
            f fVar = new f(outputStream, rVar, z10);
            if (i10 != 1) {
                String strP = p(zVar);
                if (strP.length() == 0) {
                    throw new i("App ID was not specified at the request or Settings.");
                }
                fVar.a("batch_app_id", strP);
                HashMap map = new HashMap();
                K(fVar, zVar, map);
                if (rVar != null) {
                    rVar.b("  Attachments:\n");
                }
                I(map, fVar);
                return;
            }
            GraphRequest graphRequestL = zVar.get(0);
            HashMap map2 = new HashMap();
            for (String key : graphRequestL.u().keySet()) {
                Object obj = graphRequestL.u().get(key);
                if (v(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, new a(graphRequestL, obj));
                }
            }
            if (rVar != null) {
                rVar.b("  Parameters:\n");
            }
            J(graphRequestL.u(), fVar, graphRequestL);
            if (rVar != null) {
                rVar.b("  Attachments:\n");
            }
            I(map2, fVar);
            JSONObject jSONObjectQ = graphRequestL.q();
            if (jSONObjectQ != null) {
                String path = url.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "url.path");
                D(jSONObjectQ, path, fVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void H(ArrayList callbacks, z requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                bVar.a((a0) obj);
            }
            Iterator it2 = requests.o().iterator();
            while (it2.hasNext()) {
                ((z.a) it2.next()).a(requests);
            }
        }

        private final void I(Map map, f fVar) throws Throwable {
            for (Map.Entry entry : map.entrySet()) {
                if (GraphRequest.f19547n.v(((a) entry.getValue()).b())) {
                    fVar.j((String) entry.getKey(), ((a) entry.getValue()).b(), ((a) entry.getValue()).a());
                }
            }
        }

        private final void J(Bundle bundle, f fVar, GraphRequest graphRequest) throws Throwable {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (w(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    fVar.j(key, obj, graphRequest);
                }
            }
        }

        private final void K(f fVar, Collection collection, Map map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).B(jSONArray, map);
            }
            fVar.l("batch", jSONArray, collection);
        }

        private final void M(HttpURLConnection httpURLConnection, boolean z10) {
            if (!z10) {
                httpURLConnection.setRequestProperty("Content-Type", q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        private final HttpURLConnection g(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty("User-Agent", r());
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String p(z zVar) {
            String strM = zVar.m();
            if (strM != null && !zVar.isEmpty()) {
                return strM;
            }
            Iterator<E> it = zVar.iterator();
            while (it.hasNext()) {
                AccessToken accessTokenM = ((GraphRequest) it.next()).m();
                if (accessTokenM != null) {
                    return accessTokenM.getApplicationId();
                }
            }
            String str = GraphRequest.f19550q;
            return (str == null || str.length() <= 0) ? s.n() : str;
        }

        private final String q() {
            a1 a1Var = a1.f93282a;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f19549p}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            return str;
        }

        private final String r() {
            if (GraphRequest.f19552s == null) {
                a1 a1Var = a1.f93282a;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.0.3"}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                GraphRequest.f19552s = str;
                String strA = com.facebook.internal.o.a();
                if (!com.facebook.internal.z.W(strA)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f19552s, strA}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                    GraphRequest.f19552s = str2;
                }
            }
            return GraphRequest.f19552s;
        }

        private final boolean s(z zVar) {
            for (z.a aVar : zVar.o()) {
            }
            Iterator<E> it = zVar.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).o();
            }
            return false;
        }

        private final boolean t(z zVar) {
            Iterator<E> it = zVar.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                Iterator<String> it2 = graphRequest.u().keySet().iterator();
                while (it2.hasNext()) {
                    if (v(graphRequest.u().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean u(String str) {
            Matcher matcher = GraphRequest.f19551r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            return StringsKt.a0(str, "me/", false, 2, null) || StringsKt.a0(str, "/me/", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(d dVar, a0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (dVar != null) {
                dVar.a(response.c(), response);
            }
        }

        public final GraphRequest A(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, b0.POST, bVar, null, 32, null);
            graphRequest.E(jSONObject);
            return graphRequest;
        }

        public final GraphRequest B(AccessToken accessToken, String str, Bundle bundle, b bVar) {
            return new GraphRequest(accessToken, str, bundle, b0.POST, bVar, null, 32, null);
        }

        public final void G(final z requests, List responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                GraphRequest graphRequestL = requests.get(i10);
                if (graphRequestL.o() != null) {
                    arrayList.add(new Pair(graphRequestL.o(), responses.get(i10)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.c.H(arrayList, requests);
                    }
                };
                Handler handlerN = requests.n();
                if (handlerN != null) {
                    handlerN.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void L(com.facebook.z r12, java.net.HttpURLConnection r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.c.L(com.facebook.z, java.net.HttpURLConnection):void");
        }

        public final HttpURLConnection N(z requests) throws Throwable {
            Intrinsics.checkNotNullParameter(requests, "requests");
            O(requests);
            try {
                HttpURLConnection httpURLConnectionG = null;
                try {
                    httpURLConnectionG = g(requests.size() == 1 ? new URL(requests.get(0).x()) : new URL(com.facebook.internal.v.c()));
                    L(requests, httpURLConnectionG);
                    return httpURLConnectionG;
                } catch (IOException e10) {
                    com.facebook.internal.z.q(httpURLConnectionG);
                    throw new i("could not construct request body", e10);
                } catch (JSONException e11) {
                    com.facebook.internal.z.q(httpURLConnectionG);
                    throw new i("could not construct request body", e11);
                }
            } catch (MalformedURLException e12) {
                throw new i("could not construct URL for request", e12);
            }
        }

        public final void O(z requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<E> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (b0.GET == graphRequest.t() && com.facebook.internal.z.W(graphRequest.u().getString("fields"))) {
                    r.a aVar = com.facebook.internal.r.f19964e;
                    d0 d0Var = d0.DEVELOPER_ERRORS;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GET requests for /");
                    String strR = graphRequest.r();
                    if (strR == null) {
                        strR = "";
                    }
                    sb2.append(strR);
                    sb2.append(" should contain an explicit \"fields\" parameter.");
                    aVar.a(d0Var, 5, "Request", sb2.toString());
                }
            }
        }

        public final a0 h(GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List listK = k(request);
            if (listK.size() == 1) {
                return (a0) listK.get(0);
            }
            throw new i("invalid state: expected a single response");
        }

        public final List i(z requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionN;
            List listO;
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.a0.f(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionN = N(requests);
                exc = null;
            } catch (Exception e10) {
                exc = e10;
                httpURLConnectionN = null;
            } catch (Throwable th2) {
                th = th2;
                com.facebook.internal.z.q(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionN != null) {
                    listO = o(httpURLConnectionN, requests);
                } else {
                    List listA = a0.f19589i.a(requests.q(), null, new i(exc));
                    G(requests, listA);
                    listO = listA;
                }
                com.facebook.internal.z.q(httpURLConnectionN);
                return listO;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnectionN;
                com.facebook.internal.z.q(httpURLConnection);
                throw th;
            }
        }

        public final List j(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return i(new z(requests));
        }

        public final List k(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return j(ArraysKt.toList(requests));
        }

        public final y l(z requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.a0.f(requests, "requests");
            y yVar = new y(requests);
            yVar.executeOnExecutor(s.t(), new Void[0]);
            return yVar;
        }

        public final y m(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return l(new z(requests));
        }

        public final y n(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return m(ArraysKt.toList(requests));
        }

        public final List o(HttpURLConnection connection, z requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List listF = a0.f19589i.f(connection, requests);
            com.facebook.internal.z.q(connection);
            int size = requests.size();
            if (size == listF.size()) {
                G(requests, listF);
                com.facebook.f.f19786f.e().h();
                return listF;
            }
            a1 a1Var = a1.f93282a;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listF.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            throw new i(str);
        }

        public final GraphRequest x(AccessToken accessToken, String str, b bVar) {
            return new GraphRequest(accessToken, str, null, null, bVar, null, 32, null);
        }

        public final GraphRequest y(AccessToken accessToken, final d dVar) {
            return new GraphRequest(accessToken, "me", null, null, new b(dVar) { // from class: com.facebook.w
                @Override // com.facebook.GraphRequest.b
                public final void a(a0 a0Var) {
                    GraphRequest.c.z(null, a0Var);
                }
            }, null, 32, null);
        }

        private c() {
        }
    }

    public interface d {
        void a(JSONObject jSONObject, a0 a0Var);
    }

    private interface e {
        void a(String str, String str2);
    }

    private static final class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f19571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.facebook.internal.r f19572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f19573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f19574d;

        public f(OutputStream outputStream, com.facebook.internal.r rVar, boolean z10) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.f19571a = outputStream;
            this.f19572b = rVar;
            this.f19573c = true;
            this.f19574d = z10;
        }

        private final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String key, String value) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            f(key, null, null);
            i("%s", value);
            k();
            com.facebook.internal.r rVar = this.f19572b;
            if (rVar != null) {
                rVar.d("    " + key, value);
            }
        }

        public final void c(String format, Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (this.f19574d) {
                OutputStream outputStream = this.f19571a;
                a1 a1Var = a1.f93282a;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f19573c) {
                OutputStream outputStream2 = this.f19571a;
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f19571a;
                byte[] bytes3 = GraphRequest.f19549p.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f19571a;
                byte[] bytes4 = IOUtils.LINE_SEPARATOR_WINDOWS.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f19573c = false;
            }
            OutputStream outputStream5 = this.f19571a;
            a1 a1Var2 = a1.f93282a;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str2 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            byte[] bytes5 = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String key, Bitmap bitmap) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            f(key, key, MimeTypes.IMAGE_PNG);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f19571a);
            i("", new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f19572b;
            if (rVar != null) {
                rVar.d("    " + key, "<Image>");
            }
        }

        public final void e(String key, byte[] bytes) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            f(key, key, "content/unknown");
            this.f19571a.write(bytes);
            i("", new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f19572b;
            if (rVar != null) {
                a1 a1Var = a1.f93282a;
                String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                rVar.d("    " + key, str);
            }
        }

        public final void f(String str, String str2, String str3) throws IOException {
            if (this.f19574d) {
                OutputStream outputStream = this.f19571a;
                a1 a1Var = a1.f93282a;
                String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
                byte[] bytes = str4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            c("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                c("; filename=\"%s\"", str2);
            }
            i("", new Object[0]);
            if (str3 != null) {
                i("%s: %s", "Content-Type", str3);
            }
            i("", new Object[0]);
        }

        public final void g(String key, Uri contentUri, String str) throws Throwable {
            int iP;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            if (this.f19571a instanceof g0) {
                ((g0) this.f19571a).f(com.facebook.internal.z.x(contentUri));
                iP = 0;
            } else {
                iP = com.facebook.internal.z.p(s.m().getContentResolver().openInputStream(contentUri), this.f19571a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f19572b;
            if (rVar != null) {
                a1 a1Var = a1.f93282a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iP)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                rVar.d("    " + key, str2);
            }
        }

        public final void h(String key, ParcelFileDescriptor descriptor, String str) throws Throwable {
            int iP;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            OutputStream outputStream = this.f19571a;
            if (outputStream instanceof g0) {
                ((g0) outputStream).f(descriptor.getStatSize());
                iP = 0;
            } else {
                iP = com.facebook.internal.z.p(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.f19571a);
            }
            i("", new Object[0]);
            k();
            com.facebook.internal.r rVar = this.f19572b;
            if (rVar != null) {
                a1 a1Var = a1.f93282a;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iP)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                rVar.d("    " + key, str2);
            }
        }

        public final void i(String format, Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            c(format, Arrays.copyOf(args, args.length));
            if (this.f19574d) {
                return;
            }
            c(IOUtils.LINE_SEPARATOR_WINDOWS, new Object[0]);
        }

        public final void j(String key, Object obj, GraphRequest graphRequest) throws Throwable {
            Intrinsics.checkNotNullParameter(key, "key");
            Closeable closeable = this.f19571a;
            if (closeable instanceof i0) {
                Intrinsics.checkNotNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((i0) closeable).c(graphRequest);
            }
            c cVar = GraphRequest.f19547n;
            if (cVar.w(obj)) {
                a(key, cVar.C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw b();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable resource = parcelableResourceWithMimeType.getResource();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (resource instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) resource, mimeType);
            } else {
                if (!(resource instanceof Uri)) {
                    throw b();
                }
                g(key, (Uri) resource, mimeType);
            }
        }

        public final void k() throws IOException {
            if (!this.f19574d) {
                i("--%s", GraphRequest.f19549p);
                return;
            }
            OutputStream outputStream = this.f19571a;
            byte[] bytes = C4240b4.j.f42670c.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String key, JSONArray requestJsonArray, Collection requests) throws JSONException, IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = this.f19571a;
            if (!(closeable instanceof i0)) {
                String string = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "requestJsonArray.toString()");
                a(key, string);
                return;
            }
            Intrinsics.checkNotNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            i0 i0Var = (i0) closeable;
            f(key, null, null);
            c(C4240b4.j.f42672d, new Object[0]);
            Iterator it = requests.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                GraphRequest graphRequest = (GraphRequest) it.next();
                JSONObject jSONObject = requestJsonArray.getJSONObject(i10);
                i0Var.c(graphRequest);
                if (i10 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i10 = i11;
            }
            c(C4240b4.j.f42674e, new Object[0]);
            com.facebook.internal.r rVar = this.f19572b;
            if (rVar != null) {
                String string2 = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "requestJsonArray.toString()");
                rVar.d("    " + key, string2);
            }
        }
    }

    public static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f19575a;

        g(ArrayList arrayList) {
            this.f19575a = arrayList;
        }

        @Override // com.facebook.GraphRequest.e
        public void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f19575a;
            a1 a1Var = a1.f93282a;
            String str = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            arrayList.add(str);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i10 = 0; i10 < iNextInt; i10++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        f19549p = string;
        f19551r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, b0 b0Var, b bVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : accessToken, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bundle, (i10 & 8) != 0 ? null : b0Var, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? null : str2);
    }

    private final boolean A() {
        if (Intrinsics.areEqual(s.w(), "instagram.com")) {
            return !z();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(JSONArray jSONArray, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f19556d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f19558f);
        }
        String str2 = this.f19557e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strV = v();
        jSONObject.put("relative_url", strV);
        jSONObject.put("method", this.f19563k);
        AccessToken accessToken = this.f19553a;
        if (accessToken != null) {
            com.facebook.internal.r.f19964e.d(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f19559g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f19559g.get(it.next());
            if (f19547n.v(obj)) {
                a1 a1Var = a1.f93282a;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{C4240b4.i.f42616b, Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(StringUtils.COMMA, arrayList));
        }
        JSONObject jSONObject2 = this.f19555c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f19547n.D(jSONObject2, strV, new g(arrayList2));
            jSONObject.put("body", TextUtils.join(C4240b4.j.f42670c, arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final boolean I() {
        String strN = n();
        boolean zG0 = strN != null ? StringsKt.g0(strN, "|", false, 2, null) : false;
        if (strN == null || !StringsKt.a0(strN, "IG", false, 2, null) || zG0 || !z()) {
            return (A() || zG0) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b bVar, a0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectC = response.c();
        JSONObject jSONObjectOptJSONObject = jSONObjectC != null ? jSONObjectC.optJSONObject("__debug__") : null;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString(PglCryptUtils.KEY_MESSAGE) : null;
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString(POBCoreNativeConstants.NATIVE_LINK) : null;
                if (strOptString != null && strOptString2 != null) {
                    d0 d0Var = d0.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual(strOptString2, "warning")) {
                        d0Var = d0.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!com.facebook.internal.z.W(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    r.a aVar = com.facebook.internal.r.f19964e;
                    String TAG = f19548o;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    aVar.b(d0Var, TAG, strOptString);
                }
            }
        }
        if (bVar != null) {
            bVar.a(response);
        }
    }

    private final void i() {
        Bundle bundle = this.f19559g;
        if (I()) {
            bundle.putString("access_token", p());
        } else {
            String strN = n();
            if (strN != null) {
                bundle.putString("access_token", strN);
            }
        }
        if (!bundle.containsKey("access_token") && com.facebook.internal.z.W(s.r())) {
            Log.w(f19548o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (s.F(d0.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (s.F(d0.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    private final String j(String str, boolean z10) {
        if (!z10 && this.f19563k == b0.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f19559g.keySet()) {
            Object obj = this.f19559g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f19547n;
            if (cVar.w(obj)) {
                builderBuildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
            } else if (this.f19563k != b0.GET) {
                a1 a1Var = a1.f93282a;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriBuilder.toString()");
        return string;
    }

    private final String n() {
        AccessToken accessToken = this.f19553a;
        if (accessToken != null) {
            if (!this.f19559g.containsKey("access_token")) {
                String token = accessToken.getToken();
                com.facebook.internal.r.f19964e.d(token);
                return token;
            }
        } else if (!this.f19559g.containsKey("access_token")) {
            return p();
        }
        return this.f19559g.getString("access_token");
    }

    private final String p() {
        String strN = s.n();
        String strR = s.r();
        if (strN.length() <= 0 || strR.length() <= 0) {
            com.facebook.internal.z.a0(f19548o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return strN + '|' + strR;
    }

    private final String s() {
        if (f19551r.matcher(this.f19554b).matches()) {
            return this.f19554b;
        }
        a1 a1Var = a1.f93282a;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f19561i, this.f19554b}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    private final String y(String str) {
        if (!A()) {
            str = com.facebook.internal.v.b();
        }
        a1 a1Var = a1.f93282a;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }

    private final boolean z() {
        if (this.f19554b == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^/?");
        sb2.append(s.n());
        sb2.append("/?.*");
        return this.f19564l || Pattern.matches(sb2.toString(), this.f19554b) || Pattern.matches("^/?app/?.*", this.f19554b);
    }

    public final void C(final b bVar) {
        if (s.F(d0.GRAPH_API_DEBUG_INFO) || s.F(d0.GRAPH_API_DEBUG_WARNING)) {
            this.f19562j = new b() { // from class: com.facebook.v
                @Override // com.facebook.GraphRequest.b
                public final void a(a0 a0Var) {
                    GraphRequest.b(bVar, a0Var);
                }
            };
        } else {
            this.f19562j = bVar;
        }
    }

    public final void D(boolean z10) {
        this.f19564l = z10;
    }

    public final void E(JSONObject jSONObject) {
        this.f19555c = jSONObject;
    }

    public final void F(b0 b0Var) {
        if (this.f19565m != null && b0Var != b0.GET) {
            throw new i("Can't change HTTP method on request with overridden URL.");
        }
        if (b0Var == null) {
            b0Var = b0.GET;
        }
        this.f19563k = b0Var;
    }

    public final void G(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.f19559g = bundle;
    }

    public final void H(Object obj) {
        this.f19560h = obj;
    }

    public final a0 k() {
        return f19547n.h(this);
    }

    public final y l() {
        return f19547n.n(this);
    }

    public final AccessToken m() {
        return this.f19553a;
    }

    public final b o() {
        return this.f19562j;
    }

    public final JSONObject q() {
        return this.f19555c;
    }

    public final String r() {
        return this.f19554b;
    }

    public final b0 t() {
        return this.f19563k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f19553a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f19554b);
        sb2.append(", graphObject: ");
        sb2.append(this.f19555c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f19563k);
        sb2.append(", parameters: ");
        sb2.append(this.f19559g);
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    public final Bundle u() {
        return this.f19559g;
    }

    public final String v() {
        if (this.f19565m != null) {
            throw new i("Can't override URL for a batch request");
        }
        String strY = y(com.facebook.internal.v.c());
        i();
        Uri uri = Uri.parse(j(strY, true));
        a1 a1Var = a1.f93282a;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public final Object w() {
        return this.f19560h;
    }

    public final String x() {
        String str = this.f19565m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f19554b;
        String strY = y((this.f19563k == b0.POST && str2 != null && StringsKt.M(str2, "/videos", false, 2, null)) ? com.facebook.internal.v.e() : com.facebook.internal.v.d(s.w()));
        i();
        return j(strY, false);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, b0 b0Var, b bVar, String str2) {
        this.f19558f = true;
        this.f19553a = accessToken;
        this.f19554b = str;
        this.f19561i = str2;
        C(bVar);
        F(b0Var);
        if (bundle != null) {
            this.f19559g = new Bundle(bundle);
        } else {
            this.f19559g = new Bundle();
        }
        if (this.f19561i == null) {
            this.f19561i = s.v();
        }
    }
}
