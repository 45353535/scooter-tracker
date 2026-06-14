package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/utils/networking/NetworkSettings;", "", "<init>", "()V", "BidonBaseUrl", "", "basicAuthHeader", "getBasicAuthHeader", "()Ljava/lang/String;", "setBasicAuthHeader", "(Ljava/lang/String;)V", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkSettings {

    @NotNull
    public static final String BidonBaseUrl = "https://api.bidon.org";

    @NotNull
    public static final NetworkSettings INSTANCE = new NetworkSettings();

    @Nullable
    private static String basicAuthHeader;

    private NetworkSettings() {
    }

    @Nullable
    public final String getBasicAuthHeader() {
        return basicAuthHeader;
    }

    public final void setBasicAuthHeader(@Nullable String str) {
        basicAuthHeader = str;
    }
}
