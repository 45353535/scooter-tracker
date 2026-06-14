package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f46614k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f46615l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f46618c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46619d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f46620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f46621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f46623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f46624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46625j;

    public b(String str, String str2) {
        this.f46616a = str;
        a(str2);
    }

    public void a(boolean z10) {
        this.f46623h = z10;
    }

    public void b(boolean z10) {
        this.f46624i = z10;
    }

    public long c() {
        return this.f46619d;
    }

    public int d() {
        return this.f46625j;
    }

    public int e() {
        return this.f46617b;
    }

    public String f() {
        return this.f46621f;
    }

    public String g() {
        return this.f46616a;
    }

    public int h() {
        return this.f46622g;
    }

    public boolean i() {
        return this.f46623h;
    }

    public boolean j() {
        return this.f46624i;
    }

    public void a(int i10) {
        this.f46625j = i10;
    }

    public void b(int i10) {
        this.f46622g = i10;
    }

    public CampaignEx a() {
        return this.f46620e;
    }

    public void b(String str) {
        this.f46621f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f46620e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f46618c;
    }

    public void a(String str) {
        this.f46617b++;
        this.f46618c.add(str);
    }
}
