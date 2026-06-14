package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.net.HttpHeaders;
import com.ironsource.N6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f62081a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f62083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f62086f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f62082b = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f62087g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f62088h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f62089i = 10000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f62090j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f62091k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f62092l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f62093m = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.f62090j >= am.this.f62091k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.f62083c = context;
    }

    static /* synthetic */ int c(am amVar) {
        int i10 = amVar.f62090j;
        amVar.f62090j = i10 + 1;
        return i10;
    }

    abstract String a();

    abstract void a(int i10, byte[] bArr);

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f62081a)) {
            f62081a = str;
        }
    }

    private void b() {
        Object obj;
        if (this.f62082b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f62081a)) {
                jSONObject.put("ipv6", f62081a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put(N6.V0, com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put("region", an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f62082b.addRequestProperty("cypher", String.valueOf(obj));
            this.f62082b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[Catch: all -> 0x00ca, PHI: r0
  0x00b6: PHI (r0v14 java.io.InputStream) = (r0v13 java.io.InputStream), (r0v20 java.io.InputStream) binds: [B:30:0x00b3, B:27:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ca, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0044, B:17:0x004d, B:19:0x0060, B:21:0x007d, B:23:0x0080, B:24:0x0096, B:33:0x00b9, B:32:0x00b6, B:18:0x0058), top: B:48:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.am.c():boolean");
    }

    private void a(int i10) throws ProtocolException {
        this.f62082b.setRequestMethod(i10 != 1 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "GET" : "TRACE" : "HEAD" : "DELETE" : "PUT" : "POST");
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public void a(int i10, int i11, byte[] bArr) {
        b(i10, i11, bArr);
        ar.a(this.f62093m);
    }

    private void b(int i10) {
        String str = i10 != 1 ? i10 != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (!str.isEmpty()) {
            this.f62082b.addRequestProperty("Content-Type", str);
        }
        String strB = an.b();
        if (strB != null) {
            this.f62082b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f62082b.addRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString() + StringUtils.COMMA + language + ";q=0.9");
                return;
            }
            this.f62082b.addRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString() + StringUtils.COMMA + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private void b(int i10, int i11, byte[] bArr) {
        this.f62084d = i10;
        this.f62085e = i11;
        this.f62086f = bArr;
    }
}
