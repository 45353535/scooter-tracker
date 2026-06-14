package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class G7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pa f75810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f75811b = "";

    public G7(Pa pa2) {
        this.f75810a = pa2;
    }

    public final void a(String str, boolean z10) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || Intrinsics.areEqual(this.f75811b, str)) {
                return;
            }
            this.f75811b = str;
            this.f75810a.a(str, z10);
        }
    }
}
