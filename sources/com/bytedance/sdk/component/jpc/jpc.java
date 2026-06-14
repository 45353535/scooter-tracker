package com.bytedance.sdk.component.jpc;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jpc implements Comparable<jpc>, Runnable {
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16487ud;

    public jpc(String str, int i10) {
        this.qdl = 0;
        this.qdl = i10 == 0 ? 5 : i10;
        this.f16487ud = str;
    }

    public String getName() {
        return this.f16487ud;
    }

    public int getPriority() {
        return this.qdl;
    }

    public void setPriority(int i10) {
        this.qdl = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(jpc jpcVar) {
        if (getPriority() < jpcVar.getPriority()) {
            return 1;
        }
        return getPriority() >= jpcVar.getPriority() ? -1 : 0;
    }

    public jpc(String str) {
        this.qdl = 5;
        this.f16487ud = str;
    }
}
