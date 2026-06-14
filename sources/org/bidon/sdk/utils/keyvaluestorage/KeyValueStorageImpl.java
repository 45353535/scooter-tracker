package org.bidon.sdk.utils.keyvaluestorage;

import android.content.Context;
import android.content.SharedPreferences;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001f\u001a\u00020 H\u0016J\u0014\u0010!\u001a\u00020 *\u00020\"2\u0006\u0010\r\u001a\u00020#H\u0002J\f\u0010$\u001a\u00020#*\u00020\"H\u0002J\u0016\u0010%\u001a\u00020 *\u00020\"2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u0010&\u001a\u0004\u0018\u00010\u000e*\u00020\"H\u0002J\f\u0010'\u001a\u00020\u000e*\u00020\"H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R(\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R(\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013¨\u0006("}, d2 = {"Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorageImpl;", "Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "value", "", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "host", "getHost", "setHost", "segmentUid", "getSegmentUid", "setSegmentUid", "applicationId", "getApplicationId", "appKey", "getAppKey", "setAppKey", "clear", "", "saveInt", "Lorg/bidon/sdk/utils/keyvaluestorage/Key;", "", "getInt", "saveString", "getString", "asKeyName", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyValueStorageImpl implements KeyValueStorage {

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sharedPreferences;

    public KeyValueStorageImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.sharedPreferences = i.a(new Function0() { // from class: org.bidon.sdk.utils.keyvaluestorage.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KeyValueStorageImpl.sharedPreferences_delegate$lambda$0(this.f97651b);
            }
        });
    }

    private final String asKeyName(Key key) {
        return key.name() + "_KEY";
    }

    private final int getInt(Key key) {
        return getSharedPreferences().getInt(asKeyName(key), 0);
    }

    private final SharedPreferences getSharedPreferences() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    private final String getString(Key key) {
        return getSharedPreferences().getString(asKeyName(key), null);
    }

    private final void saveInt(Key key, int i10) {
        getSharedPreferences().edit().putInt(asKeyName(key), i10).apply();
    }

    private final void saveString(Key key, String str) {
        getSharedPreferences().edit().putString(asKeyName(key), str).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences sharedPreferences_delegate$lambda$0(KeyValueStorageImpl keyValueStorageImpl) {
        return keyValueStorageImpl.context.getSharedPreferences("bidon_preferences", 0);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    public void clear() {
        getSharedPreferences().edit().clear().apply();
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    @Nullable
    public String getAppKey() {
        return getString(Key.BidonAppKey);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    @NotNull
    public String getApplicationId() {
        Key key = Key.ClientApplicationId;
        String string = getString(key);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        saveString(key, string2);
        return string2;
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    @Nullable
    public String getHost() {
        return getString(Key.Host);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    @Nullable
    public String getSegmentUid() {
        return getString(Key.SegmentUid);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    @Nullable
    public String getToken() {
        return getString(Key.Token);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    public void setAppKey(@Nullable String str) {
        saveString(Key.BidonAppKey, str);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    public void setHost(@Nullable String str) {
        saveString(Key.Host, str);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    public void setSegmentUid(@Nullable String str) {
        saveString(Key.SegmentUid, str);
    }

    @Override // org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage
    public void setToken(@Nullable String str) {
        saveString(Key.Token, str);
    }
}
