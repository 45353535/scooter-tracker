package org.bidon.sdk.databinders.user;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bidon.sdk.databinders.DataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/bidon/sdk/databinders/user/UserDataSource;", "Lorg/bidon/sdk/databinders/DataSource;", "getTrackingAuthorizationStatus", "", "getApplicationId", "getAdvertisingId", "getAppSetId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetIdScope", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface UserDataSource extends DataSource {
    @NotNull
    String getAdvertisingId();

    @Nullable
    Object getAppSetId(@NotNull Continuation continuation);

    @Nullable
    Object getAppSetIdScope(@NotNull Continuation continuation);

    @NotNull
    String getApplicationId();

    @NotNull
    String getTrackingAuthorizationStatus();
}
