package com.my.target.common;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.my.target.bb;
import com.my.target.d2;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class MyTargetUtils {
    @NonNull
    @WorkerThread
    public static Map<String, String> collectInfo(@NonNull Context context) {
        return d2.b().a(MyTargetManager.getSdkConfig(), MyTargetPrivacy.currentPrivacy(), null, context);
    }

    public static void sendStat(@NonNull String str, @NonNull Context context) {
        bb.c(str, context);
    }
}
