package com.mobilefuse.sdk.assetsmanager;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManifestResponse;", "", "paths", "", "", "(Ljava/util/Map;)V", "getPaths", "()Ljava/util/Map;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", y.f66058y, "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MobileFuseAssetManifestResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, String> paths;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManifestResponse$Companion;", "", "()V", "jsonToMap", "", "", "jsonObject", "Lorg/json/JSONObject;", "mapperFromJson", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/assetsmanager/MobileFuseAssetManifestResponse;", "jsonText", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        private final Map<String, String> jsonToMap(JSONObject jsonObject) throws JSONException {
            Iterator<String> itKeys = jsonObject.keys();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                String value = jsonObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                linkedHashMap.put(key, value);
            }
            return linkedHashMap;
        }

        @NotNull
        public final Either<BaseError, MobileFuseAssetManifestResponse> mapperFromJson(@NotNull String jsonText) {
            Either errorResult;
            Object value;
            Intrinsics.checkNotNullParameter(jsonText, "jsonText");
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                errorResult = new SuccessResult(new SuccessResult(new MobileFuseAssetManifestResponse(MobileFuseAssetManifestResponse.INSTANCE.jsonToMap(new JSONObject(jsonText)))));
            } catch (Throwable th2) {
                if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                    StabilityHelper.logException("[Automatically caught]", th2);
                }
                errorResult = new ErrorResult(th2);
            }
            if (errorResult instanceof ErrorResult) {
                value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
            } else {
                if (!(errorResult instanceof SuccessResult)) {
                    throw new m();
                }
                value = ((SuccessResult) errorResult).getValue();
            }
            return (Either) value;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MobileFuseAssetManifestResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MobileFuseAssetManifestResponse copy$default(MobileFuseAssetManifestResponse mobileFuseAssetManifestResponse, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = mobileFuseAssetManifestResponse.paths;
        }
        return mobileFuseAssetManifestResponse.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.paths;
    }

    @NotNull
    public final MobileFuseAssetManifestResponse copy(@NotNull Map<String, String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        return new MobileFuseAssetManifestResponse(paths);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof MobileFuseAssetManifestResponse) && Intrinsics.areEqual(this.paths, ((MobileFuseAssetManifestResponse) other).paths);
        }
        return true;
    }

    @NotNull
    public final Map<String, String> getPaths() {
        return this.paths;
    }

    public int hashCode() {
        Map<String, String> map = this.paths;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "MobileFuseAssetManifestResponse(paths=" + this.paths + ")";
    }

    public MobileFuseAssetManifestResponse(@NotNull Map<String, String> paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.paths = paths;
    }

    public /* synthetic */ MobileFuseAssetManifestResponse(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
