package org.bidon.sdk.databinders.app;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.models.App;
import org.bidon.sdk.databinders.DataBinder;
import org.bidon.sdk.utils.serializer.SerializerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0002H\u0096@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lorg/bidon/sdk/databinders/app/AppBinder;", "Lorg/bidon/sdk/databinders/DataBinder;", "Lorg/json/JSONObject;", "dataSource", "Lorg/bidon/sdk/databinders/app/AppDataSource;", "<init>", "(Lorg/bidon/sdk/databinders/app/AppDataSource;)V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "getJsonObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createApp", "Lorg/bidon/sdk/config/models/App;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppBinder implements DataBinder<JSONObject> {

    @NotNull
    private final AppDataSource dataSource;

    @NotNull
    private final String fieldName;

    public AppBinder(@NotNull AppDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.fieldName = "app";
    }

    private final App createApp() {
        return new App(this.dataSource.getBundleId(), this.dataSource.getAppKey(), this.dataSource.getFramework(), this.dataSource.getAppVersionName(), this.dataSource.getFrameworkVersion(), this.dataSource.getPluginVersion());
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @NotNull
    public String getFieldName() {
        return this.fieldName;
    }

    @Override // org.bidon.sdk.databinders.DataBinder
    @Nullable
    public Object getJsonObject(@NotNull Continuation continuation) {
        return SerializerKt.serialize(createApp());
    }
}
