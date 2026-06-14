package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21159d;

    public a(String str, String str2, String str3) {
        String strTrim = str != null ? str.trim() : null;
        this.f21156a = strTrim;
        String strTrim2 = str2 != null ? str2.trim() : null;
        this.f21157b = strTrim2;
        String strTrim3 = str3 != null ? str3.trim() : null;
        this.f21158c = strTrim3;
        this.f21159d = (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3) || !strTrim3.contains("[TIME]")) ? false : true;
    }
}
