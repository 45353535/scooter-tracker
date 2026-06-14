package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: loaded from: classes6.dex */
public class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f10986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10987b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    protected t3(a aVar, String str) {
        this.f10986a = aVar;
        this.f10987b = str;
    }

    public a a() {
        return this.f10986a;
    }

    public String b() {
        return this.f10987b;
    }

    public static t3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new t3(a.AD_UNIT_ID, str);
    }

    public static t3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new t3(a.AD_FORMAT, label);
    }

    public static t3 a(y2 y2Var) {
        String strQ = y2Var.Q();
        MaxAdFormat format = y2Var.getFormat();
        if (TextUtils.isEmpty(strQ) || format == null) {
            return null;
        }
        return new q3(new j3(strQ, format));
    }
}
