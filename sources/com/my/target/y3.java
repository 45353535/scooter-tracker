package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y3 {
    public static boolean a(Intent intent, Context context) {
        return a(null, null, intent, null, context);
    }

    public static boolean a(String str, String str2, Context context) {
        return a(str, str2, null, null, context);
    }

    public static boolean a(String str, String str2, Bundle bundle, Context context) {
        return a(str, str2, null, bundle, context);
    }

    public static boolean a(String str, Context context) {
        return a(str, null, null, null, context);
    }

    public static boolean a(String str, String str2, Intent intent, Bundle bundle, Context context) {
        if (intent == null) {
            try {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            } catch (Throwable th2) {
                gb.a("IntentUtils: Unable to open link - " + th2.getMessage());
                return false;
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (str2 != null) {
            intent.setPackage(str2);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
        return true;
    }
}
