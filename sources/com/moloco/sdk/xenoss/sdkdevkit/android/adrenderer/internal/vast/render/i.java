package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {

    public static final class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58218a;

        public a(long j10) {
            super(null);
            this.f58218a = j10;
        }

        public final long a() {
            return this.f58218a;
        }
    }

    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58219a = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f58221b;

        public c(long j10, long j11) {
            super(null);
            this.f58220a = j10;
            this.f58221b = j11;
        }

        public final long a() {
            return this.f58220a;
        }

        public final long b() {
            return this.f58221b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f58220a == cVar.f58220a && this.f58221b == cVar.f58221b;
        }

        public int hashCode() {
            return (androidx.collection.b.a(this.f58220a) * 31) + androidx.collection.b.a(this.f58221b);
        }

        public String toString() {
            return "Position(currentPositionMillis=" + this.f58220a + ", totalDurationMillis=" + this.f58221b + ')';
        }
    }

    public static final class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58222a;

        public d(long j10) {
            super(null);
            this.f58222a = j10;
        }

        public final long a() {
            return this.f58222a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f58222a == ((d) obj).f58222a;
        }

        public int hashCode() {
            return androidx.collection.b.a(this.f58222a);
        }

        public String toString() {
            return "Preparing(totalDurationMillis=" + this.f58222a + ')';
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public i() {
    }
}
