package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f48534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f48535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f48536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f48537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f48538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f48540j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f48541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f48542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f48543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f48544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f48545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f48546p;

    public b(int i10) {
        this.f48531a = i10;
        this.f48532b = a.b(i10);
    }

    public void a(Throwable th2) {
        this.f48534d = th2;
    }

    public void b(String str) {
        this.f48538h = str;
    }

    public void c(String str) {
        this.f48533c = str;
    }

    public CampaignEx d() {
        return this.f48535e;
    }

    public int g() {
        return this.f48531a;
    }

    public int h() {
        return this.f48532b;
    }

    public String i() {
        return this.f48546p;
    }

    public MBridgeIds j() {
        if (this.f48536f == null) {
            this.f48536f = new MBridgeIds();
        }
        return this.f48536f;
    }

    public String k() {
        return this.f48538h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f48533c) ? this.f48533c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f48531a) != -1) {
            strA = a.a(i10);
        }
        Throwable th2 = this.f48534d;
        if (th2 == null) {
            return strA;
        }
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strA;
        }
        return strA + " # " + message;
    }

    public String m() {
        return this.f48541k;
    }

    public int n() {
        return this.f48540j;
    }

    public String toString() {
        return "MBFailureReason{errorCode=" + this.f48531a + ", errorSubType=" + this.f48532b + ", message='" + this.f48533c + "', cause=" + this.f48534d + ", campaign=" + this.f48535e + ", ids=" + this.f48536f + ", requestId='" + this.f48537g + "', localRequestId='" + this.f48538h + "', isHeaderBidding=" + this.f48539i + ", typeD=" + this.f48540j + ", reasonD='" + this.f48541k + "', extraMap=" + this.f48542l + ", serverErrorCode=" + this.f48543m + ", errorUrl='" + this.f48544n + "', serverErrorResponse='" + this.f48545o + "'}";
    }

    public void a(CampaignEx campaignEx) {
        this.f48535e = campaignEx;
    }

    public void d(String str) {
        this.f48541k = str;
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f48536f = mBridgeIds;
    }

    public void a(boolean z10) {
        this.f48539i = z10;
    }

    public b(int i10, String str) {
        this.f48531a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f48533c = str;
        this.f48532b = a.b(i10);
    }

    public void a(Object obj, Object obj2) {
        if (this.f48542l == null) {
            this.f48542l = new HashMap<>();
        }
        this.f48542l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f48542l;
        if (map != null && map.containsKey(obj)) {
            return this.f48542l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f48540j = i10;
    }

    public void a(String str) {
        this.f48546p = str;
    }
}
