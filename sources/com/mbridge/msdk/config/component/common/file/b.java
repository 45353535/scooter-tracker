package com.mbridge.msdk.config.component.common.file;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46760f;

    public String a() {
        return this.f46757c + this.f46755a;
    }

    public void b(String str) {
        this.f46755a = str;
    }

    public void c(String str) {
        this.f46756b = str;
    }

    public String d() {
        return this.f46759e;
    }

    public void e(String str) {
        this.f46759e = str;
    }

    @NonNull
    public String toString() {
        return "FileDescription{fileName='" + this.f46755a + "', fileType='" + this.f46756b + "', dirPath='" + this.f46757c + "', unZipDirPath='" + this.f46758d + "', unZipFilePath='" + this.f46759e + "', fileExists=" + this.f46760f + '}';
    }

    public void a(String str) {
        this.f46757c = str;
    }

    public String b() {
        return this.f46756b;
    }

    public String c() {
        return this.f46758d;
    }

    public void d(String str) {
        this.f46758d = str;
    }

    public boolean e() {
        return this.f46760f;
    }

    public void a(boolean z10) {
        this.f46760f = z10;
    }
}
