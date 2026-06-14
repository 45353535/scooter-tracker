package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.shape.a;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f52405d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f52406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f52407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f52408c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    class RunnableC0591a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f52409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f52410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f52411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f52412d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        class RunnableC0592a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.b f52414a;

            RunnableC0592a(a.b bVar) {
                this.f52414a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f52406a == null || this.f52414a.build() == null) {
                    return;
                }
                a.this.f52406a.setBackground(this.f52414a.build());
            }
        }

        RunnableC0591a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f52409a = bitmap;
            this.f52410b = i10;
            this.f52411c = f10;
            this.f52412d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f52409a, 10);
                Bitmap bitmapA2 = a0.a(this.f52409a, 10);
                a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f52410b).b(bitmapA).a(bitmapA2);
                if (this.f52410b == 2) {
                    float f10 = this.f52411c;
                    float f11 = this.f52412d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f52412d);
                    } else {
                        bVarA.b(f11).a(this.f52411c);
                    }
                } else {
                    bVarA.b(this.f52411c).a(this.f52412d);
                }
                if (a.this.f52406a != null) {
                    a.this.f52406a.post(new RunnableC0592a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public void b() {
        if (this.f52406a != null) {
            this.f52406a = null;
        }
        Bitmap bitmap = this.f52407b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f52407b.recycle();
            this.f52407b = null;
        }
        Bitmap bitmap2 = this.f52408c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f52408c.recycle();
        this.f52408c = null;
    }

    public static a a() {
        a aVar;
        if (f52405d != null) {
            return f52405d;
        }
        synchronized (a.class) {
            try {
                if (f52405d == null) {
                    f52405d = new a();
                }
                aVar = f52405d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f52406a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md52 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = null;
            Bitmap bitmap2 = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            if (!TextUtils.isEmpty(md52) && map.containsKey(md52)) {
                bitmap = map.get(md52);
            }
            Bitmap bitmap3 = bitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap2, bitmap3);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        try {
            try {
            } catch (Exception e10) {
                e = e10;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
            try {
                com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0591a(bitmap, i10, f10, f11));
            } catch (Exception e11) {
                e = e11;
                q0.a("ChoiceOneDrawBitBg", e.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
