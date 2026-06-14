package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f46931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f46934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46935e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46936f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f46938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f46939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f46940j;

    public b(T t10, String str, String str2, int i10) {
        this.f46931a = t10;
        this.f46937g = str2;
        this.f46932b = i10;
        try {
            URL url = new URL(str);
            this.f46933c = url.getProtocol() + "://" + url.getHost() + url.getPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("resourceUrl: ");
            sb2.append(this.f46933c);
            q0.a("DownloadMessage", sb2.toString());
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public void a(String str, Object obj) {
        if (this.f46934d == null) {
            this.f46934d = new HashMap(4);
        }
        this.f46934d.put(str, obj);
    }

    public float b() {
        return this.f46940j;
    }

    public int c() {
        return this.f46932b;
    }

    public String d() {
        return this.f46933c;
    }

    public String e() {
        return this.f46937g;
    }

    public String f() {
        return this.f46936f;
    }

    public boolean g() {
        return this.f46938h;
    }

    public void a(String str) {
        this.f46936f = str;
    }

    public void a(boolean z10) {
        this.f46938h = z10;
    }

    public long a() {
        return this.f46939i;
    }

    public void a(long j10) {
        this.f46939i = j10;
    }

    public void a(float f10) {
        this.f46940j = f10;
    }
}
