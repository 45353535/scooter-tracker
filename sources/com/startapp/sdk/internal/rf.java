package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class rf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StackTraceElement[] f65219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f65220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf f65221c;

    public rf(sf sfVar, StackTraceElement[] stackTraceElementArr, int i10) {
        this.f65221c = sfVar;
        this.f65219a = stackTraceElementArr;
        this.f65220b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            sf sfVar = this.f65221c;
            StackTraceElement[] stackTraceElementArr = this.f65219a;
            int i10 = this.f65220b;
            sfVar.f65262d.getClass();
            RcdMetadata rcdMetadataR = MetaData.E().R();
            if (rcdMetadataR == null || !rcdMetadataR.c()) {
                rcdMetadataR = null;
            }
            RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
            if (rcdTargetsB == null) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sfVar.a(rcdTargetsB, stackTraceElement.getClassName(), i10);
            }
            ((Executor) sfVar.f65261c.a()).execute(sfVar.f65268j);
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
