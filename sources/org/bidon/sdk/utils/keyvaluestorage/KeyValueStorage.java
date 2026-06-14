package org.bidon.sdk.utils.keyvaluestorage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0013\u001a\u00020\u0014H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0005\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0005\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "", "applicationId", "", "getApplicationId", "()Ljava/lang/String;", "appKey", "getAppKey", "setAppKey", "(Ljava/lang/String;)V", "token", "getToken", "setToken", "host", "getHost", "setHost", "segmentUid", "getSegmentUid", "setSegmentUid", "clear", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface KeyValueStorage {
    void clear();

    @Nullable
    String getAppKey();

    @NotNull
    String getApplicationId();

    @Nullable
    String getHost();

    @Nullable
    String getSegmentUid();

    @Nullable
    String getToken();

    void setAppKey(@Nullable String str);

    void setHost(@Nullable String str);

    void setSegmentUid(@Nullable String str);

    void setToken(@Nullable String str);
}
