package com.appodeal.ads.adapters.iab.unified;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f12298j = new f() { // from class: com.appodeal.ads.adapters.iab.unified.v
        @Override // com.appodeal.ads.adapters.iab.unified.f
        public final void a(URLConnection uRLConnection, String str, c cVar) {
            x.d(uRLConnection, str, cVar);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ boolean f12299k = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f12301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f12302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RestrictedData f12304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f12305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f12306h = new s(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f12307i = new e() { // from class: com.appodeal.ads.adapters.iab.unified.w
        @Override // com.appodeal.ads.adapters.iab.unified.e
        public final void a(Object obj) {
            this.f12297a.a(obj);
        }
    };

    public x(Context context, String str, RestrictedData restrictedData, f fVar, d dVar, u uVar) {
        this.f12300b = context;
        this.f12303e = str;
        this.f12304f = restrictedData;
        this.f12301c = fVar;
        this.f12302d = dVar;
        this.f12305g = new t(Looper.getMainLooper(), uVar, context);
    }

    public static void d(URLConnection uRLConnection, String str, c cVar) {
        s sVar = (s) cVar;
        sVar.getClass();
        try {
            x xVar = sVar.f12294a;
            xVar.f12302d.a(str, xVar.f12307i);
        } catch (Throwable th2) {
            Log.log(th2);
            x xVar2 = sVar.f12294a;
            xVar2.f12305g.obtainMessage(0, LoadingError.InternalError).sendToTarget();
        }
    }

    public final void a(Object obj) {
        this.f12305g.sendMessage(this.f12305g.obtainMessage(1, obj));
    }

    public final void b(HttpURLConnection httpURLConnection) throws IOException {
        String strY1;
        InputStream inputStream = httpURLConnection.getInputStream();
        Lazy lazy = com.appodeal.ads.adapters.iab.utils.n.f12324a;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            strY1 = StringsKt.y1(com.appodeal.ads.adapters.iab.utils.n.c(inputStream), '\n');
        } catch (Exception e10) {
            Log.log(e10);
            strY1 = null;
        }
        if (TextUtils.isEmpty(strY1) || TextUtils.getTrimmedLength(strY1) == 0) {
            this.f12305g.obtainMessage(0, LoadingError.NoFill).sendToTarget();
        } else {
            if (!f12299k && strY1 == null) {
                throw new AssertionError();
            }
            this.f12301c.a(httpURLConnection, strY1, this.f12306h);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (TextUtils.isEmpty(this.f12303e) || TextUtils.getTrimmedLength(this.f12303e) == 0) {
            this.f12305g.obtainMessage(0, LoadingError.IncorrectAdunit).sendToTarget();
            return;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                if (!f12299k && this.f12303e == null) {
                    throw new AssertionError();
                }
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.f12303e).openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(20000);
                    httpURLConnection2.setReadTimeout(20000);
                    String httpAgent = this.f12304f.getHttpAgent(this.f12300b);
                    if (!TextUtils.isEmpty(httpAgent)) {
                        httpURLConnection2.setRequestProperty("User-Agent", httpAgent);
                    }
                    b(httpURLConnection2);
                    httpURLConnection2.disconnect();
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    Log.log(e);
                    this.f12305g.obtainMessage(0, LoadingError.InternalError).sendToTarget();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
