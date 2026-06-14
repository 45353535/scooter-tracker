package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60521b;

    public p6() {
        this.f60520a = -1;
        this.f60521b = "none";
    }

    public static p6 a(String str) {
        int i10;
        i10 = 1;
        str.getClass();
        switch (str) {
            case "none":
                i10 = -1;
                break;
            case "portrait":
                break;
            case "landscape":
                i10 = 0;
                break;
            default:
                return null;
        }
        return new p6(str, i10);
    }

    public static p6 b() {
        return new p6();
    }

    public String toString() {
        return this.f60521b;
    }

    public int a() {
        return this.f60520a;
    }

    public p6(String str, int i10) {
        this.f60521b = str;
        this.f60520a = i10;
    }
}
