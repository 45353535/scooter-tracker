package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;
import com.mbridge.msdk.foundation.controller.a;

/* JADX INFO: loaded from: classes10.dex */
public class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c f48297t;

    private c() {
    }

    public static c n() {
        if (f48297t == null) {
            synchronized (c.class) {
                try {
                    if (f48297t == null) {
                        f48297t = new c();
                    }
                } finally {
                }
            }
        }
        return f48297t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    protected void a(a.e eVar) {
    }
}
