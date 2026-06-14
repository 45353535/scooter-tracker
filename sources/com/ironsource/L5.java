package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public class L5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f41235e = "EventsTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4448n7 f41236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private F5 f41237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private G7 f41238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f41239d;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41240a;

        a(String str) {
            this.f41240a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C4640yd c4640yd = new C4640yd();
                ArrayList<Pair<String, String>> arrayListD = L5.this.f41237b.d();
                if ("POST".equals(L5.this.f41237b.e())) {
                    c4640yd = C4278d8.b(L5.this.f41237b.b(), this.f41240a, arrayListD);
                } else if ("GET".equals(L5.this.f41237b.e())) {
                    c4640yd = C4278d8.a(L5.this.f41237b.b(), this.f41240a, arrayListD);
                }
                L5.this.a("response status code: " + c4640yd.f45886a);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
            }
        }
    }

    public L5(F5 f52, InterfaceC4448n7 interfaceC4448n7) {
        if (f52 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (f52.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f41237b = f52;
        this.f41236a = interfaceC4448n7;
        this.f41238c = f52.c();
        this.f41239d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.f41239d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f41237b.a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put("eventname", str);
            a(map2, this.f41236a.a());
            a(map2, map);
            b(this.f41238c.a(map2));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f41237b.f()) {
            Log.d(f41235e, str);
        }
    }
}
