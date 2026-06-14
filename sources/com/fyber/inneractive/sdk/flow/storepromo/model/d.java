package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20968c;

    public d(String str, String str2, String str3) {
        String str4;
        this.f20968c = "";
        this.f20966a = str;
        this.f20967b = str2;
        h hVar = new h(str3);
        if (hVar.f23871a == null) {
            str4 = "N/A";
        } else {
            double dLongValue = r11.longValue() / 1024.0d;
            double d10 = dLongValue / 1024.0d;
            double d11 = d10 / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String str5 = decimalFormat.format(hVar.f23871a) + " bytes";
            if (d10 > 850.0d) {
                str4 = decimalFormat.format(d11) + " GB";
            } else if (dLongValue > 850.0d) {
                str4 = decimalFormat.format(d10) + " MB";
            } else if (hVar.f23871a.longValue() > 850) {
                str4 = decimalFormat.format(dLongValue) + " kB";
            } else {
                str4 = str5;
            }
        }
        this.f20968c = str4;
    }
}
