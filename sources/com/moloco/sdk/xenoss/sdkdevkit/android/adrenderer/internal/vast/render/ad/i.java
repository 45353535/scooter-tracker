package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public interface i extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d, q {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f57745a;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a, reason: collision with other inner class name */
        public static final class C0751a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j f57746b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f57747c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0751a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j viewModel, boolean z10) {
                super(z10, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f57746b = viewModel;
                this.f57747c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f57747c;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j b() {
                return this.f57746b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0751a)) {
                    return false;
                }
                C0751a c0751a = (C0751a) obj;
                return Intrinsics.areEqual(this.f57746b, c0751a.f57746b) && this.f57747c == c0751a.f57747c;
            }

            public int hashCode() {
                return (this.f57746b.hashCode() * 31) + androidx.compose.foundation.c.a(this.f57747c);
            }

            public String toString() {
                return "Companion(viewModel=" + this.f57746b + ", isLastAdPart=" + this.f57747c + ')';
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f57748b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f57749c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, boolean z10) {
                super(z10, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f57748b = viewModel;
                this.f57749c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f57749c;
            }

            public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e b() {
                return this.f57748b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f57748b, bVar.f57748b) && this.f57749c == bVar.f57749c;
            }

            public int hashCode() {
                return (this.f57748b.hashCode() * 31) + androidx.compose.foundation.c.a(this.f57749c);
            }

            public String toString() {
                return "DEC(viewModel=" + this.f57748b + ", isLastAdPart=" + this.f57749c + ')';
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final m f57750b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f57751c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(m viewModel, boolean z10) {
                super(z10, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f57750b = viewModel;
                this.f57751c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f57751c;
            }

            public final m b() {
                return this.f57750b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f57750b, cVar.f57750b) && this.f57751c == cVar.f57751c;
            }

            public int hashCode() {
                return (this.f57750b.hashCode() * 31) + androidx.compose.foundation.c.a(this.f57751c);
            }

            public String toString() {
                return "Linear(viewModel=" + this.f57750b + ", isLastAdPart=" + this.f57751c + ')';
            }
        }

        public static final class d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p f57752b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f57753c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(p viewModel, boolean z10) {
                super(z10, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f57752b = viewModel;
                this.f57753c = z10;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a
            public boolean a() {
                return this.f57753c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f57752b, dVar.f57752b) && this.f57753c == dVar.f57753c;
            }

            public int hashCode() {
                return (this.f57752b.hashCode() * 31) + androidx.compose.foundation.c.a(this.f57753c);
            }

            public String toString() {
                return "Mraid(viewModel=" + this.f57752b + ", isLastAdPart=" + this.f57753c + ')';
            }
        }

        public /* synthetic */ a(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10);
        }

        public abstract boolean a();

        public a(boolean z10) {
            this.f57745a = z10;
        }
    }

    void A();

    StateFlow k();

    StateFlow n();

    void x();

    void z();
}
