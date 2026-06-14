package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: loaded from: classes7.dex */
public class y extends AsyncTask {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20054d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20055e = y.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f20056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f20057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Exception f20058c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public y(HttpURLConnection httpURLConnection, z requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f20056a = httpURLConnection;
        this.f20057b = requests;
    }

    public List a(Void... params) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.f20056a;
                return httpURLConnection == null ? this.f20057b.g() : GraphRequest.f19547n.o(httpURLConnection, this.f20057b);
            } catch (Exception e10) {
                this.f20058c = e10;
                return null;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    protected void b(List result) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(result, "result");
            super.onPostExecute(result);
            Exception exc = this.f20058c;
            if (exc != null) {
                String str = f20055e;
                a1 a1Var = a1.f93282a;
                String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                com.facebook.internal.z.a0(str, str2);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            b((List) obj);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (s.B()) {
                String str = f20055e;
                a1 a1Var = a1.f93282a;
                String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                com.facebook.internal.z.a0(str, str2);
            }
            if (this.f20057b.n() == null) {
                this.f20057b.z(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f20056a + ", requests: " + this.f20057b + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(z requests) {
        this(null, requests);
        Intrinsics.checkNotNullParameter(requests, "requests");
    }
}
