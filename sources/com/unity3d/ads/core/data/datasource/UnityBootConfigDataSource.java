package com.unity3d.ads.core.data.datasource;

import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "", "getValue", "", C4240b4.i.W, y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface UnityBootConfigDataSource {

    @NotNull
    public static final String BUILD_GUID = "build-guid";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource$Companion;", "", "()V", "BUILD_GUID", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String BUILD_GUID = "build-guid";

        private Companion() {
        }
    }

    @Nullable
    String getValue(@NotNull String key);
}
