package com.moloco.sdk.internal.services.init;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.internal.services.init.b f55661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.internal.services.init.b type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.f55661a = type;
        }

        public final com.moloco.sdk.internal.services.init.b a() {
            return this.f55661a;
        }
    }

    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55662a;

        public b(int i10) {
            super(null);
            this.f55662a = i10;
        }

        public final int a() {
            return this.f55662a;
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public i() {
    }
}
