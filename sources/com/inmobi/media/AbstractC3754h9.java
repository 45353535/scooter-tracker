package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.AbstractC3754h9;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3754h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f38694a = lf.i.a(new Function0() { // from class: w3.a8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3754h9.a();
        }
    });

    public static final X8 a() {
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter("com.im_11.1.0.db", "name");
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter("ad_quality_db", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)", "tableSchema");
        arrayList.add(new Nj("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        Intrinsics.checkNotNullParameter("click", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )", "tableSchema");
        arrayList.add(new Nj("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        Intrinsics.checkNotNullParameter("config_db", "tableName");
        Intrinsics.checkNotNullParameter("(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))", "tableSchema");
        arrayList.add(new Nj("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        Intrinsics.checkNotNullParameter("c_data", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new Nj("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter("crash", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new Nj("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        Intrinsics.checkNotNullParameter("logs_v2", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new Nj("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter("pings", "tableName");
        Intrinsics.checkNotNullParameter("(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)", "tableSchema");
        arrayList.add(new Nj("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)"));
        Intrinsics.checkNotNullParameter(TelemetryCategory.TELEMETRY, "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new Nj(TelemetryCategory.TELEMETRY, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        C3824k5 c3824k5 = new C3824k5(context, arrayList, Aa.a());
        X8 x82 = new X8(c3824k5);
        C4152x9 c4152x9 = new C4152x9(c3824k5);
        C3729g9 c3729g9 = new C3729g9(c4152x9, c3824k5);
        x82.f37991a = c3729g9;
        try {
            c3729g9.f38624c = c4152x9.getWritableDatabase();
        } catch (Exception unused) {
        }
        try {
            c3729g9.f38625d = c3729g9.f38622a.getReadableDatabase();
        } catch (Exception unused2) {
        }
        return x82;
    }

    public static final C3729g9 b() {
        C3729g9 c3729g9 = ((X8) f38694a.getValue()).f37991a;
        if (c3729g9 != null) {
            return c3729g9;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_inmobiDatabaseHelper");
        return null;
    }
}
