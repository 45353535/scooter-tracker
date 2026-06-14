package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.Key;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.taurusx.tax.y.z.w.s;
import io.appmetrica.analytics.impl.H2;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f47571d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> f47572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f47573b = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> f47574c;

    private c() {
        d();
    }

    public static c a() {
        if (f47571d == null) {
            synchronized (c.class) {
                try {
                    if (f47571d == null) {
                        f47571d = new c();
                    }
                } finally {
                }
            }
        }
        return f47571d;
    }

    public HashMap b() {
        SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> softReference = this.f47572a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", com.mbridge.msdk.config.dynamic.utils.c.layout_width);
            map.put("layout_height", com.mbridge.msdk.config.dynamic.utils.c.layout_height);
            map.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
            map.put("layout_centerHorizontal", com.mbridge.msdk.config.dynamic.utils.c.layout_centerHorizontal);
            map.put("layout_centerVertical", com.mbridge.msdk.config.dynamic.utils.c.layout_centerVertical);
            map.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
            map.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
            map.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
            map.put("layout_gravity", com.mbridge.msdk.config.dynamic.utils.c.layout_gravity);
            map.put("layout_alignParentRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentRight);
            map.put("layout_weight", com.mbridge.msdk.config.dynamic.utils.c.layout_weight);
            map.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
            map.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
            map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
            map.put("layout_below", com.mbridge.msdk.config.dynamic.utils.c.layout_below);
            map.put("layout_above", com.mbridge.msdk.config.dynamic.utils.c.layout_above);
            map.put("layout_toLeftOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toLeftOf);
            map.put("layout_toRightOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toRightOf);
            map.put("layout_toEndOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toEndOf);
            map.put(H2.f75840g, com.mbridge.msdk.config.dynamic.utils.c.background);
            map.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
            map.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
            map.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
            map.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
            map.put("layout_alignParentBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentBottom);
            map.put("layout_alignParentTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentTop);
            map.put("layout_alignParentLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", com.mbridge.msdk.config.dynamic.utils.c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignTop);
            map.put("layout_alignBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignBottom);
            map.put("layout_alignLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignLeft);
            map.put("layout_alignRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignRight);
            map.put("layout_centerInParent", com.mbridge.msdk.config.dynamic.utils.c.layout_centerInParent);
            map.put("layout_alignParentEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentEnd);
            this.f47572a = new SoftReference<>(map);
        }
        return this.f47572a.get();
    }

    public HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> c() {
        return this.f47574c;
    }

    public int d(String str) {
        if (this.f47573b == null) {
            return 0;
        }
        String strI = com.mbridge.msdk.foundation.controller.c.n().i();
        if (TextUtils.isEmpty(strI)) {
            strI = this.f47573b.getPackageName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strI);
        sb2.append(".R$");
        String[] strArrSplit = str.split("\\.");
        sb2.append(strArrSplit[1]);
        try {
            Class<?> cls = Class.forName(sb2.toString());
            Object objNewInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(strArrSplit[2]);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(objNewInstance)).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public int e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception e10) {
            q0.b("ComponentResource", e10.getMessage());
            return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc A[PHI: r6
  0x00cc: PHI (r6v1 int) = 
  (r6v0 int)
  (r6v2 int)
  (r6v3 int)
  (r6v4 int)
  (r6v5 int)
  (r6v6 int)
  (r6v7 int)
  (r6v8 int)
  (r6v9 int)
  (r6v10 int)
  (r6v11 int)
  (r6v12 int)
 binds: [B:50:0x00a9, B:62:0x00ca, B:61:0x00c7, B:60:0x00c5, B:59:0x00c2, B:58:0x00c0, B:57:0x00bd, B:56:0x00b9, B:55:0x00b5, B:54:0x00b2, B:53:0x00b0, B:52:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.dynamic.c.c(java.lang.String):int");
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf("d");
            int iIndexOf2 = str.indexOf("s");
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i10 = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains("d")) {
                return e.a(this.f47573b, i10);
            }
            str.contains("s");
            return i10;
        }
    }

    public int a(String str, String str2) {
        if (this.f47573b == null) {
            return 0;
        }
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            if (TextUtils.isEmpty(strI)) {
                strI = this.f47573b.getPackageName();
            }
            return contextD.getResources().getIdentifier(str2, str, strI);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void d() {
        HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> map = new HashMap<>();
        this.f47574c = map;
        map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
        this.f47574c.put(H2.f75840g, com.mbridge.msdk.config.dynamic.utils.c.background);
        this.f47574c.put("visibility", com.mbridge.msdk.config.dynamic.utils.c.visibility);
        this.f47574c.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
        this.f47574c.put("padding", com.mbridge.msdk.config.dynamic.utils.c.padding);
        this.f47574c.put("paddingTop", com.mbridge.msdk.config.dynamic.utils.c.paddingTop);
        this.f47574c.put("paddingBottom", com.mbridge.msdk.config.dynamic.utils.c.paddingBottom);
        this.f47574c.put("paddingLeft", com.mbridge.msdk.config.dynamic.utils.c.paddingLeft);
        this.f47574c.put("paddingRight", com.mbridge.msdk.config.dynamic.utils.c.paddingRight);
        this.f47574c.put("paddingStart", com.mbridge.msdk.config.dynamic.utils.c.paddingStart);
        this.f47574c.put("paddingEnd", com.mbridge.msdk.config.dynamic.utils.c.paddingEnd);
        this.f47574c.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
        this.f47574c.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
        this.f47574c.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
        this.f47574c.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
        this.f47574c.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
        this.f47574c.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
        this.f47574c.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
        this.f47574c.put("alpha", com.mbridge.msdk.config.dynamic.utils.c.alpha);
        this.f47574c.put(Key.ROTATION, com.mbridge.msdk.config.dynamic.utils.c.rotation);
        this.f47574c.put("scaleX", com.mbridge.msdk.config.dynamic.utils.c.scaleX);
        this.f47574c.put("scaleY", com.mbridge.msdk.config.dynamic.utils.c.scaleY);
        this.f47574c.put("translationX", com.mbridge.msdk.config.dynamic.utils.c.translationX);
        this.f47574c.put("translationY", com.mbridge.msdk.config.dynamic.utils.c.translationY);
        this.f47574c.put(s.z.f67720z, com.mbridge.msdk.config.dynamic.utils.c.tag);
        this.f47574c.put("text", com.mbridge.msdk.config.dynamic.utils.c.text);
        this.f47574c.put("textColor", com.mbridge.msdk.config.dynamic.utils.c.textColor);
        this.f47574c.put("textSize", com.mbridge.msdk.config.dynamic.utils.c.textSize);
        this.f47574c.put("textStyle", com.mbridge.msdk.config.dynamic.utils.c.textStyle);
        this.f47574c.put("maxLines", com.mbridge.msdk.config.dynamic.utils.c.maxLines);
        this.f47574c.put("minLines", com.mbridge.msdk.config.dynamic.utils.c.minLines);
        this.f47574c.put("lines", com.mbridge.msdk.config.dynamic.utils.c.lines);
        this.f47574c.put("ellipsize", com.mbridge.msdk.config.dynamic.utils.c.ellipsize);
        this.f47574c.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
        this.f47574c.put("drawablePadding", com.mbridge.msdk.config.dynamic.utils.c.drawablePadding);
        this.f47574c.put("drawableStart", com.mbridge.msdk.config.dynamic.utils.c.drawableStart);
        this.f47574c.put("drawableEnd", com.mbridge.msdk.config.dynamic.utils.c.drawableEnd);
        this.f47574c.put("drawableTop", com.mbridge.msdk.config.dynamic.utils.c.drawableTop);
        this.f47574c.put("drawableBottom", com.mbridge.msdk.config.dynamic.utils.c.drawableBottom);
        this.f47574c.put("singleLine", com.mbridge.msdk.config.dynamic.utils.c.singleLine);
        this.f47574c.put("marqueeRepeatLimit", com.mbridge.msdk.config.dynamic.utils.c.marqueeRepeatLimit);
        this.f47574c.put("includeFontPadding", com.mbridge.msdk.config.dynamic.utils.c.includeFontPadding);
        this.f47574c.put("lineSpacingExtra", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingExtra);
        this.f47574c.put("lineSpacingMultiplier", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingMultiplier);
        this.f47574c.put("hint", com.mbridge.msdk.config.dynamic.utils.c.hint);
        this.f47574c.put("inputType", com.mbridge.msdk.config.dynamic.utils.c.inputType);
        this.f47574c.put("maxLength", com.mbridge.msdk.config.dynamic.utils.c.maxLength);
        this.f47574c.put("textIsSelectable", com.mbridge.msdk.config.dynamic.utils.c.textIsSelectable);
        this.f47574c.put("cursorVisible", com.mbridge.msdk.config.dynamic.utils.c.cursorVisible);
        this.f47574c.put("backgroundTint", com.mbridge.msdk.config.dynamic.utils.c.backgroundTint);
        this.f47574c.put("allCaps", com.mbridge.msdk.config.dynamic.utils.c.allCaps);
        this.f47574c.put("src", com.mbridge.msdk.config.dynamic.utils.c.src);
        this.f47574c.put("scaleType", com.mbridge.msdk.config.dynamic.utils.c.scaleType);
        this.f47574c.put("adjustViewBounds", com.mbridge.msdk.config.dynamic.utils.c.adjustViewBounds);
        this.f47574c.put("maxWidth", com.mbridge.msdk.config.dynamic.utils.c.maxWidth);
        this.f47574c.put("maxHeight", com.mbridge.msdk.config.dynamic.utils.c.maxHeight);
        this.f47574c.put("tint", com.mbridge.msdk.config.dynamic.utils.c.tint);
        this.f47574c.put("divider", com.mbridge.msdk.config.dynamic.utils.c.divider);
        this.f47574c.put("dividerHeight", com.mbridge.msdk.config.dynamic.utils.c.dividerHeight);
        this.f47574c.put("scrollbars", com.mbridge.msdk.config.dynamic.utils.c.scrollbars);
        this.f47574c.put("listSelector", com.mbridge.msdk.config.dynamic.utils.c.listSelector);
        this.f47574c.put("stackFromBottom", com.mbridge.msdk.config.dynamic.utils.c.stackFromBottom);
        this.f47574c.put("transcriptMode", com.mbridge.msdk.config.dynamic.utils.c.transcriptMode);
        this.f47574c.put("numColumns", com.mbridge.msdk.config.dynamic.utils.c.numColumns);
        this.f47574c.put("verticalSpacing", com.mbridge.msdk.config.dynamic.utils.c.verticalSpacing);
        this.f47574c.put("horizontalSpacing", com.mbridge.msdk.config.dynamic.utils.c.horizontalSpacing);
        this.f47574c.put("stretchMode", com.mbridge.msdk.config.dynamic.utils.c.stretchMode);
        this.f47574c.put("columnWidth", com.mbridge.msdk.config.dynamic.utils.c.columnWidth);
        this.f47574c.put("fillViewport", com.mbridge.msdk.config.dynamic.utils.c.fillViewport);
        this.f47574c.put("scrollbarStyle", com.mbridge.msdk.config.dynamic.utils.c.scrollbarStyle);
        this.f47574c.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
        this.f47574c.put("weightSum", com.mbridge.msdk.config.dynamic.utils.c.weightSum);
        this.f47574c.put("baselineAligned", com.mbridge.msdk.config.dynamic.utils.c.baselineAligned);
        this.f47574c.put("measureWithLargestChild", com.mbridge.msdk.config.dynamic.utils.c.measureWithLargestChild);
        this.f47574c.put("ignoreGravity", com.mbridge.msdk.config.dynamic.utils.c.ignoreGravity);
        this.f47574c.put("foreground", com.mbridge.msdk.config.dynamic.utils.c.foreground);
        this.f47574c.put("foregroundGravity", com.mbridge.msdk.config.dynamic.utils.c.foregroundGravity);
        this.f47574c.put("measureAllChildren", com.mbridge.msdk.config.dynamic.utils.c.measureAllChildren);
        this.f47574c.put("style", com.mbridge.msdk.config.dynamic.utils.c.style);
        this.f47574c.put("progress", com.mbridge.msdk.config.dynamic.utils.c.progress);
        this.f47574c.put("max", com.mbridge.msdk.config.dynamic.utils.c.max);
        this.f47574c.put("progressDrawable", com.mbridge.msdk.config.dynamic.utils.c.progressDrawable);
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f47573b != null) {
            try {
                return new b(this.f47573b, aVar).a(str, viewGroup);
            } catch (Exception e10) {
                q0.b("ComponentResource", e10.getMessage());
            }
        }
        return null;
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("@color/")) {
            return 0;
        }
        return this.f47573b.getResources().getColor(a("color", str.substring(7)));
    }
}
