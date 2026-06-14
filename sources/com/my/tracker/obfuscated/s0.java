package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public abstract class s0 {

    public interface a {
        String a();

        void a(OutputStream outputStream);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f61818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f61819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f61820c;

        private b() {
        }

        static b d() {
            return new b();
        }

        public String a() {
            return this.f61820c;
        }

        public Object b() {
            return this.f61819b;
        }

        public boolean c() {
            return this.f61818a;
        }
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public abstract b a(String str);

    public static s0 a(a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z10) {
        if (okHttpClientProvider != null) {
            try {
                return new k1(aVar, okHttpClientProvider, z10);
            } catch (Throwable th2) {
                x2.a("HttpRequest error: error while creating OkHttpPostRequest", th2);
            }
        }
        return new r0(aVar, z10);
    }

    public static s0 a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new j1(okHttpClientProvider);
            } catch (Throwable th2) {
                x2.a("HttpRequest error: error while creating OkHttpPostRequest", th2);
            }
        }
        return new q0();
    }
}
