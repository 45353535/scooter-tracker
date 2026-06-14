package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51802a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f51805d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f51810i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51803b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51804c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f51808g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f51809h = 604800000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f51811j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51812k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f51807f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51806e = UUID.randomUUID().toString();

    public e(String str) {
        this.f51802a = str;
    }

    public void a(int i10) {
        this.f51804c = i10;
    }

    public void b(int i10) {
        this.f51803b = i10;
    }

    public void c(long j10) {
        this.f51807f = j10;
    }

    public long d() {
        return this.f51808g;
    }

    public String g() {
        return this.f51802a;
    }

    public int h() {
        return this.f51804c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f51805d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f51805d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f51810i;
    }

    public long k() {
        return this.f51809h;
    }

    public long l() {
        return this.f51807f;
    }

    public int m() {
        return this.f51803b;
    }

    public String n() {
        return this.f51806e;
    }

    public boolean o() {
        return this.f51812k;
    }

    public boolean p() {
        return this.f51811j;
    }

    public void a(JSONObject jSONObject) {
        this.f51805d = jSONObject;
    }

    void b(long j10) {
        this.f51809h = j10;
    }

    void a(String str) {
        this.f51806e = str;
    }

    public void a(long j10) {
        this.f51808g = j10;
    }

    public void a(h hVar) {
        this.f51810i = hVar;
    }

    public void a(boolean z10) {
        this.f51812k = z10;
    }
}
