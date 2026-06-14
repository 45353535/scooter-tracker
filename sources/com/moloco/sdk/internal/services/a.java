package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.moloco.sdk.internal.services.a$a, reason: collision with other inner class name */
    public static final class C0679a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0679a(String carrier) {
            super(null);
            Intrinsics.checkNotNullParameter(carrier, "carrier");
            this.f55272a = carrier;
        }

        public final String a() {
            return this.f55272a;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f55273a = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f55274a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
