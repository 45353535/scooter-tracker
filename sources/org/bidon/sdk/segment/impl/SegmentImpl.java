package org.bidon.sdk.segment.impl;

import com.ironsource.A1;
import com.taurusx.tax.g.e0;
import hg.l0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.m;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.segment.Segment;
import org.bidon.sdk.segment.SegmentSynchronizer;
import org.bidon.sdk.segment.models.Gender;
import org.bidon.sdk.segment.models.SegmentAttributes;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u000101H\u0016J\u001c\u00102\u001a\u00020/2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020103H\u0016J\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020103H\u0016J\u0010\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020\u0010H\u0016J\u0012\u00107\u001a\u00020/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u000f\u001a\u0004\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00068"}, d2 = {"Lorg/bidon/sdk/segment/impl/SegmentImpl;", "Lorg/bidon/sdk/segment/Segment;", "Lorg/bidon/sdk/segment/SegmentSynchronizer;", "<init>", "()V", "keyValueStorage", "Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "getKeyValueStorage", "()Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "attributesFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/segment/models/SegmentAttributes;", "attributes", "getAttributes", "()Lorg/bidon/sdk/segment/models/SegmentAttributes;", "value", "", "segmentUid", "getSegmentUid", "()Ljava/lang/String;", "", "age", "getAge", "()Ljava/lang/Integer;", "setAge", "(Ljava/lang/Integer;)V", "Lorg/bidon/sdk/segment/models/Gender;", "gender", "getGender", "()Lorg/bidon/sdk/segment/models/Gender;", "setGender", "(Lorg/bidon/sdk/segment/models/Gender;)V", "level", "getLevel", "setLevel", "", "totalInAppAmount", "getTotalInAppAmount", "()Ljava/lang/Double;", "setTotalInAppAmount", "(Ljava/lang/Double;)V", "", "isPaying", "()Z", "setPaying", "(Z)V", "putCustomAttribute", "", "attribute", "", "setCustomAttributes", "", "getCustomAttributes", "parseSegmentUid", "rootJsonResponse", "setSegmentUid", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SegmentImpl implements Segment, SegmentSynchronizer {

    @NotNull
    private MutableStateFlow attributesFlow = l0.a(SegmentAttributes.INSTANCE.getEmpty());

    @Nullable
    private String segmentUid;

    private final KeyValueStorage getKeyValueStorage() {
        try {
            InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(KeyValueStorage.class));
            if (instanceType instanceof InstanceType.Singleton) {
                Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
                if (singleton != null) {
                    return (KeyValueStorage) singleton;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            if (instanceType instanceof InstanceType.Factory) {
                Object objBuild = ((InstanceType.Factory) instanceType).build();
                if (objBuild != null) {
                    return (KeyValueStorage) objBuild;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage");
            }
            if (instanceType instanceof InstanceType.ParamFactory) {
                new InstanceType.ParamFactory.Params();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (instanceType != null) {
                throw new m();
            }
            throw new IllegalStateException(("No factory provided for class: " + KeyValueStorage.class).toString());
        } catch (Exception unused) {
            LogExtKt.logError("Dependency Injection", "BidonSdk is not initialized", BidonError.SdkNotInitialized.INSTANCE);
            return null;
        }
    }

    @Override // org.bidon.sdk.segment.Segment
    @Nullable
    public Integer getAge() {
        return ((SegmentAttributes) this.attributesFlow.getValue()).getAge();
    }

    @Override // org.bidon.sdk.segment.SegmentSynchronizer
    @NotNull
    public SegmentAttributes getAttributes() {
        return (SegmentAttributes) this.attributesFlow.getValue();
    }

    @Override // org.bidon.sdk.segment.Segment
    @NotNull
    public Map<String, Object> getCustomAttributes() {
        return ((SegmentAttributes) this.attributesFlow.getValue()).getCustomAttributes();
    }

    @Override // org.bidon.sdk.segment.Segment
    @Nullable
    public Gender getGender() {
        return ((SegmentAttributes) this.attributesFlow.getValue()).getGender();
    }

    @Override // org.bidon.sdk.segment.Segment
    @Nullable
    public Integer getLevel() {
        return ((SegmentAttributes) this.attributesFlow.getValue()).getGameLevel();
    }

    @Override // org.bidon.sdk.segment.Segment, org.bidon.sdk.segment.SegmentSynchronizer
    @Nullable
    public String getSegmentUid() {
        return this.segmentUid;
    }

    @Override // org.bidon.sdk.segment.Segment
    @Nullable
    public Double getTotalInAppAmount() {
        return ((SegmentAttributes) this.attributesFlow.getValue()).getInAppAmount();
    }

    @Override // org.bidon.sdk.segment.Segment
    public boolean isPaying() {
        Boolean boolIsPaying = ((SegmentAttributes) this.attributesFlow.getValue()).isPaying();
        if (boolIsPaying != null) {
            return boolIsPaying.booleanValue();
        }
        return false;
    }

    @Override // org.bidon.sdk.segment.SegmentSynchronizer
    public void parseSegmentUid(@NotNull String rootJsonResponse) {
        String strOptString;
        Intrinsics.checkNotNullParameter(rootJsonResponse, "rootJsonResponse");
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObjectOptJSONObject = new JSONObject(rootJsonResponse).optJSONObject(A1.f40174i);
            String str = null;
            if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString(e0.f66120c, "")) != null && strOptString.length() > 0) {
                str = strOptString;
            }
            KeyValueStorage keyValueStorage = getKeyValueStorage();
            if (keyValueStorage != null) {
                keyValueStorage.setSegmentUid(str);
            }
            setSegmentUid(str);
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(d.a(th2));
        }
    }

    @Override // org.bidon.sdk.segment.Segment
    public void putCustomAttribute(@NotNull String attribute, @Nullable Object value) {
        Object value2;
        SegmentAttributes segmentAttributes;
        Map mutableMap;
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        MutableStateFlow mutableStateFlow = this.attributesFlow;
        do {
            value2 = mutableStateFlow.getValue();
            segmentAttributes = (SegmentAttributes) value2;
            mutableMap = MapsKt.toMutableMap(segmentAttributes.getCustomAttributes());
            if (value == null) {
                mutableMap.remove(attribute);
            } else {
                mutableMap.put(attribute, value);
            }
            Unit unit = Unit.f93236a;
        } while (!mutableStateFlow.b(value2, SegmentAttributes.copy$default(segmentAttributes, null, null, mutableMap, null, null, null, 59, null)));
        LogExtKt.logInfo("Segment", "Updated attribute=(" + attribute + ", " + value + ")");
    }

    @Override // org.bidon.sdk.segment.Segment
    public void setAge(@Nullable Integer num) {
        MutableStateFlow mutableStateFlow = this.attributesFlow;
        mutableStateFlow.setValue(SegmentAttributes.copy$default((SegmentAttributes) mutableStateFlow.getValue(), num, null, null, null, null, null, 62, null));
        LogExtKt.logInfo("Segment", "Updated age=" + num);
    }

    @Override // org.bidon.sdk.segment.Segment
    public void setCustomAttributes(@NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        MutableStateFlow mutableStateFlow = this.attributesFlow;
        mutableStateFlow.setValue(SegmentAttributes.copy$default((SegmentAttributes) mutableStateFlow.getValue(), null, null, attributes, null, null, null, 59, null));
        LogExtKt.logInfo("Segment", "Updated attributes=" + attributes);
    }

    @Override // org.bidon.sdk.segment.Segment
    public void setGender(@Nullable Gender gender) {
        MutableStateFlow mutableStateFlow = this.attributesFlow;
        mutableStateFlow.setValue(SegmentAttributes.copy$default((SegmentAttributes) mutableStateFlow.getValue(), null, gender, null, null, null, null, 61, null));
        LogExtKt.logInfo("Segment", "Updated gender=" + gender);
    }

    @Override // org.bidon.sdk.segment.Segment
    public void setLevel(@Nullable Integer num) {
        MutableStateFlow mutableStateFlow = this.attributesFlow;
        mutableStateFlow.setValue(SegmentAttributes.copy$default((SegmentAttributes) mutableStateFlow.getValue(), null, null, null, null, null, num, 31, null));
        LogExtKt.logInfo("Segment", "Updated level=" + num);
    }

    @Override // org.bidon.sdk.segment.Segment
    public void setPaying(boolean z10) {
        MutableStateFlow mutableStateFlow = this.attributesFlow;
        mutableStateFlow.setValue(SegmentAttributes.copy$default((SegmentAttributes) mutableStateFlow.getValue(), null, null, null, null, Boolean.valueOf(z10), null, 47, null));
        LogExtKt.logInfo("Segment", "Updated isPaying=" + z10);
    }

    @Override // org.bidon.sdk.segment.SegmentSynchronizer
    public void setSegmentUid(@Nullable String segmentUid) {
        LogExtKt.logInfo("Segment", "Updated SegmentUid(" + segmentUid + ")");
        this.segmentUid = segmentUid;
    }

    @Override // org.bidon.sdk.segment.Segment
    public void setTotalInAppAmount(@Nullable Double d10) {
        MutableStateFlow mutableStateFlow = this.attributesFlow;
        mutableStateFlow.setValue(SegmentAttributes.copy$default((SegmentAttributes) mutableStateFlow.getValue(), null, null, null, d10, null, null, 55, null));
        LogExtKt.logInfo("Segment", "Updated inAppAmount=" + d10);
    }
}
