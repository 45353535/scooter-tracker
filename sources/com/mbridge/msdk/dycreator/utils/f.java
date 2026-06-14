package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile f f48157b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.engine.b f48158a;

    private f(Context context) {
        this.f48158a = null;
        com.mbridge.msdk.dycreator.engine.b bVarA = com.mbridge.msdk.dycreator.engine.b.a();
        this.f48158a = bVarA;
        bVarA.a(context, "");
    }

    public static f a(Context context) {
        if (f48157b == null) {
            synchronized (f.class) {
                try {
                    if (f48157b == null) {
                        f48157b = new f(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f48157b;
    }

    public View a(String str) {
        if (new File(str).exists()) {
            return this.f48158a.e(str);
        }
        return null;
    }

    public View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
