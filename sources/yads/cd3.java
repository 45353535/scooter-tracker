package yads;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cd3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd3 f109373b;

    public cd3(dd3 dd3Var) {
        this.f109373b = dd3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dd3 dd3Var = this.f109373b;
        if (!dd3Var.f109892d) {
            if (dd3Var.f109889a.f117805a.contains(vd3.f116980d)) {
                md3 md3Var = (md3) this.f109373b.f109890b;
                pd3 pd3Var = md3Var.f113441f;
                tf3 tf3Var = md3Var.f113442g;
                tf3Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!kotlin.jvm.internal.b1.q(linkedHashMap)) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                View view = tf3Var.f116232b.getView();
                Integer numValueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
                Integer numValueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
                wj1 wj1Var = tf3Var.f116231a.f117778c;
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    linkedHashMap.put("view_container_height", "undefined");
                } else {
                    linkedHashMap.put("view_container_height", numValueOf);
                }
                if (numValueOf2 == null || numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 == null) {
                    linkedHashMap.put("view_container_width", "undefined");
                } else {
                    linkedHashMap.put("view_container_width", numValueOf2);
                }
                int i10 = wj1Var.f117489g;
                Integer numValueOf3 = i10 > 0 ? Integer.valueOf(i10) : null;
                if (numValueOf3 == null) {
                    linkedHashMap.put("video_height", "undefined");
                } else {
                    linkedHashMap.put("video_height", numValueOf3);
                }
                int i11 = wj1Var.f117490h;
                Integer numValueOf4 = i11 > 0 ? Integer.valueOf(i11) : null;
                if (numValueOf4 == null) {
                    linkedHashMap.put("video_width", "undefined");
                } else {
                    linkedHashMap.put("video_width", numValueOf4);
                }
                String str = wj1Var.f117487e;
                if (str == null) {
                    linkedHashMap.put("video_codec", "undefined");
                } else {
                    linkedHashMap.put("video_codec", str);
                }
                String str2 = wj1Var.f117486d;
                if (str2 == null) {
                    linkedHashMap.put("video_mime_type", "undefined");
                } else {
                    linkedHashMap.put("video_mime_type", str2);
                }
                Float f10 = wj1Var.f117488f;
                if (f10 == null) {
                    linkedHashMap.put("video_vmaf", "undefined");
                } else {
                    linkedHashMap.put("video_vmaf", f10);
                }
                pd3Var.f114638f = MapsKt.mapOf(TuplesKt.to("video_playback_info", linkedHashMap));
                md3Var.f113436a.a(u5.f116517u);
                if (!md3Var.f113443h) {
                    md3Var.f113443h = true;
                    pd3 pd3Var2 = md3Var.f113441f;
                    pd3Var2.getClass();
                    pd3Var2.a(MapsKt.mutableMapOf(TuplesKt.to("status", "success"), TuplesKt.to("durations", pd3Var2.f114636c.a())));
                }
                dd3 dd3Var2 = this.f109373b;
                dd3Var2.f109892d = true;
                dd3Var2.f109891c.removeCallbacksAndMessages(null);
                dd3Var2.f109893e = false;
                return;
            }
        }
        this.f109373b.f109891c.postDelayed(this, 200L);
    }
}
