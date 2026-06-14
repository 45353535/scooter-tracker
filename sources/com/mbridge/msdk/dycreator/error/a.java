package com.mbridge.msdk.dycreator.error;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48135b;

    public a(b bVar) {
        if (bVar != null) {
            this.f48134a = bVar.d();
            this.f48135b = bVar.g();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f48134a + '}';
    }

    public a(int i10, String str) {
        this.f48134a = i10;
        this.f48135b = str;
    }
}
