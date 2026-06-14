package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w {
    public static void a(String str) {
        if (z.f23162a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (z.f23162a >= 18) {
            Trace.endSection();
        }
    }
}
