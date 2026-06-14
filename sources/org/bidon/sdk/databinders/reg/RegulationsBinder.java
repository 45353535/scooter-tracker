package org.bidon.sdk.databinders.reg;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.databinders.DataBinder;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lorg/bidon/sdk/databinders/reg/RegulationsBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "dataSource", "Lorg/bidon/sdk/databinders/reg/RegulationDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/reg/RegulationDataSource;)V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegulationsBinder implements DataBinder<JSONObject> {

    @NotNull
    private final RegulationDataSource dataSource;

    public RegulationsBinder(@NotNull RegulationDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return "regs";
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        return SerializerKt.serialize(this.dataSource.getRegulationsRequestBody());
    }
}
