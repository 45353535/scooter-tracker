package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public interface d {

    public static abstract class a {

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$a, reason: collision with other inner class name */
        public static final class C0768a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0768a f58158a = new C0768a();

            public C0768a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f58159a;

            public /* synthetic */ b(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            public final int a() {
                return this.f58159a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f58159a == ((b) obj).f58159a;
            }

            public int hashCode() {
                return lf.t.e(this.f58159a);
            }

            public String toString() {
                return "Countdown(seconds=" + ((Object) lf.t.f(this.f58159a)) + ')';
            }

            public b(int i10) {
                super(null);
                this.f58159a = i10;
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f58160a = new c();

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

    StateFlow l();
}
