package com.ironsource;

import android.util.Pair;
import com.ironsource.D7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class K5 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f41197e = "Content-Type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f41198f = "application/json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D7 f41199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f41200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f41201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<C4649z5> f41202d;

    public K5(D7 d72, String str, String str2, ArrayList<C4649z5> arrayList) {
        this.f41199a = d72;
        this.f41200b = str;
        this.f41201c = str2;
        this.f41202d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        D7.a aVarA;
        D7.a aVar = new D7.a(this.f41202d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C4640yd c4640ydB = C4278d8.b(this.f41201c, this.f41200b, arrayList);
            aVarA = aVar.a(c4640ydB.a()).a(c4640ydB.f45886a);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e10.getLocalizedMessage());
            aVarA = aVar.a(e10 instanceof Cc).a(e10);
        }
        D7 d72 = this.f41199a;
        if (d72 != null) {
            d72.a(aVarA);
        }
    }
}
