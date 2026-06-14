package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f57649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57651c;

    public y(List ads, String str, String str2) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        this.f57649a = ads;
        this.f57650b = str;
        this.f57651c = str2;
    }

    public final List a() {
        return this.f57649a;
    }

    public final String b() {
        return this.f57650b;
    }
}
