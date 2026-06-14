package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class Sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final In f76465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f76466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f76470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f76471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f76472h;

    public Sn(In in, V v10, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f76465a = in;
        this.f76466b = v10;
        this.f76467c = arrayList;
        this.f76468d = str;
        this.f76469e = str2;
        this.f76470f = map;
        this.f76471g = str3;
        this.f76472h = bool;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        In in = this.f76465a;
        if (in != null) {
            for (Hl hl : in.f75966c) {
                sb2.append("at " + hl.f75877a + "." + hl.f75881e + "(" + hl.f75878b + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f75879c + StringUtils.PROCESS_POSTFIX_DELIMITER + hl.f75880d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f76465a + IOUtils.LINE_SEPARATOR_UNIX + sb2.toString() + '}';
    }
}
