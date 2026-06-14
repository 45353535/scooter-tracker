package com.ironsource.mediationsdk;

import com.ironsource.V7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f44146a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull ISBannerSize bannerSize, @NotNull V7 containerParams) {
            Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
            Intrinsics.checkNotNullParameter(containerParams, "containerParams");
            bannerSize.a(containerParams);
        }

        private a() {
        }
    }
}
