package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f49418c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f49419a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49420b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    class RunnableC0532a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f49421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f49423c;

        RunnableC0532a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f49421a = bVar;
            this.f49422b = str;
            this.f49423c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f49421a;
            if (bVar != null) {
                bVar.a(this.f49422b, this.f49423c, a.this.f49420b);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f49425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f49426b;

        b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f49425a = bVar;
            this.f49426b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f49425a != null) {
                this.f49426b.a(a.this.f49420b);
                this.f49425a.a(this.f49426b);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f49428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f49430c;

        c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f49428a = bVar;
            this.f49429b = str;
            this.f49430c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f49428a;
            if (bVar != null) {
                bVar.a(this.f49429b, this.f49430c, a.this.f49420b);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f49432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.error.b f49433b;

        d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f49432a = bVar;
            this.f49433b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f49432a != null) {
                this.f49433b.a(a.this.f49420b);
                this.f49432a.b(this.f49433b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f49418c, "postResourceFail unitId=" + bVar2);
        this.f49419a.post(new d(bVar, bVar2));
    }

    public void a(boolean z10) {
        this.f49420b = z10;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        q0.b(f49418c, "postCampaignSuccess unitId=" + str);
        this.f49419a.post(new RunnableC0532a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f49419a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        q0.b(f49418c, "postResourceSuccess unitId=" + str);
        this.f49419a.post(new c(bVar, str, i10));
    }
}
