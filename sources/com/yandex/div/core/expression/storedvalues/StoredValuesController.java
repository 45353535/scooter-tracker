package com.yandex.div.core.expression.storedvalues;

import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.RawJsonRepositoryException;
import com.yandex.div.storage.RawJsonRepositoryResult;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import lf.m;
import m8.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0012¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b*\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0012¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\u000b*\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0012¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0012¢\u0006\u0004\b\u001f\u0010 J%\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u001d8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/yandex/div/core/expression/storedvalues/StoredValuesController;", "", "Lm8/a;", "Lcom/yandex/div/storage/DivStorageComponent;", "divStorageComponentLazy", "<init>", "(Lm8/a;)V", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "errors", "", "logRepositoryErrors", "(Lcom/yandex/div/core/view2/errors/ErrorCollector;Ljava/util/List;)V", "", "name", "unknownType", "logUnknownType", "(Lcom/yandex/div/core/view2/errors/ErrorCollector;Ljava/lang/String;Ljava/lang/String;)V", "", "cause", "logDeclarationFailed", "(Lcom/yandex/div/core/view2/errors/ErrorCollector;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lorg/json/JSONObject;", "Lcom/yandex/div/data/StoredValue$Type;", "type", "Lcom/yandex/div/data/StoredValue;", "toStoredValue", "(Lorg/json/JSONObject;Lcom/yandex/div/data/StoredValue$Type;Ljava/lang/String;)Lcom/yandex/div/data/StoredValue;", "", "lifetime", "toJSONObject", "(Lcom/yandex/div/data/StoredValue;J)Lorg/json/JSONObject;", "errorCollector", "getStoredValue", "(Ljava/lang/String;Lcom/yandex/div/core/view2/errors/ErrorCollector;)Lcom/yandex/div/data/StoredValue;", "storedValue", "", "setStoredValue", "(Lcom/yandex/div/data/StoredValue;JLcom/yandex/div/core/view2/errors/ErrorCollector;)Z", "Lcom/yandex/div/storage/RawJsonRepository;", "rawJsonRepository$delegate", "Lkotlin/Lazy;", "getRawJsonRepository", "()Lcom/yandex/div/storage/RawJsonRepository;", "rawJsonRepository", "getCurrentTime", "()J", "currentTime", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class StoredValuesController {

    /* JADX INFO: renamed from: rawJsonRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rawJsonRepository;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoredValue.Type.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StoredValue.Type.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoredValuesController(@NotNull final a aVar) {
        this.rawJsonRepository = i.a(new Function0<RawJsonRepository>() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController$rawJsonRepository$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RawJsonRepository invoke() {
                return ((DivStorageComponent) aVar.get()).getRawJsonRepository();
            }
        });
    }

    private long getCurrentTime() {
        return System.currentTimeMillis();
    }

    private RawJsonRepository getRawJsonRepository() {
        return (RawJsonRepository) this.rawJsonRepository.getValue();
    }

    private void logDeclarationFailed(ErrorCollector errorCollector, String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stored value '");
        sb2.append(str);
        sb2.append("' declaration failed: ");
        sb2.append(th2 != null ? th2.getMessage() : null);
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException(sb2.toString(), th2);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private void logRepositoryErrors(ErrorCollector errorCollector, List<RawJsonRepositoryException> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            errorCollector.logError((RawJsonRepositoryException) it.next());
        }
    }

    private void logUnknownType(ErrorCollector errorCollector, String str, String str2) {
        StoredValueDeclarationException storedValueDeclarationException = new StoredValueDeclarationException("Stored value '" + str + "' declaration failed because of unknown type '" + str2 + '\'', null, 2, null);
        if (errorCollector != null) {
            errorCollector.logError(storedValueDeclarationException);
        }
    }

    private JSONObject toJSONObject(StoredValue storedValue, long j10) throws JSONException {
        Object string;
        if (storedValue instanceof StoredValue.StringStoredValue ? true : storedValue instanceof StoredValue.IntegerStoredValue ? true : storedValue instanceof StoredValue.BooleanStoredValue ? true : storedValue instanceof StoredValue.ArrayStoredValue ? true : storedValue instanceof StoredValue.DictStoredValue ? true : storedValue instanceof StoredValue.DoubleStoredValue) {
            string = storedValue.getValue();
        } else {
            if (!(storedValue instanceof StoredValue.UrlStoredValue ? true : storedValue instanceof StoredValue.ColorStoredValue)) {
                throw new m();
            }
            string = storedValue.getValue().toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("expiration_time", getCurrentTime() + (j10 * ((long) 1000)));
        jSONObject.put("type", StoredValue.Type.INSTANCE.toString(storedValue.getType()));
        jSONObject.put("value", string);
        return jSONObject;
    }

    private StoredValue toStoredValue(JSONObject jSONObject, StoredValue.Type type, String str) throws JSONException {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new StoredValue.StringStoredValue(str, jSONObject.getString("value"));
            case 2:
                return new StoredValue.IntegerStoredValue(str, jSONObject.getLong("value"));
            case 3:
                return new StoredValue.BooleanStoredValue(str, jSONObject.getBoolean("value"));
            case 4:
                return new StoredValue.DoubleStoredValue(str, jSONObject.getDouble("value"));
            case 5:
                return new StoredValue.ColorStoredValue(str, Color.INSTANCE.m7669parseC4zCDoM(jSONObject.getString("value")), null);
            case 6:
                return new StoredValue.UrlStoredValue(str, Url.INSTANCE.m7677fromVcSV9u8(jSONObject.getString("value")), null);
            case 7:
                return new StoredValue.ArrayStoredValue(str, jSONObject.getJSONArray("value"));
            case 8:
                return new StoredValue.DictStoredValue(str, jSONObject.getJSONObject("value"));
            default:
                throw new m();
        }
    }

    @Nullable
    public StoredValue getStoredValue(@NotNull String name, @Nullable ErrorCollector errorCollector) {
        JSONObject data;
        final String str = "stored_value_" + name;
        RawJsonRepositoryResult rawJsonRepositoryResult = getRawJsonRepository().get(CollectionsKt.listOf(str));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, rawJsonRepositoryResult.getErrors());
        }
        RawJson rawJson = (RawJson) CollectionsKt.firstOrNull((List) rawJsonRepositoryResult.getResultData());
        if (rawJson != null && (data = rawJson.getData()) != null) {
            if (data.has("expiration_time")) {
                if (getCurrentTime() >= data.getLong("expiration_time")) {
                    getRawJsonRepository().remove(new Function1<RawJson, Boolean>() { // from class: com.yandex.div.core.expression.storedvalues.StoredValuesController.getStoredValue.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Boolean invoke(@NotNull RawJson rawJson2) {
                            return Boolean.valueOf(Intrinsics.areEqual(rawJson2.getId(), str));
                        }
                    });
                    return null;
                }
            }
            try {
                String string = data.getString("type");
                StoredValue.Type typeFromString = StoredValue.Type.INSTANCE.fromString(string);
                if (typeFromString != null) {
                    return toStoredValue(data, typeFromString, name);
                }
                logUnknownType(errorCollector, name, string);
                return null;
            } catch (JSONException e10) {
                logDeclarationFailed(errorCollector, name, e10);
            }
        }
        return null;
    }

    public boolean setStoredValue(@NotNull StoredValue storedValue, long lifetime, @Nullable ErrorCollector errorCollector) {
        RawJsonRepositoryResult rawJsonRepositoryResultPut = getRawJsonRepository().put(new RawJsonRepository.Payload(CollectionsKt.listOf(RawJson.INSTANCE.invoke("stored_value_" + storedValue.getName(), toJSONObject(storedValue, lifetime))), null, 2, null));
        if (errorCollector != null) {
            logRepositoryErrors(errorCollector, rawJsonRepositoryResultPut.getErrors());
        }
        return rawJsonRepositoryResultPut.getErrors().isEmpty();
    }
}
