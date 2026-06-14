package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f51963f = "i";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile i f51964g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, InetAddress> f51965a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f51966b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51968d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51969e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.buffer.sharedperference.a f51967c = com.mbridge.msdk.foundation.buffer.sharedperference.a.b();

    private static class a implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f51970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f51971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f51972c;

        public a(String str, String str2, String str3) {
            this.f51970a = str;
            this.f51971b = str2;
            this.f51972c = str3;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            i.b().b(this.f51970a, this.f51971b, this.f51972c);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    private i() {
    }

    public static i b() {
        if (f51964g == null) {
            synchronized (i.class) {
                try {
                    if (f51964g == null) {
                        f51964g = new i();
                    }
                } finally {
                }
            }
        }
        return f51964g;
    }

    private void d(String str) {
        try {
            this.f51969e = e(com.mbridge.msdk.foundation.same.net.utils.d.h().f48752y);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(k0.a(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && next.contains(this.f51969e)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f51965a.put(next, InetAddress.getByAddress(next, com.mbridge.msdk.foundation.same.c.b(string)));
                        } catch (UnknownHostException e10) {
                            this.f51968d = String.format("create InetAddress failed for %s with ip %s", next, string);
                            q0.b(f51963f, "init: local dns cache error", e10);
                        }
                    }
                }
            }
            this.f51966b.set(true);
        } catch (Exception e11) {
            q0.b(f51963f, "init: local dns cache json parse error", e11);
            this.f51968d = "parse local dns config error";
            this.f51965a.clear();
            this.f51966b.set(false);
        }
    }

    private static String e(String str) {
        return str.replace("https://{}", "").replace("http://{}", "");
    }

    public boolean c(String str) {
        return TextUtils.equals(str, com.mbridge.msdk.foundation.same.net.utils.d.h().f48730e.replace(DtbConstants.HTTPS, ""));
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str) || !e()) {
            return;
        }
        this.f51966b.set(false);
        this.f51965a.clear();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f51966b.set(false);
        this.f51968d = "download local dns config error";
    }

    public boolean e() {
        return s0.a().b("local_dns", false, false);
    }

    private void a() {
        String strA = this.f51967c.a(Reporting.EventType.CACHE);
        String strA2 = this.f51967c.a("url");
        String strB = s0.a().b("local_dns_config_url", "", false);
        if (TextUtils.isEmpty(strB)) {
            this.f51967c.a(Reporting.EventType.CACHE, "");
        } else if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA2) && TextUtils.equals(strB, strA2)) {
            d(strA);
        } else {
            a(strB);
        }
    }

    public boolean c(String str, String str2, String str3) {
        if (e() && d() && TextUtils.equals(str, "campaign") && !c(str3)) {
            return TextUtils.equals(str2, String.valueOf(94)) || TextUtils.equals(str2, String.valueOf(MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        }
        return false;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    private void a(String str) {
        a(str, com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER) + File.separator, b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, String str3) {
        try {
            String strA = com.mbridge.msdk.foundation.same.c.a(new FileInputStream(new File(str2, str3)));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.f51967c.a(Reporting.EventType.CACHE, strA);
            this.f51967c.a("url", str);
            d(strA);
        } catch (Exception e10) {
            q0.b(f51963f, "downloadLocalDNSConfig: onDownloadComplete: file not found", e10);
            this.f51968d = "find local dns config file error";
        }
    }

    private void a(String str, String str2, String str3) {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str3, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withConnectTimeout(30000L).withReadTimeout(30000L).withWriteTimeout(30000L).withTimeout(30000L).withHttpRetryCounter(5).withDirectoryPathInternal(str2).withDownloadPriority(DownloadPriority.HIGH).withDownloadStateListener(new a(str, str2, str3)).build().start();
    }

    public boolean d() {
        return this.f51966b.get() && !this.f51965a.isEmpty();
    }

    public List<InetAddress> a(@NonNull String str, UnknownHostException unknownHostException) throws UnknownHostException {
        InetAddress inetAddress;
        try {
            inetAddress = this.f51965a.get(str);
        } catch (Exception e10) {
            q0.b(f51963f, "lookup: local dns cache error", e10);
            inetAddress = null;
        }
        if (inetAddress != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(inetAddress);
            return arrayList;
        }
        throw unknownHostException;
    }
}
