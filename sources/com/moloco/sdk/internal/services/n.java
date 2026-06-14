package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n {

    public static final class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f55705a = id2;
        }

        public final String a() {
            return this.f55705a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f55705a, ((a) obj).f55705a);
        }

        public int hashCode() {
            return this.f55705a.hashCode();
        }

        public String toString() {
            return "Available(id=" + this.f55705a + ')';
        }
    }

    public static final class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f55706a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public n() {
    }
}
