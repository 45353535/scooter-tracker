package com.facebook;

import android.util.Log;
import com.facebook.AccessToken;
import com.google.android.material.timepicker.TimeModel;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f19589i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f19590j = a0.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GraphRequest f19591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f19592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f19594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONArray f19595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FacebookRequestError f19596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f19597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONArray f19598h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final a0 b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object NULL, Object obj) throws JSONException {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                FacebookRequestError facebookRequestErrorA = FacebookRequestError.INSTANCE.a(jSONObject, obj, httpURLConnection);
                if (facebookRequestErrorA != null) {
                    Log.e(a0.f19590j, facebookRequestErrorA.toString());
                    if (facebookRequestErrorA.getErrorCode() == 190 && com.facebook.internal.z.T(graphRequest.m())) {
                        if (facebookRequestErrorA.getSubErrorCode() != 493) {
                            AccessToken.INSTANCE.h(null);
                        } else {
                            AccessToken.Companion companion = AccessToken.INSTANCE;
                            AccessToken accessTokenE = companion.e();
                            if (accessTokenE != null && !accessTokenE.n()) {
                                companion.d();
                            }
                        }
                    }
                    return new a0(graphRequest, httpURLConnection, facebookRequestErrorA);
                }
                Object objM = com.facebook.internal.z.M(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objM instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objM;
                    return new a0(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (objM instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objM;
                    return new a0(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new a0(graphRequest, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new i("Got unexpected object type in response, class: " + NULL.getClass().getSimpleName());
        }

        private final List c(HttpURLConnection httpURLConnection, List list, Object obj) {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = (GraphRequest) list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e10) {
                    arrayList.add(new a0(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e10)));
                    obj2 = obj;
                } catch (JSONException e11) {
                    arrayList.add(new a0(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e11)));
                    obj2 = obj;
                }
            } else {
                obj2 = obj;
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        GraphRequest graphRequest2 = (GraphRequest) list.get(i10);
                        try {
                            Object obj3 = ((JSONArray) obj2).get(i10);
                            Intrinsics.checkNotNullExpressionValue(obj3, "obj");
                            arrayList.add(b(graphRequest2, httpURLConnection, obj3, obj));
                        } catch (i e12) {
                            arrayList.add(new a0(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e12)));
                        } catch (JSONException e13) {
                            arrayList.add(new a0(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e13)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new i("Unexpected number of results");
        }

        public final List a(List requests, HttpURLConnection httpURLConnection, i iVar) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            List list = requests;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new a0((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, iVar)));
            }
            return arrayList;
        }

        public final List d(InputStream inputStream, HttpURLConnection httpURLConnection, z requests) throws Throwable {
            Intrinsics.checkNotNullParameter(requests, "requests");
            String strD0 = com.facebook.internal.z.d0(inputStream);
            com.facebook.internal.r.f19964e.c(d0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strD0.length()), strD0);
            return e(strD0, httpURLConnection, requests);
        }

        public final List e(String responseString, HttpURLConnection httpURLConnection, z requests) throws JSONException {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List listC = c(httpURLConnection, requests, resultObject);
            com.facebook.internal.r.f19964e.c(d0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.p(), Integer.valueOf(responseString.length()), listC);
            return listC;
        }

        public final List f(HttpURLConnection connection, z requests) {
            List listA;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            try {
                try {
                    try {
                        if (!s.C()) {
                            Log.e(a0.f19590j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            throw new i("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        }
                        InputStream errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                        List listD = d(errorStream, connection, requests);
                        com.facebook.internal.z.i(errorStream);
                        return listD;
                    } catch (Exception e10) {
                        com.facebook.internal.r.f19964e.c(d0.REQUESTS, "Response", "Response <Error>: %s", e10);
                        listA = a(requests, connection, new i(e10));
                        com.facebook.internal.z.i(null);
                        return listA;
                    }
                } catch (i e11) {
                    com.facebook.internal.r.f19964e.c(d0.REQUESTS, "Response", "Response <Error>: %s", e11);
                    listA = a(requests, connection, e11);
                    com.facebook.internal.z.i(null);
                    return listA;
                }
            } catch (Throwable th2) {
                com.facebook.internal.z.i(null);
                throw th2;
            }
        }

        private a() {
        }
    }

    public a0(GraphRequest request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f19591a = request;
        this.f19592b = httpURLConnection;
        this.f19593c = str;
        this.f19594d = jSONObject;
        this.f19595e = jSONArray;
        this.f19596f = facebookRequestError;
        this.f19597g = jSONObject;
        this.f19598h = jSONArray;
    }

    public final FacebookRequestError b() {
        return this.f19596f;
    }

    public final JSONObject c() {
        return this.f19594d;
    }

    public final JSONObject d() {
        return this.f19597g;
    }

    public String toString() {
        String str;
        try {
            a1 a1Var = a1.f93282a;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.f19592b;
            str = String.format(locale, TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f19594d + ", error: " + this.f19596f + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(GraphRequest request, HttpURLConnection httpURLConnection, FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
