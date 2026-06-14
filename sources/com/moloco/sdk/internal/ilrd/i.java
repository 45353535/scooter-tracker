package com.moloco.sdk.internal.ilrd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f54415a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f54415a = reason;
        }

        public final String a() {
            return this.f54415a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f54415a, ((a) obj).f54415a);
        }

        public int hashCode() {
            return this.f54415a.hashCode();
        }

        public String toString() {
            return "Error(reason=" + this.f54415a + ')';
        }
    }

    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f54416a = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f54417a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public i() {
    }
}
