package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.i.jn;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class cq {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1417 = -2696279443224279490L;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1418 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f1419 = {IOUtils.DIR_SEPARATOR_UNIX, 'a', 'c', 't', 'i', 'v', 'y', 'w', 'n', 'd', 'o', 'L', 'f', 'e', 'l', 'p', 'F', 'u', 's', 'M', 'h', ' ', 'r', 'A', 'N', 'm', 'V', 'C', 'j', 'P', 'x', 'T', 'I', 'E', 'J', 'S', 'B', '.', '_', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1420 = 7;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1421;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private x f1422;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private cm f1423;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private jo f1424;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1425;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jh f1426 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private du f1427;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ch f1428;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hs f1429;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private db f1430;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bd f1431;

    class a<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$a$1, reason: invalid class name */
        final class AnonymousClass1 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1501;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1502;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ r f1503;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1504;

            AnonymousClass1(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1503 = rVar;
                this.f1501 = jSONObject;
                this.f1504 = obj;
                this.f1502 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1503.mo4550(this.f1501, this.f1504, this.f1502);
            }
        }
    }

    class b<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$b$3, reason: invalid class name */
        final class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ r f1505;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1506;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1507;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1508;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1509;

            AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1505 = rVar;
                this.f1508 = jSONObject;
                this.f1509 = obj;
                this.f1506 = obj2;
                this.f1507 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1505.mo5992(this.f1508, this.f1509, this.f1506, this.f1507);
            }
        }
    }

    class c<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$c$2, reason: invalid class name */
        final class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1510;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1511;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1512;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1513;

            AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1511 = rVar;
                this.f1512 = jSONObject;
                this.f1510 = obj;
                this.f1513 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1511.mo5994(this.f1512, this.f1510, this.f1513);
            }
        }
    }

    class d<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$d$2, reason: invalid class name */
        final class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1514;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1515;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1516;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1517;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ r f1518;

            AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1518 = rVar;
                this.f1514 = jSONObject;
                this.f1517 = obj;
                this.f1515 = obj2;
                this.f1516 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1518.mo6001(this.f1514, this.f1517, this.f1515, this.f1516);
            }
        }
    }

    class e<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$e$3, reason: invalid class name */
        final class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1519;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1520;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1521;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1522;

            AnonymousClass3(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1520 = rVar;
                this.f1519 = jSONObject;
                this.f1521 = obj;
                this.f1522 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1520.mo4555(this.f1519, this.f1521, this.f1522);
            }
        }
    }

    class f<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$f$4, reason: invalid class name */
        final class AnonymousClass4 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1523;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1524;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1525;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ r f1526;

            AnonymousClass4(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1526 = rVar;
                this.f1525 = jSONObject;
                this.f1523 = obj;
                this.f1524 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1526.mo6000(this.f1525, this.f1523, this.f1524);
            }
        }
    }

    class h<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$h$2, reason: invalid class name */
        final class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1527;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ r f1528;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1529;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1530;

            AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1528 = rVar;
                this.f1527 = jSONObject;
                this.f1529 = obj;
                this.f1530 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1528.mo5991(this.f1527, this.f1529, this.f1530);
            }
        }
    }

    class j<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cq$j$2, reason: invalid class name */
        final class AnonymousClass2 extends ir {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1531;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1532;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ r f1533;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1534;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1535;

            AnonymousClass2(r rVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1533 = rVar;
                this.f1532 = jSONObject;
                this.f1531 = obj;
                this.f1535 = obj2;
                this.f1534 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                this.f1533.mo5997(this.f1532, this.f1531, this.f1535, this.f1534);
            }
        }
    }

    protected cq(cm cmVar, db dbVar, bd bdVar, hs hsVar, du duVar) {
        this.f1429 = hsVar;
        du duVar2 = new du(new HashMap(), duVar, true);
        this.f1427 = duVar2;
        duVar2.m6395(m5976().m6628());
        duVar.m6397(hsVar.m6626(), this);
        this.f1430 = dbVar;
        this.f1431 = bdVar;
        this.f1428 = m5925();
        this.f1423 = cmVar;
        this.f1422 = new x();
        m5943(m5947("왬釮椹셎颞烒졁ꎩ篚팊ꭟʍ\uda27뉡ල\ue5d7뵀ᕒ\uecea䐸ᱮ\uf78e俑✑ﺯ囩⸹", 22453 - (Process.myTid() >> 22)).intern(), new ArrayList());
        m5929();
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private ch m5925() {
        ch chVar = new ch() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ch
            /* JADX INFO: renamed from: ﻐ */
            public final void mo5832(final String str, final List<Object> list) {
                final boolean z10 = true;
                final boolean z11 = false;
                cq.m5940(cq.this, str, true, false, list);
                cq.m5965(cq.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        cq.m5940(cq.this, str, false, z11, list);
                    }
                }, false);
                cq.m5965(cq.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        cq.m5940(cq.this, str, false, z10, list);
                    }
                }, true);
            }
        };
        int i10 = f1421 + 119;
        f1418 = i10 % 128;
        if (i10 % 2 != 0) {
            return chVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private jh m5926() {
        jh jhVar = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                cq cqVar = cq.this;
                cqVar.m5980(ih.f2532, cq.m5957(cqVar, activity, (Bundle) null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                cq cqVar = cq.this;
                cqVar.m5980(ih.f2533, cq.m5957(cqVar, activity, (Bundle) null));
            }
        };
        int i10 = f1418 + 75;
        f1421 = i10 % 128;
        if (i10 % 2 == 0) {
            return jhVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private void m5927() {
        int i10 = f1418 + 67;
        f1421 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1422.m7350();
            int i11 = 85 / 0;
        } else {
            this.f1422.m7350();
        }
        f1421 = (f1418 + 11) % 128;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private void m5928() {
        int i10 = f1418 + 105;
        f1421 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1422.m7348();
        } else {
            this.f1422.m7348();
            int i11 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m5929() {
        f1418 = (f1421 + 19) % 128;
        for (Cdo cdo : m5976().m6623()) {
            if (m5968(cdo)) {
                int i10 = f1418 + 45;
                f1421 = i10 % 128;
                int i11 = i10 % 2;
                m5941(cdo);
                if (i11 != 0) {
                    int i12 = 89 / 0;
                }
            }
            f1421 = (f1418 + 33) % 128;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m5930() {
        int i10 = f1418 + 101;
        f1421 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1422.m7346();
            int i11 = 76 / 0;
        } else {
            this.f1422.m7346();
        }
        int i12 = f1418 + 69;
        f1421 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private dp m5931() {
        int i10 = f1421 + 91;
        f1418 = i10 % 128;
        if (i10 % 2 != 0) {
            return m5983().m5889();
        }
        m5983().m5889();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5940(cq cqVar, String str, boolean z10, boolean z11, List list) {
        f1421 = (f1418 + 77) % 128;
        cqVar.m5935(str, z10, z11, list);
        int i10 = f1421 + 67;
        f1418 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ du m5954(cq cqVar) {
        int i10 = (f1418 + 35) % 128;
        f1421 = i10;
        du duVar = cqVar.f1427;
        int i11 = i10 + 41;
        f1418 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 58 / 0;
        }
        return duVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m5965(cq cqVar, im imVar, boolean z10) {
        int i10 = f1418 + 5;
        f1421 = i10 % 128;
        int i11 = i10 % 2;
        cqVar.m5942(imVar, z10);
        if (i11 != 0) {
            int i12 = 52 / 0;
        }
        int i13 = f1421 + 53;
        f1418 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    protected final void m5969() {
        f1418 = (f1421 + 31) % 128;
        m5927();
        m5928();
        m5930();
        if (this.f1426 != null) {
            jj.m6964().m6966(this.f1426);
            this.f1426 = null;
        }
        jo joVar = this.f1424;
        if (joVar != null) {
            f1421 = (f1418 + 125) % 128;
            joVar.m6992();
            this.f1424 = null;
            f1421 = (f1418 + 77) % 128;
        }
        this.f1428 = null;
        int i10 = f1418 + 13;
        f1421 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final db m5970() {
        int i10 = f1421 + 119;
        int i11 = i10 % 128;
        f1418 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        db dbVar = this.f1430;
        int i12 = i11 + 121;
        f1421 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 81 / 0;
        }
        return dbVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m5971() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5983().m5896());
        sb2.append(m5948("\u0093", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 100)).intern());
        sb2.append(m5976().m6626());
        String string = sb2.toString();
        int i10 = f1421 + 21;
        f1418 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final ch m5972() {
        int i10 = (f1421 + 69) % 128;
        f1418 = i10;
        ch chVar = this.f1428;
        f1421 = (i10 + 107) % 128;
        return chVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final du m5973() {
        int i10 = f1421 + 87;
        f1418 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1427;
        }
        int i11 = 0 / 0;
        return this.f1427;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final JSONObject m5974() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ih.f2568, m5983().m5900());
            jSONObject.put(ih.f2523, m5983().m5890());
            jSONObject.put(ih.f2521, m5983().m5899());
        } catch (JSONException e10) {
            String strIntern = m5947("왬ဘ櫕䒘齆\ue914쏭ᶏ瑪丌飓\uf2ab쵿✷燱䮡", (ViewConfiguration.getPressedStateDuration() >> 16) + 54851).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m5947("왻썅챞쥊퉨\udf33\ud86b\ue573\uee13\ueb0e\uf410\uf134屮蜬聠跜雘鏂鳲駡ꊪ꿩ꢋ떞뺈믥䓴", View.resolveSizeAndState(0, 0, 0) + 1289).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m7098(strIntern, sb2.toString());
        }
        int i10 = f1421 + 49;
        f1418 = i10 % 128;
        if (i10 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hs m5976() {
        hs hsVar;
        int i10 = f1418;
        int i11 = i10 + 97;
        f1421 = i11 % 128;
        if (i11 % 2 != 0) {
            hsVar = this.f1429;
            int i12 = 98 / 0;
        } else {
            hsVar = this.f1429;
        }
        f1421 = (i10 + 49) % 128;
        return hsVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m5979() {
        int i10 = (f1421 + 37) % 128;
        f1418 = i10;
        JSONObject jSONObject = this.f1425;
        f1421 = (i10 + 123) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m5950(JSONObject jSONObject) {
        f1418 = (f1421 + 31) % 128;
        JSONObject jSONObjectM5974 = m5974();
        jz.m7083(jSONObjectM5974, jSONObject);
        int i10 = f1421 + 99;
        f1418 = i10 % 128;
        if (i10 % 2 != 0) {
            return jSONObjectM5974;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ JSONObject m5957(cq cqVar, Activity activity, Bundle bundle) {
        int i10 = f1421 + 39;
        f1418 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM5963 = cqVar.m5963(activity, bundle);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
        f1421 = (f1418 + 53) % 128;
        return jSONObjectM5963;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ boolean m5967(Activity activity, List list) {
        int i10 = f1418 + 49;
        f1421 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5945(activity, (List<String>) list);
        }
        m5945(activity, (List<String>) list);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ds m5975(String str) {
        int i10 = f1421 + 103;
        f1418 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        ds dsVarM6625 = m5976().m6625(str);
        f1418 = (f1421 + 107) % 128;
        return dsVarM6625;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Context m5977() {
        f1421 = (f1418 + 59) % 128;
        Context contextM5887 = m5983().m5887();
        int i10 = f1421 + 95;
        f1418 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 99 / 0;
        }
        return contextM5887;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m5978(JSONObject jSONObject) {
        int i10 = f1418 + 43;
        f1421 = i10 % 128;
        int i11 = i10 % 2;
        this.f1425 = jz.m7094(jSONObject, true);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final bd m5981() {
        bd bdVar;
        int i10 = f1421 + 27;
        int i11 = i10 % 128;
        f1418 = i11;
        if (i10 % 2 == 0) {
            bdVar = this.f1431;
            int i12 = 26 / 0;
        } else {
            bdVar = this.f1431;
        }
        int i13 = i11 + 105;
        f1421 = i13 % 128;
        if (i13 % 2 == 0) {
            return bdVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final cm m5983() {
        int i10 = f1421 + 43;
        int i11 = i10 % 128;
        f1418 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        cm cmVar = this.f1423;
        f1421 = (i11 + 89) % 128;
        return cmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5941(com.ironsource.adqualitysdk.sdk.i.Cdo r15) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5941(com.ironsource.adqualitysdk.sdk.i.do):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m5958(Cdo cdo) {
        JSONObject jSONObjectM5964 = m5964(cdo.m6313());
        if (jSONObjectM5964 != null) {
            f1418 = (f1421 + 55) % 128;
            m5936(jSONObjectM5964, m5932(false), m5932(true));
            f1421 = (f1418 + 77) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m5984(il ilVar) {
        int i10 = f1418 + 21;
        f1421 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1423.m5888().m5048(ilVar);
        } else {
            this.f1423.m5888().m5048(ilVar);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5934(Cdo cdo) {
        f1418 = (f1421 + 35) % 128;
        JSONObject jSONObjectM5964 = m5964(cdo.m6313());
        if (jSONObjectM5964 != null) {
            f1421 = (f1418 + 1) % 128;
            final String strM6312 = cdo.m6312();
            is isVar = null;
            if (!TextUtils.isEmpty(strM6312)) {
                f1421 = (f1418 + 17) % 128;
                final ds dsVarM5975 = m5975(strM6312);
                if (dsVarM5975 != null) {
                    isVar = new is() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.5

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f1475 = 1;

                        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                        private static int f1476 = 0;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static char[] f1477 = {'R', 'e', 'm', 'o', 't', 'A', 'd', 'L', 'i', 's', 'n', 'r', 'E', ' ', 'g', 'w', 'b', 'V', 'f', 'S', 'T', 'U', 'W', 'X', 'Y'};

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static char f1478 = 5;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static String m6024(String str, int i10, byte b10) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (g.f2153) {
                                try {
                                    char[] cArr2 = f1477;
                                    char c10 = f1478;
                                    char[] cArr3 = new char[i10];
                                    if (i10 % 2 != 0) {
                                        i10--;
                                        cArr3[i10] = (char) (cArr[i10] - b10);
                                    }
                                    if (i10 > 1) {
                                        g.f2158 = 0;
                                        while (true) {
                                            int i11 = g.f2158;
                                            if (i11 >= i10) {
                                                break;
                                            }
                                            g.f2157 = cArr[i11];
                                            g.f2155 = cArr[g.f2158 + 1];
                                            if (g.f2157 == g.f2155) {
                                                cArr3[g.f2158] = (char) (g.f2157 - b10);
                                                cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                                            } else {
                                                g.f2156 = g.f2157 / c10;
                                                g.f2154 = g.f2157 % c10;
                                                g.f2159 = g.f2155 / c10;
                                                g.f2152 = g.f2155 % c10;
                                                if (g.f2154 == g.f2152) {
                                                    g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                                    g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                                    int i12 = (g.f2156 * c10) + g.f2154;
                                                    int i13 = (g.f2159 * c10) + g.f2152;
                                                    int i14 = g.f2158;
                                                    cArr3[i14] = cArr2[i12];
                                                    cArr3[i14 + 1] = cArr2[i13];
                                                } else if (g.f2156 == g.f2159) {
                                                    g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                                    g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                                    int i15 = (g.f2156 * c10) + g.f2154;
                                                    int i16 = (g.f2159 * c10) + g.f2152;
                                                    int i17 = g.f2158;
                                                    cArr3[i17] = cArr2[i15];
                                                    cArr3[i17 + 1] = cArr2[i16];
                                                } else {
                                                    int i18 = (g.f2156 * c10) + g.f2152;
                                                    int i19 = (g.f2159 * c10) + g.f2154;
                                                    int i20 = g.f2158;
                                                    cArr3[i20] = cArr2[i18];
                                                    cArr3[i20 + 1] = cArr2[i19];
                                                }
                                            }
                                            g.f2158 += 2;
                                        }
                                    }
                                    str2 = new String(cArr3);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.is
                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        public final List<WebView> mo6025(Object obj) {
                            int i10 = f1476 + 121;
                            f1475 = i10 % 128;
                            try {
                                if (i10 % 2 != 0) {
                                    return (List) dsVarM5975.m6385(cq.m5954(cq.this), cq.this, Collections.singletonList(obj)).m6377();
                                }
                                int i11 = 55 / 0;
                                return (List) dsVarM5975.m6385(cq.m5954(cq.this), cq.this, Collections.singletonList(obj)).m6377();
                            } catch (Exception unused) {
                                String strIntern = m6024("\u0001\u0002\u0003\u0004\u0000\u0002\u0006\u0007\b\t\u000e\t\u0000\u000b\u0006\u0010", 15 - Process.getGidForName(""), (byte) (KeyEvent.keyCodeFromString("") + 123)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m6024("\r\f\r\u0001\f\u000e\u000b\u0004ÐÐ\u0005\r\n\u000e\u0010\u0000\u0011\u0012\u0006\u0003\u0013\u0005\u0012\u0017\r\u0001\u0003\f", 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (91 - ImageFormat.getBitsPerPixel(0))).intern());
                                sb2.append(strM6312);
                                k.m7098(strIntern, sb2.toString());
                                return null;
                            }
                        }
                    };
                } else {
                    String strM5971 = m5971();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5948("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", 22 - Color.blue(0), (byte) (MotionEvent.axisFromString("") + 105)).intern());
                    sb2.append(strM6312);
                    sb2.append(m5947("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", (KeyEvent.getMaxKeyCode() >> 16) + 41443).intern());
                    co.m5911(strM5971, sb2.toString(), null);
                }
            }
            m5952(jSONObjectM5964, m5961(false), m5961(true), isVar);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m5966(String str, Cdo cdo) {
        JSONObject jSONObjectM5964 = m5964(cdo.m6313());
        if (jSONObjectM5964 != null && jSONObjectM5964.has(m5947("왊ꯠᴩ轎炒\ue20f命㦝ꯓᵤ躠烌\ue21d垭㧄\uab18ᵞ躚", 28082 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
            jn.e eVarM6985 = jn.e.m6985(jSONObjectM5964.optString(m5947("왊ꯠᴩ轎炒\ue20f命㦝ꯓᵤ躠烌\ue21d垭㧄\uab18ᵞ躚", 28081 - View.getDefaultSize(0, 0)).intern(), null));
            String strM5933 = m5933(str, jSONObjectM5964);
            if (eVarM6985 != null) {
                f1421 = (f1418 + 79) % 128;
                jn.m6976().m6981(strM5933, eVarM6985);
            }
        }
        f1418 = (f1421 + 119) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m5952(JSONObject jSONObject, l lVar, l lVar2, is isVar) {
        f1418 = (f1421 + 59) % 128;
        this.f1422.m7347(jSONObject, m5939(lVar, lVar2), m5926(), isVar);
        f1421 = (f1418 + 17) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m5959(JSONObject jSONObject, p pVar, p pVar2) {
        int i10 = f1421 + 47;
        f1418 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1422.m7349(jSONObject, m5962(pVar, pVar2));
            throw null;
        }
        this.f1422.m7349(jSONObject, m5962(pVar, pVar2));
        f1421 = (f1418 + 5) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r4 = m5975(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        m5944(r0, r2, r1, new com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass10(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r0 = m5971();
        r1 = new java.lang.StringBuilder();
        r1.append(m5948("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", android.graphics.Color.green(0) + 22, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0) + 104)).intern());
        r1.append(r7);
        r1.append(m5947("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", 41443 - android.view.View.resolveSize(0, 0)).intern());
        com.ironsource.adqualitysdk.sdk.i.co.m5911(r0, r1.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        m5959(r0, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) == false) goto L11;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5951(com.ironsource.adqualitysdk.sdk.i.Cdo r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1421
            int r0 = r0 + 87
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1418 = r0
            org.json.JSONObject r0 = r7.m6313()
            org.json.JSONObject r0 = r6.m5964(r0)
            if (r0 == 0) goto L9d
            int r1 = com.ironsource.adqualitysdk.sdk.i.cq.f1418
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1421 = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            java.lang.String r7 = r7.m6314()
            com.ironsource.adqualitysdk.sdk.i.p r1 = r6.m5946(r2)
            com.ironsource.adqualitysdk.sdk.i.p r2 = r6.m5946(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L9a
            goto L45
        L33:
            java.lang.String r7 = r7.m6314()
            com.ironsource.adqualitysdk.sdk.i.p r1 = r6.m5946(r2)
            com.ironsource.adqualitysdk.sdk.i.p r2 = r6.m5946(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L9a
        L45:
            com.ironsource.adqualitysdk.sdk.i.ds r4 = r6.m5975(r7)
            if (r4 == 0) goto L54
            com.ironsource.adqualitysdk.sdk.i.cq$10 r7 = new com.ironsource.adqualitysdk.sdk.i.cq$10
            r7.<init>()
            r6.m5944(r0, r2, r1, r7)
            return
        L54:
            java.lang.String r0 = r6.m5971()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = android.graphics.Color.green(r3)
            int r2 = r2 + 22
            r4 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionGroup(r4)
            int r4 = r4 + 104
            byte r4 = (byte) r4
            java.lang.String r5 = "\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016"
            java.lang.String r2 = m5948(r5, r2, r4)
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            r1.append(r7)
            r7 = 41443(0xa1e3, float:5.8074E-41)
            int r2 = android.view.View.resolveSize(r3, r3)
            int r7 = r7 - r2
            java.lang.String r2 = "옞枳薗⏣䆒\uef37ഃꭾ쥈皡"
            java.lang.String r7 = m5947(r2, r7)
            java.lang.String r7 = r7.intern()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r1 = 0
            com.ironsource.adqualitysdk.sdk.i.co.m5911(r0, r7, r1)
            return
        L9a:
            r6.m5959(r0, r2, r1)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5951(com.ironsource.adqualitysdk.sdk.i.do):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m5956(String str) {
        Class clsM5104;
        int i10 = f1421 + 75;
        f1418 = i10 % 128;
        if (i10 % 2 != 0 ? (clsM5104 = m5981().m5104(kc.m7152(str, m5947("옐٬䘰蛌욉ڸ", 49201 - View.combineMeasuredStates(0, 0)).intern()))) != null : (clsM5104 = m5981().m5104(kc.m7152(str, m5947("옐٬䘰蛌욉ڸ", 49201 % View.combineMeasuredStates(0, 0)).intern()))) != null) {
            return clsM5104.getName();
        }
        f1418 = (f1421 + 99) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5968(Cdo cdo) {
        List listMo4773 = ar.m4771().mo4773();
        ISAdQualityAdType iSAdQualityAdTypeM6315 = cdo.m6315();
        if (listMo4773 != null) {
            f1418 = (f1421 + 93) % 128;
            if (iSAdQualityAdTypeM6315 != ISAdQualityAdType.UNKNOWN) {
                f1418 = (f1421 + 111) % 128;
                if (!listMo4773.contains(iSAdQualityAdTypeM6315)) {
                    return true;
                }
                int i10 = f1418 + 123;
                f1421 = i10 % 128;
                if (i10 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private v m5955(final v vVar, final v vVar2) {
        f1418 = (f1421 + 115) % 128;
        if (vVar == null) {
            vVar = new v();
        }
        if (vVar2 == null) {
            vVar2 = new v();
            f1421 = (f1418 + 37) % 128;
        }
        return new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5991(JSONObject jSONObject, WebView webView, View view) {
                mo5991(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5994(JSONObject jSONObject, WebView webView, View view) {
                mo5994(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4550(JSONObject jSONObject, WebView webView, View view) {
                mo4550(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6000(JSONObject jSONObject, WebView webView, View view) {
                mo6000(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4555(JSONObject jSONObject, WebView webView, View view) {
                mo4555(jSONObject, webView, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5992(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5992(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻛ */
            public final void mo4555(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo4555(jSONObject, webView, view);
                t.m7279(new e.AnonymousClass3(vVar, jSONObject, webView, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5997(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo5997(jSONObject, webView, obj, view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6001(JSONObject jSONObject, WebView webView, Object obj, View view) {
                mo6001(jSONObject, webView, obj, view);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4550(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo4550(jSONObject, webView, view);
                t.m7279(new a.AnonymousClass1(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo6001(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo6001(jSONObject, webView, obj, view);
                t.m7279(new d.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ */
            public final void mo5992(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5992(jSONObject, webView, obj, view);
                t.m7279(new b.AnonymousClass3(vVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo5994(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5994(jSONObject, webView, view);
                t.m7279(new c.AnonymousClass2(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ */
            public final void mo6000(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo6000(jSONObject, webView, view);
                t.m7279(new f.AnonymousClass4(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ */
            public final void mo5991(JSONObject jSONObject, WebView webView, View view) {
                vVar2.mo5991(jSONObject, webView, view);
                t.m7279(new h.AnonymousClass2(vVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ */
            public final void mo5997(JSONObject jSONObject, WebView webView, Object obj, View view) {
                vVar2.mo5997(jSONObject, webView, obj, view);
                t.m7279(new j.AnonymousClass2(vVar, jSONObject, webView, obj, view));
            }
        };
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5936(JSONObject jSONObject, v vVar, v vVar2) {
        int i10 = f1418 + 3;
        f1421 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1422.m7352(jSONObject, m5955(vVar, vVar2));
            throw null;
        }
        this.f1422.m7352(jSONObject, m5955(vVar, vVar2));
        f1421 = (f1418 + 15) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    protected final void m5982(String str, List<Object> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5948("&\u0007\u000b\u0018\u000f\u0000+\u001d\b\u0003\u0010\t\u0004\u000f\u0002&", 15 - ExpandableListView.getPackedPositionChild(0L), (byte) (Gravity.getAbsoluteGravity(0, 0) + 39)).intern());
        sb2.append(str);
        m5943(sb2.toString(), list);
        int i10 = f1421 + 25;
        f1418 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 42 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5933(String str, JSONObject jSONObject) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493 && str.equals(m5947("왈湒陑㹆", View.MeasureSpec.makeMeasureSpec(0, 0) + 43013).intern())) {
                    f1421 = (f1418 + 87) % 128;
                }
            } else if (str.equals(m5948("\u000b\u0000\t\n\u000b\b", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, (byte) (7 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                int i10 = f1418 + 9;
                f1421 = i10 % 128;
                b10 = i10 % 2 != 0 ? (byte) 5 : (byte) 2;
            }
            b10 = -1;
        } else if (str.equals(m5948("\u0002\u0003\u0004\u0005\u0006\u0005\u0004\u0000", 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0') + 78)).intern())) {
            int i11 = f1421 + 51;
            f1418 = i11 % 128;
            b10 = i11 % 2 == 0 ? (byte) 1 : (byte) 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return jSONObject.optString(m5948("\u0002\b\u001e\t\u0004\u0005\u0006\u0005\u0004\u0000\u0016\u0003\u001b\u000b", 14 - TextUtils.indexOf("", "", 0, 0), (byte) View.resolveSize(0, 0)).intern(), null);
        }
        if (b10 == 1) {
            return jSONObject.optString(m5948("\u0002\b\u0019\u0005\u0007\b\u0015\u0014\u0004\u000f\u0011\u0019\u0004\u0016l", 14 - ((byte) KeyEvent.getModifierMetaStateMask()), (byte) (7 - View.resolveSizeAndState(0, 0, 0))).intern(), null);
        }
        if (b10 != 2) {
            return null;
        }
        return jSONObject.optString(m5947("왈揾贉㚲僙﨟➩䇒\ueb05ᒁ뻅\ud810ַ", 42409 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jh m5960(final List<String> list) {
        jh jhVar = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.6

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static char f1482 = 5;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char[] f1483 = {'o', 'n', 'A', 'c', 't', 'i', 'v', 'y', 'C', 'r', 'e', 'a', 'd', 'S', 'P', 'u', 's', 'I', 'L', 'f', 'l', '.', 'p', 'q', 'w'};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1484 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1485 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1486 = -7895666258947269960L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f1487;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1488;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m6027(String str, Activity activity) {
                f1484 = (f1485 + 83) % 128;
                m6031(str, Collections.singletonList(activity));
                f1485 = (f1484 + 63) % 128;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m6029(String str, int i10, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2153) {
                    try {
                        char[] cArr2 = f1483;
                        char c10 = f1482;
                        char[] cArr3 = new char[i10];
                        if (i10 % 2 != 0) {
                            i10--;
                            cArr3[i10] = (char) (cArr[i10] - b10);
                        }
                        if (i10 > 1) {
                            g.f2158 = 0;
                            while (true) {
                                int i11 = g.f2158;
                                if (i11 >= i10) {
                                    break;
                                }
                                g.f2157 = cArr[i11];
                                g.f2155 = cArr[g.f2158 + 1];
                                if (g.f2157 == g.f2155) {
                                    cArr3[g.f2158] = (char) (g.f2157 - b10);
                                    cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                                } else {
                                    g.f2156 = g.f2157 / c10;
                                    g.f2154 = g.f2157 % c10;
                                    g.f2159 = g.f2155 / c10;
                                    g.f2152 = g.f2155 % c10;
                                    if (g.f2154 == g.f2152) {
                                        g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                        g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                        int i12 = (g.f2156 * c10) + g.f2154;
                                        int i13 = (g.f2159 * c10) + g.f2152;
                                        int i14 = g.f2158;
                                        cArr3[i14] = cArr2[i12];
                                        cArr3[i14 + 1] = cArr2[i13];
                                    } else if (g.f2156 == g.f2159) {
                                        g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                        g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                        int i15 = (g.f2156 * c10) + g.f2154;
                                        int i16 = (g.f2159 * c10) + g.f2152;
                                        int i17 = g.f2158;
                                        cArr3[i17] = cArr2[i15];
                                        cArr3[i17 + 1] = cArr2[i16];
                                    } else {
                                        int i18 = (g.f2156 * c10) + g.f2152;
                                        int i19 = (g.f2159 * c10) + g.f2154;
                                        int i20 = g.f2158;
                                        cArr3[i20] = cArr2[i18];
                                        cArr3[i20 + 1] = cArr2[i19];
                                    }
                                }
                                g.f2158 += 2;
                            }
                        }
                        str2 = new String(cArr3);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            static /* synthetic */ void m6030(AnonymousClass6 anonymousClass6, String str, List list2) {
                int i10 = f1484 + 87;
                f1485 = i10 % 128;
                int i11 = i10 % 2;
                anonymousClass6.m6032(str, false, (List<Object>) list2);
                f1484 = (f1485 + 63) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (!cq.m5967(activity, list)) {
                    return;
                }
                f1484 = (f1485 + 95) % 128;
                m6028(m6029("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\t\u0005\u000b\f\u0000\u000e\u0092", 16 - TextUtils.lastIndexOf("", '0', 0), (byte) (46 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), activity, bundle);
                f1485 = (f1484 + 73) % 128;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onActivityDestroyed(android.app.Activity r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1485
                    int r0 = r0 + 89
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1484 = r1
                    int r0 = r0 % 2
                    if (r0 != 0) goto L19
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5967(r6, r0)
                    r1 = 64
                    int r1 = r1 / 0
                    if (r0 == 0) goto L45
                    goto L21
                L19:
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5967(r6, r0)
                    if (r0 == 0) goto L45
                L21:
                    java.lang.String r0 = ""
                    r1 = 48
                    int r0 = android.text.TextUtils.lastIndexOf(r0, r1)
                    int r0 = r0 + 29985
                    char r0 = (char) r0
                    r2 = -480198943(0xffffffffe360bee1, float:-4.145825E21)
                    char r1 = android.text.AndroidCharacter.getMirror(r1)
                    int r1 = r1 + r2
                    java.lang.String r2 = "ᆂ悿⃣蝵"
                    java.lang.String r3 = "◞ᑶ䲫髙⚴瑝尟按씌\uf679봨앒淙\ue6d9ꄖ坯⮝\uf29e汪"
                    java.lang.String r4 = "᪸\uda69\uf55e鉬"
                    java.lang.String r0 = m6026(r3, r0, r4, r1, r2)
                    java.lang.String r0 = r0.intern()
                    r5.m6027(r0, r6)
                L45:
                    int r6 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1484
                    int r6 = r6 + 111
                    int r0 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1485 = r0
                    int r6 = r6 % 2
                    if (r6 != 0) goto L52
                    return
                L52:
                    r6 = 0
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.onActivityDestroyed(android.app.Activity):void");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                int fadingEdgeLength;
                int iResolveSize;
                int i10 = f1485 + 47;
                f1484 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 27 / 0;
                    if (!cq.m5967(activity, list)) {
                        return;
                    }
                } else if (!cq.m5967(activity, list)) {
                    return;
                }
                int i12 = f1485 + 37;
                f1484 = i12 % 128;
                if (i12 % 2 == 0) {
                    fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() << 15) + 123;
                    iResolveSize = 87 >>> View.resolveSize(1, 0);
                } else {
                    fadingEdgeLength = 16 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    iResolveSize = 44 - View.resolveSize(0, 0);
                }
                m6027(m6029("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\n\f\u0010\u0011\u000b\r", fadingEdgeLength, (byte) iResolveSize).intern(), activity);
                f1484 = (f1485 + 89) % 128;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onActivityResumed(android.app.Activity r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1484
                    int r0 = r0 + 19
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1485 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    if (r0 == 0) goto L19
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5967(r6, r0)
                    r2 = 94
                    int r2 = r2 / r1
                    if (r0 == 0) goto L45
                    goto L21
                L19:
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5967(r6, r0)
                    if (r0 == 0) goto L45
                L21:
                    int r0 = android.view.ViewConfiguration.getWindowTouchSlop()
                    int r0 = r0 >> 8
                    r2 = 58341(0xe3e5, float:8.1753E-41)
                    int r0 = r0 + r2
                    char r0 = (char) r0
                    r2 = -1081474287(0xffffffffbf8a0311, float:-1.0782186)
                    int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                    int r1 = r1 + r2
                    java.lang.String r2 = "ᄀ訃\ue5bf口"
                    java.lang.String r3 = "騮\ue0e4陑칳ଔ\u171c䒍젠◉吠ꟊ敖뉵靬\ue732Ꝑ䘬"
                    java.lang.String r4 = "᪸\uda69\uf55e鉬"
                    java.lang.String r0 = m6026(r3, r0, r4, r1, r2)
                    java.lang.String r0 = r0.intern()
                    r5.m6027(r0, r6)
                L45:
                    int r6 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1484
                    int r6 = r6 + 67
                    int r6 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1485 = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.onActivityResumed(android.app.Activity):void");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                f1485 = (f1484 + 79) % 128;
                if (cq.m5967(activity, list)) {
                    f1485 = (f1484 + 93) % 128;
                    m6028(m6029("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000e\f\u0005\u000b\u0010\u0002\u0013\u0001\u0010\u0006\u0000\r\u000e\u0003\u000e\u0001à", 27 - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 123)).intern(), activity, bundle);
                    f1484 = (f1485 + 119) % 128;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                f1484 = (f1485 + 5) % 128;
                if (cq.m5967(activity, list)) {
                    f1484 = (f1485 + 53) % 128;
                    m6027(m6029("\u0001\u0002\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000e\u0003\u000e\u0006\u0000\u000e\u0090", View.combineMeasuredStates(0, 0) + 17, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 44)).intern(), activity);
                }
                f1485 = (f1484 + 55) % 128;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onActivityStopped(android.app.Activity r6) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1484
                    int r0 = r0 + 83
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1485 = r1
                    int r0 = r0 % 2
                    if (r0 == 0) goto L19
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5967(r6, r0)
                    r1 = 88
                    int r1 = r1 / 0
                    if (r0 == 0) goto L49
                    goto L23
                L19:
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cq.m5967(r6, r0)
                    r1 = 1
                    r0 = r0 ^ r1
                    if (r0 == r1) goto L49
                L23:
                    long r0 = android.os.SystemClock.elapsedRealtime()
                    r2 = 0
                    int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    int r0 = r0 + 7996
                    char r0 = (char) r0
                    java.lang.String r1 = ""
                    int r1 = android.view.MotionEvent.axisFromString(r1)
                    r2 = 1332154649(0x4f671119, float:3.8766574E9)
                    int r2 = r2 - r1
                    java.lang.String r1 = "᪴朑㵏縟"
                    java.lang.String r3 = "溮쯏봉㜣⫑\udbcc鸩鳣╾ﾁ睏\uebae\uf425\uf648\udf19᠙Ꝉ"
                    java.lang.String r4 = "᪸\uda69\uf55e鉬"
                    java.lang.String r0 = m6026(r3, r0, r4, r2, r1)
                    java.lang.String r0 = r0.intern()
                    r5.m6027(r0, r6)
                L49:
                    int r6 = com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1484
                    int r6 = r6 + 95
                    int r6 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.f1485 = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.AnonymousClass6.onActivityStopped(android.app.Activity):void");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻐ */
            public final void mo4672(Activity activity) {
                char c10;
                int jumpTapTimeout;
                int i10 = f1485 + 67;
                f1484 = i10 % 128;
                if (i10 % 2 == 0) {
                    c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() - 90;
                } else {
                    c10 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                }
                m6027(m6026("魭饝੪㖗4隸舙쩐澲馘\ue92b躪\ue7cb៤軘遼ₐ䓌괰ᮠ蠷", c10, "᪸\uda69\uf55e鉬", (-192277445) - jumpTapTimeout, "㮢訔ᓴ洴").intern(), activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ｋ */
            public final void mo4673(Activity activity) {
                f1485 = (f1484 + 1) % 128;
                m6027(m6026("봝흇龃\ue27aヌ鹹䫛㠙䍮脋Ἧ䠀榯鿵\udd21⫖\uf639閡\ue871襾왴錏ℑ탩뢉", (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "᪸\uda69\uf55e鉬", (-1126885650) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\ued57픖펼˻").intern(), activity);
                int i10 = f1485 + 59;
                f1484 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m6026(String str, char c10, String str2, int i10, String str3) {
                String str4;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str2;
                if (str2 != null) {
                    charArray2 = str2.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str;
                if (str != null) {
                    charArray3 = str.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (com.ironsource.adqualitysdk.sdk.i.j.f2697) {
                    try {
                        char[] cArr4 = (char[]) cArr.clone();
                        char[] cArr5 = (char[]) cArr2.clone();
                        cArr4[0] = (char) (c10 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i10));
                        int length = cArr3.length;
                        char[] cArr6 = new char[length];
                        com.ironsource.adqualitysdk.sdk.i.j.f2699 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.j.f2699;
                            if (i11 < length) {
                                int i12 = (i11 + 2) % 4;
                                int i13 = (i11 + 3) % 4;
                                int i14 = cArr4[i11 % 4] * 32718;
                                char c11 = cArr5[i12];
                                char c12 = (char) ((i14 + c11) % 65535);
                                com.ironsource.adqualitysdk.sdk.i.j.f2698 = c12;
                                cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                                cArr4[i13] = c12;
                                int i15 = com.ironsource.adqualitysdk.sdk.i.j.f2699;
                                cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1486) ^ ((long) f1488)) ^ ((long) f1487));
                                com.ironsource.adqualitysdk.sdk.i.j.f2699 = i15 + 1;
                            } else {
                                str4 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str4;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m6028(String str, Activity activity, Bundle bundle) {
                f1485 = (f1484 + 93) % 128;
                m6031(str, Arrays.asList(activity, bundle));
                int i10 = f1484 + 63;
                f1485 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 39 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m6031(final String str, final List<Object> list2) {
                m6032(str, true, list2);
                t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.6.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4564() {
                        AnonymousClass6.m6030(AnonymousClass6.this, str, list2);
                    }
                });
                int i10 = f1484 + 95;
                f1485 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m6032(String str, boolean z10, List<Object> list2) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6029("\u0003\u0004\u0000\t\u0007\u0006\u0002\t\u000f\b\u000f\u000e\u0002\b\u0000\u0017\u000b\u0014", TextUtils.getOffsetBefore("", 0) + 18, (byte) (34 - TextUtils.indexOf("", "", 0))).intern());
                sb2.append(str);
                cq.m5940(cqVar, sb2.toString(), z10, false, list2);
                int i10 = f1485 + 83;
                f1484 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 36 / 0;
                }
            }
        };
        int i10 = f1418 + 65;
        f1421 = i10 % 128;
        if (i10 % 2 == 0) {
            return jhVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m5964(JSONObject jSONObject) {
        dp dpVarM5931;
        f1421 = (f1418 + 77) % 128;
        String strOptString = jSONObject.optString(m5948(" \u000e$\u001d\u0007\r\u0002 ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (byte) (88 - TextUtils.indexOf("", ""))).intern());
        jSONObject.remove(m5948(" \u000e$\u001d\u0007\r\u0002 ", AndroidCharacter.getMirror('0') - '(', (byte) (88 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern());
        if (jSONObject.optBoolean(m5947("왗珗굚\ue6ce၁䷩蝞ー", 46471 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern()) && (dpVarM5931 = m5931()) != null) {
            if (!TextUtils.isEmpty(dpVarM5931.m6323())) {
                jSONObject.remove(m5947("왗珗굚\ue6ce၁䷩蝞ー", TextUtils.indexOf((CharSequence) "", '0') + 46472).intern());
                try {
                    String strIntern = m5948(" \u000e&\u0011\u001d\u000b\"\u0007\u0003\u0004", 10 - Color.red(0), (byte) (60 - Color.green(0))).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString);
                    sb2.append(dpVarM5931.m6323());
                    jSONObject.put(strIntern, sb2.toString());
                } catch (JSONException unused) {
                }
            }
            if (dpVarM5931.m6321()) {
                int i10 = f1421 + 61;
                f1418 = i10 % 128;
                try {
                    if (i10 % 2 == 0) {
                        jSONObject.put(m5948("\u0012\u0013\f\"\u001f\u0002\u001d\b \u0014", 127 / TextUtils.getTrimmedLength(""), (byte) (2 % KeyEvent.normalizeMetaState(1))).intern(), false);
                    } else {
                        jSONObject.put(m5948("\u0012\u0013\f\"\u001f\u0002\u001d\b \u0014", 10 - TextUtils.getTrimmedLength(""), (byte) (82 - KeyEvent.normalizeMetaState(0))).intern(), true);
                    }
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (!(!itKeys.hasNext())) {
            if (!m5937(jSONObject, itKeys.next())) {
                int i11 = f1418 + 39;
                f1421 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5944(JSONObject jSONObject, p pVar, p pVar2, it itVar) {
        f1421 = (f1418 + 41) % 128;
        this.f1422.m7351(jSONObject, m5962(pVar, pVar2), itVar);
        int i10 = f1421 + 67;
        f1418 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 83 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m5945(Activity activity, List<String> list) {
        f1418 = (f1421 + 109) % 128;
        if (list.isEmpty() || list.contains(activity.getClass().getName())) {
            return true;
        }
        int i10 = f1418 + 13;
        f1421 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0011 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<java.lang.String> m5949(java.util.List<java.lang.String> r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
            int r1 = com.ironsource.adqualitysdk.sdk.i.cq.f1418
            int r1 = r1 + 35
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1421 = r1
        L11:
            boolean r1 = r5.hasNext()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L50
            int r1 = com.ironsource.adqualitysdk.sdk.i.cq.f1421
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1418 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L36
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = m5953(r1)
            r3 = 31
            int r3 = r3 / 0
            if (r2 == 0) goto L4c
            goto L42
        L36:
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = m5953(r1)
            if (r2 == 0) goto L4c
        L42:
            java.lang.String r1 = r4.m5956(r1)
            if (r1 == 0) goto L11
            r0.add(r1)
            goto L11
        L4c:
            r0.add(r1)
            goto L11
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5949(java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.l m5939(final com.ironsource.adqualitysdk.sdk.i.l r3, final com.ironsource.adqualitysdk.sdk.i.l r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1418
            int r0 = r0 + 77
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1421 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L13
            r0 = 27
            int r0 = r0 / 0
            if (r3 != 0) goto L22
            goto L15
        L13:
            if (r3 != 0) goto L22
        L15:
            com.ironsource.adqualitysdk.sdk.i.l r3 = new com.ironsource.adqualitysdk.sdk.i.l
            r3.<init>()
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1418
            int r0 = r0 + 7
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1421 = r0
        L22:
            if (r4 != 0) goto L29
            com.ironsource.adqualitysdk.sdk.i.l r4 = new com.ironsource.adqualitysdk.sdk.i.l
            r4.<init>()
        L29:
            com.ironsource.adqualitysdk.sdk.i.cq$13 r0 = new com.ironsource.adqualitysdk.sdk.i.cq$13
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5939(com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.l):com.ironsource.adqualitysdk.sdk.i.l");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m5937(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        try {
            if (objOpt instanceof String) {
                f1421 = (f1418 + 97) % 128;
                String str2 = (String) objOpt;
                if (!m5953(str2)) {
                    return true;
                }
                String strM5956 = m5956(str2);
                if (strM5956 != null) {
                    f1418 = (f1421 + 125) % 128;
                    jSONObject.put(str, strM5956);
                } else {
                    String strM5971 = m5971();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5947("왽䚭잡䒰얱䋥", 33023 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
                    sb2.append(str2);
                    sb2.append(m5947("옞㿩㔣⭡\u20fa⛅ᰇቄ\u0b98Ǜܤ糠犲栺湂枆巜匃䥕仫䐭먳뎴꧈꼕ꕛ骑郓陧边薰שׁ\uf17b\uf693\uecd9\ue205", 63929 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                    co.m5914(strM5971, sb2.toString());
                    return false;
                }
            } else {
                if (!(objOpt instanceof JSONArray)) {
                    return true;
                }
                jSONObject.put(str, new JSONArray((Collection) m5949(jz.m7078((JSONArray) objOpt))));
            }
            return true;
        } catch (JSONException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jm m5938(final List<String> list) {
        jm jmVar = new jm() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.1

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1432 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1433 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f1434 = -6294769124750872179L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m5986(String str, final Activity activity, List<String> list2) {
                int i10 = f1432 + 45;
                f1433 = i10 % 128;
                if (i10 % 2 != 0) {
                    cq.m5967(activity, list2);
                    throw null;
                }
                if (cq.m5967(activity, list2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5985("鹯鸮䋸審\uf305㢃屉䢨場㕚狒鈀ቋ罤되\ue9d3첖䚿\uee3a⾙蚑", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern());
                    sb2.append(str);
                    final String string = sb2.toString();
                    cq.m5940(cq.this, string, true, false, Collections.singletonList(activity));
                    t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            cq.m5940(cq.this, string, false, false, Collections.singletonList(activity));
                        }
                    });
                }
                f1432 = (f1433 + 61) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ｋ */
            public final void mo4668(Activity activity) {
                int i10;
                int i11 = f1432 + 1;
                f1433 = i11 % 128;
                if (i11 % 2 != 0) {
                    AudioTrack.getMinVolume();
                    i10 = 0;
                } else {
                    i10 = 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                }
                m5986(m5985("\uea72\uea1d᩵ￏꮖ鲓퉥욭Ⱕ淁훲\u1c3a晵⟳္", i10).intern(), activity, list);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ﾇ */
            public final void mo4669(Activity activity) {
                f1432 = (f1433 + 11) % 128;
                m5986(m5985("\ud90c\ud963\uf69a쨿䝹ꥣ㺷⩿Ὓ脮\ue302\uf0f6唁쬜◉謟询\uf2d6翭", 1 - (Process.myPid() >> 22)).intern(), activity, list);
                f1432 = (f1433 + 103) % 128;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m5985(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2308) {
                    try {
                        char[] cArrM6531 = com.ironsource.adqualitysdk.sdk.i.h.m6531(f1434, cArr, i10);
                        com.ironsource.adqualitysdk.sdk.i.h.f2309 = 4;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.h.f2309;
                            if (i11 < cArrM6531.length) {
                                com.ironsource.adqualitysdk.sdk.i.h.f2307 = i11 - 4;
                                cArrM6531[com.ironsource.adqualitysdk.sdk.i.h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) com.ironsource.adqualitysdk.sdk.i.h.f2307) * f1434));
                                com.ironsource.adqualitysdk.sdk.i.h.f2309++;
                            } else {
                                str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        };
        int i10 = f1418 + 101;
        f1421 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return jmVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5943(final String str, final List<Object> list) {
        t.m7279(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                cq.m5940(cq.this, str, false, false, list);
            }
        });
        t.m7288(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                cq.m5940(cq.this, str, true, false, list);
            }
        });
        m5942(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4564() {
                cq.m5940(cq.this, str, false, true, list);
            }
        }, true);
        int i10 = f1418 + 29;
        f1421 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5942(final com.ironsource.adqualitysdk.sdk.i.im r3, boolean r4) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cq.f1421
            int r0 = r0 + 89
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1418 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            r0 = 85
            int r0 = r0 / 0
            if (r4 == 0) goto L1e
            goto L15
        L13:
            if (r4 == 0) goto L1e
        L15:
            com.ironsource.adqualitysdk.sdk.i.cq$7 r4 = new com.ironsource.adqualitysdk.sdk.i.cq$7     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            com.ironsource.adqualitysdk.sdk.i.t.m7281(r4)     // Catch: java.lang.Throwable -> L29
            return
        L1e:
            com.ironsource.adqualitysdk.sdk.i.t.m7283(r3)     // Catch: java.lang.Throwable -> L29
            int r3 = com.ironsource.adqualitysdk.sdk.i.cq.f1418
            int r3 = r3 + 123
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.cq.f1421 = r3
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cq.m5942(com.ironsource.adqualitysdk.sdk.i.im, boolean):void");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m5953(String str) {
        f1421 = (f1418 + 95) % 128;
        boolean zEndsWith = str.endsWith(m5947("옐٬䘰蛌욉ڸ", View.getDefaultSize(0, 0) + 49201).intern());
        f1418 = (f1421 + 3) % 128;
        return zEndsWith;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private p m5946(final boolean z10) {
        p pVar = new p() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.14

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1455 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1456 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f1457 = 181509955685428323L;

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5991(JSONObject jSONObject, View view, Activity activity) {
                f1455 = (f1456 + 125) % 128;
                mo5991(jSONObject, view, activity);
                int i10 = f1456 + 29;
                f1455 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5994(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1456 + 19;
                f1455 = i10 % 128;
                int i11 = i10 % 2;
                mo5994(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
                f1456 = (f1455 + 87) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4550(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1456 + 117;
                f1455 = i10 % 128;
                int i11 = i10 % 2;
                mo4550(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
                int i12 = f1456 + 83;
                f1455 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 97 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6000(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1456 + 47;
                f1455 = i10 % 128;
                int i11 = i10 % 2;
                mo6000(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
                int i12 = f1456 + 17;
                f1455 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 79 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4555(JSONObject jSONObject, View view, Activity activity) {
                f1456 = (f1455 + 13) % 128;
                mo4555(jSONObject, view, activity);
                int i10 = f1456 + 69;
                f1455 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 92 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5992(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1456 + 67;
                f1455 = i10 % 128;
                int i11 = i10 % 2;
                mo5992(jSONObject, view, obj, activity);
                if (i11 != 0) {
                    int i12 = 53 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5991(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1455 + 121;
                f1456 = i10 % 128;
                if (i10 % 2 == 0) {
                    m6014(m6015("ꞃ멹Ꟶᙳ‴碗遹锧ᙎ\ue7e2犱⚭쓸땪쌬\uf85c", 0 % TextUtils.getCapsMode("", 0, 1)).intern(), jSONObject, view, null, activity);
                } else {
                    m6014(m6015("ꞃ멹Ꟶᙳ‴碗遹锧ᙎ\ue7e2犱⚭쓸땪쌬\uf85c", 1 - TextUtils.getCapsMode("", 0, 0)).intern(), jSONObject, view, null, activity);
                }
                int i11 = f1456 + 81;
                f1455 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5997(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1456 + 41;
                f1455 = i10 % 128;
                int i11 = i10 % 2;
                mo5997(jSONObject, view, obj, activity);
                if (i11 != 0) {
                    int i12 = 16 / 0;
                }
                int i13 = f1455 + 55;
                f1456 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 83 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6001(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1456 = (f1455 + 95) % 128;
                mo6001(jSONObject, view, obj, activity);
                int i10 = f1455 + 119;
                f1456 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo6001(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1455 = (f1456 + 65) % 128;
                m6014(m6015("黂ꢮ麣ҩ杧㿢ꐀꅅ⼧\uf522㗛ዐﶾ", AndroidCharacter.getMirror('0') - '/').intern(), jSONObject, view, obj, activity);
                f1456 = (f1455 + 123) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo4555(JSONObject jSONObject, View view, Activity activity) {
                f1456 = (f1455 + 95) % 128;
                m6014(m6015("븺\u007f빛걸瑸⳺꧊겊࿅巠⛄\u1f1e\udd5bཡ靀쇎ꫦ섌䇢끦", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), jSONObject, view, null, activity);
                int i10 = f1456 + 9;
                f1455 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo5997(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1456 = (f1455 + 23) % 128;
                m6014(m6015("\uef0e誑\uef79⚗걝\uf4f9ʰߚ廪휌ﻄ둨豳薩佋檘\ufbcf䯸駧ᬸ⥈\uf867\uea61증", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObject, view, obj, activity);
                int i10 = f1456 + 107;
                f1455 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo6000(JSONObject jSONObject, View view, Activity activity) {
                f1456 = (f1455 + 11) % 128;
                m6014(m6015("ᩬ沃ᨏ삕偛࣮㈥㝸ꮏ\u3101˹蓦礑掖덄", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), jSONObject, view, null, activity);
                f1455 = (f1456 + 73) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo4550(JSONObject jSONObject, View view, Activity activity) {
                f1456 = (f1455 + 15) % 128;
                m6014(m6015("诶ø讗곿ᤧ䆥ᑾᄾ㨉嵧䮛ꊪ\ue897\u0fe6﨟", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jSONObject, view, null, activity);
                int i10 = f1455 + 29;
                f1456 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo5994(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1456 + 89;
                f1455 = i10 % 128;
                if (i10 % 2 != 0) {
                    m6014(m6015("컸蝥캙⭢ꖨﴭ\u218dⓈ缛\udaf9\uf71a靜", 0 % (ViewConfiguration.getScrollDefaultDelay() << 9)).intern(), jSONObject, view, null, activity);
                } else {
                    m6014(m6015("컸蝥캙⭢ꖨﴭ\u218dⓈ缛\udaf9\uf71a靜", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern(), jSONObject, view, null, activity);
                }
                f1456 = (f1455 + 61) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m6014(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6015("땗ဖ딁발엫鵈ᕺဤҚ䶝靖ꎦ혼Ἑ⛳絕ꆖ텣\uf00c", 1 - View.MeasureSpec.getMode(0)).intern());
                sb2.append(str);
                cq.m5940(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, view, obj, activity));
                f1456 = (f1455 + 59) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5992(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1455 = (f1456 + 55) % 128;
                m6014(m6015("翽퍳羜罴䳮ᑫ癷猲츘軿Ṓ삧ᲁ\udc4e꿇ṙ欴ሾ祲", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), jSONObject, view, obj, activity);
                int i10 = f1455 + 73;
                f1456 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m6015(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2308) {
                    try {
                        char[] cArrM6531 = com.ironsource.adqualitysdk.sdk.i.h.m6531(f1457, cArr, i10);
                        com.ironsource.adqualitysdk.sdk.i.h.f2309 = 4;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.h.f2309;
                            if (i11 < cArrM6531.length) {
                                com.ironsource.adqualitysdk.sdk.i.h.f2307 = i11 - 4;
                                cArrM6531[com.ironsource.adqualitysdk.sdk.i.h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) com.ironsource.adqualitysdk.sdk.i.h.f2307) * f1457));
                                com.ironsource.adqualitysdk.sdk.i.h.f2309++;
                            } else {
                                str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        };
        f1418 = (f1421 + 123) % 128;
        return pVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private l m5961(final boolean z10) {
        l lVar = new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.11

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f1442 = -3526982931227970902L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1443 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1444 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* synthetic */ void mo5991(JSONObject jSONObject, WebView webView, Activity activity) {
                f1444 = (f1443 + 123) % 128;
                mo5991(jSONObject, webView, activity);
                int i10 = f1444 + 13;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 42 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ void mo5994(JSONObject jSONObject, WebView webView, Activity activity) {
                f1443 = (f1444 + 93) % 128;
                mo5994(jSONObject, webView, activity);
                int i10 = f1444 + 89;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4550(JSONObject jSONObject, WebView webView, Activity activity) {
                f1444 = (f1443 + 101) % 128;
                mo4550(jSONObject, webView, activity);
                int i10 = f1444 + 67;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo6000(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1443 + 79;
                f1444 = i10 % 128;
                int i11 = i10 % 2;
                mo6000(jSONObject, webView, activity);
                if (i11 == 0) {
                    throw null;
                }
                f1443 = (f1444 + 55) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4555(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1443 + 55;
                f1444 = i10 % 128;
                int i11 = i10 % 2;
                mo4555(jSONObject, webView, activity);
                if (i11 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final /* synthetic */ void mo5992(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1443 = (f1444 + 75) % 128;
                mo5992(jSONObject, webView, obj, activity);
                f1443 = (f1444 + 119) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4555(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1444 + 13;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    m5988(m5989("狋方尀㒦⼅މ︌횊쥫ꇠ顨烲歆䏕㩚ⴲ", (ViewConfiguration.getWindowTouchSlop() * 37) + 20166).intern(), jSONObject, webView, null, activity);
                } else {
                    m5988(m5989("狋方尀㒦⼅މ︌횊쥫ꇠ顨烲歆䏕㩚ⴲ", 6007 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), jSONObject, webView, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* synthetic */ void mo5997(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1444 = (f1443 + 43) % 128;
                mo5997(jSONObject, webView, obj, activity);
                int i10 = f1443 + 47;
                f1444 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo6001(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1444 = (f1443 + 35) % 128;
                mo6001(jSONObject, webView, obj, activity);
                f1444 = (f1443 + 87) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4550(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1443 + 73;
                f1444 = i10 % 128;
                if (i10 % 2 == 0) {
                    m5988(m5989("狋솹᐀梦뼅\uf389䘌骊\ue96b㷠灨", 45944 >>> MotionEvent.axisFromString("")).intern(), jSONObject, webView, null, activity);
                } else {
                    m5988(m5989("狋솹᐀梦뼅\uf389䘌骊\ue96b㷠灨", MotionEvent.axisFromString("") + 45944).intern(), jSONObject, webView, null, activity);
                }
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m5988(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5989("狫壚⛸\u0cfa\uda90ꂜ躬呖≳ࡥ환밒訽倩㿅י폿릛蟒", 10770 - MotionEvent.axisFromString("")).intern());
                sb2.append(str);
                cq.m5940(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, webView, obj, activity));
                int i10 = f1444 + 83;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo6000(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1443 + 47;
                f1444 = i10 % 128;
                if (i10 % 2 == 0) {
                    m5988(m5989("狉\ud966▫燵\udc21⡚璹샓⼇筅쟤", 43961 >>> (ViewConfiguration.getScrollBarFadeDuration() >>> 19)).intern(), jSONObject, webView, null, activity);
                } else {
                    m5988(m5989("狉\ud966▫燵\udc21⡚璹샓⼇筅쟤", 43961 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), jSONObject, webView, null, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5991(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1444 + 19;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    m5988(m5989("狜赪趝谦豏貓輨轔辁踳蹕躍", 65448 / ((byte) KeyEvent.getModifierMetaStateMask())).intern(), jSONObject, webView, null, activity);
                } else {
                    m5988(m5989("狜赪趝谦豏貓輨轔辁踳蹕躍", 65448 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), jSONObject, webView, null, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5992(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1444 = (f1443 + 69) % 128;
                m5988(m5989("狋\uda33⌓蠱턷㸸蜯\uec24㔦舉\ueb3a〚餛\ue639伏", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43261).intern(), jSONObject, webView, obj, activity);
                int i10 = f1443 + 69;
                f1444 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo6001(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1444 + 65;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    m5988(m5989("狋엧\u1cbb垽깧\ue104㠷烐쮆", 46889 >>> ExpandableListView.getPackedPositionType(0L)).intern(), jSONObject, webView, obj, activity);
                } else {
                    m5988(m5989("狋엧\u1cbb垽깧\ue104㠷烐쮆", 46889 - ExpandableListView.getPackedPositionType(0L)).intern(), jSONObject, webView, obj, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5997(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1443 = (f1444 + 79) % 128;
                m5988(m5989("狝⸘쭦摬ƞꋫ忏ﬦ鑷ㅦ튠迾⣛쐯愜ɶ뾬墈\uf5da鄫", TextUtils.lastIndexOf("", '0') + 23768).intern(), jSONObject, webView, obj, activity);
                f1443 = (f1444 + 71) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5994(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1444 + 67;
                f1443 = i10 % 128;
                if (i10 % 2 != 0) {
                    m5988(m5989("狋ꤥ씿\ue107ᵩ㥎啍熣", (KeyEvent.getMaxKeyCode() << 120) * 56299).intern(), jSONObject, webView, null, activity);
                } else {
                    m5988(m5989("狋ꤥ씿\ue107ᵩ㥎啍熣", (KeyEvent.getMaxKeyCode() >> 16) + 56299).intern(), jSONObject, webView, null, activity);
                }
                int i11 = f1443 + 45;
                f1444 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m5989(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2043) {
                    try {
                        com.ironsource.adqualitysdk.sdk.i.f.f2041 = i10;
                        char[] cArr2 = new char[cArr.length];
                        com.ironsource.adqualitysdk.sdk.i.f.f2042 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2042;
                            if (i11 < cArr.length) {
                                cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2041 * i11))) ^ f1442);
                                com.ironsource.adqualitysdk.sdk.i.f.f2042++;
                            } else {
                                str2 = new String(cArr2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        };
        f1421 = (f1418 + 47) % 128;
        return lVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private p m5962(final p pVar, final p pVar2) {
        f1421 = (f1418 + 81) % 128;
        if (pVar == null) {
            pVar = new p();
            f1418 = (f1421 + 91) % 128;
        }
        if (pVar2 == null) {
            pVar2 = new p();
            f1418 = (f1421 + 27) % 128;
        }
        return new p() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.18
            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5991(JSONObject jSONObject, View view, Activity activity) {
                mo5991(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5994(JSONObject jSONObject, View view, Activity activity) {
                mo5994(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4550(JSONObject jSONObject, View view, Activity activity) {
                mo4550(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6000(JSONObject jSONObject, View view, Activity activity) {
                mo6000(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4555(JSONObject jSONObject, View view, Activity activity) {
                mo4555(jSONObject, view, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5992(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5992(jSONObject, view, obj, activity);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo5991(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo5991(jSONObject, view, activity);
                t.m7279(new h.AnonymousClass2(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5997(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo5997(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6001(JSONObject jSONObject, View view, Object obj, Activity activity) {
                mo6001(jSONObject, view, obj, activity);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo6001(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo6001(jSONObject, view, obj, activity);
                t.m7279(new d.AnonymousClass2(pVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final void mo4555(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo4555(jSONObject, view, activity);
                t.m7279(new e.AnonymousClass3(pVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final void mo6000(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo6000(jSONObject, view, activity);
                t.m7279(new f.AnonymousClass4(pVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo4550(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo4550(jSONObject, view, activity);
                t.m7279(new a.AnonymousClass1(pVar, jSONObject, view, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo5997(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo5997(jSONObject, view, obj, activity);
                t.m7279(new j.AnonymousClass2(pVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo5994(JSONObject jSONObject, View view, Activity activity) {
                pVar2.mo5994(jSONObject, view, activity);
                t.m7279(new c.AnonymousClass2(pVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo5992(JSONObject jSONObject, View view, Object obj, Activity activity) {
                pVar2.mo5992(jSONObject, view, obj, activity);
                t.m7279(new b.AnonymousClass3(pVar, jSONObject, view, obj, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5980(String str, JSONObject jSONObject) {
        if (str.equals(m5948("\u0002\b%\n\u000b\u0019\u0010\u000f\u0002\u0000\u0007\n", ExpandableListView.getPackedPositionType(0L) + 12, (byte) (ExpandableListView.getPackedPositionType(0L) + 108)).intern())) {
            this.f1423.m5888().m5049(jSONObject);
        } else if (str.equals(m5947("왟黍睏쾘ꐎ粢헇ꩺˢ", TextUtils.lastIndexOf("", '0', 0) + 22680).intern())) {
            this.f1423.m5888().m5055(jSONObject);
        }
        JSONObject jSONObjectM7082 = jz.m7082(m5950(jSONObject));
        if (str.equals(ih.f2526)) {
            this.f1423.m5888().m5057(jSONObjectM7082);
            return;
        }
        if (str.equals(ih.f2527)) {
            this.f1423.m5888().m5050(jSONObjectM7082);
            f1418 = (f1421 + 69) % 128;
            return;
        }
        if (str.equals(ih.f2533)) {
            this.f1423.m5888().m5054(jSONObjectM7082);
            return;
        }
        if (str.equals(ih.f2532)) {
            this.f1423.m5888().m5046(jSONObjectM7082);
            return;
        }
        if (str.equals(ih.f2525)) {
            this.f1423.m5888().m5045(jSONObjectM7082);
            return;
        }
        if (str.equals(ih.f2528)) {
            int i10 = f1418 + 39;
            f1421 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f1423.m5888().m5047(jSONObjectM7082);
                return;
            } else {
                this.f1423.m5888().m5047(jSONObjectM7082);
                int i11 = 52 / 0;
                return;
            }
        }
        if (str.equals(ih.f2524)) {
            this.f1423.m5888().m5044(jSONObjectM7082);
        } else {
            this.f1423.m5888().m5053(str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private v m5932(final boolean z10) {
        v vVar = new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cq.12

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1447 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1448 = -343192624284133648L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1449;

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5991(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1447 + 23;
                f1449 = i10 % 128;
                int i11 = i10 % 2;
                mo5991(jSONObject, webView, view);
                if (i11 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo5994(JSONObject jSONObject, WebView webView, View view) {
                f1449 = (f1447 + 105) % 128;
                mo5994(jSONObject, webView, view);
                int i10 = f1447 + 101;
                f1449 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo4550(JSONObject jSONObject, WebView webView, View view) {
                f1447 = (f1449 + 97) % 128;
                mo4550(jSONObject, webView, view);
                f1447 = (f1449 + 53) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6000(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1449 + 117;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                mo6000(jSONObject, webView, view);
                if (i11 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo4555(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1447 + 115;
                f1449 = i10 % 128;
                int i11 = i10 % 2;
                mo4555(jSONObject, webView, view);
                if (i11 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo5992(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1449 = (f1447 + 81) % 128;
                mo5992(jSONObject, webView, obj, view);
                f1449 = (f1447 + 13) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo4555(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1449 + 117;
                f1447 = i10 % 128;
                if (i10 % 2 == 0) {
                    m6005(m6004("隑㰕쎶椚㲇숅榚㼖슁栜㾞씾梄㸉얌欞", 43650 << (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), jSONObject, webView, null, view);
                } else {
                    m6005(m6004("隑㰕쎶椚㲇숅榚㼖슁栜㾞씾梄㸉얌欞", 43650 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), jSONObject, webView, null, view);
                }
                int i11 = f1447 + 23;
                f1449 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo5997(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1447 = (f1449 + 79) % 128;
                mo5997(jSONObject, webView, obj, view);
                int i10 = f1447 + 85;
                f1449 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 10 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo6001(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1449 + 89;
                f1447 = i10 % 128;
                int i11 = i10 % 2;
                mo6001(jSONObject, webView, obj, view);
                if (i11 == 0) {
                    int i12 = 94 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo4550(JSONObject jSONObject, WebView webView, View view) {
                f1449 = (f1447 + 47) % 128;
                m6005(m6004("隑ᐥ鏖Ẋ鱇\u1bf5蚺ц茁ຬ豾", TextUtils.indexOf((CharSequence) "", '0') + 33458).intern(), jSONObject, webView, null, view);
                int i10 = f1449 + 99;
                f1447 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo6001(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1447 + 35;
                f1449 = i10 % 128;
                if (i10 % 2 != 0) {
                    m6005(m6004("隑⍩﵉띫䅭᭢핵潾㥼", 46588 - (ExpandableListView.getPackedPositionForChild(1, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 1L ? 0 : -1))).intern(), jSONObject, webView, obj, view);
                } else {
                    m6005(m6004("隑⍩﵉띫䅭᭢핵潾㥼", 46588 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), jSONObject, webView, obj, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5992(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1449 + 21;
                f1447 = i10 % 128;
                if (i10 % 2 == 0) {
                    m6005(m6004("隑\uf061孙ꉃ്鑚Ｅ䘦ꄼࠫ錐礼䗡곋㟥", 25776 / (ViewConfiguration.getMinimumFlingVelocity() * 77)).intern(), jSONObject, webView, obj, view);
                } else {
                    m6005(m6004("隑\uf061孙ꉃ്鑚Ｅ䘦ꄼࠫ錐礼䗡곋㟥", 26357 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObject, webView, obj, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5994(JSONObject jSONObject, WebView webView, View view) {
                f1449 = (f1447 + 91) % 128;
                m6005(m6004("隑亻⛭ḑ\uf623깨螏翝", (ViewConfiguration.getFadingEdgeLength() >> 16) + 55343).intern(), jSONObject, webView, null, view);
                f1449 = (f1447 + 79) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo6000(JSONObject jSONObject, WebView webView, View view) {
                f1449 = (f1447 + 11) % 128;
                m6005(m6004("隓\udfe6х䪭댓\uf872⻧霳\udd8d˥䭚", 18787 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), jSONObject, webView, null, view);
                f1447 = (f1449 + 105) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo5991(JSONObject jSONObject, WebView webView, View view) {
                f1449 = (f1447 + 19) % 128;
                m6005(m6004("隆煜够⇈থၝ\uf81a샲ꢻ덵鬧揣", ExpandableListView.getPackedPositionType(0L) + 59333).intern(), jSONObject, webView, null, view);
                int i10 = f1447 + 59;
                f1449 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5997(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1447 = (f1449 + 103) % 128;
                m6005(m6004("隇Ղ넼ⴶ\ud9c4疱\ue195鱼࠭ꐼ僺첤碁\u1775荆㼬꯶䟒\uf380湱", 37847 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), jSONObject, webView, obj, view);
                f1449 = (f1447 + 105) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m6005(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                cq cqVar = cq.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6004("隧暘皜䚗嚛⚂㚷ړᚴ\ue690\uf689욏횙ꚓ뚛蚍雎", 61440 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                sb2.append(str);
                cq.m5940(cqVar, sb2.toString(), z10, false, Arrays.asList(jSONObject, webView, obj, view));
                f1449 = (f1447 + 55) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m6004(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2043) {
                    try {
                        com.ironsource.adqualitysdk.sdk.i.f.f2041 = i10;
                        char[] cArr2 = new char[cArr.length];
                        com.ironsource.adqualitysdk.sdk.i.f.f2042 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2042;
                            if (i11 < cArr.length) {
                                cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2041 * i11))) ^ f1448);
                                com.ironsource.adqualitysdk.sdk.i.f.f2042++;
                            } else {
                                str2 = new String(cArr2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        };
        f1421 = (f1418 + 21) % 128;
        return vVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5935(String str, boolean z10, boolean z11, List<Object> list) {
        f1418 = (f1421 + 71) % 128;
        try {
            dl dlVarM6627 = this.f1429.m6627(str);
            if (dlVarM6627 != null) {
                ds dsVarM6625 = this.f1429.m6625(dlVarM6627.m6297());
                if (dsVarM6625 != null) {
                    f1421 = (f1418 + 93) % 128;
                    if (z10 == dlVarM6627.m6295() && z11 == dlVarM6627.m6296()) {
                        if (s.m7239().m7267()) {
                            co.m5914(m5971(), str);
                        }
                        dsVarM6625.m6385(this.f1427, this, list);
                        return;
                    }
                    return;
                }
                String strM5971 = m5971();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5948("\u0014\f\u0006\u0011\u000b\n\u0017\u0007\u0007\r\u0001\u000b\u0005\u0004\u0003\u000b\u0007\u0016\r\u000b\u0017\u0016", Color.rgb(0, 0, 0) + 16777238, (byte) (104 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern());
                sb2.append(dlVarM6627.m6297());
                sb2.append(m5947("옞枳薗⏣䆒\uef37ഃꭾ쥈皡", 41443 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                co.m5911(strM5971, sb2.toString(), null);
            }
        } catch (Throwable th2) {
            String strM59712 = m5971();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m5947("왻灵\uaa3e\ue4faẨ䤃茀㷐瞘깛\ud868ሤ䳼蚼\u3100欌ꗘ\udf92ᙒ䁱頻", TextUtils.getCapsMode("", 0, 0) + 46649).intern());
            sb3.append(str);
            co.m5911(strM59712, sb3.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m5963(Activity activity, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ih.f2568, m5983().m5900());
            jSONObject.put(ih.f2521, m5983().m5899());
            jSONObject.put(ih.f2523, m5983().m5890());
            jSONObject.put(m5948("\u0002\u0003\n\u001f\u0004\u0016³", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, (byte) (78 - KeyEvent.getDeadChar(0, 0))).intern(), activity.getClass().getName());
            if (bundle != null) {
                f1421 = (f1418 + 19) % 128;
                jSONObject.put(m5948("\u0002\u0003\u0000&\u0004\u0002\u0006\n", (ViewConfiguration.getTapTimeout() >> 16) + 8, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 7)).intern(), true);
            }
            f1418 = (f1421 + 59) % 128;
            return jSONObject;
        } catch (JSONException unused) {
            k.m7098(m5947("왬ဘ櫕䒘齆\ue914쏭ᶏ瑪丌飓\uf2ab쵿✷燱䮡", (ViewConfiguration.getWindowTouchSlop() >> 8) + 54851).intern(), m5947("왻噛\ue662瘔蘐᙭ꛗ㛭䛣횐暬\uf6aa݄靲❜뜆윭埍\ue780矡螁ឲꞪ㐏䑹푣搂\uf436ә铑", ExpandableListView.getPackedPositionGroup(0L) + 36887).intern());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5947(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2043) {
            try {
                com.ironsource.adqualitysdk.sdk.i.f.f2041 = i10;
                char[] cArr2 = new char[cArr.length];
                com.ironsource.adqualitysdk.sdk.i.f.f2042 = 0;
                while (true) {
                    int i11 = com.ironsource.adqualitysdk.sdk.i.f.f2042;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (com.ironsource.adqualitysdk.sdk.i.f.f2041 * i11))) ^ f1417);
                        com.ironsource.adqualitysdk.sdk.i.f.f2042++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5948(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f1419;
                char c10 = f1420;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2158 = 0;
                    while (true) {
                        int i11 = g.f2158;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2157 = cArr[i11];
                        g.f2155 = cArr[g.f2158 + 1];
                        if (g.f2157 == g.f2155) {
                            cArr3[g.f2158] = (char) (g.f2157 - b10);
                            cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                        } else {
                            g.f2156 = g.f2157 / c10;
                            g.f2154 = g.f2157 % c10;
                            g.f2159 = g.f2155 / c10;
                            g.f2152 = g.f2155 % c10;
                            if (g.f2154 == g.f2152) {
                                g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                int i12 = (g.f2156 * c10) + g.f2154;
                                int i13 = (g.f2159 * c10) + g.f2152;
                                int i14 = g.f2158;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2156 == g.f2159) {
                                g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                int i15 = (g.f2156 * c10) + g.f2154;
                                int i16 = (g.f2159 * c10) + g.f2152;
                                int i17 = g.f2158;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2156 * c10) + g.f2152;
                                int i19 = (g.f2159 * c10) + g.f2154;
                                int i20 = g.f2158;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2158 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
