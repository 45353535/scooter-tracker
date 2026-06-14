package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Yi implements Zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76716b = "content://" + a() + "/clids";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76717c = "clid_key";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76718d = "clid_value";

    public Yi(@NotNull Context context) {
        this.f76715a = context;
    }

    @NotNull
    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5586z3 invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        if (!PackageManagerUtils.hasContentProvider(this.f76715a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC5227kj.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursorQuery = this.f76715a.getContentResolver().query(Uri.parse(this.f76716b), null, null, null, null);
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Error while getting satellite clids", new Object[0]) + IOUtils.LINE_SEPARATOR_UNIX + StringUtils.throwableToString(th), new Object[0]);
                } finally {
                    no.a(cursorQuery);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            AbstractC5227kj.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorQuery.moveToNext()) {
            try {
                string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f76717c));
                string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(this.f76718d));
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                AbstractC5227kj.a("Invalid clid {%s : %s}", string, string2);
            } else {
                linkedHashMap.put(string, string2);
            }
        }
        AbstractC5227kj.a("Clids from satellite: %s", linkedHashMap);
        return new C5586z3(linkedHashMap, Y7.f76696d);
    }
}
