package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5249lf implements F5 {
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5498vf invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            AbstractC5227kj.a("Tracking id is empty", new Object[0]);
            return null;
        }
        if (ParseUtils.parseLong(asString) == null) {
            AbstractC5227kj.a("Tracking id from preload info content provider is not a number", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                AbstractC5227kj.a("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                AbstractC5227kj.a("Additional params are empty", new Object[0]);
                return null;
            }
            AbstractC5227kj.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C5498vf(asString, jSONObject, true, false, Y7.f76697e);
        } catch (Throwable th2) {
            ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Could not parse additional parameters", new Object[0]) + IOUtils.LINE_SEPARATOR_UNIX + StringUtils.throwableToString(th2), new Object[0]);
            return null;
        }
    }
}
