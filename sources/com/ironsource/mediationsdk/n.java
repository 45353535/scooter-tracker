package com.ironsource.mediationsdk;

import com.ironsource.C4295e8;
import com.ironsource.C4544t2;
import com.ironsource.C4606wd;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f44136f = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f44137a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Boolean> f44138b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44141e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSource.a f44142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f44143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44144c;

        a(IronSource.a aVar, IronSourceError ironSourceError, String str) {
            this.f44142a = aVar;
            this.f44143b = ironSourceError;
            this.f44144c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f44142a, this.f44143b);
            n.this.f44138b.put(this.f44144c, Boolean.FALSE);
        }
    }

    private n() {
    }

    public static synchronized n a() {
        return f44136f;
    }

    public synchronized void b(IronSource.a aVar, IronSourceError ironSourceError) {
        if (b(aVar)) {
            return;
        }
        String string = aVar.toString();
        if (!this.f44137a.containsKey(string)) {
            a(aVar, ironSourceError);
            return;
        }
        long jA = ((long) a(aVar)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f44137a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(aVar, ironSourceError);
            return;
        }
        this.f44138b.put(string, Boolean.TRUE);
        long j10 = jA - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j10);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(aVar, ironSourceError, string), j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.a aVar, IronSourceError ironSourceError) {
        this.f44137a.put(aVar.toString(), Long.valueOf(System.currentTimeMillis()));
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            C4606wd.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            C4295e8.a().a(ironSourceError);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            C4544t2.a().a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public void a(IronSource.a aVar, int i10) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f44140d = i10;
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            this.f44139c = i10;
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.f44141e = i10;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
    }

    public synchronized boolean b(IronSource.a aVar) {
        if (!this.f44138b.containsKey(aVar.toString())) {
            return false;
        }
        return this.f44138b.get(aVar.toString()).booleanValue();
    }

    private int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return this.f44140d;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return this.f44139c;
        }
        if (aVar == IronSource.a.BANNER) {
            return this.f44141e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 0;
    }
}
