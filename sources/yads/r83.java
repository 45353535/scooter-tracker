package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class r83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q83 f115367a;

    public r83() {
        this(new q83());
    }

    public final boolean a(Context context, String str) {
        try {
            this.f115367a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public r83(q83 q83Var) {
        this.f115367a = q83Var;
    }
}
