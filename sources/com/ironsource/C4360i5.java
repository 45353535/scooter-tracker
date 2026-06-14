package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4360i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43357a = new Date().getTime();

    public static long a(C4360i5 c4360i5) {
        if (c4360i5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4360i5.f43357a;
    }
}
