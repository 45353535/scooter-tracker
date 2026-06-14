package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class T6 {
    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{Da.a("carb_store"), Da.a("aes_key_store"), Da.a("mraid_js_store"), Da.a("omid_js_store"), Da.a("user_info_store"), Da.a("coppa_store"), Da.a("gesture_info_store"), Da.a("display_info_store"), Da.a("unified_id_info_store"), Da.a("app_bundle_store"), Da.a("pub_signals_store"), Da.a("CrashSession-store")});
        if (Build.VERSION.SDK_INT >= 24) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                context.deleteSharedPreferences((String) it.next());
            }
            return;
        }
        for (String str : listListOf) {
            File file = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + str + ".xml");
            if (file.exists() && file.delete()) {
                Intrinsics.checkNotNullExpressionValue("T6", "TAG");
                file.getName();
            }
        }
    }

    public static final void a(File path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            if (path.exists()) {
                File[] fileArrListFiles = path.listFiles();
                if (fileArrListFiles != null) {
                    Iterator itA = kotlin.jvm.internal.i.a(fileArrListFiles);
                    while (itA.hasNext()) {
                        File file = (File) itA.next();
                        if (file.isDirectory()) {
                            Intrinsics.checkNotNull(file);
                            a(file);
                        } else if (file.delete()) {
                            Intrinsics.checkNotNullExpressionValue("T6", "TAG");
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    Intrinsics.checkNotNullExpressionValue("T6", "TAG");
                    path.getName();
                }
            }
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("T6", "TAG");
            e10.getMessage();
        }
    }
}
