package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public enum We {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42002a;

    We(int i10) {
        this.f42002a = i10;
    }

    public final int b() {
        return this.f42002a;
    }
}
