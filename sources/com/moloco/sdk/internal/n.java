package com.moloco.sdk.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54455b;

    public static final class a extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f54456c = new a();

        public a() {
            super(300, 250, null);
        }
    }

    public static final class b extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f54457c = new b();

        public b() {
            super(320, 50, null);
        }
    }

    public static final class c extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f54458c = new c();

        public c() {
            super(728, 90, null);
        }
    }

    public /* synthetic */ n(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public int a() {
        return this.f54455b;
    }

    public int b() {
        return this.f54454a;
    }

    public n(int i10, int i11) {
        this.f54454a = i10;
        this.f54455b = i11;
    }
}
