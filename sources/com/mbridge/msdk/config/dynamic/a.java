package com.mbridge.msdk.config.dynamic;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    private View a() {
        return null;
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (!new File(str).exists()) {
            return null;
        }
        View viewA = c.a().a(str, viewGroup, aVar);
        return viewA != null ? viewA : a();
    }
}
