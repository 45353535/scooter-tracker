package com.pubmatic.sdk.common.network;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.o;
import com.android.volley.p;
import com.android.volley.t;
import com.android.volley.toolbox.n;
import com.android.volley.u;
import com.ironsource.D5;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBNetworkHandler {
    public static final String TAG = "POBNetworkHandler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final POBRequestQueue f62446a;

    public interface POBImageNetworkListener<T> {
        void onFailure(POBError pOBError);

        void onSuccess(Bitmap bitmap);
    }

    public interface POBNetworkListener<T> {
        void onFailure(@NonNull POBError pOBError);

        void onSuccess(@Nullable T t10);
    }

    public interface POBNetworkRedirectListener {
        POBHttpRequest onRedirect(POBHttpRequest pOBHttpRequest);
    }

    public interface POBNetworkResultListener {
        void onResult(@Nullable POBNetworkResult pOBNetworkResult);
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62447a;

        static {
            int[] iArr = new int[POBHttpRequest.HTTP_METHOD.values().length];
            f62447a = iArr;
            try {
                iArr[POBHttpRequest.HTTP_METHOD.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62447a[POBHttpRequest.HTTP_METHOD.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62447a[POBHttpRequest.HTTP_METHOD.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class b implements p.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBNetworkListener f62448a;

        b(POBNetworkListener pOBNetworkListener) {
            this.f62448a = pOBNetworkListener;
        }

        @Override // com.android.volley.p.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String str) {
            POBNetworkListener pOBNetworkListener = this.f62448a;
            if (pOBNetworkListener != null) {
                pOBNetworkListener.onSuccess(str);
            }
        }
    }

    class c extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBHttpRequest f62450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ POBNetworkResultListener f62451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, String str, p.b bVar, p.a aVar, POBHttpRequest pOBHttpRequest, POBNetworkResultListener pOBNetworkResultListener) {
            super(i10, str, bVar, aVar);
            this.f62450a = pOBHttpRequest;
            this.f62451b = pOBNetworkResultListener;
        }

        @Override // com.android.volley.n
        public byte[] getBody() {
            if (this.f62450a.getPostData() == null) {
                return null;
            }
            return this.f62450a.getPostData().getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.n
        public Map getHeaders() {
            return this.f62450a.getHeaders();
        }

        @Override // com.android.volley.toolbox.n, com.android.volley.n
        protected p parseNetworkResponse(k kVar) {
            if (this.f62451b != null) {
                Map map = kVar.f7527c;
                if (map == null) {
                    map = new HashMap();
                }
                this.f62451b.onResult(new POBNetworkResult(map, kVar.f7530f));
            }
            return super.parseNetworkResponse(kVar);
        }
    }

    class d implements p.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBImageNetworkListener f62453a;

        d(POBImageNetworkListener pOBImageNetworkListener) {
            this.f62453a = pOBImageNetworkListener;
        }

        @Override // com.android.volley.p.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Bitmap bitmap) {
            POBImageNetworkListener pOBImageNetworkListener = this.f62453a;
            if (pOBImageNetworkListener != null) {
                pOBImageNetworkListener.onSuccess(bitmap);
            }
        }
    }

    class e implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBImageNetworkListener f62455a;

        e(POBImageNetworkListener pOBImageNetworkListener) {
            this.f62455a = pOBImageNetworkListener;
        }

        @Override // com.android.volley.p.a
        public void onErrorResponse(u uVar) {
            if (this.f62455a != null) {
                this.f62455a.onFailure(new POBError(1007, "not able to fetch response"));
            }
        }
    }

    class f implements p.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBNetworkListener f62457a;

        f(POBNetworkListener pOBNetworkListener) {
            this.f62457a = pOBNetworkListener;
        }

        @Override // com.android.volley.p.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(JSONObject jSONObject) {
            POBNetworkListener pOBNetworkListener = this.f62457a;
            if (pOBNetworkListener != null) {
                pOBNetworkListener.onSuccess(jSONObject);
            }
        }
    }

    class g extends com.android.volley.toolbox.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBHttpRequest f62459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ POBNetworkResultListener f62460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, String str, JSONObject jSONObject, p.b bVar, p.a aVar, POBHttpRequest pOBHttpRequest, POBNetworkResultListener pOBNetworkResultListener) {
            super(i10, str, jSONObject, bVar, aVar);
            this.f62459a = pOBHttpRequest;
            this.f62460b = pOBNetworkResultListener;
        }

        @Override // com.android.volley.toolbox.k, com.android.volley.n
        public byte[] getBody() {
            if (this.f62459a.getPostData() == null) {
                return null;
            }
            return this.f62459a.getPostData().getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.n
        public Map getHeaders() {
            return this.f62459a.getHeaders();
        }

        @Override // com.android.volley.n
        protected p parseNetworkResponse(k kVar) {
            try {
                JSONObject jSONObject = new JSONObject(new String(kVar.f7526b, com.android.volley.toolbox.e.g(kVar.f7527c, D5.N)));
                if (this.f62460b != null) {
                    Map map = kVar.f7527c;
                    if (map == null) {
                        map = new HashMap();
                    }
                    this.f62460b.onResult(new POBNetworkResult(map, kVar.f7530f));
                }
                return p.c(jSONObject, com.android.volley.toolbox.e.e(kVar));
            } catch (UnsupportedEncodingException | JSONException unused) {
                return p.a(new m(kVar));
            }
        }
    }

    class h implements o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62462a;

        h(String str) {
            this.f62462a = str;
        }

        @Override // com.android.volley.o.c
        public boolean apply(com.android.volley.n nVar) {
            if (!this.f62462a.equals(nVar.getTag())) {
                return false;
            }
            POBLog.debug(POBNetworkHandler.TAG, "Cancelled volley Ad Request for Tag <" + this.f62462a + "> ", new Object[0]);
            return true;
        }
    }

    class i implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBNetworkResultListener f62464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ POBHttpRequest f62465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ POBNetworkListener f62466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ POBNetworkRedirectListener f62467d;

        i(POBNetworkResultListener pOBNetworkResultListener, POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener) {
            this.f62464a = pOBNetworkResultListener;
            this.f62465b = pOBHttpRequest;
            this.f62466c = pOBNetworkListener;
        }

        @Override // com.android.volley.p.a
        public void onErrorResponse(u uVar) {
            if (this.f62464a != null) {
                k kVarA = POBNetworkHandler.this.a(uVar, this.f62465b);
                Map map = kVarA.f7527c;
                if (map == null) {
                    map = new HashMap();
                }
                this.f62464a.onResult(new POBNetworkResult(map, kVarA.f7530f));
            }
            if (this.f62466c != null) {
                try {
                    POBHttpRequest pOBHttpRequestA = POBNetworkHandler.this.a(uVar, this.f62465b, (POBNetworkRedirectListener) null);
                    if (pOBHttpRequestA != null) {
                        POBNetworkHandler.this.sendRequest(pOBHttpRequestA, this.f62466c);
                    } else {
                        this.f62466c.onFailure(POBNetworkHandler.this.a(uVar));
                    }
                } catch (u e10) {
                    this.f62466c.onFailure(POBNetworkHandler.this.a(e10));
                }
            }
        }
    }

    class j implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ POBNetworkResultListener f62469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ POBHttpRequest f62470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ POBNetworkRedirectListener f62471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ POBNetworkListener f62472d;

        j(POBNetworkResultListener pOBNetworkResultListener, POBHttpRequest pOBHttpRequest, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkListener pOBNetworkListener) {
            this.f62469a = pOBNetworkResultListener;
            this.f62470b = pOBHttpRequest;
            this.f62472d = pOBNetworkListener;
        }

        @Override // com.android.volley.p.a
        public void onErrorResponse(u uVar) {
            if (this.f62469a != null) {
                k kVarA = POBNetworkHandler.this.a(uVar, this.f62470b);
                Map map = kVarA.f7527c;
                if (map == null) {
                    map = new HashMap();
                }
                this.f62469a.onResult(new POBNetworkResult(map, kVarA.f7530f));
            }
            try {
                POBHttpRequest pOBHttpRequestA = POBNetworkHandler.this.a(uVar, this.f62470b, (POBNetworkRedirectListener) null);
                if (pOBHttpRequestA != null) {
                    POBNetworkHandler.this.sendJSONRequest(pOBHttpRequestA, this.f62472d);
                    return;
                }
                POBNetworkListener pOBNetworkListener = this.f62472d;
                if (pOBNetworkListener != null) {
                    pOBNetworkListener.onFailure(POBNetworkHandler.this.a(uVar));
                }
            } catch (u e10) {
                POBNetworkListener pOBNetworkListener2 = this.f62472d;
                if (pOBNetworkListener2 != null) {
                    pOBNetworkListener2.onFailure(POBNetworkHandler.this.a(e10));
                }
            }
        }
    }

    public POBNetworkHandler(@NonNull Context context) {
        this(POBVolley.newRequestQueue(context, new com.android.volley.toolbox.b(new com.android.volley.toolbox.h())));
    }

    private p.a b(POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkResultListener pOBNetworkResultListener) {
        return new j(pOBNetworkResultListener, pOBHttpRequest, pOBNetworkRedirectListener, pOBNetworkListener);
    }

    private void c(POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkResultListener pOBNetworkResultListener) {
        String url;
        int iA = a(pOBHttpRequest.getRequestMethod());
        if (pOBHttpRequest.getRequestMethod() != POBHttpRequest.HTTP_METHOD.GET || POBUtils.isNullOrEmpty(pOBHttpRequest.getPostData())) {
            url = pOBHttpRequest.getUrl();
        } else {
            url = pOBHttpRequest.getUrl() + pOBHttpRequest.getPostData();
        }
        g gVar = new g(iA, url, null, new f(pOBNetworkListener), b(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener, pOBNetworkResultListener), pOBHttpRequest, pOBNetworkResultListener);
        a(pOBHttpRequest, gVar);
        a(gVar, pOBHttpRequest.getRequestTag());
    }

    public void cancelRequest(@NonNull String str) {
        POBRequestQueue pOBRequestQueue = this.f62446a;
        if (pOBRequestQueue != null) {
            pOBRequestQueue.cancelAll((o.c) new h(str));
        }
    }

    public void sendImageRequest(@Nullable POBImageRequest pOBImageRequest, @Nullable POBImageNetworkListener<String> pOBImageNetworkListener) {
        if (pOBImageRequest == null || pOBImageRequest.getUrl() == null) {
            if (pOBImageNetworkListener != null) {
                pOBImageNetworkListener.onFailure(new POBError(1001, "Request parameter or URL is null."));
            }
        } else {
            com.android.volley.toolbox.i iVar = new com.android.volley.toolbox.i(pOBImageRequest.getUrl(), new d(pOBImageNetworkListener), pOBImageRequest.getMaxWidth(), pOBImageRequest.getMaxHeight(), pOBImageRequest.getScaleType(), pOBImageRequest.getDecodeConfig(), new e(pOBImageNetworkListener));
            a(pOBImageRequest, iVar);
            a(iVar, pOBImageRequest.getRequestTag());
        }
    }

    public void sendJSONRequest(POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener) {
        c(pOBHttpRequest, pOBNetworkListener, null, null);
    }

    public void sendRequest(@NonNull String str, @Nullable String str2, POBNetworkListener<String> pOBNetworkListener, @Nullable POBNetworkRedirectListener pOBNetworkRedirectListener) {
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setUrl(str);
        pOBHttpRequest.setRequestTag(str2);
        sendRequest(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener);
    }

    public POBNetworkHandler(@NonNull POBRequestQueue pOBRequestQueue) {
        this.f62446a = pOBRequestQueue;
    }

    private boolean b(u uVar) {
        k kVar = uVar.f7586b;
        if (kVar == null) {
            return false;
        }
        int i10 = kVar.f7525a;
        return 301 == i10 || i10 == 302 || i10 == 303;
    }

    public void sendJSONRequest(@NonNull POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener, @Nullable POBNetworkResultListener pOBNetworkResultListener) {
        c(pOBHttpRequest, pOBNetworkListener, null, pOBNetworkResultListener);
    }

    private void a(POBHttpRequest pOBHttpRequest, com.android.volley.n nVar) {
        if (pOBHttpRequest.getTimeout() > 0 || pOBHttpRequest.getRetryCount() > 0) {
            nVar.setRetryPolicy(new com.android.volley.e(pOBHttpRequest.getTimeout(), pOBHttpRequest.getRetryCount(), pOBHttpRequest.getRetryBackoffMultiplier()));
        }
    }

    public void sendRequest(String str, String str2, POBNetworkListener<String> pOBNetworkListener) {
        sendRequest(str, str2, pOBNetworkListener, null);
    }

    public void sendRequest(POBHttpRequest pOBHttpRequest, POBNetworkListener<String> pOBNetworkListener) {
        sendRequest(pOBHttpRequest, pOBNetworkListener, (POBNetworkRedirectListener) null);
    }

    public void sendRequest(@Nullable POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<String> pOBNetworkListener, @Nullable POBNetworkRedirectListener pOBNetworkRedirectListener) {
        sendRequest(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener, null, null);
    }

    public void sendRequest(@Nullable POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<String> pOBNetworkListener, @Nullable POBNetworkRedirectListener pOBNetworkRedirectListener, @Nullable POBNetworkResultListener pOBNetworkResultListener, @Nullable Boolean bool) {
        if (pOBHttpRequest == null || pOBHttpRequest.getUrl() == null || pOBHttpRequest.getRequestMethod() == null) {
            if (pOBNetworkListener != null) {
                pOBNetworkListener.onFailure(new POBError(1001, "Request parameter or URL is null."));
            }
        } else {
            c cVar = new c(a(pOBHttpRequest.getRequestMethod()), pOBHttpRequest.getUrl(), new b(pOBNetworkListener), a(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener, pOBNetworkResultListener), pOBHttpRequest, pOBNetworkResultListener);
            if (bool != null) {
                cVar.setShouldCache(bool.booleanValue());
            }
            a(pOBHttpRequest, cVar);
            a(cVar, pOBHttpRequest.getRequestTag());
        }
    }

    private void a(com.android.volley.n nVar, String str) {
        nVar.setTag(str);
        this.f62446a.add(nVar);
    }

    private int a(POBHttpRequest.HTTP_METHOD http_method) {
        int i10 = a.f62447a[http_method.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    return 0;
                }
            }
        }
        return i11;
    }

    private p.a a(POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkResultListener pOBNetworkResultListener) {
        return new i(pOBNetworkResultListener, pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k a(u uVar, POBHttpRequest pOBHttpRequest) {
        k kVar = uVar.f7586b;
        if (kVar == null) {
            kVar = new k(0, (byte[]) null, false, uVar.d(), (List) new ArrayList());
        }
        return kVar.f7530f > ((long) pOBHttpRequest.getTimeout()) ? new k(kVar.f7525a, kVar.f7526b, kVar.f7529e, pOBHttpRequest.getTimeout(), kVar.f7528d) : kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBError a(u uVar) {
        int i10;
        String message = uVar.getMessage() != null ? uVar.getMessage() : "Unknown error message.";
        if (uVar instanceof t) {
            return new POBError(1005, message);
        }
        if (uVar instanceof m) {
            if (uVar.f7586b != null) {
                String str = "Parsing error with HTTP status code: " + uVar.f7586b.f7525a;
                if (uVar.f7586b.f7525a == 204) {
                    return new POBError(1002, str);
                }
                return new POBError(1007, str);
            }
            return new POBError(1007, message);
        }
        k kVar = uVar.f7586b;
        if (kVar != null && (i10 = kVar.f7525a) >= 500 && i10 < 600) {
            return new POBError(1004, message);
        }
        return new POBError(1006, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBHttpRequest a(u uVar, POBHttpRequest pOBHttpRequest, POBNetworkRedirectListener pOBNetworkRedirectListener) throws u {
        if (!b(uVar)) {
            return null;
        }
        Map map = uVar.f7586b.f7527c;
        String str = map != null ? (String) map.get("Location") : null;
        if (str != null) {
            try {
                POBHttpRequest pOBHttpRequestM7437clone = pOBHttpRequest.m7437clone();
                pOBHttpRequestM7437clone.setUrl(str);
                if (pOBNetworkRedirectListener != null) {
                    POBHttpRequest pOBHttpRequestOnRedirect = pOBNetworkRedirectListener.onRedirect(pOBHttpRequestM7437clone);
                    if (pOBHttpRequestOnRedirect != null) {
                        return pOBHttpRequestOnRedirect;
                    }
                }
                return pOBHttpRequestM7437clone;
            } catch (CloneNotSupportedException e10) {
                throw new u(e10);
            }
        }
        throw new u("Location header does not exists for Redirection");
    }
}
