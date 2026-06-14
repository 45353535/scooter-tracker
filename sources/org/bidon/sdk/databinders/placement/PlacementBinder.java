package org.bidon.sdk.databinders.placement;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.models.Capping;
import org.bidon.sdk.config.models.Placement;
import org.bidon.sdk.config.models.Reward;
import org.bidon.sdk.databinders.DataBinder;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lorg/bidon/sdk/databinders/placement/PlacementBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "dataSource", "Lorg/bidon/sdk/databinders/placement/PlacementDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/placement/PlacementDataSource;)V", "getDataSource", "()Lorg/bidon/sdk/databinders/placement/PlacementDataSource;", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPlacement", "Lorg/bidon/sdk/config/models/Placement;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlacementBinder implements DataBinder<JSONObject> {

    @NotNull
    private final PlacementDataSource dataSource;

    @NotNull
    private final String fieldName;

    public PlacementBinder(@NotNull PlacementDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.fieldName = "placement";
    }

    private final Placement createPlacement() {
        Reward reward;
        String rewardType = this.dataSource.getRewardType();
        Integer rewardAmount = this.dataSource.getRewardAmount();
        if (rewardAmount != null) {
            int iIntValue = rewardAmount.intValue();
            if (rewardType == null) {
                rewardType = "";
            }
            reward = new Reward(rewardType, iIntValue);
        } else {
            reward = null;
        }
        return new Placement(this.dataSource.getName(), reward, new Capping(this.dataSource.getCappingSetting(), this.dataSource.getCappingValue()));
    }

    @NotNull
    public final PlacementDataSource getDataSource() {
        return this.dataSource;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        return SerializerKt.serialize(createPlacement());
    }
}
