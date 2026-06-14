package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f48232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f48233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f48235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f48237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f48238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f48239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f48240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f48241j;

    public void a(long j10) {
        this.f48241j = j10;
    }

    public double b() {
        return this.f48233b;
    }

    public long c() {
        return this.f48241j;
    }

    public String d() {
        return this.f48234c;
    }

    public String e() {
        return this.f48235d;
    }

    public int f() {
        return this.f48236e;
    }

    public int g() {
        return this.f48238g;
    }

    public long h() {
        return this.f48239h;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f48232a;
    }

    public void b(String str) {
        this.f48234c = str;
    }

    public void c(String str) {
        this.f48235d = str;
    }

    public void d(String str) {
        this.f48240i = str;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f48232a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f48238g = i10;
    }

    public void c(long j10) {
        this.f48239h = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f48233b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f48237f = j10;
    }

    public void a(int i10) {
        this.f48236e = i10;
    }
}
