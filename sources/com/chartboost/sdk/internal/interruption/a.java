package com.chartboost.sdk.internal.interruption;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0307a f17985b = new C0307a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17986c = new a("APP_LIFECYCLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f17987d = new a("AUDIO");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17988e = new a("CUSTOM");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17989a;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.a$a, reason: collision with other inner class name */
    public static final class C0307a {
        public /* synthetic */ C0307a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f17986c;
        }

        public final a b() {
            return a.f17987d;
        }

        public C0307a() {
        }
    }

    public a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17989a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f17989a, ((a) obj).f17989a);
    }

    public int hashCode() {
        return this.f17989a.hashCode();
    }

    public String toString() {
        return "InterruptionType(name=" + this.f17989a + ")";
    }
}
