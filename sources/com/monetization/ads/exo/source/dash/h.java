package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import yads.ca2;
import yads.e30;
import yads.w83;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements ca2 {
    @Override // yads.ca2
    public final Object a(Uri uri, e30 e30Var) {
        return Long.valueOf(w83.f(new BufferedReader(new InputStreamReader(e30Var)).readLine()));
    }
}
