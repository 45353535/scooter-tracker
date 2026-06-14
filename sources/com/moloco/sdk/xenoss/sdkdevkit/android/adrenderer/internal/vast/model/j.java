package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f57576a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List companions) {
            super(null);
            Intrinsics.checkNotNullParameter(companions, "companions");
            this.f57576a = companions;
        }

        public final List a() {
            return this.f57576a;
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f57577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r linear) {
            super(null);
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.f57577a = linear;
        }

        public final r a() {
            return this.f57577a;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
