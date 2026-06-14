package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f58223a;

        public a(int i10) {
            super(null);
            this.f58223a = i10;
        }

        public final int a() {
            return this.f58223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f58223a == ((a) obj).f58223a;
        }

        public int hashCode() {
            return this.f58223a;
        }

        public String toString() {
            return "Html(webViewId=" + this.f58223a + ')';
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f58225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f58226c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String imageUrl, int i10, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.f58224a = imageUrl;
            this.f58225b = i10;
            this.f58226c = i11;
        }

        public final int a() {
            return this.f58226c;
        }

        public final String b() {
            return this.f58224a;
        }

        public final int c() {
            return this.f58225b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f58224a, bVar.f58224a) && this.f58225b == bVar.f58225b && this.f58226c == bVar.f58226c;
        }

        public int hashCode() {
            return (((this.f58224a.hashCode() * 31) + this.f58225b) * 31) + this.f58226c;
        }

        public String toString() {
            return "Image(imageUrl=" + this.f58224a + ", w=" + this.f58225b + ", h=" + this.f58226c + ')';
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
