package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public class w8 extends ya {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f61009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f61010e;

    public w8(String str) {
        super("playheadReachedValue", str);
        this.f61009d = -1.0f;
        this.f61010e = -1.0f;
    }

    public static w8 a(String str) {
        return new w8(str);
    }

    public void b(float f10) {
        this.f61009d = f10;
    }

    public float d() {
        return this.f61010e;
    }

    public float e() {
        return this.f61009d;
    }

    public String toString() {
        return "ProgressStat{value=" + this.f61009d + ", pvalue=" + this.f61010e + '}';
    }

    public void a(float f10) {
        this.f61010e = f10;
    }
}
