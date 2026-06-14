package com.my.target;

import com.my.target.common.CustomParams;
import com.my.target.mediation.AdNetworkConfig;
import com.vungle.ads.internal.signals.SignalManager;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f59922h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile String f59925k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomParams f59915a = new CustomParams();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f59916b = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f59917c = SignalManager.TWENTY_FOUR_HOURS_MILLIS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59918d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59919e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59920f = 360;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59923i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f59926l = o.f60433i;

    public j(int i10, String str) {
        this.f59924j = i10;
        this.f59925k = str;
    }

    public static j a(int i10, String str) {
        return new j(i10, str);
    }

    public void b(boolean z10) {
        this.f59919e = z10;
    }

    public void c(String str) {
        this.f59925k = str;
    }

    public void d(int i10) {
        this.f59920f = i10;
    }

    public long e() {
        return this.f59917c;
    }

    public int f() {
        return this.f59923i;
    }

    public CustomParams g() {
        return this.f59915a;
    }

    public String h() {
        return this.f59925k;
    }

    public int i() {
        return this.f59924j;
    }

    public int j() {
        return this.f59920f;
    }

    public boolean k() {
        return this.f59918d;
    }

    public boolean l() {
        return this.f59919e;
    }

    public o a() {
        return this.f59926l;
    }

    public void b(String str) {
        this.f59922h = str;
    }

    public void c(int i10) {
        this.f59924j = i10;
    }

    public String d() {
        return this.f59922h;
    }

    public void a(o oVar) {
        this.f59926l = oVar;
        oVar.a(this.f59923i);
    }

    public void b(int i10) {
        this.f59923i = i10;
        this.f59926l.a(i10);
    }

    public int c() {
        return this.f59921g;
    }

    public void a(long j10) {
        if (j10 < 0) {
            this.f59917c = 0L;
        } else {
            this.f59917c = j10;
        }
    }

    public Collection b() {
        return this.f59916b.values();
    }

    public void a(int i10) {
        this.f59921g = i10;
    }

    public void a(boolean z10) {
        this.f59918d = z10;
    }

    public void a(String str, AdNetworkConfig adNetworkConfig) {
        this.f59916b.put(str.toLowerCase(), adNetworkConfig);
    }

    public AdNetworkConfig a(String str) {
        return (AdNetworkConfig) this.f59916b.get(str.toLowerCase());
    }
}
