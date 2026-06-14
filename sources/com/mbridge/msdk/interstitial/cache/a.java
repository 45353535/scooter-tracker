package com.mbridge.msdk.interstitial.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f49183b = "com.mbridge.msdk.interstitial.cache.a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f49184c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f49185a;

    private a() {
        try {
            Context contextD = c.n().d();
            if (contextD != null) {
                this.f49185a = e.a(g.a(contextD));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static synchronized a a() {
        try {
            if (f49184c == null) {
                f49184c = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f49184c;
    }

    public void b(CampaignEx campaignEx, String str) {
        try {
            if (this.f49185a == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f49185a.a(campaignEx, str, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<CampaignEx> a(String str, int i10) {
        List<CampaignEx> listA;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listA = this.f49185a.a(str, i10, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                Iterator<CampaignEx> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                return arrayList2;
            } catch (Exception e10) {
                e = e10;
                arrayList = arrayList2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        e.printStackTrace();
        return arrayList;
    }

    public void a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.f49185a.e(campaignEx.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void a(List<CampaignEx> list, String str) {
        if (list == null || list.size() <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<CampaignEx> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), str);
        }
    }

    public void a(String str, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
                return;
            }
            Iterator<CampaignEx> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public synchronized void a(long j10, String str) {
        try {
            if (this.f49185a != null && j10 != 0 && !TextUtils.isEmpty(str)) {
                this.f49185a.a(j10, str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            q0.b(f49183b, e10.getMessage());
        }
    }
}
