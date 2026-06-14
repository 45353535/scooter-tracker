package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {

    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f56344a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.f56344a = file;
        }

        public final File a() {
            return this.f56344a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f56344a, ((a) obj).f56344a);
        }

        public int hashCode() {
            return this.f56344a.hashCode();
        }

        public String toString() {
            return "Complete(file=" + this.f56344a + ')';
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.a.AbstractC0696a f56345a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m.a.AbstractC0696a failure) {
            super(null);
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.f56345a = failure;
        }

        public final m.a.AbstractC0696a a() {
            return this.f56345a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f56345a, ((b) obj).f56345a);
        }

        public int hashCode() {
            return this.f56345a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f56345a + ')';
        }
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f56346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f56347b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, d progress) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f56346a = file;
            this.f56347b = progress;
        }

        public final File a() {
            return this.f56346a;
        }

        public final d b() {
            return this.f56347b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f56346a, cVar.f56346a) && Intrinsics.areEqual(this.f56347b, cVar.f56347b);
        }

        public int hashCode() {
            return (this.f56346a.hashCode() * 31) + this.f56347b.hashCode();
        }

        public String toString() {
            return "InProgress(file=" + this.f56346a + ", progress=" + this.f56347b + ')';
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f56348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f56349b;

        public d(long j10, long j11) {
            this.f56348a = j10;
            this.f56349b = j11;
        }

        public final long a() {
            return this.f56348a;
        }

        public final long b() {
            return this.f56349b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f56348a == dVar.f56348a && this.f56349b == dVar.f56349b;
        }

        public int hashCode() {
            return (androidx.collection.b.a(this.f56348a) * 31) + androidx.collection.b.a(this.f56349b);
        }

        public String toString() {
            return "Progress(bytesDownloaded=" + this.f56348a + ", totalBytes=" + this.f56349b + ')';
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public h() {
    }
}
