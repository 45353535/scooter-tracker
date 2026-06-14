package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m {

    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f57080a = new a();

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1425206400;
        }

        public String toString() {
            return "Backgrounded";
        }
    }

    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f57081a = new b();

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -296757611;
        }

        public String toString() {
            return "Fallback";
        }
    }

    public static final class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f57082a = new c();

        public c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1208562192;
        }

        public String toString() {
            return InitializationStatus.SUCCESS;
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public m() {
    }
}
