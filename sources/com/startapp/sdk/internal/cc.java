package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class cc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cc f64364d = new cc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac f64366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64367c;

    public cc(Locale primary, LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f64365a = primary.toString();
        this.f64366b = new ac(linkedHashSet);
        this.f64367c = bc.a(primary, linkedHashSet, ',');
    }

    public cc() {
        this.f64365a = null;
        this.f64366b = null;
        this.f64367c = null;
    }
}
