package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.taurusx.tax.w.s.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.pubnative.lite.sdk.models.APIMeta;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f47499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f47500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f47501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f47502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f47503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f47504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f47505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f47507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f47508j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f47509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47510l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f47511m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47512n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f47513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<C0501a> f47514p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f47515q = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    public static class C0501a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f47517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f47518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f47519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f47520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f47521f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f47522g;

        public C0501a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f47516a = i10;
            this.f47517b = f10;
            this.f47518c = f11;
            this.f47519d = f12;
            this.f47520e = f13;
            this.f47521f = f14;
            this.f47522g = i11;
        }
    }

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    private void g(MotionEvent motionEvent) {
        this.f47514p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f47515q = 1;
            this.f47514p.add(new C0501a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f47515q = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < this.f47515q; i10++) {
                this.f47514p.add(new C0501a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.f47507i = motionEvent.getPressure();
        this.f47508j = motionEvent.getSize();
        this.f47509k = motionEvent.getOrientation();
        this.f47510l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f47499a = a(motionEvent);
        this.f47500b = b(motionEvent);
        this.f47505g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.f47501c = a(motionEvent);
        this.f47502d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f47503e = a(motionEvent);
        this.f47504f = b(motionEvent);
        this.f47506h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void c(View view) {
        this.f47513o = view;
        this.f47511m = view.getWidth();
        this.f47512n = view.getHeight();
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0501a c0501a : this.f47514p) {
            HashMap map2 = new HashMap();
            map2.put("x", String.valueOf(c0501a.f47517b));
            map2.put("y", String.valueOf(c0501a.f47518c));
            map2.put("pressure", String.valueOf(c0501a.f47519d));
            map2.put("size", String.valueOf(c0501a.f47520e));
            map2.put("id", Integer.valueOf(c0501a.f47516a));
            arrayList.add(map2);
        }
        map.put(APIMeta.POINTS, arrayList);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f47499a));
        map.put("down_y", Float.valueOf(this.f47500b));
        map.put("down_time", Long.valueOf(this.f47505g));
        map.put("up_x", Float.valueOf(this.f47503e));
        map.put("up_y", Float.valueOf(this.f47504f));
        map.put("up_time", Long.valueOf(this.f47506h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f47513o;
        if (view != null) {
            map.put("class_name", view.getClass().getSimpleName());
            String strB = b(this.f47513o);
            map.put("resource_id", strB);
            String strA = a(this.f47513o);
            map.put("content_desc", strA);
            map.put("view_format", String.format("%s#%s(%s)", this.f47513o.getClass().getSimpleName(), strB, strA));
        }
    }

    private void a(HashMap<String, Object> map) {
        map.put(s.I, "touch");
        map.put(s.J, String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f47505g));
    }

    public void c() {
        this.f47504f = 0.0f;
        this.f47503e = 0.0f;
        this.f47502d = 0.0f;
        this.f47501c = 0.0f;
        this.f47500b = 0.0f;
        this.f47499a = 0.0f;
        this.f47506h = 0L;
        this.f47505g = 0L;
        this.f47509k = 0.0f;
        this.f47508j = 0.0f;
        this.f47507i = 0.0f;
        this.f47510l = 0;
        this.f47512n = 0;
        this.f47511m = 0;
        this.f47513o = null;
        this.f47515q = 0;
        this.f47514p.clear();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    public C0501a b() {
        if (this.f47514p.isEmpty()) {
            return null;
        }
        return this.f47514p.get(0);
    }
}
