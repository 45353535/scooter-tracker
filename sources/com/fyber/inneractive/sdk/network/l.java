package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f21330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f21331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f21333f = new ArrayList();

    public l() {
    }

    public void a() {
        InputStream inputStream = this.f21330c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public l(FilterInputStream filterInputStream, int i10, String str, Map map, String str2) {
        this.f21330c = filterInputStream;
        this.f21328a = i10;
        this.f21329b = str;
        this.f21331d = map;
        this.f21332e = str2;
    }
}
