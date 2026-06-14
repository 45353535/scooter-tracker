package com.startapp.sdk.internal;

import android.app.Activity;
import android.view.View;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class pf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f65109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f65110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf f65111c;

    public pf(sf sfVar, Activity activity, View view) {
        this.f65111c = sfVar;
        this.f65109a = activity;
        this.f65110b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sf sfVar;
        Activity activity;
        View view;
        RcdTargets rcdTargetsB;
        Collection collectionA;
        String name;
        try {
            sfVar = this.f65111c;
            activity = this.f65109a;
            view = this.f65110b;
            sfVar.f65262d.getClass();
            RcdMetadata rcdMetadataR = MetaData.E().R();
            if (rcdMetadataR == null || !rcdMetadataR.c()) {
                rcdMetadataR = null;
            }
            rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
        } catch (Throwable th2) {
            g9.a(th2);
        }
        if (rcdTargetsB == null) {
            return;
        }
        try {
            collectionA = rcdTargetsB.a(8);
            name = activity.getClass().getName();
        } catch (Throwable th3) {
            g9.a(th3);
        }
        if (collectionA.contains(name)) {
            sfVar.a(name, 8);
            return;
        }
        try {
            sfVar.a(rcdTargetsB, view);
        } catch (Throwable th4) {
            g9.a(th4);
        }
        ((Executor) sfVar.f65261c.a()).execute(sfVar.f65268j);
        return;
        g9.a(th2);
    }
}
