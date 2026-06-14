package org.bidon.sdk.utils.networking;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lorg/bidon/sdk/utils/networking/BidonEndpoints;", "", "activeEndpoint", "", "getActiveEndpoint", "()Ljava/lang/String;", "init", "", "defaultBaseUrl", "loadedUrls", "", "popNextEndpoint", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BidonEndpoints {
    @NotNull
    String getActiveEndpoint();

    void init(@NotNull String defaultBaseUrl, @NotNull Set<String> loadedUrls);

    @Nullable
    String popNextEndpoint();
}
