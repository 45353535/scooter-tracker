package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static String f51817i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static String f51818j = "DROP TABLE IF EXISTS %s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f51819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f51823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51824f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f51825g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f51826h;

    public i(e eVar) {
        this.f51819a = eVar;
        this.f51822d = eVar.n();
    }

    public void a(boolean z10) {
        this.f51825g = z10;
    }

    public void b(boolean z10) {
        this.f51824f = z10;
    }

    public e d() {
        return this.f51819a;
    }

    public long g() {
        return this.f51823e;
    }

    public int h() {
        return this.f51820b;
    }

    public String i() {
        return this.f51826h;
    }

    public int j() {
        return this.f51821c;
    }

    public String k() {
        return this.f51822d;
    }

    public boolean l() {
        return this.f51825g;
    }

    public boolean m() {
        return this.f51824f;
    }

    public void a(int i10) {
        this.f51820b = i10;
    }

    public void b(int i10) {
        this.f51821c = i10;
    }

    public void a(long j10) {
        this.f51823e = j10;
    }

    public void a(String str) {
        this.f51826h = str;
    }
}
