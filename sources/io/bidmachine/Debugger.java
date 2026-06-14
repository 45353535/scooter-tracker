package io.bidmachine;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u0011\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010&\u001a\u00020\u000f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0003\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020\u000f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010'¨\u0006+"}, d2 = {"Lio/bidmachine/Debugger;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "setup", "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lorg/json/JSONObject;", "jsonObject", "", C4240b4.i.W, "Lkotlin/Function1;", "", "action", "applyAndLockIfExists", "(Ljava/util/concurrent/atomic/AtomicBoolean;Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "json", "setupFromJson$bidmachine_android_sdk_bh_3_5_0", "(Ljava/lang/String;)V", "setupFromJson", "TAG", "Ljava/lang/String;", "DIR_NAME", "FILE_NAME", "PARAMETER_LOGGING_ENABLED", "PARAMETER_TEST_MODE", "PARAMETER_ENDPOINT", "PARAMETER_COPPA", "PARAMETER_US_PRIVACY_STRING", "PARAMETER_SUBJECT_TO_GDPR", "PARAMETER_CONSENT", "PARAMETER_GDPR_STRING", "LOGGING_LOCK", "Ljava/util/concurrent/atomic/AtomicBoolean;", "TEST_MODE_LOCK", "isLoggingLock", "()Z", "isLoggingLock$annotations", "isTestModeLock", "isTestModeLock$annotations", "bidmachine-android-sdk_bh_3_5_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Debugger {

    @NotNull
    private static final String DIR_NAME = "features";

    @NotNull
    private static final String FILE_NAME = "DebugParameters.json";

    @NotNull
    private static final String PARAMETER_CONSENT = "consent";

    @NotNull
    private static final String PARAMETER_COPPA = "coppa";

    @NotNull
    private static final String PARAMETER_ENDPOINT = "endpoint";

    @NotNull
    private static final String PARAMETER_GDPR_STRING = "GDPRString";

    @NotNull
    private static final String PARAMETER_LOGGING_ENABLED = "loggingEnabled";

    @NotNull
    private static final String PARAMETER_SUBJECT_TO_GDPR = "subjectToGDPR";

    @NotNull
    private static final String PARAMETER_TEST_MODE = "testMode";

    @NotNull
    private static final String PARAMETER_US_PRIVACY_STRING = "usPrivacyString";

    @NotNull
    private static final String TAG = "Debugger";

    @NotNull
    public static final Debugger INSTANCE = new Debugger();

    @NotNull
    private static final AtomicBoolean LOGGING_LOCK = new AtomicBoolean(false);

    @NotNull
    private static final AtomicBoolean TEST_MODE_LOCK = new AtomicBoolean(false);

    private Debugger() {
    }

    private final void applyAndLockIfExists(AtomicBoolean atomicBoolean, JSONObject jSONObject, String str, Function1<? super Boolean, Unit> function1) {
        if (jSONObject.has(str)) {
            function1.invoke(Boolean.valueOf(jSONObject.optBoolean(str)));
            atomicBoolean.set(true);
        }
    }

    public static final boolean isLoggingLock() {
        return LOGGING_LOCK.get();
    }

    public static /* synthetic */ void isLoggingLock$annotations() {
    }

    public static final boolean isTestModeLock() {
        return TEST_MODE_LOCK.get();
    }

    public static /* synthetic */ void isTestModeLock$annotations() {
    }

    public static final void setup(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File fileH = td.b.h(context);
            if (fileH == null) {
                return;
            }
            File file = new File(fileH, "features/DebugParameters.json");
            if (file.exists()) {
                Log.d(TAG, "Debug file found");
                INSTANCE.setupFromJson$bidmachine_android_sdk_bh_3_5_0(td.b.j(file));
            }
        } catch (Throwable th2) {
            Log.w(TAG, th2);
        }
    }

    @VisibleForTesting
    public final void setupFromJson$bidmachine_android_sdk_bh_3_5_0(@Nullable String json) {
        if (json == null || StringsKt.y0(json)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(json);
        AtomicBoolean atomicBoolean = LOGGING_LOCK;
        if (jSONObject.has(PARAMETER_LOGGING_ENABLED)) {
            BidMachine.setLoggingEnabled(jSONObject.optBoolean(PARAMETER_LOGGING_ENABLED));
            atomicBoolean.set(true);
        }
        AtomicBoolean atomicBoolean2 = TEST_MODE_LOCK;
        if (jSONObject.has(PARAMETER_TEST_MODE)) {
            BidMachine.setTestMode(jSONObject.optBoolean(PARAMETER_TEST_MODE));
            atomicBoolean2.set(true);
        }
        if (jSONObject.has("endpoint")) {
            String strOptString = jSONObject.optString("endpoint");
            Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(PARAMETER_ENDPOINT)");
            String string = StringsKt.v1(strOptString).toString();
            if (string.length() > 0 && pd.f0.r(string)) {
                BidMachine.setEndpoint(string);
            }
        }
        if (jSONObject.has(PARAMETER_COPPA)) {
            BidMachine.setCoppa(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_COPPA)));
        }
        if (jSONObject.has(PARAMETER_US_PRIVACY_STRING)) {
            BidMachine.setUSPrivacyString(jSONObject.optString(PARAMETER_US_PRIVACY_STRING));
        }
        if (jSONObject.has(PARAMETER_SUBJECT_TO_GDPR)) {
            BidMachine.setSubjectToGDPR(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_SUBJECT_TO_GDPR)));
        }
        if (jSONObject.has("consent")) {
            BidMachine.setConsentConfig(jSONObject.optBoolean("consent"), jSONObject.has(PARAMETER_GDPR_STRING) ? jSONObject.optString(PARAMETER_GDPR_STRING) : null);
        }
    }
}
