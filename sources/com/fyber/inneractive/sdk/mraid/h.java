package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends e {
    public h(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        i0 i0Var = this.f21264c;
        Map map = this.f21263b;
        Context contextA = com.fyber.inneractive.sdk.util.o.a(i0Var.f23971b);
        try {
            HashMap mapA = i0.a(map);
            Intent type = new Intent("android.intent.action.INSERT").setType(com.taurusx.tax.o.i0.f66467z);
            for (String str : mapA.keySet()) {
                Object obj = mapA.get(str);
                if (obj instanceof Long) {
                    type.putExtra(str, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    type.putExtra(str, ((Integer) obj).intValue());
                } else {
                    type.putExtra(str, (String) obj);
                }
            }
            if (!(contextA instanceof Activity)) {
                type.setFlags(268435456);
            }
            contextA.startActivity(type);
            j1 j1Var = i0Var.f23976g;
            if (j1Var != null) {
                ((com.fyber.inneractive.sdk.web.b0) j1Var).d();
            }
        } catch (ActivityNotFoundException unused) {
            IAlog.a("There is no calendar app installed!", new Object[0]);
            i0Var.a(k.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
        } catch (IllegalArgumentException e10) {
            IAlog.a("invalid parameters for create calendar ", e10.getMessage());
            i0Var.a(k.CREATE_CALENDAR_EVENT, e10.getMessage());
        } catch (Throwable unused2) {
            IAlog.a("Failed to create calendar event.", new Object[0]);
            i0Var.a(k.CREATE_CALENDAR_EVENT, "could not create calendar event");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return null;
    }
}
