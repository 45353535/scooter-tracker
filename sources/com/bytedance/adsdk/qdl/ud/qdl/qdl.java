package com.bytedance.adsdk.qdl.ud.qdl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Object[] f15975ud;

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.qdl + "', args=" + Arrays.toString(this.f15975ud) + '}';
    }

    public Object[] ud() {
        return this.f15975ud;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void qdl(Object[] objArr) {
        this.f15975ud = objArr;
    }
}
